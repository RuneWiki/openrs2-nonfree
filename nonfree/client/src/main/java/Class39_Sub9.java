import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class39_Sub9 extends Class39 {

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "Z")
	private boolean aBoolean548 = false;

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "Lclient!uv;")
	private Class260 aClass260_6;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lclient!bt;)V")
	public Class39_Sub9(@OriginalArg(0) Class30_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean34) {
			this.aClass260_6 = new Class260(arg0, 2);
			this.aClass260_6.method5892(0);
			super.aClass30_Sub1_42.method726(1);
			super.aClass30_Sub1_42.method724(34165, 7681);
			super.aClass30_Sub1_42.method752(34168, 770, 2);
			super.aClass30_Sub1_42.method690(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass30_Sub1_42.method726(0);
			this.aClass260_6.method5894();
			this.aClass260_6.method5892(1);
			super.aClass30_Sub1_42.method726(1);
			super.aClass30_Sub1_42.method724(8448, 8448);
			super.aClass30_Sub1_42.method752(34166, 770, 2);
			super.aClass30_Sub1_42.method690(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass30_Sub1_42.method726(0);
			this.aClass260_6.method5894();
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5999(@OriginalArg(1) boolean arg0) {
		@Pc(8) Class62_Sub3 local8 = super.aClass30_Sub1_42.method766();
		if (this.aClass260_6 == null || local8 == null || !arg0) {
			super.aClass30_Sub1_42.method690(34168, 0);
			return;
		}
		this.aClass260_6.method5895('\u0000');
		super.aClass30_Sub1_42.method726(1);
		super.aClass30_Sub1_42.method730(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass30_Sub1_42.aClass72_Sub2_4.method2190(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass30_Sub1_42.method726(0);
		this.aBoolean548 = true;
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method6000() {
		return true;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5996(@OriginalArg(0) boolean arg0) {
		super.aClass30_Sub1_42.method724(8448, 7681);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!ei;II)V")
	@Override
	public void method5997(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1) {
		super.aClass30_Sub1_42.method730(arg0);
		super.aClass30_Sub1_42.method713(arg1);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
	@Override
	public void method5994() {
		if (this.aBoolean548) {
			this.aClass260_6.method5895('\u0001');
			super.aClass30_Sub1_42.method726(1);
			super.aClass30_Sub1_42.method730(null);
			super.aClass30_Sub1_42.method726(0);
		} else {
			super.aClass30_Sub1_42.method690(5890, 0);
		}
		super.aClass30_Sub1_42.method724(8448, 8448);
		this.aBoolean548 = false;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V")
	@Override
	public void method5995(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
