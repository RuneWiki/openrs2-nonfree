import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public final class Class39_Sub4_Sub1 extends Class39_Sub4 {

	@OriginalMember(owner = "client!vq", name = "N", descriptor = "I")
	public final int anInt9955;

	@OriginalMember(owner = "client!vq", name = "R", descriptor = "I")
	public final int anInt9958;

	@OriginalMember(owner = "client!vq", name = "P", descriptor = "F")
	public final float aFloat196;

	@OriginalMember(owner = "client!vq", name = "T", descriptor = "Z")
	public final boolean aBoolean732;

	@OriginalMember(owner = "client!vq", name = "K", descriptor = "F")
	public final float aFloat195;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!hk;IIII[I)V")
	public Class39_Sub4_Sub1(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt9955 = arg2;
		this.anInt9958 = arg1;
		this.method8473(arg1, 0, 0, 0, arg5, arg2);
		this.aFloat196 = (float) arg2 / (float) arg4;
		this.aBoolean732 = false;
		this.aFloat195 = (float) arg1 / (float) arg3;
		this.method8469(false, false);
	}

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!hk;IIIIZ[BI)V")
	public Class39_Sub4_Sub1(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt9955 = arg4;
		if (super.anInt9936 == 34037) {
			this.aFloat195 = (float) arg3;
			this.aBoolean732 = false;
			this.aFloat196 = (float) arg4;
		} else {
			this.aFloat195 = this.aFloat196 = 1.0F;
			this.aBoolean732 = true;
		}
		this.anInt9958 = arg3;
	}

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!hk;IIIII)V")
	public Class39_Sub4_Sub1(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.aFloat196 = (float) arg3 / (float) arg5;
		this.aBoolean732 = false;
		this.anInt9955 = arg3;
		this.anInt9958 = arg2;
		this.aFloat195 = (float) arg2 / (float) arg4;
		this.method8469(false, false);
	}

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!hk;IIIZ[III)V")
	public Class39_Sub4_Sub1(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt9955 = arg3;
		if (super.anInt9936 == 34037) {
			this.aBoolean732 = false;
			this.aFloat196 = (float) arg3;
			this.aFloat195 = (float) arg2;
		} else {
			this.aFloat195 = this.aFloat196 = 1.0F;
			this.aBoolean732 = true;
		}
		this.anInt9958 = arg2;
	}

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!hk;IIIIIZ)V")
	public Class39_Sub4_Sub1(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt9955 = arg5;
		this.anInt9958 = arg4;
		if (super.anInt9936 == 34037) {
			this.aFloat196 = (float) arg5;
			this.aFloat195 = (float) arg4;
			this.aBoolean732 = false;
		} else {
			this.aBoolean732 = true;
			this.aFloat195 = this.aFloat196 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!hk;IIII)V")
	public Class39_Sub4_Sub1(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt9955 = arg4;
		if (super.anInt9936 == 34037) {
			this.aFloat195 = (float) arg3;
			this.aBoolean732 = false;
			this.aFloat196 = (float) arg4;
		} else {
			this.aBoolean732 = true;
			this.aFloat195 = this.aFloat196 = 1.0F;
		}
		this.anInt9958 = arg3;
	}

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!hk;IIIIIIZ)V")
	public Class39_Sub4_Sub1(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat196 = (float) arg4 / (float) arg6;
		this.anInt9955 = arg4;
		this.aFloat195 = (float) arg3 / (float) arg5;
		this.anInt9958 = arg3;
		this.aBoolean732 = false;
		this.method8469(false, false);
	}

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!hk;IIIII[BI)V")
	public Class39_Sub4_Sub1(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt9958 = arg2;
		this.anInt9955 = arg3;
		this.method8468(arg3, arg2, arg6, true, arg7);
		this.aFloat195 = (float) arg2 / (float) arg4;
		this.aBoolean732 = false;
		this.aFloat196 = (float) arg3 / (float) arg5;
		this.method8469(false, false);
	}
}
