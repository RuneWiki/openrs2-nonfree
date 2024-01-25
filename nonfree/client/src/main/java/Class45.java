import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public abstract class Class45 {

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "[S")
	private short[] aShortArray150;

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "[S")
	private final short[] aShortArray149 = new short[512];

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
	private int anInt8584 = 0;

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
	private int anInt8587 = 4;

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
	private int anInt8589 = 4;

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
	private int anInt8590 = 4;

	@OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
	protected int anInt8592 = 4;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(IIIII)V")
	protected Class45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt8584 = arg0;
		this.anInt8589 = arg4;
		this.anInt8590 = arg3;
		this.anInt8592 = arg1;
		this.anInt8587 = arg2;
		this.method7177();
		this.method7176();
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
	protected abstract void method7170();

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V")
	protected abstract void method7173();

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V")
	private void method7176() {
		@Pc(12) Random local12 = new Random((long) this.anInt8584);
		for (@Pc(20) int local20 = 0; local20 < 255; local20++) {
			this.aShortArray149[local20] = (short) local20;
		}
		for (@Pc(34) int local34 = 0; local34 < 255; local34++) {
			@Pc(41) int local41 = 255 - local34;
			@Pc(46) int local46 = Static326.method5252(local12, local41);
			@Pc(51) short local51 = this.aShortArray149[local46];
			this.aShortArray149[local46] = this.aShortArray149[local41];
			this.aShortArray149[local41] = this.aShortArray149[local41 + 256] = local51;
		}
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V")
	private void method7177() {
		this.aShortArray150 = new short[this.anInt8592];
		for (@Pc(12) int local12 = 0; local12 < this.anInt8592; local12++) {
			this.aShortArray150[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BIII)V")
	protected final void method7178() {
		@Pc(12) int[] local12 = new int[128];
		@Pc(15) int[] local15 = new int[128];
		@Pc(18) int[] local18 = new int[16];
		for (@Pc(20) int local20 = 0; local20 < 128; local20++) {
			local12[local20] = (local20 << 12) / 128;
		}
		for (@Pc(36) int local36 = 0; local36 < 128; local36++) {
			local15[local36] = (local36 << 12) / 128;
		}
		for (@Pc(52) int local52 = 0; local52 < 16; local52++) {
			local18[local52] = (local52 << 12) / 16;
		}
		this.method7173();
		for (@Pc(71) int local71 = 0; local71 < 16; local71++) {
			for (@Pc(75) int local75 = 0; local75 < 128; local75++) {
				for (@Pc(79) int local79 = 0; local79 < 128; local79++) {
					for (@Pc(83) int local83 = 0; local83 < this.anInt8592; local83++) {
						@Pc(92) int local92 = this.aShortArray150[local83] << 12;
						@Pc(99) int local99 = this.anInt8589 * local92 >> 12;
						@Pc(107) int local107 = local15[local75] * local92 >> 12;
						@Pc(114) int local114 = local92 * this.anInt8587 >> 12;
						@Pc(122) int local122 = local12[local79] * local92 >> 12;
						@Pc(130) int local130 = local18[local71] * local92 >> 12;
						@Pc(137) int local137 = local92 * this.anInt8590 >> 12;
						@Pc(142) int local142 = local130 * this.anInt8589;
						@Pc(147) int local147 = local107 * this.anInt8590;
						@Pc(152) int local152 = local122 * this.anInt8587;
						@Pc(156) int local156 = local152 >> 12;
						@Pc(160) int local160 = local156 + 1;
						@Pc(164) int local164 = local147 >> 12;
						@Pc(168) int local168 = local156 & 0xFF;
						@Pc(172) int local172 = local164 + 1;
						@Pc(176) int local176 = local142 >> 12;
						@Pc(180) int local180 = local164 & 0xFF;
						@Pc(184) int local184 = local176 + 1;
						@Pc(188) int local188 = local176 & 0xFF;
						if (local184 >= local99) {
							local184 = 0;
						} else {
							local184 &= 0xFF;
						}
						local122 = local152 & 0xFFF;
						local130 = local142 & 0xFFF;
						if (local160 < local114) {
							local160 &= 0xFF;
						} else {
							local160 = 0;
						}
						local107 = local147 & 0xFFF;
						if (local172 >= local137) {
							local172 = 0;
						} else {
							local172 &= 0xFF;
						}
						@Pc(241) int local241 = local122 - 4096;
						@Pc(246) short local246 = this.aShortArray149[local188];
						@Pc(250) int local250 = Class242.anIntArray503[local130];
						@Pc(255) short local255 = this.aShortArray149[local184];
						@Pc(259) int local259 = Class242.anIntArray503[local107];
						@Pc(263) int local263 = local107 - 4096;
						@Pc(267) int local267 = Class242.anIntArray503[local122];
						@Pc(271) int local271 = local130 - 4096;
						@Pc(279) short local279 = this.aShortArray149[local180 + local246];
						@Pc(287) short local287 = this.aShortArray149[local172 + local255];
						@Pc(295) short local295 = this.aShortArray149[local180 + local255];
						@Pc(302) short local302 = this.aShortArray149[local172 + local246];
						@Pc(315) int local315 = Static495.method7437(this.aShortArray149[local168 + local279], local107, local122, local130);
						@Pc(329) int local329 = Static495.method7437(this.aShortArray149[local279 + local160], local107, local241, local130);
						@Pc(340) int local340 = ((local329 - local315) * local267 >> 12) + local315;
						@Pc(352) int local352 = Static495.method7437(this.aShortArray149[local302 + local168], local263, local122, local130);
						@Pc(364) int local364 = Static495.method7437(this.aShortArray149[local302 + local160], local263, local241, local130);
						@Pc(375) int local375 = local352 + ((local364 - local352) * local267 >> 12);
						@Pc(386) int local386 = (local259 * (local375 - local340) >> 12) + local340;
						@Pc(398) int local398 = Static495.method7437(this.aShortArray149[local295 + local168], local107, local122, local271);
						@Pc(410) int local410 = Static495.method7437(this.aShortArray149[local295 + local160], local107, local241, local271);
						@Pc(421) int local421 = (local267 * (local410 - local398) >> 12) + local398;
						@Pc(433) int local433 = Static495.method7437(this.aShortArray149[local168 + local287], local263, local122, local271);
						@Pc(445) int local445 = Static495.method7437(this.aShortArray149[local287 + local160], local263, local241, local271);
						@Pc(456) int local456 = local433 + (local267 * (local445 - local433) >> 12);
						@Pc(466) int local466 = local421 + ((local456 - local421) * local259 >> 12);
						this.method7179((local250 * (local466 - local386) >> 12) + local386, local83);
					}
					this.method7170();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)V")
	protected abstract void method7179(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
