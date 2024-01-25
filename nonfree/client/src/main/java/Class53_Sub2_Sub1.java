import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public final class Class53_Sub2_Sub1 extends Class53_Sub2 {

	@OriginalMember(owner = "client!iq", name = "Q", descriptor = "I")
	public final int anInt4466;

	@OriginalMember(owner = "client!iq", name = "B", descriptor = "I")
	public final int anInt4464;

	@OriginalMember(owner = "client!iq", name = "P", descriptor = "F")
	public final float aFloat32;

	@OriginalMember(owner = "client!iq", name = "O", descriptor = "F")
	public final float aFloat31;

	@OriginalMember(owner = "client!iq", name = "N", descriptor = "Z")
	public final boolean aBoolean279;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!pq;IIIIZ[BI)V")
	public Class53_Sub2_Sub1(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt4466 = arg4;
		this.anInt4464 = arg3;
		if (super.anInt9817 == 34037) {
			this.aFloat32 = (float) arg4;
			this.aFloat31 = (float) arg3;
			this.aBoolean279 = false;
		} else {
			this.aFloat31 = this.aFloat32 = 1.0F;
			this.aBoolean279 = true;
		}
	}

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!pq;IIIZ[III)V")
	public Class53_Sub2_Sub1(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt4464 = arg2;
		this.anInt4466 = arg3;
		if (super.anInt9817 == 34037) {
			this.aFloat32 = (float) arg3;
			this.aFloat31 = (float) arg2;
			this.aBoolean279 = false;
		} else {
			this.aBoolean279 = true;
			this.aFloat31 = this.aFloat32 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!pq;IIIII)V")
	public Class53_Sub2_Sub1(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.aFloat31 = (float) arg2 / (float) arg4;
		this.anInt4466 = arg3;
		this.anInt4464 = arg2;
		this.aBoolean279 = false;
		this.aFloat32 = (float) arg3 / (float) arg5;
		this.method3730(false, false);
	}

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!pq;IIIII[BI)V")
	public Class53_Sub2_Sub1(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt4464 = arg2;
		this.anInt4466 = arg3;
		this.method3733(true, arg3, arg6, arg2, arg7);
		this.aFloat31 = (float) arg2 / (float) arg4;
		this.aFloat32 = (float) arg3 / (float) arg5;
		this.aBoolean279 = false;
		this.method3730(false, false);
	}

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!pq;IIII)V")
	public Class53_Sub2_Sub1(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt4464 = arg3;
		this.anInt4466 = arg4;
		if (super.anInt9817 == 34037) {
			this.aFloat31 = (float) arg3;
			this.aBoolean279 = false;
			this.aFloat32 = (float) arg4;
		} else {
			this.aFloat31 = this.aFloat32 = 1.0F;
			this.aBoolean279 = true;
		}
	}

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!pq;IIIIIZ)V")
	public Class53_Sub2_Sub1(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt4466 = arg5;
		this.anInt4464 = arg4;
		if (super.anInt9817 == 34037) {
			this.aFloat31 = (float) arg4;
			this.aFloat32 = (float) arg5;
			this.aBoolean279 = false;
		} else {
			this.aBoolean279 = true;
			this.aFloat31 = this.aFloat32 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!pq;IIIIIIZ)V")
	public Class53_Sub2_Sub1(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat32 = (float) arg4 / (float) arg6;
		this.aBoolean279 = false;
		this.anInt4466 = arg4;
		this.anInt4464 = arg3;
		this.aFloat31 = (float) arg3 / (float) arg5;
		this.method3730(false, false);
	}

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!pq;IIII[I)V")
	public Class53_Sub2_Sub1(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt4466 = arg2;
		this.anInt4464 = arg1;
		this.method3727(0, 0, arg5, arg1, arg2, 0);
		this.aFloat31 = (float) arg1 / (float) arg3;
		this.aBoolean279 = false;
		this.aFloat32 = (float) arg2 / (float) arg4;
		this.method3730(false, false);
	}
}
