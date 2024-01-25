import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class40_Sub9 extends Class40 {

	@OriginalMember(owner = "client!us", name = "v", descriptor = "Z")
	private boolean aBoolean481 = false;

	@OriginalMember(owner = "client!us", name = "k", descriptor = "Lclient!kp;")
	private Class150 aClass150_6;

	static {
		new Class231(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
	}

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lclient!na;)V")
	public Class40_Sub9(@OriginalArg(0) Class75_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean337) {
			this.aClass150_6 = new Class150(arg0, 2);
			this.aClass150_6.method3069(0);
			super.aClass75_Sub2_41.method3811(1);
			super.aClass75_Sub2_41.method3872(7681, 34165);
			super.aClass75_Sub2_41.method3802(2, 34168, 770);
			super.aClass75_Sub2_41.method3843(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass75_Sub2_41.method3811(0);
			this.aClass150_6.method3066();
			this.aClass150_6.method3069(1);
			super.aClass75_Sub2_41.method3811(1);
			super.aClass75_Sub2_41.method3872(8448, 8448);
			super.aClass75_Sub2_41.method3802(2, 34166, 770);
			super.aClass75_Sub2_41.method3843(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass75_Sub2_41.method3811(0);
			this.aClass150_6.method3066();
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5753() {
		return true;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(I)V")
	@Override
	public void method5757() {
		if (this.aBoolean481) {
			this.aClass150_6.method3067('\u0001');
			super.aClass75_Sub2_41.method3811(1);
			super.aClass75_Sub2_41.method3844(null);
			super.aClass75_Sub2_41.method3811(0);
		} else {
			super.aClass75_Sub2_41.method3843(0, 5890);
		}
		super.aClass75_Sub2_41.method3872(8448, 8448);
		this.aBoolean481 = false;
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(ZB)V")
	@Override
	public void method5758(@OriginalArg(0) boolean arg0) {
		@Pc(15) Class64_Sub1 local15 = super.aClass75_Sub2_41.method3821();
		if (this.aClass150_6 == null || local15 == null || !arg0) {
			super.aClass75_Sub2_41.method3843(0, 34168);
			return;
		}
		this.aClass150_6.method3067('\u0000');
		super.aClass75_Sub2_41.method3811(1);
		super.aClass75_Sub2_41.method3844(local15);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass75_Sub2_41.aClass6_Sub2_3.method3919(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass75_Sub2_41.method3811(0);
		this.aBoolean481 = true;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IILclient!ed;)V")
	@Override
	public void method5760(@OriginalArg(0) int arg0, @OriginalArg(2) Class64 arg1) {
		super.aClass75_Sub2_41.method3844(arg1);
		super.aClass75_Sub2_41.method3798(arg0);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5755(@OriginalArg(0) boolean arg0) {
		super.aClass75_Sub2_41.method3872(7681, 8448);
	}
}
