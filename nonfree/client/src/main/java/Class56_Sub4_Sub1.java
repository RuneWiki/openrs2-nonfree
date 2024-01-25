import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public final class Class56_Sub4_Sub1 extends Class56_Sub4 {

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
	public final int anInt3016;

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "Z")
	public final boolean aBoolean198;

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "F")
	public final float aFloat22;

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "F")
	public final float aFloat21;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
	public final int anInt3015;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!tb;IIIIIZ)V")
	public Class56_Sub4_Sub1(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt3016 = arg5;
		if (this.anInt3010 == 34037) {
			this.aBoolean198 = false;
			this.aFloat22 = arg4;
			this.aFloat21 = arg5;
		} else {
			this.aFloat22 = this.aFloat21 = 1.0F;
			this.aBoolean198 = true;
		}
		this.anInt3015 = arg4;
	}

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!tb;IIIIIIZ)V")
	public Class56_Sub4_Sub1(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat21 = (float) arg4 / (float) arg6;
		this.anInt3016 = arg4;
		this.aFloat22 = (float) arg3 / (float) arg5;
		this.aBoolean198 = false;
		this.anInt3015 = arg3;
		this.method2553(false, false);
	}

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!tb;IIIIZ[BI)V")
	public Class56_Sub4_Sub1(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt3016 = arg4;
		if (this.anInt3010 == 34037) {
			this.aFloat22 = arg3;
			this.aBoolean198 = false;
			this.aFloat21 = arg4;
		} else {
			this.aBoolean198 = true;
			this.aFloat22 = this.aFloat21 = 1.0F;
		}
		this.anInt3015 = arg3;
	}

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!tb;IIIII[BI)V")
	public Class56_Sub4_Sub1(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt3016 = arg3;
		this.anInt3015 = arg2;
		this.method2551(arg2, arg3, arg6, arg7, true);
		this.aFloat21 = (float) arg3 / (float) arg5;
		this.aFloat22 = (float) arg2 / (float) arg4;
		this.aBoolean198 = false;
		this.method2553(false, false);
	}

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!tb;IIII[I)V")
	public Class56_Sub4_Sub1(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt3016 = arg2;
		this.anInt3015 = arg1;
		this.method2552(arg1, arg2, arg5);
		this.aFloat21 = (float) arg2 / (float) arg4;
		this.aBoolean198 = false;
		this.aFloat22 = (float) arg1 / (float) arg3;
		this.method2553(false, false);
	}

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!tb;IIIZ[I)V")
	public Class56_Sub4_Sub1(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt3015 = arg2;
		if (this.anInt3010 == 34037) {
			this.aFloat22 = arg2;
			this.aFloat21 = arg3;
			this.aBoolean198 = false;
		} else {
			this.aBoolean198 = true;
			this.aFloat22 = this.aFloat21 = 1.0F;
		}
		this.anInt3016 = arg3;
	}
}
