import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public final class Class24_Sub4 extends Class24 {

	@OriginalMember(owner = "client!ffa", name = "E", descriptor = "I")
	private final int anInt3119;

	@OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(Lclient!vj;II[BI)V")
	public Class24_Sub4(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt3119 = arg2;
		super.aClass45_Sub3_16.method7475(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt3100, 0, super.anInt3110, this.anInt3119, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method2802(true);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)V")
	@Override
	public void method2792() {
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IZ)V")
	public void method2807() {
		super.aClass45_Sub3_16.method7475(this);
		OpenGL.glTexParameteri(super.anInt3100, 10242, 33071);
	}
}
