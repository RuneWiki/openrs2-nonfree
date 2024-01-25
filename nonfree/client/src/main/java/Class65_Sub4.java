import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public final class Class65_Sub4 extends Class65 {

	@OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
	private final int anInt5989;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!ug;II[BI)V")
	public Class65_Sub4(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt5989 = arg2;
		super.aClass135_Sub2_32.method5458(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt5976, 0, super.anInt5981, this.anInt5989, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method4771(true);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZB)V")
	public void method4774() {
		super.aClass135_Sub2_32.method5458(this);
		OpenGL.glTexParameteri(super.anInt5976, 10242, 33071);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
	@Override
	public void method4759() {
	}
}
