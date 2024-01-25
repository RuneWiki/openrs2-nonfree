import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class29_Sub3_Sub1 extends Class29_Sub3 {

	@OriginalMember(owner = "client!ub", name = "F", descriptor = "[C")
	public static final char[] aCharArray14 = new char[64];

	@OriginalMember(owner = "client!ub", name = "G", descriptor = "Z")
	public final boolean aBoolean672;

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "F")
	public final float aFloat186;

	@OriginalMember(owner = "client!ub", name = "K", descriptor = "F")
	public final float aFloat187;

	@OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
	public final int anInt9593;

	@OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
	public final int anInt9590;

	static {
		for (@Pc(101) int local101 = 0; local101 < 26; local101++) {
			aCharArray14[local101] = (char) (local101 + 65);
		}
		for (@Pc(115) int local115 = 26; local115 < 52; local115++) {
			aCharArray14[local115] = (char) (local115 + 97 - 26);
		}
		for (@Pc(131) int local131 = 52; local131 < 62; local131++) {
			aCharArray14[local131] = (char) (local131 + 48 - 52);
		}
		aCharArray14[63] = '-';
		aCharArray14[62] = '*';
	}

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!vf;IIIZ[III)V")
	public Class29_Sub3_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt9567 == 34037) {
			this.aBoolean672 = false;
			this.aFloat186 = (float) arg2;
			this.aFloat187 = (float) arg3;
		} else {
			this.aBoolean672 = true;
			this.aFloat186 = this.aFloat187 = 1.0F;
		}
		this.anInt9593 = arg2;
		this.anInt9590 = arg3;
	}

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!vf;IIII)V")
	public Class29_Sub3_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		if (super.anInt9567 == 34037) {
			this.aFloat187 = (float) arg4;
			this.aFloat186 = (float) arg3;
			this.aBoolean672 = false;
		} else {
			this.aFloat186 = this.aFloat187 = 1.0F;
			this.aBoolean672 = true;
		}
		this.anInt9593 = arg3;
		this.anInt9590 = arg4;
	}

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!vf;IIIIIIZ)V")
	public Class29_Sub3_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aBoolean672 = false;
		this.aFloat186 = (float) arg3 / (float) arg5;
		this.anInt9593 = arg3;
		this.aFloat187 = (float) arg4 / (float) arg6;
		this.anInt9590 = arg4;
		this.method8174(false, false);
	}

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!vf;IIII[I)V")
	public Class29_Sub3_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt9593 = arg1;
		this.anInt9590 = arg2;
		this.method8175(arg5, 0, arg2, arg1, 0, 0);
		this.aFloat186 = (float) arg1 / (float) arg3;
		this.aBoolean672 = false;
		this.aFloat187 = (float) arg2 / (float) arg4;
		this.method8174(false, false);
	}

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!vf;IIIIIZ)V")
	public Class29_Sub3_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt9590 = arg5;
		if (super.anInt9567 == 34037) {
			this.aFloat187 = (float) arg5;
			this.aFloat186 = (float) arg4;
			this.aBoolean672 = false;
		} else {
			this.aBoolean672 = true;
			this.aFloat186 = this.aFloat187 = 1.0F;
		}
		this.anInt9593 = arg4;
	}

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!vf;IIIIZ[BI)V")
	public Class29_Sub3_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt9567 == 34037) {
			this.aFloat186 = (float) arg3;
			this.aFloat187 = (float) arg4;
			this.aBoolean672 = false;
		} else {
			this.aFloat186 = this.aFloat187 = 1.0F;
			this.aBoolean672 = true;
		}
		this.anInt9593 = arg3;
		this.anInt9590 = arg4;
	}

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!vf;IIIII)V")
	public Class29_Sub3_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.aFloat186 = (float) arg2 / (float) arg4;
		this.anInt9593 = arg2;
		this.aFloat187 = (float) arg3 / (float) arg5;
		this.aBoolean672 = false;
		this.anInt9590 = arg3;
		this.method8174(false, false);
	}

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!vf;IIIII[BI)V")
	public Class29_Sub3_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt9593 = arg2;
		this.anInt9590 = arg3;
		this.method8173(arg2, arg7, arg6, true, arg3);
		this.aFloat186 = (float) arg2 / (float) arg4;
		this.aBoolean672 = false;
		this.aFloat187 = (float) arg3 / (float) arg5;
		this.method8174(false, false);
	}
}
