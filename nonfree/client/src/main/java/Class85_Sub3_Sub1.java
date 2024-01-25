import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public final class Class85_Sub3_Sub1 extends Class85_Sub3 {

	@OriginalMember(owner = "client!me", name = "X", descriptor = "I")
	public final int anInt5931;

	@OriginalMember(owner = "client!me", name = "V", descriptor = "F")
	public final float aFloat119;

	@OriginalMember(owner = "client!me", name = "R", descriptor = "Z")
	public final boolean aBoolean427;

	@OriginalMember(owner = "client!me", name = "T", descriptor = "F")
	public final float aFloat118;

	@OriginalMember(owner = "client!me", name = "P", descriptor = "I")
	public final int anInt5927;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!dia;IIIII)V")
	public Class85_Sub3_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt5931 = arg2;
		this.aFloat119 = (float) arg2 / (float) arg4;
		this.aBoolean427 = false;
		this.aFloat118 = (float) arg3 / (float) arg5;
		this.anInt5927 = arg3;
		this.method5365(false, false);
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!dia;IIII[I)V")
	public Class85_Sub3_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt5931 = arg1;
		this.anInt5927 = arg2;
		this.method5372(arg5, 0, arg2, 0, arg1, 0);
		this.aBoolean427 = false;
		this.aFloat118 = (float) arg2 / (float) arg4;
		this.aFloat119 = (float) arg1 / (float) arg3;
		this.method5365(false, false);
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!dia;IIIIZ[BI)V")
	public Class85_Sub3_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt5927 = arg4;
		this.anInt5931 = arg3;
		if (super.anInt9006 == 34037) {
			this.aFloat118 = (float) arg4;
			this.aFloat119 = (float) arg3;
			this.aBoolean427 = false;
		} else {
			this.aBoolean427 = true;
			this.aFloat119 = this.aFloat118 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!dia;IIIIIZ)V")
	public Class85_Sub3_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt5931 = arg4;
		if (super.anInt9006 == 34037) {
			this.aFloat118 = (float) arg5;
			this.aFloat119 = (float) arg4;
			this.aBoolean427 = false;
		} else {
			this.aFloat119 = this.aFloat118 = 1.0F;
			this.aBoolean427 = true;
		}
		this.anInt5927 = arg5;
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!dia;IIIZ[III)V")
	public Class85_Sub3_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt9006 == 34037) {
			this.aFloat119 = (float) arg2;
			this.aBoolean427 = false;
			this.aFloat118 = (float) arg3;
		} else {
			this.aBoolean427 = true;
			this.aFloat119 = this.aFloat118 = 1.0F;
		}
		this.anInt5931 = arg2;
		this.anInt5927 = arg3;
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!dia;IIII)V")
	public Class85_Sub3_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		if (super.anInt9006 == 34037) {
			this.aFloat118 = (float) arg4;
			this.aFloat119 = (float) arg3;
			this.aBoolean427 = false;
		} else {
			this.aBoolean427 = true;
			this.aFloat119 = this.aFloat118 = 1.0F;
		}
		this.anInt5927 = arg4;
		this.anInt5931 = arg3;
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!dia;IIIII[BI)V")
	public Class85_Sub3_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt5931 = arg2;
		this.anInt5927 = arg3;
		this.method5368(arg2, true, arg3, arg6, arg7);
		this.aBoolean427 = false;
		this.aFloat118 = (float) arg3 / (float) arg5;
		this.aFloat119 = (float) arg2 / (float) arg4;
		this.method5365(false, false);
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!dia;IIIIIIZ)V")
	public Class85_Sub3_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat118 = (float) arg4 / (float) arg6;
		this.aBoolean427 = false;
		this.anInt5927 = arg4;
		this.aFloat119 = (float) arg3 / (float) arg5;
		this.anInt5931 = arg3;
		this.method5365(false, false);
	}
}
