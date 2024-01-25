import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public final class Class58_Sub2 extends Class58 implements Interface3 {

	@OriginalMember(owner = "client!fj", name = "E", descriptor = "I")
	private final int anInt2697;

	@OriginalMember(owner = "client!fj", name = "B", descriptor = "I")
	private final int anInt2696;

	@OriginalMember(owner = "client!fj", name = "J", descriptor = "I")
	private final int anInt2700;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!tm;Lclient!g;III[B)V")
	public Class58_Sub2(@OriginalArg(0) Class4_Sub2_Sub2 arg0, @OriginalArg(1) Class110 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static517.aClass308_15, arg2 * arg3 * arg4, false);
		this.anInt2697 = arg3;
		this.anInt2696 = arg4;
		this.anInt2700 = arg2;
		super.aClass4_Sub2_Sub2_10.method7316(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt8923, 0, this.method7766(), this.anInt2700, this.anInt2697, this.anInt2696, 0, Static295.method5137(super.aClass110_23), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
