import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public final class Class103_Sub2 extends Class103 implements Interface14 {

	@OriginalMember(owner = "client!ga", name = "G", descriptor = "I")
	private final int anInt3209;

	@OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
	private final int anInt3213;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!lm;II[III)V")
	public Class103_Sub2(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static356.aClass88_11, Static47.aClass42_4, arg2 * arg1, false);
		this.anInt3209 = arg2;
		this.anInt3213 = arg1;
		super.aClass100_Sub1_Sub2_12.method4876(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt8494, 0, 6408, this.anInt3213, this.anInt3209, 0, 32993, super.aClass100_Sub1_Sub2_12.anInt5876, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!lm;Lclient!ec;II[FII)V")
	public Class103_Sub2(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static47.aClass42_8, arg3 * arg2, false);
		this.anInt3213 = arg2;
		this.anInt3209 = arg3;
		super.aClass100_Sub1_Sub2_12.method4876(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt8494, 0, this.method7057(), arg2, arg3, 0, Static314.method7316(super.aClass88_14), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!lm;Lclient!ec;II[BII)V")
	public Class103_Sub2(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static47.aClass42_4, arg2 * arg3, false);
		this.anInt3209 = arg3;
		this.anInt3213 = arg2;
		super.aClass100_Sub1_Sub2_12.method4876(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt8494, 0, this.method7057(), arg2, arg3, 0, Static314.method7316(super.aClass88_14), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!lm;Lclient!ec;Lclient!bt;II)V")
	public Class103_Sub2(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
		this.anInt3213 = arg3;
		this.anInt3209 = arg4;
		super.aClass100_Sub1_Sub2_12.method4876(this);
		OpenGL.glTexImage2Dub(super.anInt8494, 0, this.method7057(), arg3, arg4, 0, Static314.method7316(super.aClass88_14), Static274.method4153(super.aClass42_20), null, 0);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(FB)F")
	@Override
	public float method7065(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7064() {
		return false;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BZZ)V")
	@Override
	public void method7067(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)I")
	@Override
	public int method7063() {
		return this.anInt3213;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[BLclient!ec;IIIIII)V")
	@Override
	public void method7066(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class88 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4) {
		if (arg3 == 0) {
			arg3 = arg2;
		}
		super.aClass100_Sub1_Sub2_12.method4876(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg3 != arg2) {
			OpenGL.glPixelStorei(3314, arg3);
		}
		OpenGL.glTexSubImage2Dub(super.anInt8494, 0, 0, 0, arg2, arg4, Static314.method7316(arg1), 5121, arg0, 0);
		if (arg2 != arg3) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IBI[IIIII)V")
	@Override
	public void method7069(@OriginalArg(2) int arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass100_Sub1_Sub2_12.method4876(this);
		if (arg0 == 0) {
			arg0 = arg3;
		}
		if (arg0 != arg3) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Di(super.anInt8494, 0, arg2, arg5, arg3, arg4, 32993, super.aClass100_Sub1_Sub2_12.anInt5876, arg1, 0);
		if (arg3 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)I")
	@Override
	public int method7068() {
		return this.anInt3209;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZF)F")
	@Override
	public float method7070(@OriginalArg(1) float arg0) {
		return arg0;
	}
}
