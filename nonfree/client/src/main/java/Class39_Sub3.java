import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public final class Class39_Sub3 extends Class39 implements Interface1 {

	@OriginalMember(owner = "client!ma", name = "B", descriptor = "I")
	private final int anInt6840;

	@OriginalMember(owner = "client!ma", name = "F", descriptor = "I")
	private final int anInt6842;

	@OriginalMember(owner = "client!ma", name = "E", descriptor = "I")
	private final int anInt6841;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!lt;Lclient!hd;III[B)V")
	public Class39_Sub3(@OriginalArg(0) Class67_Sub1_Sub2 arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static438.aClass261_14, arg3 * arg2 * arg4, false);
		this.anInt6840 = arg2;
		this.anInt6842 = arg4;
		this.anInt6841 = arg3;
		super.aClass67_Sub1_Sub2_12.method5612(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt11091, 0, this.method9264(), this.anInt6840, this.anInt6841, this.anInt6842, 0, Static235.method3664(super.aClass145_16), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
