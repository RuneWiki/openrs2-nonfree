import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public final class Class112_Sub4 extends Class112 implements Interface8 {

	@OriginalMember(owner = "client!un", name = "y", descriptor = "I")
	private final int anInt8869;

	@OriginalMember(owner = "client!un", name = "K", descriptor = "I")
	private final int anInt8876;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!qi;Lclient!sk;IIZ[FII)V")
	public Class112_Sub4(@OriginalArg(0) Class12_Sub2_Sub2 arg0, @OriginalArg(1) Class297 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static554.aClass340_18, arg2 * arg3, arg4);
		this.anInt8869 = arg3;
		this.anInt8876 = arg2;
		super.aClass12_Sub2_Sub2_11.method6159(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt8864, 0, this.method7324(), arg2, arg3, 0, Static395.method5609(super.aClass297_14), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method7319(arg3, arg5, super.anInt8864, arg2);
		}
	}

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!qi;Lclient!sk;IIZ[BII)V")
	public Class112_Sub4(@OriginalArg(0) Class12_Sub2_Sub2 arg0, @OriginalArg(1) Class297 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static554.aClass340_14, arg2 * arg3, arg4);
		this.anInt8876 = arg2;
		this.anInt8869 = arg3;
		super.aClass12_Sub2_Sub2_11.method6159(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method7322(arg5, arg2, super.anInt8864, arg3);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt8864, 0, this.method7324(), arg2, arg3, 0, Static395.method5609(super.aClass297_14), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!qi;Lclient!sk;Lclient!vea;II)V")
	public Class112_Sub4(@OriginalArg(0) Class12_Sub2_Sub2 arg0, @OriginalArg(1) Class297 arg1, @OriginalArg(2) Class340 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg4 * arg3, false);
		this.anInt8869 = arg4;
		this.anInt8876 = arg3;
		super.aClass12_Sub2_Sub2_11.method6159(this);
		OpenGL.glTexImage2Dub(super.anInt8864, 0, this.method7324(), arg3, arg4, 0, Static395.method5609(super.aClass297_14), Static575.method4595(super.aClass340_10), null, 0);
	}

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!qi;IIZ[III)V")
	public Class112_Sub4(@OriginalArg(0) Class12_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static253.aClass297_5, Static554.aClass340_14, arg1 * arg2, arg3);
		this.anInt8876 = arg1;
		this.anInt8869 = arg2;
		super.aClass12_Sub2_Sub2_11.method6159(this);
		if (arg3 && arg6 == 0) {
			this.method7318(arg1, arg4, arg2, super.anInt8864);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt8864, 0, 6408, this.anInt8876, this.anInt8869, 0, 32993, super.aClass12_Sub2_Sub2_11.anInt7642, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILclient!sk;IBIIII[F)V")
	public void method7333(@OriginalArg(1) Class297 arg0, @OriginalArg(5) int arg1, @OriginalArg(7) int arg2, @OriginalArg(8) float[] arg3) {
		super.aClass12_Sub2_Sub2_11.method6159(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt8864, 0, 0, 0, arg1, arg2, Static395.method5609(arg0), 5121, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BF)F")
	@Override
	public float method7325(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt8869;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ZBZ)V")
	@Override
	public void method7331(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		super.aClass12_Sub2_Sub2_11.method6159(this);
		OpenGL.glTexParameteri(super.anInt8864, 10242, arg1 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt8864, 10243, arg0 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(FB)F")
	@Override
	public float method7326(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt8876;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIII[BLclient!sk;I)V")
	@Override
	public void method7329(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(6) byte[] arg2, @OriginalArg(7) Class297 arg3, @OriginalArg(8) int arg4) {
		super.aClass12_Sub2_Sub2_11.method6159(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg0);
		OpenGL.glTexSubImage2Dub(super.anInt8864, 0, 0, 0, arg1, arg4, Static395.method5609(arg3), 5121, arg2, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7332() {
		return true;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)I")
	@Override
	public int method7328() {
		return this.anInt8876;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(B)I")
	@Override
	public int method7327() {
		return this.anInt8869;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(III[IIBII)V")
	@Override
	public void method7330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		super.aClass12_Sub2_Sub2_11.method6159(this);
		OpenGL.glPixelStorei(3314, arg0);
		OpenGL.glTexSubImage2Di(super.anInt8864, 0, arg4, arg2, arg1, arg5, 32993, super.aClass12_Sub2_Sub2_11.anInt7642, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
	}
}
