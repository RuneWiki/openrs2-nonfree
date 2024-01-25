import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public final class Class81_Sub2 extends Class81 implements Interface19 {

	@OriginalMember(owner = "client!kt", name = "w", descriptor = "I")
	private final int anInt5436;

	@OriginalMember(owner = "client!kt", name = "z", descriptor = "I")
	private final int anInt5438;

	@OriginalMember(owner = "client!kt", name = "B", descriptor = "I")
	private final int anInt5439;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lclient!nfa;Lclient!vj;III[B)V")
	public Class81_Sub2(@OriginalArg(0) Class9_Sub3_Sub2 arg0, @OriginalArg(1) Class333 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static336.aClass220_12, arg2 * arg3 * arg4, false);
		this.anInt5436 = arg2;
		this.anInt5438 = arg4;
		this.anInt5439 = arg3;
		super.aClass9_Sub3_Sub2_10.method5494(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt9224, 0, this.method7742(), this.anInt5436, this.anInt5439, this.anInt5438, 0, Static290.method4775(super.aClass333_16), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
