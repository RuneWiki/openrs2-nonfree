import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public final class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!av", name = "u", descriptor = "I")
	private final int anInt393;

	static {
		new Class151("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
	}

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lclient!od;II[BI)V")
	public Class5_Sub2(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt393 = arg2;
		super.aClass128_Sub2_43.method3691(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt7321, 0, super.anInt7332, this.anInt393, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5540(true);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V")
	@Override
	public void method5532() {
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(IZ)V")
	public void method333() {
		super.aClass128_Sub2_43.method3691(this);
		OpenGL.glTexParameteri(super.anInt7321, 10242, 33071);
	}
}
