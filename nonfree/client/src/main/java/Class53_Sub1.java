import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public final class Class53_Sub1 extends Class53 implements Interface23 {

	@OriginalMember(owner = "client!ch", name = "D", descriptor = "I")
	private final int anInt1423;

	@OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
	private final int anInt1420;

	@OriginalMember(owner = "client!ch", name = "z", descriptor = "I")
	private final int anInt1421;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!om;Lclient!lw;III[B)V")
	public Class53_Sub1(@OriginalArg(0) Class133_Sub1_Sub2 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static20.aClass19_4, arg2 * arg3 * arg4, false);
		this.anInt1423 = arg3;
		this.anInt1420 = arg2;
		this.anInt1421 = arg4;
		super.aClass133_Sub1_Sub2_9.method6153(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt5166, 0, this.method4634(), this.anInt1420, this.anInt1423, this.anInt1421, 0, Static117.method1781(super.aClass223_11), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
