import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class111_Sub3 extends Class111 implements Interface8 {

	@OriginalMember(owner = "client!sh", name = "C", descriptor = "I")
	private final int anInt8615;

	@OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
	private final int anInt8609;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!sha;Lclient!g;II[BII)V")
	public Class111_Sub3(@OriginalArg(0) Class95_Sub1_Sub1 arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static666.aClass389_16, arg2 * arg3, false);
		this.anInt8615 = arg2;
		this.anInt8609 = arg3;
		super.aClass95_Sub1_Sub1_12.method8147(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt9160, 0, this.method7471(), arg2, arg3, 0, Static450.method6089(super.aClass122_18), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!sha;Lclient!g;II[FII)V")
	public Class111_Sub3(@OriginalArg(0) Class95_Sub1_Sub1 arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static666.aClass389_20, arg2 * arg3, false);
		this.anInt8609 = arg3;
		this.anInt8615 = arg2;
		super.aClass95_Sub1_Sub1_12.method8147(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt9160, 0, this.method7471(), arg2, arg3, 0, Static450.method6089(super.aClass122_18), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!sha;Lclient!g;Lclient!wj;II)V")
	public Class111_Sub3(@OriginalArg(0) Class95_Sub1_Sub1 arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) Class389 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg4 * arg3, false);
		this.anInt8609 = arg4;
		this.anInt8615 = arg3;
		super.aClass95_Sub1_Sub1_12.method8147(this);
		OpenGL.glTexImage2Dub(super.anInt9160, 0, this.method7471(), arg3, arg4, 0, Static450.method6089(super.aClass122_18), Static507.method6793(super.aClass389_11), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!sha;II[III)V")
	public Class111_Sub3(@OriginalArg(0) Class95_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static21.aClass122_14, Static666.aClass389_16, arg2 * arg1, false);
		this.anInt8615 = arg1;
		this.anInt8609 = arg2;
		super.aClass95_Sub1_Sub1_12.method8147(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt9160, 0, 6408, this.anInt8615, this.anInt8609, 0, 32993, super.aClass95_Sub1_Sub1_12.anInt8944, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(FZ)F")
	@Override
	public float method7067(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIII[BLclient!g;IB)V")
	@Override
	public void method7069(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) byte[] arg2, @OriginalArg(6) Class122 arg3, @OriginalArg(7) int arg4) {
		super.aClass95_Sub1_Sub1_12.method8147(this);
		if (arg0 == 0) {
			arg0 = arg4;
		}
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt9160, 0, 0, 0, arg4, arg1, Static450.method6089(arg3), 5121, arg2, 0);
		if (arg0 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIII[III)V")
	@Override
	public void method7066(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(7) int arg5) {
		super.aClass95_Sub1_Sub1_12.method8147(this);
		if (arg3 == 0) {
			arg3 = arg1;
		}
		if (arg1 != arg3) {
			OpenGL.glPixelStorei(3314, arg3);
		}
		OpenGL.glTexSubImage2Di(super.anInt9160, 0, arg2, arg0, arg1, arg5, 32993, super.aClass95_Sub1_Sub1_12.anInt8944, arg4, 0);
		if (arg3 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IF)F")
	@Override
	public float method7065(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZZZ)V")
	@Override
	public void method7068(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)I")
	@Override
	public int method7071() {
		return this.anInt8615;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)I")
	@Override
	public int method7073() {
		return this.anInt8609;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7072() {
		return false;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I[IIIIII)V")
	@Override
	public void method7070(@OriginalArg(1) int[] arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt8615 * this.anInt8609];
		super.aClass95_Sub1_Sub1_12.method8147(this);
		OpenGL.glGetTexImagei(super.anInt9160, 0, 32993, 5121, local12, 0);
		for (@Pc(29) int local29 = 0; local29 < arg1; local29++) {
			Static681.method4031(local12, this.anInt8615 * (arg1 - local29 - 1), arg0, arg2 * local29, arg2);
		}
	}
}
