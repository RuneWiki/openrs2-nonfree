import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public final class Class245_Sub2_Sub1 extends Class245_Sub2 {

	@OriginalMember(owner = "client!to", name = "Q", descriptor = "I")
	public final int anInt10095;

	@OriginalMember(owner = "client!to", name = "M", descriptor = "F")
	public final float aFloat189;

	@OriginalMember(owner = "client!to", name = "O", descriptor = "F")
	public final float aFloat190;

	@OriginalMember(owner = "client!to", name = "K", descriptor = "Z")
	public final boolean aBoolean731;

	@OriginalMember(owner = "client!to", name = "J", descriptor = "I")
	public final int anInt10098;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!gia;IIIIIIZ)V")
	public Class245_Sub2_Sub1(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt10095 = arg3;
		this.aFloat189 = (float) arg3 / (float) arg5;
		this.aFloat190 = (float) arg4 / (float) arg6;
		this.aBoolean731 = false;
		this.anInt10098 = arg4;
		this.method8473(false, false);
	}

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!gia;IIIZ[III)V")
	public Class245_Sub2_Sub1(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt10098 = arg3;
		this.anInt10095 = arg2;
		if (super.anInt10362 == 34037) {
			this.aFloat189 = (float) arg2;
			this.aFloat190 = (float) arg3;
			this.aBoolean731 = false;
		} else {
			this.aBoolean731 = true;
			this.aFloat189 = this.aFloat190 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!gia;IIIIIZ)V")
	public Class245_Sub2_Sub1(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt10095 = arg4;
		if (super.anInt10362 == 34037) {
			this.aFloat189 = (float) arg4;
			this.aBoolean731 = false;
			this.aFloat190 = (float) arg5;
		} else {
			this.aBoolean731 = true;
			this.aFloat189 = this.aFloat190 = 1.0F;
		}
		this.anInt10098 = arg5;
	}

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!gia;IIIIZ[BI)V")
	public Class245_Sub2_Sub1(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt10362 == 34037) {
			this.aBoolean731 = false;
			this.aFloat190 = (float) arg4;
			this.aFloat189 = (float) arg3;
		} else {
			this.aFloat189 = this.aFloat190 = 1.0F;
			this.aBoolean731 = true;
		}
		this.anInt10098 = arg4;
		this.anInt10095 = arg3;
	}

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!gia;IIII)V")
	public Class245_Sub2_Sub1(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt10098 = arg4;
		if (super.anInt10362 == 34037) {
			this.aBoolean731 = false;
			this.aFloat190 = (float) arg4;
			this.aFloat189 = (float) arg3;
		} else {
			this.aBoolean731 = true;
			this.aFloat189 = this.aFloat190 = 1.0F;
		}
		this.anInt10095 = arg3;
	}

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!gia;IIIII[BI)V")
	public Class245_Sub2_Sub1(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt10095 = arg2;
		this.anInt10098 = arg3;
		this.method8468(true, arg7, arg3, arg6, arg2);
		this.aBoolean731 = false;
		this.aFloat190 = (float) arg3 / (float) arg5;
		this.aFloat189 = (float) arg2 / (float) arg4;
		this.method8473(false, false);
	}

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!gia;IIIII)V")
	public Class245_Sub2_Sub1(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.aFloat190 = (float) arg3 / (float) arg5;
		this.aFloat189 = (float) arg2 / (float) arg4;
		this.anInt10095 = arg2;
		this.aBoolean731 = false;
		this.anInt10098 = arg3;
		this.method8473(false, false);
	}

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!gia;IIII[I)V")
	public Class245_Sub2_Sub1(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt10098 = arg2;
		this.anInt10095 = arg1;
		this.method8469(0, 0, arg5, 0, arg2, arg1);
		this.aFloat189 = (float) arg1 / (float) arg3;
		this.aFloat190 = (float) arg2 / (float) arg4;
		this.aBoolean731 = false;
		this.method8473(false, false);
	}
}
