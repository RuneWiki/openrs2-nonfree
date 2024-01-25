import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eda")
public final class Class99_Sub1 extends Class99 {

	@OriginalMember(owner = "client!eda", name = "p", descriptor = "Z")
	private boolean aBoolean188 = false;

	@OriginalMember(owner = "client!eda", name = "k", descriptor = "Lclient!bia;")
	private Class42 aClass42_1;

	@OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(Lclient!ffa;)V")
	public Class99_Sub1(@OriginalArg(0) Class57_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean230) {
			this.aClass42_1 = new Class42(arg0, 2);
			this.aClass42_1.method759(0);
			super.aClass57_Sub2_38.method2345(1);
			super.aClass57_Sub2_38.method2313(7681, 34165);
			super.aClass57_Sub2_38.method2368(34168, 2, 770);
			super.aClass57_Sub2_38.method2312(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass57_Sub2_38.method2345(0);
			this.aClass42_1.method760();
			this.aClass42_1.method759(1);
			super.aClass57_Sub2_38.method2345(1);
			super.aClass57_Sub2_38.method2313(8448, 8448);
			super.aClass57_Sub2_38.method2368(34166, 2, 770);
			super.aClass57_Sub2_38.method2312(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass57_Sub2_38.method2345(0);
			this.aClass42_1.method760();
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IBLclient!mw;)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(2) Class32 arg1) {
		super.aClass57_Sub2_38.method2362(arg1);
		super.aClass57_Sub2_38.method2382(arg0);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8723(@OriginalArg(1) boolean arg0) {
		super.aClass57_Sub2_38.method2313(7681, 8448);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8720(@OriginalArg(0) boolean arg0) {
		@Pc(15) Class32_Sub3 local15 = super.aClass57_Sub2_38.method2332();
		if (this.aClass42_1 == null || local15 == null || !arg0) {
			super.aClass57_Sub2_38.method2312(34168, 0);
			return;
		}
		this.aClass42_1.method758('\u0000');
		super.aClass57_Sub2_38.method2345(1);
		super.aClass57_Sub2_38.method2362(local15);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass57_Sub2_38.aClass203_Sub2_5.method6188(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass57_Sub2_38.method2345(0);
		this.aBoolean188 = true;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8718() {
		return true;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "(I)V")
	@Override
	public void method8726() {
		if (this.aBoolean188) {
			this.aClass42_1.method758('\u0001');
			super.aClass57_Sub2_38.method2345(1);
			super.aClass57_Sub2_38.method2362((Class32) null);
			super.aClass57_Sub2_38.method2345(0);
		} else {
			super.aClass57_Sub2_38.method2312(5890, 0);
		}
		super.aClass57_Sub2_38.method2313(8448, 8448);
		this.aBoolean188 = false;
	}
}
