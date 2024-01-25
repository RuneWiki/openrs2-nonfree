import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public final class Class85_Sub2 extends Class85 {

	@OriginalMember(owner = "client!lv", name = "u", descriptor = "I")
	private final int anInt5793;

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(Lclient!dia;II[BI)V")
	public Class85_Sub2(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt5793 = arg2;
		super.aClass13_Sub2_40.method2024(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt9006, 0, super.anInt9005, this.anInt5793, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method7875(true);
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V")
	@Override
	public void method7868() {
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(BZ)V")
	public void method5272() {
		super.aClass13_Sub2_40.method2024(this);
		OpenGL.glTexParameteri(super.anInt9006, 10242, 33071);
	}
}
