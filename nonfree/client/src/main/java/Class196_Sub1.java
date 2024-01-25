import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public final class Class196_Sub1 extends Class196 implements Interface4 {

	@OriginalMember(owner = "client!kq", name = "E", descriptor = "I")
	private final int anInt5746;

	@OriginalMember(owner = "client!kq", name = "F", descriptor = "I")
	private final int anInt5747;

	@OriginalMember(owner = "client!kq", name = "A", descriptor = "I")
	private final int anInt5744;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!dda;Lclient!fca;III[B)V")
	public Class196_Sub1(@OriginalArg(0) Class44_Sub2_Sub1 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static53.aClass42_4, arg3 * arg2 * arg4, false);
		this.anInt5746 = arg3;
		this.anInt5747 = arg2;
		this.anInt5744 = arg4;
		super.aClass44_Sub2_Sub1_12.method4265(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt10110, 0, this.method8276(), this.anInt5747, this.anInt5746, this.anInt5744, 0, Static445.method6846(super.aClass97_56), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
