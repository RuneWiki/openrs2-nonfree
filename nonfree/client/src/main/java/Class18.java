import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class18 {

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "Lclient!se;")
	private Class2 aClass2_53;

	@OriginalMember(owner = "client!dh", name = "v", descriptor = "Lclient!se;")
	private Class2 aClass2_54;

	@OriginalMember(owner = "client!dh", name = "w", descriptor = "I")
	private int anInt871 = 0;

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
	private final int anInt862;

	@OriginalMember(owner = "client!dh", name = "s", descriptor = "[Lclient!se;")
	private final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(I)V")
	public Class18(@OriginalArg(0) int arg0) {
		this.anInt862 = arg0;
		this.aClass2Array1 = new Class2[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_207 = local23;
			local23.aClass2_208 = local23;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)I")
	public int method676() {
		@Pc(3) int local3 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt862; local17++) {
			@Pc(24) Class2 local24 = this.aClass2Array1[local17];
			@Pc(27) Class2 local27 = local24.aClass2_207;
			while (local24 != local27) {
				local27 = local27.aClass2_207;
				local3++;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)Lclient!se;")
	public Class2 method677() {
		if (this.aClass2_53 == null) {
			return null;
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) (this.aLong29 & (long) (this.anInt862 - 1))];
		while (this.aClass2_53 != local21) {
			if (this.aLong29 == this.aClass2_53.aLong139) {
				@Pc(36) Class2 local36 = this.aClass2_53;
				this.aClass2_53 = this.aClass2_53.aClass2_207;
				return local36;
			}
			this.aClass2_53 = this.aClass2_53.aClass2_207;
		}
		this.aClass2_53 = null;
		return null;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "([Lclient!se;Z)I")
	public int method679(@OriginalArg(0) Class2[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt862; local17++) {
			@Pc(24) Class2 local24 = this.aClass2Array1[local17];
			for (@Pc(27) Class2 local27 = local24.aClass2_207; local27 != local24; local27 = local27.aClass2_207) {
				arg0[local7++] = local27;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)Lclient!se;")
	public Class2 method682() {
		@Pc(27) Class2 local27;
		if (this.anInt871 > 0 && this.aClass2Array1[this.anInt871 - 1] != this.aClass2_54) {
			local27 = this.aClass2_54;
			this.aClass2_54 = local27.aClass2_207;
			return local27;
		}
		while (this.anInt862 > this.anInt871) {
			local27 = this.aClass2Array1[this.anInt871++].aClass2_207;
			if (local27 != this.aClass2Array1[this.anInt871 - 1]) {
				this.aClass2_54 = local27.aClass2_207;
				return local27;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(JB)Lclient!se;")
	public Class2 method683(@OriginalArg(0) long arg0) {
		this.aLong29 = arg0;
		@Pc(23) Class2 local23 = this.aClass2Array1[(int) ((long) (this.anInt862 - 1) & arg0)];
		for (this.aClass2_53 = local23.aClass2_207; this.aClass2_53 != local23; this.aClass2_53 = this.aClass2_53.aClass2_207) {
			if (this.aClass2_53.aLong139 == arg0) {
				@Pc(41) Class2 local41 = this.aClass2_53;
				this.aClass2_53 = this.aClass2_53.aClass2_207;
				return local41;
			}
		}
		this.aClass2_53 = null;
		return null;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(JILclient!se;)V")
	public void method685(@OriginalArg(0) long arg0, @OriginalArg(2) Class2 arg1) {
		if (arg1.aClass2_208 != null) {
			arg1.method2705();
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt862 - 1))];
		arg1.aClass2_208 = local21.aClass2_208;
		arg1.aClass2_207 = local21;
		arg1.aLong139 = arg0;
		arg1.aClass2_208.aClass2_207 = arg1;
		arg1.aClass2_207.aClass2_208 = arg1;
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)Lclient!se;")
	public Class2 method687() {
		this.anInt871 = 0;
		return this.method682();
	}
}
