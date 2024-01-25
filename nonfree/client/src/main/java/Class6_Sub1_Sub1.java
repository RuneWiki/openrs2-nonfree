import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public final class Class6_Sub1_Sub1 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ps", name = "P", descriptor = "I")
	public final int anInt5470;

	@OriginalMember(owner = "client!ps", name = "U", descriptor = "I")
	public final int anInt5474;

	@OriginalMember(owner = "client!ps", name = "V", descriptor = "F")
	public final float aFloat172;

	@OriginalMember(owner = "client!ps", name = "S", descriptor = "F")
	public final float aFloat171;

	@OriginalMember(owner = "client!ps", name = "X", descriptor = "Z")
	public final boolean aBoolean491;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lclient!fd;IIIII[BI)V")
	public Class6_Sub1_Sub1(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt5470 = arg2;
		this.anInt5474 = arg3;
		this.method4191(arg2, arg6, arg3, arg7, true);
		this.aFloat172 = (float) arg2 / (float) arg4;
		this.aFloat171 = (float) arg3 / (float) arg5;
		this.aBoolean491 = false;
		this.method4196(false, false);
	}

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lclient!fd;IIIIZ[BI)V")
	public Class6_Sub1_Sub1(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt5470 = arg3;
		this.anInt5474 = arg4;
		if (super.anInt5441 == 34037) {
			this.aFloat172 = arg3;
			this.aBoolean491 = false;
			this.aFloat171 = arg4;
		} else {
			this.aFloat172 = this.aFloat171 = 1.0F;
			this.aBoolean491 = true;
		}
	}

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lclient!fd;IIII[I)V")
	public Class6_Sub1_Sub1(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt5474 = arg2;
		this.anInt5470 = arg1;
		this.method4197(arg2, arg5, arg1);
		this.aBoolean491 = false;
		this.aFloat172 = (float) arg1 / (float) arg3;
		this.aFloat171 = (float) arg2 / (float) arg4;
		this.method4196(false, false);
	}

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lclient!fd;IIIIIIZ)V")
	public Class6_Sub1_Sub1(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt5470 = arg3;
		this.anInt5474 = arg4;
		this.aBoolean491 = false;
		this.aFloat172 = (float) arg3 / (float) arg5;
		this.aFloat171 = (float) arg4 / (float) arg6;
		this.method4196(false, false);
	}

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lclient!fd;IIIIIZ)V")
	public Class6_Sub1_Sub1(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt5474 = arg5;
		if (super.anInt5441 == 34037) {
			this.aFloat171 = arg5;
			this.aBoolean491 = false;
			this.aFloat172 = arg4;
		} else {
			this.aBoolean491 = true;
			this.aFloat172 = this.aFloat171 = 1.0F;
		}
		this.anInt5470 = arg4;
	}

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lclient!fd;IIIZ[I)V")
	public Class6_Sub1_Sub1(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt5470 = arg2;
		this.anInt5474 = arg3;
		if (super.anInt5441 == 34037) {
			this.aFloat172 = arg2;
			this.aFloat171 = arg3;
			this.aBoolean491 = false;
		} else {
			this.aBoolean491 = true;
			this.aFloat172 = this.aFloat171 = 1.0F;
		}
	}
}
