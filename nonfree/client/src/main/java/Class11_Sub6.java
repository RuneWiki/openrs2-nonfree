import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class11_Sub6 extends Class11 {

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "Lclient!jr;")
	private Class164 aClass164_5;

	@OriginalMember(owner = "client!ni", name = "q", descriptor = "Z")
	private boolean aBoolean461 = false;

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "Z")
	private boolean aBoolean459;

	@OriginalMember(owner = "client!ni", name = "s", descriptor = "[Lclient!nc;")
	private Class3_Sub4[] aClass3_Sub4Array1;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!wh;)V")
	public Class11_Sub6(@OriginalArg(0) Class100_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean701) {
			this.aBoolean459 = arg0.anInt10610 < 3;
			@Pc(28) int local28 = this.aBoolean459 ? 48 : 127;
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
						@Pc(152) int local152;
						@Pc(151) int local151;
						@Pc(149) int local149;
						if (local100 > 0.0F) {
							local152 = (int) (Math.pow((double) local100, 96.0D) * (double) local28);
							local151 = (int) (Math.pow((double) local100, 36.0D) * (double) local28);
							local149 = (int) ((double) local28 * Math.pow((double) local100, 12.0D));
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
			this.aClass3_Sub4Array1 = new Class3_Sub4[3];
			this.aClass3_Sub4Array1[0] = new Class3_Sub4(super.aClass100_Sub3_41, 6406, 64, false, local36, 6406);
			this.aClass3_Sub4Array1[1] = new Class3_Sub4(super.aClass100_Sub3_41, 6406, 64, false, local40, 6406);
			this.aClass3_Sub4Array1[2] = new Class3_Sub4(super.aClass100_Sub3_41, 6406, 64, false, local32, 6406);
			this.method5924();
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!me;ZI)V")
	@Override
	public void method8726(@OriginalArg(0) Class3 arg0, @OriginalArg(2) int arg1) {
		super.aClass100_Sub3_41.method8925(arg0);
		super.aClass100_Sub3_41.method8903(arg1);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8725() {
		return true;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)V")
	@Override
	public void method8723(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean461) {
			super.aClass100_Sub3_41.method8861(1);
			super.aClass100_Sub3_41.method8925(this.aClass3_Sub4Array1[arg0 - 1]);
			super.aClass100_Sub3_41.method8861(0);
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8728(@OriginalArg(1) boolean arg0) {
		if (this.aClass164_5 == null || !arg0) {
			super.aClass100_Sub3_41.method8923(34168, 0);
			return;
		}
		if (!this.aBoolean459) {
			super.aClass100_Sub3_41.method8861(2);
			super.aClass100_Sub3_41.method8925(super.aClass100_Sub3_41.aClass3_Sub2_6);
			super.aClass100_Sub3_41.method8861(0);
		}
		this.aClass164_5.method4788('\u0000');
		this.aBoolean461 = true;
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
	@Override
	public void method8727() {
		if (this.aBoolean461) {
			if (!this.aBoolean459) {
				super.aClass100_Sub3_41.method8861(2);
				super.aClass100_Sub3_41.method8925((Class3) null);
			}
			super.aClass100_Sub3_41.method8861(1);
			super.aClass100_Sub3_41.method8925((Class3) null);
			super.aClass100_Sub3_41.method8861(0);
			this.aClass164_5.method4788('\u0001');
			this.aBoolean461 = false;
		} else {
			super.aClass100_Sub3_41.method8923(5890, 0);
		}
		super.aClass100_Sub3_41.method8880(8448, 8448);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8724(@OriginalArg(1) boolean arg0) {
		super.aClass100_Sub3_41.method8880(7681, 8448);
	}

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)V")
	private void method5924() {
		this.aClass164_5 = new Class164(super.aClass100_Sub3_41, 2);
		this.aClass164_5.method4791(0);
		super.aClass100_Sub3_41.method8861(1);
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
		if (this.aBoolean459) {
			super.aClass100_Sub3_41.method8880(7681, 260);
			super.aClass100_Sub3_41.method8889(5890, 0, 770);
			super.aClass100_Sub3_41.method8923(34167, 0);
		} else {
			super.aClass100_Sub3_41.method8880(8448, 7681);
			super.aClass100_Sub3_41.method8889(34168, 0, 768);
			super.aClass100_Sub3_41.method8861(2);
			super.aClass100_Sub3_41.method8880(7681, 260);
			super.aClass100_Sub3_41.method8889(34168, 0, 768);
			super.aClass100_Sub3_41.method8889(34168, 1, 770);
			super.aClass100_Sub3_41.method8923(34167, 0);
		}
		super.aClass100_Sub3_41.method8861(0);
		this.aClass164_5.method4790();
		this.aClass164_5.method4791(1);
		super.aClass100_Sub3_41.method8861(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean459) {
			super.aClass100_Sub3_41.method8880(8448, 8448);
			super.aClass100_Sub3_41.method8889(5890, 0, 768);
			super.aClass100_Sub3_41.method8923(5890, 0);
		} else {
			super.aClass100_Sub3_41.method8880(8448, 8448);
			super.aClass100_Sub3_41.method8889(5890, 0, 768);
			super.aClass100_Sub3_41.method8861(2);
			super.aClass100_Sub3_41.method8880(8448, 8448);
			super.aClass100_Sub3_41.method8889(5890, 0, 768);
			super.aClass100_Sub3_41.method8889(34168, 1, 768);
			super.aClass100_Sub3_41.method8923(5890, 0);
		}
		super.aClass100_Sub3_41.method8861(0);
		this.aClass164_5.method4790();
	}
}
