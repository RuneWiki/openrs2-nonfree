import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public final class Class13_Sub3 extends Class13 {

	@OriginalMember(owner = "client!hu", name = "G", descriptor = "I")
	private final int anInt3048;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lclient!ht;II[BI)V")
	public Class13_Sub3(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt3048 = arg2;
		super.aClass109_Sub1_22.method2578(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt3207, 0, super.anInt3197, this.anInt3048, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method2745(true);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IZ)V")
	public void method2620() {
		super.aClass109_Sub1_22.method2578(this);
		OpenGL.glTexParameteri(super.anInt3207, 10242, 33071);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)V")
	@Override
	public void method4467() {
	}
}
