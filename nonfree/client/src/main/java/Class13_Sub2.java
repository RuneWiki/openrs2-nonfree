import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class13_Sub2 extends Class13 {

	@OriginalMember(owner = "client!fo", name = "n", descriptor = "Z")
	private boolean aBoolean176 = false;

	@OriginalMember(owner = "client!fo", name = "p", descriptor = "Lclient!cn;")
	private Class51 aClass51_2;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lclient!uq;)V")
	public Class13_Sub2(@OriginalArg(0) Class122_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean581) {
			this.aClass51_2 = new Class51(arg0, 2);
			this.aClass51_2.method1250(0);
			super.aClass122_Sub3_40.method6932(1);
			super.aClass122_Sub3_40.method6853(34165, 7681);
			super.aClass122_Sub3_40.method6899(770, 2, 34168);
			super.aClass122_Sub3_40.method6913(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass122_Sub3_40.method6932(0);
			this.aClass51_2.method1253();
			this.aClass51_2.method1250(1);
			super.aClass122_Sub3_40.method6932(1);
			super.aClass122_Sub3_40.method6853(8448, 8448);
			super.aClass122_Sub3_40.method6899(770, 2, 34166);
			super.aClass122_Sub3_40.method6913(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass122_Sub3_40.method6932(0);
			this.aClass51_2.method1253();
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!ea;IZ)V")
	@Override
	public void method6729(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1) {
		super.aClass122_Sub3_40.method6850(arg0);
		super.aClass122_Sub3_40.method6875(arg1);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6727(@OriginalArg(0) boolean arg0) {
		@Pc(15) Class73_Sub4 local15 = super.aClass122_Sub3_40.method6895();
		if (this.aClass51_2 == null || local15 == null || !arg0) {
			super.aClass122_Sub3_40.method6913(34168, 0);
			return;
		}
		this.aClass51_2.method1248('\u0000');
		super.aClass122_Sub3_40.method6932(1);
		super.aClass122_Sub3_40.method6850(local15);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass122_Sub3_40.aClass118_Sub1_3.method2639(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass122_Sub3_40.method6932(0);
		this.aBoolean176 = true;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)V")
	@Override
	public void method6730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)V")
	@Override
	public void method6728() {
		if (this.aBoolean176) {
			this.aClass51_2.method1248('\u0001');
			super.aClass122_Sub3_40.method6932(1);
			super.aClass122_Sub3_40.method6850(null);
			super.aClass122_Sub3_40.method6932(0);
		} else {
			super.aClass122_Sub3_40.method6913(5890, 0);
		}
		super.aClass122_Sub3_40.method6853(8448, 8448);
		this.aBoolean176 = false;
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(ZB)V")
	@Override
	public void method6731(@OriginalArg(0) boolean arg0) {
		super.aClass122_Sub3_40.method6853(8448, 7681);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6732() {
		return true;
	}
}
