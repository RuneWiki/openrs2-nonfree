import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public final class Class7_Sub1 extends Class7 implements Interface1 {

	@OriginalMember(owner = "client!ag", name = "A", descriptor = "I")
	private final int anInt348;

	@OriginalMember(owner = "client!ag", name = "C", descriptor = "I")
	private final int anInt349;

	@OriginalMember(owner = "client!ag", name = "F", descriptor = "I")
	private final int anInt351;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!ia;Lclient!pw;III[B)V")
	public Class7_Sub1(@OriginalArg(0) Class15_Sub2_Sub1 arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static302.aClass200_11, arg3 * arg2 * arg4, false);
		this.anInt348 = arg3;
		this.anInt349 = arg2;
		this.anInt351 = arg4;
		super.aClass15_Sub2_Sub1_10.method5414(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt10141, 0, this.method8227(), this.anInt349, this.anInt348, this.anInt351, 0, Static282.method4862(super.aClass261_15), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
