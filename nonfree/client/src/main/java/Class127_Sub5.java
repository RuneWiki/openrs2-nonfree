import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mca")
public final class Class127_Sub5 extends Class127 {

	@OriginalMember(owner = "client!mca", name = "i", descriptor = "Lclient!tw;")
	private Class329 aClass329_3;

	@OriginalMember(owner = "client!mca", name = "j", descriptor = "Z")
	private boolean aBoolean484 = false;

	@OriginalMember(owner = "client!mca", name = "o", descriptor = "Z")
	private boolean aBoolean485;

	@OriginalMember(owner = "client!mca", name = "w", descriptor = "[Lclient!dm;")
	private Class76_Sub1[] aClass76_Sub1Array1;

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(Lclient!kw;)V")
	public Class127_Sub5(@OriginalArg(0) Class5_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean382) {
			this.aBoolean485 = arg0.anInt5668 < 3;
			@Pc(26) int local26 = this.aBoolean485 ? 48 : 127;
			@Pc(30) byte[][] local30 = new byte[6][4096];
			@Pc(34) byte[][] local34 = new byte[6][4096];
			@Pc(38) byte[][] local38 = new byte[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
					@Pc(57) float local57 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local57 * local57 + local66 * local66 + 1.0F)));
					@Pc(85) float local85 = local57 * local81;
					@Pc(89) float local89 = local66 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(98) float local98;
						if (local91 == 0) {
							local98 = -local85;
						} else if (local91 == 1) {
							local98 = local85;
						} else if (local91 == 2) {
							local98 = local89;
						} else if (local91 == 3) {
							local98 = -local89;
						} else if (local91 == 4) {
							local98 = local81;
						} else {
							local98 = -local81;
						}
						@Pc(147) int local147;
						@Pc(156) int local156;
						@Pc(165) int local165;
						if (local98 > 0.0F) {
							local147 = (int) (Math.pow((double) local98, 96.0D) * (double) local26);
							local156 = (int) (Math.pow((double) local98, 36.0D) * (double) local26);
							local165 = (int) ((double) local26 * Math.pow((double) local98, 12.0D));
						} else {
							local165 = 0;
							local156 = 0;
							local147 = 0;
						}
						local34[local91][local40] = (byte) local147;
						local38[local91][local40] = (byte) local156;
						local30[local91][local40] = (byte) local165;
					}
					local40++;
				}
			}
			this.aClass76_Sub1Array1 = new Class76_Sub1[3];
			this.aClass76_Sub1Array1[0] = new Class76_Sub1(super.aClass5_Sub2_42, 6406, 64, false, local34, 6406);
			this.aClass76_Sub1Array1[1] = new Class76_Sub1(super.aClass5_Sub2_42, 6406, 64, false, local38, 6406);
			this.aClass76_Sub1Array1[2] = new Class76_Sub1(super.aClass5_Sub2_42, 6406, 64, false, local30, 6406);
			this.method5722();
		}
	}

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8458(@OriginalArg(1) boolean arg0) {
		if (this.aClass329_3 == null || !arg0) {
			super.aClass5_Sub2_42.method4969(34168, 0);
			return;
		}
		if (!this.aBoolean485) {
			super.aClass5_Sub2_42.method5004(2);
			super.aClass5_Sub2_42.method4997(super.aClass5_Sub2_42.aClass76_Sub3_2);
			super.aClass5_Sub2_42.method5004(0);
		}
		this.aClass329_3.method8098('\u0000');
		this.aBoolean484 = true;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8457(@OriginalArg(0) boolean arg0) {
		super.aClass5_Sub2_42.method4982(7681, 8448);
	}

	@OriginalMember(owner = "client!mca", name = "c", descriptor = "(B)V")
	private void method5722() {
		this.aClass329_3 = new Class329(super.aClass5_Sub2_42, 2);
		this.aClass329_3.method8097(0);
		super.aClass5_Sub2_42.method5004(1);
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
		if (this.aBoolean485) {
			super.aClass5_Sub2_42.method4982(7681, 260);
			super.aClass5_Sub2_42.method5000(5890, 770, 0);
			super.aClass5_Sub2_42.method4969(34167, 0);
		} else {
			super.aClass5_Sub2_42.method4982(8448, 7681);
			super.aClass5_Sub2_42.method5000(34168, 768, 0);
			super.aClass5_Sub2_42.method5004(2);
			super.aClass5_Sub2_42.method4982(7681, 260);
			super.aClass5_Sub2_42.method5000(34168, 768, 0);
			super.aClass5_Sub2_42.method5000(34168, 770, 1);
			super.aClass5_Sub2_42.method4969(34167, 0);
		}
		super.aClass5_Sub2_42.method5004(0);
		this.aClass329_3.method8094();
		this.aClass329_3.method8097(1);
		super.aClass5_Sub2_42.method5004(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean485) {
			super.aClass5_Sub2_42.method4982(8448, 8448);
			super.aClass5_Sub2_42.method5000(5890, 768, 0);
			super.aClass5_Sub2_42.method4969(5890, 0);
		} else {
			super.aClass5_Sub2_42.method4982(8448, 8448);
			super.aClass5_Sub2_42.method5000(5890, 768, 0);
			super.aClass5_Sub2_42.method5004(2);
			super.aClass5_Sub2_42.method4982(8448, 8448);
			super.aClass5_Sub2_42.method5000(5890, 768, 0);
			super.aClass5_Sub2_42.method5000(34168, 768, 1);
			super.aClass5_Sub2_42.method4969(5890, 0);
		}
		super.aClass5_Sub2_42.method5004(0);
		this.aClass329_3.method8094();
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8453(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean484) {
			super.aClass5_Sub2_42.method5004(1);
			super.aClass5_Sub2_42.method4997(this.aClass76_Sub1Array1[arg1 - 1]);
			super.aClass5_Sub2_42.method5004(0);
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lclient!ou;II)V")
	@Override
	public void method8460(@OriginalArg(0) Class76 arg0, @OriginalArg(2) int arg1) {
		super.aClass5_Sub2_42.method4997(arg0);
		super.aClass5_Sub2_42.method4953(arg1);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8456() {
		return true;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)V")
	@Override
	public void method8454() {
		if (this.aBoolean484) {
			if (!this.aBoolean485) {
				super.aClass5_Sub2_42.method5004(2);
				super.aClass5_Sub2_42.method4997(null);
			}
			super.aClass5_Sub2_42.method5004(1);
			super.aClass5_Sub2_42.method4997(null);
			super.aClass5_Sub2_42.method5004(0);
			this.aClass329_3.method8098('\u0001');
			this.aBoolean484 = false;
		} else {
			super.aClass5_Sub2_42.method4969(5890, 0);
		}
		super.aClass5_Sub2_42.method4982(8448, 8448);
	}
}
