import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public final class Class81_Sub2_Sub1 extends Class81_Sub2 {

	@OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
	public final int anInt4128;

	@OriginalMember(owner = "client!lm", name = "m", descriptor = "F")
	public final float aFloat49;

	@OriginalMember(owner = "client!lm", name = "l", descriptor = "I")
	public final int anInt4127;

	@OriginalMember(owner = "client!lm", name = "o", descriptor = "F")
	public final float aFloat50;

	@OriginalMember(owner = "client!lm", name = "p", descriptor = "Z")
	public final boolean aBoolean299;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!ic;IIIIIIZ)V")
	public Class81_Sub2_Sub1(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt4128 = arg4;
		this.aFloat49 = (float) arg4 / (float) arg6;
		this.anInt4127 = arg3;
		this.aFloat50 = (float) arg3 / (float) arg5;
		this.aBoolean299 = false;
		this.method3640(false, false);
	}

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!ic;IIIII[BI)V")
	public Class81_Sub2_Sub1(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt4128 = arg3;
		this.anInt4127 = arg2;
		this.method3639(arg2, arg3, arg6, arg7, true);
		this.aBoolean299 = false;
		this.aFloat50 = (float) arg2 / (float) arg4;
		this.aFloat49 = (float) arg3 / (float) arg5;
		this.method3640(false, false);
	}

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!ic;IIII[I)V")
	public Class81_Sub2_Sub1(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt4127 = arg1;
		this.anInt4128 = arg2;
		this.method3636(arg1, arg2, arg5);
		this.aFloat50 = (float) arg1 / (float) arg3;
		this.aBoolean299 = false;
		this.aFloat49 = (float) arg2 / (float) arg4;
		this.method3640(false, false);
	}

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!ic;IIIIZ[BI)V")
	public Class81_Sub2_Sub1(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt4128 = arg4;
		this.anInt4127 = arg3;
		if (this.anInt4831 == 34037) {
			this.aFloat49 = arg4;
			this.aFloat50 = arg3;
			this.aBoolean299 = false;
		} else {
			this.aFloat50 = this.aFloat49 = 1.0F;
			this.aBoolean299 = true;
		}
	}

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!ic;IIIZ[I)V")
	public Class81_Sub2_Sub1(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt4127 = arg2;
		this.anInt4128 = arg3;
		if (this.anInt4831 == 34037) {
			this.aFloat49 = arg3;
			this.aFloat50 = arg2;
			this.aBoolean299 = false;
		} else {
			this.aBoolean299 = true;
			this.aFloat50 = this.aFloat49 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!ic;IIIIIZ)V")
	public Class81_Sub2_Sub1(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt4127 = arg4;
		this.anInt4128 = arg5;
		if (this.anInt4831 == 34037) {
			this.aBoolean299 = false;
			this.aFloat49 = arg5;
			this.aFloat50 = arg4;
		} else {
			this.aFloat50 = this.aFloat49 = 1.0F;
			this.aBoolean299 = true;
		}
	}
}
