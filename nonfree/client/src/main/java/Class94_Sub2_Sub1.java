import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public final class Class94_Sub2_Sub1 extends Class94_Sub2 {

	@OriginalMember(owner = "client!gv", name = "M", descriptor = "I")
	public final int anInt3664;

	@OriginalMember(owner = "client!gv", name = "ab", descriptor = "I")
	public final int anInt3671;

	@OriginalMember(owner = "client!gv", name = "W", descriptor = "Z")
	public final boolean aBoolean265;

	@OriginalMember(owner = "client!gv", name = "Y", descriptor = "F")
	public final float aFloat78;

	@OriginalMember(owner = "client!gv", name = "N", descriptor = "F")
	public final float aFloat77;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!dw;IIIII[BI)V")
	public Class94_Sub2_Sub1(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt3664 = arg2;
		this.anInt3671 = arg3;
		this.method3125(arg6, arg2, true, arg3, arg7);
		this.aBoolean265 = false;
		this.aFloat78 = (float) arg2 / (float) arg4;
		this.aFloat77 = (float) arg3 / (float) arg5;
		this.method3120(false, false);
	}

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!dw;IIIII)V")
	public Class94_Sub2_Sub1(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.aFloat78 = (float) arg2 / (float) arg4;
		this.aFloat77 = (float) arg3 / (float) arg5;
		this.anInt3671 = arg3;
		this.aBoolean265 = false;
		this.anInt3664 = arg2;
		this.method3120(false, false);
	}

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!dw;IIII[I)V")
	public Class94_Sub2_Sub1(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt3664 = arg1;
		this.anInt3671 = arg2;
		this.method3127(arg1, 0, arg2, 0, 0, arg5);
		this.aFloat78 = (float) arg1 / (float) arg3;
		this.aBoolean265 = false;
		this.aFloat77 = (float) arg2 / (float) arg4;
		this.method3120(false, false);
	}

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!dw;IIIIIIZ)V")
	public Class94_Sub2_Sub1(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt3671 = arg4;
		this.aFloat77 = (float) arg4 / (float) arg6;
		this.aFloat78 = (float) arg3 / (float) arg5;
		this.aBoolean265 = false;
		this.anInt3664 = arg3;
		this.method3120(false, false);
	}

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!dw;IIIIZ[BI)V")
	public Class94_Sub2_Sub1(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt3671 = arg4;
		if (super.anInt4672 == 34037) {
			this.aBoolean265 = false;
			this.aFloat78 = (float) arg3;
			this.aFloat77 = (float) arg4;
		} else {
			this.aFloat78 = this.aFloat77 = 1.0F;
			this.aBoolean265 = true;
		}
		this.anInt3664 = arg3;
	}

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!dw;IIII)V")
	public Class94_Sub2_Sub1(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt3671 = arg4;
		this.anInt3664 = arg3;
		if (super.anInt4672 == 34037) {
			this.aFloat77 = (float) arg4;
			this.aFloat78 = (float) arg3;
			this.aBoolean265 = false;
		} else {
			this.aFloat78 = this.aFloat77 = 1.0F;
			this.aBoolean265 = true;
		}
	}

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!dw;IIIIIZ)V")
	public Class94_Sub2_Sub1(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt3671 = arg5;
		this.anInt3664 = arg4;
		if (super.anInt4672 == 34037) {
			this.aBoolean265 = false;
			this.aFloat78 = (float) arg4;
			this.aFloat77 = (float) arg5;
		} else {
			this.aFloat78 = this.aFloat77 = 1.0F;
			this.aBoolean265 = true;
		}
	}

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!dw;IIIZ[III)V")
	public Class94_Sub2_Sub1(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt3664 = arg2;
		if (super.anInt4672 == 34037) {
			this.aBoolean265 = false;
			this.aFloat78 = (float) arg2;
			this.aFloat77 = (float) arg3;
		} else {
			this.aFloat78 = this.aFloat77 = 1.0F;
			this.aBoolean265 = true;
		}
		this.anInt3671 = arg3;
	}
}
