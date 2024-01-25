import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public final class Class125_Sub4 extends Class125 {

	@OriginalMember(owner = "client!st", name = "t", descriptor = "I")
	private final int anInt9162;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lclient!aq;II[BI)V")
	public Class125_Sub4(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt9162 = arg2;
		super.aClass22_Sub1_41.method955(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt10843, 0, super.anInt10853, this.anInt9162, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method9217(true);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I)V")
	@Override
	public void method9208() {
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(BZ)V")
	public void method7761() {
		super.aClass22_Sub1_41.method955(this);
		OpenGL.glTexParameteri(super.anInt10843, 10242, 33071);
	}
}
