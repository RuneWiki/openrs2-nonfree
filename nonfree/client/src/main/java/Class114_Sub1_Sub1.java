import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public final class Class114_Sub1_Sub1 extends Class114_Sub1 {

	@OriginalMember(owner = "client!mn", name = "M", descriptor = "F")
	public final float aFloat103;

	@OriginalMember(owner = "client!mn", name = "K", descriptor = "I")
	public final int anInt5922;

	@OriginalMember(owner = "client!mn", name = "L", descriptor = "Z")
	public final boolean aBoolean441;

	@OriginalMember(owner = "client!mn", name = "S", descriptor = "F")
	public final float aFloat104;

	@OriginalMember(owner = "client!mn", name = "P", descriptor = "I")
	public final int anInt5924;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!no;IIIIIIZ)V")
	public Class114_Sub1_Sub1(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat103 = (float) arg3 / (float) arg5;
		this.anInt5922 = arg3;
		this.aBoolean441 = false;
		this.aFloat104 = (float) arg4 / (float) arg6;
		this.anInt5924 = arg4;
		this.method5008(false, false);
	}

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!no;IIIIZ[BI)V")
	public Class114_Sub1_Sub1(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt5924 = arg4;
		if (super.anInt5902 == 34037) {
			this.aFloat104 = arg4;
			this.aFloat103 = arg3;
			this.aBoolean441 = false;
		} else {
			this.aFloat103 = this.aFloat104 = 1.0F;
			this.aBoolean441 = true;
		}
		this.anInt5922 = arg3;
	}

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!no;IIIII[BI)V")
	public Class114_Sub1_Sub1(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt5924 = arg3;
		this.anInt5922 = arg2;
		this.method5014(arg7, arg2, arg6, arg3, true);
		this.aBoolean441 = false;
		this.aFloat103 = (float) arg2 / (float) arg4;
		this.aFloat104 = (float) arg3 / (float) arg5;
		this.method5008(false, false);
	}

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!no;IIIIIZ)V")
	public Class114_Sub1_Sub1(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt5924 = arg5;
		if (super.anInt5902 == 34037) {
			this.aFloat103 = arg4;
			this.aFloat104 = arg5;
			this.aBoolean441 = false;
		} else {
			this.aBoolean441 = true;
			this.aFloat103 = this.aFloat104 = 1.0F;
		}
		this.anInt5922 = arg4;
	}

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!no;IIIII)V")
	public Class114_Sub1_Sub1(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.aFloat103 = (float) arg2 / (float) arg4;
		this.aFloat104 = (float) arg3 / (float) arg5;
		this.anInt5924 = arg3;
		this.aBoolean441 = false;
		this.anInt5922 = arg2;
		this.method5008(false, false);
	}

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!no;IIIZ[I)V")
	public Class114_Sub1_Sub1(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		if (super.anInt5902 == 34037) {
			this.aFloat104 = arg3;
			this.aBoolean441 = false;
			this.aFloat103 = arg2;
		} else {
			this.aBoolean441 = true;
			this.aFloat103 = this.aFloat104 = 1.0F;
		}
		this.anInt5924 = arg3;
		this.anInt5922 = arg2;
	}

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!no;IIII)V")
	public Class114_Sub1_Sub1(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		if (super.anInt5902 == 34037) {
			this.aFloat104 = arg4;
			this.aFloat103 = arg3;
			this.aBoolean441 = false;
		} else {
			this.aBoolean441 = true;
			this.aFloat103 = this.aFloat104 = 1.0F;
		}
		this.anInt5922 = arg3;
		this.anInt5924 = arg4;
	}

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!no;IIII[I)V")
	public Class114_Sub1_Sub1(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt5924 = arg2;
		this.anInt5922 = arg1;
		this.method5011(arg5, arg2, arg1);
		this.aFloat104 = (float) arg2 / (float) arg4;
		this.aFloat103 = (float) arg1 / (float) arg3;
		this.aBoolean441 = false;
		this.method5008(false, false);
	}
}
