import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public final class Class88_Sub2_Sub1 extends Class88_Sub2 {

	@OriginalMember(owner = "client!m", name = "H", descriptor = "F")
	public final float aFloat152;

	@OriginalMember(owner = "client!m", name = "J", descriptor = "I")
	public final int anInt6219;

	@OriginalMember(owner = "client!m", name = "L", descriptor = "F")
	public final float aFloat153;

	@OriginalMember(owner = "client!m", name = "T", descriptor = "Z")
	public final boolean aBoolean473;

	@OriginalMember(owner = "client!m", name = "O", descriptor = "I")
	public final int anInt6223;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!oea;IIIIIIZ)V")
	public Class88_Sub2_Sub1(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat152 = (float) arg4 / (float) arg6;
		this.anInt6219 = arg3;
		this.aFloat153 = (float) arg3 / (float) arg5;
		this.aBoolean473 = false;
		this.anInt6223 = arg4;
		this.method5202(false, false);
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!oea;IIIZ[III)V")
	public Class88_Sub2_Sub1(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt6219 = arg2;
		this.anInt6223 = arg3;
		if (super.anInt8317 == 34037) {
			this.aBoolean473 = false;
			this.aFloat153 = arg2;
			this.aFloat152 = arg3;
		} else {
			this.aFloat153 = this.aFloat152 = 1.0F;
			this.aBoolean473 = true;
		}
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!oea;IIIIZ[BI)V")
	public Class88_Sub2_Sub1(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt8317 == 34037) {
			this.aFloat152 = arg4;
			this.aFloat153 = arg3;
			this.aBoolean473 = false;
		} else {
			this.aFloat153 = this.aFloat152 = 1.0F;
			this.aBoolean473 = true;
		}
		this.anInt6223 = arg4;
		this.anInt6219 = arg3;
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!oea;IIIII)V")
	public Class88_Sub2_Sub1(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.aFloat152 = (float) arg3 / (float) arg5;
		this.aBoolean473 = false;
		this.anInt6219 = arg2;
		this.anInt6223 = arg3;
		this.aFloat153 = (float) arg2 / (float) arg4;
		this.method5202(false, false);
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!oea;IIII)V")
	public Class88_Sub2_Sub1(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		if (super.anInt8317 == 34037) {
			this.aFloat152 = arg4;
			this.aFloat153 = arg3;
			this.aBoolean473 = false;
		} else {
			this.aFloat153 = this.aFloat152 = 1.0F;
			this.aBoolean473 = true;
		}
		this.anInt6219 = arg3;
		this.anInt6223 = arg4;
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!oea;IIIIIZ)V")
	public Class88_Sub2_Sub1(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt6223 = arg5;
		if (super.anInt8317 == 34037) {
			this.aFloat152 = arg5;
			this.aBoolean473 = false;
			this.aFloat153 = arg4;
		} else {
			this.aBoolean473 = true;
			this.aFloat153 = this.aFloat152 = 1.0F;
		}
		this.anInt6219 = arg4;
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!oea;IIII[I)V")
	public Class88_Sub2_Sub1(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt6219 = arg1;
		this.anInt6223 = arg2;
		this.method5203(arg1, arg2, arg5);
		this.aFloat153 = (float) arg1 / (float) arg3;
		this.aFloat152 = (float) arg2 / (float) arg4;
		this.aBoolean473 = false;
		this.method5202(false, false);
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!oea;IIIII[BI)V")
	public Class88_Sub2_Sub1(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt6223 = arg3;
		this.anInt6219 = arg2;
		this.method5201(true, arg2, arg7, arg6, arg3);
		this.aFloat153 = (float) arg2 / (float) arg4;
		this.aBoolean473 = false;
		this.aFloat152 = (float) arg3 / (float) arg5;
		this.method5202(false, false);
	}
}
