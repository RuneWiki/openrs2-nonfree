import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pha")
public final class Class30_Sub3 extends Class30 implements Interface20 {

	@OriginalMember(owner = "client!pha", name = "K", descriptor = "I")
	private final int anInt7994;

	@OriginalMember(owner = "client!pha", name = "L", descriptor = "I")
	private final int anInt7995;

	@OriginalMember(owner = "client!pha", name = "<init>", descriptor = "(Lclient!ai;IIZ[III)V")
	public Class30_Sub3(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static456.aClass366_9, Static258.aClass160_9, arg2 * arg1, arg3);
		this.anInt7994 = arg1;
		this.anInt7995 = arg2;
		super.aClass16_Sub1_Sub1_12.method3889(this);
		if (arg3 && arg6 == 0) {
			this.method7914(arg1, super.anInt9806, arg4, arg2);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt9806, 0, 6408, this.anInt7994, this.anInt7995, 0, 32993, super.aClass16_Sub1_Sub1_12.anInt775, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!pha", name = "<init>", descriptor = "(Lclient!ai;Lclient!wd;Lclient!jm;II)V")
	public Class30_Sub3(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(2) Class160 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		this.anInt7994 = arg3;
		this.anInt7995 = arg4;
		super.aClass16_Sub1_Sub1_12.method3889(this);
		OpenGL.glTexImage2Dub(super.anInt9806, 0, this.method7917(), arg3, arg4, 0, Static215.method4064(super.aClass366_13), Static475.method7039(super.aClass160_18), null, 0);
	}

	@OriginalMember(owner = "client!pha", name = "<init>", descriptor = "(Lclient!ai;Lclient!wd;IIZ[FII)V")
	public Class30_Sub3(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static258.aClass160_13, arg2 * arg3, arg4);
		this.anInt7995 = arg3;
		this.anInt7994 = arg2;
		super.aClass16_Sub1_Sub1_12.method3889(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt9806, 0, this.method7917(), arg2, arg3, 0, Static215.method4064(super.aClass366_13), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method7921(arg2, arg3, arg5, super.anInt9806);
		}
	}

	@OriginalMember(owner = "client!pha", name = "<init>", descriptor = "(Lclient!ai;Lclient!wd;IIZ[BII)V")
	public Class30_Sub3(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static258.aClass160_9, arg3 * arg2, arg4);
		this.anInt7994 = arg2;
		this.anInt7995 = arg3;
		super.aClass16_Sub1_Sub1_12.method3889(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method7915(arg2, arg3, super.anInt9806, arg5);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt9806, 0, this.method7917(), arg2, arg3, 0, Static215.method4064(super.aClass366_13), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(I[IIIIII)V")
	@Override
	public void method6628(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int[] local16 = new int[this.anInt7995 * this.anInt7994];
		super.aClass16_Sub1_Sub1_12.method3889(this);
		OpenGL.glGetTexImagei(super.anInt9806, 0, 32993, 5121, local16, 0);
		for (@Pc(31) int local31 = 0; local31 < arg2; local31++) {
			Static649.method5529(local16, this.anInt7994 * (arg2 - local31 - 1), arg0, arg1 * local31, arg1);
		}
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(IIII[IIZI)V")
	@Override
	public void method6629(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		super.aClass16_Sub1_Sub1_12.method3889(this);
		OpenGL.glPixelStorei(3314, arg1);
		OpenGL.glTexSubImage2Di(super.anInt9806, 0, arg4, arg2, arg0, arg5, 32993, super.aClass16_Sub1_Sub1_12.anInt775, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!pha", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method6626() {
		return true;
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(BIIII[FILclient!wd;I)V")
	public void method6633(@OriginalArg(4) int arg0, @OriginalArg(5) float[] arg1, @OriginalArg(6) int arg2, @OriginalArg(7) Class366 arg3) {
		super.aClass16_Sub1_Sub1_12.method3889(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt9806, 0, 0, 0, arg2, arg0, Static215.method4064(arg3), 5121, arg1, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(ZZB)V")
	@Override
	public void method6623(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.aClass16_Sub1_Sub1_12.method3889(this);
		OpenGL.glTexParameteri(super.anInt9806, 10242, arg1 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt9806, 10243, arg0 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(IIB[BIIILclient!wd;I)V")
	@Override
	public void method6631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(7) Class366 arg4) {
		super.aClass16_Sub1_Sub1_12.method3889(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg3);
		OpenGL.glTexSubImage2Dub(super.anInt9806, 0, 0, 0, arg1, arg0, Static215.method4064(arg4), 5121, arg2, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(Z)I")
	@Override
	public int method6630() {
		return this.anInt7995;
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(FI)F")
	@Override
	public float method6625(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt7995;
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(I)I")
	@Override
	public int method6624() {
		return this.anInt7994;
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(IF)F")
	@Override
	public float method6627(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt7994;
	}
}
