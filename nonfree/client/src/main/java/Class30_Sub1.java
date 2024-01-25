import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iia")
public final class Class30_Sub1 extends Class30 implements Interface20 {

	@OriginalMember(owner = "client!iia", name = "D", descriptor = "I")
	private final int anInt5218;

	@OriginalMember(owner = "client!iia", name = "B", descriptor = "I")
	private final int anInt5216;

	@OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(Lclient!ai;Lclient!wd;II[FII)V")
	public Class30_Sub1(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static258.aClass160_13, arg2 * arg3, false);
		this.anInt5218 = arg2;
		this.anInt5216 = arg3;
		super.aClass16_Sub1_Sub1_12.method3889(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt9806, 0, this.method7917(), arg2, arg3, 0, Static215.method4064(super.aClass366_13), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(Lclient!ai;Lclient!wd;II[BII)V")
	public Class30_Sub1(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static258.aClass160_9, arg3 * arg2, false);
		this.anInt5218 = arg2;
		this.anInt5216 = arg3;
		super.aClass16_Sub1_Sub1_12.method3889(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt9806, 0, this.method7917(), arg2, arg3, 0, Static215.method4064(super.aClass366_13), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(Lclient!ai;II[III)V")
	public Class30_Sub1(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static456.aClass366_9, Static258.aClass160_9, arg1 * arg2, false);
		this.anInt5218 = arg1;
		this.anInt5216 = arg2;
		super.aClass16_Sub1_Sub1_12.method3889(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt9806, 0, 6408, this.anInt5218, this.anInt5216, 0, 32993, super.aClass16_Sub1_Sub1_12.anInt775, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(Lclient!ai;Lclient!wd;Lclient!jm;II)V")
	public Class30_Sub1(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(2) Class160 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg4 * arg3, false);
		this.anInt5216 = arg4;
		this.anInt5218 = arg3;
		super.aClass16_Sub1_Sub1_12.method3889(this);
		OpenGL.glTexImage2Dub(super.anInt9806, 0, this.method7917(), arg3, arg4, 0, Static215.method4064(super.aClass366_13), Static475.method7039(super.aClass160_18), null, 0);
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(FI)F")
	@Override
	public float method6625(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method6626() {
		return false;
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(IIB[BIIILclient!wd;I)V")
	@Override
	public void method6631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(7) Class366 arg4) {
		super.aClass16_Sub1_Sub1_12.method3889(this);
		if (arg3 == 0) {
			arg3 = arg1;
		}
		OpenGL.glPixelStorei(3317, 1);
		if (arg3 != arg1) {
			OpenGL.glPixelStorei(3314, arg3);
		}
		OpenGL.glTexSubImage2Dub(super.anInt9806, 0, 0, 0, arg1, arg0, Static215.method4064(arg4), 5121, arg2, 0);
		if (arg3 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(Z)I")
	@Override
	public int method6630() {
		return this.anInt5216;
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(ZZB)V")
	@Override
	public void method6623(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(IIII[IIZI)V")
	@Override
	public void method6629(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		super.aClass16_Sub1_Sub1_12.method3889(this);
		if (arg1 == 0) {
			arg1 = arg0;
		}
		if (arg1 != arg0) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt9806, 0, arg4, arg2, arg0, arg5, 32993, super.aClass16_Sub1_Sub1_12.anInt775, arg3, 0);
		if (arg1 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(IF)F")
	@Override
	public float method6627(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(I[IIIIII)V")
	@Override
	public void method6628(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt5218 * this.anInt5216];
		super.aClass16_Sub1_Sub1_12.method3889(this);
		OpenGL.glGetTexImagei(super.anInt9806, 0, 32993, 5121, local12, 0);
		for (@Pc(32) int local32 = 0; local32 < arg2; local32++) {
			Static649.method5529(local12, (arg2 - local32 - 1) * this.anInt5218, arg0, arg1 * local32, arg1);
		}
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(I)I")
	@Override
	public int method6624() {
		return this.anInt5218;
	}
}
