import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class84_Sub2 extends Class84 {

	@OriginalMember(owner = "client!gl", name = "j", descriptor = "Z")
	private boolean aBoolean172 = false;

	@OriginalMember(owner = "client!gl", name = "r", descriptor = "Lclient!bw;")
	private Class32 aClass32_1;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!od;)V")
	public Class84_Sub2(@OriginalArg(0) Class128_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean368) {
			this.aClass32_1 = new Class32(arg0, 2);
			this.aClass32_1.method657(0);
			super.aClass128_Sub2_39.method3667(1);
			super.aClass128_Sub2_39.method3622(7681, 34165);
			super.aClass128_Sub2_39.method3647(34168, 770, 2);
			super.aClass128_Sub2_39.method3626(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass128_Sub2_39.method3667(0);
			this.aClass32_1.method658();
			this.aClass32_1.method657(1);
			super.aClass128_Sub2_39.method3667(1);
			super.aClass128_Sub2_39.method3622(8448, 8448);
			super.aClass128_Sub2_39.method3647(34166, 770, 2);
			super.aClass128_Sub2_39.method3626(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass128_Sub2_39.method3667(0);
			this.aClass32_1.method658();
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V")
	@Override
	public void method5153() {
		if (this.aBoolean172) {
			this.aClass32_1.method651('\u0001');
			super.aClass128_Sub2_39.method3667(1);
			super.aClass128_Sub2_39.method3691(null);
			super.aClass128_Sub2_39.method3667(0);
		} else {
			super.aClass128_Sub2_39.method3626(0, 5890);
		}
		super.aClass128_Sub2_39.method3622(8448, 8448);
		this.aBoolean172 = false;
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5155() {
		return true;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5149(@OriginalArg(0) boolean arg0) {
		@Pc(13) Class5_Sub4 local13 = super.aClass128_Sub2_39.method3642();
		if (this.aClass32_1 == null || local13 == null || !arg0) {
			super.aClass128_Sub2_39.method3626(0, 34168);
			return;
		}
		this.aClass32_1.method651('\u0000');
		super.aClass128_Sub2_39.method3667(1);
		super.aClass128_Sub2_39.method3691(local13);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass128_Sub2_39.aClass40_Sub2_4.method1130(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass128_Sub2_39.method3667(0);
		this.aBoolean172 = true;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!jk;IB)V")
	@Override
	public void method5152(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1) {
		super.aClass128_Sub2_39.method3691(arg0);
		super.aClass128_Sub2_39.method3677(arg1);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5150(@OriginalArg(0) boolean arg0) {
		super.aClass128_Sub2_39.method3622(7681, 8448);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)V")
	@Override
	public void method5154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
