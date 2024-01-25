import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cga")
public final class Class44_Sub1 extends Class44 {

	@OriginalMember(owner = "client!cga", name = "j", descriptor = "Z")
	private boolean aBoolean91 = false;

	@OriginalMember(owner = "client!cga", name = "i", descriptor = "Lclient!pia;")
	private Class283 aClass283_1;

	@OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Lclient!pc;)V")
	public Class44_Sub1(@OriginalArg(0) Class33_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean575) {
			this.aClass283_1 = new Class283(arg0, 2);
			this.aClass283_1.method6455(0);
			super.aClass33_Sub3_34.method6329(1);
			super.aClass33_Sub3_34.method6365(7681, 34165);
			super.aClass33_Sub3_34.method6307(34168, 2, 770);
			super.aClass33_Sub3_34.method6335(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass33_Sub3_34.method6329(0);
			this.aClass283_1.method6454();
			this.aClass283_1.method6455(1);
			super.aClass33_Sub3_34.method6329(1);
			super.aClass33_Sub3_34.method6365(8448, 8448);
			super.aClass33_Sub3_34.method6307(34166, 2, 770);
			super.aClass33_Sub3_34.method6335(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass33_Sub3_34.method6329(0);
			this.aClass283_1.method6454();
		}
	}

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7670(@OriginalArg(1) boolean arg0) {
		@Pc(8) Class116_Sub1 local8 = super.aClass33_Sub3_34.method6366();
		if (this.aClass283_1 == null || local8 == null || !arg0) {
			super.aClass33_Sub3_34.method6335(0, 34168);
			return;
		}
		this.aClass283_1.method6453('\u0000');
		super.aClass33_Sub3_34.method6329(1);
		super.aClass33_Sub3_34.method6340(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass33_Sub3_34.aClass92_Sub2_5.method3224(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass33_Sub3_34.method6329(0);
		this.aBoolean91 = true;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7666() {
		return true;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)V")
	@Override
	public void method7672() {
		if (this.aBoolean91) {
			this.aClass283_1.method6453('\u0001');
			super.aClass33_Sub3_34.method6329(1);
			super.aClass33_Sub3_34.method6340((Class116) null);
			super.aClass33_Sub3_34.method6329(0);
		} else {
			super.aClass33_Sub3_34.method6335(0, 5890);
		}
		super.aClass33_Sub3_34.method6365(8448, 8448);
		this.aBoolean91 = false;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(III)V")
	@Override
	public void method7668(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IBLclient!fha;)V")
	@Override
	public void method7667(@OriginalArg(0) int arg0, @OriginalArg(2) Class116 arg1) {
		super.aClass33_Sub3_34.method6340(arg1);
		super.aClass33_Sub3_34.method6336(arg0);
	}

	@OriginalMember(owner = "client!cga", name = "c", descriptor = "(IZ)V")
	@Override
	public void method7671(@OriginalArg(1) boolean arg0) {
		super.aClass33_Sub3_34.method6365(7681, 8448);
	}
}
