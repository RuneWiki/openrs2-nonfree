import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public final class Class203_Sub3 extends Class203 implements Interface10 {

	@OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
	private final int anInt7047;

	@OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
	private final int anInt7046;

	@OriginalMember(owner = "client!ni", name = "A", descriptor = "I")
	private final int anInt7051;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!jc;Lclient!tn;III[B)V")
	public Class203_Sub3(@OriginalArg(0) Class65_Sub2_Sub2 arg0, @OriginalArg(1) Class339 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static120.aClass89_7, arg4 * arg3 * arg2, false);
		this.anInt7047 = arg2;
		this.anInt7046 = arg4;
		this.anInt7051 = arg3;
		super.aClass65_Sub2_Sub2_10.method4426(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt9085, 0, this.method7709(), this.anInt7047, this.anInt7051, this.anInt7046, 0, Static111.method4956(super.aClass339_14), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
