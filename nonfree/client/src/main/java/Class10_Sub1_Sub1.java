import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public final class Class10_Sub1_Sub1 extends Class10_Sub1 {

	@OriginalMember(owner = "client!al", name = "M", descriptor = "I")
	public final int anInt262;

	@OriginalMember(owner = "client!al", name = "N", descriptor = "I")
	public final int anInt263;

	@OriginalMember(owner = "client!al", name = "Q", descriptor = "F")
	public final float aFloat6;

	@OriginalMember(owner = "client!al", name = "R", descriptor = "F")
	public final float aFloat7;

	@OriginalMember(owner = "client!al", name = "S", descriptor = "Z")
	public final boolean aBoolean27;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!ur;IIIZ[I)V")
	public Class10_Sub1_Sub1(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt262 = arg2;
		this.anInt263 = arg3;
		if (super.anInt7522 == 34037) {
			this.aFloat6 = arg3;
			this.aFloat7 = arg2;
			this.aBoolean27 = false;
		} else {
			this.aFloat7 = this.aFloat6 = 1.0F;
			this.aBoolean27 = true;
		}
	}

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!ur;IIII[I)V")
	public Class10_Sub1_Sub1(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt263 = arg2;
		this.anInt262 = arg1;
		this.method199(arg2, arg1, arg5);
		this.aFloat7 = (float) arg1 / (float) arg3;
		this.aBoolean27 = false;
		this.aFloat6 = (float) arg2 / (float) arg4;
		this.method201(false, false);
	}

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!ur;IIIIIZ)V")
	public Class10_Sub1_Sub1(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (super.anInt7522 == 34037) {
			this.aFloat6 = arg5;
			this.aBoolean27 = false;
			this.aFloat7 = arg4;
		} else {
			this.aBoolean27 = true;
			this.aFloat7 = this.aFloat6 = 1.0F;
		}
		this.anInt262 = arg4;
		this.anInt263 = arg5;
	}

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!ur;IIIII[BI)V")
	public Class10_Sub1_Sub1(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt262 = arg2;
		this.anInt263 = arg3;
		this.method197(arg6, arg3, arg7, true, arg2);
		this.aBoolean27 = false;
		this.aFloat6 = (float) arg3 / (float) arg5;
		this.aFloat7 = (float) arg2 / (float) arg4;
		this.method201(false, false);
	}

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!ur;IIIIZ[BI)V")
	public Class10_Sub1_Sub1(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt7522 == 34037) {
			this.aBoolean27 = false;
			this.aFloat7 = arg3;
			this.aFloat6 = arg4;
		} else {
			this.aFloat7 = this.aFloat6 = 1.0F;
			this.aBoolean27 = true;
		}
		this.anInt263 = arg4;
		this.anInt262 = arg3;
	}

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!ur;IIIIIIZ)V")
	public Class10_Sub1_Sub1(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aBoolean27 = false;
		this.anInt263 = arg4;
		this.anInt262 = arg3;
		this.aFloat6 = (float) arg4 / (float) arg6;
		this.aFloat7 = (float) arg3 / (float) arg5;
		this.method201(false, false);
	}
}
