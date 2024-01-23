import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class1_Sub1_Sub14 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gm", name = "I", descriptor = "I")
	private int anInt1935 = 4;

	@OriginalMember(owner = "client!gm", name = "H", descriptor = "I")
	private int anInt1934 = 4;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4462(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = this.aClass71_41.method1894(arg0);
		if (this.aClass71_41.aBoolean190) {
			@Pc(21) int local21 = Static6.anInt4960 / this.anInt1934;
			@Pc(26) int local26 = Static213.anInt5511 / this.anInt1935;
			@Pc(35) int[][] local35;
			if (local26 <= 0) {
				local35 = this.method4456(0, 0);
			} else {
				@Pc(41) int local41 = arg0 % local26;
				local35 = this.method4456(local41 * Static213.anInt5511 / local26, 0);
			}
			@Pc(55) int[] local55 = local35[0];
			@Pc(59) int[] local59 = local35[2];
			@Pc(63) int[] local63 = local35[1];
			@Pc(67) int[] local67 = local11[0];
			@Pc(71) int[] local71 = local11[1];
			@Pc(75) int[] local75 = local11[2];
			for (@Pc(77) int local77 = 0; local77 < Static6.anInt4960; local77++) {
				@Pc(99) int local99;
				if (local21 > 0) {
					@Pc(93) int local93 = local77 % local21;
					local99 = local93 * Static6.anInt4960 / local21;
				} else {
					local99 = 0;
				}
				local67[local77] = local55[local99];
				local71[local77] = local63[local99];
				local75[local77] = local59[local99];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method4465(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass190_41.method4648(arg0);
		if (this.aClass190_41.aBoolean527) {
			@Pc(21) int local21 = Static6.anInt4960 / this.anInt1934;
			@Pc(26) int local26 = Static213.anInt5511 / this.anInt1935;
			@Pc(34) int[] local34;
			@Pc(40) int local40;
			if (local26 <= 0) {
				local34 = this.method4464(0, 0);
			} else {
				local40 = arg0 % local26;
				local34 = this.method4464(local40 * Static213.anInt5511 / local26, 0);
			}
			for (local40 = 0; local40 < Static6.anInt4960; local40++) {
				if (local21 <= 0) {
					local11[local40] = local34[0];
				} else {
					@Pc(72) int local72 = local40 % local21;
					local11[local40] = local34[Static6.anInt4960 * local72 / local21];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1934 = arg0.method1853();
		} else if (arg1 == 1) {
			this.anInt1935 = arg0.method1853();
		}
	}
}
