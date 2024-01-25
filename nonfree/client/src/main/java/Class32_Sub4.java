import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public final class Class32_Sub4 extends Class32 {

	@OriginalMember(owner = "client!u", name = "G", descriptor = "I")
	private final int anInt9824;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!ffa;II[BI)V")
	public Class32_Sub4(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt9824 = arg2;
		super.aClass57_Sub2_36.method2362(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt9813, 0, super.anInt9805, this.anInt9824, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method8430(true);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZZ)V")
	public void method8440() {
		super.aClass57_Sub2_36.method2362(this);
		OpenGL.glTexParameteri(super.anInt9813, 10242, 33071);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
	@Override
	public void method8965() {
	}
}
