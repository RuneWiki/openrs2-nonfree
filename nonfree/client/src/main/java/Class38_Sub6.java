import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class38_Sub6 extends Class38 {

	@OriginalMember(owner = "client!pf", name = "u", descriptor = "Z")
	private boolean aBoolean388 = false;

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "Lclient!hq;")
	private Class102 aClass102_4;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lclient!nq;)V")
	public Class38_Sub6(@OriginalArg(0) Class167_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean363) {
			this.aClass102_4 = new Class102(arg0, 2);
			this.aClass102_4.method2513(0);
			super.aClass167_Sub1_42.method3993(1);
			super.aClass167_Sub1_42.method3983(34165, 7681);
			super.aClass167_Sub1_42.method4012(34168, 770, 2);
			super.aClass167_Sub1_42.method3997(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass167_Sub1_42.method3993(0);
			this.aClass102_4.method2510();
			this.aClass102_4.method2513(1);
			super.aClass167_Sub1_42.method3993(1);
			super.aClass167_Sub1_42.method3983(8448, 8448);
			super.aClass167_Sub1_42.method4012(34166, 770, 2);
			super.aClass167_Sub1_42.method3997(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass167_Sub1_42.method3993(0);
			this.aClass102_4.method2510();
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5708(@OriginalArg(0) boolean arg0) {
		super.aClass167_Sub1_42.method3983(8448, 7681);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	@Override
	public void method5706() {
		if (this.aBoolean388) {
			this.aClass102_4.method2512('\u0001');
			super.aClass167_Sub1_42.method3993(1);
			super.aClass167_Sub1_42.method4028(null);
			super.aClass167_Sub1_42.method3993(0);
		} else {
			super.aClass167_Sub1_42.method3997(0, 5890);
		}
		super.aClass167_Sub1_42.method3983(8448, 8448);
		this.aBoolean388 = false;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZLclient!lr;I)V")
	@Override
	public void method5710(@OriginalArg(1) Class137 arg0, @OriginalArg(2) int arg1) {
		super.aClass167_Sub1_42.method4028(arg0);
		super.aClass167_Sub1_42.method3998(arg1);
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5704() {
		return true;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5703(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5707(@OriginalArg(1) boolean arg0) {
		@Pc(12) Class137_Sub4 local12 = super.aClass167_Sub1_42.method4033();
		if (this.aClass102_4 == null || local12 == null || !arg0) {
			super.aClass167_Sub1_42.method3997(0, 34168);
			return;
		}
		this.aClass102_4.method2512('\u0000');
		super.aClass167_Sub1_42.method3993(1);
		super.aClass167_Sub1_42.method4028(local12);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass167_Sub1_42.aClass11_Sub2_4.method2187(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass167_Sub1_42.method3993(0);
		this.aBoolean388 = true;
	}
}
