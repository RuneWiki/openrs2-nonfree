import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public final class Class24_Sub1 extends Class24 {

	@OriginalMember(owner = "client!b", name = "z", descriptor = "I")
	private final int anInt573;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!rda;II[BI)V")
	public Class24_Sub1(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt573 = arg2;
		super.aClass126_Sub3_30.method7113(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt7702, 0, super.anInt7714, this.anInt573, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method6783(true);
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(IZ)V")
	public void method574() {
		super.aClass126_Sub3_30.method7113(this);
		OpenGL.glTexParameteri(super.anInt7702, 10242, 33071);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
	@Override
	public void method6776() {
	}
}
