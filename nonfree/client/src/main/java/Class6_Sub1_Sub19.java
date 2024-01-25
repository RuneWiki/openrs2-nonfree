import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class6_Sub1_Sub19 extends Class6_Sub1 {

	@OriginalMember(owner = "client!io", name = "T", descriptor = "I")
	private int anInt2492 = 4096;

	@OriginalMember(owner = "client!io", name = "M", descriptor = "I")
	private int anInt2486 = 16;

	@OriginalMember(owner = "client!io", name = "O", descriptor = "I")
	private int anInt2488 = 2000;

	@OriginalMember(owner = "client!io", name = "U", descriptor = "I")
	private int anInt2493 = 0;

	@OriginalMember(owner = "client!io", name = "S", descriptor = "I")
	private int anInt2491 = 0;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2493 = arg0.method3972();
		} else if (arg1 == 1) {
			this.anInt2488 = arg0.method4021();
		} else if (arg1 == 2) {
			this.anInt2486 = arg0.method3972();
		} else if (arg1 == 3) {
			this.anInt2491 = arg0.method4021();
		} else if (arg1 == 4) {
			this.anInt2492 = arg0.method4021();
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)V")
	@Override
	public void method5611() {
		Static86.method1476();
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5616(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass140_41.method3664(arg0);
		if (super.aClass140_41.aBoolean287) {
			@Pc(25) int local25 = this.anInt2492 >> 1;
			@Pc(30) int[][] local30 = super.aClass140_41.method3662();
			@Pc(37) Random local37 = new Random((long) this.anInt2493);
			for (@Pc(39) int local39 = 0; local39 < this.anInt2488; local39++) {
				@Pc(61) int local61 = this.anInt2492 > 0 ? this.anInt2491 + Static24.method368(this.anInt2492, local37) - local25 : this.anInt2491;
				@Pc(67) int local67 = local61 >> 4 & 0xFF;
				@Pc(72) int local72 = Static24.method368(Static299.anInt5659, local37);
				@Pc(77) int local77 = Static24.method368(Static273.anInt6145, local37);
				@Pc(88) int local88 = local72 + (this.anInt2486 * Static313.anIntArray665[local67] >> 12);
				@Pc(99) int local99 = (this.anInt2486 * Static342.anIntArray707[local67] >> 12) + local77;
				@Pc(104) int local104 = local99 - local77;
				@Pc(109) int local109 = local88 - local72;
				if (local109 != 0 || local104 != 0) {
					if (local109 < 0) {
						local109 = -local109;
					}
					if (local104 < 0) {
						local104 = -local104;
					}
					@Pc(140) boolean local140 = local109 < local104;
					@Pc(144) int local144;
					@Pc(146) int local146;
					if (local140) {
						local144 = local72;
						local146 = local88;
						local72 = local77;
						local77 = local144;
						local88 = local99;
						local99 = local146;
					}
					if (local72 > local88) {
						local144 = local72;
						local146 = local77;
						local72 = local88;
						local77 = local99;
						local88 = local144;
						local99 = local146;
					}
					local144 = local77;
					local146 = local88 - local72;
					@Pc(185) int local185 = local99 - local77;
					@Pc(190) int local190 = -local146 / 2;
					@Pc(194) int local194 = 2048 / local146;
					@Pc(204) int local204 = 1024 - (Static24.method368(4096, local37) >> 2);
					@Pc(215) int local215 = local99 > local77 ? 1 : -1;
					if (local185 < 0) {
						local185 = -local185;
					}
					for (@Pc(225) int local225 = local72; local225 < local88; local225++) {
						@Pc(238) int local238 = local204 + local194 * (local225 - local72) + 1024;
						@Pc(242) int local242 = local225 & Static76.anInt2850;
						@Pc(246) int local246 = Static113.anInt2099 & local144;
						if (local140) {
							local30[local246][local242] = local238;
						} else {
							local30[local242][local246] = local238;
						}
						local190 += local185;
						if (local190 > 0) {
							local190 -= local146;
							local144 += local215;
						}
					}
				}
			}
		}
		return local16;
	}
}
