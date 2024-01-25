import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public final class Class135_Sub3 extends Class135 implements Interface18 {

	@OriginalMember(owner = "client!wr", name = "D", descriptor = "I")
	private final int anInt9409;

	@OriginalMember(owner = "client!wr", name = "y", descriptor = "I")
	private final int anInt9406;

	@OriginalMember(owner = "client!wr", name = "B", descriptor = "I")
	private final int anInt9407;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lclient!ag;Lclient!aq;III[B)V")
	public Class135_Sub3(@OriginalArg(0) Class9_Sub1_Sub1 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static489.aClass289_13, arg4 * arg3 * arg2, false);
		this.anInt9409 = arg3;
		this.anInt9406 = arg2;
		this.anInt9407 = arg4;
		super.aClass9_Sub1_Sub1_10.method7712(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt9452, 0, this.method7963(), this.anInt9406, this.anInt9409, this.anInt9407, 0, Static456.method6571(super.aClass16_22), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
