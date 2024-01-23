import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public class Class127 implements Interface1 {

	@OriginalMember(owner = "client!oh", name = "k", descriptor = "Lclient!fa;")
	private Class53 aClass53_6 = new Class53(256);

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "Lclient!jd;")
	private Class84 aClass84_91;

	@OriginalMember(owner = "client!oh", name = "n", descriptor = "Lclient!jd;")
	private Class84 aClass84_92;

	@OriginalMember(owner = "client!oh", name = "m", descriptor = "[Lclient!ib;")
	private Class75[] aClass75Array2;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!jd;Lclient!jd;Lclient!jd;)V")
	protected Class127(@OriginalArg(0) Class84 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) Class84 arg2) {
		this.aClass84_91 = arg2;
		this.aClass84_92 = arg1;
		@Pc(24) Class2_Sub26 local24 = new Class2_Sub26(arg0.method2127(0, 0));
		@Pc(28) int local28 = local24.method4242();
		this.aClass75Array2 = new Class75[local28];
		@Pc(34) int local34;
		for (local34 = 0; local34 < local28; local34++) {
			if (local24.method4261() == 1) {
				this.aClass75Array2[local34] = new Class75();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass75Array2[local34] != null) {
				this.aClass75Array2[local34].aBoolean175 = local24.method4261() == 0;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass75Array2[local34] != null) {
				this.aClass75Array2[local34].aBoolean172 = local24.method4261() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass75Array2[local34] != null) {
				this.aClass75Array2[local34].aBoolean173 = local24.method4261() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass75Array2[local34] != null) {
				this.aClass75Array2[local34].aBoolean177 = local24.method4261() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass75Array2[local34] != null) {
				this.aClass75Array2[local34].aByte11 = local24.method4220();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass75Array2[local34] != null) {
				this.aClass75Array2[local34].aByte9 = local24.method4220();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass75Array2[local34] != null) {
				this.aClass75Array2[local34].aByte12 = local24.method4220();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass75Array2[local34] != null) {
				this.aClass75Array2[local34].aByte10 = local24.method4220();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass75Array2[local34] != null) {
				this.aClass75Array2[local34].aShort14 = (short) local24.method4242();
			}
		}
		if (local24.aByteArray72.length > local24.anInt5328) {
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass75Array2[local34] != null) {
					local24.method4220();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass75Array2[local34] != null) {
					local24.method4220();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass75Array2[local34] != null) {
					local24.method4261();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass75Array2[local34] != null) {
					this.aClass75Array2[local34].aBoolean174 = local24.method4261() == 1;
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass75Array2[local34] != null) {
					local24.method4220();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass75Array2[local34] != null) {
					local24.method4261();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass75Array2[local34] != null) {
					local24.method4261();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass75Array2[local34] != null) {
					local24.method4261();
				}
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(IB)Lclient!fb;")
	protected Class2_Sub3_Sub4 method3488(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub3 local10 = this.aClass53_6.method1254((long) arg0);
		if (local10 != null) {
			return (Class2_Sub3_Sub4) local10;
		}
		@Pc(22) byte[] local22 = this.aClass84_92.method2146(arg0);
		if (local22 == null) {
			return null;
		} else {
			@Pc(42) Class2_Sub3_Sub4 local42 = new Class2_Sub3_Sub4(new Class2_Sub26(local22));
			this.aClass53_6.method1258((long) arg0, local42);
			return local42;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)Z")
	@Override
	public final boolean method3486(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub3_Sub4 local8 = this.method3488(arg0);
		return local8 != null && local8.method1289(this.aClass84_91, this);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZFIIZI)[I")
	@Override
	public final int[] method3485(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		return this.method3488(arg3).method1288(arg2, this.aClass84_91, this.aClass75Array2[arg3].aBoolean174, false, this, (double) arg0, arg1);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BI)Lclient!ib;")
	@Override
	public final Class75 method3487(@OriginalArg(1) int arg0) {
		return this.aClass75Array2[arg0];
	}
}
