import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public final class Class116_Sub4 extends Class116 {

	@OriginalMember(owner = "client!v", name = "A", descriptor = "I")
	private final int anInt9743;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!pc;II[BI)V")
	public Class116_Sub4(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt9743 = arg2;
		super.aClass33_Sub3_36.method6340(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt9736, 0, super.anInt9737, this.anInt9743, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method8346(true);
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(ZI)V")
	public void method8350() {
		super.aClass33_Sub3_36.method6340(this);
		OpenGL.glTexParameteri(super.anInt9736, 10242, 33071);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
	@Override
	public void method8676() {
	}
}
