import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ag", name = "P", descriptor = "I")
	private int anInt201 = 0;

	@OriginalMember(owner = "client!ag", name = "Y", descriptor = "I")
	private int anInt207 = 2048;

	@OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
	private int anInt203 = 12288;

	@OriginalMember(owner = "client!ag", name = "gb", descriptor = "I")
	private int anInt209 = 2048;

	@OriginalMember(owner = "client!ag", name = "Z", descriptor = "I")
	private int anInt208 = 0;

	@OriginalMember(owner = "client!ag", name = "pb", descriptor = "I")
	private int anInt213 = 8192;

	@OriginalMember(owner = "client!ag", name = "V", descriptor = "I")
	private int anInt204 = 4096;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)V")
	@Override
	public void method3569() {
		Static64.method1304();
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(III)Z")
	private boolean method211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = this.anInt203 * (arg1 - arg0) >> 12;
		@Pc(31) int local31 = Static189.anIntArray364[local9 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local31 << 12) / this.anInt203;
		@Pc(45) int local45 = (local38 << 12) / this.anInt213;
		@Pc(52) int local52 = local45 * this.anInt204 >> 12;
		return arg1 + arg0 < local52 && arg0 + arg1 > -local52;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass40_41.method1362(arg0);
		if (super.aClass40_41.aBoolean86) {
			@Pc(27) int local27 = Static187.anIntArray362[arg0] - 2048;
			for (@Pc(29) int local29 = 0; local29 < Static115.anInt2578; local29++) {
				@Pc(37) int local37 = Static45.anIntArray97[local29] - 2048;
				@Pc(42) int local42 = this.anInt209 + local37;
				@Pc(51) int local51 = local42 < -2048 ? local42 + 4096 : local42;
				@Pc(56) int local56 = this.anInt208 + local27;
				@Pc(67) int local67 = local56 < -2048 ? local56 + 4096 : local56;
				@Pc(72) int local72 = this.anInt201 + local37;
				@Pc(77) int local77 = local27 + this.anInt207;
				@Pc(88) int local88 = local51 > 2048 ? local51 - 4096 : local51;
				@Pc(99) int local99 = local72 >= -2048 ? local72 : local72 + 4096;
				@Pc(108) int local108 = local67 <= 2048 ? local67 : local67 - 4096;
				@Pc(119) int local119 = local77 < -2048 ? local77 + 4096 : local77;
				@Pc(128) int local128 = local99 > 2048 ? local99 - 4096 : local99;
				@Pc(139) int local139 = local119 <= 2048 ? local119 : local119 - 4096;
				local17[local29] = this.method211(local88, local108) || this.method214(local128, local139) ? 4096 : 0;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt209 = arg0.method2765();
		} else if (arg1 == 1) {
			this.anInt208 = arg0.method2765();
		} else if (arg1 == 2) {
			this.anInt201 = arg0.method2765();
		} else if (arg1 == 3) {
			this.anInt207 = arg0.method2765();
		} else if (arg1 == 4) {
			this.anInt203 = arg0.method2765();
		} else if (arg1 == 5) {
			this.anInt204 = arg0.method2765();
		} else if (arg1 == 6) {
			this.anInt213 = arg0.method2765();
		}
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(III)Z")
	private boolean method214(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = this.anInt203 * (arg1 + arg0) >> 12;
		@Pc(23) int local23 = Static189.anIntArray364[local9 * 255 >> 12 & 0xFF];
		@Pc(36) int local36 = (local23 << 12) / this.anInt203;
		@Pc(43) int local43 = (local36 << 12) / this.anInt213;
		@Pc(50) int local50 = local43 * this.anInt204 >> 12;
		return local50 > arg1 - arg0 && arg1 - arg0 > -local50;
	}
}
