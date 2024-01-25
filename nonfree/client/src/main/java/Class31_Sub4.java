import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class31_Sub4 extends Class31 {

	@OriginalMember(owner = "client!rh", name = "y", descriptor = "I")
	private int anInt5794 = -1;

	@OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
	private int anInt5793 = -1;

	@OriginalMember(owner = "client!rh", name = "A", descriptor = "I")
	public final int anInt5796;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!tt;IIZ[[BI)V")
	public Class31_Sub4(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt5796 = arg2;
		super.aClass200_Sub2_34.method5312(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt5789, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method4591(true);
	}

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!tt;IIZ[[I)V")
	public Class31_Sub4(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt5796 = arg2;
		super.aClass200_Sub2_34.method5312(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static376.method5009(arg4[local30], arg2, super.aClass200_Sub2_34.anInt6760, arg2, local30 + 34069, super.anInt5789);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt5789, arg2, arg2, 0, 32993, super.aClass200_Sub2_34.anInt6760, arg4[local30], 0);
			}
		}
		this.method4591(true);
	}

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!tt;II)V")
	public Class31_Sub4(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt5796 = arg2;
		super.aClass200_Sub2_34.method5312(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt5789, arg2, arg2, 0, Static314.method3855(super.anInt5789), 5121, null, 0);
		}
		this.method4591(true);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
	@Override
	public void method4581() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt5794, this.anInt5793, 3553, 0, 0);
		this.anInt5793 = -1;
		this.anInt5794 = -1;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIBI)V")
	public void method4595(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg2, arg0, arg1, super.anInt5784, 0);
		this.anInt5793 = arg0;
		this.anInt5794 = arg2;
	}
}
