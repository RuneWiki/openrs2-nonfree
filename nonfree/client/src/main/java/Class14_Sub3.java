import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public final class Class14_Sub3 extends Class14 implements Interface11 {

	@OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
	private final int anInt4410;

	@OriginalMember(owner = "client!jd", name = "C", descriptor = "I")
	private final int anInt4411;

	@OriginalMember(owner = "client!jd", name = "H", descriptor = "I")
	private final int anInt4414;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lclient!hp;Lclient!lca;III[B)V")
	public Class14_Sub3(@OriginalArg(0) Class134_Sub1_Sub1 arg0, @OriginalArg(1) Class203 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static215.aClass155_10, arg3 * arg2 * arg4, false);
		this.anInt4410 = arg2;
		this.anInt4411 = arg4;
		this.anInt4414 = arg3;
		super.aClass134_Sub1_Sub1_9.method6766(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt6022, 0, this.method4925(), this.anInt4410, this.anInt4414, this.anInt4411, 0, Static28.method321(super.aClass203_12), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
