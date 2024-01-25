import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class132_Sub4 extends Class132 {

	@OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
	private int anInt6662 = -1;

	@OriginalMember(owner = "client!ng", name = "A", descriptor = "I")
	private int anInt6665 = -1;

	@OriginalMember(owner = "client!ng", name = "y", descriptor = "I")
	public final int anInt6663;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!ap;II)V")
	public Class132_Sub4(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt6663 = arg2;
		super.aClass9_Sub2_24.method814(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt6656, arg2, arg2, 0, Static12.method634(super.anInt6656), 5121, null, 0);
		}
		this.method5614(true);
	}

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!ap;IIZ[[BI)V")
	public Class132_Sub4(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt6663 = arg2;
		super.aClass9_Sub2_24.method814(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt6656, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method5614(true);
	}

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!ap;IIZ[[I)V")
	public Class132_Sub4(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt6663 = arg2;
		super.aClass9_Sub2_24.method814(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static402.method8054(super.anInt6656, arg4[local30], arg2, arg2, super.aClass9_Sub2_24.anInt839, local30 + 34069);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt6656, arg2, arg2, 0, 32993, super.aClass9_Sub2_24.anInt839, arg4[local30], 0);
			}
		}
		this.method5614(true);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
	@Override
	public void method6643() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt6662, this.anInt6665, 3553, 0, 0);
		this.anInt6662 = -1;
		this.anInt6665 = -1;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIII)V")
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg2, arg0, super.anInt6652, 0);
		this.anInt6665 = arg2;
		this.anInt6662 = arg1;
	}
}
