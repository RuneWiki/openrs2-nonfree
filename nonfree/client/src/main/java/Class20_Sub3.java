import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class20_Sub3 extends Class20 {

	@OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
	private int anInt9211 = -1;

	@OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
	private int anInt9210 = -1;

	@OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
	public final int anInt9208;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lclient!nv;II)V")
	public Class20_Sub3(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt9208 = arg2;
		super.aClass16_Sub3_40.method6020(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt9338, arg2, arg2, 0, Static607.method6373(super.anInt9338), 5121, null, 0);
		}
		this.method7620(true);
	}

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lclient!nv;IIZ[[I)V")
	public Class20_Sub3(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt9208 = arg2;
		super.aClass16_Sub3_40.method6020(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static503.method8089(arg2, super.anInt9338, arg2, local30 + 34069, super.aClass16_Sub3_40.anInt7376, arg4[local30]);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt9338, arg2, arg2, 0, 32993, super.aClass16_Sub3_40.anInt7376, arg4[local30], 0);
			}
		}
		this.method7620(true);
	}

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lclient!nv;IIZ[[BI)V")
	public Class20_Sub3(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt9208 = arg2;
		super.aClass16_Sub3_40.method6020(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt9338, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method7620(true);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	@Override
	public void method7611() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt9211, this.anInt9210, 3553, 0, 0);
		this.anInt9210 = -1;
		this.anInt9211 = -1;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIII)V")
	public void method7530(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, arg2, super.anInt9335, 0);
		this.anInt9210 = arg1;
		this.anInt9211 = arg0;
	}
}
