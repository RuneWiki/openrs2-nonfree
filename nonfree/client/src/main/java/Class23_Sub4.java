import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ufa")
public final class Class23_Sub4 extends Class23 implements Interface2 {

	@OriginalMember(owner = "client!ufa", name = "M", descriptor = "I")
	private final int anInt9780;

	@OriginalMember(owner = "client!ufa", name = "E", descriptor = "I")
	private final int anInt9775;

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(Lclient!oaa;Lclient!pb;Lclient!oea;II)V")
	public Class23_Sub4(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) Class265 arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg4 * arg3, false);
		this.anInt9780 = arg4;
		this.anInt9775 = arg3;
		super.aClass132_Sub1_Sub1_12.method7635(this);
		OpenGL.glTexImage2Dub(super.anInt9768, 0, this.method8248(), arg3, arg4, 0, Static233.method3518(super.aClass265_17), Static541.method5282(super.aClass250_19), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(Lclient!oaa;Lclient!pb;II[BII)V")
	public Class23_Sub4(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) Class265 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static417.aClass250_14, arg3 * arg2, false);
		this.anInt9780 = arg3;
		this.anInt9775 = arg2;
		super.aClass132_Sub1_Sub1_12.method7635(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt9768, 0, this.method8248(), arg2, arg3, 0, Static233.method3518(super.aClass265_17), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(Lclient!oaa;II[III)V")
	public Class23_Sub4(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static169.aClass265_9, Static417.aClass250_14, arg1 * arg2, false);
		this.anInt9775 = arg1;
		this.anInt9780 = arg2;
		super.aClass132_Sub1_Sub1_12.method7635(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt9768, 0, 6408, this.anInt9775, this.anInt9780, 0, 32993, super.aClass132_Sub1_Sub1_12.anInt7181, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(Lclient!oaa;Lclient!pb;II[FII)V")
	public Class23_Sub4(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) Class265 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static417.aClass250_18, arg3 * arg2, false);
		this.anInt9780 = arg3;
		this.anInt9775 = arg2;
		super.aClass132_Sub1_Sub1_12.method7635(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt9768, 0, this.method8248(), arg2, arg3, 0, Static233.method3518(super.aClass265_17), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)I")
	@Override
	public int method8896() {
		return this.anInt9780;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ZZZ)V")
	@Override
	public void method8901(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
	}

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "(B)I")
	@Override
	public int method8902() {
		return this.anInt9775;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(II[BLclient!pb;IIIII)V")
	@Override
	public void method8899(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class265 arg2, @OriginalArg(4) int arg3, @OriginalArg(7) int arg4) {
		if (arg0 == 0) {
			arg0 = arg3;
		}
		super.aClass132_Sub1_Sub1_12.method7635(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg3) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt9768, 0, 0, 0, arg3, arg4, Static233.method3518(arg2), 5121, arg1, 0);
		if (arg0 != arg3) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIII[III)V")
	@Override
	public void method8897(@OriginalArg(3) int arg0, @OriginalArg(4) int[] arg1, @OriginalArg(5) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt9775 * this.anInt9780];
		super.aClass132_Sub1_Sub1_12.method7635(this);
		OpenGL.glGetTexImagei(super.anInt9768, 0, 32993, 5121, local12, 0);
		for (@Pc(27) int local27 = 0; local27 < arg0; local27++) {
			Static679.method1569(local12, (arg0 - local27 - 1) * this.anInt9775, arg1, local27 * arg2, arg2);
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(FI)F")
	@Override
	public float method8898(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I[IIIIZII)V")
	@Override
	public void method8903(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass132_Sub1_Sub1_12.method7635(this);
		if (arg1 == 0) {
			arg1 = arg5;
		}
		if (arg5 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt9768, 0, arg2, arg4, arg5, arg3, 32993, super.aClass132_Sub1_Sub1_12.anInt7181, arg0, 0);
		if (arg5 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(FZ)F")
	@Override
	public float method8900(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8904() {
		return false;
	}
}
