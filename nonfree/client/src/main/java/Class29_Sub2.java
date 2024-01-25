import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class29_Sub2 extends Class29 {

	@OriginalMember(owner = "client!bj", name = "z", descriptor = "Z")
	private boolean aBoolean86 = false;

	@OriginalMember(owner = "client!bj", name = "s", descriptor = "Z")
	private boolean aBoolean85;

	@OriginalMember(owner = "client!bj", name = "A", descriptor = "[Lclient!au;")
	private Interface3[] anInterface3Array1;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lclient!ch;)V")
	public Class29_Sub2(@OriginalArg(0) Class5_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean469) {
			this.aBoolean85 = arg0.anInt6538 < 3;
			@Pc(26) int local26 = this.aBoolean85 ? 48 : 127;
			@Pc(30) int[][] local30 = new int[6][4096];
			@Pc(34) int[][] local34 = new int[6][4096];
			@Pc(38) int[][] local38 = new int[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
					@Pc(57) float local57 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local57 * local57 + local66 * local66 + 1.0F)));
					@Pc(85) float local85 = local57 * local81;
					@Pc(89) float local89 = local66 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(98) float local98;
						if (local91 == 0) {
							local98 = -local85;
						} else if (local91 == 1) {
							local98 = local85;
						} else if (local91 == 2) {
							local98 = local89;
						} else if (local91 == 3) {
							local98 = -local89;
						} else if (local91 == 4) {
							local98 = local81;
						} else {
							local98 = -local81;
						}
						@Pc(146) int local146;
						@Pc(145) int local145;
						@Pc(143) int local143;
						if (local98 > 0.0F) {
							local146 = (int) (Math.pow((double) local98, 96.0D) * (double) local26);
							local145 = (int) ((double) local26 * Math.pow((double) local98, 36.0D));
							local143 = (int) ((double) local26 * Math.pow((double) local98, 12.0D));
						} else {
							local143 = 0;
							local145 = 0;
							local146 = 0;
						}
						local34[local91][local40] = local146 << 24;
						local38[local91][local40] = local145 << 24;
						local30[local91][local40] = local143 << 24;
					}
					local40++;
				}
			}
			this.anInterface3Array1 = new Interface3[3];
			this.anInterface3Array1[0] = super.aClass5_Sub1_22.method5581(64, local34, false);
			this.anInterface3Array1[1] = super.aClass5_Sub1_22.method5581(64, local38, false);
			this.anInterface3Array1[2] = super.aClass5_Sub1_22.method5581(64, local30, false);
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8067(@OriginalArg(0) boolean arg0) {
		super.aClass5_Sub1_22.method5682(Static314.aClass374_2, Static514.aClass374_5);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)V")
	@Override
	public void method8083(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean86) {
			super.aClass5_Sub1_22.method5571(1);
			super.aClass5_Sub1_22.method5609(this.anInterface3Array1[arg1 - 1]);
			super.aClass5_Sub1_22.method5571(0);
		}
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8073() {
		return true;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8080(@OriginalArg(1) boolean arg0) {
		if (this.anInterface3Array1 == null || !arg0) {
			super.aClass5_Sub1_22.method5592(Static578.aClass9_5, 0);
			return;
		}
		super.aClass5_Sub1_22.method5571(1);
		super.aClass5_Sub1_22.method5620(Static218.aClass99_15);
		@Pc(21) Class39_Sub1 local21 = super.aClass5_Sub1_22.method5678();
		local21.method7237(1024);
		super.aClass5_Sub1_22.method5589(Static96.aClass340_1);
		if (this.aBoolean85) {
			super.aClass5_Sub1_22.method5682(Static314.aClass374_2, Static377.aClass374_3);
			super.aClass5_Sub1_22.method5618(false, true, 0, Static333.aClass9_2);
			super.aClass5_Sub1_22.method5592(Static578.aClass9_5, 0);
		} else {
			super.aClass5_Sub1_22.method5682(Static514.aClass374_5, Static314.aClass374_2);
			super.aClass5_Sub1_22.method5583(Static482.aClass9_4, 0);
			super.aClass5_Sub1_22.method5571(2);
			super.aClass5_Sub1_22.method5682(Static314.aClass374_2, Static377.aClass374_3);
			super.aClass5_Sub1_22.method5583(Static482.aClass9_4, 0);
			super.aClass5_Sub1_22.method5618(false, true, 1, Static482.aClass9_4);
			super.aClass5_Sub1_22.method5592(Static578.aClass9_5, 0);
			super.aClass5_Sub1_22.method5609(super.aClass5_Sub1_22.anInterface10_3);
		}
		super.aClass5_Sub1_22.method5571(0);
		this.aBoolean86 = true;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IILclient!ec;)V")
	@Override
	public void method8072(@OriginalArg(1) int arg0, @OriginalArg(2) Interface10 arg1) {
		super.aClass5_Sub1_22.method5609(arg1);
		super.aClass5_Sub1_22.method5697(arg0);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
	@Override
	public void method8071() {
		if (this.aBoolean86) {
			super.aClass5_Sub1_22.method5571(1);
			super.aClass5_Sub1_22.method5609(null);
			super.aClass5_Sub1_22.method5620(Static540.aClass99_23);
			super.aClass5_Sub1_22.method5683();
			if (this.aBoolean85) {
				super.aClass5_Sub1_22.method5682(Static514.aClass374_5, Static514.aClass374_5);
				super.aClass5_Sub1_22.method5583(Static333.aClass9_2, 0);
				super.aClass5_Sub1_22.method5592(Static333.aClass9_2, 0);
			} else {
				super.aClass5_Sub1_22.method5682(Static514.aClass374_5, Static514.aClass374_5);
				super.aClass5_Sub1_22.method5583(Static333.aClass9_2, 0);
				super.aClass5_Sub1_22.method5571(2);
				super.aClass5_Sub1_22.method5682(Static514.aClass374_5, Static514.aClass374_5);
				super.aClass5_Sub1_22.method5583(Static333.aClass9_2, 0);
				super.aClass5_Sub1_22.method5583(Static482.aClass9_4, 1);
				super.aClass5_Sub1_22.method5592(Static333.aClass9_2, 0);
				super.aClass5_Sub1_22.method5609(null);
			}
			super.aClass5_Sub1_22.method5571(0);
			this.aBoolean86 = false;
		} else {
			super.aClass5_Sub1_22.method5592(Static333.aClass9_2, 0);
		}
		super.aClass5_Sub1_22.method5682(Static514.aClass374_5, Static514.aClass374_5);
	}
}
