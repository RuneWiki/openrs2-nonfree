import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class114_Sub3 extends Class114 {

	@OriginalMember(owner = "client!jk", name = "z", descriptor = "I")
	private int anInt4936 = -1;

	@OriginalMember(owner = "client!jk", name = "D", descriptor = "I")
	private int anInt4938 = -1;

	@OriginalMember(owner = "client!jk", name = "v", descriptor = "I")
	public final int anInt4933;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lclient!no;IIZ[[I)V")
	public Class114_Sub3(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt4933 = arg2;
		super.aClass66_Sub3_28.method5382(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static281.method4444(arg4[local30], local30 + 34069, arg2, super.anInt5900, arg2, super.aClass66_Sub3_28.anInt6459);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt5900, arg2, arg2, 0, 32993, super.aClass66_Sub3_28.anInt6459, arg4[local30], 0);
			}
		}
		this.method4999(true);
	}

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lclient!no;II)V")
	public Class114_Sub3(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt4933 = arg2;
		super.aClass66_Sub3_28.method5382(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt5900, arg2, arg2, 0, Static516.method2307(super.anInt5900), 5121, null, 0);
		}
		this.method4999(true);
	}

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lclient!no;IIZ[[BI)V")
	public Class114_Sub3(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt4933 = arg2;
		super.aClass66_Sub3_28.method5382(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt5900, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method4999(true);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIB)V")
	public void method4206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, arg2, super.anInt5897, 0);
		this.anInt4938 = arg1;
		this.anInt4936 = arg0;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
	@Override
	public void method4996() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt4936, this.anInt4938, 3553, 0, 0);
		this.anInt4936 = -1;
		this.anInt4938 = -1;
	}
}
