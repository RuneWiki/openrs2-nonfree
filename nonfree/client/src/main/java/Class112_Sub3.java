import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public final class Class112_Sub3 extends Class112 {

	@OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
	private final int anInt5037;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!vj;II[BI)V")
	public Class112_Sub3(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt5037 = arg2;
		super.aClass172_Sub2_29.method5630(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt5815, 0, super.anInt5821, this.anInt5037, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method4551(true);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
	@Override
	public void method4544() {
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZZ)V")
	public void method3861() {
		super.aClass172_Sub2_29.method5630(this);
		OpenGL.glTexParameteri(super.anInt5815, 10242, 33071);
	}
}
