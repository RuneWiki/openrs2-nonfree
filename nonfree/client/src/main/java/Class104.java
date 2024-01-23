import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public class Class104 implements Interface1 {

	@OriginalMember(owner = "client!le", name = "c", descriptor = "Lclient!lj;")
	private Class106 aClass106_10 = new Class106(256);

	@OriginalMember(owner = "client!le", name = "o", descriptor = "Lclient!ek;")
	private Class42 aClass42_85;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "Lclient!ek;")
	private Class42 aClass42_84;

	@OriginalMember(owner = "client!le", name = "k", descriptor = "[Lclient!jn;")
	private Class91[] aClass91Array2;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!ek;Lclient!ek;Lclient!ek;)V")
	protected Class104(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) Class42 arg2) {
		this.aClass42_85 = arg1;
		this.aClass42_84 = arg2;
		@Pc(24) Class2_Sub16 local24 = new Class2_Sub16(arg0.method1256(0, 0));
		@Pc(28) int local28 = local24.method2130();
		this.aClass91Array2 = new Class91[local28];
		@Pc(34) int local34;
		for (local34 = 0; local34 < local28; local34++) {
			if (local24.method2146() == 1) {
				this.aClass91Array2[local34] = new Class91();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass91Array2[local34] != null) {
				this.aClass91Array2[local34].aBoolean222 = local24.method2146() == 0;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass91Array2[local34] != null) {
				this.aClass91Array2[local34].aBoolean219 = local24.method2146() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass91Array2[local34] != null) {
				this.aClass91Array2[local34].aBoolean221 = local24.method2146() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass91Array2[local34] != null) {
				this.aClass91Array2[local34].aBoolean220 = local24.method2146() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass91Array2[local34] != null) {
				this.aClass91Array2[local34].aByte16 = local24.method2170();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass91Array2[local34] != null) {
				this.aClass91Array2[local34].aByte15 = local24.method2170();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass91Array2[local34] != null) {
				this.aClass91Array2[local34].aByte13 = local24.method2170();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass91Array2[local34] != null) {
				this.aClass91Array2[local34].aByte14 = local24.method2170();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass91Array2[local34] != null) {
				this.aClass91Array2[local34].aShort48 = (short) local24.method2130();
			}
		}
		if (local24.aByteArray17.length > local24.anInt2789) {
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass91Array2[local34] != null) {
					local24.method2170();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass91Array2[local34] != null) {
					local24.method2170();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass91Array2[local34] != null) {
					local24.method2146();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass91Array2[local34] != null) {
					this.aClass91Array2[local34].aBoolean223 = local24.method2146() == 1;
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass91Array2[local34] != null) {
					local24.method2170();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass91Array2[local34] != null) {
					local24.method2146();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass91Array2[local34] != null) {
					local24.method2146();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass91Array2[local34] != null) {
					local24.method2146();
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(II)Z")
	@Override
	public final boolean method4106(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub8_Sub18 local12 = this.method4110(arg0);
		return local12 != null && local12.method3637(this.aClass42_84, this);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II)Lclient!jn;")
	@Override
	public final Class91 method4105(@OriginalArg(1) int arg0) {
		return this.aClass91Array2[arg0];
	}

	@OriginalMember(owner = "client!le", name = "h", descriptor = "(II)Lclient!pl;")
	protected Class2_Sub8_Sub18 method4110(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub8 local6 = this.aClass106_10.method2986((long) arg0);
		if (local6 != null) {
			return (Class2_Sub8_Sub18) local6;
		}
		@Pc(21) byte[] local21 = this.aClass42_85.method1259(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(40) Class2_Sub8_Sub18 local40 = new Class2_Sub8_Sub18(new Class2_Sub16(local21));
			this.aClass106_10.method2990((long) arg0, local40);
			return local40;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(FZIIII)[I")
	@Override
	public final int[] method4107(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method4110(arg3).method3632(false, (double) arg0, this, this.aClass91Array2[arg3].aBoolean223, this.aClass42_84, arg2, arg1);
	}
}
