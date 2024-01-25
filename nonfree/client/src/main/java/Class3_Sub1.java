import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ab", name = "C", descriptor = "I")
	private final int anInt54;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!wh;II[BI)V")
	public Class3_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt54 = arg2;
		super.aClass100_Sub3_34.method8925(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt6738, 0, super.anInt6737, this.anInt54, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5781(true);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BZ)V")
	public void method52() {
		super.aClass100_Sub3_34.method8925(this);
		OpenGL.glTexParameteri(super.anInt6738, 10242, 33071);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	@Override
	public void method5769() {
	}
}
