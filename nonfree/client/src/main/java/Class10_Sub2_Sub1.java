import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public final class Class10_Sub2_Sub1 extends Class10_Sub2 {

	@OriginalMember(owner = "client!baa", name = "Q", descriptor = "I")
	public final int anInt648;

	@OriginalMember(owner = "client!baa", name = "S", descriptor = "I")
	public final int anInt649;

	@OriginalMember(owner = "client!baa", name = "R", descriptor = "F")
	public final float aFloat6;

	@OriginalMember(owner = "client!baa", name = "V", descriptor = "Z")
	public final boolean aBoolean66;

	@OriginalMember(owner = "client!baa", name = "B", descriptor = "F")
	public final float aFloat5;

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lclient!bi;IIII[I)V")
	public Class10_Sub2_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt648 = arg1;
		this.anInt649 = arg2;
		this.method721(0, arg2, 0, 0, arg1, arg5);
		this.aFloat6 = (float) arg1 / (float) arg3;
		this.aBoolean66 = false;
		this.aFloat5 = (float) arg2 / (float) arg4;
		this.method720(false, false);
	}

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lclient!bi;IIIIIIZ)V")
	public Class10_Sub2_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt648 = arg3;
		this.aFloat5 = (float) arg4 / (float) arg6;
		this.anInt649 = arg4;
		this.aFloat6 = (float) arg3 / (float) arg5;
		this.aBoolean66 = false;
		this.method720(false, false);
	}

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lclient!bi;IIIII)V")
	public Class10_Sub2_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt649 = arg3;
		this.aFloat5 = (float) arg3 / (float) arg5;
		this.aFloat6 = (float) arg2 / (float) arg4;
		this.anInt648 = arg2;
		this.aBoolean66 = false;
		this.method720(false, false);
	}

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lclient!bi;IIII)V")
	public Class10_Sub2_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		if (super.anInt8418 == 34037) {
			this.aBoolean66 = false;
			this.aFloat6 = (float) arg3;
			this.aFloat5 = (float) arg4;
		} else {
			this.aBoolean66 = true;
			this.aFloat6 = this.aFloat5 = 1.0F;
		}
		this.anInt648 = arg3;
		this.anInt649 = arg4;
	}

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lclient!bi;IIIIZ[BI)V")
	public Class10_Sub2_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt648 = arg3;
		if (super.anInt8418 == 34037) {
			this.aBoolean66 = false;
			this.aFloat5 = (float) arg4;
			this.aFloat6 = (float) arg3;
		} else {
			this.aFloat6 = this.aFloat5 = 1.0F;
			this.aBoolean66 = true;
		}
		this.anInt649 = arg4;
	}

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lclient!bi;IIIZ[III)V")
	public Class10_Sub2_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt648 = arg2;
		this.anInt649 = arg3;
		if (super.anInt8418 == 34037) {
			this.aFloat6 = (float) arg2;
			this.aFloat5 = (float) arg3;
			this.aBoolean66 = false;
		} else {
			this.aBoolean66 = true;
			this.aFloat6 = this.aFloat5 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lclient!bi;IIIII[BI)V")
	public Class10_Sub2_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt649 = arg3;
		this.anInt648 = arg2;
		this.method727(true, arg6, arg3, arg2, arg7);
		this.aFloat6 = (float) arg2 / (float) arg4;
		this.aBoolean66 = false;
		this.aFloat5 = (float) arg3 / (float) arg5;
		this.method720(false, false);
	}

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lclient!bi;IIIIIZ)V")
	public Class10_Sub2_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (super.anInt8418 == 34037) {
			this.aFloat6 = (float) arg4;
			this.aFloat5 = (float) arg5;
			this.aBoolean66 = false;
		} else {
			this.aFloat6 = this.aFloat5 = 1.0F;
			this.aBoolean66 = true;
		}
		this.anInt648 = arg4;
		this.anInt649 = arg5;
	}
}
