import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vha")
public final class Class13_Sub9 extends Class13 {

	@OriginalMember(owner = "client!vha", name = "o", descriptor = "Lclient!qha;")
	private Class273 aClass273_6;

	@OriginalMember(owner = "client!vha", name = "n", descriptor = "Z")
	private boolean aBoolean735 = false;

	@OriginalMember(owner = "client!vha", name = "l", descriptor = "Z")
	private boolean aBoolean734;

	@OriginalMember(owner = "client!vha", name = "k", descriptor = "[Lclient!tc;")
	private Class20_Sub3[] aClass20_Sub3Array1;

	@OriginalMember(owner = "client!vha", name = "<init>", descriptor = "(Lclient!nv;)V")
	public Class13_Sub9(@OriginalArg(0) Class16_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean510) {
			this.aBoolean734 = arg0.anInt7353 < 3;
			@Pc(28) int local28 = this.aBoolean734 ? 48 : 127;
			@Pc(32) byte[][] local32 = new byte[6][4096];
			@Pc(36) byte[][] local36 = new byte[6][4096];
			@Pc(40) byte[][] local40 = new byte[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local59 * local59 + local68 * local68 + 1.0F)));
					@Pc(87) float local87 = local68 * local83;
					@Pc(91) float local91 = local59 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(100) float local100;
						if (local93 == 0) {
							local100 = -local87;
						} else if (local93 == 1) {
							local100 = local87;
						} else if (local93 == 2) {
							local100 = local91;
						} else if (local93 == 3) {
							local100 = -local91;
						} else if (local93 == 4) {
							local100 = local83;
						} else {
							local100 = -local83;
						}
						@Pc(148) int local148;
						@Pc(147) int local147;
						@Pc(145) int local145;
						if (local100 > 0.0F) {
							local148 = (int) ((double) local28 * Math.pow((double) local100, 96.0D));
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
			this.aClass20_Sub3Array1 = new Class20_Sub3[3];
			this.aClass20_Sub3Array1[0] = new Class20_Sub3(super.aClass16_Sub3_42, 6406, 64, false, local36, 6406);
			this.aClass20_Sub3Array1[1] = new Class20_Sub3(super.aClass16_Sub3_42, 6406, 64, false, local40, 6406);
			this.aClass20_Sub3Array1[2] = new Class20_Sub3(super.aClass16_Sub3_42, 6406, 64, false, local32, 6406);
			this.method8269();
		}
	}

	@OriginalMember(owner = "client!vha", name = "c", descriptor = "(I)V")
	private void method8269() {
		this.aClass273_6 = new Class273(super.aClass16_Sub3_42, 2);
		this.aClass273_6.method6909(0);
		super.aClass16_Sub3_42.method5944(1);
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
		if (this.aBoolean734) {
			super.aClass16_Sub3_42.method5957(260, 7681);
			super.aClass16_Sub3_42.method6025(770, 0, 5890);
			super.aClass16_Sub3_42.method6029(0, 34167);
		} else {
			super.aClass16_Sub3_42.method5957(7681, 8448);
			super.aClass16_Sub3_42.method6025(768, 0, 34168);
			super.aClass16_Sub3_42.method5944(2);
			super.aClass16_Sub3_42.method5957(260, 7681);
			super.aClass16_Sub3_42.method6025(768, 0, 34168);
			super.aClass16_Sub3_42.method6025(770, 1, 34168);
			super.aClass16_Sub3_42.method6029(0, 34167);
		}
		super.aClass16_Sub3_42.method5944(0);
		this.aClass273_6.method6915();
		this.aClass273_6.method6909(1);
		super.aClass16_Sub3_42.method5944(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean734) {
			super.aClass16_Sub3_42.method5957(8448, 8448);
			super.aClass16_Sub3_42.method6025(768, 0, 5890);
			super.aClass16_Sub3_42.method6029(0, 5890);
		} else {
			super.aClass16_Sub3_42.method5957(8448, 8448);
			super.aClass16_Sub3_42.method6025(768, 0, 5890);
			super.aClass16_Sub3_42.method5944(2);
			super.aClass16_Sub3_42.method5957(8448, 8448);
			super.aClass16_Sub3_42.method6025(768, 0, 5890);
			super.aClass16_Sub3_42.method6025(768, 1, 34168);
			super.aClass16_Sub3_42.method6029(0, 5890);
		}
		super.aClass16_Sub3_42.method5944(0);
		this.aClass273_6.method6915();
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8265() {
		return true;
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8266(@OriginalArg(1) boolean arg0) {
		super.aClass16_Sub3_42.method5957(8448, 7681);
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8268(@OriginalArg(1) boolean arg0) {
		if (this.aClass273_6 == null || !arg0) {
			super.aClass16_Sub3_42.method6029(0, 34168);
			return;
		}
		if (!this.aBoolean734) {
			super.aClass16_Sub3_42.method5944(2);
			super.aClass16_Sub3_42.method6020(super.aClass16_Sub3_42.aClass20_Sub4_5);
			super.aClass16_Sub3_42.method5944(0);
		}
		this.aClass273_6.method6916('\u0000');
		this.aBoolean735 = true;
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(Lclient!tha;II)V")
	@Override
	public void method8264(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1) {
		super.aClass16_Sub3_42.method6020(arg0);
		super.aClass16_Sub3_42.method5972(arg1);
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8263(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean735) {
			super.aClass16_Sub3_42.method5944(1);
			super.aClass16_Sub3_42.method6020(this.aClass20_Sub3Array1[arg0 - 1]);
			super.aClass16_Sub3_42.method5944(0);
		}
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(I)V")
	@Override
	public void method8260() {
		if (this.aBoolean735) {
			if (!this.aBoolean734) {
				super.aClass16_Sub3_42.method5944(2);
				super.aClass16_Sub3_42.method6020(null);
			}
			super.aClass16_Sub3_42.method5944(1);
			super.aClass16_Sub3_42.method6020(null);
			super.aClass16_Sub3_42.method5944(0);
			this.aClass273_6.method6916('\u0001');
			this.aBoolean735 = false;
		} else {
			super.aClass16_Sub3_42.method6029(0, 5890);
		}
		super.aClass16_Sub3_42.method5957(8448, 8448);
	}
}
