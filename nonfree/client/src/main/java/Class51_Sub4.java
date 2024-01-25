import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class51_Sub4 extends Class51 {

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "Z")
	private boolean aBoolean335 = false;

	@OriginalMember(owner = "client!lh", name = "u", descriptor = "Lclient!bf;")
	private Class18 aClass18_4;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lclient!gk;)V")
	public Class51_Sub4(@OriginalArg(0) Class75_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean234) {
			this.aClass18_4 = new Class18(arg0, 2);
			this.aClass18_4.method718(0);
			super.aClass75_Sub2_39.method2426(1);
			super.aClass75_Sub2_39.method2479(34165, 7681);
			super.aClass75_Sub2_39.method2466(34168, 2, 770);
			super.aClass75_Sub2_39.method2460(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass75_Sub2_39.method2426(0);
			this.aClass18_4.method723();
			this.aClass18_4.method718(1);
			super.aClass75_Sub2_39.method2426(1);
			super.aClass75_Sub2_39.method2479(8448, 8448);
			super.aClass75_Sub2_39.method2466(34166, 2, 770);
			super.aClass75_Sub2_39.method2460(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass75_Sub2_39.method2426(0);
			this.aClass18_4.method723();
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BII)V")
	@Override
	public void method4958(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4955() {
		return true;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!rh;II)V")
	@Override
	public void method4960(@OriginalArg(0) Class42 arg0, @OriginalArg(2) int arg1) {
		super.aClass75_Sub2_39.method2456(arg0);
		super.aClass75_Sub2_39.method2424(arg1);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method4961(@OriginalArg(1) boolean arg0) {
		@Pc(8) Class42_Sub3 local8 = super.aClass75_Sub2_39.method2471();
		if (this.aClass18_4 == null || local8 == null || !arg0) {
			super.aClass75_Sub2_39.method2460(34168, 0);
			return;
		}
		this.aClass18_4.method720('\u0000');
		super.aClass75_Sub2_39.method2426(1);
		super.aClass75_Sub2_39.method2456(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass75_Sub2_39.aClass106_Sub2_3.method5111(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass75_Sub2_39.method2426(0);
		this.aBoolean335 = true;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZI)V")
	@Override
	public void method4956(@OriginalArg(0) boolean arg0) {
		super.aClass75_Sub2_39.method2479(8448, 7681);
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V")
	@Override
	public void method4957() {
		if (this.aBoolean335) {
			this.aClass18_4.method720('\u0001');
			super.aClass75_Sub2_39.method2426(1);
			super.aClass75_Sub2_39.method2456(null);
			super.aClass75_Sub2_39.method2426(0);
		} else {
			super.aClass75_Sub2_39.method2460(5890, 0);
		}
		super.aClass75_Sub2_39.method2479(8448, 8448);
		this.aBoolean335 = false;
	}
}
