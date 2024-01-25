import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public final class Class53_Sub1 extends Class53 {

	@OriginalMember(owner = "client!cia", name = "y", descriptor = "I")
	private final int anInt1468;

	@OriginalMember(owner = "client!cia", name = "<init>", descriptor = "(Lclient!pq;II[BI)V")
	public Class53_Sub1(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt1468 = arg2;
		super.aClass132_Sub3_40.method6759(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt9817, 0, super.anInt9821, this.anInt1468, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method8287(true);
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(I)V")
	@Override
	public void method8284() {
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(ZI)V")
	public void method1343() {
		super.aClass132_Sub3_40.method6759(this);
		OpenGL.glTexParameteri(super.anInt9817, 10242, 33071);
	}
}
