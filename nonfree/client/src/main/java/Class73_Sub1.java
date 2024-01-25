import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public final class Class73_Sub1 extends Class73 implements Interface14 {

	@OriginalMember(owner = "client!dp", name = "v", descriptor = "I")
	private final int anInt2047;

	@OriginalMember(owner = "client!dp", name = "u", descriptor = "I")
	private final int anInt2046;

	@OriginalMember(owner = "client!dp", name = "y", descriptor = "I")
	private final int anInt2050;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lclient!mr;Lclient!sq;III[B)V")
	public Class73_Sub1(@OriginalArg(0) Class45_Sub2_Sub2 arg0, @OriginalArg(1) Class314 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static471.aClass298_15, arg4 * arg3 * arg2, false);
		this.anInt2047 = arg3;
		this.anInt2046 = arg2;
		this.anInt2050 = arg4;
		super.aClass45_Sub2_Sub2_10.method4926(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt7096, 0, this.method5957(), this.anInt2046, this.anInt2047, this.anInt2050, 0, Static537.method7176(super.aClass314_18), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
