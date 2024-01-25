import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class28_Sub3 extends Class28 implements Interface9 {

	@OriginalMember(owner = "client!gd", name = "M", descriptor = "I")
	private final int anInt3058;

	@OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
	private final int anInt3048;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!md;II[III)V")
	public Class28_Sub3(@OriginalArg(0) Class144_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static641.aClass260_12, Static18.aClass19_4, arg1 * arg2, false);
		this.anInt3058 = arg1;
		this.anInt3048 = arg2;
		super.aClass144_Sub1_Sub2_12.method5643(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt11032, 0, 6408, this.anInt3058, this.anInt3048, 0, 32993, super.aClass144_Sub1_Sub2_12.anInt6620, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!md;Lclient!o;II[FII)V")
	public Class28_Sub3(@OriginalArg(0) Class144_Sub1_Sub2 arg0, @OriginalArg(1) Class260 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static18.aClass19_8, arg3 * arg2, false);
		this.anInt3048 = arg3;
		this.anInt3058 = arg2;
		super.aClass144_Sub1_Sub2_12.method5643(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt11032, 0, this.method9353(), arg2, arg3, 0, Static40.method669(super.aClass260_15), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!md;Lclient!o;Lclient!al;II)V")
	public Class28_Sub3(@OriginalArg(0) Class144_Sub1_Sub2 arg0, @OriginalArg(1) Class260 arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
		this.anInt3058 = arg3;
		this.anInt3048 = arg4;
		super.aClass144_Sub1_Sub2_12.method5643(this);
		OpenGL.glTexImage2Dub(super.anInt11032, 0, this.method9353(), arg3, arg4, 0, Static40.method669(super.aClass260_15), Static158.method2257(super.aClass19_20), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!md;Lclient!o;II[BII)V")
	public Class28_Sub3(@OriginalArg(0) Class144_Sub1_Sub2 arg0, @OriginalArg(1) Class260 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static18.aClass19_4, arg3 * arg2, false);
		this.anInt3058 = arg2;
		this.anInt3048 = arg3;
		super.aClass144_Sub1_Sub2_12.method5643(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt11032, 0, this.method9353(), arg2, arg3, 0, Static40.method669(super.aClass260_15), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!o;IIIIZI[B)V")
	@Override
	public void method4776(@OriginalArg(0) int arg0, @OriginalArg(1) Class260 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(8) byte[] arg4) {
		if (arg3 == 0) {
			arg3 = arg2;
		}
		super.aClass144_Sub1_Sub2_12.method5643(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg3 != arg2) {
			OpenGL.glPixelStorei(3314, arg3);
		}
		OpenGL.glTexSubImage2Dub(super.anInt11032, 0, 0, 0, arg2, arg0, Static40.method669(arg1), 5121, arg4, 0);
		if (arg3 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZZZ)V")
	@Override
	public void method4773(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II[IIIIZI)V")
	@Override
	public void method4771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(7) int arg5) {
		if (arg1 == 0) {
			arg1 = arg4;
		}
		super.aClass144_Sub1_Sub2_12.method5643(this);
		if (arg4 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt11032, 0, arg5, arg3, arg4, arg0, 32993, super.aClass144_Sub1_Sub2_12.anInt6620, arg2, 0);
		if (arg1 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)I")
	@Override
	public int method4775() {
		return this.anInt3058;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4769() {
		return false;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)I")
	@Override
	public int method4774() {
		return this.anInt3048;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZIIII[II)V")
	@Override
	public void method4768(@OriginalArg(4) int arg0, @OriginalArg(5) int[] arg1, @OriginalArg(6) int arg2) {
		@Pc(17) int[] local17 = new int[this.anInt3048 * this.anInt3058];
		super.aClass144_Sub1_Sub2_12.method5643(this);
		OpenGL.glGetTexImagei(super.anInt11032, 0, 32993, 5121, local17, 0);
		for (@Pc(32) int local32 = 0; local32 < arg2; local32++) {
			Static691.method84(local17, (arg2 - local32 - 1) * this.anInt3058, arg1, arg0 * local32, arg0);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(FI)F")
	@Override
	public float method4770(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(FB)F")
	@Override
	public float method4772(@OriginalArg(0) float arg0) {
		return arg0;
	}
}
