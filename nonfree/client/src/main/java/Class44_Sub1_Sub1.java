import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public final class Class44_Sub1_Sub1 extends Class44_Sub1 {

	@OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
	public final int anInt1288;

	@OriginalMember(owner = "client!dh", name = "m", descriptor = "F")
	public final float aFloat6;

	@OriginalMember(owner = "client!dh", name = "n", descriptor = "Z")
	public final boolean aBoolean91;

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "F")
	public final float aFloat5;

	@OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
	public final int anInt1289;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!nf;IIIIZ[BI)V")
	public Class44_Sub1_Sub1(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt1288 = arg3;
		if (this.anInt6476 == 34037) {
			this.aFloat6 = arg4;
			this.aBoolean91 = false;
			this.aFloat5 = arg3;
		} else {
			this.aFloat5 = this.aFloat6 = 1.0F;
			this.aBoolean91 = true;
		}
		this.anInt1289 = arg4;
	}

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!nf;IIIIIZ)V")
	public Class44_Sub1_Sub1(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt1288 = arg4;
		this.anInt1289 = arg5;
		if (this.anInt6476 == 34037) {
			this.aBoolean91 = false;
			this.aFloat5 = arg4;
			this.aFloat6 = arg5;
		} else {
			this.aFloat5 = this.aFloat6 = 1.0F;
			this.aBoolean91 = true;
		}
	}

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!nf;IIIIIIZ)V")
	public Class44_Sub1_Sub1(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat5 = (float) arg3 / (float) arg5;
		this.aBoolean91 = false;
		this.anInt1289 = arg4;
		this.aFloat6 = (float) arg4 / (float) arg6;
		this.anInt1288 = arg3;
		this.method1072(false, false);
	}

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!nf;IIII[I)V")
	public Class44_Sub1_Sub1(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt1289 = arg2;
		this.anInt1288 = arg1;
		this.method1069(arg1, arg2, arg5);
		this.aFloat6 = (float) arg2 / (float) arg4;
		this.aBoolean91 = false;
		this.aFloat5 = (float) arg1 / (float) arg3;
		this.method1072(false, false);
	}

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!nf;IIIZ[I)V")
	public Class44_Sub1_Sub1(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt1288 = arg2;
		if (this.anInt6476 == 34037) {
			this.aFloat6 = arg3;
			this.aBoolean91 = false;
			this.aFloat5 = arg2;
		} else {
			this.aBoolean91 = true;
			this.aFloat5 = this.aFloat6 = 1.0F;
		}
		this.anInt1289 = arg3;
	}

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!nf;IIIII[BI)V")
	public Class44_Sub1_Sub1(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt1289 = arg3;
		this.anInt1288 = arg2;
		this.method1071(arg2, arg3, arg6, arg7, true);
		this.aFloat6 = (float) arg3 / (float) arg5;
		this.aFloat5 = (float) arg2 / (float) arg4;
		this.aBoolean91 = false;
		this.method1072(false, false);
	}
}
