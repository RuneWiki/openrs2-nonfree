import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class105_Sub3 extends Class105 implements Interface2 {

	@OriginalMember(owner = "client!ou", name = "P", descriptor = "I")
	private final int anInt7772;

	@OriginalMember(owner = "client!ou", name = "G", descriptor = "I")
	private final int anInt7764;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lclient!ck;Lclient!em;IIZ[BII)V")
	public Class105_Sub3(@OriginalArg(0) Class33_Sub1_Sub1 arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static137.aClass89_8, arg3 * arg2, arg4);
		this.anInt7772 = arg3;
		this.anInt7764 = arg2;
		super.aClass33_Sub1_Sub1_10.method1987(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method7302(arg5, super.anInt8841, arg3, arg2);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt8841, 0, this.method7307(), arg2, arg3, 0, Static341.method5637(super.aClass82_15), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lclient!ck;IIZ[III)V")
	public Class105_Sub3(@OriginalArg(0) Class33_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static333.aClass82_9, Static137.aClass89_8, arg1 * arg2, arg3);
		this.anInt7764 = arg1;
		this.anInt7772 = arg2;
		super.aClass33_Sub1_Sub1_10.method1987(this);
		if (arg3 && arg6 == 0) {
			this.method7295(arg4, arg2, arg1, super.anInt8841);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt8841, 0, 6408, this.anInt7764, this.anInt7772, 0, 32993, super.aClass33_Sub1_Sub1_10.anInt1756, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lclient!ck;Lclient!em;IIZ[FII)V")
	public Class105_Sub3(@OriginalArg(0) Class33_Sub1_Sub1 arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static137.aClass89_12, arg3 * arg2, arg4);
		this.anInt7772 = arg3;
		this.anInt7764 = arg2;
		super.aClass33_Sub1_Sub1_10.method1987(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt8841, 0, this.method7307(), arg2, arg3, 0, Static341.method5637(super.aClass82_15), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method7304(arg2, arg5, arg3, super.anInt8841);
		}
	}

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lclient!ck;Lclient!em;Lclient!ew;II)V")
	public Class105_Sub3(@OriginalArg(0) Class33_Sub1_Sub1 arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) Class89 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg4 * arg3, false);
		this.anInt7764 = arg3;
		this.anInt7772 = arg4;
		super.aClass33_Sub1_Sub1_10.method1987(this);
		OpenGL.glTexImage2Dub(super.anInt8841, 0, this.method7307(), arg3, arg4, 0, Static341.method5637(super.aClass82_15), Static50.method1154(super.aClass89_19), null, 0);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(FZ)F")
	@Override
	public float method6504(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt7772;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ZIZ)V")
	@Override
	public void method6506(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		super.aClass33_Sub1_Sub1_10.method1987(this);
		OpenGL.glTexParameteri(super.anInt8841, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt8841, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(FI)F")
	@Override
	public float method6503(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt7764;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6505() {
		return true;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIIIBLclient!em;II[F)V")
	public void method6512(@OriginalArg(1) int arg0, @OriginalArg(5) Class82 arg1, @OriginalArg(7) int arg2, @OriginalArg(8) float[] arg3) {
		super.aClass33_Sub1_Sub1_10.method1987(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt8841, 0, 0, 0, arg0, arg2, Static341.method5637(arg1), 5121, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(III[IIIII)V")
	@Override
	public void method6500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass33_Sub1_Sub1_10.method1987(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexSubImage2Di(super.anInt8841, 0, arg4, arg2, arg0, arg1, 32993, super.aClass33_Sub1_Sub1_10.anInt1756, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IBIIII[I)V")
	@Override
	public void method6502(@OriginalArg(0) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int[] arg2) {
		@Pc(12) int[] local12 = new int[this.anInt7772 * this.anInt7764];
		super.aClass33_Sub1_Sub1_10.method1987(this);
		OpenGL.glGetTexImagei(super.anInt8841, 0, 32993, 5121, local12, 0);
		for (@Pc(35) int local35 = 0; local35 < arg0; local35++) {
			Static655.method6408(local12, (arg0 - local35 - 1) * this.anInt7764, arg2, arg1 * local35, arg1);
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)I")
	@Override
	public int method6501() {
		return this.anInt7764;
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)I")
	@Override
	public int method6507() {
		return this.anInt7772;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "([BIBIIILclient!em;II)V")
	@Override
	public void method6499(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class82 arg3, @OriginalArg(8) int arg4) {
		super.aClass33_Sub1_Sub1_10.method1987(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg4);
		OpenGL.glTexSubImage2Dub(super.anInt8841, 0, 0, 0, arg1, arg2, Static341.method5637(arg3), 5121, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
