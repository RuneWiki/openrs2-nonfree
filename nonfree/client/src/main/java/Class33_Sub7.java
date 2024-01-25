import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!taa")
public final class Class33_Sub7 extends Class33 {

	@OriginalMember(owner = "client!taa", name = "i", descriptor = "Z")
	private boolean aBoolean692 = false;

	@OriginalMember(owner = "client!taa", name = "l", descriptor = "Lclient!oi;")
	private Class261 aClass261_5;

	@OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Lclient!qfa;)V")
	public Class33_Sub7(@OriginalArg(0) Class137_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean605) {
			this.aClass261_5 = new Class261(arg0, 2);
			this.aClass261_5.method6286(0);
			super.aClass137_Sub3_42.method7095(1);
			super.aClass137_Sub3_42.method7084(7681, 34165);
			super.aClass137_Sub3_42.method7071(34168, 770, 2);
			super.aClass137_Sub3_42.method7027(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass137_Sub3_42.method7095(0);
			this.aClass261_5.method6287();
			this.aClass261_5.method6286(1);
			super.aClass137_Sub3_42.method7095(1);
			super.aClass137_Sub3_42.method7084(8448, 8448);
			super.aClass137_Sub3_42.method7071(34166, 770, 2);
			super.aClass137_Sub3_42.method7027(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass137_Sub3_42.method7095(0);
			this.aClass261_5.method6287();
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(BII)V")
	@Override
	public void method8849(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8847(@OriginalArg(0) boolean arg0) {
		super.aClass137_Sub3_42.method7084(7681, 8448);
	}

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "(I)V")
	@Override
	public void method8848() {
		if (this.aBoolean692) {
			this.aClass261_5.method6285('\u0001');
			super.aClass137_Sub3_42.method7095(1);
			super.aClass137_Sub3_42.method7090((Class66) null);
			super.aClass137_Sub3_42.method7095(0);
		} else {
			super.aClass137_Sub3_42.method7027(5890, 0);
		}
		super.aClass137_Sub3_42.method7084(8448, 8448);
		this.aBoolean692 = false;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8846() {
		return true;
	}

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "(ZI)V")
	@Override
	public void method8854(@OriginalArg(0) boolean arg0) {
		@Pc(12) Class66_Sub4 local12 = super.aClass137_Sub3_42.method7085();
		if (this.aClass261_5 == null || local12 == null || !arg0) {
			super.aClass137_Sub3_42.method7027(34168, 0);
			return;
		}
		this.aClass261_5.method6285('\u0000');
		super.aClass137_Sub3_42.method7095(1);
		super.aClass137_Sub3_42.method7090(local12);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass137_Sub3_42.aClass26_Sub3_5.method6463(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass137_Sub3_42.method7095(0);
		this.aBoolean692 = true;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(IZLclient!dca;)V")
	@Override
	public void method8851(@OriginalArg(0) int arg0, @OriginalArg(2) Class66 arg1) {
		super.aClass137_Sub3_42.method7090(arg1);
		super.aClass137_Sub3_42.method7077(arg0);
	}
}
