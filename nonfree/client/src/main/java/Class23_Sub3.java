import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public final class Class23_Sub3 extends Class23 implements Interface1 {

	@OriginalMember(owner = "client!jha", name = "H", descriptor = "I")
	private final int anInt4752;

	@OriginalMember(owner = "client!jha", name = "C", descriptor = "I")
	private final int anInt4748;

	@OriginalMember(owner = "client!jha", name = "E", descriptor = "I")
	private final int anInt4750;

	@OriginalMember(owner = "client!jha", name = "<init>", descriptor = "(Lclient!oaa;Lclient!pb;III[B)V")
	public Class23_Sub3(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) Class265 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static417.aClass250_14, arg4 * arg2 * arg3, false);
		this.anInt4752 = arg2;
		this.anInt4748 = arg3;
		this.anInt4750 = arg4;
		super.aClass132_Sub1_Sub1_12.method7635(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt9768, 0, this.method8248(), this.anInt4752, this.anInt4748, this.anInt4750, 0, Static233.method3518(super.aClass265_17), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
