import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public final class Class50_Sub1_Sub1 extends Class50_Sub1 {

	@OriginalMember(owner = "client!cea", name = "I", descriptor = "I")
	public final int anInt1674;

	@OriginalMember(owner = "client!cea", name = "N", descriptor = "I")
	public final int anInt1677;

	@OriginalMember(owner = "client!cea", name = "T", descriptor = "F")
	public final float aFloat58;

	@OriginalMember(owner = "client!cea", name = "Q", descriptor = "F")
	public final float aFloat57;

	@OriginalMember(owner = "client!cea", name = "J", descriptor = "Z")
	public final boolean aBoolean123;

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Lclient!er;IIIIZ[BI)V")
	public Class50_Sub1_Sub1(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt1674 = arg3;
		this.anInt1677 = arg4;
		if (super.anInt7830 == 34037) {
			this.aBoolean123 = false;
			this.aFloat57 = arg3;
			this.aFloat58 = arg4;
		} else {
			this.aFloat57 = this.aFloat58 = 1.0F;
			this.aBoolean123 = true;
		}
	}

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Lclient!er;IIII)V")
	public Class50_Sub1_Sub1(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		if (super.anInt7830 == 34037) {
			this.aBoolean123 = false;
			this.aFloat58 = arg4;
			this.aFloat57 = arg3;
		} else {
			this.aFloat57 = this.aFloat58 = 1.0F;
			this.aBoolean123 = true;
		}
		this.anInt1677 = arg4;
		this.anInt1674 = arg3;
	}

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Lclient!er;IIIIIIZ)V")
	public Class50_Sub1_Sub1(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aBoolean123 = false;
		this.aFloat58 = (float) arg4 / (float) arg6;
		this.anInt1674 = arg3;
		this.aFloat57 = (float) arg3 / (float) arg5;
		this.anInt1677 = arg4;
		this.method1507(false, false);
	}

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Lclient!er;IIIII)V")
	public Class50_Sub1_Sub1(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt1677 = arg3;
		this.aFloat58 = (float) arg3 / (float) arg5;
		this.aBoolean123 = false;
		this.anInt1674 = arg2;
		this.aFloat57 = (float) arg2 / (float) arg4;
		this.method1507(false, false);
	}

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Lclient!er;IIIII[BI)V")
	public Class50_Sub1_Sub1(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt1677 = arg3;
		this.anInt1674 = arg2;
		this.method1504(arg3, true, arg2, arg7, arg6);
		this.aFloat57 = (float) arg2 / (float) arg4;
		this.aFloat58 = (float) arg3 / (float) arg5;
		this.aBoolean123 = false;
		this.method1507(false, false);
	}

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Lclient!er;IIIZ[III)V")
	public Class50_Sub1_Sub1(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt1677 = arg3;
		if (super.anInt7830 == 34037) {
			this.aFloat57 = arg2;
			this.aFloat58 = arg3;
			this.aBoolean123 = false;
		} else {
			this.aFloat57 = this.aFloat58 = 1.0F;
			this.aBoolean123 = true;
		}
		this.anInt1674 = arg2;
	}

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Lclient!er;IIII[I)V")
	public Class50_Sub1_Sub1(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt1674 = arg1;
		this.anInt1677 = arg2;
		this.method1501(arg5, arg1, arg2);
		this.aBoolean123 = false;
		this.aFloat57 = (float) arg1 / (float) arg3;
		this.aFloat58 = (float) arg2 / (float) arg4;
		this.method1507(false, false);
	}

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Lclient!er;IIIIIZ)V")
	public Class50_Sub1_Sub1(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt1674 = arg4;
		this.anInt1677 = arg5;
		if (super.anInt7830 == 34037) {
			this.aBoolean123 = false;
			this.aFloat58 = arg5;
			this.aFloat57 = arg4;
		} else {
			this.aFloat57 = this.aFloat58 = 1.0F;
			this.aBoolean123 = true;
		}
	}
}
