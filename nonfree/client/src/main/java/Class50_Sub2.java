import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public final class Class50_Sub2 extends Class50 {

	@OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
	private final int anInt1828;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lclient!er;II[BI)V")
	public Class50_Sub2(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt1828 = arg2;
		super.aClass31_Sub2_37.method2535(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt7830, 0, super.anInt7828, this.anInt1828, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method6153(true);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
	@Override
	public void method6150() {
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZB)V")
	public void method1640() {
		super.aClass31_Sub2_37.method2535(this);
		OpenGL.glTexParameteri(super.anInt7830, 10242, 33071);
	}
}
