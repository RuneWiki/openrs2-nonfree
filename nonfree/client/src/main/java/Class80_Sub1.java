import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public final class Class80_Sub1 extends Class80 {

	@OriginalMember(owner = "client!dfa", name = "u", descriptor = "I")
	private final int anInt2246;

	@OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(Lclient!ck;II[BI)V")
	public Class80_Sub1(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt2246 = arg2;
		super.aClass65_Sub1_32.method1286(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt8338, 0, super.anInt8332, this.anInt2246, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method7142(true);
	}

	@OriginalMember(owner = "client!dfa", name = "c", descriptor = "(IZ)V")
	public void method2028() {
		super.aClass65_Sub1_32.method1286(this);
		OpenGL.glTexParameteri(super.anInt8338, 10242, 33071);
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(B)V")
	@Override
	public void method7433() {
	}
}
