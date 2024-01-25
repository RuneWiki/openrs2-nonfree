import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class83_Sub6 extends Class83 {

	@OriginalMember(owner = "client!li", name = "o", descriptor = "Z")
	private boolean aBoolean393 = false;

	@OriginalMember(owner = "client!li", name = "q", descriptor = "Lclient!am;")
	private Class11 aClass11_4;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!mh;)V")
	public Class83_Sub6(@OriginalArg(0) Class4_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean429) {
			this.aClass11_4 = new Class11(arg0, 2);
			this.aClass11_4.method532(0);
			super.aClass4_Sub3_41.method5245(1);
			super.aClass4_Sub3_41.method5266(7681, 34165);
			super.aClass4_Sub3_41.method5293(2, 770, 34168);
			super.aClass4_Sub3_41.method5265(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass4_Sub3_41.method5245(0);
			this.aClass11_4.method537();
			this.aClass11_4.method532(1);
			super.aClass4_Sub3_41.method5245(1);
			super.aClass4_Sub3_41.method5266(8448, 8448);
			super.aClass4_Sub3_41.method5293(2, 770, 34166);
			super.aClass4_Sub3_41.method5265(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass4_Sub3_41.method5245(0);
			this.aClass11_4.method537();
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IBLclient!uu;)V")
	@Override
	public void method7922(@OriginalArg(0) int arg0, @OriginalArg(2) Class164 arg1) {
		super.aClass4_Sub3_41.method5250(arg1);
		super.aClass4_Sub3_41.method5230(arg0);
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7930() {
		return true;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZII)V")
	@Override
	public void method7926(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7927(@OriginalArg(0) boolean arg0) {
		super.aClass4_Sub3_41.method5266(7681, 8448);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
	@Override
	public void method7925() {
		if (this.aBoolean393) {
			this.aClass11_4.method534('\u0001');
			super.aClass4_Sub3_41.method5245(1);
			super.aClass4_Sub3_41.method5250(null);
			super.aClass4_Sub3_41.method5245(0);
		} else {
			super.aClass4_Sub3_41.method5265(0, 5890);
		}
		super.aClass4_Sub3_41.method5266(8448, 8448);
		this.aBoolean393 = false;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7924(@OriginalArg(1) boolean arg0) {
		@Pc(12) Class164_Sub1 local12 = super.aClass4_Sub3_41.method5278();
		if (this.aClass11_4 == null || local12 == null || !arg0) {
			super.aClass4_Sub3_41.method5265(0, 34168);
			return;
		}
		this.aClass11_4.method534('\u0000');
		super.aClass4_Sub3_41.method5245(1);
		super.aClass4_Sub3_41.method5250(local12);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass4_Sub3_41.aClass128_Sub2_4.method4325(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass4_Sub3_41.method5245(0);
		this.aBoolean393 = true;
	}
}
