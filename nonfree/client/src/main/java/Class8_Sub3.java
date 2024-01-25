import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class8_Sub3 extends Class8 {

	@OriginalMember(owner = "client!hg", name = "C", descriptor = "I")
	private int anInt3232 = -1;

	@OriginalMember(owner = "client!hg", name = "y", descriptor = "I")
	private int anInt3229 = -1;

	@OriginalMember(owner = "client!hg", name = "u", descriptor = "I")
	public final int anInt3226;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!ih;II)V")
	public Class8_Sub3(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt3226 = arg2;
		super.aClass106_Sub2_25.method2912(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt3950, arg2, arg2, 0, Static76.method1408(super.anInt3950), 5121, null, 0);
		}
		this.method3073(true);
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!ih;IIZ[[BI)V")
	public Class8_Sub3(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt3226 = arg2;
		super.aClass106_Sub2_25.method2912(this);
		for (@Pc(26) int local26 = 0; local26 < 6; local26++) {
			OpenGL.glTexImage2Dub(local26 + 34069, 0, super.anInt3950, arg2, arg2, 0, arg5, 5121, arg4[local26], 0);
		}
		this.method3073(true);
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!ih;IIZ[[I)V")
	public Class8_Sub3(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt3226 = arg2;
		super.aClass106_Sub2_25.method2912(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static308.method4426(super.anInt3950, arg4[local30], super.aClass106_Sub2_25.anInt3759, local30 + 34069, arg2, arg2);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt3950, arg2, arg2, 0, 32993, super.aClass106_Sub2_25.anInt3759, arg4[local30], 0);
			}
		}
		this.method3073(true);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIII)V")
	public void method2397(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg2, arg0, arg1, super.anInt3959, 0);
		this.anInt3232 = arg0;
		this.anInt3229 = arg2;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
	@Override
	public void method3067() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt3229, this.anInt3232, 3553, 0, 0);
		this.anInt3229 = -1;
		this.anInt3232 = -1;
	}
}
