import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class35_Sub3_Sub1 extends Class35_Sub3 {

	@OriginalMember(owner = "client!mm", name = "R", descriptor = "[C")
	private static final char[] aCharArray7 = new char[64];

	@OriginalMember(owner = "client!mm", name = "M", descriptor = "I")
	public final int anInt5653;

	@OriginalMember(owner = "client!mm", name = "O", descriptor = "I")
	public final int anInt5654;

	@OriginalMember(owner = "client!mm", name = "Q", descriptor = "Z")
	public final boolean aBoolean362;

	@OriginalMember(owner = "client!mm", name = "P", descriptor = "F")
	public final float aFloat129;

	@OriginalMember(owner = "client!mm", name = "N", descriptor = "F")
	public final float aFloat128;

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray7[local4] = (char) (local4 + 65);
		}
		for (@Pc(20) int local20 = 26; local20 < 52; local20++) {
			aCharArray7[local20] = (char) (local20 + 97 - 26);
		}
		for (@Pc(36) int local36 = 52; local36 < 62; local36++) {
			aCharArray7[local36] = (char) (local36 + 48 - 52);
		}
		aCharArray7[62] = '*';
		aCharArray7[63] = '-';
	}

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!pea;IIIIIZ)V")
	public Class35_Sub3_Sub1(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt5653 = arg4;
		this.anInt5654 = arg5;
		if (super.anInt6267 == 34037) {
			this.aFloat129 = arg5;
			this.aBoolean362 = false;
			this.aFloat128 = arg4;
		} else {
			this.aBoolean362 = true;
			this.aFloat128 = this.aFloat129 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!pea;IIIZ[I)V")
	public Class35_Sub3_Sub1(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt5654 = arg3;
		this.anInt5653 = arg2;
		if (super.anInt6267 == 34037) {
			this.aBoolean362 = false;
			this.aFloat129 = arg3;
			this.aFloat128 = arg2;
		} else {
			this.aFloat128 = this.aFloat129 = 1.0F;
			this.aBoolean362 = true;
		}
	}

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!pea;IIII[I)V")
	public Class35_Sub3_Sub1(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt5654 = arg2;
		this.anInt5653 = arg1;
		this.method4856(arg5, arg2, arg1);
		this.aBoolean362 = false;
		this.aFloat129 = (float) arg2 / (float) arg4;
		this.aFloat128 = (float) arg1 / (float) arg3;
		this.method4857(false, false);
	}

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!pea;IIIIZ[BI)V")
	public Class35_Sub3_Sub1(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt5653 = arg3;
		if (super.anInt6267 == 34037) {
			this.aBoolean362 = false;
			this.aFloat129 = arg4;
			this.aFloat128 = arg3;
		} else {
			this.aFloat128 = this.aFloat129 = 1.0F;
			this.aBoolean362 = true;
		}
		this.anInt5654 = arg4;
	}

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!pea;IIIII[BI)V")
	public Class35_Sub3_Sub1(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt5654 = arg3;
		this.anInt5653 = arg2;
		this.method4853(arg3, arg2, arg6, arg7, true);
		this.aBoolean362 = false;
		this.aFloat128 = (float) arg2 / (float) arg4;
		this.aFloat129 = (float) arg3 / (float) arg5;
		this.method4857(false, false);
	}

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!pea;IIIIIIZ)V")
	public Class35_Sub3_Sub1(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat128 = (float) arg3 / (float) arg5;
		this.aFloat129 = (float) arg4 / (float) arg6;
		this.aBoolean362 = false;
		this.anInt5654 = arg4;
		this.anInt5653 = arg3;
		this.method4857(false, false);
	}
}
