import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class3_Sub1_Sub28 extends Class3_Sub1 {

	@OriginalMember(owner = "client!pf", name = "V", descriptor = "I")
	private int anInt3002;

	@OriginalMember(owner = "client!pf", name = "X", descriptor = "I")
	private int anInt3004;

	@OriginalMember(owner = "client!pf", name = "S", descriptor = "I")
	private int anInt3000;

	@OriginalMember(owner = "client!pf", name = "M", descriptor = "I")
	private int anInt2995;

	@OriginalMember(owner = "client!pf", name = "db", descriptor = "I")
	private int anInt3008;

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)V")
	@Override
	public void method2916() {
		Static6.method99();
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt3002 = arg1.method191();
		} else if (arg0 == 1) {
			this.anInt3004 = arg1.method208();
		} else if (arg0 == 2) {
			this.anInt3008 = arg1.method191();
		} else if (arg0 == 3) {
			this.anInt2995 = arg1.method208();
		} else if (arg0 == 4) {
			this.anInt3000 = arg1.method208();
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method2911(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass82_39.method2720(arg0);
		if (super.aClass82_39.aBoolean160) {
			@Pc(20) int local20 = this.anInt3000 >> 1;
			@Pc(25) int[][] local25 = super.aClass82_39.method2719();
			@Pc(32) Random local32 = new Random((long) this.anInt3002);
			for (@Pc(34) int local34 = 0; local34 < this.anInt3004; local34++) {
				@Pc(54) int local54 = this.anInt3000 > 0 ? this.anInt2995 + Static54.method1020(this.anInt3000, local32) - local20 : this.anInt2995;
				@Pc(60) int local60 = local54 >> 4 & 0xFF;
				@Pc(65) int local65 = Static54.method1020(Static141.anInt3261, local32);
				@Pc(70) int local70 = Static54.method1020(Static141.anInt3259, local32);
				@Pc(81) int local81 = (this.anInt3008 * Static113.anIntArray218[local60] >> 12) + local70;
				@Pc(93) int local93 = local65 + (this.anInt3008 * Static25.anIntArray445[local60] >> 12);
				@Pc(98) int local98 = local81 - local70;
				@Pc(103) int local103 = local93 - local65;
				if (local103 != 0 || local98 != 0) {
					if (local103 < 0) {
						local103 = -local103;
					}
					if (local98 < 0) {
						local98 = -local98;
					}
					@Pc(133) boolean local133 = local103 < local98;
					@Pc(137) int local137;
					@Pc(139) int local139;
					if (local133) {
						local137 = local65;
						local139 = local93;
						local93 = local81;
						local81 = local139;
						local65 = local70;
						local70 = local137;
					}
					if (local65 > local93) {
						local137 = local65;
						local65 = local93;
						local139 = local70;
						local93 = local137;
						local70 = local81;
						local81 = local139;
					}
					local139 = local93 - local65;
					local137 = local70;
					@Pc(177) int local177 = 2048 / local139;
					@Pc(188) int local188 = local81 <= local70 ? -1 : 1;
					@Pc(193) int local193 = local81 - local70;
					@Pc(198) int local198 = -local139 / 2;
					if (local193 < 0) {
						local193 = -local193;
					}
					@Pc(213) int local213 = 1024 - (Static54.method1020(4096, local32) >> 2);
					for (@Pc(215) int local215 = local65; local215 < local93; local215++) {
						local198 += local193;
						@Pc(232) int local232 = (local215 - local65) * local177 + local213 + 1024;
						@Pc(236) int local236 = Static67.anInt1764 & local215;
						@Pc(240) int local240 = Static169.anInt3754 & local137;
						if (local198 > 0) {
							local198 += -local139;
							local137 += local188;
						}
						if (local133) {
							local25[local240][local236] = local232;
						} else {
							local25[local236][local240] = local232;
						}
					}
				}
			}
		}
		return local7;
	}
}
