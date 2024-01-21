import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class2_Sub3_Sub7 extends Class2_Sub3 {

	@OriginalMember(owner = "client!dc", name = "S", descriptor = "I")
	private int anInt805;

	@OriginalMember(owner = "client!dc", name = "bb", descriptor = "I")
	private int anInt810;

	@OriginalMember(owner = "client!dc", name = "U", descriptor = "I")
	private int anInt806;

	@OriginalMember(owner = "client!dc", name = "fb", descriptor = "I")
	private int anInt813;

	@OriginalMember(owner = "client!dc", name = "mb", descriptor = "I")
	private int anInt816;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3016(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass51_41.method1730(arg0);
		if (super.aClass51_41.aBoolean89) {
			@Pc(25) int local25 = this.anInt813 >> 1;
			@Pc(30) int[][] local30 = super.aClass51_41.method1728();
			@Pc(37) Random local37 = new Random((long) this.anInt805);
			for (@Pc(39) int local39 = 0; local39 < this.anInt810; local39++) {
				@Pc(62) int local62 = this.anInt813 <= 0 ? this.anInt806 : this.anInt806 + Static108.method1830(this.anInt813, local37) - local25;
				@Pc(67) int local67 = Static108.method1830(Static53.anInt1184, local37);
				@Pc(73) int local73 = local62 >> 4 & 0xFF;
				@Pc(78) int local78 = Static108.method1830(Static34.anInt889, local37);
				@Pc(89) int local89 = (Static111.anIntArray222[local73] * this.anInt816 >> 12) + local78;
				@Pc(100) int local100 = (Static96.anIntArray205[local73] * this.anInt816 >> 12) + local67;
				@Pc(105) int local105 = local100 - local67;
				@Pc(110) int local110 = local89 - local78;
				if (local105 != 0 || local110 != 0) {
					if (local105 < 0) {
						local105 = -local105;
					}
					if (local110 < 0) {
						local110 = -local110;
					}
					@Pc(134) boolean local134 = local105 < local110;
					@Pc(138) int local138;
					@Pc(140) int local140;
					if (local134) {
						local138 = local67;
						local140 = local100;
						local67 = local78;
						local78 = local138;
						local100 = local89;
						local89 = local140;
					}
					if (local100 < local67) {
						local138 = local67;
						local140 = local78;
						local67 = local100;
						local78 = local89;
						local100 = local138;
						local89 = local140;
					}
					@Pc(171) int local171 = local89 - local78;
					local140 = local100 - local67;
					local138 = local78;
					if (local171 < 0) {
						local171 = -local171;
					}
					@Pc(188) int local188 = -local140 / 2;
					@Pc(192) int local192 = 2048 / local140;
					@Pc(202) int local202 = 1024 - (Static108.method1830(4096, local37) >> 2);
					@Pc(213) int local213 = local78 < local89 ? 1 : -1;
					for (@Pc(215) int local215 = local67; local215 < local100; local215++) {
						local188 += local171;
						@Pc(232) int local232 = local192 * (local215 - local67) + local202 + 1024;
						@Pc(236) int local236 = Static134.anInt2915 & local138;
						if (local188 > 0) {
							local138 += local213;
							local188 += -local140;
						}
						@Pc(251) int local251 = local215 & Static27.anInt588;
						if (local134) {
							local30[local236][local251] = local232;
						} else {
							local30[local251][local236] = local232;
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
	@Override
	public void method3019() {
		Static157.method2659();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			this.anInt805 = arg1.method2962();
		} else if (arg0 == 1) {
			this.anInt810 = arg1.method2933();
		} else if (arg0 == 2) {
			this.anInt816 = arg1.method2962();
		} else if (arg0 == 3) {
			this.anInt806 = arg1.method2933();
		} else if (arg0 == 4) {
			this.anInt813 = arg1.method2933();
		}
	}
}
