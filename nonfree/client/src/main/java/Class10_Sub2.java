import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public final class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!gt", name = "y", descriptor = "I")
	private final int anInt2477;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lclient!ur;II[BI)V")
	public Class10_Sub2(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt2477 = arg2;
		super.aClass34_Sub2_43.method5493(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt7522, 0, super.anInt7515, this.anInt2477, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5928(true);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IZ)V")
	public void method2132() {
		super.aClass34_Sub2_43.method5493(this);
		OpenGL.glTexParameteri(super.anInt7522, 10242, 33071);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)V")
	@Override
	public void method5925() {
	}
}
