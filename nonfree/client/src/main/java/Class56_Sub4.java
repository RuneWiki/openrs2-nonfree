import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class56_Sub4 extends Class56 {

	@OriginalMember(owner = "client!hs", name = "j", descriptor = "Z")
	private boolean aBoolean149 = false;

	@OriginalMember(owner = "client!hs", name = "g", descriptor = "Lclient!wu;")
	private Class269 aClass269_4;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lclient!ht;)V")
	public Class56_Sub4(@OriginalArg(0) Class109_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean164) {
			this.aClass269_4 = new Class269(arg0, 2);
			this.aClass269_4.method6086(0);
			super.aClass109_Sub1_41.method2564(1);
			super.aClass109_Sub1_41.method2549(34165, 7681);
			super.aClass109_Sub1_41.method2528(34168, 770, 2);
			super.aClass109_Sub1_41.method2545(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass109_Sub1_41.method2564(0);
			this.aClass269_4.method6090();
			this.aClass269_4.method6086(1);
			super.aClass109_Sub1_41.method2564(1);
			super.aClass109_Sub1_41.method2549(8448, 8448);
			super.aClass109_Sub1_41.method2528(34166, 770, 2);
			super.aClass109_Sub1_41.method2545(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass109_Sub1_41.method2564(0);
			this.aClass269_4.method6090();
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IILclient!ao;)V")
	@Override
	public void method5086(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1) {
		super.aClass109_Sub1_41.method2578(arg1);
		super.aClass109_Sub1_41.method2531(arg0);
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5085() {
		return true;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
	@Override
	public void method5084() {
		if (this.aBoolean149) {
			this.aClass269_4.method6088('\u0001');
			super.aClass109_Sub1_41.method2564(1);
			super.aClass109_Sub1_41.method2578(null);
			super.aClass109_Sub1_41.method2564(0);
		} else {
			super.aClass109_Sub1_41.method2545(5890, 0);
		}
		super.aClass109_Sub1_41.method2549(8448, 8448);
		this.aBoolean149 = false;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5087(@OriginalArg(1) boolean arg0) {
		@Pc(16) Class13_Sub4 local16 = super.aClass109_Sub1_41.method2536();
		if (this.aClass269_4 == null || local16 == null || !arg0) {
			super.aClass109_Sub1_41.method2545(34168, 0);
			return;
		}
		this.aClass269_4.method6088('\u0000');
		super.aClass109_Sub1_41.method2564(1);
		super.aClass109_Sub1_41.method2578(local16);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass109_Sub1_41.aClass18_Sub1_4.method434(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass109_Sub1_41.method2564(0);
		this.aBoolean149 = true;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5079(@OriginalArg(0) boolean arg0) {
		super.aClass109_Sub1_41.method2549(8448, 7681);
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(III)V")
	@Override
	public void method5083(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
