import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public final class Class48_Sub2 extends Class48 implements Interface19 {

	@OriginalMember(owner = "client!gk", name = "C", descriptor = "I")
	private final int anInt3380;

	@OriginalMember(owner = "client!gk", name = "E", descriptor = "I")
	private final int anInt3381;

	@OriginalMember(owner = "client!gk", name = "B", descriptor = "I")
	private final int anInt3379;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!laa;Lclient!qda;III[B)V")
	public Class48_Sub2(@OriginalArg(0) Class126_Sub2_Sub1 arg0, @OriginalArg(1) Class281 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static385.aClass247_14, arg4 * arg2 * arg3, false);
		this.anInt3380 = arg3;
		this.anInt3381 = arg2;
		this.anInt3379 = arg4;
		super.aClass126_Sub2_Sub1_12.method5449(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt8874, 0, this.method7616(), this.anInt3381, this.anInt3380, this.anInt3379, 0, Static350.method5350(super.aClass281_18), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
