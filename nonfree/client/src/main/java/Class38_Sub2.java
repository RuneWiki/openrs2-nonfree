import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class38_Sub2 extends Class38 {

	@OriginalMember(owner = "client!gg", name = "j", descriptor = "Lclient!pb;")
	private Class184 aClass184_2;

	@OriginalMember(owner = "client!gg", name = "y", descriptor = "Z")
	private boolean aBoolean262 = false;

	@OriginalMember(owner = "client!gg", name = "u", descriptor = "Z")
	private boolean aBoolean261;

	@OriginalMember(owner = "client!gg", name = "A", descriptor = "[Lclient!sa;")
	private Class10_Sub3[] aClass10_Sub3Array1;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!ur;)V")
	public Class38_Sub2(@OriginalArg(0) Class34_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean776) {
			this.aBoolean261 = arg0.anInt7104 < 3;
			@Pc(28) int local28 = this.aBoolean261 ? 48 : 127;
			@Pc(32) byte[][] local32 = new byte[6][4096];
			@Pc(36) byte[][] local36 = new byte[6][4096];
			@Pc(40) byte[][] local40 = new byte[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local68 * local68 + local59 * local59 + 1.0F)));
					@Pc(87) float local87 = local59 * local83;
					@Pc(91) float local91 = local68 * local83;
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
						@Pc(149) int local149;
						@Pc(158) int local158;
						@Pc(167) int local167;
						if (local100 > 0.0F) {
							local149 = (int) (Math.pow((double) local100, 96.0D) * (double) local28);
							local158 = (int) (Math.pow((double) local100, 36.0D) * (double) local28);
							local167 = (int) (Math.pow((double) local100, 12.0D) * (double) local28);
						} else {
							local167 = 0;
							local158 = 0;
							local149 = 0;
						}
						local36[local93][local42] = (byte) local149;
						local40[local93][local42] = (byte) local158;
						local32[local93][local42] = (byte) local167;
					}
					local42++;
				}
			}
			this.aClass10_Sub3Array1 = new Class10_Sub3[3];
			this.aClass10_Sub3Array1[0] = new Class10_Sub3(super.aClass34_Sub2_41, 6406, 64, false, local36, 6406);
			this.aClass10_Sub3Array1[1] = new Class10_Sub3(super.aClass34_Sub2_41, 6406, 64, false, local40, 6406);
			this.aClass10_Sub3Array1[2] = new Class10_Sub3(super.aClass34_Sub2_41, 6406, 64, false, local32, 6406);
			this.method2008();
		}
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(ZI)V")
	@Override
	public void method5825(@OriginalArg(0) boolean arg0) {
		super.aClass34_Sub2_41.method5526(8448, 7681);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!he;I)V")
	@Override
	public void method5821(@OriginalArg(1) Class10 arg0, @OriginalArg(2) int arg1) {
		super.aClass34_Sub2_41.method5493(arg0);
		super.aClass34_Sub2_41.method5517(arg1);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)V")
	@Override
	public void method5827(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean262) {
			super.aClass34_Sub2_41.method5507(1);
			super.aClass34_Sub2_41.method5493(this.aClass10_Sub3Array1[arg1 - 1]);
			super.aClass34_Sub2_41.method5507(0);
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5820(@OriginalArg(0) boolean arg0) {
		if (this.aClass184_2 == null || !arg0) {
			super.aClass34_Sub2_41.method5534(0, 34168);
			return;
		}
		if (!this.aBoolean261) {
			super.aClass34_Sub2_41.method5507(2);
			super.aClass34_Sub2_41.method5493(super.aClass34_Sub2_41.aClass10_Sub1_5);
			super.aClass34_Sub2_41.method5507(0);
		}
		this.aClass184_2.method4096('\u0000');
		this.aBoolean262 = true;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
	@Override
	public void method5824() {
		if (this.aBoolean262) {
			if (!this.aBoolean261) {
				super.aClass34_Sub2_41.method5507(2);
				super.aClass34_Sub2_41.method5493(null);
			}
			super.aClass34_Sub2_41.method5507(1);
			super.aClass34_Sub2_41.method5493(null);
			super.aClass34_Sub2_41.method5507(0);
			this.aClass184_2.method4096('\u0001');
			this.aBoolean262 = false;
		} else {
			super.aClass34_Sub2_41.method5534(0, 5890);
		}
		super.aClass34_Sub2_41.method5526(8448, 8448);
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V")
	private void method2008() {
		this.aClass184_2 = new Class184(super.aClass34_Sub2_41, 2);
		this.aClass184_2.method4094(0);
		super.aClass34_Sub2_41.method5507(1);
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
		if (this.aBoolean261) {
			super.aClass34_Sub2_41.method5526(260, 7681);
			super.aClass34_Sub2_41.method5486(5890, 0, 770);
			super.aClass34_Sub2_41.method5534(0, 34167);
		} else {
			super.aClass34_Sub2_41.method5526(7681, 8448);
			super.aClass34_Sub2_41.method5486(34168, 0, 768);
			super.aClass34_Sub2_41.method5507(2);
			super.aClass34_Sub2_41.method5526(260, 7681);
			super.aClass34_Sub2_41.method5486(34168, 0, 768);
			super.aClass34_Sub2_41.method5486(34168, 1, 770);
			super.aClass34_Sub2_41.method5534(0, 34167);
		}
		super.aClass34_Sub2_41.method5507(0);
		this.aClass184_2.method4095();
		this.aClass184_2.method4094(1);
		super.aClass34_Sub2_41.method5507(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean261) {
			super.aClass34_Sub2_41.method5526(8448, 8448);
			super.aClass34_Sub2_41.method5486(5890, 0, 768);
			super.aClass34_Sub2_41.method5534(0, 5890);
		} else {
			super.aClass34_Sub2_41.method5526(8448, 8448);
			super.aClass34_Sub2_41.method5486(5890, 0, 768);
			super.aClass34_Sub2_41.method5507(2);
			super.aClass34_Sub2_41.method5526(8448, 8448);
			super.aClass34_Sub2_41.method5486(5890, 0, 768);
			super.aClass34_Sub2_41.method5486(34168, 1, 768);
			super.aClass34_Sub2_41.method5534(0, 5890);
		}
		super.aClass34_Sub2_41.method5507(0);
		this.aClass184_2.method4095();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5823() {
		return true;
	}
}
