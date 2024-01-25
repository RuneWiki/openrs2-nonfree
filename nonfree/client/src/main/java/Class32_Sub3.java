import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nja")
public final class Class32_Sub3 extends Class32 implements Interface14 {

	@OriginalMember(owner = "client!nja", name = "z", descriptor = "I")
	private final int anInt6663;

	@OriginalMember(owner = "client!nja", name = "C", descriptor = "I")
	private final int anInt6667;

	@OriginalMember(owner = "client!nja", name = "B", descriptor = "I")
	private final int anInt6661;

	@OriginalMember(owner = "client!nja", name = "<init>", descriptor = "(Lclient!tia;Lclient!ua;III[B)V")
	public Class32_Sub3(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class358 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static104.aClass86_8, arg3 * arg2 * arg4, false);
		this.anInt6663 = arg2;
		this.anInt6667 = arg4;
		this.anInt6661 = arg3;
		super.aClass100_Sub1_Sub2_11.method7923(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt10540, 0, this.method8898(), this.anInt6663, this.anInt6661, this.anInt6667, 0, Static298.method4688(super.aClass358_17), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
