import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public final class Class11_Sub2_Sub1 extends Class11_Sub2 {

	@OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
	public final int anInt1695;

	@OriginalMember(owner = "client!ch", name = "O", descriptor = "I")
	public final int anInt1697;

	@OriginalMember(owner = "client!ch", name = "L", descriptor = "F")
	public final float aFloat19;

	@OriginalMember(owner = "client!ch", name = "N", descriptor = "Z")
	public final boolean aBoolean121;

	@OriginalMember(owner = "client!ch", name = "J", descriptor = "F")
	public final float aFloat18;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!ji;IIIII[BI)V")
	public Class11_Sub2_Sub1(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt1695 = arg3;
		this.anInt1697 = arg2;
		this.method1641(arg6, true, arg2, arg7, arg3);
		this.aFloat19 = (float) arg2 / (float) arg4;
		this.aBoolean121 = false;
		this.aFloat18 = (float) arg3 / (float) arg5;
		this.method1633(false, false);
	}

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!ji;IIII)V")
	public Class11_Sub2_Sub1(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		if (super.anInt9053 == 34037) {
			this.aFloat18 = arg4;
			this.aBoolean121 = false;
			this.aFloat19 = arg3;
		} else {
			this.aBoolean121 = true;
			this.aFloat19 = this.aFloat18 = 1.0F;
		}
		this.anInt1697 = arg3;
		this.anInt1695 = arg4;
	}

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!ji;IIIIZ[BI)V")
	public Class11_Sub2_Sub1(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt9053 == 34037) {
			this.aFloat18 = arg4;
			this.aFloat19 = arg3;
			this.aBoolean121 = false;
		} else {
			this.aFloat19 = this.aFloat18 = 1.0F;
			this.aBoolean121 = true;
		}
		this.anInt1697 = arg3;
		this.anInt1695 = arg4;
	}

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!ji;IIII[I)V")
	public Class11_Sub2_Sub1(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt1695 = arg2;
		this.anInt1697 = arg1;
		this.method1640(arg1, arg2, arg5);
		this.aBoolean121 = false;
		this.aFloat18 = (float) arg2 / (float) arg4;
		this.aFloat19 = (float) arg1 / (float) arg3;
		this.method1633(false, false);
	}

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!ji;IIIZ[I)V")
	public Class11_Sub2_Sub1(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt1695 = arg3;
		if (super.anInt9053 == 34037) {
			this.aFloat19 = arg2;
			this.aBoolean121 = false;
			this.aFloat18 = arg3;
		} else {
			this.aFloat19 = this.aFloat18 = 1.0F;
			this.aBoolean121 = true;
		}
		this.anInt1697 = arg2;
	}

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!ji;IIIIIIZ)V")
	public Class11_Sub2_Sub1(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aBoolean121 = false;
		this.aFloat18 = (float) arg4 / (float) arg6;
		this.aFloat19 = (float) arg3 / (float) arg5;
		this.anInt1697 = arg3;
		this.anInt1695 = arg4;
		this.method1633(false, false);
	}

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!ji;IIIIIZ)V")
	public Class11_Sub2_Sub1(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt1695 = arg5;
		this.anInt1697 = arg4;
		if (super.anInt9053 == 34037) {
			this.aBoolean121 = false;
			this.aFloat19 = arg4;
			this.aFloat18 = arg5;
		} else {
			this.aFloat19 = this.aFloat18 = 1.0F;
			this.aBoolean121 = true;
		}
	}

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!ji;IIIII)V")
	public Class11_Sub2_Sub1(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.aFloat19 = (float) arg2 / (float) arg4;
		this.aFloat18 = (float) arg3 / (float) arg5;
		this.anInt1695 = arg3;
		this.anInt1697 = arg2;
		this.aBoolean121 = false;
		this.method1633(false, false);
	}
}
