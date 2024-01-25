import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fca")
public final class Class24_Sub3 extends Class24 {

	@OriginalMember(owner = "client!fca", name = "u", descriptor = "I")
	private int anInt3019 = -1;

	@OriginalMember(owner = "client!fca", name = "w", descriptor = "I")
	private int anInt3021 = -1;

	@OriginalMember(owner = "client!fca", name = "x", descriptor = "I")
	public final int anInt3022;

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lclient!vj;II)V")
	public Class24_Sub3(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt3022 = arg2;
		super.aClass45_Sub3_16.method7475(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt3110, arg2, arg2, 0, Static430.method6073(super.anInt3110), 5121, null, 0);
		}
		this.method2802(true);
	}

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lclient!vj;IIZ[[I)V")
	public Class24_Sub3(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt3022 = arg2;
		super.aClass45_Sub3_16.method7475(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static297.method4422(arg4[local30], arg2, super.aClass45_Sub3_16.anInt9069, arg2, super.anInt3110, local30 + 34069);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt3110, arg2, arg2, 0, 32993, super.aClass45_Sub3_16.anInt9069, arg4[local30], 0);
			}
		}
		this.method2802(true);
	}

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lclient!vj;IIZ[[BI)V")
	public Class24_Sub3(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt3022 = arg2;
		super.aClass45_Sub3_16.method7475(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt3110, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method2802(true);
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)V")
	@Override
	public void method2792() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt3019, this.anInt3021, 3553, 0, 0);
		this.anInt3021 = -1;
		this.anInt3019 = -1;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIIII)V")
	public void method2715(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg2, arg1, super.anInt3107, 0);
		this.anInt3019 = arg0;
		this.anInt3021 = arg2;
	}
}
