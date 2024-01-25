import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public final class Class150_Sub1 extends Class150 implements Interface20 {

	@OriginalMember(owner = "client!hr", name = "D", descriptor = "I")
	private final int anInt4504;

	@OriginalMember(owner = "client!hr", name = "C", descriptor = "I")
	private final int anInt4503;

	@OriginalMember(owner = "client!hr", name = "A", descriptor = "I")
	private final int anInt4502;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!hj;Lclient!iv;III[B)V")
	public Class150_Sub1(@OriginalArg(0) Class82_Sub3_Sub1 arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static280.aClass182_8, arg4 * arg2 * arg3, false);
		this.anInt4504 = arg3;
		this.anInt4503 = arg4;
		this.anInt4502 = arg2;
		super.aClass82_Sub3_Sub1_11.method4972(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt10006, 0, this.method8493(), this.anInt4502, this.anInt4504, this.anInt4503, 0, Static383.method8680(super.aClass168_15), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
