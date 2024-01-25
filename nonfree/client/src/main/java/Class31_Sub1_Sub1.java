import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public final class Class31_Sub1_Sub1 extends Class31_Sub1 {

	@OriginalMember(owner = "client!f", name = "L", descriptor = "F")
	public final float aFloat38;

	@OriginalMember(owner = "client!f", name = "Q", descriptor = "F")
	public final float aFloat39;

	@OriginalMember(owner = "client!f", name = "W", descriptor = "Z")
	public final boolean aBoolean133;

	@OriginalMember(owner = "client!f", name = "M", descriptor = "I")
	public final int anInt1876;

	@OriginalMember(owner = "client!f", name = "N", descriptor = "I")
	public final int anInt1877;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!tt;IIIIIZ)V")
	public Class31_Sub1_Sub1(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (super.anInt5787 == 34037) {
			this.aFloat39 = arg4;
			this.aFloat38 = arg5;
			this.aBoolean133 = false;
		} else {
			this.aFloat39 = this.aFloat38 = 1.0F;
			this.aBoolean133 = true;
		}
		this.anInt1876 = arg4;
		this.anInt1877 = arg5;
	}

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!tt;IIIIZ[BI)V")
	public Class31_Sub1_Sub1(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt5787 == 34037) {
			this.aBoolean133 = false;
			this.aFloat39 = arg3;
			this.aFloat38 = arg4;
		} else {
			this.aFloat39 = this.aFloat38 = 1.0F;
			this.aBoolean133 = true;
		}
		this.anInt1876 = arg3;
		this.anInt1877 = arg4;
	}

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!tt;IIIZ[I)V")
	public Class31_Sub1_Sub1(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt1877 = arg3;
		this.anInt1876 = arg2;
		if (super.anInt5787 == 34037) {
			this.aFloat39 = arg2;
			this.aBoolean133 = false;
			this.aFloat38 = arg3;
		} else {
			this.aFloat39 = this.aFloat38 = 1.0F;
			this.aBoolean133 = true;
		}
	}

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!tt;IIIIIIZ)V")
	public Class31_Sub1_Sub1(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat38 = (float) arg4 / (float) arg6;
		this.anInt1876 = arg3;
		this.aBoolean133 = false;
		this.anInt1877 = arg4;
		this.aFloat39 = (float) arg3 / (float) arg5;
		this.method1520(false, false);
	}

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!tt;IIII[I)V")
	public Class31_Sub1_Sub1(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt1876 = arg1;
		this.anInt1877 = arg2;
		this.method1524(arg1, arg5, arg2);
		this.aFloat39 = (float) arg1 / (float) arg3;
		this.aFloat38 = (float) arg2 / (float) arg4;
		this.aBoolean133 = false;
		this.method1520(false, false);
	}

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!tt;IIIII[BI)V")
	public Class31_Sub1_Sub1(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt1877 = arg3;
		this.anInt1876 = arg2;
		this.method1525(arg3, arg6, arg7, arg2, true);
		this.aFloat38 = (float) arg3 / (float) arg5;
		this.aFloat39 = (float) arg2 / (float) arg4;
		this.aBoolean133 = false;
		this.method1520(false, false);
	}
}
