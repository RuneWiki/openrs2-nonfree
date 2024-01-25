import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public final class Class20_Sub4_Sub1 extends Class20_Sub4 {

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
	public final int anInt6338;

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
	public final int anInt6339;

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "Z")
	public final boolean aBoolean450;

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "F")
	public final float aFloat78;

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "F")
	public final float aFloat79;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!fu;IIIII[BI)V")
	public Class20_Sub4_Sub1(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt6338 = arg3;
		this.anInt6339 = arg2;
		this.method5508(arg2, arg3, arg6, arg7, true);
		this.aBoolean450 = false;
		this.aFloat78 = (float) arg3 / (float) arg5;
		this.aFloat79 = (float) arg2 / (float) arg4;
		this.method5511(false, false);
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!fu;IIIIZ[BI)V")
	public Class20_Sub4_Sub1(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (this.anInt6331 == 34037) {
			this.aFloat79 = arg3;
			this.aFloat78 = arg4;
			this.aBoolean450 = false;
		} else {
			this.aFloat79 = this.aFloat78 = 1.0F;
			this.aBoolean450 = true;
		}
		this.anInt6339 = arg3;
		this.anInt6338 = arg4;
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!fu;IIIIIIZ)V")
	public Class20_Sub4_Sub1(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt6338 = arg4;
		this.anInt6339 = arg3;
		this.aFloat78 = (float) arg4 / (float) arg6;
		this.aBoolean450 = false;
		this.aFloat79 = (float) arg3 / (float) arg5;
		this.method5511(false, false);
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!fu;IIII[I)V")
	public Class20_Sub4_Sub1(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt6339 = arg1;
		this.anInt6338 = arg2;
		this.method5512(arg1, arg2, arg5);
		this.aBoolean450 = false;
		this.aFloat79 = (float) arg1 / (float) arg3;
		this.aFloat78 = (float) arg2 / (float) arg4;
		this.method5511(false, false);
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!fu;IIIIIZ)V")
	public Class20_Sub4_Sub1(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt6339 = arg4;
		this.anInt6338 = arg5;
		if (this.anInt6331 == 34037) {
			this.aFloat78 = arg5;
			this.aFloat79 = arg4;
			this.aBoolean450 = false;
		} else {
			this.aBoolean450 = true;
			this.aFloat79 = this.aFloat78 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!fu;IIIZ[I)V")
	public Class20_Sub4_Sub1(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		if (this.anInt6331 == 34037) {
			this.aFloat78 = arg3;
			this.aBoolean450 = false;
			this.aFloat79 = arg2;
		} else {
			this.aFloat79 = this.aFloat78 = 1.0F;
			this.aBoolean450 = true;
		}
		this.anInt6338 = arg3;
		this.anInt6339 = arg2;
	}
}
