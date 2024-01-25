import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hea")
public final class Class60_Sub3 extends Class60 {

	@OriginalMember(owner = "client!hea", name = "k", descriptor = "Z")
	private boolean aBoolean286 = false;

	@OriginalMember(owner = "client!hea", name = "r", descriptor = "Lclient!qda;")
	private Class271 aClass271_2;

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lclient!us;)V")
	public Class60_Sub3(@OriginalArg(0) Class43_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean685) {
			this.aClass271_2 = new Class271(arg0, 2);
			this.aClass271_2.method6059(0);
			super.aClass43_Sub3_43.method7277(1);
			super.aClass43_Sub3_43.method7287(7681, 34165);
			super.aClass43_Sub3_43.method7225(2, 770, 34168);
			super.aClass43_Sub3_43.method7282(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass43_Sub3_43.method7277(0);
			this.aClass271_2.method6054();
			this.aClass271_2.method6059(1);
			super.aClass43_Sub3_43.method7277(1);
			super.aClass43_Sub3_43.method7287(8448, 8448);
			super.aClass43_Sub3_43.method7225(2, 770, 34166);
			super.aClass43_Sub3_43.method7282(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass43_Sub3_43.method7277(0);
			this.aClass271_2.method6054();
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)V")
	@Override
	public void method7732() {
		if (this.aBoolean286) {
			this.aClass271_2.method6056('\u0001');
			super.aClass43_Sub3_43.method7277(1);
			super.aClass43_Sub3_43.method7220(null);
			super.aClass43_Sub3_43.method7277(0);
		} else {
			super.aClass43_Sub3_43.method7282(5890, 0);
		}
		super.aClass43_Sub3_43.method7287(8448, 8448);
		this.aBoolean286 = false;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7735() {
		return true;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7730(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class34_Sub4 local8 = super.aClass43_Sub3_43.method7261();
		if (this.aClass271_2 == null || local8 == null || !arg0) {
			super.aClass43_Sub3_43.method7282(34168, 0);
			return;
		}
		this.aClass271_2.method6056('\u0000');
		super.aClass43_Sub3_43.method7277(1);
		super.aClass43_Sub3_43.method7220(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass43_Sub3_43.aClass109_Sub2_5.method6770(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass43_Sub3_43.method7277(0);
		this.aBoolean286 = true;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7733(@OriginalArg(0) boolean arg0) {
		super.aClass43_Sub3_43.method7287(7681, 8448);
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IBLclient!um;)V")
	@Override
	public void method7737(@OriginalArg(0) int arg0, @OriginalArg(2) Class34 arg1) {
		super.aClass43_Sub3_43.method7220(arg1);
		super.aClass43_Sub3_43.method7281(arg0);
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
