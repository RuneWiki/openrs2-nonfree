import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public final class Class73_Sub1_Sub1 extends Class73_Sub1 {

	@OriginalMember(owner = "client!em", name = "Q", descriptor = "I")
	public final int anInt2345;

	@OriginalMember(owner = "client!em", name = "C", descriptor = "I")
	public final int anInt2344;

	@OriginalMember(owner = "client!em", name = "O", descriptor = "Z")
	public final boolean aBoolean149;

	@OriginalMember(owner = "client!em", name = "P", descriptor = "F")
	public final float aFloat20;

	@OriginalMember(owner = "client!em", name = "V", descriptor = "F")
	public final float aFloat21;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!uq;IIII[I)V")
	public Class73_Sub1_Sub1(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt2345 = arg1;
		this.anInt2344 = arg2;
		this.method1958(arg5, arg1, arg2);
		this.aBoolean149 = false;
		this.aFloat20 = (float) arg2 / (float) arg4;
		this.aFloat21 = (float) arg1 / (float) arg3;
		this.method1954(false, false);
	}

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!uq;IIIIIZ)V")
	public Class73_Sub1_Sub1(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt2345 = arg4;
		this.anInt2344 = arg5;
		if (super.anInt7616 == 34037) {
			this.aBoolean149 = false;
			this.aFloat20 = arg5;
			this.aFloat21 = arg4;
		} else {
			this.aBoolean149 = true;
			this.aFloat21 = this.aFloat20 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!uq;IIIII[BI)V")
	public Class73_Sub1_Sub1(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt2344 = arg3;
		this.anInt2345 = arg2;
		this.method1960(true, arg3, arg6, arg7, arg2);
		this.aFloat20 = (float) arg3 / (float) arg5;
		this.aBoolean149 = false;
		this.aFloat21 = (float) arg2 / (float) arg4;
		this.method1954(false, false);
	}

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!uq;IIIIIIZ)V")
	public Class73_Sub1_Sub1(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aBoolean149 = false;
		this.aFloat20 = (float) arg4 / (float) arg6;
		this.anInt2344 = arg4;
		this.anInt2345 = arg3;
		this.aFloat21 = (float) arg3 / (float) arg5;
		this.method1954(false, false);
	}

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!uq;IIIIZ[BI)V")
	public Class73_Sub1_Sub1(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt7616 == 34037) {
			this.aFloat21 = arg3;
			this.aBoolean149 = false;
			this.aFloat20 = arg4;
		} else {
			this.aFloat21 = this.aFloat20 = 1.0F;
			this.aBoolean149 = true;
		}
		this.anInt2344 = arg4;
		this.anInt2345 = arg3;
	}

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!uq;IIIZ[I)V")
	public Class73_Sub1_Sub1(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt2345 = arg2;
		this.anInt2344 = arg3;
		if (super.anInt7616 == 34037) {
			this.aBoolean149 = false;
			this.aFloat21 = arg2;
			this.aFloat20 = arg3;
		} else {
			this.aFloat21 = this.aFloat20 = 1.0F;
			this.aBoolean149 = true;
		}
	}
}
