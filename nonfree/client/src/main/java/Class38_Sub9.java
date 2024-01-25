import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class38_Sub9 extends Class38 {

	@OriginalMember(owner = "client!wo", name = "m", descriptor = "Z")
	private boolean aBoolean775 = false;

	@OriginalMember(owner = "client!wo", name = "n", descriptor = "Lclient!vb;")
	private Class371 aClass371_6;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!pi;)V")
	public Class38_Sub9(@OriginalArg(0) Class144_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean555) {
			this.aClass371_6 = new Class371(arg0, 2);
			this.aClass371_6.method8902(0);
			super.aClass144_Sub3_43.method7028(1);
			super.aClass144_Sub3_43.method7025(34165, 7681);
			super.aClass144_Sub3_43.method6979(2, 770, 34168);
			super.aClass144_Sub3_43.method7021(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass144_Sub3_43.method7028(0);
			this.aClass371_6.method8904();
			this.aClass371_6.method8902(1);
			super.aClass144_Sub3_43.method7028(1);
			super.aClass144_Sub3_43.method7025(8448, 8448);
			super.aClass144_Sub3_43.method6979(2, 770, 34166);
			super.aClass144_Sub3_43.method7021(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass144_Sub3_43.method7028(0);
			this.aClass371_6.method8904();
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9403() {
		return true;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZLclient!pu;I)V")
	@Override
	public void method9401(@OriginalArg(1) Class161 arg0, @OriginalArg(2) int arg1) {
		super.aClass144_Sub3_43.method6982(arg0);
		super.aClass144_Sub3_43.method6988(arg1);
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(IZ)V")
	@Override
	public void method9406(@OriginalArg(1) boolean arg0) {
		@Pc(16) Class161_Sub4 local16 = super.aClass144_Sub3_43.method7027();
		if (this.aClass371_6 == null || local16 == null || !arg0) {
			super.aClass144_Sub3_43.method7021(34168, 0);
			return;
		}
		this.aClass371_6.method8907('\u0000');
		super.aClass144_Sub3_43.method7028(1);
		super.aClass144_Sub3_43.method6982(local16);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass144_Sub3_43.aClass263_Sub1_5.method6420(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass144_Sub3_43.method7028(0);
		this.aBoolean775 = true;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)V")
	@Override
	public void method9402() {
		if (this.aBoolean775) {
			this.aClass371_6.method8907('\u0001');
			super.aClass144_Sub3_43.method7028(1);
			super.aClass144_Sub3_43.method6982((Class161) null);
			super.aClass144_Sub3_43.method7028(0);
		} else {
			super.aClass144_Sub3_43.method7021(5890, 0);
		}
		super.aClass144_Sub3_43.method7025(8448, 8448);
		this.aBoolean775 = false;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9399(@OriginalArg(1) boolean arg0) {
		super.aClass144_Sub3_43.method7025(8448, 7681);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(BII)V")
	@Override
	public void method9398(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
