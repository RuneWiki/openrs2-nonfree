import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class17_Sub5 extends Class17 {

	@OriginalMember(owner = "client!hu", name = "r", descriptor = "Z")
	private boolean aBoolean181 = false;

	@OriginalMember(owner = "client!hu", name = "m", descriptor = "Lclient!rn;")
	private Class213 aClass213_3;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lclient!kd;)V")
	public Class17_Sub5(@OriginalArg(0) Class39_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean233) {
			this.aClass213_3 = new Class213(arg0, 2);
			this.aClass213_3.method4858(0);
			super.aClass39_Sub2_41.method3221(1);
			super.aClass39_Sub2_41.method3156(7681, 34165);
			super.aClass39_Sub2_41.method3180(770, 2, 34168);
			super.aClass39_Sub2_41.method3210(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass39_Sub2_41.method3221(0);
			this.aClass213_3.method4862();
			this.aClass213_3.method4858(1);
			super.aClass39_Sub2_41.method3221(1);
			super.aClass39_Sub2_41.method3156(8448, 8448);
			super.aClass39_Sub2_41.method3180(770, 2, 34166);
			super.aClass39_Sub2_41.method3210(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass39_Sub2_41.method3221(0);
			this.aClass213_3.method4862();
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5673(@OriginalArg(0) boolean arg0) {
		@Pc(12) Class3_Sub3 local12 = super.aClass39_Sub2_41.method3175();
		if (this.aClass213_3 == null || local12 == null || !arg0) {
			super.aClass39_Sub2_41.method3210(34168, 0);
			return;
		}
		this.aClass213_3.method4857('\u0000');
		super.aClass39_Sub2_41.method3221(1);
		super.aClass39_Sub2_41.method3203(local12);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass39_Sub2_41.aClass33_Sub2_3.method4615(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass39_Sub2_41.method3221(0);
		this.aBoolean181 = true;
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5675() {
		return true;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(III)V")
	@Override
	public void method5671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lclient!av;IB)V")
	@Override
	public void method5668(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1) {
		super.aClass39_Sub2_41.method3203(arg0);
		super.aClass39_Sub2_41.method3162(arg1);
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(B)V")
	@Override
	public void method5672() {
		if (this.aBoolean181) {
			this.aClass213_3.method4857('\u0001');
			super.aClass39_Sub2_41.method3221(1);
			super.aClass39_Sub2_41.method3203(null);
			super.aClass39_Sub2_41.method3221(0);
		} else {
			super.aClass39_Sub2_41.method3210(5890, 0);
		}
		super.aClass39_Sub2_41.method3156(8448, 8448);
		this.aBoolean181 = false;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5674(@OriginalArg(1) boolean arg0) {
		super.aClass39_Sub2_41.method3156(7681, 8448);
	}
}
