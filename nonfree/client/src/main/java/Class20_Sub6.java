import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mea")
public final class Class20_Sub6 extends Class20 {

	@OriginalMember(owner = "client!mea", name = "r", descriptor = "Z")
	private boolean aBoolean456 = false;

	@OriginalMember(owner = "client!mea", name = "j", descriptor = "Lclient!qt;")
	private Class279 aClass279_3;

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lclient!kga;)V")
	public Class20_Sub6(@OriginalArg(0) Class44_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean416) {
			this.aClass279_3 = new Class279(arg0, 2);
			this.aClass279_3.method6794(0);
			super.aClass44_Sub3_42.method4648(1);
			super.aClass44_Sub3_42.method4621(34165, 7681);
			super.aClass44_Sub3_42.method4641(770, 2, 34168);
			super.aClass44_Sub3_42.method4611(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass44_Sub3_42.method4648(0);
			this.aClass279_3.method6799();
			this.aClass279_3.method6794(1);
			super.aClass44_Sub3_42.method4648(1);
			super.aClass44_Sub3_42.method4621(8448, 8448);
			super.aClass44_Sub3_42.method4641(770, 2, 34166);
			super.aClass44_Sub3_42.method4611(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass44_Sub3_42.method4648(0);
			this.aClass279_3.method6799();
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lclient!jf;II)V")
	@Override
	public void method7863(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1) {
		super.aClass44_Sub3_42.method4605(arg0);
		super.aClass44_Sub3_42.method4658(arg1);
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7870(@OriginalArg(1) boolean arg0) {
		super.aClass44_Sub3_42.method4621(8448, 7681);
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7862(@OriginalArg(0) boolean arg0) {
		@Pc(19) Class77_Sub4 local19 = super.aClass44_Sub3_42.method4603();
		if (this.aClass279_3 == null || local19 == null || !arg0) {
			super.aClass44_Sub3_42.method4611(34168, 0);
			return;
		}
		this.aClass279_3.method6798('\u0000');
		super.aClass44_Sub3_42.method4648(1);
		super.aClass44_Sub3_42.method4605(local19);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass44_Sub3_42.bf.method939(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass44_Sub3_42.method4648(0);
		this.aBoolean456 = true;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Z)V")
	@Override
	public void method7867() {
		if (this.aBoolean456) {
			this.aClass279_3.method6798('\u0001');
			super.aClass44_Sub3_42.method4648(1);
			super.aClass44_Sub3_42.method4605(null);
			super.aClass44_Sub3_42.method4648(0);
		} else {
			super.aClass44_Sub3_42.method4611(5890, 0);
		}
		super.aClass44_Sub3_42.method4621(8448, 8448);
		this.aBoolean456 = false;
	}

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7868() {
		return true;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(III)V")
	@Override
	public void method7864(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
