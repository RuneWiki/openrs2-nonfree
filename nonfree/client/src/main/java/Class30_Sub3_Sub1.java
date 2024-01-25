import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public final class Class30_Sub3_Sub1 extends Class30_Sub3 {

	@OriginalMember(owner = "client!rh", name = "o", descriptor = "Z")
	public final boolean aBoolean405;

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "F")
	public final float aFloat61;

	@OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
	public final int anInt5161;

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
	public final int anInt5160;

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "F")
	public final float aFloat60;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!mi;IIIIIIZ)V")
	public Class30_Sub3_Sub1(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aBoolean405 = false;
		this.aFloat61 = (float) arg4 / (float) arg6;
		this.anInt5161 = arg4;
		this.anInt5160 = arg3;
		this.aFloat60 = (float) arg3 / (float) arg5;
		this.method4613(false, false);
	}

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!mi;IIIZ[I)V")
	public Class30_Sub3_Sub1(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt5161 = arg3;
		if (this.anInt5155 == 34037) {
			this.aBoolean405 = false;
			this.aFloat60 = arg2;
			this.aFloat61 = arg3;
		} else {
			this.aFloat60 = this.aFloat61 = 1.0F;
			this.aBoolean405 = true;
		}
		this.anInt5160 = arg2;
	}

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!mi;IIII[I)V")
	public Class30_Sub3_Sub1(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt5160 = arg1;
		this.anInt5161 = arg2;
		this.method4617(arg1, arg2, arg5);
		this.aBoolean405 = false;
		this.aFloat60 = (float) arg1 / (float) arg3;
		this.aFloat61 = (float) arg2 / (float) arg4;
		this.method4613(false, false);
	}

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!mi;IIIIIZ)V")
	public Class30_Sub3_Sub1(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (this.anInt5155 == 34037) {
			this.aBoolean405 = false;
			this.aFloat60 = arg4;
			this.aFloat61 = arg5;
		} else {
			this.aBoolean405 = true;
			this.aFloat60 = this.aFloat61 = 1.0F;
		}
		this.anInt5161 = arg5;
		this.anInt5160 = arg4;
	}

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!mi;IIIII[BI)V")
	public Class30_Sub3_Sub1(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt5161 = arg3;
		this.anInt5160 = arg2;
		this.method4615(arg2, arg3, arg6, arg7, true);
		this.aFloat61 = (float) arg3 / (float) arg5;
		this.aFloat60 = (float) arg2 / (float) arg4;
		this.aBoolean405 = false;
		this.method4613(false, false);
	}

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!mi;IIIIZ[BI)V")
	public Class30_Sub3_Sub1(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt5161 = arg4;
		if (this.anInt5155 == 34037) {
			this.aBoolean405 = false;
			this.aFloat61 = arg4;
			this.aFloat60 = arg3;
		} else {
			this.aFloat60 = this.aFloat61 = 1.0F;
			this.aBoolean405 = true;
		}
		this.anInt5160 = arg3;
	}
}
