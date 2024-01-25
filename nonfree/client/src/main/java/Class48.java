import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class48 implements Interface5 {

	@OriginalMember(owner = "client!cc", name = "q", descriptor = "Lclient!lh;")
	private final Class209 aClass209_1 = new Class209(256);

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "Lclient!pl;")
	private final Class259 aClass259_28;

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "Lclient!pl;")
	private final Class259 aClass259_27;

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
	private final int anInt1277;

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "[Lclient!vca;")
	private final Class343[] aClass343Array1;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!pl;Lclient!pl;Lclient!pl;)V")
	public Class48(@OriginalArg(0) Class259 arg0, @OriginalArg(1) Class259 arg1, @OriginalArg(2) Class259 arg2) {
		this.aClass259_28 = arg1;
		this.aClass259_27 = arg2;
		@Pc(24) Class2_Sub15 local24 = new Class2_Sub15(arg0.method5985(0, 0));
		this.anInt1277 = local24.method4294();
		this.aClass343Array1 = new Class343[this.anInt1277];
		for (@Pc(36) int local36 = 0; local36 < this.anInt1277; local36++) {
			if (local24.method4325() == 1) {
				this.aClass343Array1[local36] = new Class343();
			}
		}
		for (@Pc(57) int local57 = 0; local57 < this.anInt1277; local57++) {
			if (this.aClass343Array1[local57] != null) {
				this.aClass343Array1[local57].aBoolean704 = local24.method4325() == 0;
			}
		}
		for (@Pc(90) int local90 = 0; local90 < this.anInt1277; local90++) {
			if (this.aClass343Array1[local90] != null) {
				this.aClass343Array1[local90].aBoolean696 = local24.method4325() == 1;
			}
		}
		for (@Pc(121) int local121 = 0; local121 < this.anInt1277; local121++) {
			if (this.aClass343Array1[local121] != null) {
				this.aClass343Array1[local121].aBoolean700 = local24.method4325() == 1;
			}
		}
		for (@Pc(152) int local152 = 0; local152 < this.anInt1277; local152++) {
			if (this.aClass343Array1[local152] != null) {
				this.aClass343Array1[local152].aBoolean705 = local24.method4325() == 1;
			}
		}
		for (@Pc(183) int local183 = 0; local183 < this.anInt1277; local183++) {
			if (this.aClass343Array1[local183] != null) {
				this.aClass343Array1[local183].aByte115 = local24.method4304();
			}
		}
		for (@Pc(209) int local209 = 0; local209 < this.anInt1277; local209++) {
			if (this.aClass343Array1[local209] != null) {
				this.aClass343Array1[local209].aByte119 = local24.method4304();
			}
		}
		for (@Pc(235) int local235 = 0; local235 < this.anInt1277; local235++) {
			if (this.aClass343Array1[local235] != null) {
				this.aClass343Array1[local235].aByte117 = local24.method4304();
			}
		}
		for (@Pc(257) int local257 = 0; local257 < this.anInt1277; local257++) {
			if (this.aClass343Array1[local257] != null) {
				this.aClass343Array1[local257].aByte120 = local24.method4304();
			}
		}
		for (@Pc(283) int local283 = 0; local283 < this.anInt1277; local283++) {
			if (this.aClass343Array1[local283] != null) {
				this.aClass343Array1[local283].aShort109 = (short) local24.method4294();
			}
		}
		for (@Pc(310) int local310 = 0; local310 < this.anInt1277; local310++) {
			if (this.aClass343Array1[local310] != null) {
				this.aClass343Array1[local310].aByte118 = local24.method4304();
			}
		}
		for (@Pc(336) int local336 = 0; local336 < this.anInt1277; local336++) {
			if (this.aClass343Array1[local336] != null) {
				this.aClass343Array1[local336].aByte114 = local24.method4304();
			}
		}
		for (@Pc(362) int local362 = 0; local362 < this.anInt1277; local362++) {
			if (this.aClass343Array1[local362] != null) {
				this.aClass343Array1[local362].aBoolean697 = local24.method4325() == 1;
			}
		}
		for (@Pc(391) int local391 = 0; local391 < this.anInt1277; local391++) {
			if (this.aClass343Array1[local391] != null) {
				this.aClass343Array1[local391].aBoolean698 = local24.method4325() == 1;
			}
		}
		for (@Pc(424) int local424 = 0; local424 < this.anInt1277; local424++) {
			if (this.aClass343Array1[local424] != null) {
				this.aClass343Array1[local424].aByte116 = local24.method4304();
			}
		}
		for (@Pc(446) int local446 = 0; local446 < this.anInt1277; local446++) {
			if (this.aClass343Array1[local446] != null) {
				this.aClass343Array1[local446].aBoolean699 = local24.method4325() == 1;
			}
		}
		for (@Pc(473) int local473 = 0; local473 < this.anInt1277; local473++) {
			if (this.aClass343Array1[local473] != null) {
				this.aClass343Array1[local473].aBoolean701 = local24.method4325() == 1;
			}
		}
		for (@Pc(502) int local502 = 0; local502 < this.anInt1277; local502++) {
			if (this.aClass343Array1[local502] != null) {
				this.aClass343Array1[local502].aBoolean703 = local24.method4325() == 1;
			}
		}
		for (@Pc(529) int local529 = 0; local529 < this.anInt1277; local529++) {
			if (this.aClass343Array1[local529] != null) {
				this.aClass343Array1[local529].anInt9124 = local24.method4325();
			}
		}
		for (@Pc(551) int local551 = 0; local551 < this.anInt1277; local551++) {
			if (this.aClass343Array1[local551] != null) {
				this.aClass343Array1[local551].anInt9129 = local24.method4307();
			}
		}
		for (@Pc(573) int local573 = 0; local573 < this.anInt1277; local573++) {
			if (this.aClass343Array1[local573] != null) {
				this.aClass343Array1[local573].aBoolean702 = local24.method4325() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method914(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub3_Sub7 local8 = this.method918(arg0);
		return local8 != null && local8.method3311(this.aClass259_27, this);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IFZIII)[I")
	@Override
	public int[] method916(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		return this.method918(arg0).method3313(this.aClass259_27, (double) arg1, arg4, arg2, this.aClass343Array1[arg0].aBoolean698, arg3, this);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lclient!hp;")
	private Class2_Sub3_Sub7 method918(@OriginalArg(1) int arg0) {
		@Pc(22) Class2_Sub3 local22 = this.aClass209_1.method4599((long) arg0);
		if (local22 != null) {
			return (Class2_Sub3_Sub7) local22;
		}
		@Pc(33) byte[] local33 = this.aClass259_28.method5964(arg0);
		if (local33 == null) {
			return null;
		} else {
			@Pc(45) Class2_Sub3_Sub7 local45 = new Class2_Sub3_Sub7(new Class2_Sub15(local33));
			this.aClass209_1.method4596(local45, (long) arg0);
			return local45;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIZFII)[F")
	@Override
	public float[] method913(@OriginalArg(1) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method918(arg3).method3312(this.aClass343Array1[arg3].aBoolean698, arg0, this, this.aClass259_27, arg2);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)I")
	@Override
	public int method912() {
		return this.anInt1277;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)Lclient!vca;")
	@Override
	public Class343 method917(@OriginalArg(0) int arg0) {
		return this.aClass343Array1[arg0];
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(FIBZII)[I")
	@Override
	public int[] method915(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method918(arg3).method3310(this, arg1, this.aClass343Array1[arg3].aBoolean698, this.aClass259_27, arg2, (double) arg0);
	}
}
