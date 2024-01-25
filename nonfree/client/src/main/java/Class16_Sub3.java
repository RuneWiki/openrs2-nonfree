import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public final class Class16_Sub3 extends Class16 {

	@OriginalMember(owner = "client!vi", name = "B", descriptor = "I")
	private final int anInt9632;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!en;II[BI)V")
	public Class16_Sub3(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt9632 = arg2;
		super.aClass90_Sub1_43.method2126(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt9862, 0, super.anInt9852, this.anInt9632, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method7843(true);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BZ)V")
	public void method7702() {
		super.aClass90_Sub1_43.method2126(this);
		OpenGL.glTexParameteri(super.anInt9862, 10242, 33071);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
	@Override
	public void method7838() {
	}
}
