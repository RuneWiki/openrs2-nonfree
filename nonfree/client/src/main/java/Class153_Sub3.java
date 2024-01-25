import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public final class Class153_Sub3 extends Class153 implements Interface21 {

	@OriginalMember(owner = "client!jha", name = "D", descriptor = "I")
	private final int anInt4341;

	@OriginalMember(owner = "client!jha", name = "A", descriptor = "I")
	private final int anInt4338;

	@OriginalMember(owner = "client!jha", name = "E", descriptor = "I")
	private final int anInt4342;

	@OriginalMember(owner = "client!jha", name = "<init>", descriptor = "(Lclient!og;Lclient!ofa;III[B)V")
	public Class153_Sub3(@OriginalArg(0) Class143_Sub1_Sub2 arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static314.aClass206_12, arg4 * arg3 * arg2, false);
		this.anInt4341 = arg4;
		this.anInt4338 = arg3;
		this.anInt4342 = arg2;
		super.aClass143_Sub1_Sub2_10.method6338(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt8818, 0, this.method7446(), this.anInt4342, this.anInt4338, this.anInt4341, 0, Static517.method7337(super.aClass255_22), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
