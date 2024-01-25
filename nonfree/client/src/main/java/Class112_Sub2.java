import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public final class Class112_Sub2 extends Class112 implements Interface4 {

	@OriginalMember(owner = "client!ls", name = "C", descriptor = "I")
	private final int anInt5587;

	@OriginalMember(owner = "client!ls", name = "D", descriptor = "I")
	private final int anInt5588;

	@OriginalMember(owner = "client!ls", name = "B", descriptor = "I")
	private final int anInt5586;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!qi;Lclient!sk;III[B)V")
	public Class112_Sub2(@OriginalArg(0) Class12_Sub2_Sub2 arg0, @OriginalArg(1) Class297 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static554.aClass340_14, arg3 * arg2 * arg4, false);
		this.anInt5587 = arg2;
		this.anInt5588 = arg4;
		this.anInt5586 = arg3;
		super.aClass12_Sub2_Sub2_11.method6159(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt8864, 0, this.method7324(), this.anInt5587, this.anInt5586, this.anInt5588, 0, Static395.method5609(super.aClass297_14), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
