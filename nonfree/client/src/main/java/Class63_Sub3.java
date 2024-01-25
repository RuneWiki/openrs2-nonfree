import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class63_Sub3 extends Class63 {

	@OriginalMember(owner = "client!ko", name = "h", descriptor = "Z")
	private boolean aBoolean219 = false;

	@OriginalMember(owner = "client!ko", name = "l", descriptor = "Lclient!lo;")
	private Class147 aClass147_2;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!pg;)V")
	public Class63_Sub3(@OriginalArg(0) Class163_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean379) {
			this.aClass147_2 = new Class147(arg0, 2);
			this.aClass147_2.method3028(0);
			super.aClass163_Sub2_43.method4131(1);
			super.aClass163_Sub2_43.method4164(34165, 7681);
			super.aClass163_Sub2_43.method4181(2, 770, 34168);
			super.aClass163_Sub2_43.method4135(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass163_Sub2_43.method4131(0);
			this.aClass147_2.method3029();
			this.aClass147_2.method3028(1);
			super.aClass163_Sub2_43.method4131(1);
			super.aClass163_Sub2_43.method4164(8448, 8448);
			super.aClass163_Sub2_43.method4181(2, 770, 34166);
			super.aClass163_Sub2_43.method4135(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass163_Sub2_43.method4131(0);
			this.aClass147_2.method3029();
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5723() {
		return true;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V")
	@Override
	public void method5725() {
		if (this.aBoolean219) {
			this.aClass147_2.method3026('\u0001');
			super.aClass163_Sub2_43.method4131(1);
			super.aClass163_Sub2_43.method4118(null);
			super.aClass163_Sub2_43.method4131(0);
		} else {
			super.aClass163_Sub2_43.method4135(0, 5890);
		}
		super.aClass163_Sub2_43.method4164(8448, 8448);
		this.aBoolean219 = false;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5724(@OriginalArg(0) boolean arg0) {
		super.aClass163_Sub2_43.method4164(8448, 7681);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILclient!fg;I)V")
	@Override
	public void method5728(@OriginalArg(1) Class20 arg0, @OriginalArg(2) int arg1) {
		super.aClass163_Sub2_43.method4118(arg0);
		super.aClass163_Sub2_43.method4107(arg1);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BII)V")
	@Override
	public void method5727(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5722(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class20_Sub3 local8 = super.aClass163_Sub2_43.method4143();
		if (this.aClass147_2 == null || local8 == null || !arg0) {
			super.aClass163_Sub2_43.method4135(0, 34168);
			return;
		}
		this.aClass147_2.method3026('\u0000');
		super.aClass163_Sub2_43.method4131(1);
		super.aClass163_Sub2_43.method4118(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass163_Sub2_43.aClass31_Sub2_3.method4800(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass163_Sub2_43.method4131(0);
		this.aBoolean219 = true;
	}
}
