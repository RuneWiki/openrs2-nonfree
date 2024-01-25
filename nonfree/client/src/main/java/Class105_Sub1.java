import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hia")
public final class Class105_Sub1 extends Class105 implements Interface2 {

	@OriginalMember(owner = "client!hia", name = "J", descriptor = "I")
	private final int anInt4879;

	@OriginalMember(owner = "client!hia", name = "I", descriptor = "I")
	private final int anInt4878;

	@OriginalMember(owner = "client!hia", name = "<init>", descriptor = "(Lclient!ck;Lclient!em;Lclient!ew;II)V")
	public Class105_Sub1(@OriginalArg(0) Class33_Sub1_Sub1 arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) Class89 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
		this.anInt4879 = arg4;
		this.anInt4878 = arg3;
		super.aClass33_Sub1_Sub1_10.method1987(this);
		OpenGL.glTexImage2Dub(super.anInt8841, 0, this.method7307(), arg3, arg4, 0, Static341.method5637(super.aClass82_15), Static50.method1154(super.aClass89_19), null, 0);
	}

	@OriginalMember(owner = "client!hia", name = "<init>", descriptor = "(Lclient!ck;Lclient!em;II[BII)V")
	public Class105_Sub1(@OriginalArg(0) Class33_Sub1_Sub1 arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static137.aClass89_8, arg2 * arg3, false);
		this.anInt4879 = arg3;
		this.anInt4878 = arg2;
		super.aClass33_Sub1_Sub1_10.method1987(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt8841, 0, this.method7307(), arg2, arg3, 0, Static341.method5637(super.aClass82_15), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!hia", name = "<init>", descriptor = "(Lclient!ck;Lclient!em;II[FII)V")
	public Class105_Sub1(@OriginalArg(0) Class33_Sub1_Sub1 arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static137.aClass89_12, arg2 * arg3, false);
		this.anInt4878 = arg2;
		this.anInt4879 = arg3;
		super.aClass33_Sub1_Sub1_10.method1987(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt8841, 0, this.method7307(), arg2, arg3, 0, Static341.method5637(super.aClass82_15), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!hia", name = "<init>", descriptor = "(Lclient!ck;II[III)V")
	public Class105_Sub1(@OriginalArg(0) Class33_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static333.aClass82_9, Static137.aClass89_8, arg2 * arg1, false);
		this.anInt4879 = arg2;
		this.anInt4878 = arg1;
		super.aClass33_Sub1_Sub1_10.method1987(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt8841, 0, 6408, this.anInt4878, this.anInt4879, 0, 32993, super.aClass33_Sub1_Sub1_10.anInt1756, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(IBIIII[I)V")
	@Override
	public void method6502(@OriginalArg(0) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int[] arg2) {
		@Pc(12) int[] local12 = new int[this.anInt4879 * this.anInt4878];
		super.aClass33_Sub1_Sub1_10.method1987(this);
		OpenGL.glGetTexImagei(super.anInt8841, 0, 32993, 5121, local12, 0);
		for (@Pc(27) int local27 = 0; local27 < arg0; local27++) {
			Static655.method6408(local12, this.anInt4878 * (arg0 - local27 - 1), arg2, arg1 * local27, arg1);
		}
	}

	@OriginalMember(owner = "client!hia", name = "b", descriptor = "(I)I")
	@Override
	public int method6507() {
		return this.anInt4879;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(FZ)F")
	@Override
	public float method6504(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6505() {
		return false;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(FI)F")
	@Override
	public float method6503(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(I)I")
	@Override
	public int method6501() {
		return this.anInt4878;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "([BIBIIILclient!em;II)V")
	@Override
	public void method6499(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class82 arg3, @OriginalArg(8) int arg4) {
		if (arg4 == 0) {
			arg4 = arg1;
		}
		super.aClass33_Sub1_Sub1_10.method1987(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 != arg1) {
			OpenGL.glPixelStorei(3314, arg4);
		}
		OpenGL.glTexSubImage2Dub(super.anInt8841, 0, 0, 0, arg1, arg2, Static341.method5637(arg3), 5121, arg0, 0);
		if (arg4 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(III[IIIII)V")
	@Override
	public void method6500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass33_Sub1_Sub1_10.method1987(this);
		if (arg5 == 0) {
			arg5 = arg0;
		}
		if (arg0 != arg5) {
			OpenGL.glPixelStorei(3314, arg5);
		}
		OpenGL.glTexSubImage2Di(super.anInt8841, 0, arg4, arg2, arg0, arg1, 32993, super.aClass33_Sub1_Sub1_10.anInt1756, arg3, 0);
		if (arg0 != arg5) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(ZIZ)V")
	@Override
	public void method6506(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
	}
}
