import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public final class Class28_Sub3_Sub1 extends Class28_Sub3 {

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
	public final int anInt1337;

	@OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
	public final int anInt1338;

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "Z")
	public final boolean aBoolean90;

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "F")
	public final float aFloat20;

	@OriginalMember(owner = "client!ef", name = "p", descriptor = "F")
	public final float aFloat21;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!ge;IIIIIIZ)V")
	public Class28_Sub3_Sub1(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt1337 = arg4;
		this.anInt1338 = arg3;
		this.aBoolean90 = false;
		this.aFloat20 = (float) arg4 / (float) arg6;
		this.aFloat21 = (float) arg3 / (float) arg5;
	}

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!ge;IIIZ[I)V")
	public Class28_Sub3_Sub1(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt1338 = arg2;
		if (this.anInt4318 == 34037) {
			this.aFloat20 = arg3;
			this.aFloat21 = arg2;
			this.aBoolean90 = false;
		} else {
			this.aBoolean90 = true;
			this.aFloat21 = this.aFloat20 = 1.0F;
		}
		this.anInt1337 = arg3;
	}

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!ge;IIIII[BI)V")
	public Class28_Sub3_Sub1(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt1338 = arg2;
		this.anInt1337 = arg3;
		this.method1254(arg2, arg3, arg6, arg7, true);
		this.aFloat20 = (float) arg3 / (float) arg5;
		this.aFloat21 = (float) arg2 / (float) arg4;
		this.aBoolean90 = false;
	}

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!ge;IIIIZ[BI)V")
	public Class28_Sub3_Sub1(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt1337 = arg4;
		if (this.anInt4318 == 34037) {
			this.aFloat20 = arg4;
			this.aFloat21 = arg3;
			this.aBoolean90 = false;
		} else {
			this.aBoolean90 = true;
			this.aFloat21 = this.aFloat20 = 1.0F;
		}
		this.anInt1338 = arg3;
	}

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!ge;IIIIIZ)V")
	public Class28_Sub3_Sub1(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (this.anInt4318 == 34037) {
			this.aFloat21 = arg4;
			this.aBoolean90 = false;
			this.aFloat20 = arg5;
		} else {
			this.aFloat21 = this.aFloat20 = 1.0F;
			this.aBoolean90 = true;
		}
		this.anInt1338 = arg4;
		this.anInt1337 = arg5;
	}

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!ge;IIII[I)V")
	public Class28_Sub3_Sub1(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt1337 = arg2;
		this.anInt1338 = arg1;
		this.method1253(arg1, arg2, arg5, arg1);
		this.aFloat21 = (float) arg1 / (float) arg3;
		this.aBoolean90 = false;
		this.aFloat20 = (float) arg2 / (float) arg4;
	}
}
