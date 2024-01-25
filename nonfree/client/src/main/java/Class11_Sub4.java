import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class11_Sub4 extends Class11 {

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "Lclient!up;")
	private Class358 aClass358_4;

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "Z")
	private boolean aBoolean207 = false;

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "Z")
	private boolean aBoolean208;

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "[Lclient!jka;")
	private Class53_Sub3[] aClass53_Sub3Array1;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!pq;)V")
	public Class11_Sub4(@OriginalArg(0) Class132_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean536) {
			this.aBoolean208 = arg0.anInt7895 < 3;
			@Pc(26) int local26 = this.aBoolean208 ? 48 : 127;
			@Pc(30) byte[][] local30 = new byte[6][4096];
			@Pc(34) byte[][] local34 = new byte[6][4096];
			@Pc(38) byte[][] local38 = new byte[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
					@Pc(57) float local57 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local57 * local57 + local66 * local66 + 1.0F)));
					@Pc(85) float local85 = local66 * local81;
					@Pc(89) float local89 = local57 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(101) float local101;
						if (local91 == 0) {
							local101 = -local85;
						} else if (local91 == 1) {
							local101 = local85;
						} else if (local91 == 2) {
							local101 = local89;
						} else if (local91 == 3) {
							local101 = -local89;
						} else if (local91 == 4) {
							local101 = local81;
						} else {
							local101 = -local81;
						}
						@Pc(156) int local156;
						@Pc(165) int local165;
						@Pc(174) int local174;
						if (local101 > 0.0F) {
							local156 = (int) (Math.pow((double) local101, 96.0D) * (double) local26);
							local165 = (int) ((double) local26 * Math.pow((double) local101, 36.0D));
							local174 = (int) ((double) local26 * Math.pow((double) local101, 12.0D));
						} else {
							local174 = 0;
							local165 = 0;
							local156 = 0;
						}
						local34[local91][local40] = (byte) local156;
						local38[local91][local40] = (byte) local165;
						local30[local91][local40] = (byte) local174;
					}
					local40++;
				}
			}
			this.aClass53_Sub3Array1 = new Class53_Sub3[3];
			this.aClass53_Sub3Array1[0] = new Class53_Sub3(super.aClass132_Sub3_43, 6406, 64, false, local34, 6406);
			this.aClass53_Sub3Array1[1] = new Class53_Sub3(super.aClass132_Sub3_43, 6406, 64, false, local38, 6406);
			this.aClass53_Sub3Array1[2] = new Class53_Sub3(super.aClass132_Sub3_43, 6406, 64, false, local30, 6406);
			this.method3043();
		}
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V")
	private void method3043() {
		this.aClass358_4 = new Class358(super.aClass132_Sub3_43, 2);
		this.aClass358_4.method8419(0);
		super.aClass132_Sub3_43.method6802(1);
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
		if (this.aBoolean208) {
			super.aClass132_Sub3_43.method6770(7681, 260);
			super.aClass132_Sub3_43.method6763(0, 770, 5890);
			super.aClass132_Sub3_43.method6760(34167, 0);
		} else {
			super.aClass132_Sub3_43.method6770(8448, 7681);
			super.aClass132_Sub3_43.method6763(0, 768, 34168);
			super.aClass132_Sub3_43.method6802(2);
			super.aClass132_Sub3_43.method6770(7681, 260);
			super.aClass132_Sub3_43.method6763(0, 768, 34168);
			super.aClass132_Sub3_43.method6763(1, 770, 34168);
			super.aClass132_Sub3_43.method6760(34167, 0);
		}
		super.aClass132_Sub3_43.method6802(0);
		this.aClass358_4.method8417();
		this.aClass358_4.method8419(1);
		super.aClass132_Sub3_43.method6802(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean208) {
			super.aClass132_Sub3_43.method6770(8448, 8448);
			super.aClass132_Sub3_43.method6763(0, 768, 5890);
			super.aClass132_Sub3_43.method6760(5890, 0);
		} else {
			super.aClass132_Sub3_43.method6770(8448, 8448);
			super.aClass132_Sub3_43.method6763(0, 768, 5890);
			super.aClass132_Sub3_43.method6802(2);
			super.aClass132_Sub3_43.method6770(8448, 8448);
			super.aClass132_Sub3_43.method6763(0, 768, 5890);
			super.aClass132_Sub3_43.method6763(1, 768, 34168);
			super.aClass132_Sub3_43.method6760(5890, 0);
		}
		super.aClass132_Sub3_43.method6802(0);
		this.aClass358_4.method8417();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZLclient!wha;)V")
	@Override
	public void method8983(@OriginalArg(0) int arg0, @OriginalArg(2) Class53 arg1) {
		super.aClass132_Sub3_43.method6759(arg1);
		super.aClass132_Sub3_43.method6803(arg0);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8989(@OriginalArg(0) boolean arg0) {
		super.aClass132_Sub3_43.method6770(7681, 8448);
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8991() {
		return true;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean207) {
			super.aClass132_Sub3_43.method6802(1);
			super.aClass132_Sub3_43.method6759(this.aClass53_Sub3Array1[arg1 - 1]);
			super.aClass132_Sub3_43.method6802(0);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	@Override
	public void method8982() {
		if (this.aBoolean207) {
			if (!this.aBoolean208) {
				super.aClass132_Sub3_43.method6802(2);
				super.aClass132_Sub3_43.method6759((Class53) null);
			}
			super.aClass132_Sub3_43.method6802(1);
			super.aClass132_Sub3_43.method6759((Class53) null);
			super.aClass132_Sub3_43.method6802(0);
			this.aClass358_4.method8418('\u0001');
			this.aBoolean207 = false;
		} else {
			super.aClass132_Sub3_43.method6760(5890, 0);
		}
		super.aClass132_Sub3_43.method6770(8448, 8448);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8984(@OriginalArg(1) boolean arg0) {
		if (this.aClass358_4 == null || !arg0) {
			super.aClass132_Sub3_43.method6760(34168, 0);
			return;
		}
		if (!this.aBoolean208) {
			super.aClass132_Sub3_43.method6802(2);
			super.aClass132_Sub3_43.method6759(super.aClass132_Sub3_43.aClass53_Sub2_6);
			super.aClass132_Sub3_43.method6802(0);
		}
		this.aClass358_4.method8418('\u0000');
		this.aBoolean207 = true;
	}
}
