import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public final class Class81_Sub4 extends Class81 implements Interface1 {

	@OriginalMember(owner = "client!vaa", name = "x", descriptor = "I")
	private final int anInt9229;

	@OriginalMember(owner = "client!vaa", name = "E", descriptor = "I")
	private final int anInt9235;

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lclient!nfa;Lclient!vj;II[BII)V")
	public Class81_Sub4(@OriginalArg(0) Class9_Sub3_Sub2 arg0, @OriginalArg(1) Class333 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static336.aClass220_12, arg2 * arg3, false);
		this.anInt9229 = arg3;
		this.anInt9235 = arg2;
		super.aClass9_Sub3_Sub2_10.method5494(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt9224, 0, this.method7742(), arg2, arg3, 0, Static290.method4775(super.aClass333_16), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lclient!nfa;II[III)V")
	public Class81_Sub4(@OriginalArg(0) Class9_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static487.aClass333_15, Static336.aClass220_12, arg1 * arg2, false);
		this.anInt9235 = arg1;
		this.anInt9229 = arg2;
		super.aClass9_Sub3_Sub2_10.method5494(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt9224, 0, 6408, this.anInt9235, this.anInt9229, 0, 32993, super.aClass9_Sub3_Sub2_10.anInt6644, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lclient!nfa;Lclient!vj;Lclient!nb;II)V")
	public Class81_Sub4(@OriginalArg(0) Class9_Sub3_Sub2 arg0, @OriginalArg(1) Class333 arg1, @OriginalArg(2) Class220 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg4 * arg3, false);
		this.anInt9235 = arg3;
		this.anInt9229 = arg4;
		super.aClass9_Sub3_Sub2_10.method5494(this);
		OpenGL.glTexImage2Dub(super.anInt9224, 0, this.method7742(), arg3, arg4, 0, Static290.method4775(super.aClass333_16), Static345.method5631(super.aClass220_20), null, 0);
	}

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lclient!nfa;Lclient!vj;II[FII)V")
	public Class81_Sub4(@OriginalArg(0) Class9_Sub3_Sub2 arg0, @OriginalArg(1) Class333 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static336.aClass220_16, arg3 * arg2, false);
		this.anInt9235 = arg2;
		this.anInt9229 = arg3;
		super.aClass9_Sub3_Sub2_10.method5494(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt9224, 0, this.method7742(), arg2, arg3, 0, Static290.method4775(super.aClass333_16), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IF)F")
	@Override
	public float method7748(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(FI)F")
	@Override
	public float method7754(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIIIIIB[I)V")
	@Override
	public void method7751(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int[] arg5) {
		super.aClass9_Sub3_Sub2_10.method5494(this);
		if (arg1 == 0) {
			arg1 = arg4;
		}
		if (arg1 != arg4) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt9224, 0, arg3, arg0, arg4, arg2, 32993, super.aClass9_Sub3_Sub2_10.anInt6644, arg5, 0);
		if (arg4 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7749() {
		return false;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IZZ)V")
	@Override
	public void method7753(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
	}

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "(I)I")
	@Override
	public int method7752() {
		return this.anInt9235;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIII[BLclient!vj;III)V")
	@Override
	public void method7747(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) Class333 arg3, @OriginalArg(6) int arg4) {
		if (arg4 == 0) {
			arg4 = arg0;
		}
		super.aClass9_Sub3_Sub2_10.method5494(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg4) {
			OpenGL.glPixelStorei(3314, arg4);
		}
		OpenGL.glTexSubImage2Dub(super.anInt9224, 0, 0, 0, arg0, arg1, Static290.method4775(arg3), 5121, arg2, 0);
		if (arg0 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(I)I")
	@Override
	public int method7750() {
		return this.anInt9229;
	}
}
