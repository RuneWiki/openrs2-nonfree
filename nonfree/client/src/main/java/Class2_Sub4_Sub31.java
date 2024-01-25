import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class2_Sub4_Sub31 extends Class2_Sub4 {

	@OriginalMember(owner = "client!st", name = "fb", descriptor = "[Lclient!bc;")
	private static final Class17[] aClass17Array1 = new Class17[32];

	@OriginalMember(owner = "client!st", name = "V", descriptor = "I")
	private int anInt5472 = 204;

	@OriginalMember(owner = "client!st", name = "Q", descriptor = "I")
	private int anInt5468 = 1;

	@OriginalMember(owner = "client!st", name = "R", descriptor = "I")
	private int anInt5469 = 1;

	static {
		@Pc(65) Class17[] local65 = Static4.method88();
		for (@Pc(67) int local67 = 0; local67 < local65.length; local67++) {
			aClass17Array1[local65[local67].anInt444] = local65[local67];
		}
		new Class32("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5589(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass237_41.method5430(arg0);
		if (super.aClass237_41.aBoolean441) {
			for (@Pc(17) int local17 = 0; local17 < Static76.anInt1458; local17++) {
				@Pc(23) int local23 = Static40.anIntArray173[local17];
				@Pc(27) int local27 = Static347.anIntArray1193[arg0];
				@Pc(34) int local34 = this.anInt5468 * local23 >> 12;
				@Pc(41) int local41 = local27 * this.anInt5469 >> 12;
				@Pc(51) int local51 = this.anInt5468 * (local23 % (4096 / this.anInt5468));
				@Pc(61) int local61 = local27 % (4096 / this.anInt5469) * this.anInt5469;
				if (local61 < this.anInt5472) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 != 1) {
						local11[local17] = 0;
						continue;
					}
					if (local51 < this.anInt5472) {
						local11[local17] = 0;
						continue;
					}
				}
				if (local51 < this.anInt5472) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 > 0) {
						local11[local17] = 0;
						continue;
					}
				}
				local11[local17] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5468 = arg0.method5350();
		} else if (arg1 == 1) {
			this.anInt5469 = arg0.method5350();
		} else if (arg1 == 2) {
			this.anInt5472 = arg0.method5312();
		}
	}
}
