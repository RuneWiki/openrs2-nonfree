import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class3_Sub1_Sub37 extends Class3_Sub1 {

	@OriginalMember(owner = "client!tm", name = "F", descriptor = "I")
	private int anInt8456 = 0;

	@OriginalMember(owner = "client!tm", name = "H", descriptor = "I")
	private int anInt8458 = 2000;

	@OriginalMember(owner = "client!tm", name = "P", descriptor = "I")
	private int anInt8463 = 0;

	@OriginalMember(owner = "client!tm", name = "M", descriptor = "I")
	private int anInt8460 = 16;

	@OriginalMember(owner = "client!tm", name = "T", descriptor = "I")
	private int anInt8467 = 4096;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7784(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass219_41.method5560(arg0);
		if (super.aClass219_41.aBoolean423) {
			@Pc(20) int local20 = this.anInt8467 >> 1;
			@Pc(25) int[][] local25 = super.aClass219_41.method5568();
			@Pc(32) Random local32 = new Random((long) this.anInt8456);
			for (@Pc(34) int local34 = 0; local34 < this.anInt8458; local34++) {
				@Pc(57) int local57 = this.anInt8467 > 0 ? this.anInt8463 + Static500.method7215(local32, this.anInt8467) - local20 : this.anInt8463;
				@Pc(63) int local63 = local57 >> 4 & 0xFF;
				@Pc(68) int local68 = Static500.method7215(local32, Static307.anInt4846);
				@Pc(73) int local73 = Static500.method7215(local32, Static397.anInt7340);
				@Pc(85) int local85 = local68 + (Static247.anIntArray452[local63] * this.anInt8460 >> 12);
				@Pc(96) int local96 = local73 + (Static226.anIntArray436[local63] * this.anInt8460 >> 12);
				@Pc(101) int local101 = local96 - local73;
				@Pc(106) int local106 = local85 - local68;
				if (local106 != 0 || local101 != 0) {
					if (local106 < 0) {
						local106 = -local106;
					}
					if (local101 < 0) {
						local101 = -local101;
					}
					@Pc(130) boolean local130 = local101 > local106;
					@Pc(134) int local134;
					@Pc(136) int local136;
					if (local130) {
						local134 = local68;
						local136 = local85;
						local68 = local73;
						local85 = local96;
						local73 = local134;
						local96 = local136;
					}
					if (local68 > local85) {
						local134 = local68;
						local68 = local85;
						local136 = local73;
						local85 = local134;
						local73 = local96;
						local96 = local136;
					}
					local134 = local73;
					local136 = local85 - local68;
					@Pc(175) int local175 = local96 - local73;
					@Pc(180) int local180 = -local136 / 2;
					@Pc(184) int local184 = 2048 / local136;
					@Pc(193) int local193 = 1024 - (Static500.method7215(local32, 4096) >> 2);
					@Pc(204) int local204 = local73 >= local96 ? -1 : 1;
					if (local175 < 0) {
						local175 = -local175;
					}
					for (@Pc(211) int local211 = local68; local211 < local85; local211++) {
						@Pc(224) int local224 = local184 * (local211 - local68) + local193 + 1024;
						@Pc(228) int local228 = local211 & Static324.anInt6207;
						@Pc(232) int local232 = Static485.anInt8693 & local134;
						if (local130) {
							local25[local232][local228] = local224;
						} else {
							local25[local228][local232] = local224;
						}
						local180 += local175;
						if (local180 > 0) {
							local180 += -local136;
							local134 += local204;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			this.anInt8456 = arg1.method7548();
		} else if (arg0 == 1) {
			this.anInt8458 = arg1.method7591();
		} else if (arg0 == 2) {
			this.anInt8460 = arg1.method7548();
		} else if (arg0 == 3) {
			this.anInt8463 = arg1.method7591();
		} else if (arg0 == 4) {
			this.anInt8467 = arg1.method7591();
		}
	}

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "(I)V")
	@Override
	public void method7786() {
		Static353.method5563();
	}
}
