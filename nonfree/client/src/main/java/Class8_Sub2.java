import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public final class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
	private final int anInt2566;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!ih;II[BI)V")
	public Class8_Sub2(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt2566 = arg2;
		super.aClass106_Sub2_25.method2912(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt3947, 0, super.anInt3950, this.anInt2566, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method3073(true);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
	@Override
	public void method3067() {
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZ)V")
	public void method1870() {
		super.aClass106_Sub2_25.method2912(this);
		OpenGL.glTexParameteri(super.anInt3947, 10242, 33071);
	}
}
