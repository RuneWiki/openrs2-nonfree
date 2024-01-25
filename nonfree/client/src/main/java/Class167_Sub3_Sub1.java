import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public final class Class167_Sub3_Sub1 extends Class167_Sub3 {

	@OriginalMember(owner = "client!sb", name = "S", descriptor = "F")
	public final float aFloat171;

	@OriginalMember(owner = "client!sb", name = "T", descriptor = "Z")
	public final boolean aBoolean644;

	@OriginalMember(owner = "client!sb", name = "R", descriptor = "F")
	public final float aFloat170;

	@OriginalMember(owner = "client!sb", name = "O", descriptor = "I")
	public final int anInt8741;

	@OriginalMember(owner = "client!sb", name = "P", descriptor = "I")
	public final int anInt8742;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!rs;IIIZ[III)V")
	public Class167_Sub3_Sub1(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt9270 == 34037) {
			this.aFloat171 = arg2;
			this.aBoolean644 = false;
			this.aFloat170 = arg3;
		} else {
			this.aBoolean644 = true;
			this.aFloat171 = this.aFloat170 = 1.0F;
		}
		this.anInt8741 = arg2;
		this.anInt8742 = arg3;
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!rs;IIIIIZ)V")
	public Class167_Sub3_Sub1(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (super.anInt9270 == 34037) {
			this.aFloat170 = arg5;
			this.aBoolean644 = false;
			this.aFloat171 = arg4;
		} else {
			this.aBoolean644 = true;
			this.aFloat171 = this.aFloat170 = 1.0F;
		}
		this.anInt8741 = arg4;
		this.anInt8742 = arg5;
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!rs;IIII)V")
	public Class167_Sub3_Sub1(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt8742 = arg4;
		this.anInt8741 = arg3;
		if (super.anInt9270 == 34037) {
			this.aFloat170 = arg4;
			this.aBoolean644 = false;
			this.aFloat171 = arg3;
		} else {
			this.aFloat171 = this.aFloat170 = 1.0F;
			this.aBoolean644 = true;
		}
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!rs;IIIIZ[BI)V")
	public Class167_Sub3_Sub1(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt8742 = arg4;
		this.anInt8741 = arg3;
		if (super.anInt9270 == 34037) {
			this.aFloat170 = arg4;
			this.aFloat171 = arg3;
			this.aBoolean644 = false;
		} else {
			this.aFloat171 = this.aFloat170 = 1.0F;
			this.aBoolean644 = true;
		}
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!rs;IIIIIIZ)V")
	public Class167_Sub3_Sub1(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt8741 = arg3;
		this.aFloat171 = (float) arg3 / (float) arg5;
		this.aBoolean644 = false;
		this.aFloat170 = (float) arg4 / (float) arg6;
		this.anInt8742 = arg4;
		this.method7524(false, false);
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!rs;IIII[I)V")
	public Class167_Sub3_Sub1(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt8742 = arg2;
		this.anInt8741 = arg1;
		this.method7522(0, arg1, 0, arg5, 0, arg2);
		this.aFloat171 = (float) arg1 / (float) arg3;
		this.aFloat170 = (float) arg2 / (float) arg4;
		this.aBoolean644 = false;
		this.method7524(false, false);
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!rs;IIIII)V")
	public Class167_Sub3_Sub1(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.aFloat171 = (float) arg2 / (float) arg4;
		this.anInt8741 = arg2;
		this.aBoolean644 = false;
		this.aFloat170 = (float) arg3 / (float) arg5;
		this.anInt8742 = arg3;
		this.method7524(false, false);
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!rs;IIIII[BI)V")
	public Class167_Sub3_Sub1(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt8742 = arg3;
		this.anInt8741 = arg2;
		this.method7520(arg2, arg3, arg7, true, arg6);
		this.aFloat170 = (float) arg3 / (float) arg5;
		this.aBoolean644 = false;
		this.aFloat171 = (float) arg2 / (float) arg4;
		this.method7524(false, false);
	}
}
