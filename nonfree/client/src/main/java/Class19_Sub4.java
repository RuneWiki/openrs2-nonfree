import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public final class Class19_Sub4 extends Class19 implements Interface9 {

	@OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
	private final int anInt8943;

	@OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
	private final int anInt8944;

	@OriginalMember(owner = "client!vf", name = "C", descriptor = "I")
	private final int anInt8942;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lclient!jq;Lclient!fda;III[B)V")
	public Class19_Sub4(@OriginalArg(0) Class43_Sub1_Sub2 arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static461.aClass292_14, arg2 * arg3 * arg4, false);
		this.anInt8943 = arg4;
		this.anInt8944 = arg2;
		this.anInt8942 = arg3;
		super.aClass43_Sub1_Sub2_12.method4298(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt8940, 0, this.method7428(), this.anInt8944, this.anInt8942, this.anInt8943, 0, Static428.method1615(super.aClass93_12), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
