import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class35 {

	@OriginalMember(owner = "client!id", name = "q", descriptor = "Lclient!te;")
	private Class2 aClass2_89;

	@OriginalMember(owner = "client!id", name = "w", descriptor = "J")
	private long aLong69;

	@OriginalMember(owner = "client!id", name = "x", descriptor = "Lclient!te;")
	private Class2 aClass2_90;

	@OriginalMember(owner = "client!id", name = "y", descriptor = "I")
	private int anInt1962 = 0;

	@OriginalMember(owner = "client!id", name = "t", descriptor = "[Lclient!te;")
	private final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!id", name = "j", descriptor = "I")
	private final int anInt1954;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(I)V")
	public Class35(@OriginalArg(0) int arg0) {
		this.aClass2Array1 = new Class2[arg0];
		this.anInt1954 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_209 = local23;
			local23.aClass2_210 = local23;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IJ)Lclient!te;")
	public Class2 method1354(@OriginalArg(1) long arg0) {
		this.aLong69 = arg0;
		@Pc(18) Class2 local18 = this.aClass2Array1[(int) ((long) (this.anInt1954 - 1) & arg0)];
		for (this.aClass2_89 = local18.aClass2_209; this.aClass2_89 != local18; this.aClass2_89 = this.aClass2_89.aClass2_209) {
			if (arg0 == this.aClass2_89.aLong145) {
				@Pc(32) Class2 local32 = this.aClass2_89;
				this.aClass2_89 = this.aClass2_89.aClass2_209;
				return local32;
			}
		}
		this.aClass2_89 = null;
		return null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)Lclient!te;")
	public Class2 method1355() {
		if (this.aClass2_89 == null) {
			return null;
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) (this.aLong69 & (long) (this.anInt1954 - 1))];
		while (this.aClass2_89 != local21) {
			if (this.aClass2_89.aLong145 == this.aLong69) {
				@Pc(40) Class2 local40 = this.aClass2_89;
				this.aClass2_89 = this.aClass2_89.aClass2_209;
				return local40;
			}
			this.aClass2_89 = this.aClass2_89.aClass2_209;
		}
		this.aClass2_89 = null;
		return null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I[Lclient!te;)I")
	public int method1356(@OriginalArg(1) Class2[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt1954; local9++) {
			@Pc(16) Class2 local16 = this.aClass2Array1[local9];
			for (@Pc(19) Class2 local19 = local16.aClass2_209; local19 != local16; local19 = local19.aClass2_209) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)Lclient!te;")
	public Class2 method1359() {
		this.anInt1962 = 0;
		return this.method1361();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)I")
	public int method1360() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt1954; local9++) {
			@Pc(19) Class2 local19 = this.aClass2Array1[local9];
			@Pc(22) Class2 local22 = local19.aClass2_209;
			while (local22 != local19) {
				local22 = local22.aClass2_209;
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(I)Lclient!te;")
	public Class2 method1361() {
		if (this.anInt1962 > 0 && this.aClass2_90 != this.aClass2Array1[this.anInt1962 - 1]) {
			@Pc(24) Class2 local24 = this.aClass2_90;
			this.aClass2_90 = local24.aClass2_209;
			return local24;
		}
		while (this.anInt1954 > this.anInt1962) {
			@Pc(52) Class2 local52 = this.aClass2Array1[this.anInt1962++].aClass2_209;
			if (local52 != this.aClass2Array1[this.anInt1962 - 1]) {
				this.aClass2_90 = local52.aClass2_209;
				return local52;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BLclient!te;J)V")
	public void method1362(@OriginalArg(1) Class2 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass2_210 != null) {
			arg0.method2888();
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) ((long) (this.anInt1954 - 1) & arg1)];
		arg0.aClass2_209 = local21;
		arg0.aLong145 = arg1;
		arg0.aClass2_210 = local21.aClass2_210;
		arg0.aClass2_210.aClass2_209 = arg0;
		arg0.aClass2_209.aClass2_210 = arg0;
	}
}
