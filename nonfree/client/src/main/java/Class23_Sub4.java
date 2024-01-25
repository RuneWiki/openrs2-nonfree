import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public final class Class23_Sub4 extends Class23 {

	@OriginalMember(owner = "client!nm", name = "A", descriptor = "I")
	private final int anInt4777;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!ih;II[BI)V")
	public Class23_Sub4(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt4777 = arg2;
		super.aClass117_Sub1_42.method2504(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt7163, 0, super.anInt7166, this.anInt4777, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5805(true);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZB)V")
	public void method3772() {
		super.aClass117_Sub1_42.method2504(this);
		OpenGL.glTexParameteri(super.anInt7163, 10242, 33071);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V")
	@Override
	public void method5797() {
	}
}
