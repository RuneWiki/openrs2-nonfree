import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eja")
public final class Class94_Sub1 extends Class94 {

	@OriginalMember(owner = "client!eja", name = "y", descriptor = "I")
	private final int anInt2808;

	@OriginalMember(owner = "client!eja", name = "<init>", descriptor = "(Lclient!dw;II[BI)V")
	public Class94_Sub1(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt2808 = arg2;
		super.aClass82_Sub1_25.method2029(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt4672, 0, super.anInt4680, this.anInt2808, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method4012(true);
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(ZB)V")
	public void method2345() {
		super.aClass82_Sub1_25.method2029(this);
		OpenGL.glTexParameteri(super.anInt4672, 10242, 33071);
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(I)V")
	@Override
	public void method4004() {
	}
}
