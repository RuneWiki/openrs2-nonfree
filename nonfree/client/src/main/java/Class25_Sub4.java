import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public final class Class25_Sub4 extends Class25 implements Interface11 {

	@OriginalMember(owner = "client!wha", name = "y", descriptor = "I")
	private final int anInt10596;

	@OriginalMember(owner = "client!wha", name = "w", descriptor = "I")
	private final int anInt10594;

	@OriginalMember(owner = "client!wha", name = "C", descriptor = "I")
	private final int anInt10600;

	@OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(Lclient!hl;Lclient!kt;III[B)V")
	public Class25_Sub4(@OriginalArg(0) Class5_Sub2_Sub2 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static302.aClass176_8, arg2 * arg3 * arg4, false);
		this.anInt10596 = arg3;
		this.anInt10594 = arg2;
		this.anInt10600 = arg4;
		super.aClass5_Sub2_Sub2_12.method4008(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt10584, 0, this.method8616(), this.anInt10594, this.anInt10596, this.anInt10600, 0, Static360.method5822(super.aClass178_15), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
