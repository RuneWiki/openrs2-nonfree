import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class59_Sub1 extends Class59 {

	@OriginalMember(owner = "client!cp", name = "f", descriptor = "Z")
	private boolean aBoolean181 = false;

	@OriginalMember(owner = "client!cp", name = "l", descriptor = "Lclient!vh;")
	private Class365 aClass365_1;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lclient!bi;)V")
	public Class59_Sub1(@OriginalArg(0) Class13_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean106) {
			this.aClass365_1 = new Class365(arg0, 2);
			this.aClass365_1.method8546(0);
			super.aClass13_Sub2_43.method1093(1);
			super.aClass13_Sub2_43.method1045(34165, 7681);
			super.aClass13_Sub2_43.method1021(34168, 770, 2);
			super.aClass13_Sub2_43.method1034(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass13_Sub2_43.method1093(0);
			this.aClass365_1.method8549();
			this.aClass365_1.method8546(1);
			super.aClass13_Sub2_43.method1093(1);
			super.aClass13_Sub2_43.method1045(8448, 8448);
			super.aClass13_Sub2_43.method1021(34166, 770, 2);
			super.aClass13_Sub2_43.method1034(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass13_Sub2_43.method1093(0);
			this.aClass365_1.method8549();
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IILclient!cj;)V")
	@Override
	public void method8587(@OriginalArg(1) int arg0, @OriginalArg(2) Class10 arg1) {
		super.aClass13_Sub2_43.method1096(arg1);
		super.aClass13_Sub2_43.method1046(arg0);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)V")
	@Override
	public void method8590() {
		if (this.aBoolean181) {
			this.aClass365_1.method8548('\u0001');
			super.aClass13_Sub2_43.method1093(1);
			super.aClass13_Sub2_43.method1096((Class10) null);
			super.aClass13_Sub2_43.method1093(0);
		} else {
			super.aClass13_Sub2_43.method1034(5890, 0);
		}
		super.aClass13_Sub2_43.method1045(8448, 8448);
		this.aBoolean181 = false;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8588() {
		return true;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8589(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8593(@OriginalArg(0) boolean arg0) {
		@Pc(12) Class10_Sub3 local12 = super.aClass13_Sub2_43.method1059();
		if (this.aClass365_1 == null || local12 == null || !arg0) {
			super.aClass13_Sub2_43.method1034(34168, 0);
			return;
		}
		this.aClass365_1.method8548('\u0000');
		super.aClass13_Sub2_43.method1093(1);
		super.aClass13_Sub2_43.method1096(local12);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass13_Sub2_43.aClass51_Sub3_5.method6727(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass13_Sub2_43.method1093(0);
		this.aBoolean181 = true;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8591(@OriginalArg(0) boolean arg0) {
		super.aClass13_Sub2_43.method1045(8448, 7681);
	}
}
