import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public final class Class124_Sub2_Sub1 extends Class124_Sub2 {

	@OriginalMember(owner = "client!rn", name = "l", descriptor = "F")
	public final float aFloat72;

	@OriginalMember(owner = "client!rn", name = "o", descriptor = "Z")
	public final boolean aBoolean504;

	@OriginalMember(owner = "client!rn", name = "p", descriptor = "F")
	public final float aFloat73;

	@OriginalMember(owner = "client!rn", name = "n", descriptor = "I")
	public final int anInt5595;

	@OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
	public final int anInt5594;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lclient!ao;IIIZ[I)V")
	public Class124_Sub2_Sub1(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		if (this.anInt6844 == 34037) {
			this.aFloat72 = arg3;
			this.aBoolean504 = false;
			this.aFloat73 = arg2;
		} else {
			this.aFloat73 = this.aFloat72 = 1.0F;
			this.aBoolean504 = true;
		}
		this.anInt5595 = arg2;
		this.anInt5594 = arg3;
	}

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lclient!ao;IIIIIIZ)V")
	public Class124_Sub2_Sub1(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat72 = (float) arg4 / (float) arg6;
		this.aBoolean504 = false;
		this.aFloat73 = (float) arg3 / (float) arg5;
		this.anInt5594 = arg4;
		this.anInt5595 = arg3;
		this.method4995(false, false);
	}

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lclient!ao;IIIIZ[BI)V")
	public Class124_Sub2_Sub1(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt5595 = arg3;
		this.anInt5594 = arg4;
		if (this.anInt6844 == 34037) {
			this.aBoolean504 = false;
			this.aFloat72 = arg4;
			this.aFloat73 = arg3;
		} else {
			this.aBoolean504 = true;
			this.aFloat73 = this.aFloat72 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lclient!ao;IIIII[BI)V")
	public Class124_Sub2_Sub1(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt5594 = arg3;
		this.anInt5595 = arg2;
		this.method4993(arg2, arg3, arg6, arg7, true);
		this.aBoolean504 = false;
		this.aFloat72 = (float) arg3 / (float) arg5;
		this.aFloat73 = (float) arg2 / (float) arg4;
		this.method4995(false, false);
	}

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lclient!ao;IIII[I)V")
	public Class124_Sub2_Sub1(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt5594 = arg2;
		this.anInt5595 = arg1;
		this.method4994(arg1, arg2, arg5);
		this.aBoolean504 = false;
		this.aFloat73 = (float) arg1 / (float) arg3;
		this.aFloat72 = (float) arg2 / (float) arg4;
		this.method4995(false, false);
	}

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lclient!ao;IIIIIZ)V")
	public Class124_Sub2_Sub1(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt5595 = arg4;
		if (this.anInt6844 == 34037) {
			this.aFloat73 = arg4;
			this.aFloat72 = arg5;
			this.aBoolean504 = false;
		} else {
			this.aBoolean504 = true;
			this.aFloat73 = this.aFloat72 = 1.0F;
		}
		this.anInt5594 = arg5;
	}
}
