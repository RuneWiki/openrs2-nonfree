import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public final class Class51_Sub1_Sub1 extends Class51_Sub1 {

	@OriginalMember(owner = "client!hq", name = "P", descriptor = "Z")
	public final boolean aBoolean278;

	@OriginalMember(owner = "client!hq", name = "U", descriptor = "I")
	public final int anInt4055;

	@OriginalMember(owner = "client!hq", name = "N", descriptor = "F")
	public final float aFloat79;

	@OriginalMember(owner = "client!hq", name = "T", descriptor = "F")
	public final float aFloat80;

	@OriginalMember(owner = "client!hq", name = "S", descriptor = "I")
	public final int anInt4054;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!jaa;IIIIIIZ)V")
	public Class51_Sub1_Sub1(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aBoolean278 = false;
		this.anInt4055 = arg4;
		this.aFloat79 = (float) arg4 / (float) arg6;
		this.aFloat80 = (float) arg3 / (float) arg5;
		this.anInt4054 = arg3;
		this.method3535(false, false);
	}

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!jaa;IIIZ[I)V")
	public Class51_Sub1_Sub1(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt4054 = arg2;
		this.anInt4055 = arg3;
		if (super.anInt9463 == 34037) {
			this.aFloat79 = arg3;
			this.aBoolean278 = false;
			this.aFloat80 = arg2;
		} else {
			this.aFloat80 = this.aFloat79 = 1.0F;
			this.aBoolean278 = true;
		}
	}

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!jaa;IIIIIZ)V")
	public Class51_Sub1_Sub1(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt4054 = arg4;
		if (super.anInt9463 == 34037) {
			this.aFloat80 = arg4;
			this.aFloat79 = arg5;
			this.aBoolean278 = false;
		} else {
			this.aBoolean278 = true;
			this.aFloat80 = this.aFloat79 = 1.0F;
		}
		this.anInt4055 = arg5;
	}

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!jaa;IIII)V")
	public Class51_Sub1_Sub1(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt4054 = arg3;
		if (super.anInt9463 == 34037) {
			this.aFloat79 = arg4;
			this.aFloat80 = arg3;
			this.aBoolean278 = false;
		} else {
			this.aFloat80 = this.aFloat79 = 1.0F;
			this.aBoolean278 = true;
		}
		this.anInt4055 = arg4;
	}

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!jaa;IIII[I)V")
	public Class51_Sub1_Sub1(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt4054 = arg1;
		this.anInt4055 = arg2;
		this.method3541(arg2, arg1, arg5);
		this.aFloat79 = (float) arg2 / (float) arg4;
		this.aFloat80 = (float) arg1 / (float) arg3;
		this.aBoolean278 = false;
		this.method3535(false, false);
	}

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!jaa;IIIII)V")
	public Class51_Sub1_Sub1(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.aFloat79 = (float) arg3 / (float) arg5;
		this.anInt4054 = arg2;
		this.anInt4055 = arg3;
		this.aBoolean278 = false;
		this.aFloat80 = (float) arg2 / (float) arg4;
		this.method3535(false, false);
	}

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!jaa;IIIII[BI)V")
	public Class51_Sub1_Sub1(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt4054 = arg2;
		this.anInt4055 = arg3;
		this.method3542(arg2, arg7, true, arg6, arg3);
		this.aFloat80 = (float) arg2 / (float) arg4;
		this.aBoolean278 = false;
		this.aFloat79 = (float) arg3 / (float) arg5;
		this.method3535(false, false);
	}

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!jaa;IIIIZ[BI)V")
	public Class51_Sub1_Sub1(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt4055 = arg4;
		if (super.anInt9463 == 34037) {
			this.aFloat80 = arg3;
			this.aFloat79 = arg4;
			this.aBoolean278 = false;
		} else {
			this.aFloat80 = this.aFloat79 = 1.0F;
			this.aBoolean278 = true;
		}
		this.anInt4054 = arg3;
	}
}
