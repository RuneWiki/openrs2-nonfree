import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public final class Class11_Sub1_Sub1 extends Class11_Sub1 {

	@OriginalMember(owner = "client!ah", name = "V", descriptor = "I")
	public final int anInt580;

	@OriginalMember(owner = "client!ah", name = "cb", descriptor = "I")
	public final int anInt582;

	@OriginalMember(owner = "client!ah", name = "W", descriptor = "Z")
	public final boolean aBoolean55;

	@OriginalMember(owner = "client!ah", name = "bb", descriptor = "F")
	public final float aFloat31;

	@OriginalMember(owner = "client!ah", name = "X", descriptor = "F")
	public final float aFloat30;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!ad;IIIII[BI)V")
	public Class11_Sub1_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt580 = arg2;
		this.anInt582 = arg3;
		this.method610(arg3, arg2, arg6, true, arg7);
		this.aBoolean55 = false;
		this.aFloat31 = (float) arg2 / (float) arg4;
		this.aFloat30 = (float) arg3 / (float) arg5;
		this.method605(false, false);
	}

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!ad;IIIIZ[BI)V")
	public Class11_Sub1_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt580 = arg3;
		this.anInt582 = arg4;
		if (super.anInt8884 == 34037) {
			this.aFloat31 = arg3;
			this.aBoolean55 = false;
			this.aFloat30 = arg4;
		} else {
			this.aBoolean55 = true;
			this.aFloat31 = this.aFloat30 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!ad;IIIIIZ)V")
	public Class11_Sub1_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (super.anInt8884 == 34037) {
			this.aBoolean55 = false;
			this.aFloat30 = arg5;
			this.aFloat31 = arg4;
		} else {
			this.aBoolean55 = true;
			this.aFloat31 = this.aFloat30 = 1.0F;
		}
		this.anInt580 = arg4;
		this.anInt582 = arg5;
	}

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!ad;IIIIIIZ)V")
	public Class11_Sub1_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt582 = arg4;
		this.aFloat30 = (float) arg4 / (float) arg6;
		this.aBoolean55 = false;
		this.aFloat31 = (float) arg3 / (float) arg5;
		this.anInt580 = arg3;
		this.method605(false, false);
	}

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!ad;IIII[I)V")
	public Class11_Sub1_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt582 = arg2;
		this.anInt580 = arg1;
		this.method607(arg1, arg2, arg5);
		this.aFloat30 = (float) arg2 / (float) arg4;
		this.aBoolean55 = false;
		this.aFloat31 = (float) arg1 / (float) arg3;
		this.method605(false, false);
	}

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!ad;IIIZ[I)V")
	public Class11_Sub1_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt582 = arg3;
		if (super.anInt8884 == 34037) {
			this.aFloat31 = arg2;
			this.aFloat30 = arg3;
			this.aBoolean55 = false;
		} else {
			this.aBoolean55 = true;
			this.aFloat31 = this.aFloat30 = 1.0F;
		}
		this.anInt580 = arg2;
	}
}
