import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class21_Sub9 extends Class21 {

	@OriginalMember(owner = "client!wn", name = "n", descriptor = "Z")
	private boolean aBoolean760 = false;

	@OriginalMember(owner = "client!wn", name = "t", descriptor = "Lclient!cga;")
	private Class58 aClass58_6;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lclient!hk;)V")
	public Class21_Sub9(@OriginalArg(0) Class16_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean334) {
			this.aClass58_6 = new Class58(arg0, 2);
			this.aClass58_6.method1621(0);
			super.aClass16_Sub2_43.method3683(1);
			super.aClass16_Sub2_43.method3671(34165, 7681);
			super.aClass16_Sub2_43.method3669(34168, 2, 770);
			super.aClass16_Sub2_43.method3661(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass16_Sub2_43.method3683(0);
			this.aClass58_6.method1620();
			this.aClass58_6.method1621(1);
			super.aClass16_Sub2_43.method3683(1);
			super.aClass16_Sub2_43.method3671(8448, 8448);
			super.aClass16_Sub2_43.method3669(34166, 2, 770);
			super.aClass16_Sub2_43.method3661(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass16_Sub2_43.method3683(0);
			this.aClass58_6.method1620();
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8698(@OriginalArg(0) boolean arg0) {
		@Pc(16) Class39_Sub1 local16 = super.aClass16_Sub2_43.method3685();
		if (this.aClass58_6 == null || local16 == null || !arg0) {
			super.aClass16_Sub2_43.method3661(0, 34168);
			return;
		}
		this.aClass58_6.method1625('\u0000');
		super.aClass16_Sub2_43.method3683(1);
		super.aClass16_Sub2_43.method3620(local16);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass16_Sub2_43.aClass25_Sub1_5.method840(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass16_Sub2_43.method3683(0);
		this.aBoolean760 = true;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)V")
	@Override
	public void method8695() {
		if (this.aBoolean760) {
			this.aClass58_6.method1625('\u0001');
			super.aClass16_Sub2_43.method3683(1);
			super.aClass16_Sub2_43.method3620((Class39) null);
			super.aClass16_Sub2_43.method3683(0);
		} else {
			super.aClass16_Sub2_43.method3661(0, 5890);
		}
		super.aClass16_Sub2_43.method3671(8448, 8448);
		this.aBoolean760 = false;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZI)V")
	@Override
	public void method8696(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8697(@OriginalArg(1) boolean arg0) {
		super.aClass16_Sub2_43.method3671(8448, 7681);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8692() {
		return true;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IBLclient!qk;)V")
	@Override
	public void method8700(@OriginalArg(0) int arg0, @OriginalArg(2) Class39 arg1) {
		super.aClass16_Sub2_43.method3620(arg1);
		super.aClass16_Sub2_43.method3680(arg0);
	}
}
