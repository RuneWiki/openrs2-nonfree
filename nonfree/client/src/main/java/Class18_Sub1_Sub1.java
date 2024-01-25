import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public final class Class18_Sub1_Sub1 extends Class18_Sub1 {

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
	public final int anInt441;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
	public final int anInt440;

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "Z")
	public final boolean aBoolean50;

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "F")
	public final float aFloat5;

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "F")
	public final float aFloat4;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!hj;IIIZ[I)V")
	public Class18_Sub1_Sub1(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt441 = arg2;
		this.anInt440 = arg3;
		if (this.anInt5452 == 34037) {
			this.aBoolean50 = false;
			this.aFloat5 = arg3;
			this.aFloat4 = arg2;
		} else {
			this.aFloat4 = this.aFloat5 = 1.0F;
			this.aBoolean50 = true;
		}
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!hj;IIIIIIZ)V")
	public Class18_Sub1_Sub1(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt441 = arg3;
		this.anInt440 = arg4;
		this.aBoolean50 = false;
		this.aFloat5 = (float) arg4 / (float) arg6;
		this.aFloat4 = (float) arg3 / (float) arg5;
		this.method500(false, false);
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!hj;IIIII[BI)V")
	public Class18_Sub1_Sub1(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt441 = arg2;
		this.anInt440 = arg3;
		this.method502(arg2, arg3, arg6, arg7, true);
		this.aBoolean50 = false;
		this.aFloat4 = (float) arg2 / (float) arg4;
		this.aFloat5 = (float) arg3 / (float) arg5;
		this.method500(false, false);
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!hj;IIII[I)V")
	public Class18_Sub1_Sub1(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt440 = arg2;
		this.anInt441 = arg1;
		this.method504(arg1, arg2, arg5);
		this.aFloat5 = (float) arg2 / (float) arg4;
		this.aBoolean50 = false;
		this.aFloat4 = (float) arg1 / (float) arg3;
		this.method500(false, false);
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!hj;IIIIIZ)V")
	public Class18_Sub1_Sub1(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt440 = arg5;
		if (this.anInt5452 == 34037) {
			this.aBoolean50 = false;
			this.aFloat5 = arg5;
			this.aFloat4 = arg4;
		} else {
			this.aBoolean50 = true;
			this.aFloat4 = this.aFloat5 = 1.0F;
		}
		this.anInt441 = arg4;
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!hj;IIIIZ[BI)V")
	public Class18_Sub1_Sub1(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt440 = arg4;
		if (this.anInt5452 == 34037) {
			this.aFloat5 = arg4;
			this.aFloat4 = arg3;
			this.aBoolean50 = false;
		} else {
			this.aBoolean50 = true;
			this.aFloat4 = this.aFloat5 = 1.0F;
		}
		this.anInt441 = arg3;
	}
}
