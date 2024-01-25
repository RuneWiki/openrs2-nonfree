import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public final class Class44_Sub1_Sub1 extends Class44_Sub1 {

	@OriginalMember(owner = "client!gda", name = "L", descriptor = "I")
	public final int anInt3730;

	@OriginalMember(owner = "client!gda", name = "F", descriptor = "I")
	public final int anInt3729;

	@OriginalMember(owner = "client!gda", name = "O", descriptor = "F")
	public final float aFloat69;

	@OriginalMember(owner = "client!gda", name = "E", descriptor = "F")
	public final float aFloat68;

	@OriginalMember(owner = "client!gda", name = "M", descriptor = "Z")
	public final boolean aBoolean307;

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!ml;IIIZ[III)V")
	public Class44_Sub1_Sub1(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt3730 = arg2;
		this.anInt3729 = arg3;
		if (super.anInt10474 == 34037) {
			this.aFloat69 = (float) arg3;
			this.aFloat68 = (float) arg2;
			this.aBoolean307 = false;
		} else {
			this.aFloat68 = this.aFloat69 = 1.0F;
			this.aBoolean307 = true;
		}
	}

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!ml;IIIII)V")
	public Class44_Sub1_Sub1(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.aFloat68 = (float) arg2 / (float) arg4;
		this.anInt3729 = arg3;
		this.anInt3730 = arg2;
		this.aBoolean307 = false;
		this.aFloat69 = (float) arg3 / (float) arg5;
		this.method3476(false, false);
	}

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!ml;IIIIZ[BI)V")
	public Class44_Sub1_Sub1(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt3730 = arg3;
		this.anInt3729 = arg4;
		if (super.anInt10474 == 34037) {
			this.aBoolean307 = false;
			this.aFloat68 = (float) arg3;
			this.aFloat69 = (float) arg4;
		} else {
			this.aBoolean307 = true;
			this.aFloat68 = this.aFloat69 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!ml;IIIIIZ)V")
	public Class44_Sub1_Sub1(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt3730 = arg4;
		if (super.anInt10474 == 34037) {
			this.aBoolean307 = false;
			this.aFloat68 = (float) arg4;
			this.aFloat69 = (float) arg5;
		} else {
			this.aFloat68 = this.aFloat69 = 1.0F;
			this.aBoolean307 = true;
		}
		this.anInt3729 = arg5;
	}

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!ml;IIIIIIZ)V")
	public Class44_Sub1_Sub1(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat69 = (float) arg4 / (float) arg6;
		this.anInt3730 = arg3;
		this.aFloat68 = (float) arg3 / (float) arg5;
		this.aBoolean307 = false;
		this.anInt3729 = arg4;
		this.method3476(false, false);
	}

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!ml;IIIII[BI)V")
	public Class44_Sub1_Sub1(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt3729 = arg3;
		this.anInt3730 = arg2;
		this.method3475(arg6, arg7, arg2, true, arg3);
		this.aFloat69 = (float) arg3 / (float) arg5;
		this.aFloat68 = (float) arg2 / (float) arg4;
		this.aBoolean307 = false;
		this.method3476(false, false);
	}

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!ml;IIII)V")
	public Class44_Sub1_Sub1(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt3730 = arg3;
		if (super.anInt10474 == 34037) {
			this.aFloat68 = (float) arg3;
			this.aFloat69 = (float) arg4;
			this.aBoolean307 = false;
		} else {
			this.aBoolean307 = true;
			this.aFloat68 = this.aFloat69 = 1.0F;
		}
		this.anInt3729 = arg4;
	}

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!ml;IIII[I)V")
	public Class44_Sub1_Sub1(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt3730 = arg1;
		this.anInt3729 = arg2;
		this.method3479(arg2, 0, 0, arg5, 0, arg1);
		this.aBoolean307 = false;
		this.aFloat68 = (float) arg1 / (float) arg3;
		this.aFloat69 = (float) arg2 / (float) arg4;
		this.method3476(false, false);
	}
}
