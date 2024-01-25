import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class104_Sub6 extends Class104 {

	@OriginalMember(owner = "client!qs", name = "j", descriptor = "Z")
	private boolean aBoolean581 = false;

	@OriginalMember(owner = "client!qs", name = "i", descriptor = "Lclient!gq;")
	private Class121 aClass121_2;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!ap;)V")
	public Class104_Sub6(@OriginalArg(0) Class9_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean68) {
			this.aClass121_2 = new Class121(arg0, 2);
			this.aClass121_2.method3523(0);
			super.aClass9_Sub2_40.method806(1);
			super.aClass9_Sub2_40.method797(34165, 7681);
			super.aClass9_Sub2_40.method798(2, 770, 34168);
			super.aClass9_Sub2_40.method816(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass9_Sub2_40.method806(0);
			this.aClass121_2.method3524();
			this.aClass121_2.method3523(1);
			super.aClass9_Sub2_40.method806(1);
			super.aClass9_Sub2_40.method797(8448, 8448);
			super.aClass9_Sub2_40.method798(2, 770, 34166);
			super.aClass9_Sub2_40.method816(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass9_Sub2_40.method806(0);
			this.aClass121_2.method3524();
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V")
	@Override
	public void method7868() {
		if (this.aBoolean581) {
			this.aClass121_2.method3522('\u0001');
			super.aClass9_Sub2_40.method806(1);
			super.aClass9_Sub2_40.method814(null);
			super.aClass9_Sub2_40.method806(0);
		} else {
			super.aClass9_Sub2_40.method816(5890, 0);
		}
		super.aClass9_Sub2_40.method797(8448, 8448);
		this.aBoolean581 = false;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7865() {
		return true;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7867(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class132_Sub4 local8 = super.aClass9_Sub2_40.method820();
		if (this.aClass121_2 == null || local8 == null || !arg0) {
			super.aClass9_Sub2_40.method816(34168, 0);
			return;
		}
		this.aClass121_2.method3522('\u0000');
		super.aClass9_Sub2_40.method806(1);
		super.aClass9_Sub2_40.method814(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass9_Sub2_40.aClass8_Sub2_4.method6058(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass9_Sub2_40.method806(0);
		this.aBoolean581 = true;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7871(@OriginalArg(1) boolean arg0) {
		super.aClass9_Sub2_40.method797(8448, 7681);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IILclient!uda;)V")
	@Override
	public void method7872(@OriginalArg(0) int arg0, @OriginalArg(2) Class132 arg1) {
		super.aClass9_Sub2_40.method814(arg1);
		super.aClass9_Sub2_40.method822(arg0);
	}
}
