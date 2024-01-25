import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class40_Sub2 extends Class40 implements Interface11 {

	@OriginalMember(owner = "client!io", name = "F", descriptor = "I")
	private final int anInt4891;

	@OriginalMember(owner = "client!io", name = "z", descriptor = "I")
	private final int anInt4885;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!oia;IIZ[III)V")
	public Class40_Sub2(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static264.aClass361_8, Static553.aClass330_14, arg2 * arg1, arg3);
		this.anInt4891 = arg2;
		this.anInt4885 = arg1;
		super.aClass16_Sub1_Sub2_7.method6197(this);
		if (arg3 && arg6 == 0) {
			this.method5711(arg4, arg1, super.anInt6834, arg2);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt6834, 0, 6408, this.anInt4885, this.anInt4891, 0, 32993, super.aClass16_Sub1_Sub2_7.anInt7565, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!oia;Lclient!ul;IIZ[FII)V")
	public Class40_Sub2(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) Class361 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static553.aClass330_18, arg3 * arg2, arg4);
		this.anInt4885 = arg2;
		this.anInt4891 = arg3;
		super.aClass16_Sub1_Sub2_7.method6197(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt6834, 0, this.method5712(), arg2, arg3, 0, Static299.method4638(super.aClass361_13), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method5714(arg3, arg5, arg2, super.anInt6834);
		}
	}

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!oia;Lclient!ul;Lclient!so;II)V")
	public Class40_Sub2(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) Class361 arg1, @OriginalArg(2) Class330 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg4 * arg3, false);
		this.anInt4885 = arg3;
		this.anInt4891 = arg4;
		super.aClass16_Sub1_Sub2_7.method6197(this);
		OpenGL.glTexImage2Dub(super.anInt6834, 0, this.method5712(), arg3, arg4, 0, Static299.method4638(super.aClass361_13), Static525.method7361(super.aClass330_10), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!oia;Lclient!ul;IIZ[BII)V")
	public Class40_Sub2(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) Class361 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static553.aClass330_14, arg3 * arg2, arg4);
		this.anInt4885 = arg2;
		this.anInt4891 = arg3;
		super.aClass16_Sub1_Sub2_7.method6197(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method5710(arg5, arg2, super.anInt6834, arg3);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt6834, 0, this.method5712(), arg2, arg3, 0, Static299.method4638(super.aClass361_13), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IF)F")
	@Override
	public float method8766(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt4891;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)I")
	@Override
	public int method8760() {
		return this.anInt4885;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "([IIIIIIII)V")
	@Override
	public void method8768(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass16_Sub1_Sub2_7.method6197(this);
		OpenGL.glPixelStorei(3314, arg3);
		OpenGL.glTexSubImage2Di(super.anInt6834, 0, arg2, arg1, arg5, arg4, 32993, super.aClass16_Sub1_Sub2_7.anInt7565, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "([BIIILclient!ul;IIII)V")
	@Override
	public void method8764(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class361 arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4) {
		super.aClass16_Sub1_Sub2_7.method6197(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg3);
		OpenGL.glTexSubImage2Dub(super.anInt6834, 0, 0, 0, arg4, arg1, Static299.method4638(arg2), 5121, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(II[FLclient!ul;IIIIB)V")
	public void method4103(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) Class361 arg2, @OriginalArg(7) int arg3) {
		super.aClass16_Sub1_Sub2_7.method6197(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt6834, 0, 0, 0, arg3, arg0, Static299.method4638(arg2), 5121, arg1, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(FB)F")
	@Override
	public float method8762(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt4885;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIZI[III)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(4) int[] arg1, @OriginalArg(6) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt4891 * this.anInt4885];
		super.aClass16_Sub1_Sub2_7.method6197(this);
		OpenGL.glGetTexImagei(super.anInt6834, 0, 32993, 5121, local12, 0);
		for (@Pc(32) int local32 = 0; local32 < arg2; local32++) {
			Static689.method8054(local12, (arg2 - local32 - 1) * this.anInt4885, arg1, local32 * arg0, arg0);
		}
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(B)I")
	@Override
	public int method8765() {
		return this.anInt4891;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method8761(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.aClass16_Sub1_Sub2_7.method6197(this);
		OpenGL.glTexParameteri(super.anInt6834, 10242, arg1 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt6834, 10243, arg0 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8763() {
		return true;
	}
}
