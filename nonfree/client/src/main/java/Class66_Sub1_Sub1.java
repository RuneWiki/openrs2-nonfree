import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public final class Class66_Sub1_Sub1 extends Class66_Sub1 {

	@OriginalMember(owner = "client!cw", name = "H", descriptor = "I")
	public final int anInt1950;

	@OriginalMember(owner = "client!cw", name = "N", descriptor = "Z")
	public final boolean aBoolean165;

	@OriginalMember(owner = "client!cw", name = "G", descriptor = "F")
	public final float aFloat52;

	@OriginalMember(owner = "client!cw", name = "O", descriptor = "I")
	public final int anInt1954;

	@OriginalMember(owner = "client!cw", name = "M", descriptor = "F")
	public final float aFloat53;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!qfa;IIIII)V")
	public Class66_Sub1_Sub1(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt1950 = arg3;
		this.aBoolean165 = false;
		this.aFloat52 = (float) arg2 / (float) arg4;
		this.anInt1954 = arg2;
		this.aFloat53 = (float) arg3 / (float) arg5;
		this.method1669(false, false);
	}

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!qfa;IIIIIIZ)V")
	public Class66_Sub1_Sub1(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat52 = (float) arg3 / (float) arg5;
		this.anInt1954 = arg3;
		this.aBoolean165 = false;
		this.aFloat53 = (float) arg4 / (float) arg6;
		this.anInt1950 = arg4;
		this.method1669(false, false);
	}

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!qfa;IIIIIZ)V")
	public Class66_Sub1_Sub1(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt1954 = arg4;
		this.anInt1950 = arg5;
		if (super.anInt8223 == 34037) {
			this.aFloat52 = (float) arg4;
			this.aBoolean165 = false;
			this.aFloat53 = (float) arg5;
		} else {
			this.aFloat52 = this.aFloat53 = 1.0F;
			this.aBoolean165 = true;
		}
	}

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!qfa;IIII)V")
	public Class66_Sub1_Sub1(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		if (super.anInt8223 == 34037) {
			this.aBoolean165 = false;
			this.aFloat52 = (float) arg3;
			this.aFloat53 = (float) arg4;
		} else {
			this.aFloat52 = this.aFloat53 = 1.0F;
			this.aBoolean165 = true;
		}
		this.anInt1950 = arg4;
		this.anInt1954 = arg3;
	}

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!qfa;IIIIZ[BI)V")
	public Class66_Sub1_Sub1(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt1950 = arg4;
		if (super.anInt8223 == 34037) {
			this.aFloat52 = (float) arg3;
			this.aBoolean165 = false;
			this.aFloat53 = (float) arg4;
		} else {
			this.aFloat52 = this.aFloat53 = 1.0F;
			this.aBoolean165 = true;
		}
		this.anInt1954 = arg3;
	}

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!qfa;IIIZ[III)V")
	public Class66_Sub1_Sub1(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt1954 = arg2;
		this.anInt1950 = arg3;
		if (super.anInt8223 == 34037) {
			this.aBoolean165 = false;
			this.aFloat53 = (float) arg3;
			this.aFloat52 = (float) arg2;
		} else {
			this.aBoolean165 = true;
			this.aFloat52 = this.aFloat53 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!qfa;IIII[I)V")
	public Class66_Sub1_Sub1(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt1954 = arg1;
		this.anInt1950 = arg2;
		this.method1670(0, arg5, 0, arg2, arg1, 0);
		this.aFloat52 = (float) arg1 / (float) arg3;
		this.aBoolean165 = false;
		this.aFloat53 = (float) arg2 / (float) arg4;
		this.method1669(false, false);
	}

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!qfa;IIIII[BI)V")
	public Class66_Sub1_Sub1(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt1950 = arg3;
		this.anInt1954 = arg2;
		this.method1668(arg6, arg2, true, arg3, arg7);
		this.aBoolean165 = false;
		this.aFloat53 = (float) arg3 / (float) arg5;
		this.aFloat52 = (float) arg2 / (float) arg4;
		this.method1669(false, false);
	}
}
