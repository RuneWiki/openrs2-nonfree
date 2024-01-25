import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class16_Sub4 extends Class16 {

	@OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
	private int anInt9868 = -1;

	@OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
	private int anInt9871 = -1;

	@OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
	public final int anInt9867;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!en;IIZ[[I)V")
	public Class16_Sub4(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt9867 = arg2;
		super.aClass90_Sub1_43.method2126(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static74.method1033(super.aClass90_Sub1_43.anInt2454, arg2, arg4[local30], local30 + 34069, arg2, super.anInt9852);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt9852, arg2, arg2, 0, 32993, super.aClass90_Sub1_43.anInt2454, arg4[local30], 0);
			}
		}
		this.method7843(true);
	}

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!en;II)V")
	public Class16_Sub4(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt9867 = arg2;
		super.aClass90_Sub1_43.method2126(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt9852, arg2, arg2, 0, Static122.method1910(super.anInt9852), 5121, null, 0);
		}
		this.method7843(true);
	}

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!en;IIZ[[BI)V")
	public Class16_Sub4(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt9867 = arg2;
		super.aClass90_Sub1_43.method2126(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt9852, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method7843(true);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
	@Override
	public void method7838() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt9871, this.anInt9868, 3553, 0, 0);
		this.anInt9871 = -1;
		this.anInt9868 = -1;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIZI)V")
	public void method7850(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg2, arg0, arg1, super.anInt9857, 0);
		this.anInt9868 = arg0;
		this.anInt9871 = arg2;
	}
}
