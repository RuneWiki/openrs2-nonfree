import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class44_Sub6 extends Class44 {

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "Z")
	private boolean aBoolean411 = false;

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "Lclient!u;")
	private Class326 aClass326_3;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lclient!no;)V")
	public Class44_Sub6(@OriginalArg(0) Class66_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean465) {
			this.aClass326_3 = new Class326(arg0, 2);
			this.aClass326_3.method7293(0);
			super.aClass66_Sub3_38.method5381(1);
			super.aClass66_Sub3_38.method5396(7681, 34165);
			super.aClass66_Sub3_38.method5361(770, 2, 34168);
			super.aClass66_Sub3_38.method5424(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass66_Sub3_38.method5381(0);
			this.aClass326_3.method7295();
			this.aClass326_3.method7293(1);
			super.aClass66_Sub3_38.method5381(1);
			super.aClass66_Sub3_38.method5396(8448, 8448);
			super.aClass66_Sub3_38.method5361(770, 2, 34166);
			super.aClass66_Sub3_38.method5424(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass66_Sub3_38.method5381(0);
			this.aClass326_3.method7295();
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
	@Override
	public void method7482() {
		if (this.aBoolean411) {
			this.aClass326_3.method7292('\u0001');
			super.aClass66_Sub3_38.method5381(1);
			super.aClass66_Sub3_38.method5382(null);
			super.aClass66_Sub3_38.method5381(0);
		} else {
			super.aClass66_Sub3_38.method5424(0, 5890);
		}
		super.aClass66_Sub3_38.method5396(8448, 8448);
		this.aBoolean411 = false;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)V")
	@Override
	public void method7476(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7479(@OriginalArg(1) boolean arg0) {
		super.aClass66_Sub3_38.method5396(7681, 8448);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7477(@OriginalArg(1) boolean arg0) {
		@Pc(8) Class114_Sub3 local8 = super.aClass66_Sub3_38.method5385();
		if (this.aClass326_3 == null || local8 == null || !arg0) {
			super.aClass66_Sub3_38.method5424(0, 34168);
			return;
		}
		this.aClass326_3.method7292('\u0000');
		super.aClass66_Sub3_38.method5381(1);
		super.aClass66_Sub3_38.method5382(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass66_Sub3_38.aClass134_Sub2_3.method3451(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass66_Sub3_38.method5381(0);
		this.aBoolean411 = true;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILclient!hf;)V")
	@Override
	public void method7478(@OriginalArg(1) int arg0, @OriginalArg(2) Class114 arg1) {
		super.aClass66_Sub3_38.method5382(arg1);
		super.aClass66_Sub3_38.method5355(arg0);
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7484() {
		return true;
	}
}
