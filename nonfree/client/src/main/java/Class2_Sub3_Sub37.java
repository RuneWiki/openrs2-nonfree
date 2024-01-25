import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class2_Sub3_Sub37 extends Class2_Sub3 {

	@OriginalMember(owner = "client!vb", name = "G", descriptor = "I")
	private int anInt6612;

	@OriginalMember(owner = "client!vb", name = "J", descriptor = "I")
	private int anInt6615;

	@OriginalMember(owner = "client!vb", name = "L", descriptor = "I")
	private int anInt6617;

	@OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
	private int anInt6618;

	@OriginalMember(owner = "client!vb", name = "N", descriptor = "I")
	private int anInt6619;

	@OriginalMember(owner = "client!vb", name = "P", descriptor = "I")
	private int anInt6620;

	@OriginalMember(owner = "client!vb", name = "K", descriptor = "I")
	private int anInt6616 = 0;

	@OriginalMember(owner = "client!vb", name = "T", descriptor = "I")
	private int anInt6624 = 0;

	@OriginalMember(owner = "client!vb", name = "V", descriptor = "I")
	private int anInt6626 = 0;

	static {
		new Class140("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	}

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5702(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass90_41.method2391(arg0);
		if (super.aClass90_41.aBoolean257) {
			@Pc(26) int[][] local26 = this.method5707(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static263.anInt5504; local52++) {
				this.method5545(local30[local52], local38[local52], local34[local52]);
				this.anInt6620 += this.anInt6626;
				this.anInt6617 += this.anInt6616;
				for (this.anInt6618 += this.anInt6624; this.anInt6618 < 0; this.anInt6618 += 4096) {
				}
				while (this.anInt6618 > 4096) {
					this.anInt6618 -= 4096;
				}
				if (this.anInt6617 < 0) {
					this.anInt6617 = 0;
				}
				if (this.anInt6617 > 4096) {
					this.anInt6617 = 4096;
				}
				if (this.anInt6620 < 0) {
					this.anInt6620 = 0;
				}
				if (this.anInt6620 > 4096) {
					this.anInt6620 = 4096;
				}
				this.method5546(this.anInt6618, this.anInt6620, this.anInt6617);
				local42[local52] = this.anInt6619;
				local46[local52] = this.anInt6612;
				local50[local52] = this.anInt6615;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BIII)V")
	private void method5545(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg0 > arg2 ? arg0 : arg2;
		@Pc(23) int local23 = local16 >= arg1 ? local16 : arg1;
		@Pc(30) int local30 = arg0 >= arg2 ? arg2 : arg0;
		@Pc(41) int local41 = local30 > arg1 ? arg1 : local30;
		this.anInt6620 = (local23 + local41) / 2;
		@Pc(52) int local52 = local23 - local41;
		if (this.anInt6620 > 0 && this.anInt6620 < 4096) {
			this.anInt6617 = (local52 << 12) / (this.anInt6620 > 2048 ? 8192 - this.anInt6620 * 2 : this.anInt6620 * 2);
		} else {
			this.anInt6617 = 0;
		}
		if (local52 <= 0) {
			this.anInt6618 = 0;
			return;
		}
		@Pc(99) int local99 = (local23 - arg0 << 12) / local52;
		@Pc(108) int local108 = (local23 - arg2 << 12) / local52;
		@Pc(117) int local117 = (local23 - arg1 << 12) / local52;
		if (arg0 == local23) {
			this.anInt6618 = arg2 == local41 ? local117 + 20480 : -local108 + 4096;
		} else if (arg2 == local23) {
			this.anInt6618 = local41 == arg1 ? local99 + 4096 : 12288 - local117;
		} else {
			this.anInt6618 = arg0 == local41 ? local108 + 12288 : -local99 + 20480;
		}
		this.anInt6618 /= 6;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIII)V")
	private void method5546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(27) int local27 = arg1 <= 2048 ? (arg2 + 4096) * arg1 >> 12 : arg1 + arg2 - (arg2 * arg1 >> 12);
		if (local27 <= 0) {
			this.anInt6619 = this.anInt6612 = this.anInt6615 = arg1;
			return;
		}
		@Pc(40) int local40 = arg0 * 6;
		@Pc(47) int local47 = arg1 + arg1 - local27;
		@Pc(56) int local56 = (local27 - local47 << 12) / local27;
		@Pc(60) int local60 = local40 >> 12;
		@Pc(67) int local67 = local40 - (local60 << 12);
		@Pc(75) int local75 = local27 * local56 >> 12;
		@Pc(81) int local81 = local75 * local67 >> 12;
		@Pc(86) int local86 = local47 + local81;
		@Pc(90) int local90 = local27 - local81;
		if (local60 == 0) {
			this.anInt6612 = local86;
			this.anInt6619 = local27;
			this.anInt6615 = local47;
			return;
		}
		if (local60 == 1) {
			this.anInt6619 = local90;
			this.anInt6615 = local47;
			this.anInt6612 = local27;
			return;
		}
		if (local60 == 2) {
			this.anInt6615 = local86;
			this.anInt6612 = local27;
			this.anInt6619 = local47;
			return;
		}
		if (local60 == 3) {
			this.anInt6619 = local47;
			this.anInt6612 = local90;
			this.anInt6615 = local27;
			return;
		}
		if (local60 == 4) {
			this.anInt6619 = local86;
			this.anInt6615 = local27;
			this.anInt6612 = local47;
			return;
		}
		if (local60 == 5) {
			this.anInt6615 = local90;
			this.anInt6612 = local47;
			this.anInt6619 = local27;
			return;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt6624 = arg1.method3108();
		} else if (arg0 == 1) {
			this.anInt6616 = (arg1.method3122() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt6626 = (arg1.method3122() << 12) / 100;
		}
	}
}
