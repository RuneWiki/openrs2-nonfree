import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class22_Sub8 extends Class22 {

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "Lclient!ce;")
	private Class37 aClass37_5;

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "Z")
	private boolean aBoolean295 = false;

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "Z")
	private boolean aBoolean294;

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "[Lclient!ui;")
	private Class59_Sub4[] aClass59_Sub4Array1;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!vd;)V")
	public Class22_Sub8(@OriginalArg(0) Class51_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean457) {
			this.aBoolean294 = arg0.anInt6942 < 3;
			@Pc(28) int local28 = this.aBoolean294 ? 48 : 127;
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
						@Pc(107) float local107;
						if (local93 == 0) {
							local107 = -local87;
						} else if (local93 == 1) {
							local107 = local87;
						} else if (local93 == 2) {
							local107 = local91;
						} else if (local93 == 3) {
							local107 = -local91;
						} else if (local93 == 4) {
							local107 = local83;
						} else {
							local107 = -local83;
						}
						@Pc(148) int local148;
						@Pc(147) int local147;
						@Pc(145) int local145;
						if (local107 > 0.0F) {
							local148 = (int) (Math.pow((double) local107, 96.0D) * (double) local28);
							local147 = (int) (Math.pow((double) local107, 36.0D) * (double) local28);
							local145 = (int) (Math.pow((double) local107, 12.0D) * (double) local28);
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
			this.aClass59_Sub4Array1 = new Class59_Sub4[3];
			this.aClass59_Sub4Array1[0] = new Class59_Sub4(super.aClass51_Sub2_33, 6406, 64, false, local36, 6406);
			this.aClass59_Sub4Array1[1] = new Class59_Sub4(super.aClass51_Sub2_33, 6406, 64, false, local40, 6406);
			this.aClass59_Sub4Array1[2] = new Class59_Sub4(super.aClass51_Sub2_33, 6406, 64, false, local32, 6406);
			this.method3733();
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
	private void method3733() {
		this.aClass37_5 = new Class37(super.aClass51_Sub2_33, 2);
		this.aClass37_5.method601(0);
		super.aClass51_Sub2_33.method5371(1);
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
		if (this.aBoolean294) {
			super.aClass51_Sub2_33.method5394(260, 7681);
			super.aClass51_Sub2_33.method5408(770, 5890, 0);
			super.aClass51_Sub2_33.method5374(34167, 0);
		} else {
			super.aClass51_Sub2_33.method5394(7681, 8448);
			super.aClass51_Sub2_33.method5408(768, 34168, 0);
			super.aClass51_Sub2_33.method5371(2);
			super.aClass51_Sub2_33.method5394(260, 7681);
			super.aClass51_Sub2_33.method5408(768, 34168, 0);
			super.aClass51_Sub2_33.method5408(770, 34168, 1);
			super.aClass51_Sub2_33.method5374(34167, 0);
		}
		super.aClass51_Sub2_33.method5371(0);
		this.aClass37_5.method606();
		this.aClass37_5.method601(1);
		super.aClass51_Sub2_33.method5371(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean294) {
			super.aClass51_Sub2_33.method5394(8448, 8448);
			super.aClass51_Sub2_33.method5408(768, 5890, 0);
			super.aClass51_Sub2_33.method5374(5890, 0);
		} else {
			super.aClass51_Sub2_33.method5394(8448, 8448);
			super.aClass51_Sub2_33.method5408(768, 5890, 0);
			super.aClass51_Sub2_33.method5371(2);
			super.aClass51_Sub2_33.method5394(8448, 8448);
			super.aClass51_Sub2_33.method5408(768, 5890, 0);
			super.aClass51_Sub2_33.method5408(768, 34168, 1);
			super.aClass51_Sub2_33.method5374(5890, 0);
		}
		super.aClass51_Sub2_33.method5371(0);
		this.aClass37_5.method606();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	@Override
	public void method4103() {
		if (this.aBoolean295) {
			if (!this.aBoolean294) {
				super.aClass51_Sub2_33.method5371(2);
				super.aClass51_Sub2_33.method5364(null);
			}
			super.aClass51_Sub2_33.method5371(1);
			super.aClass51_Sub2_33.method5364(null);
			super.aClass51_Sub2_33.method5371(0);
			this.aClass37_5.method600('\u0001');
			this.aBoolean295 = false;
		} else {
			super.aClass51_Sub2_33.method5374(5890, 0);
		}
		super.aClass51_Sub2_33.method5394(8448, 8448);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4106() {
		return true;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V")
	@Override
	public void method4104(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean295) {
			super.aClass51_Sub2_33.method5371(1);
			super.aClass51_Sub2_33.method5364(this.aClass59_Sub4Array1[arg0 - 1]);
			super.aClass51_Sub2_33.method5371(0);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method4101(@OriginalArg(0) boolean arg0) {
		if (this.aClass37_5 == null || !arg0) {
			super.aClass51_Sub2_33.method5374(34168, 0);
			return;
		}
		if (!this.aBoolean294) {
			super.aClass51_Sub2_33.method5371(2);
			super.aClass51_Sub2_33.method5364(super.aClass51_Sub2_33.aClass59_Sub3_5);
			super.aClass51_Sub2_33.method5371(0);
		}
		this.aClass37_5.method600('\u0000');
		this.aBoolean295 = true;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZI)V")
	@Override
	public void method4099(@OriginalArg(0) boolean arg0) {
		super.aClass51_Sub2_33.method5394(8448, 7681);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZLclient!ew;I)V")
	@Override
	public void method4100(@OriginalArg(1) Class59 arg0, @OriginalArg(2) int arg1) {
		super.aClass51_Sub2_33.method5364(arg0);
		super.aClass51_Sub2_33.method5400(arg1);
	}
}
