import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nda")
public final class Class107_Sub4 extends Class107 {

	@OriginalMember(owner = "client!nda", name = "h", descriptor = "Z")
	private boolean aBoolean489 = false;

	@OriginalMember(owner = "client!nda", name = "k", descriptor = "Lclient!eha;")
	private Class91 aClass91_4;

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Lclient!oea;)V")
	public Class107_Sub4(@OriginalArg(0) Class87_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean542) {
			this.aClass91_4 = new Class91(arg0, 2);
			this.aClass91_4.method2499(0);
			super.aClass87_Sub2_37.method6155(1);
			super.aClass87_Sub2_37.method6227(34165, 7681);
			super.aClass87_Sub2_37.method6206(2, 770, 34168);
			super.aClass87_Sub2_37.method6195(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass87_Sub2_37.method6155(0);
			this.aClass91_4.method2495();
			this.aClass91_4.method2499(1);
			super.aClass87_Sub2_37.method6155(1);
			super.aClass87_Sub2_37.method6227(8448, 8448);
			super.aClass87_Sub2_37.method6206(2, 770, 34166);
			super.aClass87_Sub2_37.method6195(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass87_Sub2_37.method6155(0);
			this.aClass91_4.method2495();
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7697(@OriginalArg(0) boolean arg0) {
		super.aClass87_Sub2_37.method6227(8448, 7681);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7696() {
		return true;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(Z)V")
	@Override
	public void method7698() {
		if (this.aBoolean489) {
			this.aClass91_4.method2497('\u0001');
			super.aClass87_Sub2_37.method6155(1);
			super.aClass87_Sub2_37.method6167(null);
			super.aClass87_Sub2_37.method6155(0);
		} else {
			super.aClass87_Sub2_37.method6195(5890, 0);
		}
		super.aClass87_Sub2_37.method6227(8448, 8448);
		this.aBoolean489 = false;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(Lclient!iia;ZI)V")
	@Override
	public void method7695(@OriginalArg(0) Class88 arg0, @OriginalArg(2) int arg1) {
		super.aClass87_Sub2_37.method6167(arg0);
		super.aClass87_Sub2_37.method6159(arg1);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7702(@OriginalArg(1) boolean arg0) {
		@Pc(15) Class88_Sub3 local15 = super.aClass87_Sub2_37.method6174();
		if (this.aClass91_4 == null || local15 == null || !arg0) {
			super.aClass87_Sub2_37.method6195(34168, 0);
			return;
		}
		this.aClass91_4.method2497('\u0000');
		super.aClass87_Sub2_37.method6155(1);
		super.aClass87_Sub2_37.method6167(local15);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass87_Sub2_37.aClass6_Sub1_5.method110(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass87_Sub2_37.method6155(0);
		this.aBoolean489 = true;
	}
}
