import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public final class Class55_Sub1 extends Class55 {

	@OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
	private final int anInt1491;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lclient!ef;II[BI)V")
	public Class55_Sub1(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt1491 = arg2;
		super.aClass49_Sub2_42.method1646(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt7037, 0, super.anInt7029, this.anInt1491, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5553(true);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZB)V")
	public void method1276() {
		super.aClass49_Sub2_42.method1646(this);
		OpenGL.glTexParameteri(super.anInt7037, 10242, 33071);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
	@Override
	public void method5551() {
	}
}
