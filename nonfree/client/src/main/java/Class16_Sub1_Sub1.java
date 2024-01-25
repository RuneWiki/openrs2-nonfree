import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public final class Class16_Sub1_Sub1 extends Class16_Sub1 {

	@OriginalMember(owner = "client!an", name = "L", descriptor = "F")
	public final float aFloat16;

	@OriginalMember(owner = "client!an", name = "K", descriptor = "F")
	public final float aFloat15;

	@OriginalMember(owner = "client!an", name = "P", descriptor = "Z")
	public final boolean aBoolean23;

	@OriginalMember(owner = "client!an", name = "M", descriptor = "I")
	public final int anInt355;

	@OriginalMember(owner = "client!an", name = "N", descriptor = "I")
	public final int anInt356;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!en;IIIZ[I)V")
	public Class16_Sub1_Sub1(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		if (super.anInt9862 == 34037) {
			this.aFloat15 = arg2;
			this.aFloat16 = arg3;
			this.aBoolean23 = false;
		} else {
			this.aFloat15 = this.aFloat16 = 1.0F;
			this.aBoolean23 = true;
		}
		this.anInt355 = arg3;
		this.anInt356 = arg2;
	}

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!en;IIIIIIZ)V")
	public Class16_Sub1_Sub1(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aBoolean23 = false;
		this.aFloat15 = (float) arg3 / (float) arg5;
		this.anInt356 = arg3;
		this.anInt355 = arg4;
		this.aFloat16 = (float) arg4 / (float) arg6;
		this.method303(false, false);
	}

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!en;IIII[I)V")
	public Class16_Sub1_Sub1(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt355 = arg2;
		this.anInt356 = arg1;
		this.method302(arg2, arg1, arg5);
		this.aFloat16 = (float) arg2 / (float) arg4;
		this.aFloat15 = (float) arg1 / (float) arg3;
		this.aBoolean23 = false;
		this.method303(false, false);
	}

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!en;IIIIZ[BI)V")
	public Class16_Sub1_Sub1(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt9862 == 34037) {
			this.aBoolean23 = false;
			this.aFloat15 = arg3;
			this.aFloat16 = arg4;
		} else {
			this.aBoolean23 = true;
			this.aFloat15 = this.aFloat16 = 1.0F;
		}
		this.anInt356 = arg3;
		this.anInt355 = arg4;
	}

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!en;IIIIIZ)V")
	public Class16_Sub1_Sub1(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt356 = arg4;
		if (super.anInt9862 == 34037) {
			this.aBoolean23 = false;
			this.aFloat15 = arg4;
			this.aFloat16 = arg5;
		} else {
			this.aBoolean23 = true;
			this.aFloat15 = this.aFloat16 = 1.0F;
		}
		this.anInt355 = arg5;
	}

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!en;IIIII[BI)V")
	public Class16_Sub1_Sub1(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt355 = arg3;
		this.anInt356 = arg2;
		this.method299(arg2, arg6, true, arg3, arg7);
		this.aBoolean23 = false;
		this.aFloat16 = (float) arg3 / (float) arg5;
		this.aFloat15 = (float) arg2 / (float) arg4;
		this.method303(false, false);
	}
}
