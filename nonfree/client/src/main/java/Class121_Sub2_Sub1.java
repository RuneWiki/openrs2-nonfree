import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public final class Class121_Sub2_Sub1 extends Class121_Sub2 {

	@OriginalMember(owner = "client!mba", name = "W", descriptor = "F")
	public final float aFloat187;

	@OriginalMember(owner = "client!mba", name = "Y", descriptor = "I")
	public final int anInt6665;

	@OriginalMember(owner = "client!mba", name = "T", descriptor = "F")
	public final float aFloat185;

	@OriginalMember(owner = "client!mba", name = "R", descriptor = "Z")
	public final boolean aBoolean567;

	@OriginalMember(owner = "client!mba", name = "O", descriptor = "I")
	public final int anInt6660;

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lclient!eq;IIIII)V")
	public Class121_Sub2_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.aFloat187 = (float) arg3 / (float) arg5;
		this.anInt6665 = arg2;
		this.aFloat185 = (float) arg2 / (float) arg4;
		this.aBoolean567 = false;
		this.anInt6660 = arg3;
		this.method5567(false, false);
	}

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lclient!eq;IIIII[BI)V")
	public Class121_Sub2_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt6665 = arg2;
		this.anInt6660 = arg3;
		this.method5566(arg2, arg3, true, arg6, arg7);
		this.aBoolean567 = false;
		this.aFloat187 = (float) arg3 / (float) arg5;
		this.aFloat185 = (float) arg2 / (float) arg4;
		this.method5567(false, false);
	}

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lclient!eq;IIIIZ[BI)V")
	public Class121_Sub2_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt6660 = arg4;
		if (super.anInt8871 == 34037) {
			this.aFloat185 = arg3;
			this.aBoolean567 = false;
			this.aFloat187 = arg4;
		} else {
			this.aFloat185 = this.aFloat187 = 1.0F;
			this.aBoolean567 = true;
		}
		this.anInt6665 = arg3;
	}

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lclient!eq;IIIZ[III)V")
	public Class121_Sub2_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt6665 = arg2;
		if (super.anInt8871 == 34037) {
			this.aBoolean567 = false;
			this.aFloat187 = arg3;
			this.aFloat185 = arg2;
		} else {
			this.aBoolean567 = true;
			this.aFloat185 = this.aFloat187 = 1.0F;
		}
		this.anInt6660 = arg3;
	}

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lclient!eq;IIIIIIZ)V")
	public Class121_Sub2_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aBoolean567 = false;
		this.anInt6660 = arg4;
		this.anInt6665 = arg3;
		this.aFloat187 = (float) arg4 / (float) arg6;
		this.aFloat185 = (float) arg3 / (float) arg5;
		this.method5567(false, false);
	}

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lclient!eq;IIIIIZ)V")
	public Class121_Sub2_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (super.anInt8871 == 34037) {
			this.aFloat187 = arg5;
			this.aFloat185 = arg4;
			this.aBoolean567 = false;
		} else {
			this.aBoolean567 = true;
			this.aFloat185 = this.aFloat187 = 1.0F;
		}
		this.anInt6660 = arg5;
		this.anInt6665 = arg4;
	}

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lclient!eq;IIII[I)V")
	public Class121_Sub2_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt6660 = arg2;
		this.anInt6665 = arg1;
		this.method5559(0, arg5, 0, arg2, arg1, 0);
		this.aBoolean567 = false;
		this.aFloat185 = (float) arg1 / (float) arg3;
		this.aFloat187 = (float) arg2 / (float) arg4;
		this.method5567(false, false);
	}

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lclient!eq;IIII)V")
	public Class121_Sub2_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		if (super.anInt8871 == 34037) {
			this.aFloat187 = arg4;
			this.aBoolean567 = false;
			this.aFloat185 = arg3;
		} else {
			this.aFloat185 = this.aFloat187 = 1.0F;
			this.aBoolean567 = true;
		}
		this.anInt6665 = arg3;
		this.anInt6660 = arg4;
	}
}
