import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public final class Class85_Sub1_Sub1 extends Class85_Sub1 {

	@OriginalMember(owner = "client!eba", name = "I", descriptor = "Z")
	public final boolean aBoolean246;

	@OriginalMember(owner = "client!eba", name = "F", descriptor = "F")
	public final float aFloat96;

	@OriginalMember(owner = "client!eba", name = "E", descriptor = "F")
	public final float aFloat95;

	@OriginalMember(owner = "client!eba", name = "H", descriptor = "I")
	public final int anInt3123;

	@OriginalMember(owner = "client!eba", name = "G", descriptor = "I")
	public final int anInt3122;

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lclient!qo;IIII)V")
	public Class85_Sub1_Sub1(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		if (super.anInt10892 == 34037) {
			this.aFloat96 = arg4;
			this.aBoolean246 = false;
			this.aFloat95 = arg3;
		} else {
			this.aBoolean246 = true;
			this.aFloat95 = this.aFloat96 = 1.0F;
		}
		this.anInt3123 = arg3;
		this.anInt3122 = arg4;
	}

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lclient!qo;IIIII)V")
	public Class85_Sub1_Sub1(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.aFloat95 = (float) arg2 / (float) arg4;
		this.anInt3122 = arg3;
		this.anInt3123 = arg2;
		this.aFloat96 = (float) arg3 / (float) arg5;
		this.aBoolean246 = false;
		this.method2893(false, false);
	}

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lclient!qo;IIIIIZ)V")
	public Class85_Sub1_Sub1(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt3123 = arg4;
		if (super.anInt10892 == 34037) {
			this.aBoolean246 = false;
			this.aFloat95 = arg4;
			this.aFloat96 = arg5;
		} else {
			this.aBoolean246 = true;
			this.aFloat95 = this.aFloat96 = 1.0F;
		}
		this.anInt3122 = arg5;
	}

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lclient!qo;IIIIIIZ)V")
	public Class85_Sub1_Sub1(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt3123 = arg3;
		this.aFloat96 = (float) arg4 / (float) arg6;
		this.aFloat95 = (float) arg3 / (float) arg5;
		this.anInt3122 = arg4;
		this.aBoolean246 = false;
		this.method2893(false, false);
	}

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lclient!qo;IIIII[BI)V")
	public Class85_Sub1_Sub1(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt3123 = arg2;
		this.anInt3122 = arg3;
		this.method2898(arg2, true, arg3, arg7, arg6);
		this.aFloat96 = (float) arg3 / (float) arg5;
		this.aFloat95 = (float) arg2 / (float) arg4;
		this.aBoolean246 = false;
		this.method2893(false, false);
	}

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lclient!qo;IIIZ[III)V")
	public Class85_Sub1_Sub1(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt10892 == 34037) {
			this.aFloat95 = arg2;
			this.aBoolean246 = false;
			this.aFloat96 = arg3;
		} else {
			this.aBoolean246 = true;
			this.aFloat95 = this.aFloat96 = 1.0F;
		}
		this.anInt3122 = arg3;
		this.anInt3123 = arg2;
	}

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lclient!qo;IIII[I)V")
	public Class85_Sub1_Sub1(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt3123 = arg1;
		this.anInt3122 = arg2;
		this.method2892(arg2, arg5, arg1);
		this.aFloat95 = (float) arg1 / (float) arg3;
		this.aFloat96 = (float) arg2 / (float) arg4;
		this.aBoolean246 = false;
		this.method2893(false, false);
	}

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lclient!qo;IIIIZ[BI)V")
	public Class85_Sub1_Sub1(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt3123 = arg3;
		if (super.anInt10892 == 34037) {
			this.aFloat96 = arg4;
			this.aBoolean246 = false;
			this.aFloat95 = arg3;
		} else {
			this.aBoolean246 = true;
			this.aFloat95 = this.aFloat96 = 1.0F;
		}
		this.anInt3122 = arg4;
	}
}
