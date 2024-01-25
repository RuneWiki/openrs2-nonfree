import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class1_Sub3_Sub39 extends Class1_Sub3 {

	@OriginalMember(owner = "client!wt", name = "L", descriptor = "I")
	private int anInt7843 = 585;

	static {
		new Class84("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7843 = arg0.method4093();
		}
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6084(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass172_41.method3962(arg0);
		if (super.aClass172_41.aBoolean327) {
			@Pc(27) int local27 = Static342.anIntArray469[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static347.anInt5974; local29++) {
				@Pc(35) int local35 = Static384.anIntArray551[local29];
				@Pc(69) int local69;
				if (local35 > this.anInt7843 && 4096 - this.anInt7843 > local35 && 2048 - this.anInt7843 < local27 && this.anInt7843 + 2048 > local27) {
					local69 = 2048 - local35;
					local69 = local69 < 0 ? -local69 : local69;
					local69 <<= 0xC;
					local69 /= 2048 - this.anInt7843;
					local11[local29] = 4096 - local69;
				} else if (local35 > 2048 - this.anInt7843 && local35 < this.anInt7843 + 2048) {
					local69 = local27 - 2048;
					local69 = local69 < 0 ? -local69 : local69;
					local69 -= this.anInt7843;
					local69 <<= 0xC;
					local11[local29] = local69 / (2048 - this.anInt7843);
				} else if (local27 < this.anInt7843 || local27 > 4096 - this.anInt7843) {
					local69 = local35 - 2048;
					@Pc(175) int local175 = local69 >= 0 ? local69 : -local69;
					@Pc(180) int local180 = local175 - this.anInt7843;
					@Pc(184) int local184 = local180 << 12;
					local11[local29] = local184 / (2048 - this.anInt7843);
				} else if (this.anInt7843 <= local35 && local35 <= 4096 - this.anInt7843) {
					local11[local29] = 0;
				} else {
					local69 = 2048 - local27;
					local69 = local69 >= 0 ? local69 : -local69;
					local69 <<= 0xC;
					local69 /= 2048 - this.anInt7843;
					local11[local29] = 4096 - local69;
				}
			}
		}
		return local11;
	}
}
