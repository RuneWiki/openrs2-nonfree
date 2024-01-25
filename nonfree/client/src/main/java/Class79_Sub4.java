import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class79_Sub4 extends Class79 {

	@OriginalMember(owner = "client!nm", name = "v", descriptor = "I")
	private int anInt6305 = -1;

	@OriginalMember(owner = "client!nm", name = "D", descriptor = "I")
	private int anInt6312 = -1;

	@OriginalMember(owner = "client!nm", name = "A", descriptor = "I")
	public final int anInt6309;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!gi;IIZ[[BI)V")
	public Class79_Sub4(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt6309 = arg2;
		super.aClass42_Sub3_23.method3219(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt6298, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method5278(true);
	}

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!gi;IIZ[[I)V")
	public Class79_Sub4(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt6309 = arg2;
		super.aClass42_Sub3_23.method3219(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static83.method1856(super.aClass42_Sub3_23.anInt3701, arg2, super.anInt6298, local30 + 34069, arg2, arg4[local30]);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt6298, arg2, arg2, 0, 32993, super.aClass42_Sub3_23.anInt3701, arg4[local30], 0);
			}
		}
		this.method5278(true);
	}

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!gi;II)V")
	public Class79_Sub4(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt6309 = arg2;
		super.aClass42_Sub3_23.method3219(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt6298, arg2, arg2, 0, Static439.method6675(super.anInt6298), 5121, null, 0);
		}
		this.method5278(true);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V")
	@Override
	public void method5270() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt6305, this.anInt6312, 3553, 0, 0);
		this.anInt6312 = -1;
		this.anInt6305 = -1;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIII)V")
	public void method5283(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, arg2, super.anInt6292, 0);
		this.anInt6305 = arg0;
		this.anInt6312 = arg1;
	}
}
