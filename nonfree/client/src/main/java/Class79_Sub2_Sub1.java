import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public final class Class79_Sub2_Sub1 extends Class79_Sub2 {

	@OriginalMember(owner = "client!es", name = "Q", descriptor = "I")
	public final int anInt2824;

	@OriginalMember(owner = "client!es", name = "I", descriptor = "Z")
	public final boolean aBoolean229;

	@OriginalMember(owner = "client!es", name = "J", descriptor = "F")
	public final float aFloat73;

	@OriginalMember(owner = "client!es", name = "L", descriptor = "F")
	public final float aFloat74;

	@OriginalMember(owner = "client!es", name = "N", descriptor = "I")
	public final int anInt2822;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!gi;IIIIIIZ)V")
	public Class79_Sub2_Sub1(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt2824 = arg4;
		this.aBoolean229 = false;
		this.aFloat73 = (float) arg3 / (float) arg5;
		this.aFloat74 = (float) arg4 / (float) arg6;
		this.anInt2822 = arg3;
		this.method2529(false, false);
	}

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!gi;IIIZ[I)V")
	public Class79_Sub2_Sub1(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt2822 = arg2;
		if (super.anInt6293 == 34037) {
			this.aFloat74 = arg3;
			this.aFloat73 = arg2;
			this.aBoolean229 = false;
		} else {
			this.aFloat73 = this.aFloat74 = 1.0F;
			this.aBoolean229 = true;
		}
		this.anInt2824 = arg3;
	}

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!gi;IIIII[BI)V")
	public Class79_Sub2_Sub1(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt2824 = arg3;
		this.anInt2822 = arg2;
		this.method2528(arg2, arg7, true, arg6, arg3);
		this.aFloat74 = (float) arg3 / (float) arg5;
		this.aFloat73 = (float) arg2 / (float) arg4;
		this.aBoolean229 = false;
		this.method2529(false, false);
	}

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!gi;IIIIIZ)V")
	public Class79_Sub2_Sub1(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt2824 = arg5;
		if (super.anInt6293 == 34037) {
			this.aBoolean229 = false;
			this.aFloat74 = arg5;
			this.aFloat73 = arg4;
		} else {
			this.aBoolean229 = true;
			this.aFloat73 = this.aFloat74 = 1.0F;
		}
		this.anInt2822 = arg4;
	}

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!gi;IIIIZ[BI)V")
	public Class79_Sub2_Sub1(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt2824 = arg4;
		this.anInt2822 = arg3;
		if (super.anInt6293 == 34037) {
			this.aBoolean229 = false;
			this.aFloat74 = arg4;
			this.aFloat73 = arg3;
		} else {
			this.aFloat73 = this.aFloat74 = 1.0F;
			this.aBoolean229 = true;
		}
	}

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!gi;IIII[I)V")
	public Class79_Sub2_Sub1(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt2822 = arg1;
		this.anInt2824 = arg2;
		this.method2525(arg5, arg1, arg2);
		this.aFloat74 = (float) arg2 / (float) arg4;
		this.aBoolean229 = false;
		this.aFloat73 = (float) arg1 / (float) arg3;
		this.method2529(false, false);
	}
}
