import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class212 {

	@OriginalMember(owner = "client!vp", name = "f", descriptor = "Lclient!c;")
	private Class5 aClass5_30;

	@OriginalMember(owner = "client!vp", name = "r", descriptor = "I")
	private int anInt6501;

	@OriginalMember(owner = "client!vp", name = "t", descriptor = "I")
	private int anInt6503;

	@OriginalMember(owner = "client!vp", name = "k", descriptor = "Z")
	private boolean aBoolean635 = true;

	@OriginalMember(owner = "client!vp", name = "s", descriptor = "I")
	private int anInt6502 = -1;

	@OriginalMember(owner = "client!vp", name = "j", descriptor = "[Lclient!cs;")
	private final Class36[] aClass36Array1;

	@OriginalMember(owner = "client!vp", name = "w", descriptor = "I")
	private final int anInt6505;

	@OriginalMember(owner = "client!vp", name = "o", descriptor = "I")
	private final int anInt6498;

	@OriginalMember(owner = "client!vp", name = "g", descriptor = "I")
	private final int anInt6494;

	@OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
	private final int anInt6496;

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "Lclient!cs;")
	private final Class36 aClass36_1;

	@OriginalMember(owner = "client!vp", name = "m", descriptor = "[Lclient!cs;")
	private final Class36[] aClass36Array2;

	static {
		new Class34("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(I[Lclient!cs;IIII)V")
	public Class212(@OriginalArg(0) int arg0, @OriginalArg(1) Class36[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass36Array1 = arg1;
		this.anInt6505 = arg0;
		this.anInt6498 = arg5;
		this.anInt6494 = arg4;
		this.anInt6496 = arg3;
		if (arg1 == null) {
			this.aClass36_1 = null;
			this.aClass36Array2 = null;
		} else {
			this.aClass36Array2 = new Class36[arg1.length];
			this.aClass36_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIIIILclient!uo;III)V")
	public void method5469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class32 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg8 + arg6 & 0x3FFF;
		if (this.anInt6505 == -1) {
			arg5.method2241(arg0, arg7, arg3, arg4, arg2, 0);
		} else {
			@Pc(31) Class154 local31 = Static68.anInterface2_3.method4244(this.anInt6505);
			if (this.aClass5_30 == null && Static68.anInterface2_3.method4241(this.anInt6505)) {
				@Pc(69) int[] local69 = local31.aBoolean439 ? Static68.anInterface2_3.method4243(this.anInt6501, this.anInt6505, 0.7F, this.anInt6501, false) : Static68.anInterface2_3.method4242(this.anInt6505, this.anInt6501, 0.7F, this.anInt6501);
				this.aClass5_30 = arg5.method2155(local69, this.anInt6501, this.anInt6501, this.anInt6501);
			}
			if (!local31.aBoolean439) {
				arg5.method2241(arg0, arg7, arg3, arg4, arg2, 0);
			}
			if (this.aClass5_30 != null) {
				@Pc(102) int local102 = local31.aBoolean439 ? 0 : 1;
				@Pc(108) int local108 = arg4 * arg1 / -4096;
				@Pc(121) int local121;
				for (local121 = local7 * arg4 / 4096 + (arg3 - arg4) / 2; local121 > arg4; local121 -= arg4) {
				}
				while (local121 < 0) {
					local121 += arg4;
				}
				while (arg4 < local108) {
					local108 -= arg4;
				}
				while (local108 < 0) {
					local108 += arg4;
				}
				for (@Pc(167) int local167 = local121 - arg4; local167 < arg3; local167 += arg4) {
					for (@Pc(173) int local173 = local108 - arg4; local173 < arg4; local173 += arg4) {
						this.aClass5_30.method3634(local167 + arg0, arg7 + local173, arg4, arg4, 0, 0, local102);
					}
				}
			}
		}
		for (@Pc(217) int local217 = this.anInt6503 - 1; local217 >= 0; local217--) {
			this.aClass36Array2[local217].method1290(arg5, arg0, arg7, arg3, arg4, arg1, local7);
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZILclient!uo;)Z")
	public boolean method5470(@OriginalArg(1) int arg0, @OriginalArg(2) Class32 arg1) {
		if (this.anInt6502 != arg0) {
			this.anInt6502 = arg0;
			@Pc(16) int local16 = Static194.method3745(arg0);
			if (arg0 < local16) {
				local16 = Static258.method4650(arg0);
			}
			if (local16 > 512) {
				local16 = 512;
			}
			if (this.anInt6501 != local16) {
				this.anInt6501 = local16;
				this.aClass5_30 = null;
			}
			if (this.aClass36Array1 != null) {
				this.anInt6503 = 0;
				@Pc(57) int[] local57 = new int[this.aClass36Array1.length];
				for (@Pc(59) int local59 = 0; local59 < this.aClass36Array1.length; local59++) {
					@Pc(66) Class36 local66 = this.aClass36Array1[local59];
					if (local66.method1299(this.anInt6496, this.anInt6494, this.anInt6498, this.anInt6502)) {
						local57[this.anInt6503] = local66.anInt1514;
						this.aClass36Array2[this.anInt6503++] = local66;
					}
				}
				Static341.method5494(this.aClass36Array2, 0, this.anInt6503 - 1, local57);
			}
			this.aBoolean635 = true;
		}
		@Pc(119) boolean local119 = false;
		if (this.aBoolean635) {
			this.aBoolean635 = false;
			for (@Pc(130) int local130 = this.anInt6503 - 1; local130 >= 0; local130--) {
				@Pc(141) boolean local141 = this.aClass36Array2[local130].method1292(arg1, this.aClass36_1);
				this.aBoolean635 |= !local141;
				local119 |= local141;
			}
		}
		return local119;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V")
	public void method5473() {
		if (this.aClass36Array1 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.aClass36Array1.length; local18++) {
				this.aClass36Array1[local18].method1295();
			}
		}
		this.aClass5_30 = null;
	}
}
