import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wia")
public final class Class39_Sub4 extends Class39 implements Interface6 {

	@OriginalMember(owner = "client!wia", name = "J", descriptor = "I")
	private final int anInt11111;

	@OriginalMember(owner = "client!wia", name = "N", descriptor = "I")
	private final int anInt11110;

	@OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(Lclient!lt;Lclient!hd;IIZ[BII)V")
	public Class39_Sub4(@OriginalArg(0) Class67_Sub1_Sub2 arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static438.aClass261_14, arg2 * arg3, arg4);
		this.anInt11111 = arg3;
		this.anInt11110 = arg2;
		super.aClass67_Sub1_Sub2_12.method5612(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 && arg7 == 0 && arg6 == 0) {
			this.method9267(arg3, arg2, arg5, super.anInt11091);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt11091, 0, this.method9264(), arg2, arg3, 0, Static235.method3664(super.aClass145_16), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(Lclient!lt;IIZ[III)V")
	public Class39_Sub4(@OriginalArg(0) Class67_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static557.aClass145_14, Static438.aClass261_14, arg1 * arg2, arg3);
		this.anInt11110 = arg1;
		this.anInt11111 = arg2;
		super.aClass67_Sub1_Sub2_12.method5612(this);
		if (arg3 && arg6 == 0 && arg5 == 0) {
			this.method9260(arg4, arg2, super.anInt11091, arg1);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt11091, 0, 6408, this.anInt11110, this.anInt11111, 0, 32993, super.aClass67_Sub1_Sub2_12.anInt6778, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(Lclient!lt;Lclient!hd;IIZ[FII)V")
	public Class39_Sub4(@OriginalArg(0) Class67_Sub1_Sub2 arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static438.aClass261_18, arg2 * arg3, arg4);
		this.anInt11111 = arg3;
		this.anInt11110 = arg2;
		super.aClass67_Sub1_Sub2_12.method5612(this);
		if (!arg4 && arg7 == 0 && arg6 == 0) {
			this.method9265(super.anInt11091, arg2, arg3, arg5);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt11091, 0, this.method9264(), arg2, arg3, 0, Static235.method3664(super.aClass145_16), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(Lclient!lt;Lclient!hd;Lclient!ns;II)V")
	public Class39_Sub4(@OriginalArg(0) Class67_Sub1_Sub2 arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) Class261 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg4 * arg3, false);
		this.anInt11110 = arg3;
		this.anInt11111 = arg4;
		super.aClass67_Sub1_Sub2_12.method5612(this);
		OpenGL.glTexImage2Dub(super.anInt11091, 0, this.method9264(), arg3, arg4, 0, Static235.method3664(super.aClass145_16), Static191.method2897(super.aClass261_20), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(IIZIIILclient!hd;[FI)V")
	public void method9278(@OriginalArg(4) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) Class145 arg2, @OriginalArg(7) float[] arg3) {
		super.aClass67_Sub1_Sub2_12.method5612(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt11091, 0, 0, 0, arg1, arg0, Static235.method3664(arg2), 5121, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(III[BBLclient!hd;III)V")
	@Override
	public void method9270(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(5) Class145 arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4) {
		super.aClass67_Sub1_Sub2_12.method5612(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg0);
		OpenGL.glTexSubImage2Dub(super.anInt11091, 0, 0, 0, arg3, arg4, Static235.method3664(arg2), 5121, arg1, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(IIIIII[I)V")
	@Override
	public void method9274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(6) int[] arg2) {
		@Pc(12) int[] local12 = new int[this.anInt11110 * this.anInt11111];
		super.aClass67_Sub1_Sub2_12.method5612(this);
		OpenGL.glGetTexImagei(super.anInt11091, 0, 32993, 5121, local12, 0);
		for (@Pc(34) int local34 = 0; local34 < arg0; local34++) {
			Static735.method9182(local12, this.anInt11110 * (arg0 - local34 - 1), arg2, arg1 * local34, arg1);
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(ZBZ)V")
	@Override
	public void method9275(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		super.aClass67_Sub1_Sub2_12.method5612(this);
		OpenGL.glTexParameteri(super.anInt11091, 10242, arg1 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt11091, 10243, arg0 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(FI)F")
	@Override
	public float method9269(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt11111;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(I)I")
	@Override
	public int method9277() {
		return this.anInt11111;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9272() {
		return true;
	}

	@OriginalMember(owner = "client!wia", name = "b", descriptor = "(B)I")
	@Override
	public int method9271() {
		return this.anInt11110;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(I[IIIIIII)V")
	@Override
	public void method9273(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass67_Sub1_Sub2_12.method5612(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexSubImage2Di(super.anInt11091, 0, arg3, arg1, arg4, arg2, 32993, super.aClass67_Sub1_Sub2_12.anInt6778, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(FB)F")
	@Override
	public float method9276(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt11110;
	}
}
