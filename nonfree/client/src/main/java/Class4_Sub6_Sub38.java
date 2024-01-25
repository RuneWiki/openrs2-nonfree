import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class4_Sub6_Sub38 extends Class4_Sub6 {

	@OriginalMember(owner = "client!vm", name = "E", descriptor = "I")
	private int anInt7032;

	@OriginalMember(owner = "client!vm", name = "F", descriptor = "I")
	private int anInt7033;

	@OriginalMember(owner = "client!vm", name = "G", descriptor = "I")
	private int anInt7034;

	@OriginalMember(owner = "client!vm", name = "L", descriptor = "I")
	private int anInt7039;

	@OriginalMember(owner = "client!vm", name = "O", descriptor = "I")
	private int anInt7042;

	@OriginalMember(owner = "client!vm", name = "P", descriptor = "I")
	private int anInt7043;

	@OriginalMember(owner = "client!vm", name = "H", descriptor = "I")
	private int anInt7035 = 0;

	@OriginalMember(owner = "client!vm", name = "M", descriptor = "I")
	private int anInt7040 = 0;

	@OriginalMember(owner = "client!vm", name = "S", descriptor = "I")
	private int anInt7044 = 0;

	static {
		new Class83("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIII)V")
	private void method5455(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(29) int local29 = arg1 <= 2048 ? arg1 * (arg0 + 4096) >> 12 : arg0 + arg1 - (arg1 * arg0 >> 12);
		if (local29 <= 0) {
			this.anInt7032 = this.anInt7033 = this.anInt7043 = arg1;
			return;
		}
		@Pc(46) int local46 = arg2 * 6;
		@Pc(53) int local53 = arg1 + arg1 - local29;
		@Pc(62) int local62 = (local29 - local53 << 12) / local29;
		@Pc(66) int local66 = local46 >> 12;
		@Pc(73) int local73 = local46 - (local66 << 12);
		@Pc(81) int local81 = local29 * local62 >> 12;
		@Pc(87) int local87 = local81 * local73 >> 12;
		@Pc(92) int local92 = local53 + local87;
		@Pc(97) int local97 = local29 - local87;
		if (local66 == 0) {
			this.anInt7033 = local92;
			this.anInt7032 = local29;
			this.anInt7043 = local53;
		} else if (local66 == 1) {
			this.anInt7043 = local53;
			this.anInt7033 = local29;
			this.anInt7032 = local97;
		} else if (local66 == 2) {
			this.anInt7043 = local92;
			this.anInt7033 = local29;
			this.anInt7032 = local53;
		} else if (local66 == 3) {
			this.anInt7043 = local29;
			this.anInt7032 = local53;
			this.anInt7033 = local97;
		} else if (local66 == 4) {
			this.anInt7033 = local53;
			this.anInt7043 = local29;
			this.anInt7032 = local92;
		} else if (local66 == 5) {
			this.anInt7032 = local29;
			this.anInt7033 = local53;
			this.anInt7043 = local97;
		}
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(IIII)V")
	private void method5457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16 = arg1 >= arg0 ? arg1 : arg0;
		@Pc(23) int local23 = arg2 > local16 ? arg2 : local16;
		@Pc(34) int local34 = arg0 < arg1 ? arg0 : arg1;
		@Pc(45) int local45 = arg2 >= local34 ? local34 : arg2;
		@Pc(50) int local50 = local23 - local45;
		this.anInt7034 = (local45 + local23) / 2;
		if (local50 > 0) {
			@Pc(72) int local72 = (local23 - arg0 << 12) / local50;
			@Pc(81) int local81 = (local23 - arg1 << 12) / local50;
			@Pc(90) int local90 = (local23 - arg2 << 12) / local50;
			if (arg0 == local23) {
				this.anInt7039 = arg1 == local45 ? local90 + 20480 : 4096 - local81;
			} else if (arg1 == local23) {
				this.anInt7039 = arg2 == local45 ? local72 + 4096 : -local90 + 12288;
			} else {
				this.anInt7039 = arg0 == local45 ? local81 + 12288 : -local72 + 20480;
			}
			this.anInt7039 /= 6;
		} else {
			this.anInt7039 = 0;
		}
		if (this.anInt7034 > 0 && this.anInt7034 < 4096) {
			this.anInt7042 = (local50 << 12) / (this.anInt7034 <= 2048 ? this.anInt7034 * 2 : 8192 - (this.anInt7034 * 2));
		} else {
			this.anInt7042 = 0;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt7044 = arg1.method2512();
		} else if (arg0 == 1) {
			this.anInt7035 = (arg1.method2542() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt7040 = (arg1.method2542() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5514(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass153_41.method3679(arg0);
		if (super.aClass153_41.aBoolean437) {
			@Pc(21) int[][] local21 = this.method5516(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static80.anInt1616; local47++) {
				this.method5457(local25[local47], local29[local47], local33[local47]);
				this.anInt7034 += this.anInt7040;
				this.anInt7039 += this.anInt7044;
				this.anInt7042 += this.anInt7035;
				while (this.anInt7039 < 0) {
					this.anInt7039 += 4096;
				}
				if (this.anInt7042 < 0) {
					this.anInt7042 = 0;
				}
				while (this.anInt7039 > 4096) {
					this.anInt7039 -= 4096;
				}
				if (this.anInt7042 > 4096) {
					this.anInt7042 = 4096;
				}
				if (this.anInt7034 < 0) {
					this.anInt7034 = 0;
				}
				if (this.anInt7034 > 4096) {
					this.anInt7034 = 4096;
				}
				this.method5455(this.anInt7042, this.anInt7034, this.anInt7039);
				local37[local47] = this.anInt7032;
				local41[local47] = this.anInt7033;
				local45[local47] = this.anInt7043;
			}
		}
		return local11;
	}
}
