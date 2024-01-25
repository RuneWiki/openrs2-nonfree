import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public final class Class149_Sub2 extends Class149 implements Interface21 {

	@OriginalMember(owner = "client!od", name = "H", descriptor = "I")
	private final int anInt6655;

	@OriginalMember(owner = "client!od", name = "D", descriptor = "I")
	private final int anInt6652;

	@OriginalMember(owner = "client!od", name = "J", descriptor = "I")
	private final int anInt6657;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!tba;Lclient!pn;III[B)V")
	public Class149_Sub2(@OriginalArg(0) Class78_Sub1_Sub2 arg0, @OriginalArg(1) Class271 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static243.aClass172_9, arg4 * arg2 * arg3, false);
		this.anInt6655 = arg4;
		this.anInt6652 = arg2;
		this.anInt6657 = arg3;
		super.aClass78_Sub1_Sub2_11.method6931(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt9000, 0, this.method7302(), this.anInt6652, this.anInt6657, this.anInt6655, 0, Static267.method3896(super.aClass271_13), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
