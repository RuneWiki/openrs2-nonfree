import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public final class Class58_Sub3 extends Class58 implements Interface5 {

	@OriginalMember(owner = "client!qq", name = "N", descriptor = "I")
	private final int anInt7107;

	@OriginalMember(owner = "client!qq", name = "A", descriptor = "I")
	private final int anInt7098;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!tm;II[III)V")
	public Class58_Sub3(@OriginalArg(0) Class4_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static171.aClass110_13, Static517.aClass308_15, arg2 * arg1, false);
		this.anInt7107 = arg1;
		this.anInt7098 = arg2;
		super.aClass4_Sub2_Sub2_10.method7316(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt8923, 0, 6408, this.anInt7107, this.anInt7098, 0, 32993, super.aClass4_Sub2_Sub2_10.anInt8409, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!tm;Lclient!g;Lclient!vp;II)V")
	public Class58_Sub3(@OriginalArg(0) Class4_Sub2_Sub2 arg0, @OriginalArg(1) Class110 arg1, @OriginalArg(2) Class308 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
		this.anInt7098 = arg4;
		this.anInt7107 = arg3;
		super.aClass4_Sub2_Sub2_10.method7316(this);
		OpenGL.glTexImage2Dub(super.anInt8923, 0, this.method7766(), arg3, arg4, 0, Static295.method5137(super.aClass110_23), Static193.method3691(super.aClass308_11), null, 0);
	}

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!tm;Lclient!g;II[FII)V")
	public Class58_Sub3(@OriginalArg(0) Class4_Sub2_Sub2 arg0, @OriginalArg(1) Class110 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static517.aClass308_19, arg2 * arg3, false);
		this.anInt7098 = arg3;
		this.anInt7107 = arg2;
		super.aClass4_Sub2_Sub2_10.method7316(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt8923, 0, this.method7766(), arg2, arg3, 0, Static295.method5137(super.aClass110_23), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!tm;Lclient!g;II[BII)V")
	public Class58_Sub3(@OriginalArg(0) Class4_Sub2_Sub2 arg0, @OriginalArg(1) Class110 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static517.aClass308_15, arg2 * arg3, false);
		this.anInt7107 = arg2;
		this.anInt7098 = arg3;
		super.aClass4_Sub2_Sub2_10.method7316(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt8923, 0, this.method7766(), arg2, arg3, 0, Static295.method5137(super.aClass110_23), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(FZ)F")
	@Override
	public float method7768(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7775() {
		return false;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "([IIIIIIII)V")
	@Override
	public void method7773(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 == 0) {
			arg3 = arg1;
		}
		super.aClass4_Sub2_Sub2_10.method7316(this);
		if (arg1 != arg3) {
			OpenGL.glPixelStorei(3314, arg3);
		}
		OpenGL.glTexSubImage2Di(super.anInt8923, 0, arg2, arg5, arg1, arg4, 32993, super.aClass4_Sub2_Sub2_10.anInt8409, arg0, 0);
		if (arg1 != arg3) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BIIILclient!g;III[B)V")
	@Override
	public void method7772(@OriginalArg(3) int arg0, @OriginalArg(4) Class110 arg1, @OriginalArg(5) int arg2, @OriginalArg(7) int arg3, @OriginalArg(8) byte[] arg4) {
		if (arg0 == 0) {
			arg0 = arg3;
		}
		super.aClass4_Sub2_Sub2_10.method7316(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg3) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt8923, 0, 0, 0, arg3, arg2, Static295.method5137(arg1), 5121, arg4, 0);
		if (arg0 != arg3) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BF)F")
	@Override
	public float method7774(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)I")
	@Override
	public int method7771() {
		return this.anInt7107;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZZB)V")
	@Override
	public void method7769(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)I")
	@Override
	public int method7770() {
		return this.anInt7098;
	}
}
