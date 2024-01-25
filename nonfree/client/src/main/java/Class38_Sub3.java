import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public final class Class38_Sub3 extends Class38 implements Interface13 {

	@OriginalMember(owner = "client!qba", name = "z", descriptor = "I")
	private final int anInt8314;

	@OriginalMember(owner = "client!qba", name = "G", descriptor = "I")
	private final int anInt8319;

	@OriginalMember(owner = "client!qba", name = "E", descriptor = "I")
	private final int anInt8317;

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lclient!bga;Lclient!wq;III[B)V")
	public Class38_Sub3(@OriginalArg(0) Class20_Sub2_Sub2 arg0, @OriginalArg(1) Class375 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static29.aClass26_4, arg3 * arg2 * arg4, false);
		this.anInt8314 = arg4;
		this.anInt8319 = arg2;
		this.anInt8317 = arg3;
		super.aClass20_Sub2_Sub2_12.method1484(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt9963, 0, this.method8288(), this.anInt8319, this.anInt8317, this.anInt8314, 0, Static209.method4123(super.aClass375_46), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
