import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public final class Class19_Sub4_Sub1 extends Class19_Sub4 {

	@OriginalMember(owner = "client!oc", name = "P", descriptor = "I")
	public final int anInt5085;

	@OriginalMember(owner = "client!oc", name = "R", descriptor = "I")
	public final int anInt5086;

	@OriginalMember(owner = "client!oc", name = "T", descriptor = "F")
	public final float aFloat54;

	@OriginalMember(owner = "client!oc", name = "Q", descriptor = "Z")
	public final boolean aBoolean313;

	@OriginalMember(owner = "client!oc", name = "V", descriptor = "F")
	public final float aFloat55;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!rl;IIIII[BI)V")
	public Class19_Sub4_Sub1(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt5085 = arg2;
		this.anInt5086 = arg3;
		this.method4256(true, arg3, arg2, arg7, arg6);
		this.aFloat54 = (float) arg2 / (float) arg4;
		this.aBoolean313 = false;
		this.aFloat55 = (float) arg3 / (float) arg5;
		this.method4257(false, false);
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!rl;IIIIIZ)V")
	public Class19_Sub4_Sub1(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt5086 = arg5;
		if (super.anInt5060 == 34037) {
			this.aFloat55 = arg5;
			this.aFloat54 = arg4;
			this.aBoolean313 = false;
		} else {
			this.aBoolean313 = true;
			this.aFloat54 = this.aFloat55 = 1.0F;
		}
		this.anInt5085 = arg4;
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!rl;IIII[I)V")
	public Class19_Sub4_Sub1(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt5085 = arg1;
		this.anInt5086 = arg2;
		this.method4258(arg1, arg5, arg2);
		this.aFloat54 = (float) arg1 / (float) arg3;
		this.aFloat55 = (float) arg2 / (float) arg4;
		this.aBoolean313 = false;
		this.method4257(false, false);
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!rl;IIIZ[I)V")
	public Class19_Sub4_Sub1(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt5086 = arg3;
		if (super.anInt5060 == 34037) {
			this.aFloat54 = arg2;
			this.aBoolean313 = false;
			this.aFloat55 = arg3;
		} else {
			this.aFloat54 = this.aFloat55 = 1.0F;
			this.aBoolean313 = true;
		}
		this.anInt5085 = arg2;
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!rl;IIIIZ[BI)V")
	public Class19_Sub4_Sub1(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt5085 = arg3;
		this.anInt5086 = arg4;
		if (super.anInt5060 == 34037) {
			this.aBoolean313 = false;
			this.aFloat55 = arg4;
			this.aFloat54 = arg3;
		} else {
			this.aBoolean313 = true;
			this.aFloat54 = this.aFloat55 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!rl;IIIIIIZ)V")
	public Class19_Sub4_Sub1(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aBoolean313 = false;
		this.aFloat54 = (float) arg3 / (float) arg5;
		this.anInt5085 = arg3;
		this.aFloat55 = (float) arg4 / (float) arg6;
		this.anInt5086 = arg4;
		this.method4257(false, false);
	}
}
