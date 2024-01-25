import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public final class Class132_Sub3 extends Class132 {

	@OriginalMember(owner = "client!mk", name = "B", descriptor = "I")
	private final int anInt6142;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!ap;II[BI)V")
	public Class132_Sub3(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt6142 = arg2;
		super.aClass9_Sub2_24.method814(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt6650, 0, super.anInt6656, this.anInt6142, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5614(true);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
	@Override
	public void method6643() {
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZI)V")
	public void method5241() {
		super.aClass9_Sub2_24.method814(this);
		OpenGL.glTexParameteri(super.anInt6650, 10242, 33071);
	}
}
