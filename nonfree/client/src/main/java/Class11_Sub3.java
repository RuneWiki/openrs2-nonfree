import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public final class Class11_Sub3 extends Class11 {

	@OriginalMember(owner = "client!ut", name = "E", descriptor = "I")
	private final int anInt8792;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!ad;II[BI)V")
	public Class11_Sub3(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt8792 = arg2;
		super.aClass5_Sub1_43.method423(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt8884, 0, super.anInt8889, this.anInt8792, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method7303(true);
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(IZ)V")
	public void method7212() {
		super.aClass5_Sub1_43.method423(this);
		OpenGL.glTexParameteri(super.anInt8884, 10242, 33071);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V")
	@Override
	public void method7295() {
	}
}
