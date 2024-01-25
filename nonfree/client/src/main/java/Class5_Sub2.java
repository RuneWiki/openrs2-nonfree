import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public final class Class5_Sub2 extends Class5 implements Interface23 {

	@OriginalMember(owner = "client!ifa", name = "y", descriptor = "I")
	private final int anInt4539;

	@OriginalMember(owner = "client!ifa", name = "x", descriptor = "I")
	private final int anInt4538;

	@OriginalMember(owner = "client!ifa", name = "z", descriptor = "I")
	private final int anInt4540;

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Lclient!ad;Lclient!jb;III[B)V")
	public Class5_Sub2(@OriginalArg(0) Class7_Sub1_Sub1 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static424.aClass273_12, arg4 * arg3 * arg2, false);
		this.anInt4539 = arg2;
		this.anInt4538 = arg4;
		this.anInt4540 = arg3;
		super.aClass7_Sub1_Sub1_11.method5694(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt9565, 0, this.method7363(), this.anInt4539, this.anInt4540, this.anInt4538, 0, Static546.method7654(super.aClass161_18), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
