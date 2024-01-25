import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class59_Sub4 extends Class59 {

	@OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
	private int anInt6453 = -1;

	@OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
	private int anInt6457 = -1;

	@OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
	public final int anInt6451;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!vd;IIZ[[I)V")
	public Class59_Sub4(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt6451 = arg2;
		super.aClass51_Sub2_43.method5364(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static342.method4438(arg2, local30 + 34069, super.anInt7474, arg4[local30], arg2, super.aClass51_Sub2_43.anInt6955);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt7474, arg2, arg2, 0, 32993, super.aClass51_Sub2_43.anInt6955, arg4[local30], 0);
			}
		}
		this.method5760(true);
	}

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!vd;IIZ[[BI)V")
	public Class59_Sub4(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt6451 = arg2;
		super.aClass51_Sub2_43.method5364(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt7474, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method5760(true);
	}

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!vd;II)V")
	public Class59_Sub4(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt6451 = arg2;
		super.aClass51_Sub2_43.method5364(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt7474, arg2, arg2, 0, Static110.method1907(super.anInt7474), 5121, null, 0);
		}
		this.method5760(true);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
	@Override
	public void method5755() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt6453, this.anInt6457, 3553, 0, 0);
		this.anInt6453 = -1;
		this.anInt6457 = -1;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIZII)V")
	public void method5125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg2, arg0, arg1, super.anInt7472, 0);
		this.anInt6457 = arg0;
		this.anInt6453 = arg2;
	}
}
