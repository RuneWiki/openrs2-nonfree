import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class2_Sub3_Sub7 extends Class2_Sub3 {

	@OriginalMember(owner = "client!dj", name = "Y", descriptor = "Lclient!hu;")
	public static final Class98 aClass98_5 = new Class98(8);

	@OriginalMember(owner = "client!dj", name = "bb", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!dj", name = "Z", descriptor = "I")
	private int anInt1526 = 4096;

	@OriginalMember(owner = "client!dj", name = "ab", descriptor = "I")
	private int anInt1527 = 0;

	@OriginalMember(owner = "client!dj", name = "U", descriptor = "I")
	private int anInt1522 = 0;

	@OriginalMember(owner = "client!dj", name = "X", descriptor = "I")
	private int anInt1525 = 16;

	@OriginalMember(owner = "client!dj", name = "P", descriptor = "I")
	private int anInt1517 = 2000;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V", line = 5)
	public Class2_Sub3_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BI)[I", line = 9)
	@Override
	public int[] method6486(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass158_41.method3997(arg0);
		if (super.aClass158_41.aBoolean265) {
			@Pc(28) int local28 = this.anInt1526 >> 1;
			@Pc(33) int[][] local33 = super.aClass158_41.method3999();
			@Pc(40) Random local40 = new Random((long) this.anInt1527);
			for (@Pc(42) int local42 = 0; local42 < this.anInt1517; local42++) {
				@Pc(62) int local62 = this.anInt1526 <= 0 ? this.anInt1522 : this.anInt1522 + Static356.method6362(this.anInt1526, local40) - local28;
				@Pc(68) int local68 = local62 >> 4 & 0xFF;
				@Pc(73) int local73 = Static356.method6362(Static211.anInt4031, local40);
				@Pc(78) int local78 = Static356.method6362(Static23.anInt638, local40);
				@Pc(90) int local90 = local73 + (this.anInt1525 * Static169.anIntArray203[local68] >> 12);
				@Pc(102) int local102 = local78 + (this.anInt1525 * Static141.anIntArray173[local68] >> 12);
				@Pc(107) int local107 = local102 - local78;
				@Pc(112) int local112 = local90 - local73;
				if (local112 != 0 || local107 != 0) {
					if (local112 < 0) {
						local112 = -local112;
					}
					if (local107 < 0) {
						local107 = -local107;
					}
					@Pc(143) boolean local143 = local112 < local107;
					@Pc(147) int local147;
					@Pc(149) int local149;
					if (local143) {
						local147 = local73;
						local149 = local90;
						local73 = local78;
						local78 = local147;
						local90 = local102;
						local102 = local149;
					}
					if (local90 < local73) {
						local147 = local73;
						local73 = local90;
						local149 = local78;
						local78 = local102;
						local90 = local147;
						local102 = local149;
					}
					local147 = local78;
					local149 = local90 - local73;
					@Pc(184) int local184 = local102 - local78;
					@Pc(189) int local189 = -local149 / 2;
					@Pc(193) int local193 = 2048 / local149;
					@Pc(202) int local202 = 1024 - (Static356.method6362(4096, local40) >> 2);
					if (local184 < 0) {
						local184 = -local184;
					}
					@Pc(217) int local217 = local78 < local102 ? 1 : -1;
					for (@Pc(219) int local219 = local73; local219 < local90; local219++) {
						@Pc(232) int local232 = local202 + (-local73 + local219) * local193 + 1024;
						@Pc(236) int local236 = local219 & Static69.anInt1719;
						@Pc(240) int local240 = Static139.anInt2715 & local147;
						if (local143) {
							local33[local240][local236] = local232;
						} else {
							local33[local236][local240] = local232;
						}
						local189 += local184;
						if (local189 > 0) {
							local147 -= -local217;
							local189 -= local149;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!bt;I)V", line = 258)
	@Override
	public void method6485(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt1527 = arg1.method4816();
		} else if (arg0 == 1) {
			this.anInt1517 = arg1.method4830();
		} else if (arg0 == 2) {
			this.anInt1525 = arg1.method4816();
		} else if (arg0 == 3) {
			this.anInt1522 = arg1.method4830();
		} else if (arg0 == 4) {
			this.anInt1526 = arg1.method4830();
		}
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)V", line = 431)
	@Override
	public void method6481() {
		Static28.method937();
	}
}
