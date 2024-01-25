import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class63_Sub6 extends Class63 {

	@OriginalMember(owner = "client!no", name = "o", descriptor = "Lclient!rk;")
	private final Class215 aClass215_4;

	@OriginalMember(owner = "client!no", name = "q", descriptor = "Lclient!lo;")
	private final Class147 aClass147_4;

	static {
		new Class134("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
	}

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!pg;Lclient!rk;)V")
	public Class63_Sub6(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) Class215 arg1) {
		super(arg0);
		this.aClass215_4 = arg1;
		this.aClass147_4 = new Class147(arg0, 2);
		this.aClass147_4.method3028(0);
		super.aClass163_Sub2_43.method4131(1);
		if (this.aClass215_4.aBoolean431) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass163_Sub2_43.method4131(0);
		this.aClass147_4.method3029();
		this.aClass147_4.method3028(1);
		super.aClass163_Sub2_43.method4131(1);
		if (this.aClass215_4.aBoolean431) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass163_Sub2_43.method4131(0);
		this.aClass147_4.method3029();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
	@Override
	public void method5725() {
		this.aClass147_4.method3026('\u0001');
		super.aClass163_Sub2_43.method4131(1);
		super.aClass163_Sub2_43.method4118(null);
		super.aClass163_Sub2_43.method4131(0);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5722(@OriginalArg(0) boolean arg0) {
		this.aClass147_4.method3026('\u0000');
		if (this.aClass215_4.aBoolean431) {
			super.aClass163_Sub2_43.method4131(1);
			super.aClass163_Sub2_43.method4118(this.aClass215_4.aClass20_Sub2_1);
			super.aClass163_Sub2_43.method4131(0);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ILclient!fg;I)V")
	@Override
	public void method5728(@OriginalArg(1) Class20 arg0, @OriginalArg(2) int arg1) {
		super.aClass163_Sub2_43.method4118(arg0);
		super.aClass163_Sub2_43.method4107(arg1);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5723() {
		return true;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5724(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BII)V")
	@Override
	public void method5727(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) float local18 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		@Pc(29) float local29 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(37) float local37 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(48) boolean local48 = (arg0 & 0x80) != 0;
		super.aClass163_Sub2_43.method4131(1);
		if (local48) {
			Static426.aFloatArray33[0] = local37;
			Static426.aFloatArray33[1] = 0.0F;
			Static426.aFloatArray33[2] = 0.0F;
			Static426.aFloatArray33[3] = 0.0F;
		} else {
			Static426.aFloatArray33[0] = 0.0F;
			Static426.aFloatArray33[3] = 0.0F;
			Static426.aFloatArray33[1] = 0.0F;
			Static426.aFloatArray33[2] = local37;
		}
		OpenGL.glTexGenfv(8192, 9474, Static426.aFloatArray33, 0);
		Static426.aFloatArray33[2] = 0.0F;
		Static426.aFloatArray33[0] = 0.0F;
		Static426.aFloatArray33[3] = local18 * (float) super.aClass163_Sub2_43.anInt5219 % 1.0F;
		Static426.aFloatArray33[1] = local37;
		OpenGL.glTexGenfv(8193, 9474, Static426.aFloatArray33, 0);
		if (this.aClass215_4.aBoolean431) {
			Static426.aFloatArray33[1] = 0.0F;
			Static426.aFloatArray33[2] = 0.0F;
			Static426.aFloatArray33[3] = local29 * (float) super.aClass163_Sub2_43.anInt5219 % 1.0F;
			Static426.aFloatArray33[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static426.aFloatArray33, 0);
		} else {
			@Pc(136) int local136 = (int) ((float) super.aClass163_Sub2_43.anInt5219 * local29 * 16.0F);
			super.aClass163_Sub2_43.method4118(this.aClass215_4.aClass20_Sub1Array3[local136 % 16]);
		}
		super.aClass163_Sub2_43.method4131(0);
	}
}
