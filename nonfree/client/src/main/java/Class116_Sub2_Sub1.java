import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public final class Class116_Sub2_Sub1 extends Class116_Sub2 {

	@OriginalMember(owner = "client!qt", name = "Q", descriptor = "I")
	public final int anInt7883;

	@OriginalMember(owner = "client!qt", name = "K", descriptor = "I")
	public final int anInt7879;

	@OriginalMember(owner = "client!qt", name = "N", descriptor = "F")
	public final float aFloat189;

	@OriginalMember(owner = "client!qt", name = "R", descriptor = "F")
	public final float aFloat190;

	@OriginalMember(owner = "client!qt", name = "T", descriptor = "Z")
	public final boolean aBoolean619;

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lclient!pc;IIII[I)V")
	public Class116_Sub2_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt7883 = arg2;
		this.anInt7879 = arg1;
		this.method6835(0, arg1, 0, arg5, 0, arg2);
		this.aFloat189 = (float) arg2 / (float) arg4;
		this.aFloat190 = (float) arg1 / (float) arg3;
		this.aBoolean619 = false;
		this.method6838(false, false);
	}

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lclient!pc;IIIII)V")
	public Class116_Sub2_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt7883 = arg3;
		this.aFloat190 = (float) arg2 / (float) arg4;
		this.anInt7879 = arg2;
		this.aBoolean619 = false;
		this.aFloat189 = (float) arg3 / (float) arg5;
		this.method6838(false, false);
	}

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lclient!pc;IIIZ[III)V")
	public Class116_Sub2_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt9736 == 34037) {
			this.aFloat189 = (float) arg3;
			this.aBoolean619 = false;
			this.aFloat190 = (float) arg2;
		} else {
			this.aBoolean619 = true;
			this.aFloat190 = this.aFloat189 = 1.0F;
		}
		this.anInt7879 = arg2;
		this.anInt7883 = arg3;
	}

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lclient!pc;IIII)V")
	public Class116_Sub2_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt7883 = arg4;
		this.anInt7879 = arg3;
		if (super.anInt9736 == 34037) {
			this.aFloat190 = (float) arg3;
			this.aFloat189 = (float) arg4;
			this.aBoolean619 = false;
		} else {
			this.aBoolean619 = true;
			this.aFloat190 = this.aFloat189 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lclient!pc;IIIIZ[BI)V")
	public Class116_Sub2_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt7879 = arg3;
		this.anInt7883 = arg4;
		if (super.anInt9736 == 34037) {
			this.aBoolean619 = false;
			this.aFloat189 = (float) arg4;
			this.aFloat190 = (float) arg3;
		} else {
			this.aBoolean619 = true;
			this.aFloat190 = this.aFloat189 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lclient!pc;IIIIIIZ)V")
	public Class116_Sub2_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt7883 = arg4;
		this.aFloat189 = (float) arg4 / (float) arg6;
		this.aBoolean619 = false;
		this.anInt7879 = arg3;
		this.aFloat190 = (float) arg3 / (float) arg5;
		this.method6838(false, false);
	}

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lclient!pc;IIIII[BI)V")
	public Class116_Sub2_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt7879 = arg2;
		this.anInt7883 = arg3;
		this.method6836(arg7, true, arg6, arg3, arg2);
		this.aFloat190 = (float) arg2 / (float) arg4;
		this.aFloat189 = (float) arg3 / (float) arg5;
		this.aBoolean619 = false;
		this.method6838(false, false);
	}

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lclient!pc;IIIIIZ)V")
	public Class116_Sub2_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (super.anInt9736 == 34037) {
			this.aFloat190 = (float) arg4;
			this.aFloat189 = (float) arg5;
			this.aBoolean619 = false;
		} else {
			this.aBoolean619 = true;
			this.aFloat190 = this.aFloat189 = 1.0F;
		}
		this.anInt7883 = arg5;
		this.anInt7879 = arg4;
	}
}
