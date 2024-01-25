import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class102 implements Interface7 {

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "Lclient!pj;")
	private final Class156 aClass156_9 = new Class156(256);

	@OriginalMember(owner = "client!jh", name = "r", descriptor = "Lclient!qj;")
	private final Class165 aClass165_54;

	@OriginalMember(owner = "client!jh", name = "n", descriptor = "Lclient!qj;")
	private final Class165 aClass165_53;

	@OriginalMember(owner = "client!jh", name = "g", descriptor = "[Lclient!w;")
	private final Class215[] aClass215Array1;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!qj;Lclient!qj;Lclient!qj;)V")
	public Class102(@OriginalArg(0) Class165 arg0, @OriginalArg(1) Class165 arg1, @OriginalArg(2) Class165 arg2) {
		this.aClass165_54 = arg1;
		this.aClass165_53 = arg2;
		@Pc(24) Class1_Sub7 local24 = new Class1_Sub7(arg0.method4508(0, 0));
		@Pc(28) int local28 = local24.method3115();
		this.aClass215Array1 = new Class215[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method3141() == 1) {
				this.aClass215Array1[local34] = new Class215();
			}
		}
		for (@Pc(54) int local54 = 0; local54 < local28; local54++) {
			if (this.aClass215Array1[local54] != null) {
				this.aClass215Array1[local54].aBoolean570 = local24.method3141() == 0;
			}
		}
		for (@Pc(86) int local86 = 0; local86 < local28; local86++) {
			if (this.aClass215Array1[local86] != null) {
				this.aClass215Array1[local86].aBoolean565 = local24.method3141() == 1;
			}
		}
		for (@Pc(112) int local112 = 0; local112 < local28; local112++) {
			if (this.aClass215Array1[local112] != null) {
				this.aClass215Array1[local112].aBoolean566 = local24.method3141() == 1;
			}
		}
		for (@Pc(144) int local144 = 0; local144 < local28; local144++) {
			if (this.aClass215Array1[local144] != null) {
				this.aClass215Array1[local144].aBoolean571 = local24.method3141() == 1;
			}
		}
		for (@Pc(172) int local172 = 0; local172 < local28; local172++) {
			if (this.aClass215Array1[local172] != null) {
				this.aClass215Array1[local172].aByte71 = local24.method3130();
			}
		}
		for (@Pc(197) int local197 = 0; local197 < local28; local197++) {
			if (this.aClass215Array1[local197] != null) {
				this.aClass215Array1[local197].aByte70 = local24.method3130();
			}
		}
		for (@Pc(218) int local218 = 0; local218 < local28; local218++) {
			if (this.aClass215Array1[local218] != null) {
				this.aClass215Array1[local218].aByte67 = local24.method3130();
			}
		}
		for (@Pc(243) int local243 = 0; local243 < local28; local243++) {
			if (this.aClass215Array1[local243] != null) {
				this.aClass215Array1[local243].aByte73 = local24.method3130();
			}
		}
		for (@Pc(268) int local268 = 0; local268 < local28; local268++) {
			if (this.aClass215Array1[local268] != null) {
				this.aClass215Array1[local268].aShort90 = (short) local24.method3115();
			}
		}
		for (@Pc(294) int local294 = 0; local294 < local28; local294++) {
			if (this.aClass215Array1[local294] != null) {
				this.aClass215Array1[local294].aByte72 = local24.method3130();
			}
		}
		for (@Pc(315) int local315 = 0; local315 < local28; local315++) {
			if (this.aClass215Array1[local315] != null) {
				this.aClass215Array1[local315].aByte69 = local24.method3130();
			}
		}
		for (@Pc(336) int local336 = 0; local336 < local28; local336++) {
			if (this.aClass215Array1[local336] != null) {
				this.aClass215Array1[local336].aBoolean569 = local24.method3141() == 1;
			}
		}
		for (@Pc(362) int local362 = 0; local362 < local28; local362++) {
			if (this.aClass215Array1[local362] != null) {
				this.aClass215Array1[local362].aBoolean574 = local24.method3141() == 1;
			}
		}
		for (@Pc(394) int local394 = 0; local394 < local28; local394++) {
			if (this.aClass215Array1[local394] != null) {
				this.aClass215Array1[local394].aByte68 = local24.method3130();
			}
		}
		for (@Pc(415) int local415 = 0; local415 < local28; local415++) {
			if (this.aClass215Array1[local415] != null) {
				this.aClass215Array1[local415].aBoolean573 = local24.method3141() == 1;
			}
		}
		for (@Pc(447) int local447 = 0; local447 < local28; local447++) {
			if (this.aClass215Array1[local447] != null) {
				this.aClass215Array1[local447].aBoolean567 = local24.method3141() == 1;
			}
		}
		for (@Pc(477) int local477 = 0; local477 < local28; local477++) {
			if (this.aClass215Array1[local477] != null) {
				this.aClass215Array1[local477].aBoolean572 = local24.method3141() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)Lclient!w;")
	@Override
	public Class215 method2788(@OriginalArg(1) int arg0) {
		return this.aClass215Array1[arg0];
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IFIZII)[I")
	@Override
	public int[] method2790(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		return this.method2795(arg0).method2025(arg2, (double) arg1, this.aClass165_53, arg3, this.aClass215Array1[arg0].aBoolean574, this);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method2789(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub1_Sub11 local12 = this.method2795(arg0);
		return local12 != null && local12.method2023(this, this.aClass165_53);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)Lclient!gm;")
	private Class1_Sub1_Sub11 method2795(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1 local10 = this.aClass156_9.method4258((long) arg0);
		if (local10 != null) {
			return (Class1_Sub1_Sub11) local10;
		}
		@Pc(21) byte[] local21 = this.aClass165_54.method4492(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(33) Class1_Sub1_Sub11 local33 = new Class1_Sub1_Sub11(new Class1_Sub7(local21));
			this.aClass156_9.method4256(local33, (long) arg0);
			return local33;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(FIIBZI)[I")
	@Override
	public int[] method2786(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		return this.method2795(arg1).method2026(this, this.aClass165_53, (double) arg0, arg3, arg4, arg2, this.aClass215Array1[arg1].aBoolean574);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIFZII)[F")
	@Override
	public float[] method2787(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method2795(arg2).method2020(this.aClass215Array1[arg2].aBoolean574, arg3, this.aClass165_53, this, arg0);
	}
}
