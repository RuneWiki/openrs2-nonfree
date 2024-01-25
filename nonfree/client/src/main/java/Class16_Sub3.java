import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class16_Sub3 extends Class16 {

	@OriginalMember(owner = "client!cj", name = "h", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!cj", name = "l", descriptor = "Lclient!gw;")
	private Class94 aClass94_1;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!tt;)V")
	public Class16_Sub3(@OriginalArg(0) Class200_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean443) {
			this.aClass94_1 = new Class94(arg0, 2);
			this.aClass94_1.method2130(0);
			super.aClass200_Sub2_36.method5319(1);
			super.aClass200_Sub2_36.method5304(34165, 7681);
			super.aClass200_Sub2_36.method5343(770, 34168, 2);
			super.aClass200_Sub2_36.method5341(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass200_Sub2_36.method5319(0);
			this.aClass94_1.method2133();
			this.aClass94_1.method2130(1);
			super.aClass200_Sub2_36.method5319(1);
			super.aClass200_Sub2_36.method5304(8448, 8448);
			super.aClass200_Sub2_36.method5343(770, 34166, 2);
			super.aClass200_Sub2_36.method5341(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass200_Sub2_36.method5319(0);
			this.aClass94_1.method2133();
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5149(@OriginalArg(0) boolean arg0) {
		@Pc(16) Class31_Sub4 local16 = super.aClass200_Sub2_36.method5292();
		if (this.aClass94_1 == null || local16 == null || !arg0) {
			super.aClass200_Sub2_36.method5341(34168, 0);
			return;
		}
		this.aClass94_1.method2132('\u0000');
		super.aClass200_Sub2_36.method5319(1);
		super.aClass200_Sub2_36.method5312(local16);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass200_Sub2_36.aClass29_Sub1_4.method1958(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass200_Sub2_36.method5319(0);
		this.aBoolean75 = true;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5154() {
		return true;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BILclient!in;)V")
	@Override
	public void method5150(@OriginalArg(1) int arg0, @OriginalArg(2) Class31 arg1) {
		super.aClass200_Sub2_36.method5312(arg1);
		super.aClass200_Sub2_36.method5297(arg0);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
	@Override
	public void method5148() {
		if (this.aBoolean75) {
			this.aClass94_1.method2132('\u0001');
			super.aClass200_Sub2_36.method5319(1);
			super.aClass200_Sub2_36.method5312(null);
			super.aClass200_Sub2_36.method5319(0);
		} else {
			super.aClass200_Sub2_36.method5341(5890, 0);
		}
		super.aClass200_Sub2_36.method5304(8448, 8448);
		this.aBoolean75 = false;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BZ)V")
	@Override
	public void method5157(@OriginalArg(1) boolean arg0) {
		super.aClass200_Sub2_36.method5304(8448, 7681);
	}
}
