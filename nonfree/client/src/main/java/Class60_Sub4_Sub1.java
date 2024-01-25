import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public final class Class60_Sub4_Sub1 extends Class60_Sub4 {

	@OriginalMember(owner = "client!vj", name = "p", descriptor = "F")
	public final float aFloat79;

	@OriginalMember(owner = "client!vj", name = "n", descriptor = "Z")
	public final boolean aBoolean570;

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "F")
	public final float aFloat78;

	@OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
	public final int anInt6577;

	@OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
	public final int anInt6576;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lclient!mm;IIIZ[I)V")
	public Class60_Sub4_Sub1(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		if (this.anInt6572 == 34037) {
			this.aFloat79 = arg2;
			this.aBoolean570 = false;
			this.aFloat78 = arg3;
		} else {
			this.aBoolean570 = true;
			this.aFloat79 = this.aFloat78 = 1.0F;
		}
		this.anInt6577 = arg2;
		this.anInt6576 = arg3;
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lclient!mm;IIIIIIZ)V")
	public Class60_Sub4_Sub1(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat79 = (float) arg3 / (float) arg5;
		this.aBoolean570 = false;
		this.anInt6576 = arg4;
		this.anInt6577 = arg3;
		this.aFloat78 = (float) arg4 / (float) arg6;
		this.method5849(false, false);
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lclient!mm;IIII[I)V")
	public Class60_Sub4_Sub1(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt6577 = arg1;
		this.anInt6576 = arg2;
		this.method5848(arg1, arg2, arg5);
		this.aFloat78 = (float) arg2 / (float) arg4;
		this.aFloat79 = (float) arg1 / (float) arg3;
		this.aBoolean570 = false;
		this.method5849(false, false);
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lclient!mm;IIIIZ[BI)V")
	public Class60_Sub4_Sub1(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt6576 = arg4;
		this.anInt6577 = arg3;
		if (this.anInt6572 == 34037) {
			this.aFloat78 = arg4;
			this.aBoolean570 = false;
			this.aFloat79 = arg3;
		} else {
			this.aFloat79 = this.aFloat78 = 1.0F;
			this.aBoolean570 = true;
		}
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lclient!mm;IIIII[BI)V")
	public Class60_Sub4_Sub1(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt6577 = arg2;
		this.anInt6576 = arg3;
		this.method5847(arg2, arg3, arg6, arg7, true);
		this.aFloat79 = (float) arg2 / (float) arg4;
		this.aFloat78 = (float) arg3 / (float) arg5;
		this.aBoolean570 = false;
		this.method5849(false, false);
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lclient!mm;IIIIIZ)V")
	public Class60_Sub4_Sub1(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (this.anInt6572 == 34037) {
			this.aFloat79 = arg4;
			this.aFloat78 = arg5;
			this.aBoolean570 = false;
		} else {
			this.aFloat79 = this.aFloat78 = 1.0F;
			this.aBoolean570 = true;
		}
		this.anInt6576 = arg5;
		this.anInt6577 = arg4;
	}
}
