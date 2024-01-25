import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class88_Sub3 extends Class88 {

	@OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
	private int anInt6800 = -1;

	@OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
	private int anInt6799 = -1;

	@OriginalMember(owner = "client!ni", name = "A", descriptor = "I")
	public final int anInt6803;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!oea;IIZ[[BI)V")
	public Class88_Sub3(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt6803 = arg2;
		super.aClass87_Sub2_32.method6167(this);
		for (@Pc(26) int local26 = 0; local26 < 6; local26++) {
			OpenGL.glTexImage2Dub(local26 + 34069, 0, super.anInt8313, arg2, arg2, 0, arg5, 5121, arg4[local26], 0);
		}
		this.method6981(true);
	}

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!oea;II)V")
	public Class88_Sub3(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt6803 = arg2;
		super.aClass87_Sub2_32.method6167(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt8313, arg2, arg2, 0, Static471.method6784(super.anInt8313), 5121, null, 0);
		}
		this.method6981(true);
	}

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!oea;IIZ[[I)V")
	public Class88_Sub3(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt6803 = arg2;
		super.aClass87_Sub2_32.method6167(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static93.method1625(arg2, super.aClass87_Sub2_32.anInt7396, arg4[local30], local30 + 34069, arg2, super.anInt8313);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt8313, arg2, arg2, 0, 32993, super.aClass87_Sub2_32.anInt7396, arg4[local30], 0);
			}
		}
		this.method6981(true);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIII)V")
	public void method5718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg2, arg1, super.anInt8318, 0);
		this.anInt6800 = arg2;
		this.anInt6799 = arg0;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
	@Override
	public void method6980() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt6799, this.anInt6800, 3553, 0, 0);
		this.anInt6799 = -1;
		this.anInt6800 = -1;
	}
}
