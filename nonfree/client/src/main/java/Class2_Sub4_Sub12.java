import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class2_Sub4_Sub12 extends Class2_Sub4 {

	@OriginalMember(owner = "client!gu", name = "R", descriptor = "I")
	private int anInt2572;

	@OriginalMember(owner = "client!gu", name = "S", descriptor = "I")
	private int anInt2573;

	@OriginalMember(owner = "client!gu", name = "ab", descriptor = "I")
	private int anInt2580;

	@OriginalMember(owner = "client!gu", name = "cb", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!gu", name = "eb", descriptor = "[I")
	private int[] anIntArray513;

	@OriginalMember(owner = "client!gu", name = "hb", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!gu", name = "W", descriptor = "I")
	private int anInt2576 = 81;

	@OriginalMember(owner = "client!gu", name = "Y", descriptor = "I")
	private int anInt2578 = 1024;

	@OriginalMember(owner = "client!gu", name = "T", descriptor = "I")
	private int anInt2574 = 1024;

	@OriginalMember(owner = "client!gu", name = "N", descriptor = "I")
	private int anInt2570 = 0;

	@OriginalMember(owner = "client!gu", name = "gb", descriptor = "I")
	private int anInt2583 = 409;

	@OriginalMember(owner = "client!gu", name = "fb", descriptor = "I")
	private int anInt2582 = 8;

	@OriginalMember(owner = "client!gu", name = "Z", descriptor = "I")
	private int anInt2579 = 4;

	@OriginalMember(owner = "client!gu", name = "bb", descriptor = "I")
	private int anInt2581 = 204;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2579 = arg0.method5350();
		} else if (arg1 == 1) {
			this.anInt2582 = arg0.method5350();
		} else if (arg1 == 2) {
			this.anInt2583 = arg0.method5312();
		} else if (arg1 == 3) {
			this.anInt2581 = arg0.method5312();
		} else if (arg1 == 4) {
			this.anInt2578 = arg0.method5312();
		} else if (arg1 == 5) {
			this.anInt2570 = arg0.method5312();
		} else if (arg1 == 6) {
			this.anInt2576 = arg0.method5312();
		} else if (arg1 == 7) {
			this.anInt2574 = arg0.method5312();
		}
	}

	@OriginalMember(owner = "client!gu", name = "h", descriptor = "(I)V")
	private void method2467() {
		@Pc(12) Random local12 = new Random((long) this.anInt2582);
		this.anInt2572 = 4096 / this.anInt2582;
		this.anInt2573 = 4096 / this.anInt2579;
		this.anInt2580 = this.anInt2576 / 2;
		@Pc(43) int local43 = this.anInt2573 / 2;
		this.anIntArrayArray21 = new int[this.anInt2582][this.anInt2579];
		@Pc(55) int local55 = this.anInt2572 / 2;
		this.anIntArrayArray20 = new int[this.anInt2582][this.anInt2579 + 1];
		this.anIntArray513 = new int[this.anInt2582 + 1];
		this.anIntArray513[0] = 0;
		for (@Pc(78) int local78 = 0; local78 < this.anInt2582; local78++) {
			@Pc(88) int local88;
			@Pc(100) int local100;
			if (local78 > 0) {
				local88 = this.anInt2572;
				local100 = (Static331.method4885(local12, 4096) - 2048) * this.anInt2581 >> 12;
				@Pc(108) int local108 = local88 + (local100 * local55 >> 12);
				this.anIntArray513[local78] = this.anIntArray513[local78 - 1] + local108;
			}
			this.anIntArrayArray20[local78][0] = 0;
			for (local88 = 0; local88 < this.anInt2579; local88++) {
				if (local88 > 0) {
					local100 = this.anInt2573;
					@Pc(151) int local151 = (Static331.method4885(local12, 4096) - 2048) * this.anInt2583 >> 12;
					local100 += local151 * local43 >> 12;
					this.anIntArrayArray20[local78][local88] = this.anIntArrayArray20[local78][local88 - 1] + local100;
				}
				this.anIntArrayArray21[local78][local88] = this.anInt2574 > 0 ? 4096 - Static331.method4885(local12, this.anInt2574) : 4096;
			}
			this.anIntArrayArray20[local78][this.anInt2579] = 4096;
		}
		this.anIntArray513[this.anInt2582] = 4096;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5589(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass237_41.method5430(arg0);
		if (super.aClass237_41.aBoolean441) {
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			for (local29 = this.anInt2570 + Static347.anIntArray1193[arg0]; local29 < 0; local29 += 4096) {
			}
			while (local29 > 4096) {
				local29 -= 4096;
			}
			while (this.anInt2582 > local22 && local29 >= this.anIntArray513[local22]) {
				local22++;
			}
			@Pc(66) int local66 = local22 - 1;
			@Pc(74) boolean local74 = (local22 & 0x1) == 0;
			@Pc(79) int local79 = this.anIntArray513[local22];
			@Pc(86) int local86 = this.anIntArray513[local22 - 1];
			if (local29 > this.anInt2580 + local86 && local79 - this.anInt2580 > local29) {
				for (@Pc(101) int local101 = 0; local101 < Static76.anInt1458; local101++) {
					@Pc(112) int local112 = local74 ? this.anInt2578 : -this.anInt2578;
					@Pc(114) int local114 = 0;
					@Pc(126) int local126;
					for (local126 = Static40.anIntArray173[local101] + (local112 * this.anInt2573 >> 12); local126 < 0; local126 += 4096) {
					}
					while (local126 > 4096) {
						local126 -= 4096;
					}
					while (this.anInt2579 > local114 && local126 >= this.anIntArrayArray20[local66][local114]) {
						local114++;
					}
					@Pc(159) int local159 = local114 - 1;
					@Pc(166) int local166 = this.anIntArrayArray20[local66][local114];
					@Pc(173) int local173 = this.anIntArrayArray20[local66][local159];
					if (this.anInt2580 + local173 < local126 && local166 - this.anInt2580 > local126) {
						local11[local101] = this.anIntArrayArray21[local66][local159];
					} else {
						local11[local101] = 0;
					}
				}
			} else {
				Static399.method2490(local11, 0, Static76.anInt1458, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "(I)V")
	@Override
	public void method5596() {
		this.method2467();
	}
}
