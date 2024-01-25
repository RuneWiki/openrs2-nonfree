import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public final class Class23_Sub4 extends Class23 implements Interface19 {

	@OriginalMember(owner = "client!tn", name = "C", descriptor = "I")
	private final int anInt9705;

	@OriginalMember(owner = "client!tn", name = "B", descriptor = "I")
	private final int anInt9707;

	@OriginalMember(owner = "client!tn", name = "A", descriptor = "I")
	private final int anInt9706;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lclient!rda;Lclient!eu;III[B)V")
	public Class23_Sub4(@OriginalArg(0) Class57_Sub3_Sub1 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static453.aClass278_13, arg4 * arg2 * arg3, false);
		this.anInt9705 = arg2;
		this.anInt9707 = arg3;
		this.anInt9706 = arg4;
		super.aClass57_Sub3_Sub1_12.method7813(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt9693, 0, this.method8310(), this.anInt9705, this.anInt9707, this.anInt9706, 0, Static446.method6638(super.aClass114_20), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
