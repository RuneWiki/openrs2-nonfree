import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class5_Sub8 extends Class5 {

	@OriginalMember(owner = "client!sq", name = "o", descriptor = "Z")
	private boolean aBoolean414 = false;

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "Lclient!kq;")
	private Class144 aClass144_6;

	static {
		new Class231("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
	}

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!bl;)V")
	public Class5_Sub8(@OriginalArg(0) Class28_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean65) {
			this.aClass144_6 = new Class144(arg0, 2);
			this.aClass144_6.method3283(0);
			super.aClass28_Sub1_42.method650(1);
			super.aClass28_Sub1_42.method692(7681, 34165);
			super.aClass28_Sub1_42.method665(34168, 770, 2);
			super.aClass28_Sub1_42.method643(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass28_Sub1_42.method650(0);
			this.aClass144_6.method3284();
			this.aClass144_6.method3283(1);
			super.aClass28_Sub1_42.method650(1);
			super.aClass28_Sub1_42.method692(8448, 8448);
			super.aClass28_Sub1_42.method665(34166, 770, 2);
			super.aClass28_Sub1_42.method643(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass28_Sub1_42.method650(0);
			this.aClass144_6.method3284();
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!ce;IZ)V")
	@Override
	public void method5927(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1) {
		super.aClass28_Sub1_42.method654(arg0);
		super.aClass28_Sub1_42.method678(arg1);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V")
	@Override
	public void method5922() {
		if (this.aBoolean414) {
			this.aClass144_6.method3285('\u0001');
			super.aClass28_Sub1_42.method650(1);
			super.aClass28_Sub1_42.method654(null);
			super.aClass28_Sub1_42.method650(0);
		} else {
			super.aClass28_Sub1_42.method643(5890, 0);
		}
		super.aClass28_Sub1_42.method692(8448, 8448);
		this.aBoolean414 = false;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)V")
	@Override
	public void method5923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5926(@OriginalArg(1) boolean arg0) {
		super.aClass28_Sub1_42.method692(7681, 8448);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5928() {
		return true;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5925(@OriginalArg(0) boolean arg0) {
		@Pc(16) Class40_Sub4 local16 = super.aClass28_Sub1_42.method674();
		if (this.aClass144_6 == null || local16 == null || !arg0) {
			super.aClass28_Sub1_42.method643(34168, 0);
			return;
		}
		this.aClass144_6.method3285('\u0000');
		super.aClass28_Sub1_42.method650(1);
		super.aClass28_Sub1_42.method654(local16);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass28_Sub1_42.aClass132_Sub2_4.method3993(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass28_Sub1_42.method650(0);
		this.aBoolean414 = true;
	}
}
