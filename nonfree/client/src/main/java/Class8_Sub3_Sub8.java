import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class8_Sub3_Sub8 extends Class8_Sub3 {

	@OriginalMember(owner = "client!dj", name = "L", descriptor = "I")
	private int anInt1178;

	@OriginalMember(owner = "client!dj", name = "M", descriptor = "[I")
	private int[] anIntArray82;

	@OriginalMember(owner = "client!dj", name = "W", descriptor = "I")
	private int anInt1187;

	@OriginalMember(owner = "client!dj", name = "cb", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!dj", name = "db", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!dj", name = "jb", descriptor = "I")
	private int anInt1198;

	@OriginalMember(owner = "client!dj", name = "Z", descriptor = "I")
	private int anInt1190 = 4;

	@OriginalMember(owner = "client!dj", name = "Q", descriptor = "I")
	private int anInt1182 = 204;

	@OriginalMember(owner = "client!dj", name = "ab", descriptor = "I")
	private int anInt1191 = 409;

	@OriginalMember(owner = "client!dj", name = "fb", descriptor = "I")
	private int anInt1194 = 1024;

	@OriginalMember(owner = "client!dj", name = "hb", descriptor = "I")
	private int anInt1196 = 0;

	@OriginalMember(owner = "client!dj", name = "gb", descriptor = "I")
	private int anInt1195 = 81;

	@OriginalMember(owner = "client!dj", name = "ib", descriptor = "I")
	private int anInt1197 = 1024;

	@OriginalMember(owner = "client!dj", name = "lb", descriptor = "I")
	private int anInt1200 = 8;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt1190 = arg1.method2334();
		} else if (arg0 == 1) {
			this.anInt1200 = arg1.method2334();
		} else if (arg0 == 2) {
			this.anInt1191 = arg1.method2375();
		} else if (arg0 == 3) {
			this.anInt1182 = arg1.method2375();
		} else if (arg0 == 4) {
			this.anInt1194 = arg1.method2375();
		} else if (arg0 == 5) {
			this.anInt1196 = arg1.method2375();
		} else if (arg0 == 6) {
			this.anInt1195 = arg1.method2375();
		} else if (arg0 == 7) {
			this.anInt1197 = arg1.method2375();
		}
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V")
	@Override
	public void method4220() {
		this.method868();
	}

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "(I)V")
	private void method868() {
		@Pc(12) Random local12 = new Random((long) this.anInt1200);
		this.anInt1187 = 4096 / this.anInt1200;
		this.anInt1178 = this.anInt1195 / 2;
		this.anInt1198 = 4096 / this.anInt1190;
		@Pc(35) int local35 = this.anInt1187 / 2;
		this.anIntArray82 = new int[this.anInt1200 + 1];
		@Pc(54) int local54 = this.anInt1198 / 2;
		this.anIntArrayArray6 = new int[this.anInt1200][this.anInt1190 + 1];
		this.anIntArrayArray5 = new int[this.anInt1200][this.anInt1190];
		this.anIntArray82[0] = 0;
		for (@Pc(77) int local77 = 0; local77 < this.anInt1200; local77++) {
			@Pc(93) int local93;
			@Pc(105) int local105;
			if (local77 > 0) {
				local93 = this.anInt1187;
				local105 = (Static293.method4280(4096, local12) - 2048) * this.anInt1182 >> 12;
				@Pc(113) int local113 = local93 + (local105 * local35 >> 12);
				this.anIntArray82[local77] = local113 + this.anIntArray82[local77 - 1];
			}
			this.anIntArrayArray6[local77][0] = 0;
			for (local93 = 0; local93 < this.anInt1190; local93++) {
				if (local93 > 0) {
					local105 = this.anInt1198;
					@Pc(157) int local157 = (Static293.method4280(4096, local12) - 2048) * this.anInt1191 >> 12;
					local105 += local157 * local54 >> 12;
					this.anIntArrayArray6[local77][local93] = this.anIntArrayArray6[local77][local93 - 1] + local105;
				}
				this.anIntArrayArray5[local77][local93] = this.anInt1197 > 0 ? 4096 - Static293.method4280(this.anInt1197, local12) : 4096;
			}
			this.anIntArrayArray6[local77][this.anInt1190] = 4096;
		}
		this.anIntArray82[this.anInt1200] = 4096;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = this.aClass59_41.method1366(arg0);
		if (this.aClass59_41.aBoolean131) {
			@Pc(24) int local24 = 0;
			@Pc(32) int local32;
			for (local32 = Static33.anIntArray50[arg0] + this.anInt1196; local32 < 0; local32 += 4096) {
			}
			while (local32 > 4096) {
				local32 -= 4096;
			}
			while (this.anInt1200 > local24 && local32 >= this.anIntArray82[local24]) {
				local24++;
			}
			@Pc(72) int local72 = this.anIntArray82[local24];
			@Pc(76) int local76 = local24 - 1;
			@Pc(83) int local83 = this.anIntArray82[local24 - 1];
			@Pc(92) boolean local92 = (local24 & 0x1) == 0;
			if (local32 > this.anInt1178 + local83 && local32 < local72 - this.anInt1178) {
				for (@Pc(113) int local113 = 0; local113 < Static239.anInt4789; local113++) {
					@Pc(122) int local122 = 0;
					@Pc(131) int local131 = local92 ? this.anInt1194 : -this.anInt1194;
					@Pc(142) int local142;
					for (local142 = (this.anInt1198 * local131 >> 12) + Static171.anIntArray258[local113]; local142 < 0; local142 += 4096) {
					}
					while (local142 > 4096) {
						local142 -= 4096;
					}
					while (this.anInt1190 > local122 && local142 >= this.anIntArrayArray6[local76][local122]) {
						local122++;
					}
					@Pc(178) int local178 = this.anIntArrayArray6[local76][local122];
					@Pc(182) int local182 = local122 - 1;
					@Pc(189) int local189 = this.anIntArrayArray6[local76][local182];
					if (local142 > this.anInt1178 + local189 && local142 < local178 - this.anInt1178) {
						local13[local113] = this.anIntArrayArray5[local76][local182];
					} else {
						local13[local113] = 0;
					}
				}
			} else {
				Static301.method500(local13, 0, Static239.anInt4789, 0);
			}
		}
		return local13;
	}
}
