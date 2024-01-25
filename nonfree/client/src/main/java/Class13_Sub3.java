import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fda")
public final class Class13_Sub3 extends Class13 {

	@OriginalMember(owner = "client!fda", name = "s", descriptor = "Z")
	private boolean aBoolean256 = false;

	@OriginalMember(owner = "client!fda", name = "q", descriptor = "Z")
	private boolean aBoolean255;

	@OriginalMember(owner = "client!fda", name = "o", descriptor = "[Lclient!wf;")
	private Interface26[] anInterface26Array1;

	@OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(Lclient!mj;)V")
	public Class13_Sub3(@OriginalArg(0) Class101_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean487) {
			this.aBoolean255 = arg0.anInt6618 < 3;
			@Pc(28) int local28 = this.aBoolean255 ? 48 : 127;
			@Pc(32) int[][] local32 = new int[6][4096];
			@Pc(36) int[][] local36 = new int[6][4096];
			@Pc(40) int[][] local40 = new int[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local59 * local59 + local68 * local68 + 1.0F)));
					@Pc(87) float local87 = local59 * local83;
					@Pc(91) float local91 = local68 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(114) float local114;
						if (local93 == 0) {
							local114 = -local87;
						} else if (local93 == 1) {
							local114 = local87;
						} else if (local93 == 2) {
							local114 = local91;
						} else if (local93 == 3) {
							local114 = -local91;
						} else if (local93 == 4) {
							local114 = local83;
						} else {
							local114 = -local83;
						}
						@Pc(151) int local151;
						@Pc(150) int local150;
						@Pc(148) int local148;
						if (local114 > 0.0F) {
							local151 = (int) (Math.pow((double) local114, 96.0D) * (double) local28);
							local150 = (int) ((double) local28 * Math.pow((double) local114, 36.0D));
							local148 = (int) (Math.pow((double) local114, 12.0D) * (double) local28);
						} else {
							local148 = 0;
							local150 = 0;
							local151 = 0;
						}
						local36[local93][local42] = local151 << 24;
						local40[local93][local42] = local150 << 24;
						local32[local93][local42] = local148 << 24;
					}
					local42++;
				}
			}
			this.anInterface26Array1 = new Interface26[3];
			this.anInterface26Array1[0] = super.aClass101_Sub1_22.method5880(false, local36, 64);
			this.anInterface26Array1[1] = super.aClass101_Sub1_22.method5880(false, local40, 64);
			this.anInterface26Array1[2] = super.aClass101_Sub1_22.method5880(false, local32, 64);
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8490(@OriginalArg(0) boolean arg0) {
		if (this.anInterface26Array1 == null || !arg0) {
			super.aClass101_Sub1_22.method5890(0, Static312.aClass118_3);
			return;
		}
		super.aClass101_Sub1_22.method5862(1);
		super.aClass101_Sub1_22.method5889(Static434.aClass362_93);
		@Pc(25) Class76_Sub2 local25 = super.aClass101_Sub1_22.method5832();
		local25.method9637(1024);
		super.aClass101_Sub1_22.method5902(Static647.aClass327_5);
		if (this.aBoolean255) {
			super.aClass101_Sub1_22.method5891(Static238.aClass381_4, Static512.aClass381_5);
			super.aClass101_Sub1_22.method5922(0, false, true, Static44.aClass118_1);
			super.aClass101_Sub1_22.method5890(0, Static312.aClass118_3);
		} else {
			super.aClass101_Sub1_22.method5891(Static512.aClass381_5, Static175.aClass381_3);
			super.aClass101_Sub1_22.method5954(0, Static175.aClass118_2);
			super.aClass101_Sub1_22.method5862(2);
			super.aClass101_Sub1_22.method5891(Static238.aClass381_4, Static512.aClass381_5);
			super.aClass101_Sub1_22.method5954(0, Static175.aClass118_2);
			super.aClass101_Sub1_22.method5922(1, false, true, Static175.aClass118_2);
			super.aClass101_Sub1_22.method5890(0, Static312.aClass118_3);
			super.aClass101_Sub1_22.method5909(super.aClass101_Sub1_22.anInterface5_3);
		}
		super.aClass101_Sub1_22.method5862(0);
		this.aBoolean256 = true;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lclient!en;ZI)V")
	@Override
	public void method8494(@OriginalArg(0) Interface5 arg0, @OriginalArg(2) int arg1) {
		super.aClass101_Sub1_22.method5909(arg0);
		super.aClass101_Sub1_22.method5840(arg1);
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8489() {
		return true;
	}

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "(B)V")
	@Override
	public void method8498() {
		if (this.aBoolean256) {
			super.aClass101_Sub1_22.method5862(1);
			super.aClass101_Sub1_22.method5909((Interface5) null);
			super.aClass101_Sub1_22.method5889(Static267.aClass362_171);
			super.aClass101_Sub1_22.method5952();
			if (this.aBoolean255) {
				super.aClass101_Sub1_22.method5891(Static175.aClass381_3, Static175.aClass381_3);
				super.aClass101_Sub1_22.method5954(0, Static44.aClass118_1);
				super.aClass101_Sub1_22.method5890(0, Static44.aClass118_1);
			} else {
				super.aClass101_Sub1_22.method5891(Static175.aClass381_3, Static175.aClass381_3);
				super.aClass101_Sub1_22.method5954(0, Static44.aClass118_1);
				super.aClass101_Sub1_22.method5862(2);
				super.aClass101_Sub1_22.method5891(Static175.aClass381_3, Static175.aClass381_3);
				super.aClass101_Sub1_22.method5954(0, Static44.aClass118_1);
				super.aClass101_Sub1_22.method5954(1, Static175.aClass118_2);
				super.aClass101_Sub1_22.method5890(0, Static44.aClass118_1);
				super.aClass101_Sub1_22.method5909((Interface5) null);
			}
			super.aClass101_Sub1_22.method5862(0);
			this.aBoolean256 = false;
		} else {
			super.aClass101_Sub1_22.method5890(0, Static44.aClass118_1);
		}
		super.aClass101_Sub1_22.method5891(Static175.aClass381_3, Static175.aClass381_3);
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(III)V")
	@Override
	public void method8488(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean256) {
			super.aClass101_Sub1_22.method5862(1);
			super.aClass101_Sub1_22.method5909(this.anInterface26Array1[arg1 - 1]);
			super.aClass101_Sub1_22.method5862(0);
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8495(@OriginalArg(1) boolean arg0) {
		super.aClass101_Sub1_22.method5891(Static175.aClass381_3, Static512.aClass381_5);
	}
}
