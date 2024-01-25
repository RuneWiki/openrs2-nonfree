import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public final class Class23_Sub1_Sub1 extends Class23_Sub1 {

	@OriginalMember(owner = "client!ar", name = "P", descriptor = "Z")
	public final boolean aBoolean30;

	@OriginalMember(owner = "client!ar", name = "T", descriptor = "I")
	public final int anInt586;

	@OriginalMember(owner = "client!ar", name = "O", descriptor = "F")
	public final float aFloat16;

	@OriginalMember(owner = "client!ar", name = "M", descriptor = "F")
	public final float aFloat15;

	@OriginalMember(owner = "client!ar", name = "N", descriptor = "I")
	public final int anInt583;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!qj;IIIII)V")
	public Class23_Sub1_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.aBoolean30 = false;
		this.anInt586 = arg2;
		this.aFloat16 = (float) arg2 / (float) arg4;
		this.aFloat15 = (float) arg3 / (float) arg5;
		this.anInt583 = arg3;
		this.method377(false, false);
	}

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!qj;IIIIZ[BI)V")
	public Class23_Sub1_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt586 = arg3;
		this.anInt583 = arg4;
		if (super.anInt9352 == 34037) {
			this.aBoolean30 = false;
			this.aFloat16 = arg3;
			this.aFloat15 = arg4;
		} else {
			this.aFloat16 = this.aFloat15 = 1.0F;
			this.aBoolean30 = true;
		}
	}

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!qj;IIIIIIZ)V")
	public Class23_Sub1_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt586 = arg3;
		this.anInt583 = arg4;
		this.aFloat15 = (float) arg4 / (float) arg6;
		this.aBoolean30 = false;
		this.aFloat16 = (float) arg3 / (float) arg5;
		this.method377(false, false);
	}

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!qj;IIII)V")
	public Class23_Sub1_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt583 = arg4;
		this.anInt586 = arg3;
		if (super.anInt9352 == 34037) {
			this.aBoolean30 = false;
			this.aFloat16 = arg3;
			this.aFloat15 = arg4;
		} else {
			this.aFloat16 = this.aFloat15 = 1.0F;
			this.aBoolean30 = true;
		}
	}

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!qj;IIIZ[I)V")
	public Class23_Sub1_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt583 = arg3;
		this.anInt586 = arg2;
		if (super.anInt9352 == 34037) {
			this.aFloat16 = arg2;
			this.aFloat15 = arg3;
			this.aBoolean30 = false;
		} else {
			this.aBoolean30 = true;
			this.aFloat16 = this.aFloat15 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!qj;IIIII[BI)V")
	public Class23_Sub1_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt586 = arg2;
		this.anInt583 = arg3;
		this.method371(arg7, true, arg3, arg6, arg2);
		this.aFloat16 = (float) arg2 / (float) arg4;
		this.aBoolean30 = false;
		this.aFloat15 = (float) arg3 / (float) arg5;
		this.method377(false, false);
	}

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!qj;IIIIIZ)V")
	public Class23_Sub1_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt586 = arg4;
		if (super.anInt9352 == 34037) {
			this.aBoolean30 = false;
			this.aFloat16 = arg4;
			this.aFloat15 = arg5;
		} else {
			this.aFloat16 = this.aFloat15 = 1.0F;
			this.aBoolean30 = true;
		}
		this.anInt583 = arg5;
	}

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!qj;IIII[I)V")
	public Class23_Sub1_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt583 = arg2;
		this.anInt586 = arg1;
		this.method373(arg1, arg2, arg5);
		this.aBoolean30 = false;
		this.aFloat15 = (float) arg2 / (float) arg4;
		this.aFloat16 = (float) arg1 / (float) arg3;
		this.method377(false, false);
	}
}
