import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public final class Class64_Sub4_Sub1 extends Class64_Sub4 {

	@OriginalMember(owner = "client!me", name = "P", descriptor = "I")
	public final int anInt4413;

	@OriginalMember(owner = "client!me", name = "W", descriptor = "I")
	public final int anInt4416;

	@OriginalMember(owner = "client!me", name = "V", descriptor = "F")
	public final float aFloat37;

	@OriginalMember(owner = "client!me", name = "T", descriptor = "F")
	public final float aFloat36;

	@OriginalMember(owner = "client!me", name = "N", descriptor = "Z")
	public final boolean aBoolean322;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!na;IIIIZ[BI)V")
	public Class64_Sub4_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt4413 = arg3;
		this.anInt4416 = arg4;
		if (super.anInt4388 == 34037) {
			this.aFloat36 = arg3;
			this.aBoolean322 = false;
			this.aFloat37 = arg4;
		} else {
			this.aFloat36 = this.aFloat37 = 1.0F;
			this.aBoolean322 = true;
		}
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!na;IIIII[BI)V")
	public Class64_Sub4_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt4413 = arg2;
		this.anInt4416 = arg3;
		this.method3534(arg2, arg7, arg6, true, arg3);
		this.aBoolean322 = false;
		this.aFloat37 = (float) arg3 / (float) arg5;
		this.aFloat36 = (float) arg2 / (float) arg4;
		this.method3530(false, false);
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!na;IIIIIIZ)V")
	public Class64_Sub4_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt4416 = arg4;
		this.aBoolean322 = false;
		this.aFloat36 = (float) arg3 / (float) arg5;
		this.aFloat37 = (float) arg4 / (float) arg6;
		this.anInt4413 = arg3;
		this.method3530(false, false);
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!na;IIIIIZ)V")
	public Class64_Sub4_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (super.anInt4388 == 34037) {
			this.aFloat36 = arg4;
			this.aFloat37 = arg5;
			this.aBoolean322 = false;
		} else {
			this.aBoolean322 = true;
			this.aFloat36 = this.aFloat37 = 1.0F;
		}
		this.anInt4416 = arg5;
		this.anInt4413 = arg4;
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!na;IIII[I)V")
	public Class64_Sub4_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt4413 = arg1;
		this.anInt4416 = arg2;
		this.method3533(arg2, arg5, arg1);
		this.aFloat37 = (float) arg2 / (float) arg4;
		this.aFloat36 = (float) arg1 / (float) arg3;
		this.aBoolean322 = false;
		this.method3530(false, false);
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!na;IIIZ[I)V")
	public Class64_Sub4_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt4416 = arg3;
		if (super.anInt4388 == 34037) {
			this.aBoolean322 = false;
			this.aFloat37 = arg3;
			this.aFloat36 = arg2;
		} else {
			this.aBoolean322 = true;
			this.aFloat36 = this.aFloat37 = 1.0F;
		}
		this.anInt4413 = arg2;
	}
}
