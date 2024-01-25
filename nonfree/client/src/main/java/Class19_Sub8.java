import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class19_Sub8 extends Class19 {

	@OriginalMember(owner = "client!mn", name = "m", descriptor = "Lclient!ee;")
	private Class93 aClass93_5;

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "Z")
	private boolean aBoolean468 = false;

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "Z")
	private boolean aBoolean467;

	@OriginalMember(owner = "client!mn", name = "k", descriptor = "[Lclient!mu;")
	private Class44_Sub3[] aClass44_Sub3Array1;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class19_Sub8(@OriginalArg(0) Class143_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean416) {
			this.aBoolean467 = arg0.anInt5834 < 3;
			@Pc(26) int local26 = this.aBoolean467 ? 48 : 127;
			@Pc(30) byte[][] local30 = new byte[6][4096];
			@Pc(34) byte[][] local34 = new byte[6][4096];
			@Pc(38) byte[][] local38 = new byte[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(45) int local45 = 0; local45 < 64; local45++) {
					@Pc(55) float local55 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(64) float local64 = (float) local45 * 2.0F / 64.0F - 1.0F;
					@Pc(79) float local79 = (float) (1.0D / Math.sqrt((double) (local55 * local55 + local64 * local64 + 1.0F)));
					@Pc(83) float local83 = local64 * local79;
					@Pc(87) float local87 = local55 * local79;
					for (@Pc(89) int local89 = 0; local89 < 6; local89++) {
						@Pc(98) float local98;
						if (local89 == 0) {
							local98 = -local83;
						} else if (local89 == 1) {
							local98 = local83;
						} else if (local89 == 2) {
							local98 = local87;
						} else if (local89 == 3) {
							local98 = -local87;
						} else if (local89 == 4) {
							local98 = local79;
						} else {
							local98 = -local79;
						}
						@Pc(146) int local146;
						@Pc(155) int local155;
						@Pc(164) int local164;
						if (local98 > 0.0F) {
							local146 = (int) (Math.pow((double) local98, 96.0D) * (double) local26);
							local155 = (int) ((double) local26 * Math.pow((double) local98, 36.0D));
							local164 = (int) ((double) local26 * Math.pow((double) local98, 12.0D));
						} else {
							local164 = 0;
							local155 = 0;
							local146 = 0;
						}
						local34[local89][local40] = (byte) local146;
						local38[local89][local40] = (byte) local155;
						local30[local89][local40] = (byte) local164;
					}
					local40++;
				}
			}
			this.aClass44_Sub3Array1 = new Class44_Sub3[3];
			this.aClass44_Sub3Array1[0] = new Class44_Sub3(super.aClass143_Sub2_39, 6406, 64, false, local34, 6406);
			this.aClass44_Sub3Array1[1] = new Class44_Sub3(super.aClass143_Sub2_39, 6406, 64, false, local38, 6406);
			this.aClass44_Sub3Array1[2] = new Class44_Sub3(super.aClass143_Sub2_39, 6406, 64, false, local30, 6406);
			this.method5529();
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!fia;IZ)V")
	@Override
	public void method7873(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1) {
		super.aClass143_Sub2_39.method4945(arg0);
		super.aClass143_Sub2_39.method4994(arg1);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7875(@OriginalArg(0) boolean arg0) {
		if (this.aClass93_5 == null || !arg0) {
			super.aClass143_Sub2_39.method4933(34168, 0);
			return;
		}
		if (!this.aBoolean467) {
			super.aClass143_Sub2_39.method4930(2);
			super.aClass143_Sub2_39.method4945(super.aClass143_Sub2_39.aClass44_Sub1_6);
			super.aClass143_Sub2_39.method4930(0);
		}
		this.aClass93_5.method1952('\u0000');
		this.aBoolean468 = true;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7874() {
		return true;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7872(@OriginalArg(0) boolean arg0) {
		super.aClass143_Sub2_39.method4940(8448, 7681);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V")
	@Override
	public void method7871() {
		if (this.aBoolean468) {
			if (!this.aBoolean467) {
				super.aClass143_Sub2_39.method4930(2);
				super.aClass143_Sub2_39.method4945((Class44) null);
			}
			super.aClass143_Sub2_39.method4930(1);
			super.aClass143_Sub2_39.method4945((Class44) null);
			super.aClass143_Sub2_39.method4930(0);
			this.aClass93_5.method1952('\u0001');
			this.aBoolean468 = false;
		} else {
			super.aClass143_Sub2_39.method4933(5890, 0);
		}
		super.aClass143_Sub2_39.method4940(8448, 8448);
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(B)V")
	private void method5529() {
		this.aClass93_5 = new Class93(super.aClass143_Sub2_39, 2);
		this.aClass93_5.method1950(0);
		super.aClass143_Sub2_39.method4930(1);
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
		if (this.aBoolean467) {
			super.aClass143_Sub2_39.method4940(260, 7681);
			super.aClass143_Sub2_39.method4947(770, 0, 5890);
			super.aClass143_Sub2_39.method4933(34167, 0);
		} else {
			super.aClass143_Sub2_39.method4940(7681, 8448);
			super.aClass143_Sub2_39.method4947(768, 0, 34168);
			super.aClass143_Sub2_39.method4930(2);
			super.aClass143_Sub2_39.method4940(260, 7681);
			super.aClass143_Sub2_39.method4947(768, 0, 34168);
			super.aClass143_Sub2_39.method4947(770, 1, 34168);
			super.aClass143_Sub2_39.method4933(34167, 0);
		}
		super.aClass143_Sub2_39.method4930(0);
		this.aClass93_5.method1948();
		this.aClass93_5.method1950(1);
		super.aClass143_Sub2_39.method4930(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean467) {
			super.aClass143_Sub2_39.method4940(8448, 8448);
			super.aClass143_Sub2_39.method4947(768, 0, 5890);
			super.aClass143_Sub2_39.method4933(5890, 0);
		} else {
			super.aClass143_Sub2_39.method4940(8448, 8448);
			super.aClass143_Sub2_39.method4947(768, 0, 5890);
			super.aClass143_Sub2_39.method4930(2);
			super.aClass143_Sub2_39.method4940(8448, 8448);
			super.aClass143_Sub2_39.method4947(768, 0, 5890);
			super.aClass143_Sub2_39.method4947(768, 1, 34168);
			super.aClass143_Sub2_39.method4933(5890, 0);
		}
		super.aClass143_Sub2_39.method4930(0);
		this.aClass93_5.method1948();
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(III)V")
	@Override
	public void method7876(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean468) {
			super.aClass143_Sub2_39.method4930(1);
			super.aClass143_Sub2_39.method4945(this.aClass44_Sub3Array1[arg0 - 1]);
			super.aClass143_Sub2_39.method4930(0);
		}
	}
}
