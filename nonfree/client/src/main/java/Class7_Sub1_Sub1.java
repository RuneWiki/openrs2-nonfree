import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public final class Class7_Sub1_Sub1 extends Class7_Sub1 {

	@OriginalMember(owner = "client!r", name = "m", descriptor = "I")
	public final int anInt5437;

	@OriginalMember(owner = "client!r", name = "o", descriptor = "I")
	public final int anInt5438;

	@OriginalMember(owner = "client!r", name = "n", descriptor = "F")
	public final float aFloat76;

	@OriginalMember(owner = "client!r", name = "l", descriptor = "F")
	public final float aFloat75;

	@OriginalMember(owner = "client!r", name = "p", descriptor = "Z")
	public final boolean aBoolean428;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!qi;IIIZ[I)V")
	public Class7_Sub1_Sub1(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt5437 = arg2;
		this.anInt5438 = arg3;
		if (this.anInt5432 == 34037) {
			this.aBoolean428 = false;
			this.aFloat76 = arg3;
			this.aFloat75 = arg2;
		} else {
			this.aFloat75 = this.aFloat76 = 1.0F;
			this.aBoolean428 = true;
		}
	}

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!qi;IIII[I)V")
	public Class7_Sub1_Sub1(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt5438 = arg2;
		this.anInt5437 = arg1;
		this.method4748(arg1, arg2, arg5);
		this.aBoolean428 = false;
		this.aFloat75 = (float) arg1 / (float) arg3;
		this.aFloat76 = (float) arg2 / (float) arg4;
		this.method4749(false, false);
	}

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!qi;IIIIIIZ)V")
	public Class7_Sub1_Sub1(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt5437 = arg3;
		this.anInt5438 = arg4;
		this.aFloat76 = (float) arg4 / (float) arg6;
		this.aBoolean428 = false;
		this.aFloat75 = (float) arg3 / (float) arg5;
		this.method4749(false, false);
	}

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!qi;IIIIIZ)V")
	public Class7_Sub1_Sub1(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (this.anInt5432 == 34037) {
			this.aFloat76 = arg5;
			this.aBoolean428 = false;
			this.aFloat75 = arg4;
		} else {
			this.aFloat75 = this.aFloat76 = 1.0F;
			this.aBoolean428 = true;
		}
		this.anInt5437 = arg4;
		this.anInt5438 = arg5;
	}

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!qi;IIIIZ[BI)V")
	public Class7_Sub1_Sub1(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt5438 = arg4;
		if (this.anInt5432 == 34037) {
			this.aFloat76 = arg4;
			this.aFloat75 = arg3;
			this.aBoolean428 = false;
		} else {
			this.aFloat75 = this.aFloat76 = 1.0F;
			this.aBoolean428 = true;
		}
		this.anInt5437 = arg3;
	}

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!qi;IIIII[BI)V")
	public Class7_Sub1_Sub1(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt5437 = arg2;
		this.anInt5438 = arg3;
		this.method4747(arg2, arg3, arg6, arg7, true);
		this.aFloat75 = (float) arg2 / (float) arg4;
		this.aBoolean428 = false;
		this.aFloat76 = (float) arg3 / (float) arg5;
		this.method4749(false, false);
	}
}
