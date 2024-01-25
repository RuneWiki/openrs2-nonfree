import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public final class Class164_Sub4 extends Class164 {

	@OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
	private final int anInt7824;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!mh;II[BI)V")
	public Class164_Sub4(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt7824 = arg2;
		super.aClass4_Sub3_43.method5250(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt9448, 0, super.anInt9461, this.anInt7824, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method8154(true);
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(BZ)V")
	public void method6921() {
		super.aClass4_Sub3_43.method5250(this);
		OpenGL.glTexParameteri(super.anInt9448, 10242, 33071);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
	@Override
	public void method8143() {
	}
}
