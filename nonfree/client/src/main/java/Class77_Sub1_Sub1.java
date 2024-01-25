import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public final class Class77_Sub1_Sub1 extends Class77_Sub1 {

	@OriginalMember(owner = "client!eb", name = "T", descriptor = "I")
	public final int anInt2401;

	@OriginalMember(owner = "client!eb", name = "X", descriptor = "I")
	public final int anInt2403;

	@OriginalMember(owner = "client!eb", name = "S", descriptor = "Z")
	public final boolean aBoolean170;

	@OriginalMember(owner = "client!eb", name = "Q", descriptor = "F")
	public final float aFloat88;

	@OriginalMember(owner = "client!eb", name = "W", descriptor = "F")
	public final float aFloat89;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!kga;IIIIIIZ)V")
	public Class77_Sub1_Sub1(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt2401 = arg3;
		this.anInt2403 = arg4;
		this.aBoolean170 = false;
		this.aFloat88 = (float) arg3 / (float) arg5;
		this.aFloat89 = (float) arg4 / (float) arg6;
		this.method2266(false, false);
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!kga;IIIII[BI)V")
	public Class77_Sub1_Sub1(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt2401 = arg2;
		this.anInt2403 = arg3;
		this.method2267(arg3, true, arg2, arg6, arg7);
		this.aFloat88 = (float) arg2 / (float) arg4;
		this.aFloat89 = (float) arg3 / (float) arg5;
		this.aBoolean170 = false;
		this.method2266(false, false);
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!kga;IIII)V")
	public Class77_Sub1_Sub1(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		if (super.anInt8662 == 34037) {
			this.aFloat89 = arg4;
			this.aBoolean170 = false;
			this.aFloat88 = arg3;
		} else {
			this.aBoolean170 = true;
			this.aFloat88 = this.aFloat89 = 1.0F;
		}
		this.anInt2401 = arg3;
		this.anInt2403 = arg4;
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!kga;IIIII)V")
	public Class77_Sub1_Sub1(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.aFloat88 = (float) arg2 / (float) arg4;
		this.anInt2403 = arg3;
		this.anInt2401 = arg2;
		this.aBoolean170 = false;
		this.aFloat89 = (float) arg3 / (float) arg5;
		this.method2266(false, false);
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!kga;IIIIIZ)V")
	public Class77_Sub1_Sub1(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt2403 = arg5;
		if (super.anInt8662 == 34037) {
			this.aBoolean170 = false;
			this.aFloat88 = arg4;
			this.aFloat89 = arg5;
		} else {
			this.aFloat88 = this.aFloat89 = 1.0F;
			this.aBoolean170 = true;
		}
		this.anInt2401 = arg4;
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!kga;IIIZ[I)V")
	public Class77_Sub1_Sub1(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		if (super.anInt8662 == 34037) {
			this.aFloat88 = arg2;
			this.aBoolean170 = false;
			this.aFloat89 = arg3;
		} else {
			this.aFloat88 = this.aFloat89 = 1.0F;
			this.aBoolean170 = true;
		}
		this.anInt2403 = arg3;
		this.anInt2401 = arg2;
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!kga;IIII[I)V")
	public Class77_Sub1_Sub1(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt2403 = arg2;
		this.anInt2401 = arg1;
		this.method2268(arg5, arg1, arg2);
		this.aFloat88 = (float) arg1 / (float) arg3;
		this.aFloat89 = (float) arg2 / (float) arg4;
		this.aBoolean170 = false;
		this.method2266(false, false);
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!kga;IIIIZ[BI)V")
	public Class77_Sub1_Sub1(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt2401 = arg3;
		this.anInt2403 = arg4;
		if (super.anInt8662 == 34037) {
			this.aFloat88 = arg3;
			this.aFloat89 = arg4;
			this.aBoolean170 = false;
		} else {
			this.aFloat88 = this.aFloat89 = 1.0F;
			this.aBoolean170 = true;
		}
	}
}
