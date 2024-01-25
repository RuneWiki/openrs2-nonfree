import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!bl", name = "m", descriptor = "Z")
	private boolean aBoolean33 = false;

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "Lclient!bu;")
	private Class32 aClass32_1;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!ug;)V")
	public Class10_Sub2(@OriginalArg(0) Class135_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean478) {
			this.aClass32_1 = new Class32(arg0, 2);
			this.aClass32_1.method550(0);
			super.aClass135_Sub2_41.method5457(1);
			super.aClass135_Sub2_41.method5407(34165, 7681);
			super.aClass135_Sub2_41.method5474(34168, 2, 770);
			super.aClass135_Sub2_41.method5425(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass135_Sub2_41.method5457(0);
			this.aClass32_1.method548();
			this.aClass32_1.method550(1);
			super.aClass135_Sub2_41.method5457(1);
			super.aClass135_Sub2_41.method5407(8448, 8448);
			super.aClass135_Sub2_41.method5474(34166, 2, 770);
			super.aClass135_Sub2_41.method5425(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass135_Sub2_41.method5457(0);
			this.aClass32_1.method548();
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(ZZ)V")
	@Override
	public void method5736(@OriginalArg(0) boolean arg0) {
		super.aClass135_Sub2_41.method5407(8448, 7681);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
	@Override
	public void method5729() {
		if (this.aBoolean33) {
			this.aClass32_1.method547('\u0001');
			super.aClass135_Sub2_41.method5457(1);
			super.aClass135_Sub2_41.method5458(null);
			super.aClass135_Sub2_41.method5457(0);
		} else {
			super.aClass135_Sub2_41.method5425(0, 5890);
		}
		super.aClass135_Sub2_41.method5407(8448, 8448);
		this.aBoolean33 = false;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!sq;II)V")
	@Override
	public void method5730(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1) {
		super.aClass135_Sub2_41.method5458(arg0);
		super.aClass135_Sub2_41.method5441(arg1);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5735(@OriginalArg(1) boolean arg0) {
		@Pc(15) Class65_Sub3 local15 = super.aClass135_Sub2_41.method5421();
		if (this.aClass32_1 == null || local15 == null || !arg0) {
			super.aClass135_Sub2_41.method5425(0, 34168);
			return;
		}
		this.aClass32_1.method547('\u0000');
		super.aClass135_Sub2_41.method5457(1);
		super.aClass135_Sub2_41.method5458(local15);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass135_Sub2_41.aClass35_Sub2_3.method2901(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass135_Sub2_41.method5457(0);
		this.aBoolean33 = true;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5733() {
		return true;
	}
}
