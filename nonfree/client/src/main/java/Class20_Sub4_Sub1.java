import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public final class Class20_Sub4_Sub1 extends Class20_Sub4 {

	@OriginalMember(owner = "client!tea", name = "M", descriptor = "Z")
	public final boolean aBoolean666;

	@OriginalMember(owner = "client!tea", name = "O", descriptor = "F")
	public final float aFloat189;

	@OriginalMember(owner = "client!tea", name = "B", descriptor = "F")
	public final float aFloat188;

	@OriginalMember(owner = "client!tea", name = "N", descriptor = "I")
	public final int anInt9361;

	@OriginalMember(owner = "client!tea", name = "P", descriptor = "I")
	public final int anInt9362;

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lclient!nv;IIIIZ[BI)V")
	public Class20_Sub4_Sub1(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt9337 == 34037) {
			this.aFloat189 = arg4;
			this.aBoolean666 = false;
			this.aFloat188 = arg3;
		} else {
			this.aBoolean666 = true;
			this.aFloat188 = this.aFloat189 = 1.0F;
		}
		this.anInt9361 = arg3;
		this.anInt9362 = arg4;
	}

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lclient!nv;IIIII)V")
	public Class20_Sub4_Sub1(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt9361 = arg2;
		this.aBoolean666 = false;
		this.anInt9362 = arg3;
		this.aFloat189 = (float) arg3 / (float) arg5;
		this.aFloat188 = (float) arg2 / (float) arg4;
		this.method7626(false, false);
	}

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lclient!nv;IIIIIIZ)V")
	public Class20_Sub4_Sub1(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat188 = (float) arg3 / (float) arg5;
		this.aFloat189 = (float) arg4 / (float) arg6;
		this.aBoolean666 = false;
		this.anInt9361 = arg3;
		this.anInt9362 = arg4;
		this.method7626(false, false);
	}

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lclient!nv;IIII[I)V")
	public Class20_Sub4_Sub1(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt9361 = arg1;
		this.anInt9362 = arg2;
		this.method7624(arg2, arg1, arg5);
		this.aFloat188 = (float) arg1 / (float) arg3;
		this.aBoolean666 = false;
		this.aFloat189 = (float) arg2 / (float) arg4;
		this.method7626(false, false);
	}

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lclient!nv;IIII)V")
	public Class20_Sub4_Sub1(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt9361 = arg3;
		if (super.anInt9337 == 34037) {
			this.aBoolean666 = false;
			this.aFloat188 = arg3;
			this.aFloat189 = arg4;
		} else {
			this.aFloat188 = this.aFloat189 = 1.0F;
			this.aBoolean666 = true;
		}
		this.anInt9362 = arg4;
	}

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lclient!nv;IIIII[BI)V")
	public Class20_Sub4_Sub1(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt9362 = arg3;
		this.anInt9361 = arg2;
		this.method7621(arg2, arg3, arg6, true, arg7);
		this.aFloat189 = (float) arg3 / (float) arg5;
		this.aBoolean666 = false;
		this.aFloat188 = (float) arg2 / (float) arg4;
		this.method7626(false, false);
	}

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lclient!nv;IIIIIZ)V")
	public Class20_Sub4_Sub1(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (super.anInt9337 == 34037) {
			this.aFloat188 = arg4;
			this.aFloat189 = arg5;
			this.aBoolean666 = false;
		} else {
			this.aFloat188 = this.aFloat189 = 1.0F;
			this.aBoolean666 = true;
		}
		this.anInt9362 = arg5;
		this.anInt9361 = arg4;
	}

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lclient!nv;IIIZ[III)V")
	public Class20_Sub4_Sub1(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt9337 == 34037) {
			this.aFloat189 = arg3;
			this.aFloat188 = arg2;
			this.aBoolean666 = false;
		} else {
			this.aBoolean666 = true;
			this.aFloat188 = this.aFloat189 = 1.0F;
		}
		this.anInt9362 = arg3;
		this.anInt9361 = arg2;
	}
}
