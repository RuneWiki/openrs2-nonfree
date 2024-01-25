import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public final class Class8_Sub4 extends Class8 implements Interface13 {

	@OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
	private final int anInt7826;

	@OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
	private final int anInt7828;

	@OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
	private final int anInt7827;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!gf;Lclient!kp;III[B)V")
	public Class8_Sub4(@OriginalArg(0) Class5_Sub3_Sub1 arg0, @OriginalArg(1) Class167 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static524.aClass310_16, arg4 * arg2 * arg3, false);
		this.anInt7826 = arg4;
		this.anInt7828 = arg3;
		this.anInt7827 = arg2;
		super.aClass5_Sub3_Sub1_9.method6416(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt7814, 0, this.method6479(), this.anInt7827, this.anInt7828, this.anInt7826, 0, Static88.method1793(super.aClass167_12), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
