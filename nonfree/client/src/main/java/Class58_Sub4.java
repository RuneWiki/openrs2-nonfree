import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public final class Class58_Sub4 extends Class58 implements Interface5 {

	@OriginalMember(owner = "client!vf", name = "C", descriptor = "I")
	private final int anInt8929;

	@OriginalMember(owner = "client!vf", name = "M", descriptor = "I")
	private final int anInt8939;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lclient!tm;IIZ[III)V")
	public Class58_Sub4(@OriginalArg(0) Class4_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static171.aClass110_13, Static517.aClass308_15, arg1 * arg2, arg3);
		this.anInt8929 = arg1;
		this.anInt8939 = arg2;
		super.aClass4_Sub2_Sub2_10.method7316(this);
		if (arg3 && arg6 == 0) {
			this.method7762(super.anInt8923, arg1, arg4, arg2);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt8923, 0, 6408, this.anInt8929, this.anInt8939, 0, 32993, super.aClass4_Sub2_Sub2_10.anInt8409, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lclient!tm;Lclient!g;Lclient!vp;II)V")
	public Class58_Sub4(@OriginalArg(0) Class4_Sub2_Sub2 arg0, @OriginalArg(1) Class110 arg1, @OriginalArg(2) Class308 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg4 * arg3, false);
		this.anInt8939 = arg4;
		this.anInt8929 = arg3;
		super.aClass4_Sub2_Sub2_10.method7316(this);
		OpenGL.glTexImage2Dub(super.anInt8923, 0, this.method7766(), arg3, arg4, 0, Static295.method5137(super.aClass110_23), Static193.method3691(super.aClass308_11), null, 0);
	}

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lclient!tm;Lclient!g;IIZ[BII)V")
	public Class58_Sub4(@OriginalArg(0) Class4_Sub2_Sub2 arg0, @OriginalArg(1) Class110 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static517.aClass308_15, arg3 * arg2, arg4);
		this.anInt8929 = arg2;
		this.anInt8939 = arg3;
		super.aClass4_Sub2_Sub2_10.method7316(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method7765(arg2, super.anInt8923, arg5, arg3);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt8923, 0, this.method7766(), arg2, arg3, 0, Static295.method5137(super.aClass110_23), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lclient!tm;Lclient!g;IIZ[FII)V")
	public Class58_Sub4(@OriginalArg(0) Class4_Sub2_Sub2 arg0, @OriginalArg(1) Class110 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static517.aClass308_19, arg2 * arg3, arg4);
		this.anInt8929 = arg2;
		this.anInt8939 = arg3;
		super.aClass4_Sub2_Sub2_10.method7316(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt8923, 0, this.method7766(), arg2, arg3, 0, Static295.method5137(super.aClass110_23), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method7760(arg2, arg3, arg5, super.anInt8923);
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7775() {
		return true;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZZB)V")
	@Override
	public void method7769(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.aClass4_Sub2_Sub2_10.method7316(this);
		OpenGL.glTexParameteri(super.anInt8923, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt8923, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "([IIIIIIII)V")
	@Override
	public void method7773(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass4_Sub2_Sub2_10.method7316(this);
		OpenGL.glPixelStorei(3314, arg3);
		OpenGL.glTexSubImage2Di(super.anInt8923, 0, arg2, arg5, arg1, arg4, 32993, super.aClass4_Sub2_Sub2_10.anInt8409, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(FZ)F")
	@Override
	public float method7768(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt8939;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)I")
	@Override
	public int method7771() {
		return this.anInt8929;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BF)F")
	@Override
	public float method7774(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt8929;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BIIILclient!g;III[B)V")
	@Override
	public void method7772(@OriginalArg(3) int arg0, @OriginalArg(4) Class110 arg1, @OriginalArg(5) int arg2, @OriginalArg(7) int arg3, @OriginalArg(8) byte[] arg4) {
		super.aClass4_Sub2_Sub2_10.method7316(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg0);
		OpenGL.glTexSubImage2Dub(super.anInt8923, 0, 0, 0, arg3, arg2, Static295.method5137(arg1), 5121, arg4, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)I")
	@Override
	public int method7770() {
		return this.anInt8939;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(III[FIIILclient!g;I)V")
	public void method7780(@OriginalArg(3) float[] arg0, @OriginalArg(6) int arg1, @OriginalArg(7) Class110 arg2, @OriginalArg(8) int arg3) {
		super.aClass4_Sub2_Sub2_10.method7316(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt8923, 0, 0, 0, arg1, arg3, Static295.method5137(arg2), 5121, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
	}
}
