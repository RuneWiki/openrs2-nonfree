import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class121_Sub1 extends Class121 {

	@OriginalMember(owner = "client!gv", name = "D", descriptor = "I")
	private int anInt4552 = -1;

	@OriginalMember(owner = "client!gv", name = "C", descriptor = "I")
	private int anInt4551 = -1;

	@OriginalMember(owner = "client!gv", name = "z", descriptor = "I")
	public final int anInt4549;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!eq;IIZ[[I)V")
	public Class121_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt4549 = arg2;
		super.aClass33_Sub3_36.method3012(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static571.method7997(super.anInt8883, arg4[local30], super.aClass33_Sub3_36.anInt3439, local30 + 34069, arg2, arg2);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt8883, arg2, arg2, 0, 32993, super.aClass33_Sub3_36.anInt3439, arg4[local30], 0);
			}
		}
		this.method7326(true);
	}

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!eq;IIZ[[BI)V")
	public Class121_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt4549 = arg2;
		super.aClass33_Sub3_36.method3012(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt8883, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method7326(true);
	}

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!eq;II)V")
	public Class121_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt4549 = arg2;
		super.aClass33_Sub3_36.method3012(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt8883, arg2, arg2, 0, Static78.method1882(super.anInt8883), 5121, null, 0);
		}
		this.method7326(true);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Z)V")
	@Override
	public void method7320() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt4552, this.anInt4551, 3553, 0, 0);
		this.anInt4552 = -1;
		this.anInt4551 = -1;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(BIIII)V")
	public void method3871(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg2, arg1, arg0, super.anInt8879, 0);
		this.anInt4551 = arg1;
		this.anInt4552 = arg2;
	}
}
