import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!ap", name = "v", descriptor = "Lclient!cn;")
	private Class51 aClass51_1;

	@OriginalMember(owner = "client!ap", name = "k", descriptor = "Z")
	private boolean aBoolean24 = false;

	@OriginalMember(owner = "client!ap", name = "t", descriptor = "Z")
	private boolean aBoolean25;

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "[Lclient!sk;")
	private Class73_Sub4[] aClass73_Sub4Array1;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!uq;)V")
	public Class13_Sub1(@OriginalArg(0) Class122_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean581) {
			this.aBoolean25 = arg0.bf < 3;
			@Pc(26) int local26 = this.aBoolean25 ? 48 : 127;
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
						@Pc(148) int local148;
						@Pc(147) int local147;
						@Pc(145) int local145;
						if (local98 > 0.0F) {
							local148 = (int) (Math.pow((double) local98, 96.0D) * (double) local26);
							local147 = (int) ((double) local26 * Math.pow((double) local98, 36.0D));
							local145 = (int) ((double) local26 * Math.pow((double) local98, 12.0D));
						} else {
							local145 = 0;
							local147 = 0;
							local148 = 0;
						}
						local34[local91][local40] = (byte) local148;
						local38[local91][local40] = (byte) local147;
						local30[local91][local40] = (byte) local145;
					}
					local40++;
				}
			}
			this.aClass73_Sub4Array1 = new Class73_Sub4[3];
			this.aClass73_Sub4Array1[0] = new Class73_Sub4(super.aClass122_Sub3_40, 6406, 64, false, local34, 6406);
			this.aClass73_Sub4Array1[1] = new Class73_Sub4(super.aClass122_Sub3_40, 6406, 64, false, local38, 6406);
			this.aClass73_Sub4Array1[2] = new Class73_Sub4(super.aClass122_Sub3_40, 6406, 64, false, local30, 6406);
			this.method525();
		}
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)V")
	@Override
	public void method6728() {
		if (this.aBoolean24) {
			if (!this.aBoolean25) {
				super.aClass122_Sub3_40.method6932(2);
				super.aClass122_Sub3_40.method6850(null);
			}
			super.aClass122_Sub3_40.method6932(1);
			super.aClass122_Sub3_40.method6850(null);
			super.aClass122_Sub3_40.method6932(0);
			this.aClass51_1.method1248('\u0001');
			this.aBoolean24 = false;
		} else {
			super.aClass122_Sub3_40.method6913(5890, 0);
		}
		super.aClass122_Sub3_40.method6853(8448, 8448);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6727(@OriginalArg(0) boolean arg0) {
		if (this.aClass51_1 == null || !arg0) {
			super.aClass122_Sub3_40.method6913(34168, 0);
			return;
		}
		if (!this.aBoolean25) {
			super.aClass122_Sub3_40.method6932(2);
			super.aClass122_Sub3_40.method6850(super.aClass122_Sub3_40.aClass73_Sub1_5);
			super.aClass122_Sub3_40.method6932(0);
		}
		this.aClass51_1.method1248('\u0000');
		this.aBoolean24 = true;
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(ZB)V")
	@Override
	public void method6731(@OriginalArg(0) boolean arg0) {
		super.aClass122_Sub3_40.method6853(8448, 7681);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6732() {
		return true;
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(Z)V")
	private void method525() {
		this.aClass51_1 = new Class51(super.aClass122_Sub3_40, 2);
		this.aClass51_1.method1250(0);
		super.aClass122_Sub3_40.method6932(1);
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
		if (this.aBoolean25) {
			super.aClass122_Sub3_40.method6853(260, 7681);
			super.aClass122_Sub3_40.method6899(770, 0, 5890);
			super.aClass122_Sub3_40.method6913(34167, 0);
		} else {
			super.aClass122_Sub3_40.method6853(7681, 8448);
			super.aClass122_Sub3_40.method6899(768, 0, 34168);
			super.aClass122_Sub3_40.method6932(2);
			super.aClass122_Sub3_40.method6853(260, 7681);
			super.aClass122_Sub3_40.method6899(768, 0, 34168);
			super.aClass122_Sub3_40.method6899(770, 1, 34168);
			super.aClass122_Sub3_40.method6913(34167, 0);
		}
		super.aClass122_Sub3_40.method6932(0);
		this.aClass51_1.method1253();
		this.aClass51_1.method1250(1);
		super.aClass122_Sub3_40.method6932(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean25) {
			super.aClass122_Sub3_40.method6853(8448, 8448);
			super.aClass122_Sub3_40.method6899(768, 0, 5890);
			super.aClass122_Sub3_40.method6913(5890, 0);
		} else {
			super.aClass122_Sub3_40.method6853(8448, 8448);
			super.aClass122_Sub3_40.method6899(768, 0, 5890);
			super.aClass122_Sub3_40.method6932(2);
			super.aClass122_Sub3_40.method6853(8448, 8448);
			super.aClass122_Sub3_40.method6899(768, 0, 5890);
			super.aClass122_Sub3_40.method6899(768, 1, 34168);
			super.aClass122_Sub3_40.method6913(5890, 0);
		}
		super.aClass122_Sub3_40.method6932(0);
		this.aClass51_1.method1253();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!ea;IZ)V")
	@Override
	public void method6729(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1) {
		super.aClass122_Sub3_40.method6850(arg0);
		super.aClass122_Sub3_40.method6875(arg1);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(III)V")
	@Override
	public void method6730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean24) {
			super.aClass122_Sub3_40.method6932(1);
			super.aClass122_Sub3_40.method6850(this.aClass73_Sub4Array1[arg0 - 1]);
			super.aClass122_Sub3_40.method6932(0);
		}
	}
}
