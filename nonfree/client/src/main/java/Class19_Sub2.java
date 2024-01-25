import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public final class Class19_Sub2 extends Class19 implements Interface19 {

	@OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
	private final int anInt2287;

	@OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
	private final int anInt2288;

	@OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
	private final int anInt2286;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lclient!bea;Lclient!os;III[B)V")
	public Class19_Sub2(@OriginalArg(0) Class31_Sub1_Sub1 arg0, @OriginalArg(1) Class245 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static331.aClass204_13, arg4 * arg2 * arg3, false);
		this.anInt2287 = arg2;
		this.anInt2288 = arg4;
		this.anInt2286 = arg3;
		super.aClass31_Sub1_Sub1_7.method7129(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt3834, 0, this.method3094(), this.anInt2287, this.anInt2286, this.anInt2288, 0, Static580.method7901(super.aClass245_10), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
