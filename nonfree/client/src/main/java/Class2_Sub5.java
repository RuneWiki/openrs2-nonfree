import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!kk", name = "r", descriptor = "Lclient!gs;")
	private Class98 aClass98_3;

	@OriginalMember(owner = "client!kk", name = "v", descriptor = "Z")
	private boolean aBoolean298 = false;

	@OriginalMember(owner = "client!kk", name = "m", descriptor = "Z")
	private boolean aBoolean297;

	@OriginalMember(owner = "client!kk", name = "p", descriptor = "[Lclient!lr;")
	private Class1_Sub2[] aClass1_Sub2Array1;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!bv;)V")
	public Class2_Sub5(@OriginalArg(0) Class30_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean78) {
			this.aBoolean297 = arg0.anInt1272 < 3;
			@Pc(26) int local26 = this.aBoolean297 ? 48 : 127;
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
						@Pc(115) float local115;
						if (local91 == 0) {
							local115 = -local85;
						} else if (local91 == 1) {
							local115 = local85;
						} else if (local91 == 2) {
							local115 = local89;
						} else if (local91 == 3) {
							local115 = -local89;
						} else if (local91 == 4) {
							local115 = local81;
						} else {
							local115 = -local81;
						}
						@Pc(151) int local151;
						@Pc(160) int local160;
						@Pc(169) int local169;
						if (local115 > 0.0F) {
							local151 = (int) (Math.pow((double) local115, 96.0D) * (double) local26);
							local160 = (int) (Math.pow((double) local115, 36.0D) * (double) local26);
							local169 = (int) (Math.pow((double) local115, 12.0D) * (double) local26);
						} else {
							local169 = 0;
							local160 = 0;
							local151 = 0;
						}
						local34[local91][local40] = (byte) local151;
						local38[local91][local40] = (byte) local160;
						local30[local91][local40] = (byte) local169;
					}
					local40++;
				}
			}
			this.aClass1_Sub2Array1 = new Class1_Sub2[3];
			this.aClass1_Sub2Array1[0] = new Class1_Sub2(super.aClass30_Sub1_42, 6406, 64, false, local34, 6406);
			this.aClass1_Sub2Array1[1] = new Class1_Sub2(super.aClass30_Sub1_42, 6406, 64, false, local38, 6406);
			this.aClass1_Sub2Array1[2] = new Class1_Sub2(super.aClass30_Sub1_42, 6406, 64, false, local30, 6406);
			this.method2985();
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)V")
	@Override
	public void method5385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean298) {
			super.aClass30_Sub1_42.method948(1);
			super.aClass30_Sub1_42.method916(this.aClass1_Sub2Array1[arg1 - 1]);
			super.aClass30_Sub1_42.method948(0);
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(ZI)V")
	@Override
	public void method5386(@OriginalArg(0) boolean arg0) {
		if (this.aClass98_3 == null || !arg0) {
			super.aClass30_Sub1_42.method954(0, 34168);
			return;
		}
		if (!this.aBoolean297) {
			super.aClass30_Sub1_42.method948(2);
			super.aClass30_Sub1_42.method916(super.aClass30_Sub1_42.aClass1_Sub3_1);
			super.aClass30_Sub1_42.method948(0);
		}
		this.aClass98_3.method2005('\u0000');
		this.aBoolean298 = true;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IILclient!kv;)V")
	@Override
	public void method5382(@OriginalArg(0) int arg0, @OriginalArg(2) Class1 arg1) {
		super.aClass30_Sub1_42.method916(arg1);
		super.aClass30_Sub1_42.method923(arg0);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
	@Override
	public void method5384() {
		if (this.aBoolean298) {
			if (!this.aBoolean297) {
				super.aClass30_Sub1_42.method948(2);
				super.aClass30_Sub1_42.method916(null);
			}
			super.aClass30_Sub1_42.method948(1);
			super.aClass30_Sub1_42.method916(null);
			super.aClass30_Sub1_42.method948(0);
			this.aClass98_3.method2005('\u0001');
			this.aBoolean298 = false;
		} else {
			super.aClass30_Sub1_42.method954(0, 5890);
		}
		super.aClass30_Sub1_42.method905(8448, 8448);
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V")
	private void method2985() {
		this.aClass98_3 = new Class98(super.aClass30_Sub1_42, 2);
		this.aClass98_3.method2003(0);
		super.aClass30_Sub1_42.method948(1);
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
		if (this.aBoolean297) {
			super.aClass30_Sub1_42.method905(7681, 260);
			super.aClass30_Sub1_42.method957(5890, 770, 0);
			super.aClass30_Sub1_42.method954(0, 34167);
		} else {
			super.aClass30_Sub1_42.method905(8448, 7681);
			super.aClass30_Sub1_42.method957(34168, 768, 0);
			super.aClass30_Sub1_42.method948(2);
			super.aClass30_Sub1_42.method905(7681, 260);
			super.aClass30_Sub1_42.method957(34168, 768, 0);
			super.aClass30_Sub1_42.method957(34168, 770, 1);
			super.aClass30_Sub1_42.method954(0, 34167);
		}
		super.aClass30_Sub1_42.method948(0);
		this.aClass98_3.method2004();
		this.aClass98_3.method2003(1);
		super.aClass30_Sub1_42.method948(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean297) {
			super.aClass30_Sub1_42.method905(8448, 8448);
			super.aClass30_Sub1_42.method957(5890, 768, 0);
			super.aClass30_Sub1_42.method954(0, 5890);
		} else {
			super.aClass30_Sub1_42.method905(8448, 8448);
			super.aClass30_Sub1_42.method957(5890, 768, 0);
			super.aClass30_Sub1_42.method948(2);
			super.aClass30_Sub1_42.method905(8448, 8448);
			super.aClass30_Sub1_42.method957(5890, 768, 0);
			super.aClass30_Sub1_42.method957(34168, 768, 1);
			super.aClass30_Sub1_42.method954(0, 5890);
		}
		super.aClass30_Sub1_42.method948(0);
		this.aClass98_3.method2004();
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5383(@OriginalArg(0) boolean arg0) {
		super.aClass30_Sub1_42.method905(7681, 8448);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5380() {
		return true;
	}
}
