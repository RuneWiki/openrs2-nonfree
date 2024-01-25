import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dka")
public final class Class29_Sub2 extends Class29 {

	@OriginalMember(owner = "client!dka", name = "v", descriptor = "I")
	private int anInt1662 = -1;

	@OriginalMember(owner = "client!dka", name = "u", descriptor = "I")
	private int anInt1664 = -1;

	@OriginalMember(owner = "client!dka", name = "B", descriptor = "I")
	public final int anInt1663;

	@OriginalMember(owner = "client!dka", name = "<init>", descriptor = "(Lclient!vf;II)V")
	public Class29_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt1663 = arg2;
		super.aClass100_Sub3_41.method8743(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt9574, arg2, arg2, 0, Static271.method4452(super.anInt9574), 5121, (byte[]) null, 0);
		}
		this.method8164(true);
	}

	@OriginalMember(owner = "client!dka", name = "<init>", descriptor = "(Lclient!vf;IIZ[[I)V")
	public Class29_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt1663 = arg2;
		super.aClass100_Sub3_41.method8743(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static591.method8146(arg2, arg4[local30], local30 + 34069, super.aClass100_Sub3_41.anInt10284, super.anInt9574, arg2);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt9574, arg2, arg2, 0, 32993, super.aClass100_Sub3_41.anInt10284, arg4[local30], 0);
			}
		}
		this.method8164(true);
	}

	@OriginalMember(owner = "client!dka", name = "<init>", descriptor = "(Lclient!vf;IIZ[[BI)V")
	public Class29_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt1663 = arg2;
		super.aClass100_Sub3_41.method8743(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt9574, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method8164(true);
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(I)V")
	@Override
	public void method8162() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt1662, this.anInt1664, 3553, 0, 0);
		this.anInt1662 = -1;
		this.anInt1664 = -1;
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(IBIII)V")
	public void method1549(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, arg2, super.anInt9573, 0);
		this.anInt1664 = arg0;
		this.anInt1662 = arg1;
	}
}
