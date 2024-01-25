import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class72_Sub7 extends Class72 {

	@OriginalMember(owner = "client!vk", name = "t", descriptor = "Z")
	private boolean aBoolean626 = false;

	@OriginalMember(owner = "client!vk", name = "p", descriptor = "Lclient!sc;")
	private Class223 aClass223_5;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class72_Sub7(@OriginalArg(0) Class172_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean599) {
			this.aClass223_5 = new Class223(arg0, 2);
			this.aClass223_5.method4786(0);
			super.aClass172_Sub2_43.method5569(1);
			super.aClass172_Sub2_43.method5591(34165, 7681);
			super.aClass172_Sub2_43.method5561(770, 34168, 2);
			super.aClass172_Sub2_43.method5592(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass172_Sub2_43.method5569(0);
			this.aClass223_5.method4784();
			this.aClass223_5.method4786(1);
			super.aClass172_Sub2_43.method5569(1);
			super.aClass172_Sub2_43.method5591(8448, 8448);
			super.aClass172_Sub2_43.method5561(770, 34166, 2);
			super.aClass172_Sub2_43.method5592(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass172_Sub2_43.method5569(0);
			this.aClass223_5.method4784();
		}
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5961() {
		return true;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5970(@OriginalArg(0) boolean arg0) {
		super.aClass172_Sub2_43.method5591(8448, 7681);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5966(@OriginalArg(0) boolean arg0) {
		@Pc(12) Class112_Sub4 local12 = super.aClass172_Sub2_43.method5554();
		if (this.aClass223_5 == null || local12 == null || !arg0) {
			super.aClass172_Sub2_43.method5592(34168, 0);
			return;
		}
		this.aClass223_5.method4785('\u0000');
		super.aClass172_Sub2_43.method5569(1);
		super.aClass172_Sub2_43.method5630(local12);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass172_Sub2_43.aClass107_Sub1_3.method3747(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass172_Sub2_43.method5569(0);
		this.aBoolean626 = true;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5965(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IILclient!ih;)V")
	@Override
	public void method5963(@OriginalArg(1) int arg0, @OriginalArg(2) Class112 arg1) {
		super.aClass172_Sub2_43.method5630(arg1);
		super.aClass172_Sub2_43.method5629(arg0);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
	@Override
	public void method5960() {
		if (this.aBoolean626) {
			this.aClass223_5.method4785('\u0001');
			super.aClass172_Sub2_43.method5569(1);
			super.aClass172_Sub2_43.method5630(null);
			super.aClass172_Sub2_43.method5569(0);
		} else {
			super.aClass172_Sub2_43.method5592(5890, 0);
		}
		super.aClass172_Sub2_43.method5591(8448, 8448);
		this.aBoolean626 = false;
	}
}
