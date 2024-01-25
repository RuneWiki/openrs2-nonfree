import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class2_Sub6_Sub31 extends Class2_Sub6 {

	@OriginalMember(owner = "client!rf", name = "N", descriptor = "[I")
	private final int[] anIntArray667 = new int[3];

	@OriginalMember(owner = "client!rf", name = "M", descriptor = "I")
	private int anInt5477 = 4096;

	@OriginalMember(owner = "client!rf", name = "L", descriptor = "I")
	private int anInt5476 = 4096;

	@OriginalMember(owner = "client!rf", name = "Q", descriptor = "I")
	private int anInt5480 = 4096;

	@OriginalMember(owner = "client!rf", name = "S", descriptor = "I")
	private int anInt5481 = 409;

	static {
		new Class221("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
	}

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub31() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5481 = arg0.method4245();
		} else if (arg1 == 1) {
			this.anInt5477 = arg0.method4245();
		} else if (arg1 == 2) {
			this.anInt5480 = arg0.method4245();
		} else if (arg1 == 3) {
			this.anInt5476 = arg0.method4245();
		} else if (arg1 == 4) {
			@Pc(62) int local62 = arg0.method4235();
			this.anIntArray667[0] = (local62 & 0xFF0000) << 4;
			this.anIntArray667[1] = local62 >> 4 & 0xFF0;
			this.anIntArray667[2] = local62 >> 12 & 0x0;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5641(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass208_41.method4986(arg0);
		if (super.aClass208_41.aBoolean443) {
			@Pc(26) int[][] local26 = this.method5640(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static151.anInt2711; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(66) int local66 = local58 - this.anIntArray667[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (this.anInt5481 < local66) {
					local42[local52] = local58;
					local46[local52] = local34[local52];
					local50[local52] = local38[local52];
				} else {
					@Pc(104) int local104 = local34[local52];
					local66 = local104 - this.anIntArray667[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (local66 > this.anInt5481) {
						local42[local52] = local58;
						local46[local52] = local104;
						local50[local52] = local38[local52];
					} else {
						@Pc(148) int local148 = local38[local52];
						local66 = local148 - this.anIntArray667[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (this.anInt5481 < local66) {
							local42[local52] = local58;
							local46[local52] = local104;
							local50[local52] = local148;
						} else {
							local42[local52] = this.anInt5476 * local58 >> 12;
							local46[local52] = local104 * this.anInt5480 >> 12;
							local50[local52] = this.anInt5477 * local148 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
