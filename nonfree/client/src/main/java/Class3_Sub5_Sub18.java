import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class3_Sub5_Sub18 extends Class3_Sub5 {

	@OriginalMember(owner = "client!mf", name = "P", descriptor = "I")
	private int anInt2515;

	@OriginalMember(owner = "client!mf", name = "N", descriptor = "I")
	private int anInt2514;

	@OriginalMember(owner = "client!mf", name = "eb", descriptor = "I")
	private int anInt2523;

	@OriginalMember(owner = "client!mf", name = "Z", descriptor = "I")
	private int anInt2520;

	@OriginalMember(owner = "client!mf", name = "hb", descriptor = "I")
	private int anInt2526;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt2526 = arg1.method2107();
		} else if (arg0 == 1) {
			this.anInt2523 = arg1.method2111();
		} else if (arg0 == 2) {
			this.anInt2515 = arg1.method2107();
		} else if (arg0 == 3) {
			this.anInt2520 = arg1.method2111();
		} else if (arg0 == 4) {
			this.anInt2514 = arg1.method2111();
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3173(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass39_41.method1114(arg0);
		if (super.aClass39_41.aBoolean66) {
			@Pc(16) int local16 = this.anInt2514 >> 1;
			@Pc(21) int[][] local21 = super.aClass39_41.method1115();
			@Pc(28) Random local28 = new Random((long) this.anInt2526);
			for (@Pc(30) int local30 = 0; local30 < this.anInt2523; local30++) {
				@Pc(53) int local53 = this.anInt2514 <= 0 ? this.anInt2520 : this.anInt2520 + Static141.method2188(this.anInt2514, local28) - local16;
				@Pc(59) int local59 = local53 >> 4 & 0xFF;
				@Pc(64) int local64 = Static141.method2188(Static104.anInt2195, local28);
				@Pc(69) int local69 = Static141.method2188(Static88.anInt1834, local28);
				@Pc(80) int local80 = local69 + (Static51.anIntArray160[local59] * this.anInt2515 >> 12);
				@Pc(84) int local84 = local80 - local69;
				@Pc(95) int local95 = (Static48.anIntArray150[local59] * this.anInt2515 >> 12) + local64;
				@Pc(99) int local99 = local95 - local64;
				if (local99 != 0 || local84 != 0) {
					if (local84 < 0) {
						local84 = -local84;
					}
					if (local99 < 0) {
						local99 = -local99;
					}
					@Pc(123) boolean local123 = local84 > local99;
					@Pc(127) int local127;
					@Pc(129) int local129;
					if (local123) {
						local127 = local64;
						local129 = local95;
						local95 = local80;
						local64 = local69;
						local80 = local129;
						local69 = local127;
					}
					if (local95 < local64) {
						local127 = local64;
						local64 = local95;
						local129 = local69;
						local95 = local127;
						local69 = local80;
						local80 = local129;
					}
					local127 = local69;
					local129 = local95 - local64;
					@Pc(168) int local168 = local80 - local69;
					@Pc(173) int local173 = -local129 / 2;
					if (local168 < 0) {
						local168 = -local168;
					}
					@Pc(182) int local182 = 2048 / local129;
					@Pc(192) int local192 = 1024 - (Static141.method2188(4096, local28) >> 2);
					@Pc(203) int local203 = local80 > local69 ? 1 : -1;
					for (@Pc(205) int local205 = local64; local205 < local95; local205++) {
						local173 += local168;
						@Pc(215) int local215 = Static112.anInt2517 & local205;
						@Pc(226) int local226 = local192 + (-local64 + local205) * local182 + 1024;
						@Pc(230) int local230 = local127 & Static23.anInt543;
						if (local123) {
							local21[local230][local215] = local226;
						} else {
							local21[local215][local230] = local226;
						}
						if (local173 > 0) {
							local127 += local203;
							local173 += -local129;
						}
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)V")
	@Override
	public void method3164() {
		Static153.method447();
	}
}
