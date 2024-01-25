import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class28_Sub2 extends Class28 implements Interface9 {

	@OriginalMember(owner = "client!dh", name = "J", descriptor = "I")
	private final int anInt1838;

	@OriginalMember(owner = "client!dh", name = "D", descriptor = "I")
	private final int anInt1840;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!md;Lclient!o;IIZ[BII)V")
	public Class28_Sub2(@OriginalArg(0) Class144_Sub1_Sub2 arg0, @OriginalArg(1) Class260 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static18.aClass19_4, arg3 * arg2, arg4);
		this.anInt1838 = arg2;
		this.anInt1840 = arg3;
		super.aClass144_Sub1_Sub2_12.method5643(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 && arg7 == 0 && arg6 == 0) {
			this.method9350(arg5, super.anInt11032, arg3, arg2);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt11032, 0, this.method9353(), arg2, arg3, 0, Static40.method669(super.aClass260_15), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!md;Lclient!o;Lclient!al;II)V")
	public Class28_Sub2(@OriginalArg(0) Class144_Sub1_Sub2 arg0, @OriginalArg(1) Class260 arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		this.anInt1838 = arg3;
		this.anInt1840 = arg4;
		super.aClass144_Sub1_Sub2_12.method5643(this);
		OpenGL.glTexImage2Dub(super.anInt11032, 0, this.method9353(), arg3, arg4, 0, Static40.method669(super.aClass260_15), Static158.method2257(super.aClass19_20), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!md;Lclient!o;IIZ[FII)V")
	public Class28_Sub2(@OriginalArg(0) Class144_Sub1_Sub2 arg0, @OriginalArg(1) Class260 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static18.aClass19_8, arg2 * arg3, arg4);
		this.anInt1838 = arg2;
		this.anInt1840 = arg3;
		super.aClass144_Sub1_Sub2_12.method5643(this);
		if (!arg4 && arg7 == 0 && arg6 == 0) {
			this.method9357(arg2, arg5, arg3, super.anInt11032);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt11032, 0, this.method9353(), arg2, arg3, 0, Static40.method669(super.aClass260_15), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!md;IIZ[III)V")
	public Class28_Sub2(@OriginalArg(0) Class144_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static641.aClass260_12, Static18.aClass19_4, arg1 * arg2, arg3);
		this.anInt1840 = arg2;
		this.anInt1838 = arg1;
		super.aClass144_Sub1_Sub2_12.method5643(this);
		if (arg3 && arg6 == 0 && arg5 == 0) {
			this.method9351(arg2, super.anInt11032, arg1, arg4);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt11032, 0, 6408, this.anInt1838, this.anInt1840, 0, 32993, super.aClass144_Sub1_Sub2_12.anInt6620, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIII[FLclient!o;II)V")
	public void method1762(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) float[] arg2, @OriginalArg(6) Class260 arg3) {
		super.aClass144_Sub1_Sub2_12.method5643(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt11032, 0, 0, 0, arg0, arg1, Static40.method669(arg3), 5121, arg2, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)I")
	@Override
	public int method4774() {
		return this.anInt1840;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZIIII[II)V")
	@Override
	public void method4768(@OriginalArg(4) int arg0, @OriginalArg(5) int[] arg1, @OriginalArg(6) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt1838 * this.anInt1840];
		super.aClass144_Sub1_Sub2_12.method5643(this);
		OpenGL.glGetTexImagei(super.anInt11032, 0, 32993, 5121, local12, 0);
		for (@Pc(27) int local27 = 0; local27 < arg2; local27++) {
			Static691.method84(local12, this.anInt1838 * (arg2 - local27 - 1), arg1, arg0 * local27, arg0);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II[IIIIZI)V")
	@Override
	public void method4771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(7) int arg5) {
		super.aClass144_Sub1_Sub2_12.method5643(this);
		OpenGL.glPixelStorei(3314, arg1);
		OpenGL.glTexSubImage2Di(super.anInt11032, 0, arg5, arg3, arg4, arg0, 32993, super.aClass144_Sub1_Sub2_12.anInt6620, arg2, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(FB)F")
	@Override
	public float method4772(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1838;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4769() {
		return true;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)I")
	@Override
	public int method4775() {
		return this.anInt1838;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(FI)F")
	@Override
	public float method4770(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1840;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILclient!o;IIIIZI[B)V")
	@Override
	public void method4776(@OriginalArg(0) int arg0, @OriginalArg(1) Class260 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(8) byte[] arg4) {
		super.aClass144_Sub1_Sub2_12.method5643(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg3);
		OpenGL.glTexSubImage2Dub(super.anInt11032, 0, 0, 0, arg2, arg0, Static40.method669(arg1), 5121, arg4, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZZZ)V")
	@Override
	public void method4773(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		super.aClass144_Sub1_Sub2_12.method5643(this);
		OpenGL.glTexParameteri(super.anInt11032, 10242, arg1 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt11032, 10243, arg0 ? 10497 : 33071);
	}
}
