import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mga")
public final class Class13_Sub6 extends Class13 {

	@OriginalMember(owner = "client!mga", name = "h", descriptor = "Z")
	private boolean aBoolean460 = false;

	@OriginalMember(owner = "client!mga", name = "g", descriptor = "Lclient!qha;")
	private Class273 aClass273_4;

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Lclient!nv;)V")
	public Class13_Sub6(@OriginalArg(0) Class16_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean510) {
			this.aClass273_4 = new Class273(arg0, 2);
			this.aClass273_4.method6909(0);
			super.aClass16_Sub3_42.method5944(1);
			super.aClass16_Sub3_42.method5957(34165, 7681);
			super.aClass16_Sub3_42.method6025(770, 2, 34168);
			super.aClass16_Sub3_42.method6029(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass16_Sub3_42.method5944(0);
			this.aClass273_4.method6915();
			this.aClass273_4.method6909(1);
			super.aClass16_Sub3_42.method5944(1);
			super.aClass16_Sub3_42.method5957(8448, 8448);
			super.aClass16_Sub3_42.method6025(770, 2, 34166);
			super.aClass16_Sub3_42.method6029(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass16_Sub3_42.method5944(0);
			this.aClass273_4.method6915();
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lclient!tha;II)V")
	@Override
	public void method8264(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1) {
		super.aClass16_Sub3_42.method6020(arg0);
		super.aClass16_Sub3_42.method5972(arg1);
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)V")
	@Override
	public void method8260() {
		if (this.aBoolean460) {
			this.aClass273_4.method6916('\u0001');
			super.aClass16_Sub3_42.method5944(1);
			super.aClass16_Sub3_42.method6020(null);
			super.aClass16_Sub3_42.method5944(0);
		} else {
			super.aClass16_Sub3_42.method6029(0, 5890);
		}
		super.aClass16_Sub3_42.method5957(8448, 8448);
		this.aBoolean460 = false;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8263(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8266(@OriginalArg(1) boolean arg0) {
		super.aClass16_Sub3_42.method5957(8448, 7681);
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8268(@OriginalArg(1) boolean arg0) {
		@Pc(8) Class20_Sub3 local8 = super.aClass16_Sub3_42.method5949();
		if (this.aClass273_4 == null || local8 == null || !arg0) {
			super.aClass16_Sub3_42.method6029(0, 34168);
			return;
		}
		this.aClass273_4.method6916('\u0000');
		super.aClass16_Sub3_42.method5944(1);
		super.aClass16_Sub3_42.method6020(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass16_Sub3_42.aClass54_Sub2_5.method2598(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass16_Sub3_42.method5944(0);
		this.aBoolean460 = true;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8265() {
		return true;
	}
}
