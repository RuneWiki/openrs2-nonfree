import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public final class Class105_Sub2 extends Class105 implements Interface17 {

	@OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
	private final int anInt6872;

	@OriginalMember(owner = "client!ml", name = "J", descriptor = "I")
	private final int anInt6879;

	@OriginalMember(owner = "client!ml", name = "C", descriptor = "I")
	private final int anInt6873;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!ck;Lclient!em;III[B)V")
	public Class105_Sub2(@OriginalArg(0) Class33_Sub1_Sub1 arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static137.aClass89_8, arg4 * arg3 * arg2, false);
		this.anInt6872 = arg4;
		this.anInt6879 = arg2;
		this.anInt6873 = arg3;
		super.aClass33_Sub1_Sub1_10.method1987(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt8841, 0, this.method7307(), this.anInt6879, this.anInt6873, this.anInt6872, 0, Static341.method5637(super.aClass82_15), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
