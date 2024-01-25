import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class69_Sub7 extends Class69 {

	@OriginalMember(owner = "client!mt", name = "o", descriptor = "Z")
	private boolean aBoolean497 = false;

	@OriginalMember(owner = "client!mt", name = "p", descriptor = "Lclient!kca;")
	private Class203 aClass203_5;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!ml;)V")
	public Class69_Sub7(@OriginalArg(0) Class75_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean483) {
			this.aClass203_5 = new Class203(arg0, 2);
			this.aClass203_5.method4857(0);
			super.aClass75_Sub3_41.method5775(1);
			super.aClass75_Sub3_41.method5784(7681, 34165);
			super.aClass75_Sub3_41.method5825(770, 2, 34168);
			super.aClass75_Sub3_41.method5806(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass75_Sub3_41.method5775(0);
			this.aClass203_5.method4854();
			this.aClass203_5.method4857(1);
			super.aClass75_Sub3_41.method5775(1);
			super.aClass75_Sub3_41.method5784(8448, 8448);
			super.aClass75_Sub3_41.method5825(770, 2, 34166);
			super.aClass75_Sub3_41.method5806(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass75_Sub3_41.method5775(0);
			this.aClass203_5.method4854();
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8637() {
		return true;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IZLclient!ica;)V")
	@Override
	public void method8631(@OriginalArg(0) int arg0, @OriginalArg(2) Class44 arg1) {
		super.aClass75_Sub3_41.method5774(arg1);
		super.aClass75_Sub3_41.method5787(arg0);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8632(@OriginalArg(0) boolean arg0) {
		super.aClass75_Sub3_41.method5784(7681, 8448);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8635(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class44_Sub2 local8 = super.aClass75_Sub3_41.method5807();
		if (this.aClass203_5 == null || local8 == null || !arg0) {
			super.aClass75_Sub3_41.method5806(0, 34168);
			return;
		}
		this.aClass203_5.method4855('\u0000');
		super.aClass75_Sub3_41.method5775(1);
		super.aClass75_Sub3_41.method5774(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass75_Sub3_41.aClass109_Sub2_5.method3691(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass75_Sub3_41.method5775(0);
		this.aBoolean497 = true;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V")
	@Override
	public void method8638() {
		if (this.aBoolean497) {
			this.aClass203_5.method4855('\u0001');
			super.aClass75_Sub3_41.method5775(1);
			super.aClass75_Sub3_41.method5774((Class44) null);
			super.aClass75_Sub3_41.method5775(0);
		} else {
			super.aClass75_Sub3_41.method5806(0, 5890);
		}
		super.aClass75_Sub3_41.method5784(8448, 8448);
		this.aBoolean497 = false;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
