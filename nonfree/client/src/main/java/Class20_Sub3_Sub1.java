import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public final class Class20_Sub3_Sub1 extends Class20_Sub3 {

	@OriginalMember(owner = "client!rp", name = "S", descriptor = "I")
	public final int anInt7348;

	@OriginalMember(owner = "client!rp", name = "Q", descriptor = "Z")
	public final boolean aBoolean484;

	@OriginalMember(owner = "client!rp", name = "U", descriptor = "F")
	public final float aFloat147;

	@OriginalMember(owner = "client!rp", name = "T", descriptor = "F")
	public final float aFloat146;

	@OriginalMember(owner = "client!rp", name = "O", descriptor = "I")
	public final int anInt7346;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lclient!te;IIIIZ[BI)V")
	public Class20_Sub3_Sub1(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt7348 = arg4;
		if (super.anInt7329 == 34037) {
			this.aFloat146 = arg3;
			this.aBoolean484 = false;
			this.aFloat147 = arg4;
		} else {
			this.aBoolean484 = true;
			this.aFloat146 = this.aFloat147 = 1.0F;
		}
		this.anInt7346 = arg3;
	}

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lclient!te;IIIZ[I)V")
	public Class20_Sub3_Sub1(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt7346 = arg2;
		this.anInt7348 = arg3;
		if (super.anInt7329 == 34037) {
			this.aFloat147 = arg3;
			this.aFloat146 = arg2;
			this.aBoolean484 = false;
		} else {
			this.aFloat146 = this.aFloat147 = 1.0F;
			this.aBoolean484 = true;
		}
	}

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lclient!te;IIIIIIZ)V")
	public Class20_Sub3_Sub1(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat146 = (float) arg3 / (float) arg5;
		this.anInt7346 = arg3;
		this.anInt7348 = arg4;
		this.aBoolean484 = false;
		this.aFloat147 = (float) arg4 / (float) arg6;
		this.method6253(false, false);
	}

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lclient!te;IIII[I)V")
	public Class20_Sub3_Sub1(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt7348 = arg2;
		this.anInt7346 = arg1;
		this.method6248(arg5, arg2, arg1);
		this.aBoolean484 = false;
		this.aFloat146 = (float) arg1 / (float) arg3;
		this.aFloat147 = (float) arg2 / (float) arg4;
		this.method6253(false, false);
	}

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lclient!te;IIIII[BI)V")
	public Class20_Sub3_Sub1(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt7346 = arg2;
		this.anInt7348 = arg3;
		this.method6250(arg3, arg2, true, arg6, arg7);
		this.aBoolean484 = false;
		this.aFloat147 = (float) arg3 / (float) arg5;
		this.aFloat146 = (float) arg2 / (float) arg4;
		this.method6253(false, false);
	}

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lclient!te;IIIIIZ)V")
	public Class20_Sub3_Sub1(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt7346 = arg4;
		this.anInt7348 = arg5;
		if (super.anInt7329 == 34037) {
			this.aBoolean484 = false;
			this.aFloat147 = arg5;
			this.aFloat146 = arg4;
		} else {
			this.aFloat146 = this.aFloat147 = 1.0F;
			this.aBoolean484 = true;
		}
	}
}
