import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public final class Class114_Sub3 extends Class114 implements Interface15 {

	@OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
	private final int anInt8777;

	@OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
	private final int anInt8779;

	@OriginalMember(owner = "client!sc", name = "z", descriptor = "I")
	private final int anInt8778;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!no;Lclient!pd;III[B)V")
	public Class114_Sub3(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static409.aClass242_13, arg4 * arg2 * arg3, false);
		this.anInt8777 = arg2;
		this.anInt8779 = arg4;
		this.anInt8778 = arg3;
		super.aClass100_Sub1_Sub2_10.method6033(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt9168, 0, this.method7828(), this.anInt8777, this.anInt8778, this.anInt8779, 0, Static124.method2047(super.aClass250_14), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
