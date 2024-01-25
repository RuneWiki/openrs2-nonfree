import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public final class Class112_Sub2_Sub1 extends Class112_Sub2 {

	@OriginalMember(owner = "client!mk", name = "Q", descriptor = "I")
	public final int anInt4737;

	@OriginalMember(owner = "client!mk", name = "N", descriptor = "I")
	public final int anInt4736;

	@OriginalMember(owner = "client!mk", name = "L", descriptor = "F")
	public final float aFloat33;

	@OriginalMember(owner = "client!mk", name = "P", descriptor = "F")
	public final float aFloat34;

	@OriginalMember(owner = "client!mk", name = "M", descriptor = "Z")
	public final boolean aBoolean412;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!vj;IIII[I)V")
	public Class112_Sub2_Sub1(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt4737 = arg1;
		this.anInt4736 = arg2;
		this.method3731(arg5, arg1, arg2);
		this.aFloat33 = (float) arg1 / (float) arg3;
		this.aFloat34 = (float) arg2 / (float) arg4;
		this.aBoolean412 = false;
		this.method3727(false, false);
	}

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!vj;IIIIZ[BI)V")
	public Class112_Sub2_Sub1(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt4737 = arg3;
		this.anInt4736 = arg4;
		if (super.anInt5815 == 34037) {
			this.aBoolean412 = false;
			this.aFloat34 = arg4;
			this.aFloat33 = arg3;
		} else {
			this.aBoolean412 = true;
			this.aFloat33 = this.aFloat34 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!vj;IIIZ[I)V")
	public Class112_Sub2_Sub1(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt4737 = arg2;
		this.anInt4736 = arg3;
		if (super.anInt5815 == 34037) {
			this.aFloat33 = arg2;
			this.aFloat34 = arg3;
			this.aBoolean412 = false;
		} else {
			this.aBoolean412 = true;
			this.aFloat33 = this.aFloat34 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!vj;IIIII[BI)V")
	public Class112_Sub2_Sub1(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt4737 = arg2;
		this.anInt4736 = arg3;
		this.method3730(true, arg2, arg3, arg6, arg7);
		this.aFloat33 = (float) arg2 / (float) arg4;
		this.aBoolean412 = false;
		this.aFloat34 = (float) arg3 / (float) arg5;
		this.method3727(false, false);
	}

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!vj;IIIIIZ)V")
	public Class112_Sub2_Sub1(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt4736 = arg5;
		this.anInt4737 = arg4;
		if (super.anInt5815 == 34037) {
			this.aFloat34 = arg5;
			this.aBoolean412 = false;
			this.aFloat33 = arg4;
		} else {
			this.aBoolean412 = true;
			this.aFloat33 = this.aFloat34 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!vj;IIIIIIZ)V")
	public Class112_Sub2_Sub1(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt4737 = arg3;
		this.aBoolean412 = false;
		this.aFloat33 = (float) arg3 / (float) arg5;
		this.aFloat34 = (float) arg4 / (float) arg6;
		this.anInt4736 = arg4;
		this.method3727(false, false);
	}
}
