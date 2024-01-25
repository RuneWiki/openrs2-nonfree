import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public final class Class19_Sub3_Sub1 extends Class19_Sub3 {

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
	public final int anInt3967;

	@OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
	public final int anInt3966;

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "Z")
	public final boolean aBoolean299;

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "F")
	public final float aFloat49;

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "F")
	public final float aFloat48;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!ks;IIIIIZ)V")
	public Class19_Sub3_Sub1(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt3967 = arg4;
		this.anInt3966 = arg5;
		if (this.anInt4603 == 34037) {
			this.aBoolean299 = false;
			this.aFloat49 = arg4;
			this.aFloat48 = arg5;
		} else {
			this.aFloat49 = this.aFloat48 = 1.0F;
			this.aBoolean299 = true;
		}
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!ks;IIIII[BI)V")
	public Class19_Sub3_Sub1(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt3966 = arg3;
		this.anInt3967 = arg2;
		this.method3679(arg2, arg3, arg6, arg7, true);
		this.aBoolean299 = false;
		this.aFloat49 = (float) arg2 / (float) arg4;
		this.aFloat48 = (float) arg3 / (float) arg5;
		this.method3681(false, false);
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!ks;IIIIZ[BI)V")
	public Class19_Sub3_Sub1(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt3966 = arg4;
		this.anInt3967 = arg3;
		if (this.anInt4603 == 34037) {
			this.aBoolean299 = false;
			this.aFloat48 = arg4;
			this.aFloat49 = arg3;
		} else {
			this.aBoolean299 = true;
			this.aFloat49 = this.aFloat48 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!ks;IIIZ[I)V")
	public Class19_Sub3_Sub1(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt3966 = arg3;
		if (this.anInt4603 == 34037) {
			this.aBoolean299 = false;
			this.aFloat49 = arg2;
			this.aFloat48 = arg3;
		} else {
			this.aFloat49 = this.aFloat48 = 1.0F;
			this.aBoolean299 = true;
		}
		this.anInt3967 = arg2;
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!ks;IIIIIIZ)V")
	public Class19_Sub3_Sub1(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt3967 = arg3;
		this.anInt3966 = arg4;
		this.aFloat49 = (float) arg3 / (float) arg5;
		this.aFloat48 = (float) arg4 / (float) arg6;
		this.aBoolean299 = false;
		this.method3681(false, false);
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!ks;IIII[I)V")
	public Class19_Sub3_Sub1(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt3967 = arg1;
		this.anInt3966 = arg2;
		this.method3680(arg1, arg2, arg5);
		this.aFloat48 = (float) arg2 / (float) arg4;
		this.aBoolean299 = false;
		this.aFloat49 = (float) arg1 / (float) arg3;
		this.method3681(false, false);
	}
}
