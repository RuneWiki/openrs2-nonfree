import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class21_Sub4 extends Class21 {

	@OriginalMember(owner = "client!nm", name = "w", descriptor = "I")
	private int anInt4563 = -1;

	@OriginalMember(owner = "client!nm", name = "B", descriptor = "I")
	private int anInt4567 = -1;

	@OriginalMember(owner = "client!nm", name = "z", descriptor = "I")
	public final int anInt4566;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!qg;IIZ[[BI)V")
	public Class21_Sub4(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt4566 = arg2;
		super.aClass121_Sub2_24.method4681(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt4549, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method3755(true);
	}

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!qg;II)V")
	public Class21_Sub4(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt4566 = arg2;
		super.aClass121_Sub2_24.method4681(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt4549, arg2, arg2, 0, Static422.method1666(super.anInt4549), 5121, null, 0);
		}
		this.method3755(true);
	}

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!qg;IIZ[[I)V")
	public Class21_Sub4(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt4566 = arg2;
		super.aClass121_Sub2_24.method4681(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static286.method3915(arg2, local30 + 34069, super.aClass121_Sub2_24.anInt5963, arg2, arg4[local30], super.anInt4549);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt4549, arg2, arg2, 0, 32993, super.aClass121_Sub2_24.anInt5963, arg4[local30], 0);
			}
		}
		this.method3755(true);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)V")
	@Override
	public void method3747() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt4563, this.anInt4567, 3553, 0, 0);
		this.anInt4563 = -1;
		this.anInt4567 = -1;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IBIII)V")
	public void method3762(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg2, arg0, arg1, super.anInt4556, 0);
		this.anInt4563 = arg2;
		this.anInt4567 = arg0;
	}
}
