import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public final class Class52_Sub3 extends Class52 {

	@OriginalMember(owner = "client!og", name = "v", descriptor = "I")
	private final int anInt6702;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!ag;II[BI)V")
	public Class52_Sub3(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt6702 = arg2;
		super.aClass12_Sub1_31.method378(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt6859, 0, super.anInt6855, this.anInt6702, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5644(true);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
	@Override
	public void method5633() {
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(ZI)V")
	public void method5506() {
		super.aClass12_Sub1_31.method378(this);
		OpenGL.glTexParameteri(super.anInt6859, 10242, 33071);
	}
}
