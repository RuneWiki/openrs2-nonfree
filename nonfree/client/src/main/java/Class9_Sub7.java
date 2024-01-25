import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class9_Sub7 extends Class9 {

	@OriginalMember(owner = "client!qr", name = "n", descriptor = "Z")
	private boolean aBoolean517 = false;

	@OriginalMember(owner = "client!qr", name = "r", descriptor = "Lclient!ct;")
	private Class43 aClass43_6;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lclient!fd;)V")
	public Class9_Sub7(@OriginalArg(0) Class19_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean199) {
			this.aClass43_6 = new Class43(arg0, 2);
			this.aClass43_6.method990(0);
			super.aClass19_Sub2_41.method1936(1);
			super.aClass19_Sub2_41.method1912(34165, 7681);
			super.aClass19_Sub2_41.method1945(2, 770, 34168);
			super.aClass19_Sub2_41.method1954(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass19_Sub2_41.method1936(0);
			this.aClass43_6.method991();
			this.aClass43_6.method990(1);
			super.aClass19_Sub2_41.method1936(1);
			super.aClass19_Sub2_41.method1912(8448, 8448);
			super.aClass19_Sub2_41.method1945(2, 770, 34166);
			super.aClass19_Sub2_41.method1954(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass19_Sub2_41.method1936(0);
			this.aClass43_6.method991();
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5371(@OriginalArg(1) boolean arg0) {
		@Pc(12) Class6_Sub4 local12 = super.aClass19_Sub2_41.method1946();
		if (this.aClass43_6 == null || local12 == null || !arg0) {
			super.aClass19_Sub2_41.method1954(34168, 0);
			return;
		}
		this.aClass43_6.method989('\u0000');
		super.aClass19_Sub2_41.method1936(1);
		super.aClass19_Sub2_41.method1905(local12);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass19_Sub2_41.aClass31_Sub1_3.method5155(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass19_Sub2_41.method1936(0);
		this.aBoolean517 = true;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(III)V")
	@Override
	public void method5370(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5377(@OriginalArg(0) boolean arg0) {
		super.aClass19_Sub2_41.method1912(8448, 7681);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V")
	@Override
	public void method5373() {
		if (this.aBoolean517) {
			this.aClass43_6.method989('\u0001');
			super.aClass19_Sub2_41.method1936(1);
			super.aClass19_Sub2_41.method1905(null);
			super.aClass19_Sub2_41.method1936(0);
		} else {
			super.aClass19_Sub2_41.method1954(5890, 0);
		}
		super.aClass19_Sub2_41.method1912(8448, 8448);
		this.aBoolean517 = false;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILclient!kj;Z)V")
	@Override
	public void method5376(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1) {
		super.aClass19_Sub2_41.method1905(arg1);
		super.aClass19_Sub2_41.method1900(arg0);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5375() {
		return true;
	}
}
