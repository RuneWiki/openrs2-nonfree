import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class56_Sub7 extends Class56 {

	@OriginalMember(owner = "client!qs", name = "l", descriptor = "Lclient!ub;")
	private Class291 aClass291_5;

	@OriginalMember(owner = "client!qs", name = "m", descriptor = "Z")
	private boolean aBoolean518 = false;

	@OriginalMember(owner = "client!qs", name = "p", descriptor = "Z")
	private boolean aBoolean519;

	@OriginalMember(owner = "client!qs", name = "o", descriptor = "[Lclient!vda;")
	private Class11_Sub4[] aClass11_Sub4Array1;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!ad;)V")
	public Class56_Sub7(@OriginalArg(0) Class5_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean20) {
			this.aBoolean519 = arg0.anInt396 < 3;
			@Pc(26) int local26 = this.aBoolean519 ? 48 : 127;
			@Pc(30) byte[][] local30 = new byte[6][4096];
			@Pc(34) byte[][] local34 = new byte[6][4096];
			@Pc(38) byte[][] local38 = new byte[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
					@Pc(57) float local57 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local57 * local57 + local66 * local66 + 1.0F)));
					@Pc(85) float local85 = local66 * local81;
					@Pc(89) float local89 = local57 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(105) float local105;
						if (local91 == 0) {
							local105 = -local89;
						} else if (local91 == 1) {
							local105 = local89;
						} else if (local91 == 2) {
							local105 = local85;
						} else if (local91 == 3) {
							local105 = -local85;
						} else if (local91 == 4) {
							local105 = local81;
						} else {
							local105 = -local81;
						}
						@Pc(146) int local146;
						@Pc(145) int local145;
						@Pc(143) int local143;
						if (local105 > 0.0F) {
							local146 = (int) ((double) local26 * Math.pow((double) local105, 96.0D));
							local145 = (int) (Math.pow((double) local105, 36.0D) * (double) local26);
							local143 = (int) ((double) local26 * Math.pow((double) local105, 12.0D));
						} else {
							local143 = 0;
							local145 = 0;
							local146 = 0;
						}
						local34[local91][local40] = (byte) local146;
						local38[local91][local40] = (byte) local145;
						local30[local91][local40] = (byte) local143;
					}
					local40++;
				}
			}
			this.aClass11_Sub4Array1 = new Class11_Sub4[3];
			this.aClass11_Sub4Array1[0] = new Class11_Sub4(super.aClass5_Sub1_39, 6406, 64, false, local34, 6406);
			this.aClass11_Sub4Array1[1] = new Class11_Sub4(super.aClass5_Sub1_39, 6406, 64, false, local38, 6406);
			this.aClass11_Sub4Array1[2] = new Class11_Sub4(super.aClass5_Sub1_39, 6406, 64, false, local30, 6406);
			this.method6147();
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IILclient!pm;)V")
	@Override
	public void method7139(@OriginalArg(0) int arg0, @OriginalArg(2) Class11 arg1) {
		super.aClass5_Sub1_39.method423(arg1);
		super.aClass5_Sub1_39.method416(arg0);
	}

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "(I)V")
	private void method6147() {
		this.aClass291_5 = new Class291(super.aClass5_Sub1_39, 2);
		this.aClass291_5.method7121(0);
		super.aClass5_Sub1_39.method397(1);
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
		if (this.aBoolean519) {
			super.aClass5_Sub1_39.method448(7681, 260);
			super.aClass5_Sub1_39.method419(5890, 0, 770);
			super.aClass5_Sub1_39.method461(34167, 0);
		} else {
			super.aClass5_Sub1_39.method448(8448, 7681);
			super.aClass5_Sub1_39.method419(34168, 0, 768);
			super.aClass5_Sub1_39.method397(2);
			super.aClass5_Sub1_39.method448(7681, 260);
			super.aClass5_Sub1_39.method419(34168, 0, 768);
			super.aClass5_Sub1_39.method419(34168, 1, 770);
			super.aClass5_Sub1_39.method461(34167, 0);
		}
		super.aClass5_Sub1_39.method397(0);
		this.aClass291_5.method7124();
		this.aClass291_5.method7121(1);
		super.aClass5_Sub1_39.method397(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean519) {
			super.aClass5_Sub1_39.method448(8448, 8448);
			super.aClass5_Sub1_39.method419(5890, 0, 768);
			super.aClass5_Sub1_39.method461(5890, 0);
		} else {
			super.aClass5_Sub1_39.method448(8448, 8448);
			super.aClass5_Sub1_39.method419(5890, 0, 768);
			super.aClass5_Sub1_39.method397(2);
			super.aClass5_Sub1_39.method448(8448, 8448);
			super.aClass5_Sub1_39.method419(5890, 0, 768);
			super.aClass5_Sub1_39.method419(34168, 1, 768);
			super.aClass5_Sub1_39.method461(5890, 0);
		}
		super.aClass5_Sub1_39.method397(0);
		this.aClass291_5.method7124();
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
	@Override
	public void method7137() {
		if (this.aBoolean518) {
			if (!this.aBoolean519) {
				super.aClass5_Sub1_39.method397(2);
				super.aClass5_Sub1_39.method423(null);
			}
			super.aClass5_Sub1_39.method397(1);
			super.aClass5_Sub1_39.method423(null);
			super.aClass5_Sub1_39.method397(0);
			this.aClass291_5.method7122('\u0001');
			this.aBoolean518 = false;
		} else {
			super.aClass5_Sub1_39.method461(5890, 0);
		}
		super.aClass5_Sub1_39.method448(8448, 8448);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7142() {
		return true;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7138(@OriginalArg(1) boolean arg0) {
		super.aClass5_Sub1_39.method448(7681, 8448);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean518) {
			super.aClass5_Sub1_39.method397(1);
			super.aClass5_Sub1_39.method423(this.aClass11_Sub4Array1[arg0 - 1]);
			super.aClass5_Sub1_39.method397(0);
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7141(@OriginalArg(1) boolean arg0) {
		if (this.aClass291_5 == null || !arg0) {
			super.aClass5_Sub1_39.method461(34168, 0);
			return;
		}
		if (!this.aBoolean519) {
			super.aClass5_Sub1_39.method397(2);
			super.aClass5_Sub1_39.method423(super.aClass5_Sub1_39.aClass11_Sub1_1);
			super.aClass5_Sub1_39.method397(0);
		}
		this.aClass291_5.method7122('\u0000');
		this.aBoolean518 = true;
	}
}
