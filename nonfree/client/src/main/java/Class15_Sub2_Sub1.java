import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public final class Class15_Sub2_Sub1 extends Class15_Sub2 {

	@OriginalMember(owner = "client!up", name = "l", descriptor = "I")
	public final int anInt5856;

	@OriginalMember(owner = "client!up", name = "n", descriptor = "F")
	public final float aFloat66;

	@OriginalMember(owner = "client!up", name = "m", descriptor = "F")
	public final float aFloat65;

	@OriginalMember(owner = "client!up", name = "o", descriptor = "Z")
	public final boolean aBoolean537;

	@OriginalMember(owner = "client!up", name = "p", descriptor = "I")
	public final int anInt5857;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lclient!nm;IIIZ[I)V")
	public Class15_Sub2_Sub1(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt5856 = arg3;
		if (this.anInt6388 == 34037) {
			this.aFloat66 = arg3;
			this.aBoolean537 = false;
			this.aFloat65 = arg2;
		} else {
			this.aFloat65 = this.aFloat66 = 1.0F;
			this.aBoolean537 = true;
		}
		this.anInt5857 = arg2;
	}

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lclient!nm;IIII[I)V")
	public Class15_Sub2_Sub1(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt5857 = arg1;
		this.anInt5856 = arg2;
		this.method5041(arg1, arg2, arg5);
		this.aFloat65 = (float) arg1 / (float) arg3;
		this.aBoolean537 = false;
		this.aFloat66 = (float) arg2 / (float) arg4;
		this.method5042(false, false);
	}

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lclient!nm;IIIII[BI)V")
	public Class15_Sub2_Sub1(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt5856 = arg3;
		this.anInt5857 = arg2;
		this.method5040(arg2, arg3, arg6, arg7, true);
		this.aBoolean537 = false;
		this.aFloat65 = (float) arg2 / (float) arg4;
		this.aFloat66 = (float) arg3 / (float) arg5;
		this.method5042(false, false);
	}

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lclient!nm;IIIIZ[BI)V")
	public Class15_Sub2_Sub1(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt5857 = arg3;
		this.anInt5856 = arg4;
		if (this.anInt6388 == 34037) {
			this.aFloat65 = arg3;
			this.aFloat66 = arg4;
			this.aBoolean537 = false;
		} else {
			this.aFloat65 = this.aFloat66 = 1.0F;
			this.aBoolean537 = true;
		}
	}

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lclient!nm;IIIIIZ)V")
	public Class15_Sub2_Sub1(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt5857 = arg4;
		if (this.anInt6388 == 34037) {
			this.aBoolean537 = false;
			this.aFloat65 = arg4;
			this.aFloat66 = arg5;
		} else {
			this.aFloat65 = this.aFloat66 = 1.0F;
			this.aBoolean537 = true;
		}
		this.anInt5856 = arg5;
	}

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lclient!nm;IIIIIIZ)V")
	public Class15_Sub2_Sub1(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt5856 = arg4;
		this.anInt5857 = arg3;
		this.aFloat66 = (float) arg4 / (float) arg6;
		this.aFloat65 = (float) arg3 / (float) arg5;
		this.aBoolean537 = false;
		this.method5042(false, false);
	}
}
