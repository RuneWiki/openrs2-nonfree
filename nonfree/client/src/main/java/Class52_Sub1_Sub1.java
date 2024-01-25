import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public final class Class52_Sub1_Sub1 extends Class52_Sub1 {

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
	public final int anInt5498;

	@OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
	public final int anInt5499;

	@OriginalMember(owner = "client!rk", name = "l", descriptor = "F")
	public final float aFloat89;

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "Z")
	public final boolean aBoolean403;

	@OriginalMember(owner = "client!rk", name = "o", descriptor = "F")
	public final float aFloat90;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!ig;IIIZ[I)V")
	public Class52_Sub1_Sub1(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt5498 = arg3;
		this.anInt5499 = arg2;
		if (this.anInt6685 == 34037) {
			this.aFloat89 = arg3;
			this.aBoolean403 = false;
			this.aFloat90 = arg2;
		} else {
			this.aBoolean403 = true;
			this.aFloat90 = this.aFloat89 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!ig;IIIII[BI)V")
	public Class52_Sub1_Sub1(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt5499 = arg2;
		this.anInt5498 = arg3;
		this.method4731(arg2, arg3, arg6, arg7, true);
		this.aFloat89 = (float) arg3 / (float) arg5;
		this.aFloat90 = (float) arg2 / (float) arg4;
		this.aBoolean403 = false;
		this.method4734(false, false);
	}

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!ig;IIIIIZ)V")
	public Class52_Sub1_Sub1(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt5499 = arg4;
		if (this.anInt6685 == 34037) {
			this.aFloat90 = arg4;
			this.aFloat89 = arg5;
			this.aBoolean403 = false;
		} else {
			this.aFloat90 = this.aFloat89 = 1.0F;
			this.aBoolean403 = true;
		}
		this.anInt5498 = arg5;
	}

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!ig;IIIIZ[BI)V")
	public Class52_Sub1_Sub1(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt5499 = arg3;
		if (this.anInt6685 == 34037) {
			this.aBoolean403 = false;
			this.aFloat90 = arg3;
			this.aFloat89 = arg4;
		} else {
			this.aFloat90 = this.aFloat89 = 1.0F;
			this.aBoolean403 = true;
		}
		this.anInt5498 = arg4;
	}

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!ig;IIII[I)V")
	public Class52_Sub1_Sub1(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt5499 = arg1;
		this.anInt5498 = arg2;
		this.method4733(arg1, arg2, arg5);
		this.aFloat89 = (float) arg2 / (float) arg4;
		this.aBoolean403 = false;
		this.aFloat90 = (float) arg1 / (float) arg3;
		this.method4734(false, false);
	}

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!ig;IIIIIIZ)V")
	public Class52_Sub1_Sub1(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt5498 = arg4;
		this.anInt5499 = arg3;
		this.aBoolean403 = false;
		this.aFloat90 = (float) arg3 / (float) arg5;
		this.aFloat89 = (float) arg4 / (float) arg6;
		this.method4734(false, false);
	}
}
