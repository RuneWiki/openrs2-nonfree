import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class36_Sub2 extends Class36 {

	@OriginalMember(owner = "client!hn", name = "k", descriptor = "Z")
	private boolean aBoolean264 = false;

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "Lclient!iq;")
	private Class120 aClass120_1;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lclient!bo;)V")
	public Class36_Sub2(@OriginalArg(0) Class26_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean68) {
			this.aClass120_1 = new Class120(arg0, 2);
			this.aClass120_1.method2784(0);
			super.aClass26_Sub1_43.method696(1);
			super.aClass26_Sub1_43.method695(34165, 7681);
			super.aClass26_Sub1_43.method646(2, 770, 34168);
			super.aClass26_Sub1_43.method643(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass26_Sub1_43.method696(0);
			this.aClass120_1.method2781();
			this.aClass120_1.method2784(1);
			super.aClass26_Sub1_43.method696(1);
			super.aClass26_Sub1_43.method695(8448, 8448);
			super.aClass26_Sub1_43.method646(2, 770, 34166);
			super.aClass26_Sub1_43.method643(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass26_Sub1_43.method696(0);
			this.aClass120_1.method2781();
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6010() {
		return true;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!nk;II)V")
	@Override
	public void method6008(@OriginalArg(0) Class65 arg0, @OriginalArg(2) int arg1) {
		super.aClass26_Sub1_43.method673(arg0);
		super.aClass26_Sub1_43.method669(arg1);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6015(@OriginalArg(0) boolean arg0) {
		super.aClass26_Sub1_43.method695(8448, 7681);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZII)V")
	@Override
	public void method6007(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6011(@OriginalArg(1) boolean arg0) {
		@Pc(8) Class65_Sub1 local8 = super.aClass26_Sub1_43.method629();
		if (this.aClass120_1 == null || local8 == null || !arg0) {
			super.aClass26_Sub1_43.method643(0, 34168);
			return;
		}
		this.aClass120_1.method2782('\u0000');
		super.aClass26_Sub1_43.method696(1);
		super.aClass26_Sub1_43.method673(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass26_Sub1_43.aClass102_Sub2_4.method2654(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass26_Sub1_43.method696(0);
		this.aBoolean264 = true;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
	@Override
	public void method6012() {
		if (this.aBoolean264) {
			this.aClass120_1.method2782('\u0001');
			super.aClass26_Sub1_43.method696(1);
			super.aClass26_Sub1_43.method673(null);
			super.aClass26_Sub1_43.method696(0);
		} else {
			super.aClass26_Sub1_43.method643(0, 5890);
		}
		super.aClass26_Sub1_43.method695(8448, 8448);
		this.aBoolean264 = false;
	}
}
