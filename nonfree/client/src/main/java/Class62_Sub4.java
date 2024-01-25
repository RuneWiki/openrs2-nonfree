import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public final class Class62_Sub4 extends Class62 {

	@OriginalMember(owner = "client!sk", name = "C", descriptor = "I")
	private final int anInt6652;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!bt;II[BI)V")
	public Class62_Sub4(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt6652 = arg2;
		super.aClass30_Sub1_40.method730(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt6644, 0, super.anInt6634, this.anInt6652, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5349(true);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZ)V")
	public void method5359() {
		super.aClass30_Sub1_40.method730(this);
		OpenGL.glTexParameteri(super.anInt6644, 10242, 33071);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V")
	@Override
	public void method5348() {
	}
}
