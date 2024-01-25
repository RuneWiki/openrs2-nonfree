import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class69_Sub8 extends Class69 {

	@OriginalMember(owner = "client!to", name = "n", descriptor = "Lclient!gk;")
	private Class94 aClass94_5;

	@OriginalMember(owner = "client!to", name = "s", descriptor = "Z")
	private boolean aBoolean558 = false;

	@OriginalMember(owner = "client!to", name = "z", descriptor = "Z")
	private boolean aBoolean559;

	@OriginalMember(owner = "client!to", name = "p", descriptor = "[Lclient!aw;")
	private Class23_Sub1[] aClass23_Sub1Array1;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class69_Sub8(@OriginalArg(0) Class117_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean305) {
			this.aBoolean559 = arg0.anInt3107 < 3;
			@Pc(28) int local28 = this.aBoolean559 ? 48 : 127;
			@Pc(32) byte[][] local32 = new byte[6][4096];
			@Pc(36) byte[][] local36 = new byte[6][4096];
			@Pc(40) byte[][] local40 = new byte[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local59 * local59 + local68 * local68 + 1.0F)));
					@Pc(87) float local87 = local68 * local83;
					@Pc(91) float local91 = local59 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(100) float local100;
						if (local93 == 0) {
							local100 = -local91;
						} else if (local93 == 1) {
							local100 = local91;
						} else if (local93 == 2) {
							local100 = local87;
						} else if (local93 == 3) {
							local100 = -local87;
						} else if (local93 == 4) {
							local100 = local83;
						} else {
							local100 = -local83;
						}
						@Pc(148) int local148;
						@Pc(147) int local147;
						@Pc(145) int local145;
						if (local100 > 0.0F) {
							local148 = (int) (Math.pow((double) local100, 96.0D) * (double) local28);
							local147 = (int) (Math.pow((double) local100, 36.0D) * (double) local28);
							local145 = (int) (Math.pow((double) local100, 12.0D) * (double) local28);
						} else {
							local145 = 0;
							local147 = 0;
							local148 = 0;
						}
						local36[local93][local42] = (byte) local148;
						local40[local93][local42] = (byte) local147;
						local32[local93][local42] = (byte) local145;
					}
					local42++;
				}
			}
			this.aClass23_Sub1Array1 = new Class23_Sub1[3];
			this.aClass23_Sub1Array1[0] = new Class23_Sub1(super.aClass117_Sub1_43, 6406, 64, false, local36, 6406);
			this.aClass23_Sub1Array1[1] = new Class23_Sub1(super.aClass117_Sub1_43, 6406, 64, false, local40, 6406);
			this.aClass23_Sub1Array1[2] = new Class23_Sub1(super.aClass117_Sub1_43, 6406, 64, false, local32, 6406);
			this.method5157();
		}
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(Z)V")
	private void method5157() {
		this.aClass94_5 = new Class94(super.aClass117_Sub1_43, 2);
		this.aClass94_5.method1744(0);
		super.aClass117_Sub1_43.method2476(1);
		OpenGL.glTexGeni(8192, 9472, 34065);
		OpenGL.glTexGeni(8193, 9472, 34065);
		OpenGL.glTexGeni(8194, 9472, 34065);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glEnable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean559) {
			super.aClass117_Sub1_43.method2471(7681, 260);
			super.aClass117_Sub1_43.method2505(0, 5890, 770);
			super.aClass117_Sub1_43.method2492(34167, 0);
		} else {
			super.aClass117_Sub1_43.method2471(8448, 7681);
			super.aClass117_Sub1_43.method2505(0, 34168, 768);
			super.aClass117_Sub1_43.method2476(2);
			super.aClass117_Sub1_43.method2471(7681, 260);
			super.aClass117_Sub1_43.method2505(0, 34168, 768);
			super.aClass117_Sub1_43.method2505(1, 34168, 770);
			super.aClass117_Sub1_43.method2492(34167, 0);
		}
		super.aClass117_Sub1_43.method2476(0);
		this.aClass94_5.method1745();
		this.aClass94_5.method1744(1);
		super.aClass117_Sub1_43.method2476(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean559) {
			super.aClass117_Sub1_43.method2471(8448, 8448);
			super.aClass117_Sub1_43.method2505(0, 5890, 768);
			super.aClass117_Sub1_43.method2492(5890, 0);
		} else {
			super.aClass117_Sub1_43.method2471(8448, 8448);
			super.aClass117_Sub1_43.method2505(0, 5890, 768);
			super.aClass117_Sub1_43.method2476(2);
			super.aClass117_Sub1_43.method2471(8448, 8448);
			super.aClass117_Sub1_43.method2505(0, 5890, 768);
			super.aClass117_Sub1_43.method2505(1, 34168, 768);
			super.aClass117_Sub1_43.method2492(5890, 0);
		}
		super.aClass117_Sub1_43.method2476(0);
		this.aClass94_5.method1745();
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5861(@OriginalArg(0) boolean arg0) {
		super.aClass117_Sub1_43.method2471(7681, 8448);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)V")
	@Override
	public void method5853() {
		if (this.aBoolean558) {
			if (!this.aBoolean559) {
				super.aClass117_Sub1_43.method2476(2);
				super.aClass117_Sub1_43.method2504(null);
			}
			super.aClass117_Sub1_43.method2476(1);
			super.aClass117_Sub1_43.method2504(null);
			super.aClass117_Sub1_43.method2476(0);
			this.aClass94_5.method1738('\u0001');
			this.aBoolean558 = false;
		} else {
			super.aClass117_Sub1_43.method2492(5890, 0);
		}
		super.aClass117_Sub1_43.method2471(8448, 8448);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!sv;IB)V")
	@Override
	public void method5863(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1) {
		super.aClass117_Sub1_43.method2504(arg0);
		super.aClass117_Sub1_43.method2535(arg1);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BII)V")
	@Override
	public void method5857(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean558) {
			super.aClass117_Sub1_43.method2476(1);
			super.aClass117_Sub1_43.method2504(this.aClass23_Sub1Array1[arg1 - 1]);
			super.aClass117_Sub1_43.method2476(0);
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5852() {
		return true;
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(ZI)V")
	@Override
	public void method5862(@OriginalArg(0) boolean arg0) {
		if (this.aClass94_5 == null || !arg0) {
			super.aClass117_Sub1_43.method2492(34168, 0);
			return;
		}
		if (!this.aBoolean559) {
			super.aClass117_Sub1_43.method2476(2);
			super.aClass117_Sub1_43.method2504(super.aClass117_Sub1_43.aClass23_Sub3_3);
			super.aClass117_Sub1_43.method2476(0);
		}
		this.aClass94_5.method1738('\u0000');
		this.aBoolean558 = true;
	}
}
