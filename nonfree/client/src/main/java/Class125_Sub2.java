import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class125_Sub2 extends Class125 {

	@OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
	private int anInt4084 = -1;

	@OriginalMember(owner = "client!ia", name = "y", descriptor = "I")
	private int anInt4083 = -1;

	@OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
	public final int anInt4082;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!aq;IIZ[[I)V")
	public Class125_Sub2(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt4082 = arg2;
		super.aClass22_Sub1_41.method955(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static321.method4688(arg2, arg2, super.anInt10853, local30 + 34069, arg4[local30], super.aClass22_Sub1_41.anInt1038);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt10853, arg2, arg2, 0, 32993, super.aClass22_Sub1_41.anInt1038, arg4[local30], 0);
			}
		}
		this.method9217(true);
	}

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!aq;II)V")
	public Class125_Sub2(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt4082 = arg2;
		super.aClass22_Sub1_41.method955(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt10853, arg2, arg2, 0, Static156.method2537(super.anInt10853), 5121, (byte[]) null, 0);
		}
		this.method9217(true);
	}

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!aq;IIZ[[BI)V")
	public Class125_Sub2(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt4082 = arg2;
		super.aClass22_Sub1_41.method955(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt10853, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method9217(true);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	@Override
	public void method9208() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt4083, this.anInt4084, 3553, 0, 0);
		this.anInt4084 = -1;
		this.anInt4083 = -1;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIBI)V")
	public void method3721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg2, arg1, arg0, super.anInt10846, 0);
		this.anInt4084 = arg1;
		this.anInt4083 = arg2;
	}
}
