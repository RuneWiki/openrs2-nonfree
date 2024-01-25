import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iaa")
public final class Class32_Sub2 extends Class32 implements Interface2 {

	@OriginalMember(owner = "client!iaa", name = "N", descriptor = "I")
	private final int anInt4003;

	@OriginalMember(owner = "client!iaa", name = "M", descriptor = "I")
	private final int anInt4004;

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lclient!tia;Lclient!ua;Lclient!dn;II)V")
	public Class32_Sub2(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class358 arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg4 * arg3, false);
		this.anInt4003 = arg3;
		this.anInt4004 = arg4;
		super.aClass100_Sub1_Sub2_11.method7923(this);
		OpenGL.glTexImage2Dub(super.anInt10540, 0, this.method8898(), arg3, arg4, 0, Static298.method4688(super.aClass358_17), Static244.method3872(super.aClass86_20), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lclient!tia;IIZ[III)V")
	public Class32_Sub2(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static171.aClass358_12, Static104.aClass86_8, arg1 * arg2, arg3);
		this.anInt4004 = arg2;
		this.anInt4003 = arg1;
		super.aClass100_Sub1_Sub2_11.method7923(this);
		if (arg3 && arg6 == 0 && arg5 == 0) {
			this.method8906(arg1, arg4, arg2, super.anInt10540);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt10540, 0, 6408, this.anInt4003, this.anInt4004, 0, 32993, super.aClass100_Sub1_Sub2_11.anInt9359, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lclient!tia;Lclient!ua;IIZ[BII)V")
	public Class32_Sub2(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class358 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static104.aClass86_8, arg3 * arg2, arg4);
		this.anInt4003 = arg2;
		this.anInt4004 = arg3;
		super.aClass100_Sub1_Sub2_11.method7923(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 && arg7 == 0 && arg6 == 0) {
			this.method8903(arg5, super.anInt10540, arg3, arg2);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt10540, 0, this.method8898(), arg2, arg3, 0, Static298.method4688(super.aClass358_17), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lclient!tia;Lclient!ua;IIZ[FII)V")
	public Class32_Sub2(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class358 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static104.aClass86_12, arg3 * arg2, arg4);
		this.anInt4004 = arg3;
		this.anInt4003 = arg2;
		super.aClass100_Sub1_Sub2_11.method7923(this);
		if (!arg4 && arg7 == 0 && arg6 == 0) {
			this.method8904(arg5, arg3, super.anInt10540, arg2);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt10540, 0, this.method8898(), arg2, arg3, 0, Static298.method4688(super.aClass358_17), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(B)I")
	@Override
	public int method3688() {
		return this.anInt4004;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIIIII[FLclient!ua;)V")
	public void method3689(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(7) float[] arg2, @OriginalArg(8) Class358 arg3) {
		super.aClass100_Sub1_Sub2_11.method7923(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt10540, 0, 0, 0, arg1, arg0, Static298.method4688(arg3), 5121, arg2, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZIZ)V")
	@Override
	public void method3687(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		super.aClass100_Sub1_Sub2_11.method7923(this);
		OpenGL.glTexParameteri(super.anInt10540, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt10540, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(FI)F")
	@Override
	public float method3685(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt4004;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method3682() {
		return true;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(FZ)F")
	@Override
	public float method3681(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt4003;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(III[IIBII)V")
	@Override
	public void method3684(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass100_Sub1_Sub2_11.method7923(this);
		OpenGL.glPixelStorei(3314, arg3);
		OpenGL.glTexSubImage2Di(super.anInt10540, 0, arg5, arg0, arg4, arg1, 32993, super.aClass100_Sub1_Sub2_11.anInt9359, arg2, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIILclient!ua;II[BII)V")
	@Override
	public void method3683(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class358 arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(7) int arg4) {
		super.aClass100_Sub1_Sub2_11.method7923(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg1);
		OpenGL.glTexSubImage2Dub(super.anInt10540, 0, 0, 0, arg4, arg0, Static298.method4688(arg2), 5121, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(B)I")
	@Override
	public int method3680() {
		return this.anInt4003;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I[IIIIII)V")
	@Override
	public void method3686(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt4003 * this.anInt4004];
		super.aClass100_Sub1_Sub2_11.method7923(this);
		OpenGL.glGetTexImagei(super.anInt10540, 0, 32993, 5121, local12, 0);
		for (@Pc(27) int local27 = 0; local27 < arg1; local27++) {
			Static693.method8323(local12, (arg1 - local27 - 1) * this.anInt4003, arg0, local27 * arg2, arg2);
		}
	}
}
