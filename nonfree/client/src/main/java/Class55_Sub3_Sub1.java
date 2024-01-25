import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public final class Class55_Sub3_Sub1 extends Class55_Sub3 {

	@OriginalMember(owner = "client!tq", name = "K", descriptor = "I")
	public final int anInt6500;

	@OriginalMember(owner = "client!tq", name = "Q", descriptor = "I")
	public final int anInt6503;

	@OriginalMember(owner = "client!tq", name = "N", descriptor = "F")
	public final float aFloat100;

	@OriginalMember(owner = "client!tq", name = "I", descriptor = "Z")
	public final boolean aBoolean444;

	@OriginalMember(owner = "client!tq", name = "O", descriptor = "F")
	public final float aFloat101;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!ef;IIII[I)V")
	public Class55_Sub3_Sub1(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt6500 = arg1;
		this.anInt6503 = arg2;
		this.method5122(arg1, arg5, arg2);
		this.aFloat100 = (float) arg1 / (float) arg3;
		this.aBoolean444 = false;
		this.aFloat101 = (float) arg2 / (float) arg4;
		this.method5116(false, false);
	}

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!ef;IIIIZ[BI)V")
	public Class55_Sub3_Sub1(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt7037 == 34037) {
			this.aFloat101 = arg4;
			this.aBoolean444 = false;
			this.aFloat100 = arg3;
		} else {
			this.aBoolean444 = true;
			this.aFloat100 = this.aFloat101 = 1.0F;
		}
		this.anInt6503 = arg4;
		this.anInt6500 = arg3;
	}

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!ef;IIIII[BI)V")
	public Class55_Sub3_Sub1(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt6500 = arg2;
		this.anInt6503 = arg3;
		this.method5121(arg3, arg7, arg2, true, arg6);
		this.aFloat100 = (float) arg2 / (float) arg4;
		this.aBoolean444 = false;
		this.aFloat101 = (float) arg3 / (float) arg5;
		this.method5116(false, false);
	}

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!ef;IIIZ[I)V")
	public Class55_Sub3_Sub1(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		if (super.anInt7037 == 34037) {
			this.aFloat100 = arg2;
			this.aFloat101 = arg3;
			this.aBoolean444 = false;
		} else {
			this.aBoolean444 = true;
			this.aFloat100 = this.aFloat101 = 1.0F;
		}
		this.anInt6500 = arg2;
		this.anInt6503 = arg3;
	}

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!ef;IIIIIZ)V")
	public Class55_Sub3_Sub1(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt6500 = arg4;
		if (super.anInt7037 == 34037) {
			this.aFloat100 = arg4;
			this.aFloat101 = arg5;
			this.aBoolean444 = false;
		} else {
			this.aBoolean444 = true;
			this.aFloat100 = this.aFloat101 = 1.0F;
		}
		this.anInt6503 = arg5;
	}

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!ef;IIIIIIZ)V")
	public Class55_Sub3_Sub1(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aBoolean444 = false;
		this.aFloat101 = (float) arg4 / (float) arg6;
		this.aFloat100 = (float) arg3 / (float) arg5;
		this.anInt6500 = arg3;
		this.anInt6503 = arg4;
		this.method5116(false, false);
	}
}
