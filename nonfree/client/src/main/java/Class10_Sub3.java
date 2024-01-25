import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class10_Sub3 extends Class10 {

	@OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
	private int anInt5376 = -1;

	@OriginalMember(owner = "client!kk", name = "G", descriptor = "I")
	private int anInt5382 = -1;

	@OriginalMember(owner = "client!kk", name = "B", descriptor = "I")
	public final int anInt5379;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!bi;II)V")
	public Class10_Sub3(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt5379 = arg2;
		super.aClass13_Sub2_39.method1096(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt8428, arg2, arg2, 0, Static241.method4099(super.anInt8428), 5121, (byte[]) null, 0);
		}
		this.method7260(true);
	}

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!bi;IIZ[[I)V")
	public Class10_Sub3(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt5379 = arg2;
		super.aClass13_Sub2_39.method1096(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static32.method731(arg2, arg2, super.aClass13_Sub2_39.anInt1093, super.anInt8428, local30 + 34069, arg4[local30]);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt8428, arg2, arg2, 0, 32993, super.aClass13_Sub2_39.anInt1093, arg4[local30], 0);
			}
		}
		this.method7260(true);
	}

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!bi;IIZ[[BI)V")
	public Class10_Sub3(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt5379 = arg2;
		super.aClass13_Sub2_39.method1096(this);
		for (@Pc(26) int local26 = 0; local26 < 6; local26++) {
			OpenGL.glTexImage2Dub(local26 + 34069, 0, super.anInt8428, arg2, arg2, 0, arg5, 5121, arg4[local26], 0);
		}
		this.method7260(true);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
	@Override
	public void method7251() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt5376, this.anInt5382, 3553, 0, 0);
		this.anInt5376 = -1;
		this.anInt5382 = -1;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIB)V")
	public void method4714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, arg2, super.anInt8421, 0);
		this.anInt5376 = arg0;
		this.anInt5382 = arg1;
	}
}
