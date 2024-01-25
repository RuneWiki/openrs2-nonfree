import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public final class Class24_Sub4_Sub1 extends Class24_Sub4 {

	@OriginalMember(owner = "client!qd", name = "J", descriptor = "I")
	public final int anInt7730;

	@OriginalMember(owner = "client!qd", name = "L", descriptor = "I")
	public final int anInt7731;

	@OriginalMember(owner = "client!qd", name = "M", descriptor = "F")
	public final float aFloat153;

	@OriginalMember(owner = "client!qd", name = "O", descriptor = "F")
	public final float aFloat154;

	@OriginalMember(owner = "client!qd", name = "N", descriptor = "Z")
	public final boolean aBoolean636;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!rda;IIII[I)V")
	public Class24_Sub4_Sub1(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt7730 = arg1;
		this.anInt7731 = arg2;
		this.method6788(arg1, arg2, 0, arg5, 0, 0);
		this.aFloat153 = (float) arg2 / (float) arg4;
		this.aFloat154 = (float) arg1 / (float) arg3;
		this.aBoolean636 = false;
		this.method6792(false, false);
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!rda;IIIIIZ)V")
	public Class24_Sub4_Sub1(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (super.anInt7702 == 34037) {
			this.aFloat154 = (float) arg4;
			this.aFloat153 = (float) arg5;
			this.aBoolean636 = false;
		} else {
			this.aBoolean636 = true;
			this.aFloat154 = this.aFloat153 = 1.0F;
		}
		this.anInt7730 = arg4;
		this.anInt7731 = arg5;
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!rda;IIIII)V")
	public Class24_Sub4_Sub1(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.aFloat154 = (float) arg2 / (float) arg4;
		this.aFloat153 = (float) arg3 / (float) arg5;
		this.aBoolean636 = false;
		this.anInt7731 = arg3;
		this.anInt7730 = arg2;
		this.method6792(false, false);
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!rda;IIIII[BI)V")
	public Class24_Sub4_Sub1(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt7730 = arg2;
		this.anInt7731 = arg3;
		this.method6794(arg6, arg7, true, arg3, arg2);
		this.aFloat153 = (float) arg3 / (float) arg5;
		this.aBoolean636 = false;
		this.aFloat154 = (float) arg2 / (float) arg4;
		this.method6792(false, false);
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!rda;IIIZ[III)V")
	public Class24_Sub4_Sub1(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt7730 = arg2;
		this.anInt7731 = arg3;
		if (super.anInt7702 == 34037) {
			this.aFloat154 = (float) arg2;
			this.aFloat153 = (float) arg3;
			this.aBoolean636 = false;
		} else {
			this.aBoolean636 = true;
			this.aFloat154 = this.aFloat153 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!rda;IIIIZ[BI)V")
	public Class24_Sub4_Sub1(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt7702 == 34037) {
			this.aBoolean636 = false;
			this.aFloat154 = (float) arg3;
			this.aFloat153 = (float) arg4;
		} else {
			this.aFloat154 = this.aFloat153 = 1.0F;
			this.aBoolean636 = true;
		}
		this.anInt7731 = arg4;
		this.anInt7730 = arg3;
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!rda;IIII)V")
	public Class24_Sub4_Sub1(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt7731 = arg4;
		this.anInt7730 = arg3;
		if (super.anInt7702 == 34037) {
			this.aFloat153 = (float) arg4;
			this.aBoolean636 = false;
			this.aFloat154 = (float) arg3;
		} else {
			this.aBoolean636 = true;
			this.aFloat154 = this.aFloat153 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!rda;IIIIIIZ)V")
	public Class24_Sub4_Sub1(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt7731 = arg4;
		this.aFloat154 = (float) arg3 / (float) arg5;
		this.aBoolean636 = false;
		this.aFloat153 = (float) arg4 / (float) arg6;
		this.anInt7730 = arg3;
		this.method6792(false, false);
	}
}
