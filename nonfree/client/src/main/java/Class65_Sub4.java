import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class65_Sub4 extends Class65 {

	@OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
	private int anInt8063 = -1;

	@OriginalMember(owner = "client!rh", name = "z", descriptor = "I")
	private int anInt8065 = -1;

	@OriginalMember(owner = "client!rh", name = "A", descriptor = "I")
	public final int anInt8066;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!ep;IIZ[[I)V")
	public Class65_Sub4(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt8066 = arg2;
		super.aClass95_Sub1_36.method2077(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static101.method1538(super.aClass95_Sub1_36.anInt2550, arg2, arg4[local30], super.anInt8057, arg2, local30 + 34069);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt8057, arg2, arg2, 0, 32993, super.aClass95_Sub1_36.anInt2550, arg4[local30], 0);
			}
		}
		this.method6836(true);
	}

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!ep;IIZ[[BI)V")
	public Class65_Sub4(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt8066 = arg2;
		super.aClass95_Sub1_36.method2077(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt8057, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method6836(true);
	}

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!ep;II)V")
	public Class65_Sub4(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt8066 = arg2;
		super.aClass95_Sub1_36.method2077(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt8057, arg2, arg2, 0, Static194.method7690(super.anInt8057), 5121, null, 0);
		}
		this.method6836(true);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIZ)V")
	public void method6837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg2, arg1, arg0, super.anInt8055, 0);
		this.anInt8063 = arg2;
		this.anInt8065 = arg1;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
	@Override
	public void method6824() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt8063, this.anInt8065, 3553, 0, 0);
		this.anInt8065 = -1;
		this.anInt8063 = -1;
	}
}
