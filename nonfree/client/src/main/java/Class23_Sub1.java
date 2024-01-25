import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class23_Sub1 extends Class23 implements Interface26 {

	@OriginalMember(owner = "client!ar", name = "F", descriptor = "I")
	private final int anInt433;

	@OriginalMember(owner = "client!ar", name = "w", descriptor = "I")
	private final int anInt431;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!rda;II[III)V")
	public Class23_Sub1(@OriginalArg(0) Class57_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static412.aClass114_17, Static453.aClass278_13, arg2 * arg1, false);
		this.anInt433 = arg2;
		this.anInt431 = arg1;
		super.aClass57_Sub3_Sub1_12.method7813(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt9693, 0, 6408, this.anInt431, this.anInt433, 0, 32993, super.aClass57_Sub3_Sub1_12.anInt8653, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!rda;Lclient!eu;II[FII)V")
	public Class23_Sub1(@OriginalArg(0) Class57_Sub3_Sub1 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static453.aClass278_17, arg2 * arg3, false);
		this.anInt433 = arg3;
		this.anInt431 = arg2;
		super.aClass57_Sub3_Sub1_12.method7813(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt9693, 0, this.method8310(), arg2, arg3, 0, Static446.method6638(super.aClass114_20), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!rda;Lclient!eu;Lclient!pj;II)V")
	public Class23_Sub1(@OriginalArg(0) Class57_Sub3_Sub1 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) Class278 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
		this.anInt431 = arg3;
		this.anInt433 = arg4;
		super.aClass57_Sub3_Sub1_12.method7813(this);
		OpenGL.glTexImage2Dub(super.anInt9693, 0, this.method8310(), arg3, arg4, 0, Static446.method6638(super.aClass114_20), Static13.method243(super.aClass278_19), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!rda;Lclient!eu;II[BII)V")
	public Class23_Sub1(@OriginalArg(0) Class57_Sub3_Sub1 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static453.aClass278_13, arg3 * arg2, false);
		this.anInt431 = arg2;
		this.anInt433 = arg3;
		super.aClass57_Sub3_Sub1_12.method7813(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt9693, 0, this.method8310(), arg2, arg3, 0, Static446.method6638(super.aClass114_20), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "([IIIIIII)V")
	@Override
	public void method4350(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(6) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt431 * this.anInt433];
		super.aClass57_Sub3_Sub1_12.method7813(this);
		OpenGL.glGetTexImagei(super.anInt9693, 0, 32993, 5121, local12, 0);
		for (@Pc(36) int local36 = 0; local36 < arg1; local36++) {
			Static682.method796(local12, (arg1 - local36 - 1) * this.anInt431, arg0, arg2 * local36, arg2);
		}
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4352() {
		return false;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "([IIBIIIII)V")
	@Override
	public void method4351(@OriginalArg(0) int[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass57_Sub3_Sub1_12.method7813(this);
		if (arg1 == 0) {
			arg1 = arg4;
		}
		if (arg1 != arg4) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt9693, 0, arg2, arg3, arg4, arg5, 32993, super.aClass57_Sub3_Sub1_12.anInt8653, arg0, 0);
		if (arg1 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZIZ)V")
	@Override
	public void method4348(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I[BIIIIILclient!eu;I)V")
	@Override
	public void method4354(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(7) Class114 arg4) {
		if (arg0 == 0) {
			arg0 = arg3;
		}
		super.aClass57_Sub3_Sub1_12.method7813(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg3) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt9693, 0, 0, 0, arg3, arg2, Static446.method6638(arg4), 5121, arg1, 0);
		if (arg0 != arg3) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IF)F")
	@Override
	public float method4346(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)I")
	@Override
	public int method4349() {
		return this.anInt433;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(BF)F")
	@Override
	public float method4353(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(B)I")
	@Override
	public int method4347() {
		return this.anInt431;
	}
}
