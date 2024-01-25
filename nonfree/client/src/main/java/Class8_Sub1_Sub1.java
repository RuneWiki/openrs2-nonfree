import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public final class Class8_Sub1_Sub1 extends Class8_Sub1 {

	@OriginalMember(owner = "client!l", name = "l", descriptor = "F")
	public final float aFloat63;

	@OriginalMember(owner = "client!l", name = "n", descriptor = "Z")
	public final boolean aBoolean232;

	@OriginalMember(owner = "client!l", name = "o", descriptor = "F")
	public final float aFloat64;

	@OriginalMember(owner = "client!l", name = "m", descriptor = "I")
	public final int anInt3576;

	@OriginalMember(owner = "client!l", name = "p", descriptor = "I")
	public final int anInt3577;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!sq;IIIIZ[BI)V")
	public Class8_Sub1_Sub1(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (this.anInt5318 == 34037) {
			this.aFloat63 = arg3;
			this.aBoolean232 = false;
			this.aFloat64 = arg4;
		} else {
			this.aBoolean232 = true;
			this.aFloat63 = this.aFloat64 = 1.0F;
		}
		this.anInt3576 = arg3;
		this.anInt3577 = arg4;
	}

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!sq;IIII[I)V")
	public Class8_Sub1_Sub1(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt3577 = arg2;
		this.anInt3576 = arg1;
		this.method3371(arg1, arg2, arg5);
		this.aBoolean232 = false;
		this.aFloat64 = (float) arg2 / (float) arg4;
		this.aFloat63 = (float) arg1 / (float) arg3;
		this.method3370(false, false);
	}

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!sq;IIIII[BI)V")
	public Class8_Sub1_Sub1(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt3577 = arg3;
		this.anInt3576 = arg2;
		this.method3373(arg2, arg3, arg6, arg7, true);
		this.aFloat63 = (float) arg2 / (float) arg4;
		this.aFloat64 = (float) arg3 / (float) arg5;
		this.aBoolean232 = false;
		this.method3370(false, false);
	}

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!sq;IIIIIIZ)V")
	public Class8_Sub1_Sub1(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt3577 = arg4;
		this.anInt3576 = arg3;
		this.aBoolean232 = false;
		this.aFloat64 = (float) arg4 / (float) arg6;
		this.aFloat63 = (float) arg3 / (float) arg5;
		this.method3370(false, false);
	}

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!sq;IIIZ[I)V")
	public Class8_Sub1_Sub1(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt3576 = arg2;
		this.anInt3577 = arg3;
		if (this.anInt5318 == 34037) {
			this.aBoolean232 = false;
			this.aFloat63 = arg2;
			this.aFloat64 = arg3;
		} else {
			this.aFloat63 = this.aFloat64 = 1.0F;
			this.aBoolean232 = true;
		}
	}

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!sq;IIIIIZ)V")
	public Class8_Sub1_Sub1(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt3576 = arg4;
		this.anInt3577 = arg5;
		if (this.anInt5318 == 34037) {
			this.aFloat64 = arg5;
			this.aBoolean232 = false;
			this.aFloat63 = arg4;
		} else {
			this.aBoolean232 = true;
			this.aFloat63 = this.aFloat64 = 1.0F;
		}
	}
}
