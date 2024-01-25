import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class Class26_Sub1 extends Class26 implements Interface11 {

	@OriginalMember(owner = "client!bb", name = "E", descriptor = "I")
	private final int anInt578;

	@OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
	private final int anInt575;

	@OriginalMember(owner = "client!bb", name = "H", descriptor = "I")
	private final int anInt580;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!mc;Lclient!kf;III[B)V")
	public Class26_Sub1(@OriginalArg(0) Class90_Sub3_Sub1 arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static407.aClass254_14, arg2 * arg3 * arg4, false);
		this.anInt578 = arg3;
		this.anInt575 = arg4;
		this.anInt580 = arg2;
		super.aClass90_Sub3_Sub1_10.method7624(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt8827, 0, this.method7040(), this.anInt580, this.anInt578, this.anInt575, 0, Static474.method6581(super.aClass171_16), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
