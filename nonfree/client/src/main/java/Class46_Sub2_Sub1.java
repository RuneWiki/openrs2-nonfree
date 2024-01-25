import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public final class Class46_Sub2_Sub1 extends Class46_Sub2 {

	@OriginalMember(owner = "client!nea", name = "O", descriptor = "F")
	public final float aFloat173;

	@OriginalMember(owner = "client!nea", name = "R", descriptor = "F")
	public final float aFloat174;

	@OriginalMember(owner = "client!nea", name = "S", descriptor = "Z")
	public final boolean aBoolean502;

	@OriginalMember(owner = "client!nea", name = "N", descriptor = "I")
	public final int anInt6370;

	@OriginalMember(owner = "client!nea", name = "Q", descriptor = "I")
	public final int anInt6372;

	@OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Lclient!lj;IIIIZ[BI)V")
	public Class46_Sub2_Sub1(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt6350 == 34037) {
			this.aFloat173 = arg4;
			this.aBoolean502 = false;
			this.aFloat174 = arg3;
		} else {
			this.aFloat174 = this.aFloat173 = 1.0F;
			this.aBoolean502 = true;
		}
		this.anInt6370 = arg3;
		this.anInt6372 = arg4;
	}

	@OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Lclient!lj;IIII)V")
	public Class46_Sub2_Sub1(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt6370 = arg3;
		if (super.anInt6350 == 34037) {
			this.aFloat173 = arg4;
			this.aFloat174 = arg3;
			this.aBoolean502 = false;
		} else {
			this.aFloat174 = this.aFloat173 = 1.0F;
			this.aBoolean502 = true;
		}
		this.anInt6372 = arg4;
	}

	@OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Lclient!lj;IIIII[BI)V")
	public Class46_Sub2_Sub1(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt6370 = arg2;
		this.anInt6372 = arg3;
		this.method5145(arg7, true, arg2, arg6, arg3);
		this.aBoolean502 = false;
		this.aFloat173 = (float) arg3 / (float) arg5;
		this.aFloat174 = (float) arg2 / (float) arg4;
		this.method5150(false, false);
	}

	@OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Lclient!lj;IIIZ[III)V")
	public Class46_Sub2_Sub1(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt6372 = arg3;
		this.anInt6370 = arg2;
		if (super.anInt6350 == 34037) {
			this.aFloat173 = arg3;
			this.aBoolean502 = false;
			this.aFloat174 = arg2;
		} else {
			this.aFloat174 = this.aFloat173 = 1.0F;
			this.aBoolean502 = true;
		}
	}

	@OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Lclient!lj;IIIIIZ)V")
	public Class46_Sub2_Sub1(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (super.anInt6350 == 34037) {
			this.aFloat173 = arg5;
			this.aFloat174 = arg4;
			this.aBoolean502 = false;
		} else {
			this.aBoolean502 = true;
			this.aFloat174 = this.aFloat173 = 1.0F;
		}
		this.anInt6372 = arg5;
		this.anInt6370 = arg4;
	}

	@OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Lclient!lj;IIIII)V")
	public Class46_Sub2_Sub1(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.aBoolean502 = false;
		this.aFloat174 = (float) arg2 / (float) arg4;
		this.aFloat173 = (float) arg3 / (float) arg5;
		this.anInt6370 = arg2;
		this.anInt6372 = arg3;
		this.method5150(false, false);
	}

	@OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Lclient!lj;IIII[I)V")
	public Class46_Sub2_Sub1(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt6370 = arg1;
		this.anInt6372 = arg2;
		this.method5149(arg2, arg5, arg1);
		this.aFloat174 = (float) arg1 / (float) arg3;
		this.aFloat173 = (float) arg2 / (float) arg4;
		this.aBoolean502 = false;
		this.method5150(false, false);
	}

	@OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Lclient!lj;IIIIIIZ)V")
	public Class46_Sub2_Sub1(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat174 = (float) arg3 / (float) arg5;
		this.aBoolean502 = false;
		this.aFloat173 = (float) arg4 / (float) arg6;
		this.anInt6372 = arg4;
		this.anInt6370 = arg3;
		this.method5150(false, false);
	}
}
