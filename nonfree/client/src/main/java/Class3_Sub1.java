import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!aaa", name = "z", descriptor = "I")
	private final int anInt45;

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lclient!kfa;II[BI)V")
	public Class3_Sub1(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt45 = arg2;
		super.aClass7_Sub2_19.method4313(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt3442, 0, super.anInt3443, this.anInt45, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method2739(true);
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V")
	@Override
	public void method4191() {
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BZ)V")
	public void method34() {
		super.aClass7_Sub2_19.method4313(this);
		OpenGL.glTexParameteri(super.anInt3442, 10242, 33071);
	}
}
