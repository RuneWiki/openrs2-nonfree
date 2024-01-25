import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class22_Sub4 extends Class22 {

	@OriginalMember(owner = "client!dm", name = "h", descriptor = "Z")
	private boolean aBoolean85 = false;

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "Lclient!ce;")
	private Class37 aClass37_2;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lclient!vd;)V")
	public Class22_Sub4(@OriginalArg(0) Class51_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean457) {
			this.aClass37_2 = new Class37(arg0, 2);
			this.aClass37_2.method601(0);
			super.aClass51_Sub2_33.method5371(1);
			super.aClass51_Sub2_33.method5394(34165, 7681);
			super.aClass51_Sub2_33.method5408(770, 34168, 2);
			super.aClass51_Sub2_33.method5374(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass51_Sub2_33.method5371(0);
			this.aClass37_2.method606();
			this.aClass37_2.method601(1);
			super.aClass51_Sub2_33.method5371(1);
			super.aClass51_Sub2_33.method5394(8448, 8448);
			super.aClass51_Sub2_33.method5408(770, 34166, 2);
			super.aClass51_Sub2_33.method5374(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass51_Sub2_33.method5371(0);
			this.aClass37_2.method606();
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZLclient!ew;I)V")
	@Override
	public void method4100(@OriginalArg(1) Class59 arg0, @OriginalArg(2) int arg1) {
		super.aClass51_Sub2_33.method5364(arg0);
		super.aClass51_Sub2_33.method5400(arg1);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZI)V")
	@Override
	public void method4099(@OriginalArg(0) boolean arg0) {
		super.aClass51_Sub2_33.method5394(8448, 7681);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)V")
	@Override
	public void method4104(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
	@Override
	public void method4103() {
		if (this.aBoolean85) {
			this.aClass37_2.method600('\u0001');
			super.aClass51_Sub2_33.method5371(1);
			super.aClass51_Sub2_33.method5364(null);
			super.aClass51_Sub2_33.method5371(0);
		} else {
			super.aClass51_Sub2_33.method5374(5890, 0);
		}
		super.aClass51_Sub2_33.method5394(8448, 8448);
		this.aBoolean85 = false;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4106() {
		return true;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method4101(@OriginalArg(0) boolean arg0) {
		@Pc(13) Class59_Sub4 local13 = super.aClass51_Sub2_33.method5407();
		if (this.aClass37_2 == null || local13 == null || !arg0) {
			super.aClass51_Sub2_33.method5374(34168, 0);
			return;
		}
		this.aClass37_2.method600('\u0000');
		super.aClass51_Sub2_33.method5371(1);
		super.aClass51_Sub2_33.method5364(local13);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass51_Sub2_33.aClass33_Sub2_4.method2385(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass51_Sub2_33.method5371(0);
		this.aBoolean85 = true;
	}
}
