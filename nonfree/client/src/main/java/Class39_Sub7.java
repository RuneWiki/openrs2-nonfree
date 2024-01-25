import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class39_Sub7 extends Class39 {

	@OriginalMember(owner = "client!pd", name = "u", descriptor = "Lclient!uv;")
	private Class260 aClass260_4;

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "Lclient!pt;")
	private final Class201 aClass201_5;

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "Lclient!sk;")
	private final Class62_Sub4 aClass62_Sub4_1;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!bt;Lclient!pt;)V")
	public Class39_Sub7(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) Class201 arg1) {
		super(arg0);
		this.aClass201_5 = arg1;
		this.method4689();
		this.aClass62_Sub4_1 = new Class62_Sub4(super.aClass30_Sub1_42, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass62_Sub4_1.method5359();
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method6000() {
		return true;
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V")
	private void method4689() {
		this.aClass260_4 = new Class260(super.aClass30_Sub1_42, 2);
		this.aClass260_4.method5892(0);
		super.aClass30_Sub1_42.method726(1);
		super.aClass30_Sub1_42.method724(7681, 260);
		super.aClass30_Sub1_42.method752(34168, 768, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass30_Sub1_42.method726(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass201_5.aBoolean428) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass260_4.method5894();
		this.aClass260_4.method5892(1);
		super.aClass30_Sub1_42.method726(1);
		super.aClass30_Sub1_42.method724(8448, 8448);
		super.aClass30_Sub1_42.method752(5890, 768, 0);
		OpenGL.glDisable(3168);
		super.aClass30_Sub1_42.method726(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass201_5.aBoolean428) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass260_4.method5894();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!ei;II)V")
	@Override
	public void method5997(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5996(@OriginalArg(0) boolean arg0) {
		super.aClass30_Sub1_42.method724(260, 8448);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5999(@OriginalArg(1) boolean arg0) {
		if (super.aClass30_Sub1_42.anInt854 > 0) {
			@Pc(10) float local10 = -0.5F / (float) super.aClass30_Sub1_42.anInt854;
			super.aClass30_Sub1_42.method726(1);
			Static406.aFloatArray37[0] = 0.0F;
			Static406.aFloatArray37[2] = local10;
			Static406.aFloatArray37[1] = 0.0F;
			Static406.aFloatArray37[3] = local10 * super.aClass30_Sub1_42.aFloat20 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static406.aFloatArray37, 0);
			OpenGL.glPopMatrix();
			super.aClass30_Sub1_42.method715(0.5F, (float) super.aClass30_Sub1_42.anInt854);
			super.aClass30_Sub1_42.method730(this.aClass62_Sub4_1);
			super.aClass30_Sub1_42.method726(0);
		}
		this.aClass260_4.method5895('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)V")
	@Override
	public void method5995(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass201_5.aBoolean428) {
				super.aClass30_Sub1_42.method730(this.aClass201_5.aClass62_Sub1_2);
				Static406.aFloatArray37[3] = (float) (super.aClass30_Sub1_42.anInt841 % 4000) / 4000.0F;
				Static406.aFloatArray37[0] = 0.0F;
				Static406.aFloatArray37[2] = 0.0F;
				Static406.aFloatArray37[1] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static406.aFloatArray37, 0);
			} else {
				@Pc(71) int local71 = super.aClass30_Sub1_42.anInt841 % 4000 * 16 / 4000;
				super.aClass30_Sub1_42.method730(this.aClass201_5.aClass62_Sub2Array3[local71]);
			}
		} else if (this.aClass201_5.aBoolean428) {
			super.aClass30_Sub1_42.method730(this.aClass201_5.aClass62_Sub1_2);
			Static406.aFloatArray37[3] = 0.0F;
			Static406.aFloatArray37[0] = 0.0F;
			Static406.aFloatArray37[1] = 0.0F;
			Static406.aFloatArray37[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static406.aFloatArray37, 0);
		} else {
			super.aClass30_Sub1_42.method730(this.aClass201_5.aClass62_Sub2Array3[0]);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	@Override
	public void method5994() {
		this.aClass260_4.method5895('\u0001');
		if (super.aClass30_Sub1_42.anInt854 > 0) {
			super.aClass30_Sub1_42.method726(1);
			super.aClass30_Sub1_42.method730(null);
			super.aClass30_Sub1_42.method715(1.0F, 0.0F);
			super.aClass30_Sub1_42.method726(0);
		}
		super.aClass30_Sub1_42.method724(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}
}
