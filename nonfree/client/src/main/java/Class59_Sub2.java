import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public final class Class59_Sub2 extends Class59 implements Interface5 {

	@OriginalMember(owner = "client!fea", name = "D", descriptor = "I")
	private final int anInt2724;

	@OriginalMember(owner = "client!fea", name = "G", descriptor = "I")
	private final int anInt2726;

	@OriginalMember(owner = "client!fea", name = "C", descriptor = "I")
	private final int anInt2723;

	@OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(Lclient!sb;Lclient!kea;III[B)V")
	public Class59_Sub2(@OriginalArg(0) Class95_Sub3_Sub2 arg0, @OriginalArg(1) Class188 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static290.aClass189_11, arg4 * arg2 * arg3, false);
		this.anInt2724 = arg4;
		this.anInt2726 = arg3;
		this.anInt2723 = arg2;
		super.aClass95_Sub3_Sub2_8.method7112(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt5594, 0, this.method4765(), this.anInt2723, this.anInt2726, this.anInt2724, 0, Static269.method3772(super.aClass188_10), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
