import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public final class Class117_Sub2 extends Class117 implements Interface9 {

	@OriginalMember(owner = "client!rw", name = "z", descriptor = "I")
	private final int anInt9160;

	@OriginalMember(owner = "client!rw", name = "B", descriptor = "I")
	private final int anInt9161;

	@OriginalMember(owner = "client!rw", name = "G", descriptor = "I")
	private final int anInt9164;

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lclient!ko;Lclient!vea;III[B)V")
	public Class117_Sub2(@OriginalArg(0) Class137_Sub1_Sub1 arg0, @OriginalArg(1) Class363 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static47.aClass36_5, arg4 * arg2 * arg3, false);
		this.anInt9160 = arg2;
		this.anInt9161 = arg4;
		this.anInt9164 = arg3;
		super.aClass137_Sub1_Sub1_12.method8007(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt10830, 0, this.method9026(), this.anInt9160, this.anInt9164, this.anInt9161, 0, Static1.method8561(super.aClass363_16), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
