import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public final class Class19_Sub1 extends Class19 implements Interface12 {

	@OriginalMember(owner = "client!an", name = "L", descriptor = "I")
	private final int anInt201;

	@OriginalMember(owner = "client!an", name = "A", descriptor = "I")
	private final int anInt191;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!bea;Lclient!os;IIZ[FII)V")
	public Class19_Sub1(@OriginalArg(0) Class31_Sub1_Sub1 arg0, @OriginalArg(1) Class245 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static331.aClass204_17, arg3 * arg2, arg4);
		this.anInt201 = arg3;
		this.anInt191 = arg2;
		super.aClass31_Sub1_Sub1_7.method7129(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt3834, 0, this.method3094(), arg2, arg3, 0, Static580.method7901(super.aClass245_10), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method3099(arg5, arg3, arg2, super.anInt3834);
		}
	}

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!bea;Lclient!os;Lclient!mg;II)V")
	public Class19_Sub1(@OriginalArg(0) Class31_Sub1_Sub1 arg0, @OriginalArg(1) Class245 arg1, @OriginalArg(2) Class204 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		this.anInt191 = arg3;
		this.anInt201 = arg4;
		super.aClass31_Sub1_Sub1_7.method7129(this);
		OpenGL.glTexImage2Dub(super.anInt3834, 0, this.method3094(), arg3, arg4, 0, Static580.method7901(super.aClass245_10), Static323.method4780(super.aClass204_8), null, 0);
	}

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!bea;IIZ[III)V")
	public Class19_Sub1(@OriginalArg(0) Class31_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static18.aClass245_3, Static331.aClass204_13, arg1 * arg2, arg3);
		this.anInt201 = arg2;
		this.anInt191 = arg1;
		super.aClass31_Sub1_Sub1_7.method7129(this);
		if (arg3 && arg6 == 0) {
			this.method3097(arg4, super.anInt3834, arg2, arg1);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt3834, 0, 6408, this.anInt191, this.anInt201, 0, 32993, super.aClass31_Sub1_Sub1_7.anInt1093, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!bea;Lclient!os;IIZ[BII)V")
	public Class19_Sub1(@OriginalArg(0) Class31_Sub1_Sub1 arg0, @OriginalArg(1) Class245 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static331.aClass204_13, arg3 * arg2, arg4);
		this.anInt201 = arg3;
		this.anInt191 = arg2;
		super.aClass31_Sub1_Sub1_7.method7129(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method3100(arg2, super.anInt3834, arg5, arg3);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt3834, 0, this.method3094(), arg2, arg3, 0, Static580.method7901(super.aClass245_10), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ILclient!os;II[BIIII)V")
	@Override
	public void method2989(@OriginalArg(1) Class245 arg0, @OriginalArg(4) byte[] arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(8) int arg4) {
		super.aClass31_Sub1_Sub1_7.method7129(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg4);
		OpenGL.glTexSubImage2Dub(super.anInt3834, 0, 0, 0, arg2, arg3, Static580.method7901(arg0), 5121, arg1, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ZZB)V")
	@Override
	public void method2990(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.aClass31_Sub1_Sub1_7.method7129(this);
		OpenGL.glTexParameteri(super.anInt3834, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt3834, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IF)F")
	@Override
	public float method2988(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt191;
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method2992() {
		return true;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BILclient!os;I[FIIII)V")
	public void method206(@OriginalArg(2) Class245 arg0, @OriginalArg(4) float[] arg1, @OriginalArg(6) int arg2, @OriginalArg(8) int arg3) {
		super.aClass31_Sub1_Sub1_7.method7129(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt3834, 0, 0, 0, arg3, arg2, Static580.method7901(arg0), 5121, arg1, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)I")
	@Override
	public int method2991() {
		return this.anInt201;
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(I)I")
	@Override
	public int method2993() {
		return this.anInt191;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(II[IIIIII)V")
	@Override
	public void method2995(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass31_Sub1_Sub1_7.method7129(this);
		OpenGL.glPixelStorei(3314, arg2);
		OpenGL.glTexSubImage2Di(super.anInt3834, 0, arg3, arg5, arg0, arg4, 32993, super.aClass31_Sub1_Sub1_7.anInt1093, arg1, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(FB)F")
	@Override
	public float method2994(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt201;
	}
}
