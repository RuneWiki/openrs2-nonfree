import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public final class Class50_Sub2 extends Class50 {

	@OriginalMember(owner = "client!fv", name = "v", descriptor = "I")
	private final int anInt3754;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lclient!lea;II[BI)V")
	public Class50_Sub2(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt3754 = arg2;
		super.aClass101_Sub2_41.method5690(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt10677, 0, super.anInt10669, this.anInt3754, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method9134(true);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ZB)V")
	public void method3490() {
		super.aClass101_Sub2_41.method5690(this);
		OpenGL.glTexParameteri(super.anInt10677, 10242, 33071);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V")
	@Override
	public void method9133() {
	}
}
