import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class85_Sub4 extends Class85 {

	@OriginalMember(owner = "client!gl", name = "g", descriptor = "Lclient!qm;")
	private Class285 aClass285_3;

	@OriginalMember(owner = "client!gl", name = "s", descriptor = "Z")
	private boolean aBoolean231 = false;

	@OriginalMember(owner = "client!gl", name = "h", descriptor = "Z")
	private boolean aBoolean230;

	@OriginalMember(owner = "client!gl", name = "t", descriptor = "[Lclient!hda;")
	private Class46_Sub4[] aClass46_Sub4Array1;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!lj;)V")
	public Class85_Sub4(@OriginalArg(0) Class78_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean424) {
			this.aBoolean230 = arg0.anInt5581 < 3;
			@Pc(26) int local26 = this.aBoolean230 ? 48 : 127;
			@Pc(30) byte[][] local30 = new byte[6][4096];
			@Pc(34) byte[][] local34 = new byte[6][4096];
			@Pc(38) byte[][] local38 = new byte[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
					@Pc(57) float local57 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local66 * local66 + local57 * local57 + 1.0F)));
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
						@Pc(147) int local147;
						@Pc(156) int local156;
						@Pc(165) int local165;
						if (local98 > 0.0F) {
							local147 = (int) ((double) local26 * Math.pow((double) local98, 96.0D));
							local156 = (int) ((double) local26 * Math.pow((double) local98, 36.0D));
							local165 = (int) (Math.pow((double) local98, 12.0D) * (double) local26);
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
			this.aClass46_Sub4Array1 = new Class46_Sub4[3];
			this.aClass46_Sub4Array1[0] = new Class46_Sub4(super.aClass78_Sub3_37, 6406, 64, false, local34, 6406);
			this.aClass46_Sub4Array1[1] = new Class46_Sub4(super.aClass78_Sub3_37, 6406, 64, false, local38, 6406);
			this.aClass46_Sub4Array1[2] = new Class46_Sub4(super.aClass78_Sub3_37, 6406, 64, false, local30, 6406);
			this.method2727();
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(BZ)V")
	@Override
	public void method6289(@OriginalArg(1) boolean arg0) {
		if (this.aClass285_3 == null || !arg0) {
			super.aClass78_Sub3_37.method4527(0, 34168);
			return;
		}
		if (!this.aBoolean230) {
			super.aClass78_Sub3_37.method4549(2);
			super.aClass78_Sub3_37.method4535(super.aClass78_Sub3_37.aClass46_Sub2_4);
			super.aClass78_Sub3_37.method4549(0);
		}
		this.aClass285_3.method6136('\u0000');
		this.aBoolean231 = true;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IILclient!vf;)V")
	@Override
	public void method6288(@OriginalArg(0) int arg0, @OriginalArg(2) Class46 arg1) {
		super.aClass78_Sub3_37.method4535(arg1);
		super.aClass78_Sub3_37.method4534(arg0);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)V")
	@Override
	public void method6292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean231) {
			super.aClass78_Sub3_37.method4549(1);
			super.aClass78_Sub3_37.method4535(this.aClass46_Sub4Array1[arg0 - 1]);
			super.aClass78_Sub3_37.method4549(0);
		}
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V")
	private void method2727() {
		this.aClass285_3 = new Class285(super.aClass78_Sub3_37, 2);
		this.aClass285_3.method6137(0);
		super.aClass78_Sub3_37.method4549(1);
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
		if (this.aBoolean230) {
			super.aClass78_Sub3_37.method4539(260, 7681);
			super.aClass78_Sub3_37.method4493(5890, 0, 770);
			super.aClass78_Sub3_37.method4527(0, 34167);
		} else {
			super.aClass78_Sub3_37.method4539(7681, 8448);
			super.aClass78_Sub3_37.method4493(34168, 0, 768);
			super.aClass78_Sub3_37.method4549(2);
			super.aClass78_Sub3_37.method4539(260, 7681);
			super.aClass78_Sub3_37.method4493(34168, 0, 768);
			super.aClass78_Sub3_37.method4493(34168, 1, 770);
			super.aClass78_Sub3_37.method4527(0, 34167);
		}
		super.aClass78_Sub3_37.method4549(0);
		this.aClass285_3.method6133();
		this.aClass285_3.method6137(1);
		super.aClass78_Sub3_37.method4549(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean230) {
			super.aClass78_Sub3_37.method4539(8448, 8448);
			super.aClass78_Sub3_37.method4493(5890, 0, 768);
			super.aClass78_Sub3_37.method4527(0, 5890);
		} else {
			super.aClass78_Sub3_37.method4539(8448, 8448);
			super.aClass78_Sub3_37.method4493(5890, 0, 768);
			super.aClass78_Sub3_37.method4549(2);
			super.aClass78_Sub3_37.method4539(8448, 8448);
			super.aClass78_Sub3_37.method4493(5890, 0, 768);
			super.aClass78_Sub3_37.method4493(34168, 1, 768);
			super.aClass78_Sub3_37.method4527(0, 5890);
		}
		super.aClass78_Sub3_37.method4549(0);
		this.aClass285_3.method6133();
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6291() {
		return true;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6294(@OriginalArg(0) boolean arg0) {
		super.aClass78_Sub3_37.method4539(8448, 7681);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
	@Override
	public void method6287() {
		if (this.aBoolean231) {
			if (!this.aBoolean230) {
				super.aClass78_Sub3_37.method4549(2);
				super.aClass78_Sub3_37.method4535(null);
			}
			super.aClass78_Sub3_37.method4549(1);
			super.aClass78_Sub3_37.method4535(null);
			super.aClass78_Sub3_37.method4549(0);
			this.aClass285_3.method6136('\u0001');
			this.aBoolean231 = false;
		} else {
			super.aClass78_Sub3_37.method4527(0, 5890);
		}
		super.aClass78_Sub3_37.method4539(8448, 8448);
	}
}
