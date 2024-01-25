import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fca")
public final class Class111_Sub1 extends Class111 implements Interface8 {

	@OriginalMember(owner = "client!fca", name = "F", descriptor = "[C")
	private static final char[] aCharArray2 = new char[64];

	@OriginalMember(owner = "client!fca", name = "C", descriptor = "I")
	private final int anInt2967;

	@OriginalMember(owner = "client!fca", name = "I", descriptor = "I")
	private final int anInt2972;

	static {
		for (@Pc(10) int local10 = 0; local10 < 26; local10++) {
			aCharArray2[local10] = (char) (local10 + 65);
		}
		for (@Pc(26) int local26 = 26; local26 < 52; local26++) {
			aCharArray2[local26] = (char) (local26 + 97 - 26);
		}
		for (@Pc(42) int local42 = 52; local42 < 62; local42++) {
			aCharArray2[local42] = (char) (local42 + 48 - 52);
		}
		aCharArray2[63] = '-';
		aCharArray2[62] = '*';
	}

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lclient!sha;Lclient!g;Lclient!wj;II)V")
	public Class111_Sub1(@OriginalArg(0) Class95_Sub1_Sub1 arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) Class389 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg4 * arg3, false);
		this.anInt2967 = arg3;
		this.anInt2972 = arg4;
		super.aClass95_Sub1_Sub1_12.method8147(this);
		OpenGL.glTexImage2Dub(super.anInt9160, 0, this.method7471(), arg3, arg4, 0, Static450.method6089(super.aClass122_18), Static507.method6793(super.aClass389_11), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lclient!sha;Lclient!g;IIZ[FII)V")
	public Class111_Sub1(@OriginalArg(0) Class95_Sub1_Sub1 arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static666.aClass389_20, arg3 * arg2, arg4);
		this.anInt2972 = arg3;
		this.anInt2967 = arg2;
		super.aClass95_Sub1_Sub1_12.method8147(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt9160, 0, this.method7471(), arg2, arg3, 0, Static450.method6089(super.aClass122_18), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method7469(arg2, arg3, super.anInt9160, arg5);
		}
	}

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lclient!sha;Lclient!g;IIZ[BII)V")
	public Class111_Sub1(@OriginalArg(0) Class95_Sub1_Sub1 arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static666.aClass389_16, arg3 * arg2, arg4);
		this.anInt2972 = arg3;
		this.anInt2967 = arg2;
		super.aClass95_Sub1_Sub1_12.method8147(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method7467(arg3, arg5, arg2, super.anInt9160);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt9160, 0, this.method7471(), arg2, arg3, 0, Static450.method6089(super.aClass122_18), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lclient!sha;IIZ[III)V")
	public Class111_Sub1(@OriginalArg(0) Class95_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static21.aClass122_14, Static666.aClass389_16, arg1 * arg2, arg3);
		this.anInt2967 = arg1;
		this.anInt2972 = arg2;
		super.aClass95_Sub1_Sub1_12.method8147(this);
		if (arg3 && arg6 == 0) {
			this.method7464(arg1, arg4, arg2, super.anInt9160);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt9160, 0, 6408, this.anInt2967, this.anInt2972, 0, 32993, super.aClass95_Sub1_Sub1_12.anInt8944, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIIIB[FILclient!g;I)V")
	public void method2577(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) float[] arg2, @OriginalArg(7) Class122 arg3) {
		super.aClass95_Sub1_Sub1_12.method8147(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt9160, 0, 0, 0, arg0, arg1, Static450.method6089(arg3), 5121, arg2, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIIII[BLclient!g;IB)V")
	@Override
	public void method7069(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) byte[] arg2, @OriginalArg(6) Class122 arg3, @OriginalArg(7) int arg4) {
		super.aClass95_Sub1_Sub1_12.method8147(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg0);
		OpenGL.glTexSubImage2Dub(super.anInt9160, 0, 0, 0, arg4, arg1, Static450.method6089(arg3), 5121, arg2, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(FZ)F")
	@Override
	public float method7067(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt2967;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IF)F")
	@Override
	public float method7065(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt2972;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(I[IIIIII)V")
	@Override
	public void method7070(@OriginalArg(1) int[] arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt2972 * this.anInt2967];
		super.aClass95_Sub1_Sub1_12.method8147(this);
		OpenGL.glGetTexImagei(super.anInt9160, 0, 32993, 5121, local12, 0);
		for (@Pc(29) int local29 = 0; local29 < arg1; local29++) {
			Static681.method4031(local12, (arg1 - local29 - 1) * this.anInt2967, arg0, local29 * arg2, arg2);
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7072() {
		return true;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Z)I")
	@Override
	public int method7071() {
		return this.anInt2967;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIIII[III)V")
	@Override
	public void method7066(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(7) int arg5) {
		super.aClass95_Sub1_Sub1_12.method8147(this);
		OpenGL.glPixelStorei(3314, arg3);
		OpenGL.glTexSubImage2Di(super.anInt9160, 0, arg2, arg0, arg1, arg5, 32993, super.aClass95_Sub1_Sub1_12.anInt8944, arg4, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(ZZZ)V")
	@Override
	public void method7068(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		super.aClass95_Sub1_Sub1_12.method8147(this);
		OpenGL.glTexParameteri(super.anInt9160, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt9160, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "(I)I")
	@Override
	public int method7073() {
		return this.anInt2972;
	}
}
