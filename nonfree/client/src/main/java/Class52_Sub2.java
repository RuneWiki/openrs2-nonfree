import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class52_Sub2 extends Class52 {

	@OriginalMember(owner = "client!d", name = "v", descriptor = "I")
	private int anInt1902 = -1;

	@OriginalMember(owner = "client!d", name = "A", descriptor = "I")
	private int anInt1907 = -1;

	@OriginalMember(owner = "client!d", name = "x", descriptor = "I")
	public final int anInt1904;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lclient!ag;IIZ[[I)V")
	public Class52_Sub2(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt1904 = arg2;
		super.aClass12_Sub1_31.method378(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static469.method6615(arg4[local30], local30 + 34069, arg2, super.aClass12_Sub1_31.anInt482, super.anInt6855, arg2);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt6855, arg2, arg2, 0, 32993, super.aClass12_Sub1_31.anInt482, arg4[local30], 0);
			}
		}
		this.method5644(true);
	}

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lclient!ag;II)V")
	public Class52_Sub2(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt1904 = arg2;
		super.aClass12_Sub1_31.method378(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt6855, arg2, arg2, 0, Static494.method6908(super.anInt6855), 5121, null, 0);
		}
		this.method5644(true);
	}

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lclient!ag;IIZ[[BI)V")
	public Class52_Sub2(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt1904 = arg2;
		super.aClass12_Sub1_31.method378(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt6855, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method5644(true);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
	@Override
	public void method5633() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt1907, this.anInt1902, 3553, 0, 0);
		this.anInt1902 = -1;
		this.anInt1907 = -1;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IBIII)V")
	public void method1662(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg2, arg1, super.anInt6857, 0);
		this.anInt1907 = arg0;
		this.anInt1902 = arg2;
	}
}
