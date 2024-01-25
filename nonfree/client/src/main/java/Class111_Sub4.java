import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public final class Class111_Sub4 extends Class111 implements Interface20 {

	@OriginalMember(owner = "client!tba", name = "C", descriptor = "I")
	private final int anInt9177;

	@OriginalMember(owner = "client!tba", name = "A", descriptor = "I")
	private final int anInt9176;

	@OriginalMember(owner = "client!tba", name = "y", descriptor = "I")
	private final int anInt9174;

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Lclient!sha;Lclient!g;III[B)V")
	public Class111_Sub4(@OriginalArg(0) Class95_Sub1_Sub1 arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static666.aClass389_16, arg3 * arg2 * arg4, false);
		this.anInt9177 = arg3;
		this.anInt9176 = arg4;
		this.anInt9174 = arg2;
		super.aClass95_Sub1_Sub1_12.method8147(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt9160, 0, this.method7471(), this.anInt9174, this.anInt9177, this.anInt9176, 0, Static450.method6089(super.aClass122_18), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
