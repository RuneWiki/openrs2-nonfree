import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mda")
public final class Class34_Sub4 extends Class34 {

	@OriginalMember(owner = "client!mda", name = "w", descriptor = "I")
	private int anInt5776 = -1;

	@OriginalMember(owner = "client!mda", name = "u", descriptor = "I")
	private int anInt5774 = -1;

	@OriginalMember(owner = "client!mda", name = "x", descriptor = "I")
	public final int anInt5777;

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lclient!us;IIZ[[BI)V")
	public Class34_Sub4(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt5777 = arg2;
		super.aClass43_Sub3_23.method7220(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt5764, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method4974(true);
	}

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lclient!us;IIZ[[I)V")
	public Class34_Sub4(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt5777 = arg2;
		super.aClass43_Sub3_23.method7220(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static65.method1515(local30 + 34069, arg4[local30], arg2, super.aClass43_Sub3_23.anInt8763, arg2, super.anInt5764);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt5764, arg2, arg2, 0, 32993, super.aClass43_Sub3_23.anInt8763, arg4[local30], 0);
			}
		}
		this.method4974(true);
	}

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lclient!us;II)V")
	public Class34_Sub4(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt5777 = arg2;
		super.aClass43_Sub3_23.method7220(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt5764, arg2, arg2, 0, Static562.method7491(super.anInt5764), 5121, null, 0);
		}
		this.method4974(true);
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIIII)V")
	public void method4979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, arg2, super.anInt5765, 0);
		this.anInt5776 = arg1;
		this.anInt5774 = arg0;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)V")
	@Override
	public void method4969() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt5774, this.anInt5776, 3553, 0, 0);
		this.anInt5774 = -1;
		this.anInt5776 = -1;
	}
}
