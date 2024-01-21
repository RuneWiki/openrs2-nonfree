import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class25 {

	@OriginalMember(owner = "client!eh", name = "u", descriptor = "Lclient!hb;")
	private Class2 aClass2_57;

	@OriginalMember(owner = "client!eh", name = "v", descriptor = "J")
	private long aLong43;

	@OriginalMember(owner = "client!eh", name = "w", descriptor = "Lclient!hb;")
	private Class2 aClass2_58;

	@OriginalMember(owner = "client!eh", name = "x", descriptor = "I")
	private int anInt1059 = 0;

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "[Lclient!hb;")
	private final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
	private final int anInt1053;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(I)V")
	public Class25(@OriginalArg(0) int arg0) {
		this.aClass2Array1 = new Class2[arg0];
		this.anInt1053 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_214 = local23;
			local23.aClass2_213 = local23;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)Lclient!hb;")
	public Class2 method830() {
		if (this.aClass2_57 == null) {
			return null;
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) (this.aLong43 & (long) (this.anInt1053 - 1))];
		while (local21 != this.aClass2_57) {
			if (this.aLong43 == this.aClass2_57.aLong157) {
				@Pc(32) Class2 local32 = this.aClass2_57;
				this.aClass2_57 = this.aClass2_57.aClass2_214;
				return local32;
			}
			this.aClass2_57 = this.aClass2_57.aClass2_214;
		}
		this.aClass2_57 = null;
		return null;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "([Lclient!hb;I)I")
	public int method833(@OriginalArg(0) Class2[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt1053; local9++) {
			@Pc(16) Class2 local16 = this.aClass2Array1[local9];
			for (@Pc(19) Class2 local19 = local16.aClass2_214; local19 != local16; local19 = local19.aClass2_214) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)Lclient!hb;")
	public Class2 method834() {
		@Pc(19) Class2 local19;
		if (this.anInt1059 > 0 && this.aClass2Array1[this.anInt1059 - 1] != this.aClass2_58) {
			local19 = this.aClass2_58;
			this.aClass2_58 = local19.aClass2_214;
			return local19;
		}
		while (this.anInt1053 > this.anInt1059) {
			local19 = this.aClass2Array1[this.anInt1059++].aClass2_214;
			if (local19 != this.aClass2Array1[this.anInt1059 - 1]) {
				this.aClass2_58 = local19.aClass2_214;
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)I")
	public int method835() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt1053; local9++) {
			@Pc(16) Class2 local16 = this.aClass2Array1[local9];
			@Pc(19) Class2 local19 = local16.aClass2_214;
			while (local19 != local16) {
				local19 = local19.aClass2_214;
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(JB)Lclient!hb;")
	public Class2 method836(@OriginalArg(0) long arg0) {
		this.aLong43 = arg0;
		@Pc(25) Class2 local25 = this.aClass2Array1[(int) ((long) (this.anInt1053 - 1) & arg0)];
		for (this.aClass2_57 = local25.aClass2_214; this.aClass2_57 != local25; this.aClass2_57 = this.aClass2_57.aClass2_214) {
			if (arg0 == this.aClass2_57.aLong157) {
				@Pc(39) Class2 local39 = this.aClass2_57;
				this.aClass2_57 = this.aClass2_57.aClass2_214;
				return local39;
			}
		}
		this.aClass2_57 = null;
		return null;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)Lclient!hb;")
	public Class2 method837() {
		this.anInt1059 = 0;
		return this.method834();
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(JZLclient!hb;)V")
	public void method838(@OriginalArg(0) long arg0, @OriginalArg(2) Class2 arg1) {
		if (arg1.aClass2_213 != null) {
			arg1.method3007();
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) ((long) (this.anInt1053 - 1) & arg0)];
		arg1.aClass2_214 = local21;
		arg1.aClass2_213 = local21.aClass2_213;
		arg1.aClass2_213.aClass2_214 = arg1;
		arg1.aClass2_214.aClass2_213 = arg1;
		arg1.aLong157 = arg0;
	}
}
