import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class38_Sub4 extends Class38 {

	@OriginalMember(owner = "client!l", name = "p", descriptor = "Lclient!pba;")
	private Class264 aClass264_5;

	@OriginalMember(owner = "client!l", name = "g", descriptor = "Z")
	private boolean aBoolean397 = false;

	@OriginalMember(owner = "client!l", name = "i", descriptor = "Z")
	private boolean aBoolean398;

	@OriginalMember(owner = "client!l", name = "q", descriptor = "[Lclient!efa;")
	private Class85_Sub1[] aClass85_Sub1Array1;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!dia;)V")
	public Class38_Sub4(@OriginalArg(0) Class13_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean182) {
			this.aBoolean398 = arg0.anInt2175 < 3;
			@Pc(26) int local26 = this.aBoolean398 ? 48 : 127;
			@Pc(30) byte[][] local30 = new byte[6][4096];
			@Pc(34) byte[][] local34 = new byte[6][4096];
			@Pc(38) byte[][] local38 = new byte[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(45) int local45 = 0; local45 < 64; local45++) {
					@Pc(55) float local55 = (float) local45 * 2.0F / 64.0F - 1.0F;
					@Pc(64) float local64 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(79) float local79 = (float) (1.0D / Math.sqrt((double) (local55 * local55 + local64 * local64 + 1.0F)));
					@Pc(83) float local83 = local55 * local79;
					@Pc(87) float local87 = local64 * local79;
					for (@Pc(89) int local89 = 0; local89 < 6; local89++) {
						@Pc(99) float local99;
						if (local89 == 0) {
							local99 = -local83;
						} else if (local89 == 1) {
							local99 = local83;
						} else if (local89 == 2) {
							local99 = local87;
						} else if (local89 == 3) {
							local99 = -local87;
						} else if (local89 == 4) {
							local99 = local79;
						} else {
							local99 = -local79;
						}
						@Pc(140) int local140;
						@Pc(139) int local139;
						@Pc(137) int local137;
						if (local99 > 0.0F) {
							local140 = (int) ((double) local26 * Math.pow((double) local99, 96.0D));
							local139 = (int) ((double) local26 * Math.pow((double) local99, 36.0D));
							local137 = (int) ((double) local26 * Math.pow((double) local99, 12.0D));
						} else {
							local137 = 0;
							local139 = 0;
							local140 = 0;
						}
						local34[local89][local40] = (byte) local140;
						local38[local89][local40] = (byte) local139;
						local30[local89][local40] = (byte) local137;
					}
					local40++;
				}
			}
			this.aClass85_Sub1Array1 = new Class85_Sub1[3];
			this.aClass85_Sub1Array1[0] = new Class85_Sub1(super.aClass13_Sub2_39, 6406, 64, false, local34, 6406);
			this.aClass85_Sub1Array1[1] = new Class85_Sub1(super.aClass13_Sub2_39, 6406, 64, false, local38, 6406);
			this.aClass85_Sub1Array1[2] = new Class85_Sub1(super.aClass13_Sub2_39, 6406, 64, false, local30, 6406);
			this.method4984();
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7818() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!il;I)V")
	@Override
	public void method7810(@OriginalArg(1) Class85 arg0, @OriginalArg(2) int arg1) {
		super.aClass13_Sub2_39.method2024(arg0);
		super.aClass13_Sub2_39.method1960(arg1);
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V")
	private void method4984() {
		this.aClass264_5 = new Class264(super.aClass13_Sub2_39, 2);
		this.aClass264_5.method6556(0);
		super.aClass13_Sub2_39.method2008(1);
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
		if (this.aBoolean398) {
			super.aClass13_Sub2_39.method1993(7681, 260);
			super.aClass13_Sub2_39.method2012(5890, 770, 0);
			super.aClass13_Sub2_39.method2028(0, 34167);
		} else {
			super.aClass13_Sub2_39.method1993(8448, 7681);
			super.aClass13_Sub2_39.method2012(34168, 768, 0);
			super.aClass13_Sub2_39.method2008(2);
			super.aClass13_Sub2_39.method1993(7681, 260);
			super.aClass13_Sub2_39.method2012(34168, 768, 0);
			super.aClass13_Sub2_39.method2012(34168, 770, 1);
			super.aClass13_Sub2_39.method2028(0, 34167);
		}
		super.aClass13_Sub2_39.method2008(0);
		this.aClass264_5.method6558();
		this.aClass264_5.method6556(1);
		super.aClass13_Sub2_39.method2008(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean398) {
			super.aClass13_Sub2_39.method1993(8448, 8448);
			super.aClass13_Sub2_39.method2012(5890, 768, 0);
			super.aClass13_Sub2_39.method2028(0, 5890);
		} else {
			super.aClass13_Sub2_39.method1993(8448, 8448);
			super.aClass13_Sub2_39.method2012(5890, 768, 0);
			super.aClass13_Sub2_39.method2008(2);
			super.aClass13_Sub2_39.method1993(8448, 8448);
			super.aClass13_Sub2_39.method2012(5890, 768, 0);
			super.aClass13_Sub2_39.method2012(34168, 768, 1);
			super.aClass13_Sub2_39.method2028(0, 5890);
		}
		super.aClass13_Sub2_39.method2008(0);
		this.aClass264_5.method6558();
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V")
	@Override
	public void method7819() {
		if (this.aBoolean397) {
			if (!this.aBoolean398) {
				super.aClass13_Sub2_39.method2008(2);
				super.aClass13_Sub2_39.method2024((Class85) null);
			}
			super.aClass13_Sub2_39.method2008(1);
			super.aClass13_Sub2_39.method2024((Class85) null);
			super.aClass13_Sub2_39.method2008(0);
			this.aClass264_5.method6557('\u0001');
			this.aBoolean397 = false;
		} else {
			super.aClass13_Sub2_39.method2028(0, 5890);
		}
		super.aClass13_Sub2_39.method1993(8448, 8448);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(III)V")
	@Override
	public void method7814(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean397) {
			super.aClass13_Sub2_39.method2008(1);
			super.aClass13_Sub2_39.method2024(this.aClass85_Sub1Array1[arg0 - 1]);
			super.aClass13_Sub2_39.method2008(0);
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(ZZ)V")
	@Override
	public void method7812(@OriginalArg(0) boolean arg0) {
		if (this.aClass264_5 == null || !arg0) {
			super.aClass13_Sub2_39.method2028(0, 34168);
			return;
		}
		if (!this.aBoolean398) {
			super.aClass13_Sub2_39.method2008(2);
			super.aClass13_Sub2_39.method2024(super.aClass13_Sub2_39.aClass85_Sub3_3);
			super.aClass13_Sub2_39.method2008(0);
		}
		this.aClass264_5.method6557('\u0000');
		this.aBoolean397 = true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7813(@OriginalArg(1) boolean arg0) {
		super.aClass13_Sub2_39.method1993(7681, 8448);
	}
}
