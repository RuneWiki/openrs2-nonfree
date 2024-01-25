import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public final class Class107_Sub3 extends Class107 implements Interface13 {

	@OriginalMember(owner = "client!ki", name = "D", descriptor = "I")
	private final int anInt5653;

	@OriginalMember(owner = "client!ki", name = "E", descriptor = "I")
	private final int anInt5654;

	@OriginalMember(owner = "client!ki", name = "C", descriptor = "I")
	private final int anInt5652;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!fc;Lclient!nea;III[B)V")
	public Class107_Sub3(@OriginalArg(0) Class101_Sub1_Sub1 arg0, @OriginalArg(1) Class244 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static114.aClass79_7, arg3 * arg2 * arg4, false);
		this.anInt5653 = arg2;
		this.anInt5654 = arg4;
		this.anInt5652 = arg3;
		super.aClass101_Sub1_Sub1_12.method5909(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt10614, 0, this.method9092(), this.anInt5653, this.anInt5652, this.anInt5654, 0, Static410.method6767(super.aClass244_14), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
