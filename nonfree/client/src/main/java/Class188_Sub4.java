import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public final class Class188_Sub4 extends Class188 implements Interface15 {

	@OriginalMember(owner = "client!vk", name = "E", descriptor = "I")
	private final int anInt9251;

	@OriginalMember(owner = "client!vk", name = "C", descriptor = "I")
	private final int anInt9249;

	@OriginalMember(owner = "client!vk", name = "x", descriptor = "I")
	private final int anInt9246;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!kd;Lclient!wu;III[B)V")
	public Class188_Sub4(@OriginalArg(0) Class162_Sub1_Sub2 arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static42.aClass35_4, arg4 * arg3 * arg2, false);
		this.anInt9251 = arg3;
		this.anInt9249 = arg4;
		this.anInt9246 = arg2;
		super.aClass162_Sub1_Sub2_12.method3865(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt9239, 0, this.method7377(), this.anInt9246, this.anInt9251, this.anInt9249, 0, Static280.method4043(super.aClass366_14), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
