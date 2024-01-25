import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public final class Class55_Sub4 extends Class55 implements Interface7 {

	@OriginalMember(owner = "client!rq", name = "y", descriptor = "I")
	private final int anInt8845;

	@OriginalMember(owner = "client!rq", name = "D", descriptor = "I")
	private final int anInt8846;

	@OriginalMember(owner = "client!rq", name = "B", descriptor = "I")
	private final int anInt8844;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!mba;Lclient!pm;III[B)V")
	public Class55_Sub4(@OriginalArg(0) Class145_Sub1_Sub1 arg0, @OriginalArg(1) Class295 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static243.aClass158_10, arg3 * arg2 * arg4, false);
		this.anInt8845 = arg2;
		this.anInt8846 = arg3;
		this.anInt8844 = arg4;
		super.aClass145_Sub1_Sub1_10.method9754(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt8840, 0, this.method7823(), this.anInt8845, this.anInt8846, this.anInt8844, 0, Static685.method9235(super.aClass295_13), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
