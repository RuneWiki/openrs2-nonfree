import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public final class Class39_Sub2 extends Class39 {

	@OriginalMember(owner = "client!dha", name = "x", descriptor = "I")
	private final int anInt2224;

	@OriginalMember(owner = "client!dha", name = "<init>", descriptor = "(Lclient!hk;II[BI)V")
	public Class39_Sub2(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt2224 = arg2;
		super.aClass16_Sub2_39.method3620(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt9936, 0, super.anInt9934, this.anInt2224, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method8465(true);
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(ZZ)V")
	public void method2056() {
		super.aClass16_Sub2_39.method3620(this);
		OpenGL.glTexParameteri(super.anInt9936, 10242, 33071);
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(I)V")
	@Override
	public void method8457() {
	}
}
