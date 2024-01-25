import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public final class Class88_Sub4 extends Class88 {

	@OriginalMember(owner = "client!rha", name = "x", descriptor = "I")
	private final int anInt8327;

	@OriginalMember(owner = "client!rha", name = "<init>", descriptor = "(Lclient!oea;II[BI)V")
	public Class88_Sub4(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt8327 = arg2;
		super.aClass87_Sub2_32.method6167(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt8317, 0, super.anInt8313, this.anInt8327, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method6981(true);
	}

	@OriginalMember(owner = "client!rha", name = "b", descriptor = "(IZ)V")
	public void method6990() {
		super.aClass87_Sub2_32.method6167(this);
		OpenGL.glTexParameteri(super.anInt8317, 10242, 33071);
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(I)V")
	@Override
	public void method6980() {
	}
}
