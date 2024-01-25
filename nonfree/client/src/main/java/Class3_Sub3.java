import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!gl", name = "u", descriptor = "I")
	private int anInt2606 = -1;

	@OriginalMember(owner = "client!gl", name = "z", descriptor = "I")
	private int anInt2608 = -1;

	@OriginalMember(owner = "client!gl", name = "C", descriptor = "I")
	public final int anInt2610;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!kd;II)V")
	public Class3_Sub3(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt2610 = arg2;
		super.aClass39_Sub2_29.method3203(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt4993, arg2, arg2, 0, Static105.method1877(super.anInt4993), 5121, null, 0);
		}
		this.method4146(true);
	}

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!kd;IIZ[[BI)V")
	public Class3_Sub3(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt2610 = arg2;
		super.aClass39_Sub2_29.method3203(this);
		for (@Pc(26) int local26 = 0; local26 < 6; local26++) {
			OpenGL.glTexImage2Dub(local26 + 34069, 0, super.anInt4993, arg2, arg2, 0, arg5, 5121, arg4[local26], 0);
		}
		this.method4146(true);
	}

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!kd;IIZ[[I)V")
	public Class3_Sub3(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt2610 = arg2;
		super.aClass39_Sub2_29.method3203(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static458.method6014(arg4[local30], super.aClass39_Sub2_29.anInt3791, arg2, local30 + 34069, arg2, super.anInt4993);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt4993, arg2, arg2, 0, 32993, super.aClass39_Sub2_29.anInt3791, arg4[local30], 0);
			}
		}
		this.method4146(true);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
	@Override
	public void method4145() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt2606, this.anInt2608, 3553, 0, 0);
		this.anInt2606 = -1;
		this.anInt2608 = -1;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZIIII)V")
	public void method2272(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, arg2, super.anInt4986, 0);
		this.anInt2606 = arg0;
		this.anInt2608 = arg1;
	}
}
