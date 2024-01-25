import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public final class Class52_Sub1_Sub1 extends Class52_Sub1 {

	@OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
	public final int anInt1672;

	@OriginalMember(owner = "client!ck", name = "Q", descriptor = "I")
	public final int anInt1673;

	@OriginalMember(owner = "client!ck", name = "P", descriptor = "F")
	public final float aFloat35;

	@OriginalMember(owner = "client!ck", name = "R", descriptor = "F")
	public final float aFloat36;

	@OriginalMember(owner = "client!ck", name = "O", descriptor = "Z")
	public final boolean aBoolean136;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!ag;IIIIIZ)V")
	public Class52_Sub1_Sub1(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt1672 = arg5;
		this.anInt1673 = arg4;
		if (super.anInt6859 == 34037) {
			this.aFloat35 = arg5;
			this.aFloat36 = arg4;
			this.aBoolean136 = false;
		} else {
			this.aFloat36 = this.aFloat35 = 1.0F;
			this.aBoolean136 = true;
		}
	}

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!ag;IIIIIIZ)V")
	public Class52_Sub1_Sub1(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat35 = (float) arg4 / (float) arg6;
		this.anInt1672 = arg4;
		this.aBoolean136 = false;
		this.aFloat36 = (float) arg3 / (float) arg5;
		this.anInt1673 = arg3;
		this.method1504(false, false);
	}

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!ag;IIIZ[I)V")
	public Class52_Sub1_Sub1(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt1673 = arg2;
		if (super.anInt6859 == 34037) {
			this.aFloat35 = arg3;
			this.aFloat36 = arg2;
			this.aBoolean136 = false;
		} else {
			this.aFloat36 = this.aFloat35 = 1.0F;
			this.aBoolean136 = true;
		}
		this.anInt1672 = arg3;
	}

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!ag;IIIIZ[BI)V")
	public Class52_Sub1_Sub1(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt1672 = arg4;
		if (super.anInt6859 == 34037) {
			this.aFloat36 = arg3;
			this.aFloat35 = arg4;
			this.aBoolean136 = false;
		} else {
			this.aBoolean136 = true;
			this.aFloat36 = this.aFloat35 = 1.0F;
		}
		this.anInt1673 = arg3;
	}

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!ag;IIII[I)V")
	public Class52_Sub1_Sub1(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt1672 = arg2;
		this.anInt1673 = arg1;
		this.method1502(arg5, arg2, arg1);
		this.aBoolean136 = false;
		this.aFloat35 = (float) arg2 / (float) arg4;
		this.aFloat36 = (float) arg1 / (float) arg3;
		this.method1504(false, false);
	}

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!ag;IIIII)V")
	public Class52_Sub1_Sub1(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt1672 = arg3;
		this.anInt1673 = arg2;
		this.aBoolean136 = false;
		this.aFloat35 = (float) arg3 / (float) arg5;
		this.aFloat36 = (float) arg2 / (float) arg4;
		this.method1504(false, false);
	}

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!ag;IIIII[BI)V")
	public Class52_Sub1_Sub1(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt1673 = arg2;
		this.anInt1672 = arg3;
		this.method1501(arg2, arg6, arg7, true, arg3);
		this.aFloat36 = (float) arg2 / (float) arg4;
		this.aBoolean136 = false;
		this.aFloat35 = (float) arg3 / (float) arg5;
		this.method1504(false, false);
	}

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!ag;IIII)V")
	public Class52_Sub1_Sub1(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt1673 = arg3;
		this.anInt1672 = arg4;
		if (super.anInt6859 == 34037) {
			this.aBoolean136 = false;
			this.aFloat35 = arg4;
			this.aFloat36 = arg3;
		} else {
			this.aFloat36 = this.aFloat35 = 1.0F;
			this.aBoolean136 = true;
		}
	}
}
