import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public final class Class61_Sub2 extends Class61 implements Interface12 {

	@OriginalMember(owner = "client!gi", name = "D", descriptor = "I")
	private final int anInt2860;

	@OriginalMember(owner = "client!gi", name = "I", descriptor = "I")
	private final int anInt2863;

	@OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
	private final int anInt2859;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!mc;Lclient!nl;III[B)V")
	public Class61_Sub2(@OriginalArg(0) Class121_Sub2_Sub1 arg0, @OriginalArg(1) Class214 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static108.aClass82_8, arg3 * arg2 * arg4, false);
		this.anInt2860 = arg2;
		this.anInt2863 = arg4;
		this.anInt2859 = arg3;
		super.aClass121_Sub2_Sub1_5.method7167(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt6559, 0, this.method5535(), this.anInt2860, this.anInt2859, this.anInt2863, 0, Static564.method7708(super.aClass214_12), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
