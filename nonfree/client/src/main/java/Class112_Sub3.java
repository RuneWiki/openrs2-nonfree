import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public final class Class112_Sub3 extends Class112 implements Interface8 {

	@OriginalMember(owner = "client!nfa", name = "C", descriptor = "I")
	private final int anInt6167;

	@OriginalMember(owner = "client!nfa", name = "y", descriptor = "I")
	private final int anInt6163;

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Lclient!qi;Lclient!sk;Lclient!vea;II)V")
	public Class112_Sub3(@OriginalArg(0) Class12_Sub2_Sub2 arg0, @OriginalArg(1) Class297 arg1, @OriginalArg(2) Class340 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
		this.anInt6167 = arg4;
		this.anInt6163 = arg3;
		super.aClass12_Sub2_Sub2_11.method6159(this);
		OpenGL.glTexImage2Dub(super.anInt8864, 0, this.method7324(), arg3, arg4, 0, Static395.method5609(super.aClass297_14), Static575.method4595(super.aClass340_10), null, 0);
	}

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Lclient!qi;II[III)V")
	public Class112_Sub3(@OriginalArg(0) Class12_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static253.aClass297_5, Static554.aClass340_14, arg1 * arg2, false);
		this.anInt6163 = arg1;
		this.anInt6167 = arg2;
		super.aClass12_Sub2_Sub2_11.method6159(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt8864, 0, 6408, this.anInt6163, this.anInt6167, 0, 32993, super.aClass12_Sub2_Sub2_11.anInt7642, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Lclient!qi;Lclient!sk;II[BII)V")
	public Class112_Sub3(@OriginalArg(0) Class12_Sub2_Sub2 arg0, @OriginalArg(1) Class297 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static554.aClass340_14, arg2 * arg3, false);
		this.anInt6163 = arg2;
		this.anInt6167 = arg3;
		super.aClass12_Sub2_Sub2_11.method6159(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt8864, 0, this.method7324(), arg2, arg3, 0, Static395.method5609(super.aClass297_14), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Lclient!qi;Lclient!sk;II[FII)V")
	public Class112_Sub3(@OriginalArg(0) Class12_Sub2_Sub2 arg0, @OriginalArg(1) Class297 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static554.aClass340_18, arg2 * arg3, false);
		this.anInt6167 = arg3;
		this.anInt6163 = arg2;
		super.aClass12_Sub2_Sub2_11.method6159(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt8864, 0, this.method7324(), arg2, arg3, 0, Static395.method5609(super.aClass297_14), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(BF)F")
	@Override
	public float method7325(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B)I")
	@Override
	public int method7327() {
		return this.anInt6167;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(FB)F")
	@Override
	public float method7326(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ZBZ)V")
	@Override
	public void method7331(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Z)I")
	@Override
	public int method7328() {
		return this.anInt6163;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7332() {
		return false;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIIII[BLclient!sk;I)V")
	@Override
	public void method7329(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(6) byte[] arg2, @OriginalArg(7) Class297 arg3, @OriginalArg(8) int arg4) {
		super.aClass12_Sub2_Sub2_11.method6159(this);
		if (arg0 == 0) {
			arg0 = arg1;
		}
		OpenGL.glPixelStorei(3317, 1);
		if (arg1 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt8864, 0, 0, 0, arg1, arg4, Static395.method5609(arg3), 5121, arg2, 0);
		if (arg0 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(III[IIBII)V")
	@Override
	public void method7330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == 0) {
			arg0 = arg1;
		}
		super.aClass12_Sub2_Sub2_11.method6159(this);
		if (arg1 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Di(super.anInt8864, 0, arg4, arg2, arg1, arg5, 32993, super.aClass12_Sub2_Sub2_11.anInt7642, arg3, 0);
		if (arg1 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}
}
