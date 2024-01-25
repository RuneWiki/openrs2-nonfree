import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vv")
public final class Class101_Sub8 extends Class101 {

	@OriginalMember(owner = "client!vv", name = "q", descriptor = "Z")
	private boolean aBoolean717 = false;

	@OriginalMember(owner = "client!vv", name = "j", descriptor = "Lclient!fb;")
	private Class106 aClass106_5;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Lclient!qj;)V")
	public Class101_Sub8(@OriginalArg(0) Class100_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean591) {
			this.aClass106_5 = new Class106(arg0, 2);
			this.aClass106_5.method2292(0);
			super.aClass100_Sub3_43.method6344(1);
			super.aClass100_Sub3_43.method6300(34165, 7681);
			super.aClass100_Sub3_43.method6283(2, 770, 34168);
			super.aClass100_Sub3_43.method6332(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass100_Sub3_43.method6344(0);
			this.aClass106_5.method2293();
			this.aClass106_5.method2292(1);
			super.aClass100_Sub3_43.method6344(1);
			super.aClass100_Sub3_43.method6300(8448, 8448);
			super.aClass100_Sub3_43.method6283(2, 770, 34166);
			super.aClass100_Sub3_43.method6332(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass100_Sub3_43.method6344(0);
			this.aClass106_5.method2293();
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method7834(@OriginalArg(0) int arg0, @OriginalArg(2) Class23 arg1) {
		super.aClass100_Sub3_43.method6277(arg1);
		super.aClass100_Sub3_43.method6322(arg0);
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7839(@OriginalArg(1) boolean arg0) {
		super.aClass100_Sub3_43.method6300(8448, 7681);
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7836() {
		return true;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(III)V")
	@Override
	public void method7840(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V")
	@Override
	public void method7835() {
		if (this.aBoolean717) {
			this.aClass106_5.method2294('\u0001');
			super.aClass100_Sub3_43.method6344(1);
			super.aClass100_Sub3_43.method6277(null);
			super.aClass100_Sub3_43.method6344(0);
		} else {
			super.aClass100_Sub3_43.method6332(5890, 0);
		}
		super.aClass100_Sub3_43.method6300(8448, 8448);
		this.aBoolean717 = false;
	}

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7841(@OriginalArg(1) boolean arg0) {
		@Pc(8) Class23_Sub4 local8 = super.aClass100_Sub3_43.method6282();
		if (this.aClass106_5 == null || local8 == null || !arg0) {
			super.aClass100_Sub3_43.method6332(34168, 0);
			return;
		}
		this.aClass106_5.method2294('\u0000');
		super.aClass100_Sub3_43.method6344(1);
		super.aClass100_Sub3_43.method6277(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass100_Sub3_43.aClass68_Sub1_5.method1269(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass100_Sub3_43.method6344(0);
		this.aBoolean717 = true;
	}
}
