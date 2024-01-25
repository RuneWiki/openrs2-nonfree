import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public final class Class132_Sub1_Sub1 extends Class132_Sub1 {

	@OriginalMember(owner = "client!hea", name = "L", descriptor = "Z")
	public final boolean aBoolean340;

	@OriginalMember(owner = "client!hea", name = "N", descriptor = "F")
	public final float aFloat99;

	@OriginalMember(owner = "client!hea", name = "O", descriptor = "I")
	public final int anInt4225;

	@OriginalMember(owner = "client!hea", name = "R", descriptor = "I")
	public final int anInt4227;

	@OriginalMember(owner = "client!hea", name = "J", descriptor = "F")
	public final float aFloat98;

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lclient!ap;IIIIIIZ)V")
	public Class132_Sub1_Sub1(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aBoolean340 = false;
		this.aFloat99 = (float) arg4 / (float) arg6;
		this.anInt4225 = arg3;
		this.anInt4227 = arg4;
		this.aFloat98 = (float) arg3 / (float) arg5;
		this.method3694(false, false);
	}

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lclient!ap;IIII[I)V")
	public Class132_Sub1_Sub1(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt4225 = arg1;
		this.anInt4227 = arg2;
		this.method3699(arg5, arg1, arg2);
		this.aBoolean340 = false;
		this.aFloat98 = (float) arg1 / (float) arg3;
		this.aFloat99 = (float) arg2 / (float) arg4;
		this.method3694(false, false);
	}

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lclient!ap;IIIZ[I)V")
	public Class132_Sub1_Sub1(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt4225 = arg2;
		if (super.anInt6650 == 34037) {
			this.aFloat98 = arg2;
			this.aFloat99 = arg3;
			this.aBoolean340 = false;
		} else {
			this.aFloat98 = this.aFloat99 = 1.0F;
			this.aBoolean340 = true;
		}
		this.anInt4227 = arg3;
	}

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lclient!ap;IIIIIZ)V")
	public Class132_Sub1_Sub1(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt4227 = arg5;
		if (super.anInt6650 == 34037) {
			this.aFloat98 = arg4;
			this.aFloat99 = arg5;
			this.aBoolean340 = false;
		} else {
			this.aBoolean340 = true;
			this.aFloat98 = this.aFloat99 = 1.0F;
		}
		this.anInt4225 = arg4;
	}

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lclient!ap;IIIII[BI)V")
	public Class132_Sub1_Sub1(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt4225 = arg2;
		this.anInt4227 = arg3;
		this.method3698(arg6, arg3, true, arg2, arg7);
		this.aFloat99 = (float) arg3 / (float) arg5;
		this.aBoolean340 = false;
		this.aFloat98 = (float) arg2 / (float) arg4;
		this.method3694(false, false);
	}

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lclient!ap;IIIIZ[BI)V")
	public Class132_Sub1_Sub1(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt6650 == 34037) {
			this.aFloat99 = arg4;
			this.aFloat98 = arg3;
			this.aBoolean340 = false;
		} else {
			this.aFloat98 = this.aFloat99 = 1.0F;
			this.aBoolean340 = true;
		}
		this.anInt4225 = arg3;
		this.anInt4227 = arg4;
	}
}
