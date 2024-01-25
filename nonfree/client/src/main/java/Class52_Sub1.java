import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dga")
public class Class52_Sub1 extends Class52 {

	@OriginalMember(owner = "client!dga", name = "z", descriptor = "I")
	private int anInt1664 = -1;

	@OriginalMember(owner = "client!dga", name = "G", descriptor = "I")
	private int anInt1669 = -1;

	@OriginalMember(owner = "client!dga", name = "D", descriptor = "I")
	public final int anInt1667;

	@OriginalMember(owner = "client!dga", name = "I", descriptor = "I")
	public final int anInt1670;

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lclient!ag;IIIIZ[BIZ)V")
	public Class52_Sub1(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt1667 = arg4;
		this.anInt1670 = arg3;
		if (arg8) {
			@Pc(28) byte[] local28 = new byte[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = arg3 * local30;
				@Pc(45) int local45 = (arg4 - local30 - 1) * arg3;
				for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
					local28[local36++] = arg6[local45++];
				}
			}
			arg6 = local28;
		}
		super.aClass12_Sub1_31.method378(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt6859 != 34037) {
			Static165.method2543(arg4, arg6, arg3, arg7, arg1, arg2);
			this.method5640(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt6859, 0, super.anInt6855, this.anInt1670, this.anInt1667, 0, arg7, 5121, arg6, 0);
			this.method5640(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method5644(true);
	}

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lclient!ag;IIIIZ[FI)V")
	public Class52_Sub1(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt1670 = arg3;
		this.anInt1667 = arg4;
		super.aClass12_Sub1_31.method378(this);
		if (arg5 && super.anInt6859 != 34037) {
			Static23.method5274(arg2, arg7, arg4, arg3, arg1, arg6);
			this.method5640(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt6859, 0, super.anInt6855, this.anInt1670, this.anInt1667, 0, arg7, 5126, arg6, 0);
			this.method5640(false);
		}
		this.method5644(true);
	}

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lclient!ag;IIII)V")
	public Class52_Sub1(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt1670 = arg3;
		this.anInt1667 = arg4;
		super.aClass12_Sub1_31.method378(this);
		OpenGL.glTexImage2Dub(super.anInt6859, 0, super.anInt6855, arg3, arg4, 0, Static494.method6908(super.anInt6855), 5121, null, 0);
		this.method5644(true);
	}

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lclient!ag;IIIIZ[IZ)V")
	public Class52_Sub1(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt1670 = arg3;
		this.anInt1667 = arg4;
		if (arg7) {
			@Pc(28) int[] local28 = new int[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = arg3 * local30;
				@Pc(45) int local45 = arg3 * (arg4 - local30 - 1);
				for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
					local28[local36++] = arg6[local45++];
				}
			}
			arg6 = local28;
		}
		super.aClass12_Sub1_31.method378(this);
		if (arg5 && super.anInt6859 != 34037) {
			Static469.method6615(arg6, super.anInt6859, this.anInt1667, super.aClass12_Sub1_31.anInt482, super.anInt6855, this.anInt1670);
			this.method5640(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt6859, 0, super.anInt6855, this.anInt1670, this.anInt1667, 0, 32993, super.aClass12_Sub1_31.anInt482, arg6, 0);
			this.method5640(false);
		}
		this.method5644(true);
	}

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lclient!ag;IIIII)V")
	public Class52_Sub1(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt1670 = arg4;
		this.anInt1667 = arg5;
		@Pc(30) int local30 = super.aClass12_Sub1_31.anInt414 - arg5 - arg3;
		super.aClass12_Sub1_31.method378(this);
		OpenGL.glCopyTexImage2D(super.anInt6859, 0, super.anInt6855, arg2, local30, arg4, arg5, 0);
		this.method5644(true);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIIIIII)V")
	public final void method1499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = super.aClass12_Sub1_31.anInt414 - arg5 - arg1;
		super.aClass12_Sub1_31.method378(this);
		OpenGL.glCopyTexSubImage2D(super.anInt6859, 0, arg2, this.anInt1667 - arg0 - arg1, arg3, local13, arg4, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(I)V")
	@Override
	public final void method5633() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt1664, this.anInt1669, super.anInt6859, 0, 0);
		this.anInt1664 = -1;
		this.anInt1669 = -1;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(III[BIZIIII)V")
	public final void method1501(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) int arg4) {
		if (arg3) {
			@Pc(15) int local15 = Static287.method4939(6406);
			@Pc(19) int local19 = arg0 * local15;
			@Pc(23) int local23 = arg0 * local15;
			@Pc(28) byte[] local28 = new byte[arg4 * local19];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = local19 * local30;
				@Pc(47) int local47 = (arg4 - local30 - 1) * local23;
				for (@Pc(49) int local49 = 0; local49 < local19; local49++) {
					local28[local36++] = arg1[local47++];
				}
			}
			arg1 = local28;
		}
		super.aClass12_Sub1_31.method378(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt6859, 0, 0, 0, arg0, arg4, 6406, 5121, arg1, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(II[IIZIIII)V")
	protected final void method1502(@OriginalArg(2) int[] arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		@Pc(19) int[] local19 = new int[arg1 * arg2];
		for (@Pc(21) int local21 = 0; local21 < arg1; local21++) {
			@Pc(27) int local27 = arg2 * local21;
			@Pc(39) int local39 = arg2 * (arg1 - local21 - 1);
			for (@Pc(41) int local41 = 0; local41 < arg2; local41++) {
				local19[local27++] = arg0[local39++];
			}
		}
		super.aClass12_Sub1_31.method378(this);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Di(super.anInt6859, 0, 0, 0, arg2, arg1, 32993, super.aClass12_Sub1_31.anInt482, local19, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZZB)V")
	public final void method1504(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (super.anInt6859 == 3553) {
			super.aClass12_Sub1_31.method378(this);
			OpenGL.glTexParameteri(super.anInt6859, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt6859, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "(IIII)V")
	public final void method1505(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt6859, super.anInt6857, 0);
		this.anInt1664 = arg0;
		this.anInt1669 = arg1;
	}
}
