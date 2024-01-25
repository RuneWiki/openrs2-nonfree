import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class Class3_Sub2_Sub1 extends Class3_Sub2 {

	@OriginalMember(owner = "client!bb", name = "L", descriptor = "I")
	public final int anInt1110;

	@OriginalMember(owner = "client!bb", name = "N", descriptor = "I")
	public final int anInt1112;

	@OriginalMember(owner = "client!bb", name = "S", descriptor = "F")
	public final float aFloat43;

	@OriginalMember(owner = "client!bb", name = "T", descriptor = "Z")
	public final boolean aBoolean101;

	@OriginalMember(owner = "client!bb", name = "P", descriptor = "F")
	public final float aFloat42;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!kfa;IIII[I)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt1110 = arg1;
		this.anInt1112 = arg2;
		this.method951(arg2, arg1, arg5);
		this.aFloat43 = (float) arg2 / (float) arg4;
		this.aBoolean101 = false;
		this.aFloat42 = (float) arg1 / (float) arg3;
		this.method953(false, false);
	}

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!kfa;IIIII[BI)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt1110 = arg2;
		this.anInt1112 = arg3;
		this.method958(arg2, true, arg6, arg3, arg7);
		this.aBoolean101 = false;
		this.aFloat43 = (float) arg3 / (float) arg5;
		this.aFloat42 = (float) arg2 / (float) arg4;
		this.method953(false, false);
	}

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!kfa;IIIII)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.aFloat43 = (float) arg3 / (float) arg5;
		this.aBoolean101 = false;
		this.aFloat42 = (float) arg2 / (float) arg4;
		this.anInt1110 = arg2;
		this.anInt1112 = arg3;
		this.method953(false, false);
	}

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!kfa;IIIIIZ)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (super.anInt3442 == 34037) {
			this.aFloat43 = arg5;
			this.aBoolean101 = false;
			this.aFloat42 = arg4;
		} else {
			this.aFloat42 = this.aFloat43 = 1.0F;
			this.aBoolean101 = true;
		}
		this.anInt1110 = arg4;
		this.anInt1112 = arg5;
	}

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!kfa;IIIZ[III)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt1112 = arg3;
		if (super.anInt3442 == 34037) {
			this.aBoolean101 = false;
			this.aFloat43 = arg3;
			this.aFloat42 = arg2;
		} else {
			this.aBoolean101 = true;
			this.aFloat42 = this.aFloat43 = 1.0F;
		}
		this.anInt1110 = arg2;
	}

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!kfa;IIII)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		if (super.anInt3442 == 34037) {
			this.aFloat42 = arg3;
			this.aFloat43 = arg4;
			this.aBoolean101 = false;
		} else {
			this.aBoolean101 = true;
			this.aFloat42 = this.aFloat43 = 1.0F;
		}
		this.anInt1110 = arg3;
		this.anInt1112 = arg4;
	}

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!kfa;IIIIIIZ)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aBoolean101 = false;
		this.aFloat42 = (float) arg3 / (float) arg5;
		this.anInt1110 = arg3;
		this.anInt1112 = arg4;
		this.aFloat43 = (float) arg4 / (float) arg6;
		this.method953(false, false);
	}

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!kfa;IIIIZ[BI)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt3442 == 34037) {
			this.aFloat42 = arg3;
			this.aBoolean101 = false;
			this.aFloat43 = arg4;
		} else {
			this.aBoolean101 = true;
			this.aFloat42 = this.aFloat43 = 1.0F;
		}
		this.anInt1110 = arg3;
		this.anInt1112 = arg4;
	}
}
