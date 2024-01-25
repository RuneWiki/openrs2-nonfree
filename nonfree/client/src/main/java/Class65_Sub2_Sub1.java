import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public final class Class65_Sub2_Sub1 extends Class65_Sub2 {

	@OriginalMember(owner = "client!nq", name = "V", descriptor = "I")
	public final int anInt4511;

	@OriginalMember(owner = "client!nq", name = "N", descriptor = "Z")
	public final boolean aBoolean334;

	@OriginalMember(owner = "client!nq", name = "M", descriptor = "F")
	public final float aFloat49;

	@OriginalMember(owner = "client!nq", name = "O", descriptor = "F")
	public final float aFloat50;

	@OriginalMember(owner = "client!nq", name = "Q", descriptor = "I")
	public final int anInt4507;

	static {
		new Class15("clan_chat", "clanchat", "conversation_clan", "clan_chat");
	}

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!ug;IIIIIZ)V")
	public Class65_Sub2_Sub1(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt4511 = arg5;
		if (super.anInt5976 == 34037) {
			this.aBoolean334 = false;
			this.aFloat49 = arg4;
			this.aFloat50 = arg5;
		} else {
			this.aFloat49 = this.aFloat50 = 1.0F;
			this.aBoolean334 = true;
		}
		this.anInt4507 = arg4;
	}

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!ug;IIIIIIZ)V")
	public Class65_Sub2_Sub1(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt4507 = arg3;
		this.aBoolean334 = false;
		this.aFloat50 = (float) arg4 / (float) arg6;
		this.aFloat49 = (float) arg3 / (float) arg5;
		this.anInt4511 = arg4;
		this.method3589(false, false);
	}

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!ug;IIII[I)V")
	public Class65_Sub2_Sub1(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt4511 = arg2;
		this.anInt4507 = arg1;
		this.method3593(arg2, arg5, arg1);
		this.aFloat49 = (float) arg1 / (float) arg3;
		this.aFloat50 = (float) arg2 / (float) arg4;
		this.aBoolean334 = false;
		this.method3589(false, false);
	}

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!ug;IIIII[BI)V")
	public Class65_Sub2_Sub1(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt4511 = arg3;
		this.anInt4507 = arg2;
		this.method3586(arg3, arg6, arg2, arg7, true);
		this.aFloat49 = (float) arg2 / (float) arg4;
		this.aBoolean334 = false;
		this.aFloat50 = (float) arg3 / (float) arg5;
		this.method3589(false, false);
	}

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!ug;IIIIZ[BI)V")
	public Class65_Sub2_Sub1(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt5976 == 34037) {
			this.aFloat49 = arg3;
			this.aBoolean334 = false;
			this.aFloat50 = arg4;
		} else {
			this.aFloat49 = this.aFloat50 = 1.0F;
			this.aBoolean334 = true;
		}
		this.anInt4507 = arg3;
		this.anInt4511 = arg4;
	}

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!ug;IIIZ[I)V")
	public Class65_Sub2_Sub1(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		if (super.anInt5976 == 34037) {
			this.aFloat49 = arg2;
			this.aBoolean334 = false;
			this.aFloat50 = arg3;
		} else {
			this.aFloat49 = this.aFloat50 = 1.0F;
			this.aBoolean334 = true;
		}
		this.anInt4507 = arg2;
		this.anInt4511 = arg3;
	}
}
