import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public final class Class12_Sub3 extends Class12 implements Interface11 {

	@OriginalMember(owner = "client!sr", name = "z", descriptor = "I")
	private final int anInt8264;

	@OriginalMember(owner = "client!sr", name = "y", descriptor = "I")
	private final int anInt8263;

	@OriginalMember(owner = "client!sr", name = "A", descriptor = "I")
	private final int anInt8265;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lclient!el;Lclient!nh;III[B)V")
	public Class12_Sub3(@OriginalArg(0) Class14_Sub2_Sub1 arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static239.aClass161_12, arg4 * arg3 * arg2, false);
		this.anInt8264 = arg2;
		this.anInt8263 = arg3;
		this.anInt8265 = arg4;
		super.aClass14_Sub2_Sub1_10.method7034(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt9288, 0, this.method7591(), this.anInt8264, this.anInt8263, this.anInt8265, 0, Static255.method4299(super.aClass219_15), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
