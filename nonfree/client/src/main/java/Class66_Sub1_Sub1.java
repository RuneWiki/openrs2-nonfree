import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public final class Class66_Sub1_Sub1 extends Class66_Sub1 {

	@OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
	public final int anInt1846;

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "Z")
	public final boolean aBoolean92;

	@OriginalMember(owner = "client!fj", name = "n", descriptor = "F")
	public final float aFloat7;

	@OriginalMember(owner = "client!fj", name = "o", descriptor = "I")
	public final int anInt1845;

	@OriginalMember(owner = "client!fj", name = "l", descriptor = "F")
	public final float aFloat6;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!se;IIIIIIZ)V")
	public Class66_Sub1_Sub1(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt1846 = arg4;
		this.aBoolean92 = false;
		this.aFloat7 = (float) arg4 / (float) arg6;
		this.anInt1845 = arg3;
		this.aFloat6 = (float) arg3 / (float) arg5;
	}

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!se;IIIZ[I)V")
	public Class66_Sub1_Sub1(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt1845 = arg2;
		if (this.anInt4752 == 34037) {
			this.aBoolean92 = false;
			this.aFloat7 = arg3;
			this.aFloat6 = arg2;
		} else {
			this.aBoolean92 = true;
			this.aFloat6 = this.aFloat7 = 1.0F;
		}
		this.anInt1846 = arg3;
	}

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!se;IIIIIZ)V")
	public Class66_Sub1_Sub1(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (this.anInt4752 == 34037) {
			this.aFloat6 = arg4;
			this.aFloat7 = arg5;
			this.aBoolean92 = false;
		} else {
			this.aFloat6 = this.aFloat7 = 1.0F;
			this.aBoolean92 = true;
		}
		this.anInt1846 = arg5;
		this.anInt1845 = arg4;
	}

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!se;IIIIZ[BI)V")
	public Class66_Sub1_Sub1(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt1845 = arg3;
		if (this.anInt4752 == 34037) {
			this.aFloat7 = arg4;
			this.aBoolean92 = false;
			this.aFloat6 = arg3;
		} else {
			this.aBoolean92 = true;
			this.aFloat6 = this.aFloat7 = 1.0F;
		}
		this.anInt1846 = arg4;
	}

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!se;IIIII[BI)V")
	public Class66_Sub1_Sub1(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt1845 = arg2;
		this.anInt1846 = arg3;
		this.method1513(arg2, arg3, arg6, arg7, true);
		this.aBoolean92 = false;
		this.aFloat7 = (float) arg3 / (float) arg5;
		this.aFloat6 = (float) arg2 / (float) arg4;
	}

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!se;IIII[I)V")
	public Class66_Sub1_Sub1(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt1845 = arg1;
		this.anInt1846 = arg2;
		this.method1517(arg1, arg2, arg5, arg1);
		this.aFloat6 = (float) arg1 / (float) arg3;
		this.aBoolean92 = false;
		this.aFloat7 = (float) arg2 / (float) arg4;
	}
}
