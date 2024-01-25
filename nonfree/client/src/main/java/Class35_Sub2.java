import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class35_Sub2 extends Class35 {

	@OriginalMember(owner = "client!cn", name = "w", descriptor = "I")
	private int anInt1137 = -1;

	@OriginalMember(owner = "client!cn", name = "B", descriptor = "I")
	private int anInt1140 = -1;

	@OriginalMember(owner = "client!cn", name = "u", descriptor = "I")
	public final int anInt1135;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!pea;IIZ[[BI)V")
	public Class35_Sub2(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt1135 = arg2;
		super.aClass121_Sub3_31.method5713(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt6269, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method5329(true);
	}

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!pea;II)V")
	public Class35_Sub2(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt1135 = arg2;
		super.aClass121_Sub3_31.method5713(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt6269, arg2, arg2, 0, Static436.method6280(super.anInt6269), 5121, null, 0);
		}
		this.method5329(true);
	}

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!pea;IIZ[[I)V")
	public Class35_Sub2(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt1135 = arg2;
		super.aClass121_Sub3_31.method5713(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static426.method6224(arg2, super.anInt6269, local30 + 34069, super.aClass121_Sub3_31.anInt6819, arg2, arg4[local30]);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt6269, arg2, arg2, 0, 32993, super.aClass121_Sub3_31.anInt6819, arg4[local30], 0);
			}
		}
		this.method5329(true);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
	@Override
	public void method5323() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt1140, this.anInt1137, 3553, 0, 0);
		this.anInt1140 = -1;
		this.anInt1137 = -1;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZIIII)V")
	public void method883(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg2, arg0, super.anInt6277, 0);
		this.anInt1137 = arg2;
		this.anInt1140 = arg1;
	}
}
