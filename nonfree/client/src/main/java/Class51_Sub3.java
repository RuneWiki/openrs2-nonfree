import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gda")
public final class Class51_Sub3 extends Class51 {

	@OriginalMember(owner = "client!gda", name = "B", descriptor = "I")
	private int anInt3334 = -1;

	@OriginalMember(owner = "client!gda", name = "D", descriptor = "I")
	private int anInt3336 = -1;

	@OriginalMember(owner = "client!gda", name = "E", descriptor = "I")
	public final int anInt3337;

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!jaa;IIZ[[I)V")
	public Class51_Sub3(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt3337 = arg2;
		super.aClass14_Sub3_43.method3985(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static577.method7711(arg2, arg4[local30], super.aClass14_Sub3_43.anInt4599, local30 + 34069, super.anInt9471, arg2);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt9471, arg2, arg2, 0, 32993, super.aClass14_Sub3_43.anInt4599, arg4[local30], 0);
			}
		}
		this.method7734(true);
	}

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!jaa;IIZ[[BI)V")
	public Class51_Sub3(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt3337 = arg2;
		super.aClass14_Sub3_43.method3985(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt9471, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method7734(true);
	}

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!jaa;II)V")
	public Class51_Sub3(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt3337 = arg2;
		super.aClass14_Sub3_43.method3985(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt9471, arg2, arg2, 0, Static163.method2976(super.anInt9471), 5121, null, 0);
		}
		this.method7734(true);
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(B)V")
	@Override
	public void method7726() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt3334, this.anInt3336, 3553, 0, 0);
		this.anInt3336 = -1;
		this.anInt3334 = -1;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIIIB)V")
	public void method2930(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, arg2, super.anInt9474, 0);
		this.anInt3334 = arg0;
		this.anInt3336 = arg1;
	}
}
