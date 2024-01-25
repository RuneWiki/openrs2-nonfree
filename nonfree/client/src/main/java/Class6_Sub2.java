import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public final class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!ar", name = "C", descriptor = "I")
	private final int anInt258;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!fd;II[BI)V")
	public Class6_Sub2(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt258 = arg2;
		super.aClass19_Sub2_31.method1905(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt5441, 0, super.anInt5443, this.anInt258, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method4181(true);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(BZ)V")
	public void method199() {
		super.aClass19_Sub2_31.method1905(this);
		OpenGL.glTexParameteri(super.anInt5441, 10242, 33071);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
	@Override
	public void method4178() {
	}
}
