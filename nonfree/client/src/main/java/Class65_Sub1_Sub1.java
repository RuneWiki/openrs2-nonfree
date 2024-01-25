import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public final class Class65_Sub1_Sub1 extends Class65_Sub1 {

	@OriginalMember(owner = "client!dd", name = "K", descriptor = "F")
	public final float aFloat18;

	@OriginalMember(owner = "client!dd", name = "Q", descriptor = "F")
	public final float aFloat19;

	@OriginalMember(owner = "client!dd", name = "N", descriptor = "Z")
	public final boolean aBoolean133;

	@OriginalMember(owner = "client!dd", name = "T", descriptor = "I")
	public final int anInt1700;

	@OriginalMember(owner = "client!dd", name = "O", descriptor = "I")
	public final int anInt1699;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!ep;IIIZ[III)V")
	public Class65_Sub1_Sub1(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt8058 == 34037) {
			this.aFloat19 = arg2;
			this.aBoolean133 = false;
			this.aFloat18 = arg3;
		} else {
			this.aFloat19 = this.aFloat18 = 1.0F;
			this.aBoolean133 = true;
		}
		this.anInt1700 = arg3;
		this.anInt1699 = arg2;
	}

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!ep;IIII)V")
	public Class65_Sub1_Sub1(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt1700 = arg4;
		if (super.anInt8058 == 34037) {
			this.aBoolean133 = false;
			this.aFloat19 = arg3;
			this.aFloat18 = arg4;
		} else {
			this.aFloat19 = this.aFloat18 = 1.0F;
			this.aBoolean133 = true;
		}
		this.anInt1699 = arg3;
	}

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!ep;IIIIIIZ)V")
	public Class65_Sub1_Sub1(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat18 = (float) arg4 / (float) arg6;
		this.anInt1700 = arg4;
		this.anInt1699 = arg3;
		this.aFloat19 = (float) arg3 / (float) arg5;
		this.aBoolean133 = false;
		this.method1424(false, false);
	}

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!ep;IIIIIZ)V")
	public Class65_Sub1_Sub1(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt1700 = arg5;
		this.anInt1699 = arg4;
		if (super.anInt8058 == 34037) {
			this.aFloat19 = arg4;
			this.aBoolean133 = false;
			this.aFloat18 = arg5;
		} else {
			this.aBoolean133 = true;
			this.aFloat19 = this.aFloat18 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!ep;IIIII)V")
	public Class65_Sub1_Sub1(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt1700 = arg3;
		this.aFloat19 = (float) arg2 / (float) arg4;
		this.aFloat18 = (float) arg3 / (float) arg5;
		this.anInt1699 = arg2;
		this.aBoolean133 = false;
		this.method1424(false, false);
	}

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!ep;IIII[I)V")
	public Class65_Sub1_Sub1(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt1699 = arg1;
		this.anInt1700 = arg2;
		this.method1428(arg5, arg2, arg1);
		this.aBoolean133 = false;
		this.aFloat18 = (float) arg2 / (float) arg4;
		this.aFloat19 = (float) arg1 / (float) arg3;
		this.method1424(false, false);
	}

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!ep;IIIII[BI)V")
	public Class65_Sub1_Sub1(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt1699 = arg2;
		this.anInt1700 = arg3;
		this.method1426(true, arg6, arg2, arg3, arg7);
		this.aFloat19 = (float) arg2 / (float) arg4;
		this.aFloat18 = (float) arg3 / (float) arg5;
		this.aBoolean133 = false;
		this.method1424(false, false);
	}

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!ep;IIIIZ[BI)V")
	public Class65_Sub1_Sub1(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt1700 = arg4;
		this.anInt1699 = arg3;
		if (super.anInt8058 == 34037) {
			this.aFloat19 = arg3;
			this.aFloat18 = arg4;
			this.aBoolean133 = false;
		} else {
			this.aFloat19 = this.aFloat18 = 1.0F;
			this.aBoolean133 = true;
		}
	}
}
