import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class39_Sub1 extends Class39 {

	@OriginalMember(owner = "client!ck", name = "p", descriptor = "Lclient!pt;")
	private final Class201 aClass201_1;

	@OriginalMember(owner = "client!ck", name = "t", descriptor = "Lclient!uv;")
	private final Class260 aClass260_1;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!bt;Lclient!pt;)V")
	public Class39_Sub1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) Class201 arg1) {
		super(arg0);
		this.aClass201_1 = arg1;
		this.aClass260_1 = new Class260(arg0, 2);
		this.aClass260_1.method5892(0);
		super.aClass30_Sub1_42.method726(1);
		if (this.aClass201_1.aBoolean428) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass30_Sub1_42.method726(0);
		this.aClass260_1.method5894();
		this.aClass260_1.method5892(1);
		super.aClass30_Sub1_42.method726(1);
		if (this.aClass201_1.aBoolean428) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass30_Sub1_42.method726(0);
		this.aClass260_1.method5894();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!ei;II)V")
	@Override
	public void method5997(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1) {
		super.aClass30_Sub1_42.method730(arg0);
		super.aClass30_Sub1_42.method713(arg1);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
	@Override
	public void method5994() {
		this.aClass260_1.method5895('\u0001');
		super.aClass30_Sub1_42.method726(1);
		super.aClass30_Sub1_42.method730(null);
		super.aClass30_Sub1_42.method726(0);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5999(@OriginalArg(1) boolean arg0) {
		this.aClass260_1.method5895('\u0000');
		if (this.aClass201_1.aBoolean428) {
			super.aClass30_Sub1_42.method726(1);
			super.aClass30_Sub1_42.method730(this.aClass201_1.aClass62_Sub1_1);
			super.aClass30_Sub1_42.method726(0);
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5996(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method6000() {
		return true;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)V")
	@Override
	public void method5995(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg1 & 0x3) + 1);
		@Pc(30) float local30 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(41) float local41 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass30_Sub1_42.method726(1);
		@Pc(57) boolean local57 = (arg1 & 0x80) != 0;
		if (local57) {
			Static235.aFloatArray19[2] = 0.0F;
			Static235.aFloatArray19[1] = 0.0F;
			Static235.aFloatArray19[3] = 0.0F;
			Static235.aFloatArray19[0] = local41;
		} else {
			Static235.aFloatArray19[0] = 0.0F;
			Static235.aFloatArray19[1] = 0.0F;
			Static235.aFloatArray19[3] = 0.0F;
			Static235.aFloatArray19[2] = local41;
		}
		OpenGL.glTexGenfv(8192, 9474, Static235.aFloatArray19, 0);
		Static235.aFloatArray19[1] = local41;
		Static235.aFloatArray19[2] = 0.0F;
		Static235.aFloatArray19[0] = 0.0F;
		Static235.aFloatArray19[3] = (float) super.aClass30_Sub1_42.anInt841 * local14 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, Static235.aFloatArray19, 0);
		if (this.aClass201_1.aBoolean428) {
			Static235.aFloatArray19[1] = 0.0F;
			Static235.aFloatArray19[3] = (float) super.aClass30_Sub1_42.anInt841 * local30 % 1.0F;
			Static235.aFloatArray19[0] = 0.0F;
			Static235.aFloatArray19[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static235.aFloatArray19, 0);
		} else {
			@Pc(140) int local140 = (int) ((float) super.aClass30_Sub1_42.anInt841 * local30 * 16.0F);
			super.aClass30_Sub1_42.method730(this.aClass201_1.aClass62_Sub2Array2[local140 % 16]);
		}
		super.aClass30_Sub1_42.method726(0);
	}
}
