import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!dl", name = "x", descriptor = "I")
	private int anInt1547 = -1;

	@OriginalMember(owner = "client!dl", name = "y", descriptor = "I")
	private int anInt1548 = -1;

	@OriginalMember(owner = "client!dl", name = "v", descriptor = "I")
	public final int anInt1545;

	static {
		new Class182("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
	}

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lclient!da;IIZ[[BI)V")
	public Class4_Sub2(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt1545 = arg2;
		super.aClass50_Sub1_32.method1295(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt5763, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method4580(true);
	}

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lclient!da;II)V")
	public Class4_Sub2(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt1545 = arg2;
		super.aClass50_Sub1_32.method1295(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt5763, arg2, arg2, 0, Static245.method3581(super.anInt5763), 5121, null, 0);
		}
		this.method4580(true);
	}

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lclient!da;IIZ[[I)V")
	public Class4_Sub2(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt1545 = arg2;
		super.aClass50_Sub1_32.method1295(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static162.method2705(super.anInt5763, arg2, super.aClass50_Sub1_32.anInt1412, local30 + 34069, arg4[local30], arg2);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt5763, arg2, arg2, 0, 32993, super.aClass50_Sub1_32.anInt1412, arg4[local30], 0);
			}
		}
		this.method4580(true);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIB)V")
	public void method1416(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg2, arg0, super.anInt5758, 0);
		this.anInt1547 = arg1;
		this.anInt1548 = arg2;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
	@Override
	public void method5899() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt1547, this.anInt1548, 3553, 0, 0);
		this.anInt1548 = -1;
		this.anInt1547 = -1;
	}
}
