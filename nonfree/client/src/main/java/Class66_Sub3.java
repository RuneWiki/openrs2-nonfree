import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public final class Class66_Sub3 extends Class66 implements Interface17 {

	@OriginalMember(owner = "client!qda", name = "I", descriptor = "I")
	private final int anInt7482;

	@OriginalMember(owner = "client!qda", name = "H", descriptor = "I")
	private final int anInt7481;

	@OriginalMember(owner = "client!qda", name = "E", descriptor = "I")
	private final int anInt7478;

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Lclient!pi;Lclient!dk;III[B)V")
	public Class66_Sub3(@OriginalArg(0) Class42_Sub1_Sub2 arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static155.aClass114_6, arg4 * arg3 * arg2, false);
		this.anInt7482 = arg4;
		this.anInt7481 = arg2;
		this.anInt7478 = arg3;
		super.aClass42_Sub1_Sub2_9.method5868(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt8488, 0, this.method6976(), this.anInt7481, this.anInt7478, this.anInt7482, 0, Static37.method6278(super.aClass72_14), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
