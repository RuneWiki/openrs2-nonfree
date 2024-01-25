import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public final class Class28_Sub1 extends Class28 implements Interface18 {

	@OriginalMember(owner = "client!b", name = "B", descriptor = "I")
	private final int anInt412;

	@OriginalMember(owner = "client!b", name = "C", descriptor = "I")
	private final int anInt410;

	@OriginalMember(owner = "client!b", name = "F", descriptor = "I")
	private final int anInt411;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!md;Lclient!o;III[B)V")
	public Class28_Sub1(@OriginalArg(0) Class144_Sub1_Sub2 arg0, @OriginalArg(1) Class260 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static18.aClass19_4, arg3 * arg2 * arg4, false);
		this.anInt412 = arg4;
		this.anInt410 = arg3;
		this.anInt411 = arg2;
		super.aClass144_Sub1_Sub2_12.method5643(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt11032, 0, this.method9353(), this.anInt411, this.anInt410, this.anInt412, 0, Static40.method669(super.aClass260_15), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
