import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iw")
public final class Class112_Sub3 extends Class112 {

	@OriginalMember(owner = "client!iw", name = "p", descriptor = "Lclient!pha;")
	private Class290 aClass290_3;

	@OriginalMember(owner = "client!iw", name = "n", descriptor = "Z")
	private boolean aBoolean387 = false;

	@OriginalMember(owner = "client!iw", name = "m", descriptor = "Z")
	private boolean aBoolean388;

	@OriginalMember(owner = "client!iw", name = "r", descriptor = "[Lclient!el;")
	private Class64_Sub2[] aClass64_Sub2Array1;

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Lclient!uja;)V")
	public Class112_Sub3(@OriginalArg(0) Class145_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean871) {
			this.aBoolean388 = arg0.anInt10161 < 3;
			@Pc(28) int local28 = this.aBoolean388 ? 48 : 127;
			@Pc(32) byte[][] local32 = new byte[6][4096];
			@Pc(36) byte[][] local36 = new byte[6][4096];
			@Pc(40) byte[][] local40 = new byte[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local68 * local68 + local59 * local59 + 1.0F)));
					@Pc(87) float local87 = local68 * local83;
					@Pc(91) float local91 = local59 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(125) float local125;
						if (local93 == 0) {
							local125 = -local91;
						} else if (local93 == 1) {
							local125 = local91;
						} else if (local93 == 2) {
							local125 = local87;
						} else if (local93 == 3) {
							local125 = -local87;
						} else if (local93 == 4) {
							local125 = local83;
						} else {
							local125 = -local83;
						}
						@Pc(161) int local161;
						@Pc(170) int local170;
						@Pc(179) int local179;
						if (local125 > 0.0F) {
							local161 = (int) ((double) local28 * Math.pow((double) local125, 96.0D));
							local170 = (int) (Math.pow((double) local125, 36.0D) * (double) local28);
							local179 = (int) (Math.pow((double) local125, 12.0D) * (double) local28);
						} else {
							local179 = 0;
							local170 = 0;
							local161 = 0;
						}
						local36[local93][local42] = (byte) local161;
						local40[local93][local42] = (byte) local170;
						local32[local93][local42] = (byte) local179;
					}
					local42++;
				}
			}
			this.aClass64_Sub2Array1 = new Class64_Sub2[3];
			this.aClass64_Sub2Array1[0] = new Class64_Sub2(super.aClass145_Sub3_43, 6406, 64, false, local36, 6406);
			this.aClass64_Sub2Array1[1] = new Class64_Sub2(super.aClass145_Sub3_43, 6406, 64, false, local40, 6406);
			this.aClass64_Sub2Array1[2] = new Class64_Sub2(super.aClass145_Sub3_43, 6406, 64, false, local32, 6406);
			this.method3999();
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8396(@OriginalArg(1) boolean arg0) {
		if (this.aClass290_3 == null || !arg0) {
			super.aClass145_Sub3_43.method8857(34168, 0);
			return;
		}
		if (!this.aBoolean388) {
			super.aClass145_Sub3_43.method8859(2);
			super.aClass145_Sub3_43.method8872(super.aClass145_Sub3_43.aClass64_Sub4_6);
			super.aClass145_Sub3_43.method8859(0);
		}
		this.aClass290_3.method6987('\u0000');
		this.aBoolean387 = true;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lclient!jca;II)V")
	@Override
	public void method8397(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1) {
		super.aClass145_Sub3_43.method8872(arg0);
		super.aClass145_Sub3_43.method8900(arg1);
	}

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "(I)V")
	private void method3999() {
		this.aClass290_3 = new Class290(super.aClass145_Sub3_43, 2);
		this.aClass290_3.method6989(0);
		super.aClass145_Sub3_43.method8859(1);
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
		if (this.aBoolean388) {
			super.aClass145_Sub3_43.method8897(7681, 260);
			super.aClass145_Sub3_43.method8854(0, 5890, 770);
			super.aClass145_Sub3_43.method8857(34167, 0);
		} else {
			super.aClass145_Sub3_43.method8897(8448, 7681);
			super.aClass145_Sub3_43.method8854(0, 34168, 768);
			super.aClass145_Sub3_43.method8859(2);
			super.aClass145_Sub3_43.method8897(7681, 260);
			super.aClass145_Sub3_43.method8854(0, 34168, 768);
			super.aClass145_Sub3_43.method8854(1, 34168, 770);
			super.aClass145_Sub3_43.method8857(34167, 0);
		}
		super.aClass145_Sub3_43.method8859(0);
		this.aClass290_3.method6988();
		this.aClass290_3.method6989(1);
		super.aClass145_Sub3_43.method8859(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean388) {
			super.aClass145_Sub3_43.method8897(8448, 8448);
			super.aClass145_Sub3_43.method8854(0, 5890, 768);
			super.aClass145_Sub3_43.method8857(5890, 0);
		} else {
			super.aClass145_Sub3_43.method8897(8448, 8448);
			super.aClass145_Sub3_43.method8854(0, 5890, 768);
			super.aClass145_Sub3_43.method8859(2);
			super.aClass145_Sub3_43.method8897(8448, 8448);
			super.aClass145_Sub3_43.method8854(0, 5890, 768);
			super.aClass145_Sub3_43.method8854(1, 34168, 768);
			super.aClass145_Sub3_43.method8857(5890, 0);
		}
		super.aClass145_Sub3_43.method8859(0);
		this.aClass290_3.method6988();
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8388(@OriginalArg(1) boolean arg0) {
		super.aClass145_Sub3_43.method8897(7681, 8448);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V")
	@Override
	public void method8390() {
		if (this.aBoolean387) {
			if (!this.aBoolean388) {
				super.aClass145_Sub3_43.method8859(2);
				super.aClass145_Sub3_43.method8872((Class64) null);
			}
			super.aClass145_Sub3_43.method8859(1);
			super.aClass145_Sub3_43.method8872((Class64) null);
			super.aClass145_Sub3_43.method8859(0);
			this.aClass290_3.method6987('\u0001');
			this.aBoolean387 = false;
		} else {
			super.aClass145_Sub3_43.method8857(5890, 0);
		}
		super.aClass145_Sub3_43.method8897(8448, 8448);
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(III)V")
	@Override
	public void method8393(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean387) {
			super.aClass145_Sub3_43.method8859(1);
			super.aClass145_Sub3_43.method8872(this.aClass64_Sub2Array1[arg1 - 1]);
			super.aClass145_Sub3_43.method8859(0);
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8389() {
		return true;
	}
}
