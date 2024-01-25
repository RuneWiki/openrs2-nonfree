import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public final class Class40_Sub1 extends Class40 {

	@OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
	private final int anInt1005;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lclient!bl;II[BI)V")
	public Class40_Sub1(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt1005 = arg2;
		super.aClass28_Sub1_35.method654(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt6158, 0, super.anInt6159, this.anInt1005, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5148(true);
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(ZI)V")
	public void method938() {
		super.aClass28_Sub1_35.method654(this);
		OpenGL.glTexParameteri(super.anInt6158, 10242, 33071);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
	@Override
	public void method5143() {
	}
}
