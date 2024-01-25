import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cda")
public abstract class Class8 {

	@OriginalMember(owner = "client!cda", name = "c", descriptor = "[S")
	private short[] aShortArray135;

	@OriginalMember(owner = "client!cda", name = "h", descriptor = "I")
	private int anInt8670 = 0;

	@OriginalMember(owner = "client!cda", name = "i", descriptor = "I")
	private int anInt8671 = 4;

	@OriginalMember(owner = "client!cda", name = "j", descriptor = "[S")
	private final short[] aShortArray134 = new short[512];

	@OriginalMember(owner = "client!cda", name = "d", descriptor = "I")
	private int anInt8675 = 4;

	@OriginalMember(owner = "client!cda", name = "e", descriptor = "I")
	private int anInt8674 = 4;

	@OriginalMember(owner = "client!cda", name = "k", descriptor = "I")
	protected int anInt8676 = 4;

	@OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(IIIII)V")
	protected Class8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt8675 = arg4;
		this.anInt8676 = arg1;
		this.anInt8674 = arg3;
		this.anInt8671 = arg2;
		this.anInt8670 = arg0;
		this.method7600();
		this.method7602();
	}

	@OriginalMember(owner = "client!cda", name = "c", descriptor = "(I)V")
	protected abstract void method7597();

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(BIII)V")
	protected final void method7598() {
		@Pc(16) int[] local16 = new int[128];
		@Pc(19) int[] local19 = new int[128];
		@Pc(22) int[] local22 = new int[16];
		for (@Pc(24) int local24 = 0; local24 < 128; local24++) {
			local16[local24] = (local24 << 12) / 128;
		}
		for (@Pc(46) int local46 = 0; local46 < 128; local46++) {
			local19[local46] = (local46 << 12) / 128;
		}
		for (@Pc(70) int local70 = 0; local70 < 16; local70++) {
			local22[local70] = (local70 << 12) / 16;
		}
		this.method7597();
		for (@Pc(97) int local97 = 0; local97 < 16; local97++) {
			for (@Pc(103) int local103 = 0; local103 < 128; local103++) {
				for (@Pc(107) int local107 = 0; local107 < 128; local107++) {
					for (@Pc(111) int local111 = 0; local111 < this.anInt8676; local111++) {
						@Pc(122) int local122 = this.aShortArray135[local111] << 12;
						@Pc(129) int local129 = this.anInt8671 * local122 >> 12;
						@Pc(137) int local137 = local22[local97] * local122 >> 12;
						@Pc(144) int local144 = this.anInt8674 * local122 >> 12;
						@Pc(152) int local152 = local16[local107] * local122 >> 12;
						@Pc(160) int local160 = local19[local103] * local122 >> 12;
						@Pc(167) int local167 = local122 * this.anInt8675 >> 12;
						@Pc(172) int local172 = local160 * this.anInt8674;
						@Pc(177) int local177 = local137 * this.anInt8675;
						@Pc(182) int local182 = local152 * this.anInt8671;
						@Pc(186) int local186 = local182 >> 12;
						@Pc(190) int local190 = local186 + 1;
						@Pc(194) int local194 = local172 >> 12;
						@Pc(198) int local198 = local186 & 0xFF;
						@Pc(202) int local202 = local194 + 1;
						@Pc(206) int local206 = local194 & 0xFF;
						@Pc(210) int local210 = local177 >> 12;
						@Pc(214) int local214 = local210 + 1;
						@Pc(218) int local218 = local210 & 0xFF;
						if (local144 <= local202) {
							local202 = 0;
						} else {
							local202 &= 0xFF;
						}
						if (local167 > local214) {
							local214 &= 0xFF;
						} else {
							local214 = 0;
						}
						local137 = local177 & 0xFFF;
						local160 = local172 & 0xFFF;
						local152 = local182 & 0xFFF;
						if (local129 <= local190) {
							local190 = 0;
						} else {
							local190 &= 0xFF;
						}
						@Pc(275) int local275 = Class100.anIntArray137[local152];
						@Pc(279) int local279 = local152 - 4096;
						@Pc(284) short local284 = this.aShortArray134[local218];
						@Pc(288) int local288 = Class100.anIntArray137[local160];
						@Pc(293) short local293 = this.aShortArray134[local214];
						@Pc(297) int local297 = Class100.anIntArray137[local137];
						@Pc(301) int local301 = local137 - 4096;
						@Pc(305) int local305 = local160 - 4096;
						@Pc(312) short local312 = this.aShortArray134[local206 + local293];
						@Pc(320) short local320 = this.aShortArray134[local206 + local284];
						@Pc(327) short local327 = this.aShortArray134[local293 + local202];
						@Pc(334) short local334 = this.aShortArray134[local284 + local202];
						@Pc(346) int local346 = Static152.method2979(this.aShortArray134[local198 + local320], local160, local137, local152);
						@Pc(358) int local358 = Static152.method2979(this.aShortArray134[local320 + local190], local160, local137, local279);
						@Pc(370) int local370 = local346 + ((local358 - local346) * local275 >> 12);
						@Pc(382) int local382 = Static152.method2979(this.aShortArray134[local198 + local334], local305, local137, local152);
						@Pc(394) int local394 = Static152.method2979(this.aShortArray134[local334 + local190], local305, local137, local279);
						@Pc(405) int local405 = ((local394 - local382) * local275 >> 12) + local382;
						@Pc(417) int local417 = Static152.method2979(this.aShortArray134[local312 + local198], local160, local301, local152);
						@Pc(427) int local427 = ((local405 - local370) * local288 >> 12) + local370;
						@Pc(439) int local439 = Static152.method2979(this.aShortArray134[local190 + local312], local160, local301, local279);
						@Pc(450) int local450 = local417 + (local275 * (local439 - local417) >> 12);
						@Pc(463) int local463 = Static152.method2979(this.aShortArray134[local198 + local327], local305, local301, local152);
						@Pc(475) int local475 = Static152.method2979(this.aShortArray134[local327 + local190], local305, local301, local279);
						@Pc(487) int local487 = local463 + (local275 * (local475 - local463) >> 12);
						@Pc(498) int local498 = local450 + (local288 * (local487 - local450) >> 12);
						this.method7599(local111, ((local498 - local427) * local297 >> 12) + local427);
					}
					this.method7601();
				}
			}
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(III)V")
	protected abstract void method7599(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V")
	private void method7600() {
		this.aShortArray135 = new short[this.anInt8676];
		for (@Pc(12) int local12 = 0; local12 < this.anInt8676; local12++) {
			this.aShortArray135[local12] = (short) (int) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)V")
	protected abstract void method7601();

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "(I)V")
	private void method7602() {
		@Pc(12) Random local12 = new Random((long) this.anInt8670);
		for (@Pc(22) int local22 = 0; local22 < 255; local22++) {
			this.aShortArray134[local22] = (short) local22;
		}
		for (@Pc(38) int local38 = 0; local38 < 255; local38++) {
			@Pc(47) int local47 = 255 - local38;
			@Pc(52) int local52 = Static196.method3692(local12, local47);
			@Pc(57) short local57 = this.aShortArray134[local52];
			this.aShortArray134[local52] = this.aShortArray134[local47];
			this.aShortArray134[local47] = this.aShortArray134[local47 + 256] = local57;
		}
	}
}
