import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hda")
public final class Class46_Sub4 extends Class46 {

	@OriginalMember(owner = "client!hda", name = "y", descriptor = "I")
	private int anInt3713 = -1;

	@OriginalMember(owner = "client!hda", name = "B", descriptor = "I")
	private int anInt3715 = -1;

	@OriginalMember(owner = "client!hda", name = "x", descriptor = "I")
	public final int anInt3712;

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Lclient!lj;IIZ[[I)V")
	public Class46_Sub4(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt3712 = arg2;
		super.aClass78_Sub3_26.method4535(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static16.method393(arg4[local30], super.anInt6354, arg2, super.aClass78_Sub3_26.anInt5594, arg2, local30 + 34069);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt6354, arg2, arg2, 0, 32993, super.aClass78_Sub3_26.anInt5594, arg4[local30], 0);
			}
		}
		this.method5134(true);
	}

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Lclient!lj;IIZ[[BI)V")
	public Class46_Sub4(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt3712 = arg2;
		super.aClass78_Sub3_26.method4535(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt6354, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method5134(true);
	}

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Lclient!lj;II)V")
	public Class46_Sub4(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt3712 = arg2;
		super.aClass78_Sub3_26.method4535(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt6354, arg2, arg2, 0, Static485.method6695(super.anInt6354), 5121, null, 0);
		}
		this.method5134(true);
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(B)V")
	@Override
	public void method7511() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt3713, this.anInt3715, 3553, 0, 0);
		this.anInt3715 = -1;
		this.anInt3713 = -1;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IIIII)V")
	public void method3025(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg2, arg0, super.anInt6344, 0);
		this.anInt3713 = arg1;
		this.anInt3715 = arg2;
	}
}
