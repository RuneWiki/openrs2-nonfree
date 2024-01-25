import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class127_Sub9 extends Class127 {

	@OriginalMember(owner = "client!vp", name = "o", descriptor = "Z")
	private boolean aBoolean711 = false;

	@OriginalMember(owner = "client!vp", name = "i", descriptor = "Lclient!tw;")
	private Class329 aClass329_6;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lclient!kw;)V")
	public Class127_Sub9(@OriginalArg(0) Class5_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean382) {
			this.aClass329_6 = new Class329(arg0, 2);
			this.aClass329_6.method8097(0);
			super.aClass5_Sub2_42.method5004(1);
			super.aClass5_Sub2_42.method4982(7681, 34165);
			super.aClass5_Sub2_42.method5000(34168, 770, 2);
			super.aClass5_Sub2_42.method4969(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass5_Sub2_42.method5004(0);
			this.aClass329_6.method8094();
			this.aClass329_6.method8097(1);
			super.aClass5_Sub2_42.method5004(1);
			super.aClass5_Sub2_42.method4982(8448, 8448);
			super.aClass5_Sub2_42.method5000(34166, 770, 2);
			super.aClass5_Sub2_42.method4969(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass5_Sub2_42.method5004(0);
			this.aClass329_6.method8094();
		}
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8458(@OriginalArg(1) boolean arg0) {
		@Pc(8) Class76_Sub1 local8 = super.aClass5_Sub2_42.method4983();
		if (this.aClass329_6 == null || local8 == null || !arg0) {
			super.aClass5_Sub2_42.method4969(34168, 0);
			return;
		}
		this.aClass329_6.method8098('\u0000');
		super.aClass5_Sub2_42.method5004(1);
		super.aClass5_Sub2_42.method4997(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass5_Sub2_42.aClass39_Sub2_5.method6549(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass5_Sub2_42.method5004(0);
		this.aBoolean711 = true;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8457(@OriginalArg(0) boolean arg0) {
		super.aClass5_Sub2_42.method4982(7681, 8448);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!ou;II)V")
	@Override
	public void method8460(@OriginalArg(0) Class76 arg0, @OriginalArg(2) int arg1) {
		super.aClass5_Sub2_42.method4997(arg0);
		super.aClass5_Sub2_42.method4953(arg1);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8453(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8456() {
		return true;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
	@Override
	public void method8454() {
		if (this.aBoolean711) {
			this.aClass329_6.method8098('\u0001');
			super.aClass5_Sub2_42.method5004(1);
			super.aClass5_Sub2_42.method4997(null);
			super.aClass5_Sub2_42.method5004(0);
		} else {
			super.aClass5_Sub2_42.method4969(5890, 0);
		}
		super.aClass5_Sub2_42.method4982(8448, 8448);
		this.aBoolean711 = false;
	}
}
