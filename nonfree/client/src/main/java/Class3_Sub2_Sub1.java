import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public final class Class3_Sub2_Sub1 extends Class3_Sub2 {

	@OriginalMember(owner = "client!iba", name = "V", descriptor = "Z")
	public final boolean aBoolean317;

	@OriginalMember(owner = "client!iba", name = "R", descriptor = "F")
	public final float aFloat73;

	@OriginalMember(owner = "client!iba", name = "W", descriptor = "F")
	public final float aFloat74;

	@OriginalMember(owner = "client!iba", name = "C", descriptor = "I")
	public final int anInt4469;

	@OriginalMember(owner = "client!iba", name = "X", descriptor = "I")
	public final int anInt4472;

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lclient!wh;IIIZ[III)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt6738 == 34037) {
			this.aBoolean317 = false;
			this.aFloat73 = (float) arg2;
			this.aFloat74 = (float) arg3;
		} else {
			this.aBoolean317 = true;
			this.aFloat73 = this.aFloat74 = 1.0F;
		}
		this.anInt4469 = arg2;
		this.anInt4472 = arg3;
	}

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lclient!wh;IIIII)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.aBoolean317 = false;
		this.anInt4469 = arg2;
		this.aFloat74 = (float) arg3 / (float) arg5;
		this.anInt4472 = arg3;
		this.aFloat73 = (float) arg2 / (float) arg4;
		this.method3904(false, false);
	}

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lclient!wh;IIIII[BI)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt4472 = arg3;
		this.anInt4469 = arg2;
		this.method3903(arg2, arg6, arg3, arg7, true);
		this.aFloat74 = (float) arg3 / (float) arg5;
		this.aBoolean317 = false;
		this.aFloat73 = (float) arg2 / (float) arg4;
		this.method3904(false, false);
	}

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lclient!wh;IIII)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt4472 = arg4;
		this.anInt4469 = arg3;
		if (super.anInt6738 == 34037) {
			this.aBoolean317 = false;
			this.aFloat74 = (float) arg4;
			this.aFloat73 = (float) arg3;
		} else {
			this.aBoolean317 = true;
			this.aFloat73 = this.aFloat74 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lclient!wh;IIIIIIZ)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt4472 = arg4;
		this.aBoolean317 = false;
		this.aFloat73 = (float) arg3 / (float) arg5;
		this.anInt4469 = arg3;
		this.aFloat74 = (float) arg4 / (float) arg6;
		this.method3904(false, false);
	}

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lclient!wh;IIIIZ[BI)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt4472 = arg4;
		if (super.anInt6738 == 34037) {
			this.aFloat74 = (float) arg4;
			this.aBoolean317 = false;
			this.aFloat73 = (float) arg3;
		} else {
			this.aFloat73 = this.aFloat74 = 1.0F;
			this.aBoolean317 = true;
		}
		this.anInt4469 = arg3;
	}

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lclient!wh;IIIIIZ)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (super.anInt6738 == 34037) {
			this.aFloat73 = (float) arg4;
			this.aFloat74 = (float) arg5;
			this.aBoolean317 = false;
		} else {
			this.aBoolean317 = true;
			this.aFloat73 = this.aFloat74 = 1.0F;
		}
		this.anInt4472 = arg5;
		this.anInt4469 = arg4;
	}

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lclient!wh;IIII[I)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt4472 = arg2;
		this.anInt4469 = arg1;
		this.method3902(arg1, 0, 0, arg5, arg2, 0);
		this.aFloat74 = (float) arg2 / (float) arg4;
		this.aBoolean317 = false;
		this.aFloat73 = (float) arg1 / (float) arg3;
		this.method3904(false, false);
	}
}
