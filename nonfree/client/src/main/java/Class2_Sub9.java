import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class2_Sub9 extends Class2 {

	@OriginalMember(owner = "client!us", name = "o", descriptor = "Z")
	private boolean aBoolean471 = false;

	@OriginalMember(owner = "client!us", name = "q", descriptor = "Lclient!gs;")
	private Class98 aClass98_6;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lclient!bv;)V")
	public Class2_Sub9(@OriginalArg(0) Class30_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean78) {
			this.aClass98_6 = new Class98(arg0, 2);
			this.aClass98_6.method2003(0);
			super.aClass30_Sub1_42.method948(1);
			super.aClass30_Sub1_42.method905(7681, 34165);
			super.aClass30_Sub1_42.method957(34168, 770, 2);
			super.aClass30_Sub1_42.method954(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass30_Sub1_42.method948(0);
			this.aClass98_6.method2004();
			this.aClass98_6.method2003(1);
			super.aClass30_Sub1_42.method948(1);
			super.aClass30_Sub1_42.method905(8448, 8448);
			super.aClass30_Sub1_42.method957(34166, 770, 2);
			super.aClass30_Sub1_42.method954(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass30_Sub1_42.method948(0);
			this.aClass98_6.method2004();
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5383(@OriginalArg(0) boolean arg0) {
		super.aClass30_Sub1_42.method905(7681, 8448);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V")
	@Override
	public void method5384() {
		if (this.aBoolean471) {
			this.aClass98_6.method2005('\u0001');
			super.aClass30_Sub1_42.method948(1);
			super.aClass30_Sub1_42.method916(null);
			super.aClass30_Sub1_42.method948(0);
		} else {
			super.aClass30_Sub1_42.method954(0, 5890);
		}
		super.aClass30_Sub1_42.method905(8448, 8448);
		this.aBoolean471 = false;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(III)V")
	@Override
	public void method5385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5380() {
		return true;
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(ZI)V")
	@Override
	public void method5386(@OriginalArg(0) boolean arg0) {
		@Pc(14) Class1_Sub2 local14 = super.aClass30_Sub1_42.method934();
		if (this.aClass98_6 == null || local14 == null || !arg0) {
			super.aClass30_Sub1_42.method954(0, 34168);
			return;
		}
		this.aClass98_6.method2005('\u0000');
		super.aClass30_Sub1_42.method948(1);
		super.aClass30_Sub1_42.method916(local14);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass30_Sub1_42.aClass116_Sub2_3.method4597(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass30_Sub1_42.method948(0);
		this.aBoolean471 = true;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IILclient!kv;)V")
	@Override
	public void method5382(@OriginalArg(0) int arg0, @OriginalArg(2) Class1 arg1) {
		super.aClass30_Sub1_42.method916(arg1);
		super.aClass30_Sub1_42.method923(arg0);
	}
}
