import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public final class Class40_Sub1 extends Class40 {

	@OriginalMember(owner = "client!bu", name = "I", descriptor = "I")
	private final int anInt841;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lclient!ok;II[BI)V")
	public Class40_Sub1(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt841 = arg2;
		super.aClass134_Sub2_31.method5202(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt7362, 0, super.anInt7350, this.anInt841, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5874(true);
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(ZI)V")
	public void method742() {
		super.aClass134_Sub2_31.method5202(this);
		OpenGL.glTexParameteri(super.anInt7362, 10242, 33071);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V")
	@Override
	public void method5870() {
	}
}
