import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public final class Class64_Sub3 extends Class64 {

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
	private final int anInt4302;

	static {
		new Class231("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
		new Class231("Use", "Benutzen", "Utiliser", "Usar");
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!na;II[BI)V")
	public Class64_Sub3(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt4302 = arg2;
		super.aClass75_Sub2_24.method3844(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt4388, 0, super.anInt4384, this.anInt4302, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method3523(true);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	@Override
	public void method5596() {
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(IZ)V")
	public void method3457() {
		super.aClass75_Sub2_24.method3844(this);
		OpenGL.glTexParameteri(super.anInt4388, 10242, 33071);
	}
}
