import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class63_Sub9 extends Class63 {

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "Lclient!gca;")
	private Class131 aClass131_6;

	@OriginalMember(owner = "client!wr", name = "r", descriptor = "Z")
	private boolean aBoolean767 = false;

	@OriginalMember(owner = "client!wr", name = "l", descriptor = "Z")
	private boolean aBoolean768;

	@OriginalMember(owner = "client!wr", name = "k", descriptor = "[Lclient!ia;")
	private Class125_Sub2[] aClass125_Sub2Array1;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lclient!aq;)V")
	public Class63_Sub9(@OriginalArg(0) Class22_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean72) {
			this.aBoolean768 = arg0.anInt1009 < 3;
			@Pc(28) int local28 = this.aBoolean768 ? 48 : 127;
			@Pc(32) byte[][] local32 = new byte[6][4096];
			@Pc(36) byte[][] local36 = new byte[6][4096];
			@Pc(40) byte[][] local40 = new byte[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local68 * local68 + local59 * local59 + 1.0F)));
					@Pc(87) float local87 = local59 * local83;
					@Pc(91) float local91 = local68 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(102) float local102;
						if (local93 == 0) {
							local102 = -local91;
						} else if (local93 == 1) {
							local102 = local91;
						} else if (local93 == 2) {
							local102 = local87;
						} else if (local93 == 3) {
							local102 = -local87;
						} else if (local93 == 4) {
							local102 = local83;
						} else {
							local102 = -local83;
						}
						@Pc(154) int local154;
						@Pc(153) int local153;
						@Pc(151) int local151;
						if (local102 > 0.0F) {
							local154 = (int) (Math.pow((double) local102, 96.0D) * (double) local28);
							local153 = (int) ((double) local28 * Math.pow((double) local102, 36.0D));
							local151 = (int) (Math.pow((double) local102, 12.0D) * (double) local28);
						} else {
							local151 = 0;
							local153 = 0;
							local154 = 0;
						}
						local36[local93][local42] = (byte) local154;
						local40[local93][local42] = (byte) local153;
						local32[local93][local42] = (byte) local151;
					}
					local42++;
				}
			}
			this.aClass125_Sub2Array1 = new Class125_Sub2[3];
			this.aClass125_Sub2Array1[0] = new Class125_Sub2(super.aClass22_Sub1_43, 6406, 64, false, local36, 6406);
			this.aClass125_Sub2Array1[1] = new Class125_Sub2(super.aClass22_Sub1_43, 6406, 64, false, local40, 6406);
			this.aClass125_Sub2Array1[2] = new Class125_Sub2(super.aClass22_Sub1_43, 6406, 64, false, local32, 6406);
			this.method9544();
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)V")
	@Override
	public void method9536() {
		if (this.aBoolean767) {
			if (!this.aBoolean768) {
				super.aClass22_Sub1_43.method931(2);
				super.aClass22_Sub1_43.method955((Class125) null);
			}
			super.aClass22_Sub1_43.method931(1);
			super.aClass22_Sub1_43.method955((Class125) null);
			super.aClass22_Sub1_43.method931(0);
			this.aClass131_6.method3047('\u0001');
			this.aBoolean767 = false;
		} else {
			super.aClass22_Sub1_43.method963(0, 5890);
		}
		super.aClass22_Sub1_43.method900(8448, 8448);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!rha;II)V")
	@Override
	public void method9535(@OriginalArg(0) Class125 arg0, @OriginalArg(2) int arg1) {
		super.aClass22_Sub1_43.method955(arg0);
		super.aClass22_Sub1_43.method894(arg1);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9539(@OriginalArg(0) boolean arg0) {
		if (this.aClass131_6 == null || !arg0) {
			super.aClass22_Sub1_43.method963(0, 34168);
			return;
		}
		if (!this.aBoolean768) {
			super.aClass22_Sub1_43.method931(2);
			super.aClass22_Sub1_43.method955(super.aClass22_Sub1_43.aClass125_Sub1_1);
			super.aClass22_Sub1_43.method931(0);
		}
		this.aClass131_6.method3047('\u0000');
		this.aBoolean767 = true;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZI)V")
	@Override
	public void method9540(@OriginalArg(0) boolean arg0) {
		super.aClass22_Sub1_43.method900(7681, 8448);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)V")
	private void method9544() {
		this.aClass131_6 = new Class131(super.aClass22_Sub1_43, 2);
		this.aClass131_6.method3046(0);
		super.aClass22_Sub1_43.method931(1);
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
		if (this.aBoolean768) {
			super.aClass22_Sub1_43.method900(7681, 260);
			super.aClass22_Sub1_43.method935(770, 0, 5890);
			super.aClass22_Sub1_43.method963(0, 34167);
		} else {
			super.aClass22_Sub1_43.method900(8448, 7681);
			super.aClass22_Sub1_43.method935(768, 0, 34168);
			super.aClass22_Sub1_43.method931(2);
			super.aClass22_Sub1_43.method900(7681, 260);
			super.aClass22_Sub1_43.method935(768, 0, 34168);
			super.aClass22_Sub1_43.method935(770, 1, 34168);
			super.aClass22_Sub1_43.method963(0, 34167);
		}
		super.aClass22_Sub1_43.method931(0);
		this.aClass131_6.method3048();
		this.aClass131_6.method3046(1);
		super.aClass22_Sub1_43.method931(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean768) {
			super.aClass22_Sub1_43.method900(8448, 8448);
			super.aClass22_Sub1_43.method935(768, 0, 5890);
			super.aClass22_Sub1_43.method963(0, 5890);
		} else {
			super.aClass22_Sub1_43.method900(8448, 8448);
			super.aClass22_Sub1_43.method935(768, 0, 5890);
			super.aClass22_Sub1_43.method931(2);
			super.aClass22_Sub1_43.method900(8448, 8448);
			super.aClass22_Sub1_43.method935(768, 0, 5890);
			super.aClass22_Sub1_43.method935(768, 1, 34168);
			super.aClass22_Sub1_43.method963(0, 5890);
		}
		super.aClass22_Sub1_43.method931(0);
		this.aClass131_6.method3048();
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BII)V")
	@Override
	public void method9534(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean767) {
			super.aClass22_Sub1_43.method931(1);
			super.aClass22_Sub1_43.method955(this.aClass125_Sub2Array1[arg1 - 1]);
			super.aClass22_Sub1_43.method931(0);
		}
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9538() {
		return true;
	}
}
