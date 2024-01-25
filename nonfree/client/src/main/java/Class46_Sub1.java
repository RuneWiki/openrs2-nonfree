import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public final class Class46_Sub1 extends Class46 {

	@OriginalMember(owner = "client!cp", name = "A", descriptor = "I")
	private final int anInt1341;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lclient!lj;II[BI)V")
	public Class46_Sub1(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt1341 = arg2;
		super.aClass78_Sub3_26.method4535(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt6350, 0, super.anInt6354, this.anInt1341, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5134(true);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)V")
	@Override
	public void method7511() {
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(IZ)V")
	public void method1164() {
		super.aClass78_Sub3_26.method4535(this);
		OpenGL.glTexParameteri(super.anInt6350, 10242, 33071);
	}
}
