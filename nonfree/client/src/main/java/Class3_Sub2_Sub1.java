import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public final class Class3_Sub2_Sub1 extends Class3_Sub2 {

	@OriginalMember(owner = "client!oi", name = "G", descriptor = "I")
	public final int anInt5012;

	@OriginalMember(owner = "client!oi", name = "P", descriptor = "I")
	public final int anInt5014;

	@OriginalMember(owner = "client!oi", name = "O", descriptor = "Z")
	public final boolean aBoolean341;

	@OriginalMember(owner = "client!oi", name = "K", descriptor = "F")
	public final float aFloat72;

	@OriginalMember(owner = "client!oi", name = "Q", descriptor = "F")
	public final float aFloat73;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!kd;IIIZ[I)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt5012 = arg3;
		this.anInt5014 = arg2;
		if (super.anInt4987 == 34037) {
			this.aFloat73 = arg2;
			this.aBoolean341 = false;
			this.aFloat72 = arg3;
		} else {
			this.aBoolean341 = true;
			this.aFloat73 = this.aFloat72 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!kd;IIIII[BI)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt5014 = arg2;
		this.anInt5012 = arg3;
		this.method4158(arg6, true, arg2, arg7, arg3);
		this.aFloat72 = (float) arg3 / (float) arg5;
		this.aBoolean341 = false;
		this.aFloat73 = (float) arg2 / (float) arg4;
		this.method4163(false, false);
	}

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!kd;IIIIIIZ)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt5012 = arg4;
		this.aBoolean341 = false;
		this.anInt5014 = arg3;
		this.aFloat72 = (float) arg4 / (float) arg6;
		this.aFloat73 = (float) arg3 / (float) arg5;
		this.method4163(false, false);
	}

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!kd;IIIIZ[BI)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt5014 = arg3;
		this.anInt5012 = arg4;
		if (super.anInt4987 == 34037) {
			this.aFloat72 = arg4;
			this.aFloat73 = arg3;
			this.aBoolean341 = false;
		} else {
			this.aBoolean341 = true;
			this.aFloat73 = this.aFloat72 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!kd;IIII[I)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt5014 = arg1;
		this.anInt5012 = arg2;
		this.method4157(arg5, arg2, arg1);
		this.aFloat72 = (float) arg2 / (float) arg4;
		this.aFloat73 = (float) arg1 / (float) arg3;
		this.aBoolean341 = false;
		this.method4163(false, false);
	}

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!kd;IIIIIZ)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt5012 = arg5;
		this.anInt5014 = arg4;
		if (super.anInt4987 == 34037) {
			this.aFloat72 = arg5;
			this.aFloat73 = arg4;
			this.aBoolean341 = false;
		} else {
			this.aFloat73 = this.aFloat72 = 1.0F;
			this.aBoolean341 = true;
		}
	}
}
