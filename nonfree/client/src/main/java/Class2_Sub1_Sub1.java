import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public final class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!iaa", name = "K", descriptor = "I")
	public final int anInt5128;

	@OriginalMember(owner = "client!iaa", name = "H", descriptor = "I")
	public final int anInt5127;

	@OriginalMember(owner = "client!iaa", name = "I", descriptor = "F")
	public final float aFloat118;

	@OriginalMember(owner = "client!iaa", name = "M", descriptor = "F")
	public final float aFloat119;

	@OriginalMember(owner = "client!iaa", name = "Q", descriptor = "Z")
	public final boolean aBoolean412;

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lclient!ac;IIII[I)V")
	public Class2_Sub1_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt5128 = arg1;
		this.anInt5127 = arg2;
		this.method4201(arg2, arg5, 0, 0, arg1, 0);
		this.aFloat118 = (float) arg1 / (float) arg3;
		this.aFloat119 = (float) arg2 / (float) arg4;
		this.aBoolean412 = false;
		this.method4205(false, false);
	}

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lclient!ac;IIIII)V")
	public Class2_Sub1_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.aBoolean412 = false;
		this.anInt5127 = arg3;
		this.anInt5128 = arg2;
		this.aFloat118 = (float) arg2 / (float) arg4;
		this.aFloat119 = (float) arg3 / (float) arg5;
		this.method4205(false, false);
	}

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lclient!ac;IIIIIZ)V")
	public Class2_Sub1_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt5127 = arg5;
		if (super.anInt8317 == 34037) {
			this.aFloat119 = (float) arg5;
			this.aFloat118 = (float) arg4;
			this.aBoolean412 = false;
		} else {
			this.aBoolean412 = true;
			this.aFloat118 = this.aFloat119 = 1.0F;
		}
		this.anInt5128 = arg4;
	}

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lclient!ac;IIIIZ[BI)V")
	public Class2_Sub1_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt8317 == 34037) {
			this.aBoolean412 = false;
			this.aFloat118 = (float) arg3;
			this.aFloat119 = (float) arg4;
		} else {
			this.aFloat118 = this.aFloat119 = 1.0F;
			this.aBoolean412 = true;
		}
		this.anInt5128 = arg3;
		this.anInt5127 = arg4;
	}

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lclient!ac;IIII)V")
	public Class2_Sub1_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt5128 = arg3;
		if (super.anInt8317 == 34037) {
			this.aBoolean412 = false;
			this.aFloat119 = (float) arg4;
			this.aFloat118 = (float) arg3;
		} else {
			this.aFloat118 = this.aFloat119 = 1.0F;
			this.aBoolean412 = true;
		}
		this.anInt5127 = arg4;
	}

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lclient!ac;IIIIIIZ)V")
	public Class2_Sub1_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat119 = (float) arg4 / (float) arg6;
		this.anInt5127 = arg4;
		this.aFloat118 = (float) arg3 / (float) arg5;
		this.anInt5128 = arg3;
		this.aBoolean412 = false;
		this.method4205(false, false);
	}

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lclient!ac;IIIII[BI)V")
	public Class2_Sub1_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt5127 = arg3;
		this.anInt5128 = arg2;
		this.method4200(arg2, arg7, true, arg6, arg3);
		this.aBoolean412 = false;
		this.aFloat119 = (float) arg3 / (float) arg5;
		this.aFloat118 = (float) arg2 / (float) arg4;
		this.method4205(false, false);
	}

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lclient!ac;IIIZ[III)V")
	public Class2_Sub1_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt5128 = arg2;
		if (super.anInt8317 == 34037) {
			this.aBoolean412 = false;
			this.aFloat119 = (float) arg3;
			this.aFloat118 = (float) arg2;
		} else {
			this.aFloat118 = this.aFloat119 = 1.0F;
			this.aBoolean412 = true;
		}
		this.anInt5127 = arg3;
	}
}
