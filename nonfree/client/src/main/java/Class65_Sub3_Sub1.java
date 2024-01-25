import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public final class Class65_Sub3_Sub1 extends Class65_Sub3 {

	@OriginalMember(owner = "client!gk", name = "N", descriptor = "I")
	public final int anInt2651;

	@OriginalMember(owner = "client!gk", name = "Q", descriptor = "F")
	public final float aFloat84;

	@OriginalMember(owner = "client!gk", name = "T", descriptor = "F")
	public final float aFloat85;

	@OriginalMember(owner = "client!gk", name = "K", descriptor = "I")
	public final int anInt2650;

	@OriginalMember(owner = "client!gk", name = "R", descriptor = "Z")
	public final boolean aBoolean230;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!bo;IIIIIIZ)V")
	public Class65_Sub3_Sub1(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt2651 = arg4;
		this.aFloat84 = (float) arg3 / (float) arg5;
		this.aFloat85 = (float) arg4 / (float) arg6;
		this.anInt2650 = arg3;
		this.aBoolean230 = false;
		this.method1962(false, false);
	}

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!bo;IIIZ[I)V")
	public Class65_Sub3_Sub1(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		if (super.anInt5266 == 34037) {
			this.aFloat85 = arg3;
			this.aBoolean230 = false;
			this.aFloat84 = arg2;
		} else {
			this.aBoolean230 = true;
			this.aFloat84 = this.aFloat85 = 1.0F;
		}
		this.anInt2651 = arg3;
		this.anInt2650 = arg2;
	}

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!bo;IIIIZ[BI)V")
	public Class65_Sub3_Sub1(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt2650 = arg3;
		this.anInt2651 = arg4;
		if (super.anInt5266 == 34037) {
			this.aFloat84 = arg3;
			this.aFloat85 = arg4;
			this.aBoolean230 = false;
		} else {
			this.aFloat84 = this.aFloat85 = 1.0F;
			this.aBoolean230 = true;
		}
	}

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!bo;IIIII[BI)V")
	public Class65_Sub3_Sub1(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt2650 = arg2;
		this.anInt2651 = arg3;
		this.method1963(true, arg6, arg3, arg2, arg7);
		this.aBoolean230 = false;
		this.aFloat85 = (float) arg3 / (float) arg5;
		this.aFloat84 = (float) arg2 / (float) arg4;
		this.method1962(false, false);
	}

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!bo;IIII[I)V")
	public Class65_Sub3_Sub1(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt2651 = arg2;
		this.anInt2650 = arg1;
		this.method1965(arg1, arg2, arg5);
		this.aFloat85 = (float) arg2 / (float) arg4;
		this.aBoolean230 = false;
		this.aFloat84 = (float) arg1 / (float) arg3;
		this.method1962(false, false);
	}

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!bo;IIIIIZ)V")
	public Class65_Sub3_Sub1(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (super.anInt5266 == 34037) {
			this.aFloat85 = arg5;
			this.aFloat84 = arg4;
			this.aBoolean230 = false;
		} else {
			this.aBoolean230 = true;
			this.aFloat84 = this.aFloat85 = 1.0F;
		}
		this.anInt2651 = arg5;
		this.anInt2650 = arg4;
	}
}
