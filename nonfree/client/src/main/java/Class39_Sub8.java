import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class39_Sub8 extends Class39 {

	@OriginalMember(owner = "client!pj", name = "q", descriptor = "Lclient!uv;")
	private Class260 aClass260_5;

	@OriginalMember(owner = "client!pj", name = "s", descriptor = "Z")
	private boolean aBoolean420 = false;

	@OriginalMember(owner = "client!pj", name = "u", descriptor = "Z")
	private boolean aBoolean421;

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "[Lclient!hp;")
	private Class62_Sub3[] aClass62_Sub3Array1;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lclient!bt;)V")
	public Class39_Sub8(@OriginalArg(0) Class30_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean34) {
			this.aBoolean421 = arg0.anInt863 < 3;
			@Pc(28) int local28 = this.aBoolean421 ? 48 : 127;
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
						@Pc(110) float local110;
						if (local93 == 0) {
							local110 = -local91;
						} else if (local93 == 1) {
							local110 = local91;
						} else if (local93 == 2) {
							local110 = local87;
						} else if (local93 == 3) {
							local110 = -local87;
						} else if (local93 == 4) {
							local110 = local83;
						} else {
							local110 = -local83;
						}
						@Pc(153) int local153;
						@Pc(152) int local152;
						@Pc(150) int local150;
						if (local110 > 0.0F) {
							local153 = (int) (Math.pow((double) local110, 96.0D) * (double) local28);
							local152 = (int) (Math.pow((double) local110, 36.0D) * (double) local28);
							local150 = (int) ((double) local28 * Math.pow((double) local110, 12.0D));
						} else {
							local150 = 0;
							local152 = 0;
							local153 = 0;
						}
						local36[local93][local42] = (byte) local153;
						local40[local93][local42] = (byte) local152;
						local32[local93][local42] = (byte) local150;
					}
					local42++;
				}
			}
			this.aClass62_Sub3Array1 = new Class62_Sub3[3];
			this.aClass62_Sub3Array1[0] = new Class62_Sub3(super.aClass30_Sub1_42, 6406, 64, false, local36, 6406);
			this.aClass62_Sub3Array1[1] = new Class62_Sub3(super.aClass30_Sub1_42, 6406, 64, false, local40, 6406);
			this.aClass62_Sub3Array1[2] = new Class62_Sub3(super.aClass30_Sub1_42, 6406, 64, false, local32, 6406);
			this.method4734();
		}
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method6000() {
		return true;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5996(@OriginalArg(0) boolean arg0) {
		super.aClass30_Sub1_42.method724(8448, 7681);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)V")
	@Override
	public void method5995(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean420) {
			super.aClass30_Sub1_42.method726(1);
			super.aClass30_Sub1_42.method730(this.aClass62_Sub3Array1[arg1 - 1]);
			super.aClass30_Sub1_42.method726(0);
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
	@Override
	public void method5994() {
		if (this.aBoolean420) {
			if (!this.aBoolean421) {
				super.aClass30_Sub1_42.method726(2);
				super.aClass30_Sub1_42.method730(null);
			}
			super.aClass30_Sub1_42.method726(1);
			super.aClass30_Sub1_42.method730(null);
			super.aClass30_Sub1_42.method726(0);
			this.aClass260_5.method5895('\u0001');
			this.aBoolean420 = false;
		} else {
			super.aClass30_Sub1_42.method690(5890, 0);
		}
		super.aClass30_Sub1_42.method724(8448, 8448);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!ei;II)V")
	@Override
	public void method5997(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1) {
		super.aClass30_Sub1_42.method730(arg0);
		super.aClass30_Sub1_42.method713(arg1);
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)V")
	private void method4734() {
		this.aClass260_5 = new Class260(super.aClass30_Sub1_42, 2);
		this.aClass260_5.method5892(0);
		super.aClass30_Sub1_42.method726(1);
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
		if (this.aBoolean421) {
			super.aClass30_Sub1_42.method724(260, 7681);
			super.aClass30_Sub1_42.method752(5890, 770, 0);
			super.aClass30_Sub1_42.method690(34167, 0);
		} else {
			super.aClass30_Sub1_42.method724(7681, 8448);
			super.aClass30_Sub1_42.method752(34168, 768, 0);
			super.aClass30_Sub1_42.method726(2);
			super.aClass30_Sub1_42.method724(260, 7681);
			super.aClass30_Sub1_42.method752(34168, 768, 0);
			super.aClass30_Sub1_42.method752(34168, 770, 1);
			super.aClass30_Sub1_42.method690(34167, 0);
		}
		super.aClass30_Sub1_42.method726(0);
		this.aClass260_5.method5894();
		this.aClass260_5.method5892(1);
		super.aClass30_Sub1_42.method726(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean421) {
			super.aClass30_Sub1_42.method724(8448, 8448);
			super.aClass30_Sub1_42.method752(5890, 768, 0);
			super.aClass30_Sub1_42.method690(5890, 0);
		} else {
			super.aClass30_Sub1_42.method724(8448, 8448);
			super.aClass30_Sub1_42.method752(5890, 768, 0);
			super.aClass30_Sub1_42.method726(2);
			super.aClass30_Sub1_42.method724(8448, 8448);
			super.aClass30_Sub1_42.method752(5890, 768, 0);
			super.aClass30_Sub1_42.method752(34168, 768, 1);
			super.aClass30_Sub1_42.method690(5890, 0);
		}
		super.aClass30_Sub1_42.method726(0);
		this.aClass260_5.method5894();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5999(@OriginalArg(1) boolean arg0) {
		if (this.aClass260_5 == null || !arg0) {
			super.aClass30_Sub1_42.method690(34168, 0);
			return;
		}
		if (!this.aBoolean421) {
			super.aClass30_Sub1_42.method726(2);
			super.aClass30_Sub1_42.method730(super.aClass30_Sub1_42.aClass62_Sub2_1);
			super.aClass30_Sub1_42.method726(0);
		}
		this.aClass260_5.method5895('\u0000');
		this.aBoolean420 = true;
	}
}
