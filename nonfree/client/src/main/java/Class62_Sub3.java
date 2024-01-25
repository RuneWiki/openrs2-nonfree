import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class62_Sub3 extends Class62 {

	@OriginalMember(owner = "client!hp", name = "x", descriptor = "I")
	private int anInt3192 = -1;

	@OriginalMember(owner = "client!hp", name = "C", descriptor = "I")
	private int anInt3196 = -1;

	@OriginalMember(owner = "client!hp", name = "G", descriptor = "I")
	public final int anInt3200;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!bt;II)V")
	public Class62_Sub3(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt3200 = arg2;
		super.aClass30_Sub1_40.method730(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt6634, arg2, arg2, 0, Static311.method4741(super.anInt6634), 5121, null, 0);
		}
		this.method5349(true);
	}

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!bt;IIZ[[I)V")
	public Class62_Sub3(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt3200 = arg2;
		super.aClass30_Sub1_40.method730(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static94.method1835(arg4[local30], local30 + 34069, super.aClass30_Sub1_40.anInt864, arg2, arg2, super.anInt6634);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt6634, arg2, arg2, 0, 32993, super.aClass30_Sub1_40.anInt864, arg4[local30], 0);
			}
		}
		this.method5349(true);
	}

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!bt;IIZ[[BI)V")
	public Class62_Sub3(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt3200 = arg2;
		super.aClass30_Sub1_40.method730(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt6634, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method5349(true);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIII)V")
	public void method2865(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg2, arg1, super.anInt6638, 0);
		this.anInt3192 = arg0;
		this.anInt3196 = arg2;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)V")
	@Override
	public void method5348() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt3192, this.anInt3196, 3553, 0, 0);
		this.anInt3192 = -1;
		this.anInt3196 = -1;
	}
}
