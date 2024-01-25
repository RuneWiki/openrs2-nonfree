import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public final class Class103_Sub1 extends Class103 implements Interface6 {

	@OriginalMember(owner = "client!eq", name = "F", descriptor = "I")
	private final int anInt2704;

	@OriginalMember(owner = "client!eq", name = "L", descriptor = "I")
	private final int anInt2708;

	@OriginalMember(owner = "client!eq", name = "H", descriptor = "I")
	private final int anInt2705;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lclient!lm;Lclient!ec;III[B)V")
	public Class103_Sub1(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static47.aClass42_4, arg2 * arg3 * arg4, false);
		this.anInt2704 = arg3;
		this.anInt2708 = arg4;
		this.anInt2705 = arg2;
		super.aClass100_Sub1_Sub2_12.method4876(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt8494, 0, this.method7057(), this.anInt2705, this.anInt2704, this.anInt2708, 0, Static314.method7316(super.aClass88_14), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
