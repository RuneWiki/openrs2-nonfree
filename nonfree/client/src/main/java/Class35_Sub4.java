import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class35_Sub4 extends Class35 {

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "Z")
	private boolean aBoolean210 = false;

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "Lclient!wl;")
	private Class318 aClass318_3;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!te;)V")
	public Class35_Sub4(@OriginalArg(0) Class9_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean526) {
			this.aClass318_3 = new Class318(arg0, 2);
			this.aClass318_3.method7880(0);
			super.aClass9_Sub3_41.method6660(1);
			super.aClass9_Sub3_41.method6732(34165, 7681);
			super.aClass9_Sub3_41.method6706(34168, 2, 770);
			super.aClass9_Sub3_41.method6656(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass9_Sub3_41.method6660(0);
			this.aClass318_3.method7881();
			this.aClass318_3.method7880(1);
			super.aClass9_Sub3_41.method6660(1);
			super.aClass9_Sub3_41.method6732(8448, 8448);
			super.aClass9_Sub3_41.method6706(34166, 2, 770);
			super.aClass9_Sub3_41.method6656(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass9_Sub3_41.method6660(0);
			this.aClass318_3.method7881();
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
	@Override
	public void method7418() {
		if (this.aBoolean210) {
			this.aClass318_3.method7877('\u0001');
			super.aClass9_Sub3_41.method6660(1);
			super.aClass9_Sub3_41.method6701(null);
			super.aClass9_Sub3_41.method6660(0);
		} else {
			super.aClass9_Sub3_41.method6656(5890, 0);
		}
		super.aClass9_Sub3_41.method6732(8448, 8448);
		this.aBoolean210 = false;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7414() {
		return true;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILclient!jl;)V")
	@Override
	public void method7420(@OriginalArg(1) int arg0, @OriginalArg(2) Class20 arg1) {
		super.aClass9_Sub3_41.method6701(arg1);
		super.aClass9_Sub3_41.method6670(arg0);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7416(@OriginalArg(0) boolean arg0) {
		@Pc(15) Class20_Sub2 local15 = super.aClass9_Sub3_41.method6663();
		if (this.aClass318_3 == null || local15 == null || !arg0) {
			super.aClass9_Sub3_41.method6656(34168, 0);
			return;
		}
		this.aClass318_3.method7877('\u0000');
		super.aClass9_Sub3_41.method6660(1);
		super.aClass9_Sub3_41.method6701(local15);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass9_Sub3_41.aClass22_Sub2_3.method1962(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass9_Sub3_41.method6660(0);
		this.aBoolean210 = true;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)V")
	@Override
	public void method7419(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7417(@OriginalArg(1) boolean arg0) {
		super.aClass9_Sub3_41.method6732(8448, 7681);
	}
}
