import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public final class Class10_Sub2_Sub1 extends Class10_Sub2 {

	@OriginalMember(owner = "client!fu", name = "L", descriptor = "I")
	public final int anInt3361;

	@OriginalMember(owner = "client!fu", name = "S", descriptor = "I")
	public final int anInt3366;

	@OriginalMember(owner = "client!fu", name = "P", descriptor = "F")
	public final float aFloat58;

	@OriginalMember(owner = "client!fu", name = "K", descriptor = "Z")
	public final boolean aBoolean245;

	@OriginalMember(owner = "client!fu", name = "R", descriptor = "F")
	public final float aFloat59;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!lf;IIII[I)V")
	public Class10_Sub2_Sub1(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt3361 = arg2;
		this.anInt3366 = arg1;
		this.method2860(arg1, 0, 0, 0, arg2, arg5);
		this.aFloat58 = (float) arg1 / (float) arg3;
		this.aBoolean245 = false;
		this.aFloat59 = (float) arg2 / (float) arg4;
		this.method2859(false, false);
	}

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!lf;IIIIZ[BI)V")
	public Class10_Sub2_Sub1(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt3366 = arg3;
		this.anInt3361 = arg4;
		if (super.anInt7252 == 34037) {
			this.aFloat58 = (float) arg3;
			this.aBoolean245 = false;
			this.aFloat59 = (float) arg4;
		} else {
			this.aFloat58 = this.aFloat59 = 1.0F;
			this.aBoolean245 = true;
		}
	}

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!lf;IIIII)V")
	public Class10_Sub2_Sub1(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt3366 = arg2;
		this.aFloat58 = (float) arg2 / (float) arg4;
		this.anInt3361 = arg3;
		this.aFloat59 = (float) arg3 / (float) arg5;
		this.aBoolean245 = false;
		this.method2859(false, false);
	}

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!lf;IIIZ[III)V")
	public Class10_Sub2_Sub1(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt3361 = arg3;
		if (super.anInt7252 == 34037) {
			this.aBoolean245 = false;
			this.aFloat59 = (float) arg3;
			this.aFloat58 = (float) arg2;
		} else {
			this.aFloat58 = this.aFloat59 = 1.0F;
			this.aBoolean245 = true;
		}
		this.anInt3366 = arg2;
	}

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!lf;IIIIIIZ)V")
	public Class10_Sub2_Sub1(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aBoolean245 = false;
		this.aFloat58 = (float) arg3 / (float) arg5;
		this.anInt3366 = arg3;
		this.aFloat59 = (float) arg4 / (float) arg6;
		this.anInt3361 = arg4;
		this.method2859(false, false);
	}

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!lf;IIIII[BI)V")
	public Class10_Sub2_Sub1(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt3366 = arg2;
		this.anInt3361 = arg3;
		this.method2858(arg6, arg7, true, arg3, arg2);
		this.aFloat58 = (float) arg2 / (float) arg4;
		this.aFloat59 = (float) arg3 / (float) arg5;
		this.aBoolean245 = false;
		this.method2859(false, false);
	}

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!lf;IIII)V")
	public Class10_Sub2_Sub1(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		if (super.anInt7252 == 34037) {
			this.aFloat58 = (float) arg3;
			this.aBoolean245 = false;
			this.aFloat59 = (float) arg4;
		} else {
			this.aFloat58 = this.aFloat59 = 1.0F;
			this.aBoolean245 = true;
		}
		this.anInt3361 = arg4;
		this.anInt3366 = arg3;
	}

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!lf;IIIIIZ)V")
	public Class10_Sub2_Sub1(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (super.anInt7252 == 34037) {
			this.aBoolean245 = false;
			this.aFloat59 = (float) arg5;
			this.aFloat58 = (float) arg4;
		} else {
			this.aBoolean245 = true;
			this.aFloat58 = this.aFloat59 = 1.0F;
		}
		this.anInt3366 = arg4;
		this.anInt3361 = arg5;
	}
}
