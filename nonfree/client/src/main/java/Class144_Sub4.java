import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public final class Class144_Sub4 extends Class144 implements Interface15 {

	@OriginalMember(owner = "client!uca", name = "D", descriptor = "I")
	private final int anInt8551;

	@OriginalMember(owner = "client!uca", name = "z", descriptor = "I")
	private final int anInt8549;

	@OriginalMember(owner = "client!uca", name = "B", descriptor = "I")
	private final int anInt8550;

	@OriginalMember(owner = "client!uca", name = "<init>", descriptor = "(Lclient!qba;Lclient!jt;III[B)V")
	public Class144_Sub4(@OriginalArg(0) Class39_Sub2_Sub2 arg0, @OriginalArg(1) Class150 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static268.aClass171_10, arg3 * arg2 * arg4, false);
		this.anInt8551 = arg4;
		this.anInt8549 = arg3;
		this.anInt8550 = arg2;
		super.aClass39_Sub2_Sub2_10.method6179(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt8539, 0, this.method7134(), this.anInt8550, this.anInt8549, this.anInt8551, 0, Static126.method6453(super.aClass150_15), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
