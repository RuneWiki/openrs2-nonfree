import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class4_Sub3_Sub19 extends Class4_Sub3 {

	@OriginalMember(owner = "client!kn", name = "G", descriptor = "I")
	private int anInt4250 = 4096;

	@OriginalMember(owner = "client!kn", name = "L", descriptor = "Z")
	private boolean aBoolean269 = true;

	static {
		new Class21("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6335(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass93_41.method2622(arg0);
		if (super.aClass93_41.aBoolean189) {
			@Pc(30) int[] local30 = this.method6337(0, arg0 - 1 & Static429.anInt7355);
			@Pc(36) int[] local36 = this.method6337(0, arg0);
			@Pc(46) int[] local46 = this.method6337(0, arg0 + 1 & Static429.anInt7355);
			@Pc(50) int[] local50 = local11[0];
			@Pc(54) int[] local54 = local11[1];
			@Pc(58) int[] local58 = local11[2];
			for (@Pc(60) int local60 = 0; local60 < Static304.anInt5637; local60++) {
				@Pc(74) int local74 = (local46[local60] - local30[local60]) * this.anInt4250;
				@Pc(94) int local94 = this.anInt4250 * (local36[local60 + 1 & Static279.anInt5254] - local36[local60 - 1 & Static279.anInt5254]);
				@Pc(98) int local98 = local94 >> 12;
				@Pc(102) int local102 = local74 >> 12;
				@Pc(108) int local108 = local98 * local98 >> 12;
				@Pc(114) int local114 = local102 * local102 >> 12;
				@Pc(128) int local128 = (int) (Math.sqrt((double) ((float) (local114 + local108 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(136) int local136;
				@Pc(134) int local134;
				@Pc(132) int local132;
				if (local128 == 0) {
					local132 = 0;
					local134 = 0;
					local136 = 0;
				} else {
					local136 = local94 / local128;
					local134 = local74 / local128;
					local132 = 16777216 / local128;
				}
				if (this.aBoolean269) {
					local132 = (local132 >> 1) + 2048;
					local136 = (local136 >> 1) + 2048;
					local134 = (local134 >> 1) + 2048;
				}
				local50[local60] = local136;
				local54[local60] = local134;
				local58[local60] = local132;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt4250 = arg1.method4560();
		} else if (arg0 == 1) {
			this.aBoolean269 = arg1.method4614() == 1;
		}
	}
}
