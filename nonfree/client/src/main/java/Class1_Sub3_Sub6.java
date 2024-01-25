import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class1_Sub3_Sub6 extends Class1_Sub3 {

	@OriginalMember(owner = "client!cf", name = "M", descriptor = "I")
	private int anInt891 = 4096;

	@OriginalMember(owner = "client!cf", name = "L", descriptor = "I")
	private int anInt890 = 4096;

	@OriginalMember(owner = "client!cf", name = "R", descriptor = "I")
	private int anInt895 = 4096;

	static {
		new Class84("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt891 = arg0.method4093();
		} else if (arg1 == 1) {
			this.anInt895 = arg0.method4093();
		} else if (arg1 == 2) {
			this.anInt890 = arg0.method4093();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6083(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass20_41.method474(arg0);
		if (super.aClass20_41.aBoolean14) {
			@Pc(26) int[][] local26 = this.method6072(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static347.anInt5974; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local34[local52];
				if (local58 == local62 && local66 == local62) {
					local42[local52] = this.anInt891 * local58 >> 12;
					local46[local52] = local62 * this.anInt895 >> 12;
					local50[local52] = this.anInt890 * local66 >> 12;
				} else {
					local42[local52] = this.anInt891;
					local46[local52] = this.anInt895;
					local50[local52] = this.anInt890;
				}
			}
		}
		return local16;
	}
}
