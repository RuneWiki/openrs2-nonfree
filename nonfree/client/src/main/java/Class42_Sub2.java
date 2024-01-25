import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public final class Class42_Sub2 extends Class42 {

	@OriginalMember(owner = "client!jq", name = "z", descriptor = "I")
	private final int anInt3936;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lclient!gk;II[BI)V")
	public Class42_Sub2(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt3936 = arg2;
		super.aClass75_Sub2_37.method2456(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt6241, 0, super.anInt6239, this.anInt3936, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method4910(true);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IZ)V")
	public void method3244() {
		super.aClass75_Sub2_37.method2456(this);
		OpenGL.glTexParameteri(super.anInt6241, 10242, 33071);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
	@Override
	public void method4908() {
	}
}
