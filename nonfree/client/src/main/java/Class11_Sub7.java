import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class11_Sub7 extends Class11 {

	@OriginalMember(owner = "client!rb", name = "n", descriptor = "Z")
	private boolean aBoolean561 = false;

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "Lclient!jr;")
	private Class164 aClass164_6;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!wh;)V")
	public Class11_Sub7(@OriginalArg(0) Class100_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean701) {
			this.aClass164_6 = new Class164(arg0, 2);
			this.aClass164_6.method4791(0);
			super.aClass100_Sub3_41.method8861(1);
			super.aClass100_Sub3_41.method8880(7681, 34165);
			super.aClass100_Sub3_41.method8889(34168, 2, 770);
			super.aClass100_Sub3_41.method8923(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass100_Sub3_41.method8861(0);
			this.aClass164_6.method4790();
			this.aClass164_6.method4791(1);
			super.aClass100_Sub3_41.method8861(1);
			super.aClass100_Sub3_41.method8880(8448, 8448);
			super.aClass100_Sub3_41.method8889(34166, 2, 770);
			super.aClass100_Sub3_41.method8923(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass100_Sub3_41.method8861(0);
			this.aClass164_6.method4790();
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
	@Override
	public void method8727() {
		if (this.aBoolean561) {
			this.aClass164_6.method4788('\u0001');
			super.aClass100_Sub3_41.method8861(1);
			super.aClass100_Sub3_41.method8925((Class3) null);
			super.aClass100_Sub3_41.method8861(0);
		} else {
			super.aClass100_Sub3_41.method8923(5890, 0);
		}
		super.aClass100_Sub3_41.method8880(8448, 8448);
		this.aBoolean561 = false;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!me;ZI)V")
	@Override
	public void method8726(@OriginalArg(0) Class3 arg0, @OriginalArg(2) int arg1) {
		super.aClass100_Sub3_41.method8925(arg0);
		super.aClass100_Sub3_41.method8903(arg1);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)V")
	@Override
	public void method8723(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8724(@OriginalArg(1) boolean arg0) {
		super.aClass100_Sub3_41.method8880(7681, 8448);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8725() {
		return true;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8728(@OriginalArg(1) boolean arg0) {
		@Pc(13) Class3_Sub4 local13 = super.aClass100_Sub3_41.method8908();
		if (this.aClass164_6 == null || local13 == null || !arg0) {
			super.aClass100_Sub3_41.method8923(34168, 0);
			return;
		}
		this.aClass164_6.method4788('\u0000');
		super.aClass100_Sub3_41.method8861(1);
		super.aClass100_Sub3_41.method8925(local13);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass100_Sub3_41.aClass154_Sub3_5.method6580(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass100_Sub3_41.method8861(0);
		this.aBoolean561 = true;
	}
}
