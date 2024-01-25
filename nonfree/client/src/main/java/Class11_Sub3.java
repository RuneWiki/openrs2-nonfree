import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gfa")
public final class Class11_Sub3 extends Class11 {

	@OriginalMember(owner = "client!gfa", name = "w", descriptor = "I")
	private int anInt3453 = -1;

	@OriginalMember(owner = "client!gfa", name = "y", descriptor = "I")
	private int anInt3454 = -1;

	@OriginalMember(owner = "client!gfa", name = "z", descriptor = "I")
	public final int anInt3455;

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lclient!ji;II)V")
	public Class11_Sub3(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt3455 = arg2;
		super.aClass15_Sub3_35.method4377(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt9048, arg2, arg2, 0, Static596.method8421(super.anInt9048), 5121, null, 0);
		}
		this.method7412(true);
	}

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lclient!ji;IIZ[[I)V")
	public Class11_Sub3(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt3455 = arg2;
		super.aClass15_Sub3_35.method4377(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static19.method754(super.aClass15_Sub3_35.anInt5362, arg2, local30 + 34069, arg2, arg4[local30], super.anInt9048);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt9048, arg2, arg2, 0, 32993, super.aClass15_Sub3_35.anInt5362, arg4[local30], 0);
			}
		}
		this.method7412(true);
	}

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lclient!ji;IIZ[[BI)V")
	public Class11_Sub3(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt3455 = arg2;
		super.aClass15_Sub3_35.method4377(this);
		for (@Pc(26) int local26 = 0; local26 < 6; local26++) {
			OpenGL.glTexImage2Dub(local26 + 34069, 0, super.anInt9048, arg2, arg2, 0, arg5, 5121, arg4[local26], 0);
		}
		this.method7412(true);
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B)V")
	@Override
	public void method8310() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt3454, this.anInt3453, 3553, 0, 0);
		this.anInt3454 = -1;
		this.anInt3453 = -1;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IBIII)V")
	public void method3044(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg2, arg1, super.anInt9049, 0);
		this.anInt3454 = arg0;
		this.anInt3453 = arg2;
	}
}
