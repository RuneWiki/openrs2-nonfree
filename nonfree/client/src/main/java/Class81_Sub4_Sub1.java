import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public final class Class81_Sub4_Sub1 extends Class81_Sub4 {

	@OriginalMember(owner = "client!qq", name = "p", descriptor = "I")
	public final int anInt5616;

	@OriginalMember(owner = "client!qq", name = "o", descriptor = "I")
	public final int anInt5615;

	@OriginalMember(owner = "client!qq", name = "n", descriptor = "F")
	public final float aFloat67;

	@OriginalMember(owner = "client!qq", name = "m", descriptor = "F")
	public final float aFloat66;

	@OriginalMember(owner = "client!qq", name = "l", descriptor = "Z")
	public final boolean aBoolean497;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!cg;IIIZ[I)V")
	public Class81_Sub4_Sub1(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt5616 = arg2;
		this.anInt5615 = arg3;
		if (this.anInt5610 == 34037) {
			this.aBoolean497 = false;
			this.aFloat66 = arg2;
			this.aFloat67 = arg3;
		} else {
			this.aFloat66 = this.aFloat67 = 1.0F;
			this.aBoolean497 = true;
		}
	}

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!cg;IIIIIIZ)V")
	public Class81_Sub4_Sub1(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat67 = (float) arg4 / (float) arg6;
		this.anInt5615 = arg4;
		this.aFloat66 = (float) arg3 / (float) arg5;
		this.aBoolean497 = false;
		this.anInt5616 = arg3;
		this.method4745(false, false);
	}

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!cg;IIII[I)V")
	public Class81_Sub4_Sub1(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt5615 = arg2;
		this.anInt5616 = arg1;
		this.method4748(arg1, arg2, arg5);
		this.aFloat66 = (float) arg1 / (float) arg3;
		this.aBoolean497 = false;
		this.aFloat67 = (float) arg2 / (float) arg4;
		this.method4745(false, false);
	}

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!cg;IIIIIZ)V")
	public Class81_Sub4_Sub1(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt5616 = arg4;
		this.anInt5615 = arg5;
		if (this.anInt5610 == 34037) {
			this.aFloat66 = arg4;
			this.aFloat67 = arg5;
			this.aBoolean497 = false;
		} else {
			this.aBoolean497 = true;
			this.aFloat66 = this.aFloat67 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!cg;IIIIZ[BI)V")
	public Class81_Sub4_Sub1(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt5615 = arg4;
		this.anInt5616 = arg3;
		if (this.anInt5610 == 34037) {
			this.aBoolean497 = false;
			this.aFloat67 = arg4;
			this.aFloat66 = arg3;
		} else {
			this.aFloat66 = this.aFloat67 = 1.0F;
			this.aBoolean497 = true;
		}
	}

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!cg;IIIII[BI)V")
	public Class81_Sub4_Sub1(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt5616 = arg2;
		this.anInt5615 = arg3;
		this.method4746(arg2, arg3, arg6, arg7, true);
		this.aBoolean497 = false;
		this.aFloat67 = (float) arg3 / (float) arg5;
		this.aFloat66 = (float) arg2 / (float) arg4;
		this.method4745(false, false);
	}
}
