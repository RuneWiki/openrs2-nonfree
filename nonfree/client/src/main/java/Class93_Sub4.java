import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public final class Class93_Sub4 extends Class93 implements Interface21 {

	@OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
	private final int anInt9321;

	@OriginalMember(owner = "client!tj", name = "B", descriptor = "I")
	private final int anInt9322;

	@OriginalMember(owner = "client!tj", name = "x", descriptor = "I")
	private final int anInt9319;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!pa;Lclient!sw;III[B)V")
	public Class93_Sub4(@OriginalArg(0) Class13_Sub1_Sub1 arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static246.aClass152_10, arg4 * arg2 * arg3, false);
		this.anInt9321 = arg4;
		this.anInt9322 = arg2;
		this.anInt9319 = arg3;
		super.aClass13_Sub1_Sub1_11.method7530(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt9318, 0, this.method8144(), this.anInt9322, this.anInt9319, this.anInt9321, 0, Static282.method4524(super.aClass327_16), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
