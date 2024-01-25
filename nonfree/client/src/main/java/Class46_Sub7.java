import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class46_Sub7 extends Class46 {

	@OriginalMember(owner = "client!nl", name = "o", descriptor = "Z")
	private boolean aBoolean454 = false;

	@OriginalMember(owner = "client!nl", name = "i", descriptor = "Lclient!eaa;")
	private Class79 aClass79_5;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class46_Sub7(@OriginalArg(0) Class45_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean691) {
			this.aClass79_5 = new Class79(arg0, 2);
			this.aClass79_5.method1921(0);
			super.aClass45_Sub3_40.method7510(1);
			super.aClass45_Sub3_40.method7491(34165, 7681);
			super.aClass45_Sub3_40.method7507(770, 34168, 2);
			super.aClass45_Sub3_40.method7450(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass45_Sub3_40.method7510(0);
			this.aClass79_5.method1925();
			this.aClass79_5.method1921(1);
			super.aClass45_Sub3_40.method7510(1);
			super.aClass45_Sub3_40.method7491(8448, 8448);
			super.aClass45_Sub3_40.method7507(770, 34166, 2);
			super.aClass45_Sub3_40.method7450(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass45_Sub3_40.method7510(0);
			this.aClass79_5.method1925();
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7200(@OriginalArg(1) boolean arg0) {
		@Pc(13) Class24_Sub3 local13 = super.aClass45_Sub3_40.method7446();
		if (this.aClass79_5 == null || local13 == null || !arg0) {
			super.aClass45_Sub3_40.method7450(0, 34168);
			return;
		}
		this.aClass79_5.method1924('\u0000');
		super.aClass45_Sub3_40.method7510(1);
		super.aClass45_Sub3_40.method7475(local13);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass45_Sub3_40.aClass11_Sub2_5.method4271(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass45_Sub3_40.method7510(0);
		this.aBoolean454 = true;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)V")
	@Override
	public void method7202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)V")
	@Override
	public void method7205() {
		if (this.aBoolean454) {
			this.aClass79_5.method1924('\u0001');
			super.aClass45_Sub3_40.method7510(1);
			super.aClass45_Sub3_40.method7475(null);
			super.aClass45_Sub3_40.method7510(0);
		} else {
			super.aClass45_Sub3_40.method7450(0, 5890);
		}
		super.aClass45_Sub3_40.method7491(8448, 8448);
		this.aBoolean454 = false;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7206(@OriginalArg(0) boolean arg0) {
		super.aClass45_Sub3_40.method7491(8448, 7681);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IILclient!av;)V")
	@Override
	public void method7208(@OriginalArg(1) int arg0, @OriginalArg(2) Class24 arg1) {
		super.aClass45_Sub3_40.method7475(arg1);
		super.aClass45_Sub3_40.method7500(arg0);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7207() {
		return true;
	}
}
