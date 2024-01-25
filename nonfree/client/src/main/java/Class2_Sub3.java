import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public final class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!pea", name = "u", descriptor = "I")
	private final int anInt7852;

	@OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Lclient!ac;II[BI)V")
	public Class2_Sub3(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt7852 = arg2;
		super.aClass5_Sub1_32.method352(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt8317, 0, super.anInt8326, this.anInt7852, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method6976(true);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(B)V")
	@Override
	public void method6971() {
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(IZ)V")
	public void method6626() {
		super.aClass5_Sub1_32.method352(this);
		OpenGL.glTexParameteri(super.anInt8317, 10242, 33071);
	}
}
