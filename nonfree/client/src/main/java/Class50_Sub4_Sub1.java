import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public final class Class50_Sub4_Sub1 extends Class50_Sub4 {

	@OriginalMember(owner = "client!uk", name = "Q", descriptor = "I")
	public final int anInt10695;

	@OriginalMember(owner = "client!uk", name = "M", descriptor = "I")
	public final int anInt10693;

	@OriginalMember(owner = "client!uk", name = "R", descriptor = "Z")
	public final boolean aBoolean779;

	@OriginalMember(owner = "client!uk", name = "K", descriptor = "F")
	public final float aFloat189;

	@OriginalMember(owner = "client!uk", name = "O", descriptor = "F")
	public final float aFloat190;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!lea;IIII[I)V")
	public Class50_Sub4_Sub1(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt10695 = arg2;
		this.anInt10693 = arg1;
		this.method9146(arg5, arg1, 0, 0, 0, arg2);
		this.aBoolean779 = false;
		this.aFloat189 = (float) arg1 / (float) arg3;
		this.aFloat190 = (float) arg2 / (float) arg4;
		this.method9152(false, false);
	}

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!lea;IIIIIIZ)V")
	public Class50_Sub4_Sub1(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat189 = (float) arg3 / (float) arg5;
		this.aFloat190 = (float) arg4 / (float) arg6;
		this.aBoolean779 = false;
		this.anInt10693 = arg3;
		this.anInt10695 = arg4;
		this.method9152(false, false);
	}

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!lea;IIII)V")
	public Class50_Sub4_Sub1(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		if (super.anInt10677 == 34037) {
			this.aBoolean779 = false;
			this.aFloat190 = (float) arg4;
			this.aFloat189 = (float) arg3;
		} else {
			this.aBoolean779 = true;
			this.aFloat189 = this.aFloat190 = 1.0F;
		}
		this.anInt10695 = arg4;
		this.anInt10693 = arg3;
	}

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!lea;IIIIIZ)V")
	public Class50_Sub4_Sub1(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (super.anInt10677 == 34037) {
			this.aFloat190 = (float) arg5;
			this.aBoolean779 = false;
			this.aFloat189 = (float) arg4;
		} else {
			this.aBoolean779 = true;
			this.aFloat189 = this.aFloat190 = 1.0F;
		}
		this.anInt10693 = arg4;
		this.anInt10695 = arg5;
	}

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!lea;IIIIZ[BI)V")
	public Class50_Sub4_Sub1(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt10693 = arg3;
		if (super.anInt10677 == 34037) {
			this.aFloat190 = (float) arg4;
			this.aBoolean779 = false;
			this.aFloat189 = (float) arg3;
		} else {
			this.aFloat189 = this.aFloat190 = 1.0F;
			this.aBoolean779 = true;
		}
		this.anInt10695 = arg4;
	}

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!lea;IIIII)V")
	public Class50_Sub4_Sub1(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt10695 = arg3;
		this.aBoolean779 = false;
		this.aFloat189 = (float) arg2 / (float) arg4;
		this.aFloat190 = (float) arg3 / (float) arg5;
		this.anInt10693 = arg2;
		this.method9152(false, false);
	}

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!lea;IIIII[BI)V")
	public Class50_Sub4_Sub1(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt10693 = arg2;
		this.anInt10695 = arg3;
		this.method9150(arg3, arg7, true, arg6, arg2);
		this.aFloat190 = (float) arg3 / (float) arg5;
		this.aBoolean779 = false;
		this.aFloat189 = (float) arg2 / (float) arg4;
		this.method9152(false, false);
	}

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!lea;IIIZ[III)V")
	public Class50_Sub4_Sub1(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt10693 = arg2;
		if (super.anInt10677 == 34037) {
			this.aFloat190 = (float) arg3;
			this.aFloat189 = (float) arg2;
			this.aBoolean779 = false;
		} else {
			this.aBoolean779 = true;
			this.aFloat189 = this.aFloat190 = 1.0F;
		}
		this.anInt10695 = arg3;
	}
}
