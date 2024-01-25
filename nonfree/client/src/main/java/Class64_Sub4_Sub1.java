import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public final class Class64_Sub4_Sub1 extends Class64_Sub4 {

	@OriginalMember(owner = "client!ke", name = "I", descriptor = "I")
	public final int anInt5010;

	@OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
	public final int anInt5009;

	@OriginalMember(owner = "client!ke", name = "K", descriptor = "Z")
	public final boolean aBoolean428;

	@OriginalMember(owner = "client!ke", name = "N", descriptor = "F")
	public final float aFloat68;

	@OriginalMember(owner = "client!ke", name = "L", descriptor = "F")
	public final float aFloat67;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lclient!uja;IIIZ[III)V")
	public Class64_Sub4_Sub1(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt5010 = arg3;
		this.anInt5009 = arg2;
		if (super.anInt4996 == 34037) {
			this.aBoolean428 = false;
			this.aFloat68 = (float) arg3;
			this.aFloat67 = (float) arg2;
		} else {
			this.aBoolean428 = true;
			this.aFloat67 = this.aFloat68 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lclient!uja;IIIIIZ)V")
	public Class64_Sub4_Sub1(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt5010 = arg5;
		if (super.anInt4996 == 34037) {
			this.aFloat67 = (float) arg4;
			this.aBoolean428 = false;
			this.aFloat68 = (float) arg5;
		} else {
			this.aBoolean428 = true;
			this.aFloat67 = this.aFloat68 = 1.0F;
		}
		this.anInt5009 = arg4;
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lclient!uja;IIIIIIZ)V")
	public Class64_Sub4_Sub1(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat67 = (float) arg3 / (float) arg5;
		this.anInt5009 = arg3;
		this.aBoolean428 = false;
		this.anInt5010 = arg4;
		this.aFloat68 = (float) arg4 / (float) arg6;
		this.method4548(false, false);
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lclient!uja;IIII)V")
	public Class64_Sub4_Sub1(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt5009 = arg3;
		this.anInt5010 = arg4;
		if (super.anInt4996 == 34037) {
			this.aFloat67 = (float) arg3;
			this.aFloat68 = (float) arg4;
			this.aBoolean428 = false;
		} else {
			this.aBoolean428 = true;
			this.aFloat67 = this.aFloat68 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lclient!uja;IIIII[BI)V")
	public Class64_Sub4_Sub1(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt5009 = arg2;
		this.anInt5010 = arg3;
		this.method4547(arg3, arg2, true, arg6, arg7);
		this.aFloat68 = (float) arg3 / (float) arg5;
		this.aBoolean428 = false;
		this.aFloat67 = (float) arg2 / (float) arg4;
		this.method4548(false, false);
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lclient!uja;IIII[I)V")
	public Class64_Sub4_Sub1(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt5009 = arg1;
		this.anInt5010 = arg2;
		this.method4552(arg2, 0, 0, 0, arg1, arg5);
		this.aFloat67 = (float) arg1 / (float) arg3;
		this.aFloat68 = (float) arg2 / (float) arg4;
		this.aBoolean428 = false;
		this.method4548(false, false);
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lclient!uja;IIIII)V")
	public Class64_Sub4_Sub1(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.aFloat68 = (float) arg3 / (float) arg5;
		this.aBoolean428 = false;
		this.anInt5009 = arg2;
		this.anInt5010 = arg3;
		this.aFloat67 = (float) arg2 / (float) arg4;
		this.method4548(false, false);
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lclient!uja;IIIIZ[BI)V")
	public Class64_Sub4_Sub1(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt4996 == 34037) {
			this.aFloat68 = (float) arg4;
			this.aFloat67 = (float) arg3;
			this.aBoolean428 = false;
		} else {
			this.aBoolean428 = true;
			this.aFloat67 = this.aFloat68 = 1.0F;
		}
		this.anInt5010 = arg4;
		this.anInt5009 = arg3;
	}
}
