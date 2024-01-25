import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class Class39_Sub1 extends Class39 implements Interface6 {

	@OriginalMember(owner = "client!bu", name = "E", descriptor = "I")
	private final int anInt993;

	@OriginalMember(owner = "client!bu", name = "S", descriptor = "I")
	private final int anInt1002;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lclient!lt;Lclient!hd;II[FII)V")
	public Class39_Sub1(@OriginalArg(0) Class67_Sub1_Sub2 arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static438.aClass261_18, arg2 * arg3, false);
		this.anInt993 = arg3;
		this.anInt1002 = arg2;
		super.aClass67_Sub1_Sub2_12.method5612(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt11091, 0, this.method9264(), arg2, arg3, 0, Static235.method3664(super.aClass145_16), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lclient!lt;II[III)V")
	public Class39_Sub1(@OriginalArg(0) Class67_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static557.aClass145_14, Static438.aClass261_14, arg2 * arg1, false);
		this.anInt1002 = arg1;
		this.anInt993 = arg2;
		super.aClass67_Sub1_Sub2_12.method5612(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt11091, 0, 6408, this.anInt1002, this.anInt993, 0, 32993, super.aClass67_Sub1_Sub2_12.anInt6778, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lclient!lt;Lclient!hd;Lclient!ns;II)V")
	public Class39_Sub1(@OriginalArg(0) Class67_Sub1_Sub2 arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) Class261 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
		this.anInt993 = arg4;
		this.anInt1002 = arg3;
		super.aClass67_Sub1_Sub2_12.method5612(this);
		OpenGL.glTexImage2Dub(super.anInt11091, 0, this.method9264(), arg3, arg4, 0, Static235.method3664(super.aClass145_16), Static191.method2897(super.aClass261_20), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lclient!lt;Lclient!hd;II[BII)V")
	public Class39_Sub1(@OriginalArg(0) Class67_Sub1_Sub2 arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static438.aClass261_14, arg2 * arg3, false);
		this.anInt1002 = arg2;
		this.anInt993 = arg3;
		super.aClass67_Sub1_Sub2_12.method5612(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt11091, 0, this.method9264(), arg2, arg3, 0, Static235.method3664(super.aClass145_16), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9272() {
		return false;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(III[BBLclient!hd;III)V")
	@Override
	public void method9270(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(5) Class145 arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4) {
		if (arg0 == 0) {
			arg0 = arg3;
		}
		super.aClass67_Sub1_Sub2_12.method5612(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg3) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt11091, 0, 0, 0, arg3, arg4, Static235.method3664(arg2), 5121, arg1, 0);
		if (arg0 != arg3) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIIIII[I)V")
	@Override
	public void method9274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(6) int[] arg2) {
		@Pc(12) int[] local12 = new int[this.anInt993 * this.anInt1002];
		super.aClass67_Sub1_Sub2_12.method5612(this);
		OpenGL.glGetTexImagei(super.anInt11091, 0, 32993, 5121, local12, 0);
		for (@Pc(29) int local29 = 0; local29 < arg0; local29++) {
			Static735.method9182(local12, this.anInt1002 * (arg0 - local29 - 1), arg2, arg1 * local29, arg1);
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(I[IIIIIII)V")
	@Override
	public void method9273(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg5 == 0) {
			arg5 = arg4;
		}
		super.aClass67_Sub1_Sub2_12.method5612(this);
		if (arg4 != arg5) {
			OpenGL.glPixelStorei(3314, arg5);
		}
		OpenGL.glTexSubImage2Di(super.anInt11091, 0, arg3, arg1, arg4, arg2, 32993, super.aClass67_Sub1_Sub2_12.anInt6778, arg0, 0);
		if (arg5 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(FB)F")
	@Override
	public float method9276(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ZBZ)V")
	@Override
	public void method9275(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)I")
	@Override
	public int method9277() {
		return this.anInt993;
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(B)I")
	@Override
	public int method9271() {
		return this.anInt1002;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(FI)F")
	@Override
	public float method9269(@OriginalArg(0) float arg0) {
		return arg0;
	}
}
