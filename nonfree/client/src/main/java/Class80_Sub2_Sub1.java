import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public final class Class80_Sub2_Sub1 extends Class80_Sub2 {

	@OriginalMember(owner = "client!rc", name = "R", descriptor = "I")
	public final int anInt8362;

	@OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
	public final int anInt8361;

	@OriginalMember(owner = "client!rc", name = "T", descriptor = "Z")
	public final boolean aBoolean710;

	@OriginalMember(owner = "client!rc", name = "O", descriptor = "F")
	public final float aFloat168;

	@OriginalMember(owner = "client!rc", name = "S", descriptor = "F")
	public final float aFloat169;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!ck;IIII[I)V")
	public Class80_Sub2_Sub1(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt8362 = arg2;
		this.anInt8361 = arg1;
		this.method7144(arg5, arg1, 0, 0, 0, arg2);
		this.aBoolean710 = false;
		this.aFloat168 = (float) arg2 / (float) arg4;
		this.aFloat169 = (float) arg1 / (float) arg3;
		this.method7150(false, false);
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!ck;IIIZ[III)V")
	public Class80_Sub2_Sub1(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt8362 = arg3;
		this.anInt8361 = arg2;
		if (super.anInt8338 == 34037) {
			this.aBoolean710 = false;
			this.aFloat168 = (float) arg3;
			this.aFloat169 = (float) arg2;
		} else {
			this.aBoolean710 = true;
			this.aFloat169 = this.aFloat168 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!ck;IIIII[BI)V")
	public Class80_Sub2_Sub1(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt8361 = arg2;
		this.anInt8362 = arg3;
		this.method7151(arg6, arg3, arg2, true, arg7);
		this.aFloat168 = (float) arg3 / (float) arg5;
		this.aBoolean710 = false;
		this.aFloat169 = (float) arg2 / (float) arg4;
		this.method7150(false, false);
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!ck;IIIIIZ)V")
	public Class80_Sub2_Sub1(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (super.anInt8338 == 34037) {
			this.aFloat168 = (float) arg5;
			this.aFloat169 = (float) arg4;
			this.aBoolean710 = false;
		} else {
			this.aFloat169 = this.aFloat168 = 1.0F;
			this.aBoolean710 = true;
		}
		this.anInt8362 = arg5;
		this.anInt8361 = arg4;
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!ck;IIII)V")
	public Class80_Sub2_Sub1(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt8362 = arg4;
		if (super.anInt8338 == 34037) {
			this.aBoolean710 = false;
			this.aFloat168 = (float) arg4;
			this.aFloat169 = (float) arg3;
		} else {
			this.aFloat169 = this.aFloat168 = 1.0F;
			this.aBoolean710 = true;
		}
		this.anInt8361 = arg3;
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!ck;IIIIIIZ)V")
	public Class80_Sub2_Sub1(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt8362 = arg4;
		this.aBoolean710 = false;
		this.aFloat169 = (float) arg3 / (float) arg5;
		this.anInt8361 = arg3;
		this.aFloat168 = (float) arg4 / (float) arg6;
		this.method7150(false, false);
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!ck;IIIII)V")
	public Class80_Sub2_Sub1(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.aBoolean710 = false;
		this.anInt8362 = arg3;
		this.anInt8361 = arg2;
		this.aFloat168 = (float) arg3 / (float) arg5;
		this.aFloat169 = (float) arg2 / (float) arg4;
		this.method7150(false, false);
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!ck;IIIIZ[BI)V")
	public Class80_Sub2_Sub1(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt8338 == 34037) {
			this.aFloat168 = (float) arg4;
			this.aBoolean710 = false;
			this.aFloat169 = (float) arg3;
		} else {
			this.aFloat169 = this.aFloat168 = 1.0F;
			this.aBoolean710 = true;
		}
		this.anInt8361 = arg3;
		this.anInt8362 = arg4;
	}
}
