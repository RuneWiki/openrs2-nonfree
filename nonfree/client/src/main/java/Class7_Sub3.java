import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public final class Class7_Sub3 extends Class7 implements Interface7 {

	@OriginalMember(owner = "client!kha", name = "C", descriptor = "I")
	private final int anInt4862;

	@OriginalMember(owner = "client!kha", name = "A", descriptor = "I")
	private final int anInt4860;

	@OriginalMember(owner = "client!kha", name = "B", descriptor = "I")
	private final int anInt4861;

	@OriginalMember(owner = "client!kha", name = "<init>", descriptor = "(Lclient!nv;Lclient!pe;III[B)V")
	public Class7_Sub3(@OriginalArg(0) Class33_Sub2_Sub1 arg0, @OriginalArg(1) Class276 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static111.aClass79_7, arg4 * arg2 * arg3, false);
		this.anInt4862 = arg3;
		this.anInt4860 = arg4;
		this.anInt4861 = arg2;
		super.aClass33_Sub2_Sub1_12.method8159(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt10172, 0, this.method8616(), this.anInt4861, this.anInt4862, this.anInt4860, 0, Static36.method738(super.aClass276_19), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
