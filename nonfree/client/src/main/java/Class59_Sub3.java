import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class59_Sub3 extends Class59 implements Interface19 {

	@OriginalMember(owner = "client!ic", name = "E", descriptor = "I")
	private final int anInt3696;

	@OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
	private final int anInt3705;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!sb;Lclient!kea;II[BII)V")
	public Class59_Sub3(@OriginalArg(0) Class95_Sub3_Sub2 arg0, @OriginalArg(1) Class188 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static290.aClass189_11, arg3 * arg2, false);
		this.anInt3696 = arg3;
		this.anInt3705 = arg2;
		super.aClass95_Sub3_Sub2_8.method7112(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt5594, 0, this.method4765(), arg2, arg3, 0, Static269.method3772(super.aClass188_10), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!sb;Lclient!kea;Lclient!kf;II)V")
	public Class59_Sub3(@OriginalArg(0) Class95_Sub3_Sub2 arg0, @OriginalArg(1) Class188 arg1, @OriginalArg(2) Class189 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
		this.anInt3705 = arg3;
		this.anInt3696 = arg4;
		super.aClass95_Sub3_Sub2_8.method7112(this);
		OpenGL.glTexImage2Dub(super.anInt5594, 0, this.method4765(), arg3, arg4, 0, Static269.method3772(super.aClass188_10), Static626.method8393(super.aClass189_17), null, 0);
	}

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!sb;Lclient!kea;II[FII)V")
	public Class59_Sub3(@OriginalArg(0) Class95_Sub3_Sub2 arg0, @OriginalArg(1) Class188 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static290.aClass189_15, arg3 * arg2, false);
		this.anInt3696 = arg3;
		this.anInt3705 = arg2;
		super.aClass95_Sub3_Sub2_8.method7112(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt5594, 0, this.method4765(), arg2, arg3, 0, Static269.method3772(super.aClass188_10), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!sb;II[III)V")
	public Class59_Sub3(@OriginalArg(0) Class95_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static393.aClass188_12, Static290.aClass189_11, arg1 * arg2, false);
		this.anInt3705 = arg1;
		this.anInt3696 = arg2;
		super.aClass95_Sub3_Sub2_8.method7112(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt5594, 0, 6408, this.anInt3705, this.anInt3696, 0, 32993, super.aClass95_Sub3_Sub2_8.anInt8480, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIBII[II)V")
	@Override
	public void method3132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(5) int[] arg2) {
		@Pc(12) int[] local12 = new int[this.anInt3696 * this.anInt3705];
		super.aClass95_Sub3_Sub2_8.method7112(this);
		OpenGL.glGetTexImagei(super.anInt5594, 0, 32993, 5121, local12, 0);
		for (@Pc(32) int local32 = 0; local32 < arg0; local32++) {
			Static653.method5397(local12, this.anInt3705 * (arg0 - local32 - 1), arg2, arg1 * local32, arg1);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BF)F")
	@Override
	public float method3136(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)I")
	@Override
	public int method3134() {
		return this.anInt3705;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method3131() {
		return false;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([BILclient!kea;IIIIII)V")
	@Override
	public void method3135(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class188 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(8) int arg4) {
		if (arg2 == 0) {
			arg2 = arg3;
		}
		super.aClass95_Sub3_Sub2_8.method7112(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg3 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Dub(super.anInt5594, 0, 0, 0, arg3, arg4, Static269.method3772(arg1), 5121, arg0, 0);
		if (arg3 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIII[II)V")
	@Override
	public void method3130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) int arg5) {
		super.aClass95_Sub3_Sub2_8.method7112(this);
		if (arg1 == 0) {
			arg1 = arg3;
		}
		if (arg1 != arg3) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt5594, 0, arg0, arg2, arg3, arg5, 32993, super.aClass95_Sub3_Sub2_8.anInt8480, arg4, 0);
		if (arg3 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IF)F")
	@Override
	public float method3137(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)I")
	@Override
	public int method3133() {
		return this.anInt3696;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZBZ)V")
	@Override
	public void method3138(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
	}
}
