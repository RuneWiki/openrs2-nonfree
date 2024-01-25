import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public final class Class24_Sub1 extends Class24 implements Interface13 {

	@OriginalMember(owner = "client!ar", name = "H", descriptor = "I")
	private final int anInt356;

	@OriginalMember(owner = "client!ar", name = "F", descriptor = "I")
	private final int anInt359;

	@OriginalMember(owner = "client!ar", name = "E", descriptor = "I")
	private final int anInt357;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!dga;Lclient!hh;III[B)V")
	public Class24_Sub1(@OriginalArg(0) Class75_Sub1_Sub1 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static435.aClass274_13, arg4 * arg3 * arg2, false);
		this.anInt356 = arg2;
		this.anInt359 = arg3;
		this.anInt357 = arg4;
		super.aClass75_Sub1_Sub1_12.method6814(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt10024, 0, this.method8714(), this.anInt356, this.anInt359, this.anInt357, 0, Static305.method5428(super.aClass155_59), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
