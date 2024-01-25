import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nia")
public final class Class40_Sub4 extends Class40 implements Interface11 {

	@OriginalMember(owner = "client!nia", name = "D", descriptor = "I")
	private final int anInt6845;

	@OriginalMember(owner = "client!nia", name = "K", descriptor = "I")
	private final int anInt6851;

	@OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(Lclient!oia;Lclient!ul;II[BII)V")
	public Class40_Sub4(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) Class361 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static553.aClass330_14, arg2 * arg3, false);
		this.anInt6845 = arg3;
		this.anInt6851 = arg2;
		super.aClass16_Sub1_Sub2_7.method6197(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt6834, 0, this.method5712(), arg2, arg3, 0, Static299.method4638(super.aClass361_13), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(Lclient!oia;Lclient!ul;Lclient!so;II)V")
	public Class40_Sub4(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) Class361 arg1, @OriginalArg(2) Class330 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg4 * arg3, false);
		this.anInt6845 = arg4;
		this.anInt6851 = arg3;
		super.aClass16_Sub1_Sub2_7.method6197(this);
		OpenGL.glTexImage2Dub(super.anInt6834, 0, this.method5712(), arg3, arg4, 0, Static299.method4638(super.aClass361_13), Static525.method7361(super.aClass330_10), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(Lclient!oia;II[III)V")
	public Class40_Sub4(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static264.aClass361_8, Static553.aClass330_14, arg2 * arg1, false);
		this.anInt6851 = arg1;
		this.anInt6845 = arg2;
		super.aClass16_Sub1_Sub2_7.method6197(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt6834, 0, 6408, this.anInt6851, this.anInt6845, 0, 32993, super.aClass16_Sub1_Sub2_7.anInt7565, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(Lclient!oia;Lclient!ul;II[FII)V")
	public Class40_Sub4(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) Class361 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static553.aClass330_18, arg2 * arg3, false);
		this.anInt6845 = arg3;
		this.anInt6851 = arg2;
		super.aClass16_Sub1_Sub2_7.method6197(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt6834, 0, this.method5712(), arg2, arg3, 0, Static299.method4638(super.aClass361_13), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(IIZI[III)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(4) int[] arg1, @OriginalArg(6) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt6851 * this.anInt6845];
		super.aClass16_Sub1_Sub2_7.method6197(this);
		OpenGL.glGetTexImagei(super.anInt6834, 0, 32993, 5121, local12, 0);
		for (@Pc(31) int local31 = 0; local31 < arg2; local31++) {
			Static689.method8054(local12, this.anInt6851 * (arg2 - local31 - 1), arg1, arg0 * local31, arg0);
		}
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "([IIIIIIII)V")
	@Override
	public void method8768(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass16_Sub1_Sub2_7.method6197(this);
		if (arg3 == 0) {
			arg3 = arg5;
		}
		if (arg3 != arg5) {
			OpenGL.glPixelStorei(3314, arg3);
		}
		OpenGL.glTexSubImage2Di(super.anInt6834, 0, arg2, arg1, arg5, arg4, 32993, super.aClass16_Sub1_Sub2_7.anInt7565, arg0, 0);
		if (arg5 != arg3) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(FB)F")
	@Override
	public float method8762(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!nia", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8763() {
		return false;
	}

	@OriginalMember(owner = "client!nia", name = "c", descriptor = "(B)I")
	@Override
	public int method8765() {
		return this.anInt6845;
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "([BIIILclient!ul;IIII)V")
	@Override
	public void method8764(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class361 arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4) {
		super.aClass16_Sub1_Sub2_7.method6197(this);
		if (arg3 == 0) {
			arg3 = arg4;
		}
		OpenGL.glPixelStorei(3317, 1);
		if (arg3 != arg4) {
			OpenGL.glPixelStorei(3314, arg3);
		}
		OpenGL.glTexSubImage2Dub(super.anInt6834, 0, 0, 0, arg4, arg1, Static299.method4638(arg2), 5121, arg0, 0);
		if (arg4 != arg3) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(IF)F")
	@Override
	public float method8766(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method8761(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(I)I")
	@Override
	public int method8760() {
		return this.anInt6851;
	}
}
