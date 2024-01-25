import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public final class Class81_Sub3 extends Class81 implements Interface1 {

	@OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
	private final int anInt6747;

	@OriginalMember(owner = "client!nl", name = "z", descriptor = "I")
	private final int anInt6751;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lclient!nfa;Lclient!vj;Lclient!nb;II)V")
	public Class81_Sub3(@OriginalArg(0) Class9_Sub3_Sub2 arg0, @OriginalArg(1) Class333 arg1, @OriginalArg(2) Class220 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		this.anInt6747 = arg4;
		this.anInt6751 = arg3;
		super.aClass9_Sub3_Sub2_10.method5494(this);
		OpenGL.glTexImage2Dub(super.anInt9224, 0, this.method7742(), arg3, arg4, 0, Static290.method4775(super.aClass333_16), Static345.method5631(super.aClass220_20), null, 0);
	}

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lclient!nfa;Lclient!vj;IIZ[BII)V")
	public Class81_Sub3(@OriginalArg(0) Class9_Sub3_Sub2 arg0, @OriginalArg(1) Class333 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static336.aClass220_12, arg3 * arg2, arg4);
		this.anInt6747 = arg3;
		this.anInt6751 = arg2;
		super.aClass9_Sub3_Sub2_10.method5494(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method7744(arg5, arg3, arg2, super.anInt9224);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt9224, 0, this.method7742(), arg2, arg3, 0, Static290.method4775(super.aClass333_16), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lclient!nfa;IIZ[III)V")
	public Class81_Sub3(@OriginalArg(0) Class9_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static487.aClass333_15, Static336.aClass220_12, arg2 * arg1, arg3);
		this.anInt6751 = arg1;
		this.anInt6747 = arg2;
		super.aClass9_Sub3_Sub2_10.method5494(this);
		if (arg3 && arg6 == 0) {
			this.method7741(arg2, super.anInt9224, arg1, arg4);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt9224, 0, 6408, this.anInt6751, this.anInt6747, 0, 32993, super.aClass9_Sub3_Sub2_10.anInt6644, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lclient!nfa;Lclient!vj;IIZ[FII)V")
	public Class81_Sub3(@OriginalArg(0) Class9_Sub3_Sub2 arg0, @OriginalArg(1) Class333 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static336.aClass220_16, arg2 * arg3, arg4);
		this.anInt6747 = arg3;
		this.anInt6751 = arg2;
		super.aClass9_Sub3_Sub2_10.method5494(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt9224, 0, this.method7742(), arg2, arg3, 0, Static290.method4775(super.aClass333_16), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method7746(arg2, super.anInt9224, arg3, arg5);
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIII[BLclient!vj;III)V")
	@Override
	public void method7747(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) Class333 arg3, @OriginalArg(6) int arg4) {
		super.aClass9_Sub3_Sub2_10.method5494(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg4);
		OpenGL.glTexSubImage2Dub(super.anInt9224, 0, 0, 0, arg0, arg1, Static290.method4775(arg3), 5121, arg2, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZZ)V")
	@Override
	public void method7753(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		super.aClass9_Sub3_Sub2_10.method5494(this);
		OpenGL.glTexParameteri(super.anInt9224, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt9224, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7749() {
		return true;
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)I")
	@Override
	public int method7750() {
		return this.anInt6747;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(FI)F")
	@Override
	public float method7754(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt6751;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "([FIBILclient!vj;IIII)V")
	public void method5692(@OriginalArg(0) float[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class333 arg2, @OriginalArg(8) int arg3) {
		super.aClass9_Sub3_Sub2_10.method5494(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt9224, 0, 0, 0, arg3, arg1, Static290.method4775(arg2), 5121, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIIIB[I)V")
	@Override
	public void method7751(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int[] arg5) {
		super.aClass9_Sub3_Sub2_10.method5494(this);
		OpenGL.glPixelStorei(3314, arg1);
		OpenGL.glTexSubImage2Di(super.anInt9224, 0, arg3, arg0, arg4, arg2, 32993, super.aClass9_Sub3_Sub2_10.anInt6644, arg5, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IF)F")
	@Override
	public float method7748(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt6747;
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)I")
	@Override
	public int method7752() {
		return this.anInt6751;
	}
}
