import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class69_Sub5 extends Class69 {

	@OriginalMember(owner = "client!on", name = "m", descriptor = "Z")
	private boolean aBoolean461 = false;

	@OriginalMember(owner = "client!on", name = "w", descriptor = "Lclient!gk;")
	private Class94 aClass94_2;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class69_Sub5(@OriginalArg(0) Class117_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean305) {
			this.aClass94_2 = new Class94(arg0, 2);
			this.aClass94_2.method1744(0);
			super.aClass117_Sub1_43.method2476(1);
			super.aClass117_Sub1_43.method2471(7681, 34165);
			super.aClass117_Sub1_43.method2505(2, 34168, 770);
			super.aClass117_Sub1_43.method2492(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass117_Sub1_43.method2476(0);
			this.aClass94_2.method1745();
			this.aClass94_2.method1744(1);
			super.aClass117_Sub1_43.method2476(1);
			super.aClass117_Sub1_43.method2471(8448, 8448);
			super.aClass117_Sub1_43.method2505(2, 34166, 770);
			super.aClass117_Sub1_43.method2492(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass117_Sub1_43.method2476(0);
			this.aClass94_2.method1745();
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)V")
	@Override
	public void method5853() {
		if (this.aBoolean461) {
			this.aClass94_2.method1738('\u0001');
			super.aClass117_Sub1_43.method2476(1);
			super.aClass117_Sub1_43.method2504(null);
			super.aClass117_Sub1_43.method2476(0);
		} else {
			super.aClass117_Sub1_43.method2492(5890, 0);
		}
		super.aClass117_Sub1_43.method2471(8448, 8448);
		this.aBoolean461 = false;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5852() {
		return true;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5861(@OriginalArg(0) boolean arg0) {
		super.aClass117_Sub1_43.method2471(7681, 8448);
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(ZI)V")
	@Override
	public void method5862(@OriginalArg(0) boolean arg0) {
		@Pc(16) Class23_Sub1 local16 = super.aClass117_Sub1_43.method2518();
		if (this.aClass94_2 == null || local16 == null || !arg0) {
			super.aClass117_Sub1_43.method2492(34168, 0);
			return;
		}
		this.aClass94_2.method1738('\u0000');
		super.aClass117_Sub1_43.method2476(1);
		super.aClass117_Sub1_43.method2504(local16);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass117_Sub1_43.aClass34_Sub2_4.method1911(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass117_Sub1_43.method2476(0);
		this.aBoolean461 = true;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!sv;IB)V")
	@Override
	public void method5863(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1) {
		super.aClass117_Sub1_43.method2504(arg0);
		super.aClass117_Sub1_43.method2535(arg1);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(BII)V")
	@Override
	public void method5857(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
