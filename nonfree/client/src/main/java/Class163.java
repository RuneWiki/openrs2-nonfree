import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class163 implements Interface8 {

	@OriginalMember(owner = "client!mr", name = "i", descriptor = "Lclient!mv;")
	private final Class164 aClass164_1 = new Class164(256);

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "Lclient!pc;")
	private final Class188 aClass188_66;

	@OriginalMember(owner = "client!mr", name = "m", descriptor = "Lclient!pc;")
	private final Class188 aClass188_67;

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "[Lclient!oh;")
	private final Class178[] aClass178Array1;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lclient!pc;Lclient!pc;Lclient!pc;)V")
	public Class163(@OriginalArg(0) Class188 arg0, @OriginalArg(1) Class188 arg1, @OriginalArg(2) Class188 arg2) {
		this.aClass188_66 = arg2;
		this.aClass188_67 = arg1;
		@Pc(24) Class2_Sub20 local24 = new Class2_Sub20(arg0.method4283(0, 0));
		@Pc(28) int local28 = local24.method3711();
		this.aClass178Array1 = new Class178[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method3737() == 1) {
				this.aClass178Array1[local34] = new Class178();
			}
		}
		for (@Pc(54) int local54 = 0; local54 < local28; local54++) {
			if (this.aClass178Array1[local54] != null) {
				this.aClass178Array1[local54].aBoolean436 = local24.method3737() == 0;
			}
		}
		for (@Pc(83) int local83 = 0; local83 < local28; local83++) {
			if (this.aClass178Array1[local83] != null) {
				this.aClass178Array1[local83].aBoolean435 = local24.method3737() == 1;
			}
		}
		for (@Pc(113) int local113 = 0; local113 < local28; local113++) {
			if (this.aClass178Array1[local113] != null) {
				this.aClass178Array1[local113].aBoolean432 = local24.method3737() == 1;
			}
		}
		for (@Pc(145) int local145 = 0; local145 < local28; local145++) {
			if (this.aClass178Array1[local145] != null) {
				this.aClass178Array1[local145].aBoolean439 = local24.method3737() == 1;
			}
		}
		for (@Pc(177) int local177 = 0; local177 < local28; local177++) {
			if (this.aClass178Array1[local177] != null) {
				this.aClass178Array1[local177].aByte54 = local24.method3693();
			}
		}
		for (@Pc(198) int local198 = 0; local198 < local28; local198++) {
			if (this.aClass178Array1[local198] != null) {
				this.aClass178Array1[local198].aByte57 = local24.method3693();
			}
		}
		for (@Pc(223) int local223 = 0; local223 < local28; local223++) {
			if (this.aClass178Array1[local223] != null) {
				this.aClass178Array1[local223].aByte59 = local24.method3693();
			}
		}
		for (@Pc(248) int local248 = 0; local248 < local28; local248++) {
			if (this.aClass178Array1[local248] != null) {
				this.aClass178Array1[local248].aByte53 = local24.method3693();
			}
		}
		for (@Pc(269) int local269 = 0; local269 < local28; local269++) {
			if (this.aClass178Array1[local269] != null) {
				this.aClass178Array1[local269].aShort60 = (short) local24.method3711();
			}
		}
		for (@Pc(291) int local291 = 0; local291 < local28; local291++) {
			if (this.aClass178Array1[local291] != null) {
				this.aClass178Array1[local291].aByte56 = local24.method3693();
			}
		}
		for (@Pc(316) int local316 = 0; local316 < local28; local316++) {
			if (this.aClass178Array1[local316] != null) {
				this.aClass178Array1[local316].aByte55 = local24.method3693();
			}
		}
		for (@Pc(341) int local341 = 0; local341 < local28; local341++) {
			if (this.aClass178Array1[local341] != null) {
				this.aClass178Array1[local341].aBoolean440 = local24.method3737() == 1;
			}
		}
		for (@Pc(369) int local369 = 0; local369 < local28; local369++) {
			if (this.aClass178Array1[local369] != null) {
				this.aClass178Array1[local369].aBoolean438 = local24.method3737() == 1;
			}
		}
		for (@Pc(399) int local399 = 0; local399 < local28; local399++) {
			if (this.aClass178Array1[local399] != null) {
				this.aClass178Array1[local399].aByte58 = local24.method3693();
			}
		}
		for (@Pc(424) int local424 = 0; local424 < local28; local424++) {
			if (this.aClass178Array1[local424] != null) {
				this.aClass178Array1[local424].aBoolean434 = local24.method3737() == 1;
			}
		}
		for (@Pc(456) int local456 = 0; local456 < local28; local456++) {
			if (this.aClass178Array1[local456] != null) {
				this.aClass178Array1[local456].aBoolean437 = local24.method3737() == 1;
			}
		}
		for (@Pc(488) int local488 = 0; local488 < local28; local488++) {
			if (this.aClass178Array1[local488] != null) {
				this.aClass178Array1[local488].aBoolean433 = local24.method3737() == 1;
			}
		}
		for (@Pc(516) int local516 = 0; local516 < local28; local516++) {
			if (this.aClass178Array1[local516] != null) {
				this.aClass178Array1[local516].anInt5078 = local24.method3737();
			}
		}
		for (@Pc(541) int local541 = 0; local541 < local28; local541++) {
			if (this.aClass178Array1[local541] != null) {
				this.aClass178Array1[local541].anInt5077 = local24.method3731();
			}
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZZIIFI)[F")
	@Override
	public float[] method3833(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3) {
		return this.method3838(arg3).method1386(this.aClass178Array1[arg3].aBoolean438, arg0, this.aClass188_66, arg1, this);
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(II)Lclient!oh;")
	@Override
	public Class178 method3836(@OriginalArg(1) int arg0) {
		return this.aClass178Array1[arg0];
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(FIIZII)[I")
	@Override
	public int[] method3832(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method3838(arg1).method1384(this.aClass188_66, arg3, arg2, this, arg4, this.aClass178Array1[arg1].aBoolean438, (double) arg0);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(BI)Lclient!dn;")
	private Class2_Sub2_Sub6 method3838(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2 local10 = this.aClass164_1.method3874((long) arg0);
		if (local10 != null) {
			return (Class2_Sub2_Sub6) local10;
		}
		@Pc(21) byte[] local21 = this.aClass188_67.method4282(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(38) Class2_Sub2_Sub6 local38 = new Class2_Sub2_Sub6(new Class2_Sub20(local21));
			this.aClass164_1.method3877(local38, (long) arg0);
			return local38;
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method3835(@OriginalArg(1) int arg0) {
		@Pc(20) Class2_Sub2_Sub6 local20 = this.method3838(arg0);
		return local20 != null && local20.method1380(this.aClass188_66, this);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(FZIIII)[I")
	@Override
	public int[] method3834(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		return this.method3838(arg3).method1385((double) arg0, this.aClass188_66, arg2, this.aClass178Array1[arg3].aBoolean438, this, arg1);
	}
}
