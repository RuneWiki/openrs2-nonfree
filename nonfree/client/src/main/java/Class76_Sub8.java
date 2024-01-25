import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class76_Sub8 extends Class76 {

	@OriginalMember(owner = "client!tb", name = "q", descriptor = "Z")
	private boolean aBoolean547 = false;

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "Lclient!cn;")
	private Class46 aClass46_5;

	static {
		new Class96("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
	}

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lclient!qg;)V")
	public Class76_Sub8(@OriginalArg(0) Class121_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean480) {
			this.aClass46_5 = new Class46(arg0, 2);
			this.aClass46_5.method778(0);
			super.aClass121_Sub2_39.method4669(1);
			super.aClass121_Sub2_39.method4709(7681, 34165);
			super.aClass121_Sub2_39.method4692(2, 34168, 770);
			super.aClass121_Sub2_39.method4673(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass121_Sub2_39.method4669(0);
			this.aClass46_5.method779();
			this.aClass46_5.method778(1);
			super.aClass121_Sub2_39.method4669(1);
			super.aClass121_Sub2_39.method4709(8448, 8448);
			super.aClass121_Sub2_39.method4692(2, 34166, 770);
			super.aClass121_Sub2_39.method4673(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass121_Sub2_39.method4669(0);
			this.aClass46_5.method779();
		}
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
	@Override
	public void method5613() {
		if (this.aBoolean547) {
			this.aClass46_5.method781('\u0001');
			super.aClass121_Sub2_39.method4669(1);
			super.aClass121_Sub2_39.method4681(null);
			super.aClass121_Sub2_39.method4669(0);
		} else {
			super.aClass121_Sub2_39.method4673(0, 5890);
		}
		super.aClass121_Sub2_39.method4709(8448, 8448);
		this.aBoolean547 = false;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5606() {
		return true;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5611(@OriginalArg(0) boolean arg0) {
		@Pc(16) Class21_Sub4 local16 = super.aClass121_Sub2_39.method4728();
		if (this.aClass46_5 == null || local16 == null || !arg0) {
			super.aClass121_Sub2_39.method4673(0, 34168);
			return;
		}
		this.aClass46_5.method781('\u0000');
		super.aClass121_Sub2_39.method4669(1);
		super.aClass121_Sub2_39.method4681(local16);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass121_Sub2_39.aClass43_Sub2_3.method2482(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass121_Sub2_39.method4669(0);
		this.aBoolean547 = true;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5608(@OriginalArg(1) boolean arg0) {
		super.aClass121_Sub2_39.method4709(7681, 8448);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!go;B)V")
	@Override
	public void method5609(@OriginalArg(0) int arg0, @OriginalArg(1) Class21 arg1) {
		super.aClass121_Sub2_39.method4681(arg1);
		super.aClass121_Sub2_39.method4707(arg0);
	}
}
