import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public final class Class44_Sub4 extends Class44 {

	@OriginalMember(owner = "client!ph", name = "B", descriptor = "I")
	private final int anInt7899;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!kv;II[BI)V")
	public Class44_Sub4(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt7899 = arg2;
		super.aClass143_Sub2_32.method4945(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt7892, 0, super.anInt7885, this.anInt7899, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method6706(true);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
	@Override
	public void method6695() {
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZI)V")
	public void method6709() {
		super.aClass143_Sub2_32.method4945(this);
		OpenGL.glTexParameteri(super.anInt7892, 10242, 33071);
	}
}
