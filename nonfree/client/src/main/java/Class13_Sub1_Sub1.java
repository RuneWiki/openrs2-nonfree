import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public final class Class13_Sub1_Sub1 extends Class13_Sub1 {

	@OriginalMember(owner = "client!cq", name = "Q", descriptor = "I")
	public final int anInt1249;

	@OriginalMember(owner = "client!cq", name = "V", descriptor = "F")
	public final float aFloat27;

	@OriginalMember(owner = "client!cq", name = "Y", descriptor = "Z")
	public final boolean aBoolean60;

	@OriginalMember(owner = "client!cq", name = "W", descriptor = "F")
	public final float aFloat28;

	@OriginalMember(owner = "client!cq", name = "Z", descriptor = "I")
	public final int anInt1252;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lclient!ht;IIIIIZ)V")
	public Class13_Sub1_Sub1(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt1249 = arg4;
		if (super.anInt3207 == 34037) {
			this.aFloat27 = arg5;
			this.aBoolean60 = false;
			this.aFloat28 = arg4;
		} else {
			this.aBoolean60 = true;
			this.aFloat28 = this.aFloat27 = 1.0F;
		}
		this.anInt1252 = arg5;
	}

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lclient!ht;IIIZ[I)V")
	public Class13_Sub1_Sub1(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt1252 = arg3;
		if (super.anInt3207 == 34037) {
			this.aBoolean60 = false;
			this.aFloat28 = arg2;
			this.aFloat27 = arg3;
		} else {
			this.aFloat28 = this.aFloat27 = 1.0F;
			this.aBoolean60 = true;
		}
		this.anInt1249 = arg2;
	}

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lclient!ht;IIIII[BI)V")
	public Class13_Sub1_Sub1(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt1252 = arg3;
		this.anInt1249 = arg2;
		this.method1050(arg6, arg7, arg3, true, arg2);
		this.aBoolean60 = false;
		this.aFloat27 = (float) arg3 / (float) arg5;
		this.aFloat28 = (float) arg2 / (float) arg4;
		this.method1055(false, false);
	}

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lclient!ht;IIII[I)V")
	public Class13_Sub1_Sub1(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt1252 = arg2;
		this.anInt1249 = arg1;
		this.method1051(arg2, arg1, arg5);
		this.aBoolean60 = false;
		this.aFloat28 = (float) arg1 / (float) arg3;
		this.aFloat27 = (float) arg2 / (float) arg4;
		this.method1055(false, false);
	}

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lclient!ht;IIIIIIZ)V")
	public Class13_Sub1_Sub1(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aBoolean60 = false;
		this.aFloat28 = (float) arg3 / (float) arg5;
		this.aFloat27 = (float) arg4 / (float) arg6;
		this.anInt1249 = arg3;
		this.anInt1252 = arg4;
		this.method1055(false, false);
	}

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lclient!ht;IIIIZ[BI)V")
	public Class13_Sub1_Sub1(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt3207 == 34037) {
			this.aFloat28 = arg3;
			this.aBoolean60 = false;
			this.aFloat27 = arg4;
		} else {
			this.aBoolean60 = true;
			this.aFloat28 = this.aFloat27 = 1.0F;
		}
		this.anInt1249 = arg3;
		this.anInt1252 = arg4;
	}
}
