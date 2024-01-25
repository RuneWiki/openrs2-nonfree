import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public final class Class20_Sub1_Sub1 extends Class20_Sub1 {

	@OriginalMember(owner = "client!gq", name = "P", descriptor = "F")
	public final float aFloat26;

	@OriginalMember(owner = "client!gq", name = "L", descriptor = "F")
	public final float aFloat25;

	@OriginalMember(owner = "client!gq", name = "O", descriptor = "Z")
	public final boolean aBoolean164;

	@OriginalMember(owner = "client!gq", name = "K", descriptor = "I")
	public final int anInt2476;

	@OriginalMember(owner = "client!gq", name = "M", descriptor = "I")
	public final int anInt2477;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!pg;IIIZ[I)V")
	public Class20_Sub1_Sub1(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		if (super.anInt3919 == 34037) {
			this.aFloat26 = arg2;
			this.aFloat25 = arg3;
			this.aBoolean164 = false;
		} else {
			this.aBoolean164 = true;
			this.aFloat26 = this.aFloat25 = 1.0F;
		}
		this.anInt2476 = arg3;
		this.anInt2477 = arg2;
	}

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!pg;IIIIZ[BI)V")
	public Class20_Sub1_Sub1(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt2477 = arg3;
		this.anInt2476 = arg4;
		if (super.anInt3919 == 34037) {
			this.aFloat25 = arg4;
			this.aBoolean164 = false;
			this.aFloat26 = arg3;
		} else {
			this.aBoolean164 = true;
			this.aFloat26 = this.aFloat25 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!pg;IIIIIIZ)V")
	public Class20_Sub1_Sub1(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt2476 = arg4;
		this.aBoolean164 = false;
		this.anInt2477 = arg3;
		this.aFloat26 = (float) arg3 / (float) arg5;
		this.aFloat25 = (float) arg4 / (float) arg6;
		this.method2040(false, false);
	}

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!pg;IIIIIZ)V")
	public Class20_Sub1_Sub1(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt2476 = arg5;
		if (super.anInt3919 == 34037) {
			this.aFloat26 = arg4;
			this.aFloat25 = arg5;
			this.aBoolean164 = false;
		} else {
			this.aBoolean164 = true;
			this.aFloat26 = this.aFloat25 = 1.0F;
		}
		this.anInt2477 = arg4;
	}

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!pg;IIII[I)V")
	public Class20_Sub1_Sub1(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt2476 = arg2;
		this.anInt2477 = arg1;
		this.method2041(arg5, arg2, arg1);
		this.aBoolean164 = false;
		this.aFloat26 = (float) arg1 / (float) arg3;
		this.aFloat25 = (float) arg2 / (float) arg4;
		this.method2040(false, false);
	}

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!pg;IIIII[BI)V")
	public Class20_Sub1_Sub1(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt2476 = arg3;
		this.anInt2477 = arg2;
		this.method2046(arg2, arg7, true, arg3, arg6);
		this.aFloat26 = (float) arg2 / (float) arg4;
		this.aFloat25 = (float) arg3 / (float) arg5;
		this.aBoolean164 = false;
		this.method2040(false, false);
	}
}
