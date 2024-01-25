import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public final class Class161_Sub2 extends Class161 {

	@OriginalMember(owner = "client!mca", name = "x", descriptor = "I")
	private final int anInt6293;

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(Lclient!pi;II[BI)V")
	public Class161_Sub2(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt6293 = arg2;
		super.aClass144_Sub3_42.method6982(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt10743, 0, super.anInt10745, this.anInt6293, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method9173(true);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IZ)V")
	public void method5550() {
		super.aClass144_Sub3_42.method6982(this);
		OpenGL.glTexParameteri(super.anInt10743, 10242, 33071);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)V")
	@Override
	public void method9166() {
	}
}
