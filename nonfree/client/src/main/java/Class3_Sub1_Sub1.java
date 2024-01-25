import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public final class Class3_Sub1_Sub1 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
	public final int anInt2079;

	@OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
	public final int anInt2081;

	@OriginalMember(owner = "client!ei", name = "H", descriptor = "F")
	public final float aFloat52;

	@OriginalMember(owner = "client!ei", name = "M", descriptor = "F")
	public final float aFloat53;

	@OriginalMember(owner = "client!ei", name = "K", descriptor = "Z")
	public final boolean aBoolean138;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!uca;IIIIIZ)V")
	public Class3_Sub1_Sub1(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt2079 = arg4;
		this.anInt2081 = arg5;
		if (super.anInt6726 == 34037) {
			this.aFloat52 = arg5;
			this.aBoolean138 = false;
			this.aFloat53 = arg4;
		} else {
			this.aFloat53 = this.aFloat52 = 1.0F;
			this.aBoolean138 = true;
		}
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!uca;IIIZ[III)V")
	public Class3_Sub1_Sub1(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt6726 == 34037) {
			this.aBoolean138 = false;
			this.aFloat53 = arg2;
			this.aFloat52 = arg3;
		} else {
			this.aFloat53 = this.aFloat52 = 1.0F;
			this.aBoolean138 = true;
		}
		this.anInt2079 = arg2;
		this.anInt2081 = arg3;
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!uca;IIII[I)V")
	public Class3_Sub1_Sub1(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt2081 = arg2;
		this.anInt2079 = arg1;
		this.method1716(arg5, arg1, arg2);
		this.aFloat53 = (float) arg1 / (float) arg3;
		this.aFloat52 = (float) arg2 / (float) arg4;
		this.aBoolean138 = false;
		this.method1720(false, false);
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!uca;IIIII)V")
	public Class3_Sub1_Sub1(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt2081 = arg3;
		this.aBoolean138 = false;
		this.anInt2079 = arg2;
		this.aFloat52 = (float) arg3 / (float) arg5;
		this.aFloat53 = (float) arg2 / (float) arg4;
		this.method1720(false, false);
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!uca;IIIII[BI)V")
	public Class3_Sub1_Sub1(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt2079 = arg2;
		this.anInt2081 = arg3;
		this.method1719(arg2, arg3, arg6, arg7, true);
		this.aBoolean138 = false;
		this.aFloat53 = (float) arg2 / (float) arg4;
		this.aFloat52 = (float) arg3 / (float) arg5;
		this.method1720(false, false);
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!uca;IIIIIIZ)V")
	public Class3_Sub1_Sub1(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat53 = (float) arg3 / (float) arg5;
		this.anInt2081 = arg4;
		this.anInt2079 = arg3;
		this.aFloat52 = (float) arg4 / (float) arg6;
		this.aBoolean138 = false;
		this.method1720(false, false);
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!uca;IIII)V")
	public Class3_Sub1_Sub1(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt2081 = arg4;
		if (super.anInt6726 == 34037) {
			this.aFloat52 = arg4;
			this.aFloat53 = arg3;
			this.aBoolean138 = false;
		} else {
			this.aBoolean138 = true;
			this.aFloat53 = this.aFloat52 = 1.0F;
		}
		this.anInt2079 = arg3;
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!uca;IIIIZ[BI)V")
	public Class3_Sub1_Sub1(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt6726 == 34037) {
			this.aFloat53 = arg3;
			this.aBoolean138 = false;
			this.aFloat52 = arg4;
		} else {
			this.aFloat53 = this.aFloat52 = 1.0F;
			this.aBoolean138 = true;
		}
		this.anInt2079 = arg3;
		this.anInt2081 = arg4;
	}
}
