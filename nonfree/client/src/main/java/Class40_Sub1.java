import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public final class Class40_Sub1 extends Class40 implements Interface24 {

	@OriginalMember(owner = "client!bk", name = "z", descriptor = "I")
	private final int anInt1345;

	@OriginalMember(owner = "client!bk", name = "A", descriptor = "I")
	private final int anInt1346;

	@OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
	private final int anInt1348;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lclient!oia;Lclient!ul;III[B)V")
	public Class40_Sub1(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) Class361 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static553.aClass330_14, arg2 * arg3 * arg4, false);
		this.anInt1345 = arg3;
		this.anInt1346 = arg2;
		this.anInt1348 = arg4;
		super.aClass16_Sub1_Sub2_7.method6197(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt6834, 0, this.method5712(), this.anInt1346, this.anInt1345, this.anInt1348, 0, Static299.method4638(super.aClass361_13), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
