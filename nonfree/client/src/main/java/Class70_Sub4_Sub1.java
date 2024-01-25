import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public final class Class70_Sub4_Sub1 extends Class70_Sub4 {

	@OriginalMember(owner = "client!gn", name = "m", descriptor = "I")
	public final int anInt2356;

	@OriginalMember(owner = "client!gn", name = "n", descriptor = "I")
	public final int anInt2357;

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "F")
	public final float aFloat23;

	@OriginalMember(owner = "client!gn", name = "o", descriptor = "F")
	public final float aFloat24;

	@OriginalMember(owner = "client!gn", name = "p", descriptor = "Z")
	public final boolean aBoolean202;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!ql;IIII[I)V")
	public Class70_Sub4_Sub1(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt2356 = arg2;
		this.anInt2357 = arg1;
		this.method1993(arg1, arg2, arg5, arg1);
		this.aFloat23 = (float) arg2 / (float) arg4;
		this.aFloat24 = (float) arg1 / (float) arg3;
		this.aBoolean202 = false;
	}

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!ql;IIIIIIZ)V")
	public Class70_Sub4_Sub1(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aBoolean202 = false;
		this.anInt2357 = arg3;
		this.aFloat23 = (float) arg4 / (float) arg6;
		this.anInt2356 = arg4;
		this.aFloat24 = (float) arg3 / (float) arg5;
	}

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!ql;IIIII[BI)V")
	public Class70_Sub4_Sub1(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt2356 = arg3;
		this.anInt2357 = arg2;
		this.method1992(arg2, arg3, arg6, arg7, true);
		this.aBoolean202 = false;
		this.aFloat24 = (float) arg2 / (float) arg4;
		this.aFloat23 = (float) arg3 / (float) arg5;
	}

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!ql;IIIIIZ)V")
	public Class70_Sub4_Sub1(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt2356 = arg5;
		this.anInt2357 = arg4;
		if (this.anInt2351 == 34037) {
			this.aFloat23 = arg5;
			this.aFloat24 = arg4;
			this.aBoolean202 = false;
		} else {
			this.aBoolean202 = true;
			this.aFloat24 = this.aFloat23 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!ql;IIIIZ[BI)V")
	public Class70_Sub4_Sub1(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (this.anInt2351 == 34037) {
			this.aBoolean202 = false;
			this.aFloat24 = arg3;
			this.aFloat23 = arg4;
		} else {
			this.aFloat24 = this.aFloat23 = 1.0F;
			this.aBoolean202 = true;
		}
		this.anInt2356 = arg4;
		this.anInt2357 = arg3;
	}

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!ql;IIIZ[I)V")
	public Class70_Sub4_Sub1(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		if (this.anInt2351 == 34037) {
			this.aFloat23 = arg3;
			this.aBoolean202 = false;
			this.aFloat24 = arg2;
		} else {
			this.aFloat24 = this.aFloat23 = 1.0F;
			this.aBoolean202 = true;
		}
		this.anInt2357 = arg2;
		this.anInt2356 = arg3;
	}
}
