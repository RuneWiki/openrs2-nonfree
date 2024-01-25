import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public final class Class23_Sub3_Sub1 extends Class23_Sub3 {

	@OriginalMember(owner = "client!wh", name = "N", descriptor = "I")
	public final int anInt7183;

	@OriginalMember(owner = "client!wh", name = "O", descriptor = "I")
	public final int anInt7184;

	@OriginalMember(owner = "client!wh", name = "P", descriptor = "F")
	public final float aFloat88;

	@OriginalMember(owner = "client!wh", name = "S", descriptor = "F")
	public final float aFloat89;

	@OriginalMember(owner = "client!wh", name = "Q", descriptor = "Z")
	public final boolean aBoolean625;

	static {
		new Class142("Ok", "Okay", "OK", "Ok");
		new Class142("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
	}

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!ih;IIIZ[I)V")
	public Class23_Sub3_Sub1(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt7183 = arg3;
		this.anInt7184 = arg2;
		if (super.anInt7163 == 34037) {
			this.aFloat89 = arg2;
			this.aBoolean625 = false;
			this.aFloat88 = arg3;
		} else {
			this.aFloat89 = this.aFloat88 = 1.0F;
			this.aBoolean625 = true;
		}
	}

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!ih;IIIII[BI)V")
	public Class23_Sub3_Sub1(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt7183 = arg3;
		this.anInt7184 = arg2;
		this.method5811(arg3, true, arg6, arg7, arg2);
		this.aFloat88 = (float) arg3 / (float) arg5;
		this.aBoolean625 = false;
		this.aFloat89 = (float) arg2 / (float) arg4;
		this.method5808(false, false);
	}

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!ih;IIIIZ[BI)V")
	public Class23_Sub3_Sub1(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt7184 = arg3;
		this.anInt7183 = arg4;
		if (super.anInt7163 == 34037) {
			this.aFloat89 = arg3;
			this.aFloat88 = arg4;
			this.aBoolean625 = false;
		} else {
			this.aFloat89 = this.aFloat88 = 1.0F;
			this.aBoolean625 = true;
		}
	}

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!ih;IIIIIIZ)V")
	public Class23_Sub3_Sub1(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat89 = (float) arg3 / (float) arg5;
		this.aFloat88 = (float) arg4 / (float) arg6;
		this.aBoolean625 = false;
		this.anInt7183 = arg4;
		this.anInt7184 = arg3;
		this.method5808(false, false);
	}

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!ih;IIIIIZ)V")
	public Class23_Sub3_Sub1(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt7183 = arg5;
		this.anInt7184 = arg4;
		if (super.anInt7163 == 34037) {
			this.aFloat88 = arg5;
			this.aBoolean625 = false;
			this.aFloat89 = arg4;
		} else {
			this.aFloat89 = this.aFloat88 = 1.0F;
			this.aBoolean625 = true;
		}
	}

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!ih;IIII[I)V")
	public Class23_Sub3_Sub1(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt7184 = arg1;
		this.anInt7183 = arg2;
		this.method5814(arg2, arg5, arg1);
		this.aBoolean625 = false;
		this.aFloat89 = (float) arg1 / (float) arg3;
		this.aFloat88 = (float) arg2 / (float) arg4;
		this.method5808(false, false);
	}
}
