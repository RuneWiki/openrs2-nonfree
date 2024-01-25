import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aha")
public final class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!aha", name = "i", descriptor = "Z")
	private boolean aBoolean13 = false;

	@OriginalMember(owner = "client!aha", name = "m", descriptor = "Lclient!bp;")
	private Class36 aClass36_1;

	@OriginalMember(owner = "client!aha", name = "<init>", descriptor = "(Lclient!eq;)V")
	public Class14_Sub1(@OriginalArg(0) Class33_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean265) {
			this.aClass36_1 = new Class36(arg0, 2);
			this.aClass36_1.method1116(0);
			super.aClass33_Sub3_43.method3027(1);
			super.aClass33_Sub3_43.method3057(7681, 34165);
			super.aClass33_Sub3_43.method3024(770, 34168, 2);
			super.aClass33_Sub3_43.method3081(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass33_Sub3_43.method3027(0);
			this.aClass36_1.method1115();
			this.aClass36_1.method1116(1);
			super.aClass33_Sub3_43.method3027(1);
			super.aClass33_Sub3_43.method3057(8448, 8448);
			super.aClass33_Sub3_43.method3024(770, 34166, 2);
			super.aClass33_Sub3_43.method3081(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass33_Sub3_43.method3027(0);
			this.aClass36_1.method1115();
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8543(@OriginalArg(1) boolean arg0) {
		@Pc(8) Class121_Sub1 local8 = super.aClass33_Sub3_43.method3060();
		if (this.aClass36_1 == null || local8 == null || !arg0) {
			super.aClass33_Sub3_43.method3081(34168, 0);
			return;
		}
		this.aClass36_1.method1112('\u0000');
		super.aClass33_Sub3_43.method3027(1);
		super.aClass33_Sub3_43.method3012(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass33_Sub3_43.aClass47_Sub2_5.method3498(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass33_Sub3_43.method3027(0);
		this.aBoolean13 = true;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(BLclient!kp;I)V")
	@Override
	public void method8542(@OriginalArg(1) Class121 arg0, @OriginalArg(2) int arg1) {
		super.aClass33_Sub3_43.method3012(arg0);
		super.aClass33_Sub3_43.method3045(arg1);
	}

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8549() {
		return true;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(III)V")
	@Override
	public void method8544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(I)V")
	@Override
	public void method8545() {
		if (this.aBoolean13) {
			this.aClass36_1.method1112('\u0001');
			super.aClass33_Sub3_43.method3027(1);
			super.aClass33_Sub3_43.method3012(null);
			super.aClass33_Sub3_43.method3027(0);
		} else {
			super.aClass33_Sub3_43.method3081(5890, 0);
		}
		super.aClass33_Sub3_43.method3057(8448, 8448);
		this.aBoolean13 = false;
	}

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8550(@OriginalArg(1) boolean arg0) {
		super.aClass33_Sub3_43.method3057(7681, 8448);
	}
}
