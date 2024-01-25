import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public final class Class21_Sub2_Sub1 extends Class21_Sub2 {

	@OriginalMember(owner = "client!ls", name = "Q", descriptor = "I")
	public final int anInt4202;

	@OriginalMember(owner = "client!ls", name = "S", descriptor = "I")
	public final int anInt4204;

	@OriginalMember(owner = "client!ls", name = "J", descriptor = "F")
	public final float aFloat72;

	@OriginalMember(owner = "client!ls", name = "N", descriptor = "F")
	public final float aFloat73;

	@OriginalMember(owner = "client!ls", name = "P", descriptor = "Z")
	public final boolean aBoolean331;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!qg;IIIII[BI)V")
	public Class21_Sub2_Sub1(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt4202 = arg3;
		this.anInt4204 = arg2;
		this.method3486(true, arg6, arg7, arg3, arg2);
		this.aFloat72 = (float) arg2 / (float) arg4;
		this.aFloat73 = (float) arg3 / (float) arg5;
		this.aBoolean331 = false;
		this.method3487(false, false);
	}

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!qg;IIIZ[I)V")
	public Class21_Sub2_Sub1(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt4204 = arg2;
		if (super.anInt4557 == 34037) {
			this.aBoolean331 = false;
			this.aFloat73 = arg3;
			this.aFloat72 = arg2;
		} else {
			this.aFloat72 = this.aFloat73 = 1.0F;
			this.aBoolean331 = true;
		}
		this.anInt4202 = arg3;
	}

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!qg;IIIIIIZ)V")
	public Class21_Sub2_Sub1(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat73 = (float) arg4 / (float) arg6;
		this.anInt4202 = arg4;
		this.anInt4204 = arg3;
		this.aBoolean331 = false;
		this.aFloat72 = (float) arg3 / (float) arg5;
		this.method3487(false, false);
	}

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!qg;IIIIZ[BI)V")
	public Class21_Sub2_Sub1(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt4202 = arg4;
		if (super.anInt4557 == 34037) {
			this.aFloat73 = arg4;
			this.aBoolean331 = false;
			this.aFloat72 = arg3;
		} else {
			this.aBoolean331 = true;
			this.aFloat72 = this.aFloat73 = 1.0F;
		}
		this.anInt4204 = arg3;
	}

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!qg;IIII[I)V")
	public Class21_Sub2_Sub1(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt4202 = arg2;
		this.anInt4204 = arg1;
		this.method3488(arg1, arg5, arg2);
		this.aBoolean331 = false;
		this.aFloat72 = (float) arg1 / (float) arg3;
		this.aFloat73 = (float) arg2 / (float) arg4;
		this.method3487(false, false);
	}

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!qg;IIIIIZ)V")
	public Class21_Sub2_Sub1(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt4204 = arg4;
		this.anInt4202 = arg5;
		if (super.anInt4557 == 34037) {
			this.aBoolean331 = false;
			this.aFloat73 = arg5;
			this.aFloat72 = arg4;
		} else {
			this.aFloat72 = this.aFloat73 = 1.0F;
			this.aBoolean331 = true;
		}
	}
}
