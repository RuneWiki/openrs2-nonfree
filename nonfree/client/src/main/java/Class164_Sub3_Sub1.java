import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public final class Class164_Sub3_Sub1 extends Class164_Sub3 {

	@OriginalMember(owner = "client!wo", name = "I", descriptor = "I")
	public final int anInt9477;

	@OriginalMember(owner = "client!wo", name = "O", descriptor = "Z")
	public final boolean aBoolean707;

	@OriginalMember(owner = "client!wo", name = "M", descriptor = "F")
	public final float aFloat192;

	@OriginalMember(owner = "client!wo", name = "L", descriptor = "F")
	public final float aFloat191;

	@OriginalMember(owner = "client!wo", name = "U", descriptor = "I")
	public final int anInt9484;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!mh;IIIZ[I)V")
	public Class164_Sub3_Sub1(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt9477 = arg3;
		if (super.anInt9448 == 34037) {
			this.aFloat192 = arg3;
			this.aBoolean707 = false;
			this.aFloat191 = arg2;
		} else {
			this.aBoolean707 = true;
			this.aFloat191 = this.aFloat192 = 1.0F;
		}
		this.anInt9484 = arg2;
	}

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!mh;IIIIIZ)V")
	public Class164_Sub3_Sub1(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt9484 = arg4;
		if (super.anInt9448 == 34037) {
			this.aBoolean707 = false;
			this.aFloat192 = arg5;
			this.aFloat191 = arg4;
		} else {
			this.aBoolean707 = true;
			this.aFloat191 = this.aFloat192 = 1.0F;
		}
		this.anInt9477 = arg5;
	}

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!mh;IIII[I)V")
	public Class164_Sub3_Sub1(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt9477 = arg2;
		this.anInt9484 = arg1;
		this.method8156(arg5, arg2, arg1);
		this.aFloat192 = (float) arg2 / (float) arg4;
		this.aBoolean707 = false;
		this.aFloat191 = (float) arg1 / (float) arg3;
		this.method8159(false, false);
	}

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!mh;IIIIZ[BI)V")
	public Class164_Sub3_Sub1(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt9484 = arg3;
		if (super.anInt9448 == 34037) {
			this.aBoolean707 = false;
			this.aFloat192 = arg4;
			this.aFloat191 = arg3;
		} else {
			this.aBoolean707 = true;
			this.aFloat191 = this.aFloat192 = 1.0F;
		}
		this.anInt9477 = arg4;
	}

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!mh;IIIII[BI)V")
	public Class164_Sub3_Sub1(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt9484 = arg2;
		this.anInt9477 = arg3;
		this.method8161(true, arg7, arg6, arg3, arg2);
		this.aBoolean707 = false;
		this.aFloat192 = (float) arg3 / (float) arg5;
		this.aFloat191 = (float) arg2 / (float) arg4;
		this.method8159(false, false);
	}

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!mh;IIIIIIZ)V")
	public Class164_Sub3_Sub1(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat192 = (float) arg4 / (float) arg6;
		this.anInt9484 = arg3;
		this.anInt9477 = arg4;
		this.aFloat191 = (float) arg3 / (float) arg5;
		this.aBoolean707 = false;
		this.method8159(false, false);
	}
}
