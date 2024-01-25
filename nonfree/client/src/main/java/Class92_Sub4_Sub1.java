import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public final class Class92_Sub4_Sub1 extends Class92_Sub4 {

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
	public final int anInt3884;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
	public final int anInt3883;

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "Z")
	public final boolean aBoolean305;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "F")
	public final float aFloat53;

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "F")
	public final float aFloat54;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!hd;IIIZ[I)V")
	public Class92_Sub4_Sub1(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt3884 = arg2;
		this.anInt3883 = arg3;
		if (this.anInt3876 == 34037) {
			this.aBoolean305 = false;
			this.aFloat53 = arg3;
			this.aFloat54 = arg2;
		} else {
			this.aFloat54 = this.aFloat53 = 1.0F;
			this.aBoolean305 = true;
		}
	}

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!hd;IIIIZ[BI)V")
	public Class92_Sub4_Sub1(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (this.anInt3876 == 34037) {
			this.aBoolean305 = false;
			this.aFloat53 = arg4;
			this.aFloat54 = arg3;
		} else {
			this.aFloat54 = this.aFloat53 = 1.0F;
			this.aBoolean305 = true;
		}
		this.anInt3884 = arg3;
		this.anInt3883 = arg4;
	}

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!hd;IIIII[BI)V")
	public Class92_Sub4_Sub1(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt3884 = arg2;
		this.anInt3883 = arg3;
		this.method3531(arg2, arg3, arg6, arg7, true);
		this.aFloat53 = (float) arg3 / (float) arg5;
		this.aBoolean305 = false;
		this.aFloat54 = (float) arg2 / (float) arg4;
	}

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!hd;IIII[I)V")
	public Class92_Sub4_Sub1(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt3884 = arg1;
		this.anInt3883 = arg2;
		this.method3529(arg1, arg2, arg5, arg1);
		this.aBoolean305 = false;
		this.aFloat53 = (float) arg2 / (float) arg4;
		this.aFloat54 = (float) arg1 / (float) arg3;
	}

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!hd;IIIIIZ)V")
	public Class92_Sub4_Sub1(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (this.anInt3876 == 34037) {
			this.aFloat53 = arg5;
			this.aBoolean305 = false;
			this.aFloat54 = arg4;
		} else {
			this.aBoolean305 = true;
			this.aFloat54 = this.aFloat53 = 1.0F;
		}
		this.anInt3884 = arg4;
		this.anInt3883 = arg5;
	}

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!hd;IIIIIIZ)V")
	public Class92_Sub4_Sub1(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat53 = (float) arg4 / (float) arg6;
		this.aBoolean305 = false;
		this.aFloat54 = (float) arg3 / (float) arg5;
		this.anInt3883 = arg4;
		this.anInt3884 = arg3;
	}
}
