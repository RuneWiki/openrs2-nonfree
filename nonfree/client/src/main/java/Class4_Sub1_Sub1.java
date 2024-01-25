import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public final class Class4_Sub1_Sub1 extends Class4_Sub1 {

	@OriginalMember(owner = "client!al", name = "R", descriptor = "I")
	public final int anInt214;

	@OriginalMember(owner = "client!al", name = "U", descriptor = "I")
	public final int anInt216;

	@OriginalMember(owner = "client!al", name = "M", descriptor = "Z")
	public final boolean aBoolean16;

	@OriginalMember(owner = "client!al", name = "V", descriptor = "F")
	public final float aFloat4;

	@OriginalMember(owner = "client!al", name = "Q", descriptor = "F")
	public final float aFloat3;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!da;IIIZ[I)V")
	public Class4_Sub1_Sub1(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt214 = arg2;
		this.anInt216 = arg3;
		if (super.anInt5771 == 34037) {
			this.aBoolean16 = false;
			this.aFloat4 = arg2;
			this.aFloat3 = arg3;
		} else {
			this.aFloat4 = this.aFloat3 = 1.0F;
			this.aBoolean16 = true;
		}
	}

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!da;IIIIZ[BI)V")
	public Class4_Sub1_Sub1(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt5771 == 34037) {
			this.aFloat3 = arg4;
			this.aBoolean16 = false;
			this.aFloat4 = arg3;
		} else {
			this.aBoolean16 = true;
			this.aFloat4 = this.aFloat3 = 1.0F;
		}
		this.anInt216 = arg4;
		this.anInt214 = arg3;
	}

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!da;IIIII[BI)V")
	public Class4_Sub1_Sub1(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt214 = arg2;
		this.anInt216 = arg3;
		this.method156(arg2, true, arg7, arg3, arg6);
		this.aFloat4 = (float) arg2 / (float) arg4;
		this.aFloat3 = (float) arg3 / (float) arg5;
		this.aBoolean16 = false;
		this.method154(false, false);
	}

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!da;IIIIIIZ)V")
	public Class4_Sub1_Sub1(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt214 = arg3;
		this.aFloat3 = (float) arg4 / (float) arg6;
		this.aFloat4 = (float) arg3 / (float) arg5;
		this.aBoolean16 = false;
		this.anInt216 = arg4;
		this.method154(false, false);
	}

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!da;IIIIIZ)V")
	public Class4_Sub1_Sub1(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (super.anInt5771 == 34037) {
			this.aFloat4 = arg4;
			this.aBoolean16 = false;
			this.aFloat3 = arg5;
		} else {
			this.aFloat4 = this.aFloat3 = 1.0F;
			this.aBoolean16 = true;
		}
		this.anInt214 = arg4;
		this.anInt216 = arg5;
	}

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!da;IIII[I)V")
	public Class4_Sub1_Sub1(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt216 = arg2;
		this.anInt214 = arg1;
		this.method157(arg2, arg5, arg1);
		this.aBoolean16 = false;
		this.aFloat4 = (float) arg1 / (float) arg3;
		this.aFloat3 = (float) arg2 / (float) arg4;
		this.method154(false, false);
	}
}
