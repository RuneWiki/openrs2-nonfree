import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class52_Sub4 extends Class52 {

	@OriginalMember(owner = "client!in", name = "q", descriptor = "Z")
	private boolean aBoolean246 = false;

	@OriginalMember(owner = "client!in", name = "A", descriptor = "Lclient!hea;")
	private Class131 aClass131_3;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lclient!pea;)V")
	public Class52_Sub4(@OriginalArg(0) Class121_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean456) {
			this.aClass131_3 = new Class131(arg0, 2);
			this.aClass131_3.method2755(0);
			super.aClass121_Sub3_43.method5648(1);
			super.aClass121_Sub3_43.method5659(7681, 34165);
			super.aClass121_Sub3_43.method5685(770, 34168, 2);
			super.aClass121_Sub3_43.method5717(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass121_Sub3_43.method5648(0);
			this.aClass131_3.method2754();
			this.aClass131_3.method2755(1);
			super.aClass121_Sub3_43.method5648(1);
			super.aClass121_Sub3_43.method5659(8448, 8448);
			super.aClass121_Sub3_43.method5685(770, 34166, 2);
			super.aClass121_Sub3_43.method5717(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass121_Sub3_43.method5648(0);
			this.aClass131_3.method2754();
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7599(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
	@Override
	public void method7598() {
		if (this.aBoolean246) {
			this.aClass131_3.method2752('\u0001');
			super.aClass121_Sub3_43.method5648(1);
			super.aClass121_Sub3_43.method5713(null);
			super.aClass121_Sub3_43.method5648(0);
		} else {
			super.aClass121_Sub3_43.method5717(0, 5890);
		}
		super.aClass121_Sub3_43.method5659(8448, 8448);
		this.aBoolean246 = false;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7603(@OriginalArg(0) boolean arg0) {
		super.aClass121_Sub3_43.method5659(7681, 8448);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7601() {
		return true;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BLclient!wq;I)V")
	@Override
	public void method7604(@OriginalArg(1) Class35 arg0, @OriginalArg(2) int arg1) {
		super.aClass121_Sub3_43.method5713(arg0);
		super.aClass121_Sub3_43.method5684(arg1);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7605(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class35_Sub2 local8 = super.aClass121_Sub3_43.method5688();
		if (this.aClass131_3 == null || local8 == null || !arg0) {
			super.aClass121_Sub3_43.method5717(0, 34168);
			return;
		}
		this.aClass131_3.method2752('\u0000');
		super.aClass121_Sub3_43.method5648(1);
		super.aClass121_Sub3_43.method5713(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass121_Sub3_43.aClass34_Sub2_3.method2288(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass121_Sub3_43.method5648(0);
		this.aBoolean246 = true;
	}
}
