import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public final class Class161_Sub1_Sub1 extends Class161_Sub1 {

	@OriginalMember(owner = "client!hr", name = "O", descriptor = "Z")
	public final boolean aBoolean348;

	@OriginalMember(owner = "client!hr", name = "L", descriptor = "F")
	public final float aFloat72;

	@OriginalMember(owner = "client!hr", name = "Q", descriptor = "F")
	public final float aFloat71;

	@OriginalMember(owner = "client!hr", name = "S", descriptor = "I")
	public final int anInt4556;

	@OriginalMember(owner = "client!hr", name = "K", descriptor = "I")
	public final int anInt4558;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!pi;IIII)V")
	public Class161_Sub1_Sub1(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		if (super.anInt10743 == 34037) {
			this.aBoolean348 = false;
			this.aFloat72 = (float) arg4;
			this.aFloat71 = (float) arg3;
		} else {
			this.aBoolean348 = true;
			this.aFloat71 = this.aFloat72 = 1.0F;
		}
		this.anInt4556 = arg3;
		this.anInt4558 = arg4;
	}

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!pi;IIIZ[III)V")
	public Class161_Sub1_Sub1(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt10743 == 34037) {
			this.aFloat72 = (float) arg3;
			this.aFloat71 = (float) arg2;
			this.aBoolean348 = false;
		} else {
			this.aBoolean348 = true;
			this.aFloat71 = this.aFloat72 = 1.0F;
		}
		this.anInt4558 = arg3;
		this.anInt4556 = arg2;
	}

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!pi;IIIIZ[BI)V")
	public Class161_Sub1_Sub1(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt4558 = arg4;
		this.anInt4556 = arg3;
		if (super.anInt10743 == 34037) {
			this.aFloat72 = (float) arg4;
			this.aBoolean348 = false;
			this.aFloat71 = (float) arg3;
		} else {
			this.aBoolean348 = true;
			this.aFloat71 = this.aFloat72 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!pi;IIII[I)V")
	public Class161_Sub1_Sub1(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt4556 = arg1;
		this.anInt4558 = arg2;
		this.method3968(arg1, 0, arg5, 0, 0, arg2);
		this.aBoolean348 = false;
		this.aFloat71 = (float) arg1 / (float) arg3;
		this.aFloat72 = (float) arg2 / (float) arg4;
		this.method3971(false, false);
	}

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!pi;IIIII)V")
	public Class161_Sub1_Sub1(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.aFloat72 = (float) arg3 / (float) arg5;
		this.aBoolean348 = false;
		this.aFloat71 = (float) arg2 / (float) arg4;
		this.anInt4556 = arg2;
		this.anInt4558 = arg3;
		this.method3971(false, false);
	}

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!pi;IIIIIIZ)V")
	public Class161_Sub1_Sub1(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat72 = (float) arg4 / (float) arg6;
		this.anInt4558 = arg4;
		this.anInt4556 = arg3;
		this.aFloat71 = (float) arg3 / (float) arg5;
		this.aBoolean348 = false;
		this.method3971(false, false);
	}

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!pi;IIIII[BI)V")
	public Class161_Sub1_Sub1(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt4558 = arg3;
		this.anInt4556 = arg2;
		this.method3972(arg3, arg6, arg7, true, arg2);
		this.aFloat71 = (float) arg2 / (float) arg4;
		this.aBoolean348 = false;
		this.aFloat72 = (float) arg3 / (float) arg5;
		this.method3971(false, false);
	}

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!pi;IIIIIZ)V")
	public Class161_Sub1_Sub1(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (super.anInt10743 == 34037) {
			this.aFloat72 = (float) arg5;
			this.aBoolean348 = false;
			this.aFloat71 = (float) arg4;
		} else {
			this.aFloat71 = this.aFloat72 = 1.0F;
			this.aBoolean348 = true;
		}
		this.anInt4558 = arg5;
		this.anInt4556 = arg4;
	}
}
