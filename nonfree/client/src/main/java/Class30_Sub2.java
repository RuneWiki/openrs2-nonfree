import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public final class Class30_Sub2 extends Class30 implements Interface1 {

	@OriginalMember(owner = "client!lj", name = "G", descriptor = "I")
	private final int anInt6380;

	@OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
	private final int anInt6377;

	@OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
	private final int anInt6381;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lclient!ai;Lclient!wd;III[B)V")
	public Class30_Sub2(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static258.aClass160_9, arg2 * arg3 * arg4, false);
		this.anInt6380 = arg2;
		this.anInt6377 = arg4;
		this.anInt6381 = arg3;
		super.aClass16_Sub1_Sub1_12.method3889(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt9806, 0, this.method7917(), this.anInt6380, this.anInt6381, this.anInt6377, 0, Static215.method4064(super.aClass366_13), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
