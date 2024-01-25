import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public final class Class11_Sub1_Sub1 extends Class11_Sub1 {

	@OriginalMember(owner = "client!an", name = "o", descriptor = "I")
	public final int anInt368;

	@OriginalMember(owner = "client!an", name = "l", descriptor = "F")
	public final float aFloat9;

	@OriginalMember(owner = "client!an", name = "m", descriptor = "F")
	public final float aFloat10;

	@OriginalMember(owner = "client!an", name = "n", descriptor = "Z")
	public final boolean aBoolean21;

	@OriginalMember(owner = "client!an", name = "p", descriptor = "I")
	public final int anInt369;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!po;IIIIIZ)V")
	public Class11_Sub1_Sub1(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt368 = arg5;
		if (this.anInt3902 == 34037) {
			this.aBoolean21 = false;
			this.aFloat9 = arg5;
			this.aFloat10 = arg4;
		} else {
			this.aFloat10 = this.aFloat9 = 1.0F;
			this.aBoolean21 = true;
		}
		this.anInt369 = arg4;
	}

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!po;IIII[I)V")
	public Class11_Sub1_Sub1(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt368 = arg2;
		this.anInt369 = arg1;
		this.method389(arg1, arg2, arg5, arg1);
		this.aFloat9 = (float) arg2 / (float) arg4;
		this.aFloat10 = (float) arg1 / (float) arg3;
		this.aBoolean21 = false;
		this.method387(false, false);
	}

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!po;IIIZ[I)V")
	public Class11_Sub1_Sub1(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		if (this.anInt3902 == 34037) {
			this.aFloat9 = arg3;
			this.aBoolean21 = false;
			this.aFloat10 = arg2;
		} else {
			this.aFloat10 = this.aFloat9 = 1.0F;
			this.aBoolean21 = true;
		}
		this.anInt368 = arg3;
		this.anInt369 = arg2;
	}

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!po;IIIIZ[BI)V")
	public Class11_Sub1_Sub1(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (this.anInt3902 == 34037) {
			this.aFloat9 = arg4;
			this.aBoolean21 = false;
			this.aFloat10 = arg3;
		} else {
			this.aBoolean21 = true;
			this.aFloat10 = this.aFloat9 = 1.0F;
		}
		this.anInt369 = arg3;
		this.anInt368 = arg4;
	}

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!po;IIIII[BI)V")
	public Class11_Sub1_Sub1(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt369 = arg2;
		this.anInt368 = arg3;
		this.method388(arg2, arg3, arg6, arg7, true);
		this.aBoolean21 = false;
		this.aFloat10 = (float) arg2 / (float) arg4;
		this.aFloat9 = (float) arg3 / (float) arg5;
		this.method387(false, false);
	}

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!po;IIIIIIZ)V")
	public Class11_Sub1_Sub1(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat9 = (float) arg4 / (float) arg6;
		this.anInt368 = arg4;
		this.aFloat10 = (float) arg3 / (float) arg5;
		this.anInt369 = arg3;
		this.aBoolean21 = false;
		this.method387(false, false);
	}
}
