import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class23_Sub2 extends Class23 implements Interface2 {

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
	private final int anInt4564;

	@OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
	private final int anInt4570;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!oaa;IIZ[III)V")
	public Class23_Sub2(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static169.aClass265_9, Static417.aClass250_14, arg1 * arg2, arg3);
		this.anInt4564 = arg1;
		this.anInt4570 = arg2;
		super.aClass132_Sub1_Sub1_12.method7635(this);
		if (arg3 && arg6 == 0) {
			this.method8245(arg1, super.anInt9768, arg4, arg2);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt9768, 0, 6408, this.anInt4564, this.anInt4570, 0, 32993, super.aClass132_Sub1_Sub1_12.anInt7181, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!oaa;Lclient!pb;IIZ[FII)V")
	public Class23_Sub2(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) Class265 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static417.aClass250_18, arg3 * arg2, arg4);
		this.anInt4570 = arg3;
		this.anInt4564 = arg2;
		super.aClass132_Sub1_Sub1_12.method7635(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt9768, 0, this.method8248(), arg2, arg3, 0, Static233.method3518(super.aClass265_17), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method8252(arg3, arg2, arg5, super.anInt9768);
		}
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!oaa;Lclient!pb;IIZ[BII)V")
	public Class23_Sub2(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) Class265 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static417.aClass250_14, arg2 * arg3, arg4);
		this.anInt4564 = arg2;
		this.anInt4570 = arg3;
		super.aClass132_Sub1_Sub1_12.method7635(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method8254(arg5, arg3, arg2, super.anInt9768);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt9768, 0, this.method8248(), arg2, arg3, 0, Static233.method3518(super.aClass265_17), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!oaa;Lclient!pb;Lclient!oea;II)V")
	public Class23_Sub2(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) Class265 arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg4 * arg3, false);
		this.anInt4570 = arg4;
		this.anInt4564 = arg3;
		super.aClass132_Sub1_Sub1_12.method7635(this);
		OpenGL.glTexImage2Dub(super.anInt9768, 0, this.method8248(), arg3, arg4, 0, Static233.method3518(super.aClass265_17), Static541.method5282(super.aClass250_19), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II[BLclient!pb;IIIII)V")
	@Override
	public void method8899(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class265 arg2, @OriginalArg(4) int arg3, @OriginalArg(7) int arg4) {
		super.aClass132_Sub1_Sub1_12.method7635(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg0);
		OpenGL.glTexSubImage2Dub(super.anInt9768, 0, 0, 0, arg3, arg4, Static233.method3518(arg2), 5121, arg1, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[IIIIZII)V")
	@Override
	public void method8903(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass132_Sub1_Sub1_12.method7635(this);
		OpenGL.glPixelStorei(3314, arg1);
		OpenGL.glTexSubImage2Di(super.anInt9768, 0, arg2, arg4, arg5, arg3, 32993, super.aClass132_Sub1_Sub1_12.anInt7181, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)I")
	@Override
	public int method8902() {
		return this.anInt4564;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZZZ)V")
	@Override
	public void method8901(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		super.aClass132_Sub1_Sub1_12.method7635(this);
		OpenGL.glTexParameteri(super.anInt9768, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt9768, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII[FLclient!pb;III)V")
	public void method3893(@OriginalArg(4) float[] arg0, @OriginalArg(5) Class265 arg1, @OriginalArg(6) int arg2, @OriginalArg(7) int arg3) {
		super.aClass132_Sub1_Sub1_12.method7635(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt9768, 0, 0, 0, arg3, arg2, Static233.method3518(arg1), 5121, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(FI)F")
	@Override
	public float method8898(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt4564;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8904() {
		return true;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(FZ)F")
	@Override
	public float method8900(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt4570;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII[III)V")
	@Override
	public void method8897(@OriginalArg(3) int arg0, @OriginalArg(4) int[] arg1, @OriginalArg(5) int arg2) {
		@Pc(24) int[] local24 = new int[this.anInt4570 * this.anInt4564];
		super.aClass132_Sub1_Sub1_12.method7635(this);
		OpenGL.glGetTexImagei(super.anInt9768, 0, 32993, 5121, local24, 0);
		for (@Pc(41) int local41 = 0; local41 < arg0; local41++) {
			Static679.method1569(local24, this.anInt4564 * (arg0 - local41 - 1), arg1, arg2 * local41, arg2);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)I")
	@Override
	public int method8896() {
		return this.anInt4570;
	}
}
