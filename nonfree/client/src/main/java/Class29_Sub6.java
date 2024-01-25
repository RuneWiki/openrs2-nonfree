import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class29_Sub6 extends Class29 {

	@OriginalMember(owner = "client!kk", name = "m", descriptor = "Lclient!tm;")
	private Class239 aClass239_5;

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "Z")
	private boolean aBoolean277 = false;

	@OriginalMember(owner = "client!kk", name = "r", descriptor = "Z")
	private boolean aBoolean278;

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "[Lclient!dl;")
	private Class4_Sub2[] aClass4_Sub2Array1;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class29_Sub6(@OriginalArg(0) Class50_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean102) {
			this.aBoolean278 = arg0.anInt1416 < 3;
			@Pc(26) int local26 = this.aBoolean278 ? 48 : 127;
			@Pc(30) byte[][] local30 = new byte[6][4096];
			@Pc(34) byte[][] local34 = new byte[6][4096];
			@Pc(38) byte[][] local38 = new byte[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
					@Pc(57) float local57 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local66 * local66 + local57 * local57 + 1.0F)));
					@Pc(85) float local85 = local66 * local81;
					@Pc(89) float local89 = local57 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(101) float local101;
						if (local91 == 0) {
							local101 = -local89;
						} else if (local91 == 1) {
							local101 = local89;
						} else if (local91 == 2) {
							local101 = local85;
						} else if (local91 == 3) {
							local101 = -local85;
						} else if (local91 == 4) {
							local101 = local81;
						} else {
							local101 = -local81;
						}
						@Pc(147) int local147;
						@Pc(146) int local146;
						@Pc(144) int local144;
						if (local101 > 0.0F) {
							local147 = (int) ((double) local26 * Math.pow((double) local101, 96.0D));
							local146 = (int) (Math.pow((double) local101, 36.0D) * (double) local26);
							local144 = (int) ((double) local26 * Math.pow((double) local101, 12.0D));
						} else {
							local144 = 0;
							local146 = 0;
							local147 = 0;
						}
						local34[local91][local40] = (byte) local147;
						local38[local91][local40] = (byte) local146;
						local30[local91][local40] = (byte) local144;
					}
					local40++;
				}
			}
			this.aClass4_Sub2Array1 = new Class4_Sub2[3];
			this.aClass4_Sub2Array1[0] = new Class4_Sub2(super.aClass50_Sub1_37, 6406, 64, false, local34, 6406);
			this.aClass4_Sub2Array1[1] = new Class4_Sub2(super.aClass50_Sub1_37, 6406, 64, false, local38, 6406);
			this.aClass4_Sub2Array1[2] = new Class4_Sub2(super.aClass50_Sub1_37, 6406, 64, false, local30, 6406);
			this.method3289();
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V")
	@Override
	public void method5381() {
		if (this.aBoolean277) {
			if (!this.aBoolean278) {
				super.aClass50_Sub1_37.method1300(2);
				super.aClass50_Sub1_37.method1295(null);
			}
			super.aClass50_Sub1_37.method1300(1);
			super.aClass50_Sub1_37.method1295(null);
			super.aClass50_Sub1_37.method1300(0);
			this.aClass239_5.method5224('\u0001');
			this.aBoolean277 = false;
		} else {
			super.aClass50_Sub1_37.method1275(5890, 0);
		}
		super.aClass50_Sub1_37.method1316(8448, 8448);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5375() {
		return true;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)V")
	@Override
	public void method5378(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean277) {
			super.aClass50_Sub1_37.method1300(1);
			super.aClass50_Sub1_37.method1295(this.aClass4_Sub2Array1[arg0 - 1]);
			super.aClass50_Sub1_37.method1300(0);
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5376(@OriginalArg(0) boolean arg0) {
		if (this.aClass239_5 == null || !arg0) {
			super.aClass50_Sub1_37.method1275(34168, 0);
			return;
		}
		if (!this.aBoolean278) {
			super.aClass50_Sub1_37.method1300(2);
			super.aClass50_Sub1_37.method1295(super.aClass50_Sub1_37.aClass4_Sub1_3);
			super.aClass50_Sub1_37.method1300(0);
		}
		this.aClass239_5.method5224('\u0000');
		this.aBoolean277 = true;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(BZ)V")
	@Override
	public void method5383(@OriginalArg(1) boolean arg0) {
		super.aClass50_Sub1_37.method1316(8448, 7681);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)V")
	private void method3289() {
		this.aClass239_5 = new Class239(super.aClass50_Sub1_37, 2);
		this.aClass239_5.method5221(0);
		super.aClass50_Sub1_37.method1300(1);
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
		if (this.aBoolean278) {
			super.aClass50_Sub1_37.method1316(260, 7681);
			super.aClass50_Sub1_37.method1309(0, 5890, 770);
			super.aClass50_Sub1_37.method1275(34167, 0);
		} else {
			super.aClass50_Sub1_37.method1316(7681, 8448);
			super.aClass50_Sub1_37.method1309(0, 34168, 768);
			super.aClass50_Sub1_37.method1300(2);
			super.aClass50_Sub1_37.method1316(260, 7681);
			super.aClass50_Sub1_37.method1309(0, 34168, 768);
			super.aClass50_Sub1_37.method1309(1, 34168, 770);
			super.aClass50_Sub1_37.method1275(34167, 0);
		}
		super.aClass50_Sub1_37.method1300(0);
		this.aClass239_5.method5222();
		this.aClass239_5.method5221(1);
		super.aClass50_Sub1_37.method1300(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean278) {
			super.aClass50_Sub1_37.method1316(8448, 8448);
			super.aClass50_Sub1_37.method1309(0, 5890, 768);
			super.aClass50_Sub1_37.method1275(5890, 0);
		} else {
			super.aClass50_Sub1_37.method1316(8448, 8448);
			super.aClass50_Sub1_37.method1309(0, 5890, 768);
			super.aClass50_Sub1_37.method1300(2);
			super.aClass50_Sub1_37.method1316(8448, 8448);
			super.aClass50_Sub1_37.method1309(0, 5890, 768);
			super.aClass50_Sub1_37.method1309(1, 34168, 768);
			super.aClass50_Sub1_37.method1275(5890, 0);
		}
		super.aClass50_Sub1_37.method1300(0);
		this.aClass239_5.method5222();
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IILclient!ac;)V")
	@Override
	public void method5382(@OriginalArg(0) int arg0, @OriginalArg(2) Class4 arg1) {
		super.aClass50_Sub1_37.method1295(arg1);
		super.aClass50_Sub1_37.method1256(arg0);
	}
}
