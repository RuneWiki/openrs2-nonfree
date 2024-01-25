import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class164_Sub1 extends Class164 {

	@OriginalMember(owner = "client!kh", name = "x", descriptor = "I")
	private int anInt4798 = -1;

	@OriginalMember(owner = "client!kh", name = "B", descriptor = "I")
	private int anInt4802 = -1;

	@OriginalMember(owner = "client!kh", name = "y", descriptor = "I")
	public final int anInt4799;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!mh;II)V")
	public Class164_Sub1(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt4799 = arg2;
		super.aClass4_Sub3_43.method5250(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt9461, arg2, arg2, 0, Static514.method7865(super.anInt9461), 5121, null, 0);
		}
		this.method8154(true);
	}

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!mh;IIZ[[BI)V")
	public Class164_Sub1(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt4799 = arg2;
		super.aClass4_Sub3_43.method5250(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt9461, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method8154(true);
	}

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!mh;IIZ[[I)V")
	public Class164_Sub1(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt4799 = arg2;
		super.aClass4_Sub3_43.method5250(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static310.method5798(local30 + 34069, super.anInt9461, arg4[local30], arg2, arg2, super.aClass4_Sub3_43.anInt5806);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt9461, arg2, arg2, 0, 32993, super.aClass4_Sub3_43.anInt5806, arg4[local30], 0);
			}
		}
		this.method8154(true);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
	@Override
	public void method8143() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt4802, this.anInt4798, 3553, 0, 0);
		this.anInt4798 = -1;
		this.anInt4802 = -1;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIII)V")
	public void method4428(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, arg2, super.anInt9463, 0);
		this.anInt4802 = arg0;
		this.anInt4798 = arg1;
	}
}
