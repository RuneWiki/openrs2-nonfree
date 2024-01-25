import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class100_Sub5 extends Class100 {

	@OriginalMember(owner = "client!km", name = "k", descriptor = "Z")
	private boolean aBoolean268 = false;

	@OriginalMember(owner = "client!km", name = "p", descriptor = "Lclient!cs;")
	private Class49 aClass49_5;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class100_Sub5(@OriginalArg(0) Class106_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean210) {
			this.aClass49_5 = new Class49(arg0, 2);
			this.aClass49_5.method1154(0);
			super.aClass106_Sub2_43.method2881(1);
			super.aClass106_Sub2_43.method2923(34165, 7681);
			super.aClass106_Sub2_43.method2915(2, 34168, 770);
			super.aClass106_Sub2_43.method2925(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass106_Sub2_43.method2881(0);
			this.aClass49_5.method1151();
			this.aClass49_5.method1154(1);
			super.aClass106_Sub2_43.method2881(1);
			super.aClass106_Sub2_43.method2923(8448, 8448);
			super.aClass106_Sub2_43.method2915(2, 34166, 770);
			super.aClass106_Sub2_43.method2925(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass106_Sub2_43.method2881(0);
			this.aClass49_5.method1151();
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6154(@OriginalArg(0) boolean arg0) {
		@Pc(12) Class8_Sub3 local12 = super.aClass106_Sub2_43.method2876();
		if (this.aClass49_5 == null || local12 == null || !arg0) {
			super.aClass106_Sub2_43.method2925(34168, 0);
			return;
		}
		this.aClass49_5.method1153('\u0000');
		super.aClass106_Sub2_43.method2881(1);
		super.aClass106_Sub2_43.method2912(local12);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass106_Sub2_43.aClass40_Sub2_3.method3913(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass106_Sub2_43.method2881(0);
		this.aBoolean268 = true;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(III)V")
	@Override
	public void method6153(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6155(@OriginalArg(1) boolean arg0) {
		super.aClass106_Sub2_43.method2923(8448, 7681);
	}

	@OriginalMember(owner = "client!km", name = "d", descriptor = "(I)V")
	@Override
	public void method6160() {
		if (this.aBoolean268) {
			this.aClass49_5.method1153('\u0001');
			super.aClass106_Sub2_43.method2881(1);
			super.aClass106_Sub2_43.method2912(null);
			super.aClass106_Sub2_43.method2881(0);
		} else {
			super.aClass106_Sub2_43.method2925(5890, 0);
		}
		super.aClass106_Sub2_43.method2923(8448, 8448);
		this.aBoolean268 = false;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IILclient!kk;)V")
	@Override
	public void method6159(@OriginalArg(0) int arg0, @OriginalArg(2) Class8 arg1) {
		super.aClass106_Sub2_43.method2912(arg1);
		super.aClass106_Sub2_43.method2851(arg0);
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method6157() {
		return true;
	}
}
