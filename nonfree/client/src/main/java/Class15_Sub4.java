import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class15_Sub4 extends Class15 {

	@OriginalMember(owner = "client!kq", name = "r", descriptor = "Z")
	private boolean aBoolean371 = false;

	@OriginalMember(owner = "client!kq", name = "n", descriptor = "Lclient!sr;")
	private Class307 aClass307_3;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!er;)V")
	public Class15_Sub4(@OriginalArg(0) Class31_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean205) {
			this.aClass307_3 = new Class307(arg0, 2);
			this.aClass307_3.method6701(0);
			super.aClass31_Sub2_40.method2513(1);
			super.aClass31_Sub2_40.method2536(7681, 34165);
			super.aClass31_Sub2_40.method2523(770, 34168, 2);
			super.aClass31_Sub2_40.method2499(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass31_Sub2_40.method2513(0);
			this.aClass307_3.method6702();
			this.aClass307_3.method6701(1);
			super.aClass31_Sub2_40.method2513(1);
			super.aClass31_Sub2_40.method2536(8448, 8448);
			super.aClass31_Sub2_40.method2523(770, 34166, 2);
			super.aClass31_Sub2_40.method2499(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass31_Sub2_40.method2513(0);
			this.aClass307_3.method6702();
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6946() {
		return true;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6942(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class50_Sub4 local8 = super.aClass31_Sub2_40.method2559();
		if (this.aClass307_3 == null || local8 == null || !arg0) {
			super.aClass31_Sub2_40.method2499(34168, 0);
			return;
		}
		this.aClass307_3.method6699('\u0000');
		super.aClass31_Sub2_40.method2513(1);
		super.aClass31_Sub2_40.method2535(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass31_Sub2_40.aClass42_Sub1_4.method1224(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass31_Sub2_40.method2513(0);
		this.aBoolean371 = true;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILclient!ep;I)V")
	@Override
	public void method6947(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
		super.aClass31_Sub2_40.method2535(arg0);
		super.aClass31_Sub2_40.method2495(arg1);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6945(@OriginalArg(0) boolean arg0) {
		super.aClass31_Sub2_40.method2536(7681, 8448);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
	@Override
	public void method6944() {
		if (this.aBoolean371) {
			this.aClass307_3.method6699('\u0001');
			super.aClass31_Sub2_40.method2513(1);
			super.aClass31_Sub2_40.method2535(null);
			super.aClass31_Sub2_40.method2513(0);
		} else {
			super.aClass31_Sub2_40.method2499(5890, 0);
		}
		super.aClass31_Sub2_40.method2536(8448, 8448);
		this.aBoolean371 = false;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(III)V")
	@Override
	public void method6948(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
