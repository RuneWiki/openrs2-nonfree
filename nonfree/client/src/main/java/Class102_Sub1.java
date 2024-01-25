import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public final class Class102_Sub1 extends Class102 implements Interface17 {

	@OriginalMember(owner = "client!fr", name = "y", descriptor = "I")
	private final int anInt3035;

	@OriginalMember(owner = "client!fr", name = "w", descriptor = "I")
	private final int anInt3033;

	@OriginalMember(owner = "client!fr", name = "x", descriptor = "I")
	private final int anInt3034;

	static {
		new Class40("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lclient!lh;Lclient!kl;III[B)V")
	public Class102_Sub1(@OriginalArg(0) Class62_Sub1_Sub2 arg0, @OriginalArg(1) Class174 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static523.aClass306_15, arg4 * arg3 * arg2, false);
		this.anInt3035 = arg2;
		this.anInt3033 = arg3;
		this.anInt3034 = arg4;
		super.aClass62_Sub1_Sub2_10.method4676(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt9162, 0, this.method7444(), this.anInt3035, this.anInt3033, this.anInt3034, 0, Static546.method7437(super.aClass174_17), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
