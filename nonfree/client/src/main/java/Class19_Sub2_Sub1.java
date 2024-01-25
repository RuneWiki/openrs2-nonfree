import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public final class Class19_Sub2_Sub1 extends Class19_Sub2 {

	@OriginalMember(owner = "client!gg", name = "M", descriptor = "I")
	public final int anInt2885;

	@OriginalMember(owner = "client!gg", name = "N", descriptor = "F")
	public final float aFloat53;

	@OriginalMember(owner = "client!gg", name = "O", descriptor = "Z")
	public final boolean aBoolean232;

	@OriginalMember(owner = "client!gg", name = "T", descriptor = "F")
	public final float aFloat54;

	@OriginalMember(owner = "client!gg", name = "U", descriptor = "I")
	public final int anInt2889;

	static {
		new Class202("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!os;IIIIIIZ)V")
	public Class19_Sub2_Sub1(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt2885 = arg3;
		this.aFloat53 = (float) arg4 / (float) arg6;
		this.aBoolean232 = false;
		this.aFloat54 = (float) arg3 / (float) arg5;
		this.anInt2889 = arg4;
		this.method2691(false, false);
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!os;IIIZ[I)V")
	public Class19_Sub2_Sub1(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt2885 = arg2;
		this.anInt2889 = arg3;
		if (super.anInt5629 == 34037) {
			this.aFloat54 = arg2;
			this.aFloat53 = arg3;
			this.aBoolean232 = false;
		} else {
			this.aFloat54 = this.aFloat53 = 1.0F;
			this.aBoolean232 = true;
		}
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!os;IIIII[BI)V")
	public Class19_Sub2_Sub1(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt2885 = arg2;
		this.anInt2889 = arg3;
		this.method2697(arg2, true, arg6, arg7, arg3);
		this.aFloat54 = (float) arg2 / (float) arg4;
		this.aFloat53 = (float) arg3 / (float) arg5;
		this.aBoolean232 = false;
		this.method2691(false, false);
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!os;IIIIIZ)V")
	public Class19_Sub2_Sub1(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt2889 = arg5;
		if (super.anInt5629 == 34037) {
			this.aFloat53 = arg5;
			this.aFloat54 = arg4;
			this.aBoolean232 = false;
		} else {
			this.aFloat54 = this.aFloat53 = 1.0F;
			this.aBoolean232 = true;
		}
		this.anInt2885 = arg4;
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!os;IIIIZ[BI)V")
	public Class19_Sub2_Sub1(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt5629 == 34037) {
			this.aFloat53 = arg4;
			this.aFloat54 = arg3;
			this.aBoolean232 = false;
		} else {
			this.aFloat54 = this.aFloat53 = 1.0F;
			this.aBoolean232 = true;
		}
		this.anInt2885 = arg3;
		this.anInt2889 = arg4;
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!os;IIII[I)V")
	public Class19_Sub2_Sub1(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt2889 = arg2;
		this.anInt2885 = arg1;
		this.method2694(arg1, arg5, arg2);
		this.aBoolean232 = false;
		this.aFloat53 = (float) arg2 / (float) arg4;
		this.aFloat54 = (float) arg1 / (float) arg3;
		this.method2691(false, false);
	}
}
