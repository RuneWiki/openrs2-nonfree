import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class56_Sub3 extends Class56 {

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "Z")
	private boolean aBoolean200 = false;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "Lclient!ub;")
	private Class291 aClass291_2;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!ad;)V")
	public Class56_Sub3(@OriginalArg(0) Class5_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean20) {
			this.aClass291_2 = new Class291(arg0, 2);
			this.aClass291_2.method7121(0);
			super.aClass5_Sub1_39.method397(1);
			super.aClass5_Sub1_39.method448(7681, 34165);
			super.aClass5_Sub1_39.method419(34168, 2, 770);
			super.aClass5_Sub1_39.method461(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass5_Sub1_39.method397(0);
			this.aClass291_2.method7124();
			this.aClass291_2.method7121(1);
			super.aClass5_Sub1_39.method397(1);
			super.aClass5_Sub1_39.method448(8448, 8448);
			super.aClass5_Sub1_39.method419(34166, 2, 770);
			super.aClass5_Sub1_39.method461(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass5_Sub1_39.method397(0);
			this.aClass291_2.method7124();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7138(@OriginalArg(1) boolean arg0) {
		super.aClass5_Sub1_39.method448(7681, 8448);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7141(@OriginalArg(1) boolean arg0) {
		@Pc(12) Class11_Sub4 local12 = super.aClass5_Sub1_39.method464();
		if (this.aClass291_2 == null || local12 == null || !arg0) {
			super.aClass5_Sub1_39.method461(34168, 0);
			return;
		}
		this.aClass291_2.method7122('\u0000');
		super.aClass5_Sub1_39.method397(1);
		super.aClass5_Sub1_39.method423(local12);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass5_Sub1_39.aClass205_Sub3_3.method7807(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass5_Sub1_39.method397(0);
		this.aBoolean200 = true;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILclient!pm;)V")
	@Override
	public void method7139(@OriginalArg(0) int arg0, @OriginalArg(2) Class11 arg1) {
		super.aClass5_Sub1_39.method423(arg1);
		super.aClass5_Sub1_39.method416(arg0);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	@Override
	public void method7137() {
		if (this.aBoolean200) {
			this.aClass291_2.method7122('\u0001');
			super.aClass5_Sub1_39.method397(1);
			super.aClass5_Sub1_39.method423(null);
			super.aClass5_Sub1_39.method397(0);
		} else {
			super.aClass5_Sub1_39.method461(5890, 0);
		}
		super.aClass5_Sub1_39.method448(8448, 8448);
		this.aBoolean200 = false;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7142() {
		return true;
	}
}
