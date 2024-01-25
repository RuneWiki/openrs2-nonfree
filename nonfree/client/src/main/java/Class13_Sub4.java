import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public final class Class13_Sub4 extends Class13 implements Interface19 {

	@OriginalMember(owner = "client!ju", name = "E", descriptor = "I")
	private final int anInt5311;

	@OriginalMember(owner = "client!ju", name = "B", descriptor = "I")
	private final int anInt5314;

	@OriginalMember(owner = "client!ju", name = "F", descriptor = "I")
	private final int anInt5312;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lclient!vaa;Lclient!sca;III[B)V")
	public Class13_Sub4(@OriginalArg(0) Class22_Sub2_Sub2 arg0, @OriginalArg(1) Class335 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static259.aClass167_7, arg3 * arg2 * arg4, false);
		this.anInt5311 = arg2;
		this.anInt5314 = arg4;
		this.anInt5312 = arg3;
		super.aClass22_Sub2_Sub2_8.method8976(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt5293, 0, this.method4743(), this.anInt5311, this.anInt5312, this.anInt5314, 0, Static82.method1790(super.aClass335_8), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
