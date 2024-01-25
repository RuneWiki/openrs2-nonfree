import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public final class Class53_Sub4 extends Class53 implements Interface12 {

	@OriginalMember(owner = "client!sq", name = "w", descriptor = "I")
	private final int anInt8214;

	@OriginalMember(owner = "client!sq", name = "D", descriptor = "I")
	private final int anInt8218;

	@OriginalMember(owner = "client!sq", name = "B", descriptor = "I")
	private final int anInt8216;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!dc;Lclient!hi;III[B)V")
	public Class53_Sub4(@OriginalArg(0) Class66_Sub1_Sub1 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static349.aClass239_12, arg2 * arg3 * arg4, false);
		this.anInt8214 = arg3;
		this.anInt8218 = arg4;
		this.anInt8216 = arg2;
		super.aClass66_Sub1_Sub1_10.method6979(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt8203, 0, this.method6770(), this.anInt8216, this.anInt8214, this.anInt8218, 0, Static241.method4095(super.aClass141_15), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
