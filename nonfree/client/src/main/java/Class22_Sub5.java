import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class22_Sub5 extends Class22 {

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "Z")
	private boolean aBoolean488 = false;

	@OriginalMember(owner = "client!oe", name = "o", descriptor = "Lclient!ik;")
	private Class164 aClass164_4;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!lf;)V")
	public Class22_Sub5(@OriginalArg(0) Class95_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean382) {
			this.aClass164_4 = new Class164(arg0, 2);
			this.aClass164_4.method3846(0);
			super.aClass95_Sub3_37.method4900(1);
			super.aClass95_Sub3_37.method4899(34165, 7681);
			super.aClass95_Sub3_37.method4869(34168, 2, 770);
			super.aClass95_Sub3_37.method4850(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass95_Sub3_37.method4900(0);
			this.aClass164_4.method3848();
			this.aClass164_4.method3846(1);
			super.aClass95_Sub3_37.method4900(1);
			super.aClass95_Sub3_37.method4899(8448, 8448);
			super.aClass95_Sub3_37.method4869(34166, 2, 770);
			super.aClass95_Sub3_37.method4850(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass95_Sub3_37.method4900(0);
			this.aClass164_4.method3848();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6982() {
		return true;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6984(@OriginalArg(0) boolean arg0) {
		super.aClass95_Sub3_37.method4899(8448, 7681);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V")
	@Override
	public void method6985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
	@Override
	public void method6980() {
		if (this.aBoolean488) {
			this.aClass164_4.method3843('\u0001');
			super.aClass95_Sub3_37.method4900(1);
			super.aClass95_Sub3_37.method4864((Class10) null);
			super.aClass95_Sub3_37.method4900(0);
		} else {
			super.aClass95_Sub3_37.method4850(0, 5890);
		}
		super.aClass95_Sub3_37.method4899(8448, 8448);
		this.aBoolean488 = false;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6978(@OriginalArg(0) boolean arg0) {
		@Pc(12) Class10_Sub3 local12 = super.aClass95_Sub3_37.method4846();
		if (this.aClass164_4 == null || local12 == null || !arg0) {
			super.aClass95_Sub3_37.method4850(0, 34168);
			return;
		}
		this.aClass164_4.method3843('\u0000');
		super.aClass95_Sub3_37.method4900(1);
		super.aClass95_Sub3_37.method4864(local12);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass95_Sub3_37.aClass17_Sub3_5.method6250(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass95_Sub3_37.method4900(0);
		this.aBoolean488 = true;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!ru;II)V")
	@Override
	public void method6979(@OriginalArg(0) Class10 arg0, @OriginalArg(2) int arg1) {
		super.aClass95_Sub3_37.method4864(arg0);
		super.aClass95_Sub3_37.method4870(arg1);
	}
}
