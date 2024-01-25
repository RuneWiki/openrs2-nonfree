import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class3_Sub1_Sub5 extends Class3_Sub1 {

	@OriginalMember(owner = "client!cr", name = "E", descriptor = "I")
	private int anInt1540;

	@OriginalMember(owner = "client!cr", name = "F", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!cr", name = "K", descriptor = "I")
	private int anInt1544;

	@OriginalMember(owner = "client!cr", name = "O", descriptor = "[I")
	private int[] anIntArray181;

	@OriginalMember(owner = "client!cr", name = "R", descriptor = "I")
	private int anInt1549;

	@OriginalMember(owner = "client!cr", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!cr", name = "I", descriptor = "I")
	private int anInt1543 = 0;

	@OriginalMember(owner = "client!cr", name = "Q", descriptor = "I")
	private int anInt1548 = 409;

	@OriginalMember(owner = "client!cr", name = "W", descriptor = "I")
	private int anInt1552 = 8;

	@OriginalMember(owner = "client!cr", name = "U", descriptor = "I")
	private int anInt1551 = 4;

	@OriginalMember(owner = "client!cr", name = "P", descriptor = "I")
	private int anInt1547 = 1024;

	@OriginalMember(owner = "client!cr", name = "Y", descriptor = "I")
	private int anInt1554 = 1024;

	@OriginalMember(owner = "client!cr", name = "Z", descriptor = "I")
	private int anInt1555 = 204;

	@OriginalMember(owner = "client!cr", name = "ab", descriptor = "I")
	private int anInt1556 = 81;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			this.anInt1551 = arg1.method7548();
		} else if (arg0 == 1) {
			this.anInt1552 = arg1.method7548();
		} else if (arg0 == 2) {
			this.anInt1548 = arg1.method7591();
		} else if (arg0 == 3) {
			this.anInt1555 = arg1.method7591();
		} else if (arg0 == 4) {
			this.anInt1547 = arg1.method7591();
		} else if (arg0 == 5) {
			this.anInt1543 = arg1.method7591();
		} else if (arg0 == 6) {
			this.anInt1556 = arg1.method7591();
		} else if (arg0 == 7) {
			this.anInt1554 = arg1.method7591();
		}
	}

	@OriginalMember(owner = "client!cr", name = "f", descriptor = "(I)V")
	@Override
	public void method7786() {
		this.method1408();
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7784(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass219_41.method5560(arg0);
		if (super.aClass219_41.aBoolean423) {
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			for (local29 = this.anInt1543 + Static402.anIntArray741[arg0]; local29 < 0; local29 += 4096) {
			}
			while (local29 > 4096) {
				local29 -= 4096;
			}
			while (this.anInt1552 > local22 && this.anIntArray181[local22] <= local29) {
				local22++;
			}
			@Pc(63) int local63 = local22 - 1;
			@Pc(71) boolean local71 = (local22 & 0x1) == 0;
			@Pc(76) int local76 = this.anIntArray181[local22];
			@Pc(83) int local83 = this.anIntArray181[local22 - 1];
			if (this.anInt1544 + local83 < local29 && local76 - this.anInt1544 > local29) {
				for (@Pc(97) int local97 = 0; local97 < Static307.anInt4846; local97++) {
					@Pc(108) int local108 = local71 ? this.anInt1547 : -this.anInt1547;
					@Pc(110) int local110 = 0;
					@Pc(121) int local121;
					for (local121 = Static241.anIntArray759[local97] + (local108 * this.anInt1549 >> 12); local121 < 0; local121 += 4096) {
					}
					while (local121 > 4096) {
						local121 -= 4096;
					}
					while (local110 < this.anInt1551 && this.anIntArrayArray25[local63][local110] <= local121) {
						local110++;
					}
					@Pc(157) int local157 = local110 - 1;
					@Pc(164) int local164 = this.anIntArrayArray25[local63][local110];
					@Pc(171) int local171 = this.anIntArrayArray25[local63][local157];
					if (local121 > this.anInt1544 + local171 && local121 < local164 - this.anInt1544) {
						local16[local97] = this.anIntArrayArray26[local63][local157];
					} else {
						local16[local97] = 0;
					}
				}
			} else {
				Static559.method5958(local16, 0, Static307.anInt4846, 0);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(B)V")
	private void method1408() {
		@Pc(12) Random local12 = new Random((long) this.anInt1552);
		this.anInt1540 = 4096 / this.anInt1552;
		this.anInt1544 = this.anInt1556 / 2;
		this.anInt1549 = 4096 / this.anInt1551;
		@Pc(41) int local41 = this.anInt1549 / 2;
		this.anIntArrayArray25 = new int[this.anInt1552][this.anInt1551 + 1];
		this.anIntArrayArray26 = new int[this.anInt1552][this.anInt1551];
		this.anIntArray181 = new int[this.anInt1552 + 1];
		@Pc(69) int local69 = this.anInt1540 / 2;
		this.anIntArray181[0] = 0;
		for (@Pc(76) int local76 = 0; local76 < this.anInt1552; local76++) {
			@Pc(86) int local86;
			@Pc(98) int local98;
			if (local76 > 0) {
				local86 = this.anInt1540;
				local98 = (Static500.method7215(local12, 4096) - 2048) * this.anInt1555 >> 12;
				@Pc(106) int local106 = local86 + (local69 * local98 >> 12);
				this.anIntArray181[local76] = this.anIntArray181[local76 - 1] + local106;
			}
			this.anIntArrayArray25[local76][0] = 0;
			for (local86 = 0; local86 < this.anInt1551; local86++) {
				if (local86 > 0) {
					local98 = this.anInt1549;
					@Pc(147) int local147 = (Static500.method7215(local12, 4096) - 2048) * this.anInt1548 >> 12;
					local98 += local41 * local147 >> 12;
					this.anIntArrayArray25[local76][local86] = this.anIntArrayArray25[local76][local86 - 1] + local98;
				}
				this.anIntArrayArray26[local76][local86] = this.anInt1554 <= 0 ? 4096 : 4096 - Static500.method7215(local12, this.anInt1554);
			}
			this.anIntArrayArray25[local76][this.anInt1551] = 4096;
		}
		this.anIntArray181[this.anInt1552] = 4096;
	}
}
