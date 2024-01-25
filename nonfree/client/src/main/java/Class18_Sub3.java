import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class18_Sub3 extends Class18 {

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "Z")
	private boolean aBoolean161 = false;

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "Lclient!rj;")
	private Class303 aClass303_2;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!ep;)V")
	public Class18_Sub3(@OriginalArg(0) Class95_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean183) {
			this.aClass303_2 = new Class303(arg0, 2);
			this.aClass303_2.method6859(0);
			super.aClass95_Sub1_39.method2098(1);
			super.aClass95_Sub1_39.method2105(34165, 7681);
			super.aClass95_Sub1_39.method2101(770, 34168, 2);
			super.aClass95_Sub1_39.method2095(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass95_Sub1_39.method2098(0);
			this.aClass303_2.method6857();
			this.aClass303_2.method6859(1);
			super.aClass95_Sub1_39.method2098(1);
			super.aClass95_Sub1_39.method2105(8448, 8448);
			super.aClass95_Sub1_39.method2101(770, 34166, 2);
			super.aClass95_Sub1_39.method2095(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass95_Sub1_39.method2098(0);
			this.aClass303_2.method6857();
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7550(@OriginalArg(1) boolean arg0) {
		@Pc(8) Class65_Sub4 local8 = super.aClass95_Sub1_39.method2052();
		if (this.aClass303_2 == null || local8 == null || !arg0) {
			super.aClass95_Sub1_39.method2095(0, 34168);
			return;
		}
		this.aClass303_2.method6856('\u0000');
		super.aClass95_Sub1_39.method2098(1);
		super.aClass95_Sub1_39.method2077(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass95_Sub1_39.aClass177_Sub3_5.method7888(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass95_Sub1_39.method2098(0);
		this.aBoolean161 = true;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7544() {
		return true;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V")
	@Override
	public void method7551() {
		if (this.aBoolean161) {
			this.aClass303_2.method6856('\u0001');
			super.aClass95_Sub1_39.method2098(1);
			super.aClass95_Sub1_39.method2077(null);
			super.aClass95_Sub1_39.method2098(0);
		} else {
			super.aClass95_Sub1_39.method2095(0, 5890);
		}
		super.aClass95_Sub1_39.method2105(8448, 8448);
		this.aBoolean161 = false;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7545(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZLclient!hl;)V")
	@Override
	public void method7546(@OriginalArg(0) int arg0, @OriginalArg(2) Class65 arg1) {
		super.aClass95_Sub1_39.method2077(arg1);
		super.aClass95_Sub1_39.method2106(arg0);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7552(@OriginalArg(0) boolean arg0) {
		super.aClass95_Sub1_39.method2105(8448, 7681);
	}
}
