import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public final class Class103_Sub4 extends Class103 implements Interface14 {

	@OriginalMember(owner = "client!tg", name = "Q", descriptor = "I")
	private final int anInt8512;

	@OriginalMember(owner = "client!tg", name = "I", descriptor = "I")
	private final int anInt8505;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lclient!lm;IIZ[III)V")
	public Class103_Sub4(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static356.aClass88_11, Static47.aClass42_4, arg2 * arg1, arg3);
		this.anInt8512 = arg1;
		this.anInt8505 = arg2;
		super.aClass100_Sub1_Sub2_12.method4876(this);
		if (arg3 && arg6 == 0) {
			this.method7051(arg1, super.anInt8494, arg4, arg2);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt8494, 0, 6408, this.anInt8512, this.anInt8505, 0, 32993, super.aClass100_Sub1_Sub2_12.anInt5876, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lclient!lm;Lclient!ec;IIZ[FII)V")
	public Class103_Sub4(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static47.aClass42_8, arg3 * arg2, arg4);
		this.anInt8505 = arg3;
		this.anInt8512 = arg2;
		super.aClass100_Sub1_Sub2_12.method4876(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt8494, 0, this.method7057(), arg2, arg3, 0, Static314.method7316(super.aClass88_14), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method7059(arg3, arg2, arg5, super.anInt8494);
		}
	}

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lclient!lm;Lclient!ec;IIZ[BII)V")
	public Class103_Sub4(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static47.aClass42_4, arg2 * arg3, arg4);
		this.anInt8512 = arg2;
		this.anInt8505 = arg3;
		super.aClass100_Sub1_Sub2_12.method4876(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method7053(super.anInt8494, arg2, arg5, arg3);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt8494, 0, this.method7057(), arg2, arg3, 0, Static314.method7316(super.aClass88_14), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lclient!lm;Lclient!ec;Lclient!bt;II)V")
	public Class103_Sub4(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		this.anInt8505 = arg4;
		this.anInt8512 = arg3;
		super.aClass100_Sub1_Sub2_12.method4876(this);
		OpenGL.glTexImage2Dub(super.anInt8494, 0, this.method7057(), arg3, arg4, 0, Static314.method7316(super.aClass88_14), Static274.method4153(super.aClass42_20), null, 0);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7064() {
		return true;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IBI[IIIII)V")
	@Override
	public void method7069(@OriginalArg(2) int arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass100_Sub1_Sub2_12.method4876(this);
		OpenGL.glPixelStorei(3314, arg0);
		OpenGL.glTexSubImage2Di(super.anInt8494, 0, arg2, arg5, arg3, arg4, 32993, super.aClass100_Sub1_Sub2_12.anInt5876, arg1, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZF)F")
	@Override
	public float method7070(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt8512;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I[BLclient!ec;IIIIII)V")
	@Override
	public void method7066(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class88 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4) {
		super.aClass100_Sub1_Sub2_12.method4876(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg3);
		OpenGL.glTexSubImage2Dub(super.anInt8494, 0, 0, 0, arg2, arg4, Static314.method7316(arg1), 5121, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(FB)F")
	@Override
	public float method7065(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt8505;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BZZ)V")
	@Override
	public void method7067(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		super.aClass100_Sub1_Sub2_12.method4876(this);
		OpenGL.glTexParameteri(super.anInt8494, 10242, arg1 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt8494, 10243, arg0 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)I")
	@Override
	public int method7068() {
		return this.anInt8505;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)I")
	@Override
	public int method7063() {
		return this.anInt8512;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I[FLclient!ec;IIIIII)V")
	public void method7073(@OriginalArg(1) float[] arg0, @OriginalArg(2) Class88 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		super.aClass100_Sub1_Sub2_12.method4876(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt8494, 0, 0, 0, arg3, arg2, Static314.method7316(arg1), 5121, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
	}
}
