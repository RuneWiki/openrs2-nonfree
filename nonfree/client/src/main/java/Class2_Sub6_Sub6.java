import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class2_Sub6_Sub6 extends Class2_Sub6 {

	@OriginalMember(owner = "client!dl", name = "H", descriptor = "I")
	private int anInt1916 = 0;

	@OriginalMember(owner = "client!dl", name = "L", descriptor = "I")
	private int anInt1920 = 16;

	@OriginalMember(owner = "client!dl", name = "K", descriptor = "I")
	private int anInt1919 = 4096;

	@OriginalMember(owner = "client!dl", name = "O", descriptor = "I")
	private int anInt1923 = 2000;

	@OriginalMember(owner = "client!dl", name = "P", descriptor = "I")
	private int anInt1924 = 0;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			this.anInt1916 = arg1.method8547();
		} else if (arg0 == 1) {
			this.anInt1923 = arg1.method8546();
		} else if (arg0 == 2) {
			this.anInt1920 = arg1.method8547();
		} else if (arg0 == 3) {
			this.anInt1924 = arg1.method8546();
		} else if (arg0 == 4) {
			this.anInt1919 = arg1.method8546();
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
	@Override
	public void method8462() {
		Static212.method2948();
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass377_41.method8586(arg0);
		if (super.aClass377_41.aBoolean746) {
			@Pc(28) int local28 = this.anInt1919 >> 1;
			@Pc(33) int[][] local33 = super.aClass377_41.method8587();
			@Pc(40) Random local40 = new Random((long) this.anInt1916);
			for (@Pc(42) int local42 = 0; local42 < this.anInt1923; local42++) {
				@Pc(66) int local66 = this.anInt1919 > 0 ? this.anInt1924 + Static239.method3351(this.anInt1919, local40) - local28 : this.anInt1924;
				@Pc(72) int local72 = local66 >> 4 & 0xFF;
				@Pc(77) int local77 = Static239.method3351(Static51.anInt1085, local40);
				@Pc(82) int local82 = Static239.method3351(Static262.anInt5589, local40);
				@Pc(93) int local93 = local77 + (this.anInt1920 * Static111.anIntArray141[local72] >> 12);
				@Pc(104) int local104 = local82 + (this.anInt1920 * Static123.anIntArray155[local72] >> 12);
				@Pc(109) int local109 = local104 - local82;
				@Pc(114) int local114 = local93 - local77;
				if (local114 != 0 || local109 != 0) {
					if (local109 < 0) {
						local109 = -local109;
					}
					if (local114 < 0) {
						local114 = -local114;
					}
					@Pc(141) boolean local141 = local114 < local109;
					@Pc(145) int local145;
					@Pc(149) int local149;
					if (local141) {
						local145 = local77;
						local77 = local82;
						local149 = local93;
						local93 = local104;
						local82 = local145;
						local104 = local149;
					}
					if (local93 < local77) {
						local145 = local77;
						local149 = local82;
						local77 = local93;
						local93 = local145;
						local82 = local104;
						local104 = local149;
					}
					local145 = local82;
					local149 = local93 - local77;
					@Pc(186) int local186 = local104 - local82;
					@Pc(191) int local191 = -local149 / 2;
					@Pc(195) int local195 = 2048 / local149;
					@Pc(205) int local205 = 1024 - (Static239.method3351(4096, local40) >> 2);
					@Pc(212) int local212 = local104 <= local82 ? -1 : 1;
					if (local186 < 0) {
						local186 = -local186;
					}
					for (@Pc(219) int local219 = local77; local219 < local93; local219++) {
						@Pc(233) int local233 = local205 + (local219 - local77) * local195 + 1024;
						@Pc(237) int local237 = Static332.anInt5256 & local219;
						@Pc(241) int local241 = Static53.anInt1098 & local145;
						local191 += local186;
						if (local141) {
							local33[local241][local237] = local233;
						} else {
							local33[local237][local241] = local233;
						}
						if (local191 > 0) {
							local145 += local212;
							local191 -= local149;
						}
					}
				}
			}
		}
		return local11;
	}
}
