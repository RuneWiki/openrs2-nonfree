import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class43_Sub3 extends Class43 {

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "Z")
	private boolean aBoolean249 = false;

	@OriginalMember(owner = "client!fa", name = "u", descriptor = "Lclient!nda;")
	private Class251 aClass251_3;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lclient!gia;)V")
	public Class43_Sub3(@OriginalArg(0) Class67_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean318) {
			this.aClass251_3 = new Class251(arg0, 2);
			this.aClass251_3.method6187(0);
			super.aClass67_Sub2_41.method3268(1);
			super.aClass67_Sub2_41.method3271(7681, 34165);
			super.aClass67_Sub2_41.method3279(34168, 770, 2);
			super.aClass67_Sub2_41.method3269(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass67_Sub2_41.method3268(0);
			this.aClass251_3.method6183();
			this.aClass251_3.method6187(1);
			super.aClass67_Sub2_41.method3268(1);
			super.aClass67_Sub2_41.method3271(8448, 8448);
			super.aClass67_Sub2_41.method3279(34166, 770, 2);
			super.aClass67_Sub2_41.method3269(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass67_Sub2_41.method3268(0);
			this.aClass251_3.method6183();
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
	@Override
	public void method8866() {
		if (this.aBoolean249) {
			this.aClass251_3.method6186('\u0001');
			super.aClass67_Sub2_41.method3268(1);
			super.aClass67_Sub2_41.method3234((Class245) null);
			super.aClass67_Sub2_41.method3268(0);
		} else {
			super.aClass67_Sub2_41.method3269(5890, 0);
		}
		super.aClass67_Sub2_41.method3271(8448, 8448);
		this.aBoolean249 = false;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)V")
	@Override
	public void method8860(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8859() {
		return true;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8863(@OriginalArg(0) boolean arg0) {
		@Pc(13) Class245_Sub1 local13 = super.aClass67_Sub2_41.method3302();
		if (this.aClass251_3 == null || local13 == null || !arg0) {
			super.aClass67_Sub2_41.method3269(34168, 0);
			return;
		}
		this.aClass251_3.method6186('\u0000');
		super.aClass67_Sub2_41.method3268(1);
		super.aClass67_Sub2_41.method3234(local13);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass67_Sub2_41.aClass181_Sub2_5.method6176(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass67_Sub2_41.method3268(0);
		this.aBoolean249 = true;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!sga;I)V")
	@Override
	public void method8865(@OriginalArg(0) int arg0, @OriginalArg(1) Class245 arg1) {
		super.aClass67_Sub2_41.method3234(arg1);
		super.aClass67_Sub2_41.method3255(arg0);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8858(@OriginalArg(1) boolean arg0) {
		super.aClass67_Sub2_41.method3271(7681, 8448);
	}
}
