import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class29_Sub5 extends Class29 {

	@OriginalMember(owner = "client!ki", name = "o", descriptor = "Z")
	private boolean aBoolean275 = false;

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "Lclient!tm;")
	private Class239 aClass239_4;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class29_Sub5(@OriginalArg(0) Class50_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean102) {
			this.aClass239_4 = new Class239(arg0, 2);
			this.aClass239_4.method5221(0);
			super.aClass50_Sub1_37.method1300(1);
			super.aClass50_Sub1_37.method1316(34165, 7681);
			super.aClass50_Sub1_37.method1309(2, 34168, 770);
			super.aClass50_Sub1_37.method1275(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass50_Sub1_37.method1300(0);
			this.aClass239_4.method5222();
			this.aClass239_4.method5221(1);
			super.aClass50_Sub1_37.method1300(1);
			super.aClass50_Sub1_37.method1316(8448, 8448);
			super.aClass50_Sub1_37.method1309(2, 34166, 770);
			super.aClass50_Sub1_37.method1275(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass50_Sub1_37.method1300(0);
			this.aClass239_4.method5222();
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILclient!ac;)V")
	@Override
	public void method5382(@OriginalArg(0) int arg0, @OriginalArg(2) Class4 arg1) {
		super.aClass50_Sub1_37.method1295(arg1);
		super.aClass50_Sub1_37.method1256(arg0);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)V")
	@Override
	public void method5378(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
	@Override
	public void method5381() {
		if (this.aBoolean275) {
			this.aClass239_4.method5224('\u0001');
			super.aClass50_Sub1_37.method1300(1);
			super.aClass50_Sub1_37.method1295(null);
			super.aClass50_Sub1_37.method1300(0);
		} else {
			super.aClass50_Sub1_37.method1275(5890, 0);
		}
		super.aClass50_Sub1_37.method1316(8448, 8448);
		this.aBoolean275 = false;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BZ)V")
	@Override
	public void method5383(@OriginalArg(1) boolean arg0) {
		super.aClass50_Sub1_37.method1316(8448, 7681);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5375() {
		return true;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5376(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class4_Sub2 local8 = super.aClass50_Sub1_37.method1301();
		if (this.aClass239_4 == null || local8 == null || !arg0) {
			super.aClass50_Sub1_37.method1275(34168, 0);
			return;
		}
		this.aClass239_4.method5224('\u0000');
		super.aClass50_Sub1_37.method1300(1);
		super.aClass50_Sub1_37.method1295(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass50_Sub1_37.aClass34_Sub1_3.method4148(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass50_Sub1_37.method1300(0);
		this.aBoolean275 = true;
	}
}
