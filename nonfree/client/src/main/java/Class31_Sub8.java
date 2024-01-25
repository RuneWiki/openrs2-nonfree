import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class31_Sub8 extends Class31 {

	@OriginalMember(owner = "client!tu", name = "o", descriptor = "Z")
	private boolean aBoolean743 = false;

	@OriginalMember(owner = "client!tu", name = "i", descriptor = "Lclient!bfa;")
	private Class30 aClass30_5;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lclient!lea;)V")
	public Class31_Sub8(@OriginalArg(0) Class101_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean453) {
			this.aClass30_5 = new Class30(arg0, 2);
			this.aClass30_5.method944(0);
			super.aClass101_Sub2_43.method5627(1);
			super.aClass101_Sub2_43.method5665(34165, 7681);
			super.aClass101_Sub2_43.method5657(770, 2, 34168);
			super.aClass101_Sub2_43.method5680(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass101_Sub2_43.method5627(0);
			this.aClass30_5.method941();
			this.aClass30_5.method944(1);
			super.aClass101_Sub2_43.method5627(1);
			super.aClass101_Sub2_43.method5665(8448, 8448);
			super.aClass101_Sub2_43.method5657(770, 2, 34166);
			super.aClass101_Sub2_43.method5680(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass101_Sub2_43.method5627(0);
			this.aClass30_5.method941();
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZI)V")
	@Override
	public void method9603(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V")
	@Override
	public void method9597() {
		if (this.aBoolean743) {
			this.aClass30_5.method940('\u0001');
			super.aClass101_Sub2_43.method5627(1);
			super.aClass101_Sub2_43.method5690((Class50) null);
			super.aClass101_Sub2_43.method5627(0);
		} else {
			super.aClass101_Sub2_43.method5680(0, 5890);
		}
		super.aClass101_Sub2_43.method5665(8448, 8448);
		this.aBoolean743 = false;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZI)V")
	@Override
	public void method9600(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class50_Sub3 local8 = super.aClass101_Sub2_43.method5637();
		if (this.aClass30_5 == null || local8 == null || !arg0) {
			super.aClass101_Sub2_43.method5680(0, 34168);
			return;
		}
		this.aClass30_5.method940('\u0000');
		super.aClass101_Sub2_43.method5627(1);
		super.aClass101_Sub2_43.method5690(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass101_Sub2_43.aClass76_Sub1_5.method4553(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass101_Sub2_43.method5627(0);
		this.aBoolean743 = true;
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9604() {
		return true;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9602(@OriginalArg(0) boolean arg0) {
		super.aClass101_Sub2_43.method5665(8448, 7681);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILclient!fga;I)V")
	@Override
	public void method9598(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
		super.aClass101_Sub2_43.method5690(arg0);
		super.aClass101_Sub2_43.method5681(arg1);
	}
}
