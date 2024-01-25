import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public final class Class111_Sub4 extends Class111 implements Interface12 {

	@OriginalMember(owner = "client!kaa", name = "A", descriptor = "I")
	private final int anInt5062;

	@OriginalMember(owner = "client!kaa", name = "B", descriptor = "I")
	private final int anInt5063;

	@OriginalMember(owner = "client!kaa", name = "z", descriptor = "I")
	private final int anInt5061;

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Lclient!mba;Lclient!kca;III[B)V")
	public Class111_Sub4(@OriginalArg(0) Class5_Sub1_Sub2 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static637.aClass376_16, arg4 * arg2 * arg3, false);
		this.anInt5062 = arg2;
		this.anInt5063 = arg3;
		this.anInt5061 = arg4;
		super.aClass5_Sub1_Sub2_6.method5609(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt5057, 0, this.method4561(), this.anInt5062, this.anInt5063, this.anInt5061, 0, Static419.method6584(super.aClass182_10), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
