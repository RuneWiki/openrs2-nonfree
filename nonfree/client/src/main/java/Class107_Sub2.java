import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class107_Sub2 extends Class107 implements Interface10 {

	@OriginalMember(owner = "client!k", name = "H", descriptor = "I")
	private final int anInt5458;

	@OriginalMember(owner = "client!k", name = "M", descriptor = "I")
	private final int anInt5462;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lclient!fc;Lclient!nea;II[FII)V")
	public Class107_Sub2(@OriginalArg(0) Class101_Sub1_Sub1 arg0, @OriginalArg(1) Class244 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static114.aClass79_11, arg2 * arg3, false);
		this.anInt5458 = arg3;
		this.anInt5462 = arg2;
		super.aClass101_Sub1_Sub1_12.method5909(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt10614, 0, this.method9092(), arg2, arg3, 0, Static410.method6767(super.aClass244_14), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lclient!fc;II[III)V")
	public Class107_Sub2(@OriginalArg(0) Class101_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static584.aClass244_9, Static114.aClass79_7, arg1 * arg2, false);
		this.anInt5462 = arg1;
		this.anInt5458 = arg2;
		super.aClass101_Sub1_Sub1_12.method5909(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt10614, 0, 6408, this.anInt5462, this.anInt5458, 0, 32993, super.aClass101_Sub1_Sub1_12.anInt3368, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lclient!fc;Lclient!nea;Lclient!dr;II)V")
	public Class107_Sub2(@OriginalArg(0) Class101_Sub1_Sub1 arg0, @OriginalArg(1) Class244 arg1, @OriginalArg(2) Class79 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg4 * arg3, false);
		this.anInt5462 = arg3;
		this.anInt5458 = arg4;
		super.aClass101_Sub1_Sub1_12.method5909(this);
		OpenGL.glTexImage2Dub(super.anInt10614, 0, this.method9092(), arg3, arg4, 0, Static410.method6767(super.aClass244_14), Static139.method2439(super.aClass79_19), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lclient!fc;Lclient!nea;II[BII)V")
	public Class107_Sub2(@OriginalArg(0) Class101_Sub1_Sub1 arg0, @OriginalArg(1) Class244 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static114.aClass79_7, arg2 * arg3, false);
		this.anInt5462 = arg2;
		this.anInt5458 = arg3;
		super.aClass101_Sub1_Sub1_12.method5909(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt10614, 0, this.method9092(), arg2, arg3, 0, Static410.method6767(super.aClass244_14), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IF)F")
	@Override
	public float method9102(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II[IIIIII)V")
	@Override
	public void method9108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == 0) {
			arg0 = arg4;
		}
		super.aClass101_Sub1_Sub1_12.method5909(this);
		if (arg4 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Di(super.anInt10614, 0, arg5, arg1, arg4, arg3, 32993, super.aClass101_Sub1_Sub1_12.anInt3368, arg2, 0);
		if (arg0 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(FI)F")
	@Override
	public float method9104(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IZLclient!nea;I[BIIII)V")
	@Override
	public void method9106(@OriginalArg(2) Class244 arg0, @OriginalArg(4) byte[] arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(8) int arg4) {
		if (arg2 == 0) {
			arg2 = arg3;
		}
		super.aClass101_Sub1_Sub1_12.method5909(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg2 != arg3) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Dub(super.anInt10614, 0, 0, 0, arg3, arg4, Static410.method6767(arg0), 5121, arg1, 0);
		if (arg2 != arg3) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method9107(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(B)I")
	@Override
	public int method9105() {
		return this.anInt5462;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(III[IIII)V")
	@Override
	public void method9100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(12) int[] local12 = new int[this.anInt5462 * this.anInt5458];
		super.aClass101_Sub1_Sub1_12.method5909(this);
		OpenGL.glGetTexImagei(super.anInt10614, 0, 32993, 5121, local12, 0);
		for (@Pc(29) int local29 = 0; local29 < arg0; local29++) {
			Static679.method4128(local12, (arg0 - local29 - 1) * this.anInt5462, arg2, arg1 * local29, arg1);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9103() {
		return false;
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(I)I")
	@Override
	public int method9101() {
		return this.anInt5458;
	}
}
