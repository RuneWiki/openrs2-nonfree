import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class85_Sub2 extends Class85 {

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "Z")
	private boolean aBoolean213 = false;

	@OriginalMember(owner = "client!fq", name = "k", descriptor = "Lclient!qm;")
	private Class285 aClass285_1;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!lj;)V")
	public Class85_Sub2(@OriginalArg(0) Class78_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean424) {
			this.aClass285_1 = new Class285(arg0, 2);
			this.aClass285_1.method6137(0);
			super.aClass78_Sub3_37.method4549(1);
			super.aClass78_Sub3_37.method4539(34165, 7681);
			super.aClass78_Sub3_37.method4493(34168, 2, 770);
			super.aClass78_Sub3_37.method4527(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass78_Sub3_37.method4549(0);
			this.aClass285_1.method6133();
			this.aClass285_1.method6137(1);
			super.aClass78_Sub3_37.method4549(1);
			super.aClass78_Sub3_37.method4539(8448, 8448);
			super.aClass78_Sub3_37.method4493(34166, 2, 770);
			super.aClass78_Sub3_37.method4527(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass78_Sub3_37.method4549(0);
			this.aClass285_1.method6133();
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6291() {
		return true;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IILclient!vf;)V")
	@Override
	public void method6288(@OriginalArg(0) int arg0, @OriginalArg(2) Class46 arg1) {
		super.aClass78_Sub3_37.method4535(arg1);
		super.aClass78_Sub3_37.method4534(arg0);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BZ)V")
	@Override
	public void method6289(@OriginalArg(1) boolean arg0) {
		@Pc(15) Class46_Sub4 local15 = super.aClass78_Sub3_37.method4497();
		if (this.aClass285_1 == null || local15 == null || !arg0) {
			super.aClass78_Sub3_37.method4527(0, 34168);
			return;
		}
		this.aClass285_1.method6136('\u0000');
		super.aClass78_Sub3_37.method4549(1);
		super.aClass78_Sub3_37.method4535(local15);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass78_Sub3_37.aClass34_Sub2_4.method978(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass78_Sub3_37.method4549(0);
		this.aBoolean213 = true;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)V")
	@Override
	public void method6292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6294(@OriginalArg(0) boolean arg0) {
		super.aClass78_Sub3_37.method4539(8448, 7681);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)V")
	@Override
	public void method6287() {
		if (this.aBoolean213) {
			this.aClass285_1.method6136('\u0001');
			super.aClass78_Sub3_37.method4549(1);
			super.aClass78_Sub3_37.method4535(null);
			super.aClass78_Sub3_37.method4549(0);
		} else {
			super.aClass78_Sub3_37.method4527(0, 5890);
		}
		super.aClass78_Sub3_37.method4539(8448, 8448);
		this.aBoolean213 = false;
	}
}
