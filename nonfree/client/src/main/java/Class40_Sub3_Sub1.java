import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public final class Class40_Sub3_Sub1 extends Class40_Sub3 {

	@OriginalMember(owner = "client!js", name = "N", descriptor = "Z")
	public final boolean aBoolean236;

	@OriginalMember(owner = "client!js", name = "L", descriptor = "F")
	public final float aFloat62;

	@OriginalMember(owner = "client!js", name = "J", descriptor = "F")
	public final float aFloat61;

	@OriginalMember(owner = "client!js", name = "P", descriptor = "I")
	public final int anInt3385;

	@OriginalMember(owner = "client!js", name = "M", descriptor = "I")
	public final int anInt3384;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lclient!bl;IIIIZ[BI)V")
	public Class40_Sub3_Sub1(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt6158 == 34037) {
			this.aBoolean236 = false;
			this.aFloat61 = arg3;
			this.aFloat62 = arg4;
		} else {
			this.aBoolean236 = true;
			this.aFloat61 = this.aFloat62 = 1.0F;
		}
		this.anInt3385 = arg4;
		this.anInt3384 = arg3;
	}

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lclient!bl;IIIIIIZ)V")
	public Class40_Sub3_Sub1(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat61 = (float) arg3 / (float) arg5;
		this.anInt3384 = arg3;
		this.aFloat62 = (float) arg4 / (float) arg6;
		this.aBoolean236 = false;
		this.anInt3385 = arg4;
		this.method3021(false, false);
	}

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lclient!bl;IIIIIZ)V")
	public Class40_Sub3_Sub1(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt3385 = arg5;
		this.anInt3384 = arg4;
		if (super.anInt6158 == 34037) {
			this.aBoolean236 = false;
			this.aFloat61 = arg4;
			this.aFloat62 = arg5;
		} else {
			this.aBoolean236 = true;
			this.aFloat61 = this.aFloat62 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lclient!bl;IIII[I)V")
	public Class40_Sub3_Sub1(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt3384 = arg1;
		this.anInt3385 = arg2;
		this.method3024(arg1, arg5, arg2);
		this.aBoolean236 = false;
		this.aFloat62 = (float) arg2 / (float) arg4;
		this.aFloat61 = (float) arg1 / (float) arg3;
		this.method3021(false, false);
	}

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lclient!bl;IIIZ[I)V")
	public Class40_Sub3_Sub1(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		if (super.anInt6158 == 34037) {
			this.aFloat61 = arg2;
			this.aFloat62 = arg3;
			this.aBoolean236 = false;
		} else {
			this.aBoolean236 = true;
			this.aFloat61 = this.aFloat62 = 1.0F;
		}
		this.anInt3384 = arg2;
		this.anInt3385 = arg3;
	}

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lclient!bl;IIIII[BI)V")
	public Class40_Sub3_Sub1(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt3385 = arg3;
		this.anInt3384 = arg2;
		this.method3019(arg7, arg6, arg2, arg3, true);
		this.aFloat62 = (float) arg3 / (float) arg5;
		this.aFloat61 = (float) arg2 / (float) arg4;
		this.aBoolean236 = false;
		this.method3021(false, false);
	}
}
