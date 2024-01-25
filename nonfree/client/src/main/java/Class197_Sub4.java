import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public final class Class197_Sub4 extends Class197 implements Interface1 {

	@OriginalMember(owner = "client!wl", name = "E", descriptor = "I")
	private final int anInt10388;

	@OriginalMember(owner = "client!wl", name = "A", descriptor = "I")
	private final int anInt10386;

	@OriginalMember(owner = "client!wl", name = "B", descriptor = "I")
	private final int anInt10387;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!tk;Lclient!et;III[B)V")
	public Class197_Sub4(@OriginalArg(0) Class13_Sub3_Sub1 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static638.aClass381_15, arg2 * arg3 * arg4, false);
		this.anInt10388 = arg3;
		this.anInt10386 = arg2;
		this.anInt10387 = arg4;
		super.aClass13_Sub3_Sub1_12.method8234(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt10370, 0, this.method8826(), this.anInt10386, this.anInt10388, this.anInt10387, 0, Static626.method8676(super.aClass104_19), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
