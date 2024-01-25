import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public final class Class125_Sub1_Sub1 extends Class125_Sub1 {

	@OriginalMember(owner = "client!vt", name = "G", descriptor = "F")
	public final float aFloat197;

	@OriginalMember(owner = "client!vt", name = "I", descriptor = "I")
	public final int anInt10869;

	@OriginalMember(owner = "client!vt", name = "M", descriptor = "Z")
	public final boolean aBoolean738;

	@OriginalMember(owner = "client!vt", name = "J", descriptor = "F")
	public final float aFloat196;

	@OriginalMember(owner = "client!vt", name = "K", descriptor = "I")
	public final int anInt10870;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!aq;IIIIIIZ)V")
	public Class125_Sub1_Sub1(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat197 = (float) arg3 / (float) arg5;
		this.anInt10869 = arg4;
		this.aBoolean738 = false;
		this.aFloat196 = (float) arg4 / (float) arg6;
		this.anInt10870 = arg3;
		this.method9224(false, false);
	}

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!aq;IIIZ[III)V")
	public Class125_Sub1_Sub1(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt10870 = arg2;
		if (super.anInt10843 == 34037) {
			this.aFloat197 = (float) arg2;
			this.aFloat196 = (float) arg3;
			this.aBoolean738 = false;
		} else {
			this.aFloat197 = this.aFloat196 = 1.0F;
			this.aBoolean738 = true;
		}
		this.anInt10869 = arg3;
	}

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!aq;IIIII)V")
	public Class125_Sub1_Sub1(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt10869 = arg3;
		this.aFloat196 = (float) arg3 / (float) arg5;
		this.aFloat197 = (float) arg2 / (float) arg4;
		this.aBoolean738 = false;
		this.anInt10870 = arg2;
		this.method9224(false, false);
	}

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!aq;IIIIIZ)V")
	public Class125_Sub1_Sub1(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (super.anInt10843 == 34037) {
			this.aBoolean738 = false;
			this.aFloat197 = (float) arg4;
			this.aFloat196 = (float) arg5;
		} else {
			this.aFloat197 = this.aFloat196 = 1.0F;
			this.aBoolean738 = true;
		}
		this.anInt10869 = arg5;
		this.anInt10870 = arg4;
	}

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!aq;IIIIZ[BI)V")
	public Class125_Sub1_Sub1(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt10870 = arg3;
		this.anInt10869 = arg4;
		if (super.anInt10843 == 34037) {
			this.aBoolean738 = false;
			this.aFloat197 = (float) arg3;
			this.aFloat196 = (float) arg4;
		} else {
			this.aFloat197 = this.aFloat196 = 1.0F;
			this.aBoolean738 = true;
		}
	}

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!aq;IIII)V")
	public Class125_Sub1_Sub1(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt10870 = arg3;
		this.anInt10869 = arg4;
		if (super.anInt10843 == 34037) {
			this.aFloat197 = (float) arg3;
			this.aFloat196 = (float) arg4;
			this.aBoolean738 = false;
		} else {
			this.aFloat197 = this.aFloat196 = 1.0F;
			this.aBoolean738 = true;
		}
	}

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!aq;IIII[I)V")
	public Class125_Sub1_Sub1(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt10869 = arg2;
		this.anInt10870 = arg1;
		this.method9223(arg5, 0, 0, arg1, arg2, 0);
		this.aFloat196 = (float) arg2 / (float) arg4;
		this.aBoolean738 = false;
		this.aFloat197 = (float) arg1 / (float) arg3;
		this.method9224(false, false);
	}

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!aq;IIIII[BI)V")
	public Class125_Sub1_Sub1(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt10869 = arg3;
		this.anInt10870 = arg2;
		this.method9222(arg3, true, arg6, arg7, arg2);
		this.aBoolean738 = false;
		this.aFloat197 = (float) arg2 / (float) arg4;
		this.aFloat196 = (float) arg3 / (float) arg5;
		this.method9224(false, false);
	}
}
