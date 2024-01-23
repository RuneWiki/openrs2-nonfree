import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public class Class85 implements Interface4 {

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "Lclient!fm;")
	private Class49 aClass49_5 = new Class49(256);

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "Lclient!km;")
	private Class91 aClass91_105;

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Lclient!km;")
	private Class91 aClass91_106;

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "[Lclient!qi;")
	private Class139[] aClass139Array2;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!km;Lclient!km;Lclient!km;)V")
	protected Class85(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) Class91 arg2) {
		this.aClass91_105 = arg1;
		this.aClass91_106 = arg2;
		@Pc(24) Class1_Sub11 local24 = new Class1_Sub11(arg0.method2495(0, 0));
		@Pc(28) int local28 = local24.method2691();
		this.aClass139Array2 = new Class139[local28];
		@Pc(34) int local34;
		for (local34 = 0; local34 < local28; local34++) {
			if (local24.method2690() == 1) {
				this.aClass139Array2[local34] = new Class139();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass139Array2[local34] != null) {
				this.aClass139Array2[local34].aBoolean332 = local24.method2690() == 0;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass139Array2[local34] != null) {
				this.aClass139Array2[local34].aBoolean330 = local24.method2690() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass139Array2[local34] != null) {
				this.aClass139Array2[local34].aBoolean333 = local24.method2690() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass139Array2[local34] != null) {
				this.aClass139Array2[local34].aBoolean334 = local24.method2690() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass139Array2[local34] != null) {
				this.aClass139Array2[local34].aByte19 = local24.method2663();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass139Array2[local34] != null) {
				this.aClass139Array2[local34].aByte18 = local24.method2663();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass139Array2[local34] != null) {
				this.aClass139Array2[local34].aByte16 = local24.method2663();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass139Array2[local34] != null) {
				this.aClass139Array2[local34].aByte17 = local24.method2663();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass139Array2[local34] != null) {
				this.aClass139Array2[local34].aShort28 = (short) local24.method2691();
			}
		}
		if (local24.anInt3264 < local24.aByteArray47.length) {
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass139Array2[local34] != null) {
					local24.method2663();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass139Array2[local34] != null) {
					local24.method2663();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass139Array2[local34] != null) {
					local24.method2690();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass139Array2[local34] != null) {
					this.aClass139Array2[local34].aBoolean331 = local24.method2690() == 1;
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass139Array2[local34] != null) {
					local24.method2663();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass139Array2[local34] != null) {
					local24.method2690();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass139Array2[local34] != null) {
					local24.method2690();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass139Array2[local34] != null) {
					local24.method2690();
				}
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "(II)Lclient!qi;")
	@Override
	public final Class139 method2255(@OriginalArg(0) int arg0) {
		return this.aClass139Array2[arg0];
	}

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "(II)Lclient!wb;")
	protected Class1_Sub2_Sub22 method2258(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2 local10 = this.aClass49_5.method1381((long) arg0);
		if (local10 != null) {
			return (Class1_Sub2_Sub22) local10;
		}
		@Pc(29) byte[] local29 = this.aClass91_105.method2488(arg0);
		if (local29 == null) {
			return null;
		} else {
			@Pc(42) Class1_Sub2_Sub22 local42 = new Class1_Sub2_Sub22(new Class1_Sub11(local29));
			this.aClass49_5.method1385(local42, (long) arg0);
			return local42;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)Z")
	@Override
	public final boolean method2256(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub2_Sub22 local8 = this.method2258(arg0);
		return local8 != null && local8.method4355(this.aClass91_106, this);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IFBIZI)[I")
	@Override
	public final int[] method2257(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		return this.method2258(arg2).method4356(this.aClass91_106, arg3, false, (double) arg1, this, arg0, this.aClass139Array2[arg2].aBoolean331);
	}
}
