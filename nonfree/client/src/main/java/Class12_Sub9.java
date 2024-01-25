import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class12_Sub9 extends Class12 {

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "Z")
	private boolean aBoolean469 = false;

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "Lclient!hu;")
	private Class110 aClass110_6;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!rl;)V")
	public Class12_Sub9(@OriginalArg(0) Class66_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean392) {
			this.aClass110_6 = new Class110(arg0, 2);
			this.aClass110_6.method2674(0);
			super.aClass66_Sub2_41.method5075(1);
			super.aClass66_Sub2_41.method5145(7681, 34165);
			super.aClass66_Sub2_41.method5081(2, 34168, 770);
			super.aClass66_Sub2_41.method5102(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass66_Sub2_41.method5075(0);
			this.aClass110_6.method2676();
			this.aClass110_6.method2674(1);
			super.aClass66_Sub2_41.method5075(1);
			super.aClass66_Sub2_41.method5145(8448, 8448);
			super.aClass66_Sub2_41.method5081(2, 34166, 770);
			super.aClass66_Sub2_41.method5102(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass66_Sub2_41.method5075(0);
			this.aClass110_6.method2676();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6092(@OriginalArg(1) boolean arg0) {
		super.aClass66_Sub2_41.method5145(7681, 8448);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBLclient!tu;)V")
	@Override
	public void method6090(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1) {
		super.aClass66_Sub2_41.method5109(arg1);
		super.aClass66_Sub2_41.method5140(arg0);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6097(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class19_Sub3 local8 = super.aClass66_Sub2_41.method5111();
		if (this.aClass110_6 == null || local8 == null || !arg0) {
			super.aClass66_Sub2_41.method5102(0, 34168);
			return;
		}
		this.aClass110_6.method2677('\u0000');
		super.aClass66_Sub2_41.method5075(1);
		super.aClass66_Sub2_41.method5109(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass66_Sub2_41.aClass5_Sub2_4.method3849(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass66_Sub2_41.method5075(0);
		this.aBoolean469 = true;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6091() {
		return true;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V")
	@Override
	public void method6096() {
		if (this.aBoolean469) {
			this.aClass110_6.method2677('\u0001');
			super.aClass66_Sub2_41.method5075(1);
			super.aClass66_Sub2_41.method5109(null);
			super.aClass66_Sub2_41.method5075(0);
		} else {
			super.aClass66_Sub2_41.method5102(0, 5890);
		}
		super.aClass66_Sub2_41.method5145(8448, 8448);
		this.aBoolean469 = false;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)V")
	@Override
	public void method6094(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
