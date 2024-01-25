import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public final class Class137_Sub1_Sub1 extends Class137_Sub1 {

	@OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
	public final int anInt3919;

	@OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
	public final int anInt3918;

	@OriginalMember(owner = "client!ld", name = "P", descriptor = "F")
	public final float aFloat57;

	@OriginalMember(owner = "client!ld", name = "T", descriptor = "F")
	public final float aFloat58;

	@OriginalMember(owner = "client!ld", name = "B", descriptor = "Z")
	public final boolean aBoolean289;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!nq;IIIII[BI)V")
	public Class137_Sub1_Sub1(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt3919 = arg3;
		this.anInt3918 = arg2;
		this.method3350(arg3, arg6, arg2, arg7, true);
		this.aFloat57 = (float) arg3 / (float) arg5;
		this.aFloat58 = (float) arg2 / (float) arg4;
		this.aBoolean289 = false;
		this.method3346(false, false);
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!nq;IIII[I)V")
	public Class137_Sub1_Sub1(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt3919 = arg2;
		this.anInt3918 = arg1;
		this.method3348(arg5, arg2, arg1);
		this.aBoolean289 = false;
		this.aFloat58 = (float) arg1 / (float) arg3;
		this.aFloat57 = (float) arg2 / (float) arg4;
		this.method3346(false, false);
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!nq;IIIIIIZ)V")
	public Class137_Sub1_Sub1(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat57 = (float) arg4 / (float) arg6;
		this.aBoolean289 = false;
		this.anInt3919 = arg4;
		this.anInt3918 = arg3;
		this.aFloat58 = (float) arg3 / (float) arg5;
		this.method3346(false, false);
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!nq;IIIIZ[BI)V")
	public Class137_Sub1_Sub1(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt7136 == 34037) {
			this.aBoolean289 = false;
			this.aFloat57 = arg4;
			this.aFloat58 = arg3;
		} else {
			this.aBoolean289 = true;
			this.aFloat58 = this.aFloat57 = 1.0F;
		}
		this.anInt3918 = arg3;
		this.anInt3919 = arg4;
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!nq;IIIIIZ)V")
	public Class137_Sub1_Sub1(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt3918 = arg4;
		this.anInt3919 = arg5;
		if (super.anInt7136 == 34037) {
			this.aFloat57 = arg5;
			this.aFloat58 = arg4;
			this.aBoolean289 = false;
		} else {
			this.aBoolean289 = true;
			this.aFloat58 = this.aFloat57 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!nq;IIIZ[I)V")
	public Class137_Sub1_Sub1(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt3918 = arg2;
		if (super.anInt7136 == 34037) {
			this.aBoolean289 = false;
			this.aFloat57 = arg3;
			this.aFloat58 = arg2;
		} else {
			this.aFloat58 = this.aFloat57 = 1.0F;
			this.aBoolean289 = true;
		}
		this.anInt3919 = arg3;
	}
}
