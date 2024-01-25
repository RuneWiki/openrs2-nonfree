import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class76_Sub1 extends Class76 {

	@OriginalMember(owner = "client!dt", name = "f", descriptor = "Z")
	private boolean aBoolean158 = false;

	@OriginalMember(owner = "client!dt", name = "e", descriptor = "Lclient!hg;")
	private Class136 aClass136_1;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lclient!ok;)V")
	public Class76_Sub1(@OriginalArg(0) Class134_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean512) {
			this.aClass136_1 = new Class136(arg0, 2);
			this.aClass136_1.method2920(0);
			super.aClass134_Sub2_43.method5197(1);
			super.aClass134_Sub2_43.method5224(34165, 7681);
			super.aClass134_Sub2_43.method5200(2, 34168, 770);
			super.aClass134_Sub2_43.method5271(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass134_Sub2_43.method5197(0);
			this.aClass136_1.method2918();
			this.aClass136_1.method2920(1);
			super.aClass134_Sub2_43.method5197(1);
			super.aClass134_Sub2_43.method5224(8448, 8448);
			super.aClass134_Sub2_43.method5200(2, 34166, 770);
			super.aClass134_Sub2_43.method5271(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass134_Sub2_43.method5197(0);
			this.aClass136_1.method2918();
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7607(@OriginalArg(0) boolean arg0) {
		@Pc(12) Class40_Sub4 local12 = super.aClass134_Sub2_43.method5276();
		if (this.aClass136_1 == null || local12 == null || !arg0) {
			super.aClass134_Sub2_43.method5271(34168, 0);
			return;
		}
		this.aClass136_1.method2915('\u0000');
		super.aClass134_Sub2_43.method5197(1);
		super.aClass134_Sub2_43.method5202(local12);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass134_Sub2_43.bf.method2599(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass134_Sub2_43.method5197(0);
		this.aBoolean158 = true;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7613(@OriginalArg(0) boolean arg0) {
		super.aClass134_Sub2_43.method5224(8448, 7681);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILclient!ip;I)V")
	@Override
	public void method7611(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1) {
		super.aClass134_Sub2_43.method5202(arg1);
		super.aClass134_Sub2_43.method5194(arg0);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7606() {
		return true;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V")
	@Override
	public void method7610() {
		if (this.aBoolean158) {
			this.aClass136_1.method2915('\u0001');
			super.aClass134_Sub2_43.method5197(1);
			super.aClass134_Sub2_43.method5202(null);
			super.aClass134_Sub2_43.method5197(0);
		} else {
			super.aClass134_Sub2_43.method5271(5890, 0);
		}
		super.aClass134_Sub2_43.method5224(8448, 8448);
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7608(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
