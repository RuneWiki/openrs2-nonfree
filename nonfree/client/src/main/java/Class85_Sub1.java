import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!efa")
public final class Class85_Sub1 extends Class85 {

	@OriginalMember(owner = "client!efa", name = "u", descriptor = "I")
	private int anInt2632 = -1;

	@OriginalMember(owner = "client!efa", name = "E", descriptor = "I")
	private int anInt2640 = -1;

	@OriginalMember(owner = "client!efa", name = "F", descriptor = "I")
	public final int anInt2641;

	@OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(Lclient!dia;II)V")
	public Class85_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt2641 = arg2;
		super.aClass13_Sub2_40.method2024(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt9005, arg2, arg2, 0, Static112.method5090(super.anInt9005), 5121, (byte[]) null, 0);
		}
		this.method7875(true);
	}

	@OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(Lclient!dia;IIZ[[I)V")
	public Class85_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt2641 = arg2;
		super.aClass13_Sub2_40.method2024(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static478.method6972(local30 + 34069, arg4[local30], arg2, arg2, super.aClass13_Sub2_40.anInt2171, super.anInt9005);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt9005, arg2, arg2, 0, 32993, super.aClass13_Sub2_40.anInt2171, arg4[local30], 0);
			}
		}
		this.method7875(true);
	}

	@OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(Lclient!dia;IIZ[[BI)V")
	public Class85_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt2641 = arg2;
		super.aClass13_Sub2_40.method2024(this);
		for (@Pc(26) int local26 = 0; local26 < 6; local26++) {
			OpenGL.glTexImage2Dub(local26 + 34069, 0, super.anInt9005, arg2, arg2, 0, arg5, 5121, arg4[local26], 0);
		}
		this.method7875(true);
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)V")
	@Override
	public void method7868() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt2640, this.anInt2632, 3553, 0, 0);
		this.anInt2640 = -1;
		this.anInt2632 = -1;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(IIIIB)V")
	public void method2421(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, arg2, super.anInt9016, 0);
		this.anInt2640 = arg1;
		this.anInt2632 = arg0;
	}
}
