import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class1_Sub2_Sub35 extends Class1_Sub2 {

	@OriginalMember(owner = "client!sj", name = "K", descriptor = "I")
	private int anInt5460;

	@OriginalMember(owner = "client!sj", name = "S", descriptor = "I")
	private int anInt5468;

	@OriginalMember(owner = "client!sj", name = "T", descriptor = "I")
	private int anInt5469;

	@OriginalMember(owner = "client!sj", name = "U", descriptor = "I")
	private int anInt5470;

	@OriginalMember(owner = "client!sj", name = "W", descriptor = "I")
	private int anInt5472;

	@OriginalMember(owner = "client!sj", name = "X", descriptor = "I")
	private int anInt5473;

	@OriginalMember(owner = "client!sj", name = "M", descriptor = "I")
	private int anInt5462 = 0;

	@OriginalMember(owner = "client!sj", name = "R", descriptor = "I")
	private int anInt5467 = 0;

	@OriginalMember(owner = "client!sj", name = "J", descriptor = "I")
	private int anInt5459 = 0;

	static {
		new Class169("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5504(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass228_41.method4874(arg0);
		if (super.aClass228_41.aBoolean523) {
			@Pc(28) int[][] local28 = this.method5514(arg0, 0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local18[0];
			@Pc(48) int[] local48 = local18[1];
			@Pc(52) int[] local52 = local18[2];
			for (@Pc(54) int local54 = 0; local54 < Static158.anInt2658; local54++) {
				this.method4728(local36[local54], local32[local54], local40[local54]);
				this.anInt5470 += this.anInt5462;
				this.anInt5473 += this.anInt5467;
				this.anInt5469 += this.anInt5459;
				while (this.anInt5470 < 0) {
					this.anInt5470 += 4096;
				}
				if (this.anInt5473 < 0) {
					this.anInt5473 = 0;
				}
				while (this.anInt5470 > 4096) {
					this.anInt5470 -= 4096;
				}
				if (this.anInt5473 > 4096) {
					this.anInt5473 = 4096;
				}
				if (this.anInt5469 < 0) {
					this.anInt5469 = 0;
				}
				if (this.anInt5469 > 4096) {
					this.anInt5469 = 4096;
				}
				this.method4727(this.anInt5469, this.anInt5470, this.anInt5473);
				local44[local54] = this.anInt5472;
				local48[local54] = this.anInt5468;
				local52[local54] = this.anInt5460;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			this.anInt5462 = arg1.method5180();
		} else if (arg0 == 1) {
			this.anInt5467 = (arg1.method5188() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt5459 = (arg1.method5188() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIZ)V")
	private void method4727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(32) int local32 = arg0 > 2048 ? arg0 + arg2 - (arg2 * arg0 >> 12) : (arg2 + 4096) * arg0 >> 12;
		if (local32 <= 0) {
			this.anInt5472 = this.anInt5468 = this.anInt5460 = arg0;
			return;
		}
		@Pc(38) int local38 = arg1 * 6;
		@Pc(46) int local46 = arg0 + arg0 - local32;
		@Pc(54) int local54 = (local32 - local46 << 12) / local32;
		@Pc(58) int local58 = local38 >> 12;
		@Pc(65) int local65 = local38 - (local58 << 12);
		@Pc(73) int local73 = local54 * local32 >> 12;
		@Pc(79) int local79 = local73 * local65 >> 12;
		@Pc(83) int local83 = local79 + local46;
		@Pc(88) int local88 = local32 - local79;
		if (local58 == 0) {
			this.anInt5460 = local46;
			this.anInt5468 = local83;
			this.anInt5472 = local32;
			return;
		}
		if (local58 == 1) {
			this.anInt5468 = local32;
			this.anInt5472 = local88;
			this.anInt5460 = local46;
			return;
		}
		if (local58 == 2) {
			this.anInt5472 = local46;
			this.anInt5460 = local83;
			this.anInt5468 = local32;
			return;
		}
		if (local58 == 3) {
			this.anInt5468 = local88;
			this.anInt5472 = local46;
			this.anInt5460 = local32;
			return;
		}
		if (local58 == 4) {
			this.anInt5472 = local83;
			this.anInt5468 = local46;
			this.anInt5460 = local32;
			return;
		}
		if (local58 == 5) {
			this.anInt5468 = local46;
			this.anInt5472 = local32;
			this.anInt5460 = local88;
			return;
		}
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(IIII)V")
	private void method4728(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 < arg1 ? arg1 : arg0;
		@Pc(23) int local23 = arg0 <= arg1 ? arg0 : arg1;
		@Pc(30) int local30 = local12 >= arg2 ? local12 : arg2;
		@Pc(50) int local50 = arg2 >= local23 ? local23 : arg2;
		@Pc(55) int local55 = local30 - local50;
		this.anInt5469 = (local30 + local50) / 2;
		if (local55 > 0) {
			@Pc(72) int local72 = (local30 - arg1 << 12) / local55;
			@Pc(81) int local81 = (local30 - arg0 << 12) / local55;
			@Pc(90) int local90 = (local30 - arg2 << 12) / local55;
			if (local30 == arg1) {
				this.anInt5470 = local50 == arg0 ? local90 + 20480 : -local81 + 4096;
			} else if (local30 == arg0) {
				this.anInt5470 = arg2 == local50 ? local72 + 4096 : -local90 + 12288;
			} else {
				this.anInt5470 = arg1 == local50 ? local81 + 12288 : 20480 - local72;
			}
			this.anInt5470 /= 6;
		} else {
			this.anInt5470 = 0;
		}
		if (this.anInt5469 > 0 && this.anInt5469 < 4096) {
			this.anInt5473 = (local55 << 12) / (this.anInt5469 > 2048 ? 8192 - (this.anInt5469 * 2) : this.anInt5469 * 2);
		} else {
			this.anInt5473 = 0;
		}
	}
}
