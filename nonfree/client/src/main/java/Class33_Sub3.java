import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nw")
public final class Class33_Sub3 extends Class33 {

	@OriginalMember(owner = "client!nw", name = "r", descriptor = "Lclient!oi;")
	private Class261 aClass261_3;

	@OriginalMember(owner = "client!nw", name = "k", descriptor = "Z")
	private boolean aBoolean514 = false;

	@OriginalMember(owner = "client!nw", name = "i", descriptor = "Z")
	private boolean aBoolean513;

	@OriginalMember(owner = "client!nw", name = "h", descriptor = "[Lclient!qba;")
	private Class66_Sub4[] aClass66_Sub4Array1;

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lclient!qfa;)V")
	public Class33_Sub3(@OriginalArg(0) Class137_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean605) {
			this.aBoolean513 = arg0.anInt8575 < 3;
			@Pc(28) int local28 = this.aBoolean513 ? 48 : 127;
			@Pc(32) byte[][] local32 = new byte[6][4096];
			@Pc(36) byte[][] local36 = new byte[6][4096];
			@Pc(40) byte[][] local40 = new byte[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local59 * local59 + local68 * local68 + 1.0F)));
					@Pc(87) float local87 = local59 * local83;
					@Pc(91) float local91 = local68 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(120) float local120;
						if (local93 == 0) {
							local120 = -local91;
						} else if (local93 == 1) {
							local120 = local91;
						} else if (local93 == 2) {
							local120 = local87;
						} else if (local93 == 3) {
							local120 = -local87;
						} else if (local93 == 4) {
							local120 = local83;
						} else {
							local120 = -local83;
						}
						@Pc(152) int local152;
						@Pc(151) int local151;
						@Pc(149) int local149;
						if (local120 > 0.0F) {
							local152 = (int) (Math.pow((double) local120, 96.0D) * (double) local28);
							local151 = (int) ((double) local28 * Math.pow((double) local120, 36.0D));
							local149 = (int) ((double) local28 * Math.pow((double) local120, 12.0D));
						} else {
							local149 = 0;
							local151 = 0;
							local152 = 0;
						}
						local36[local93][local42] = (byte) local152;
						local40[local93][local42] = (byte) local151;
						local32[local93][local42] = (byte) local149;
					}
					local42++;
				}
			}
			this.aClass66_Sub4Array1 = new Class66_Sub4[3];
			this.aClass66_Sub4Array1[0] = new Class66_Sub4(super.aClass137_Sub3_42, 6406, 64, false, local36, 6406);
			this.aClass66_Sub4Array1[1] = new Class66_Sub4(super.aClass137_Sub3_42, 6406, 64, false, local40, 6406);
			this.aClass66_Sub4Array1[2] = new Class66_Sub4(super.aClass137_Sub3_42, 6406, 64, false, local32, 6406);
			this.method6058();
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IZLclient!dca;)V")
	@Override
	public void method8851(@OriginalArg(0) int arg0, @OriginalArg(2) Class66 arg1) {
		super.aClass137_Sub3_42.method7090(arg1);
		super.aClass137_Sub3_42.method7077(arg0);
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(B)V")
	private void method6058() {
		this.aClass261_3 = new Class261(super.aClass137_Sub3_42, 2);
		this.aClass261_3.method6286(0);
		super.aClass137_Sub3_42.method7095(1);
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
		if (this.aBoolean513) {
			super.aClass137_Sub3_42.method7084(7681, 260);
			super.aClass137_Sub3_42.method7071(5890, 770, 0);
			super.aClass137_Sub3_42.method7027(34167, 0);
		} else {
			super.aClass137_Sub3_42.method7084(8448, 7681);
			super.aClass137_Sub3_42.method7071(34168, 768, 0);
			super.aClass137_Sub3_42.method7095(2);
			super.aClass137_Sub3_42.method7084(7681, 260);
			super.aClass137_Sub3_42.method7071(34168, 768, 0);
			super.aClass137_Sub3_42.method7071(34168, 770, 1);
			super.aClass137_Sub3_42.method7027(34167, 0);
		}
		super.aClass137_Sub3_42.method7095(0);
		this.aClass261_3.method6287();
		this.aClass261_3.method6286(1);
		super.aClass137_Sub3_42.method7095(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean513) {
			super.aClass137_Sub3_42.method7084(8448, 8448);
			super.aClass137_Sub3_42.method7071(5890, 768, 0);
			super.aClass137_Sub3_42.method7027(5890, 0);
		} else {
			super.aClass137_Sub3_42.method7084(8448, 8448);
			super.aClass137_Sub3_42.method7071(5890, 768, 0);
			super.aClass137_Sub3_42.method7095(2);
			super.aClass137_Sub3_42.method7084(8448, 8448);
			super.aClass137_Sub3_42.method7071(5890, 768, 0);
			super.aClass137_Sub3_42.method7071(34168, 768, 1);
			super.aClass137_Sub3_42.method7027(5890, 0);
		}
		super.aClass137_Sub3_42.method7095(0);
		this.aClass261_3.method6287();
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(BII)V")
	@Override
	public void method8849(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean514) {
			super.aClass137_Sub3_42.method7095(1);
			super.aClass137_Sub3_42.method7090(this.aClass66_Sub4Array1[arg0 - 1]);
			super.aClass137_Sub3_42.method7095(0);
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8846() {
		return true;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8847(@OriginalArg(0) boolean arg0) {
		super.aClass137_Sub3_42.method7084(7681, 8448);
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(I)V")
	@Override
	public void method8848() {
		if (this.aBoolean514) {
			if (!this.aBoolean513) {
				super.aClass137_Sub3_42.method7095(2);
				super.aClass137_Sub3_42.method7090((Class66) null);
			}
			super.aClass137_Sub3_42.method7095(1);
			super.aClass137_Sub3_42.method7090((Class66) null);
			super.aClass137_Sub3_42.method7095(0);
			this.aClass261_3.method6285('\u0001');
			this.aBoolean514 = false;
		} else {
			super.aClass137_Sub3_42.method7027(5890, 0);
		}
		super.aClass137_Sub3_42.method7084(8448, 8448);
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(ZI)V")
	@Override
	public void method8854(@OriginalArg(0) boolean arg0) {
		if (this.aClass261_3 == null || !arg0) {
			super.aClass137_Sub3_42.method7027(34168, 0);
			return;
		}
		if (!this.aBoolean513) {
			super.aClass137_Sub3_42.method7095(2);
			super.aClass137_Sub3_42.method7090(super.aClass137_Sub3_42.aClass66_Sub1_6);
			super.aClass137_Sub3_42.method7095(0);
		}
		this.aClass261_3.method6285('\u0000');
		this.aBoolean514 = true;
	}
}
