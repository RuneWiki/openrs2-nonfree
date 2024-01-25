import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class20_Sub3 extends Class20 {

	@OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
	private int anInt2387 = -1;

	@OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
	private int anInt2390 = -1;

	@OriginalMember(owner = "client!gi", name = "B", descriptor = "I")
	public final int anInt2389;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!pg;IIZ[[I)V")
	public Class20_Sub3(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt2389 = arg2;
		super.aClass163_Sub2_27.method4118(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static457.method5720(super.anInt3921, arg2, arg2, local30 + 34069, arg4[local30], super.aClass163_Sub2_27.anInt5249);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt3921, arg2, arg2, 0, 32993, super.aClass163_Sub2_27.anInt5249, arg4[local30], 0);
			}
		}
		this.method3113(true);
	}

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!pg;IIZ[[BI)V")
	public Class20_Sub3(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt2389 = arg2;
		super.aClass163_Sub2_27.method4118(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt3921, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method3113(true);
	}

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!pg;II)V")
	public Class20_Sub3(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt2389 = arg2;
		super.aClass163_Sub2_27.method4118(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt3921, arg2, arg2, 0, Static452.method5679(super.anInt3921), 5121, null, 0);
		}
		this.method3113(true);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIB)V")
	public void method1982(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg2, arg0, super.anInt3922, 0);
		this.anInt2390 = arg1;
		this.anInt2387 = arg2;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V")
	@Override
	public void method4531() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt2390, this.anInt2387, 3553, 0, 0);
		this.anInt2387 = -1;
		this.anInt2390 = -1;
	}
}
