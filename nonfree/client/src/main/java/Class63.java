import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vfa")
public abstract class Class63 {

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "[S")
	private short[] aShortArray131;

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "I")
	private int anInt7098 = 4;

	@OriginalMember(owner = "client!vfa", name = "c", descriptor = "I")
	private int anInt7099 = 4;

	@OriginalMember(owner = "client!vfa", name = "j", descriptor = "[S")
	private final short[] aShortArray133 = new short[512];

	@OriginalMember(owner = "client!vfa", name = "h", descriptor = "I")
	protected int anInt7103 = 4;

	@OriginalMember(owner = "client!vfa", name = "d", descriptor = "I")
	private int anInt7100 = 4;

	@OriginalMember(owner = "client!vfa", name = "l", descriptor = "I")
	private int anInt7105 = 0;

	@OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(IIIII)V")
	protected Class63(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt7105 = arg0;
		this.anInt7098 = arg2;
		this.anInt7100 = arg3;
		this.anInt7103 = arg1;
		this.anInt7099 = arg4;
		this.method5903();
		this.method5901();
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(B)V")
	private void method5901() {
		@Pc(12) Random local12 = new Random((long) this.anInt7105);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray133[local14] = (short) local14;
		}
		for (@Pc(37) int local37 = 0; local37 < 255; local37++) {
			@Pc(43) int local43 = 255 - local37;
			@Pc(48) int local48 = Static87.method2047(local43, local12);
			@Pc(53) short local53 = this.aShortArray133[local48];
			this.aShortArray133[local48] = this.aShortArray133[local43];
			this.aShortArray133[local43] = this.aShortArray133[local43 + 256] = local53;
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)V")
	protected abstract void method5902();

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "(I)V")
	private void method5903() {
		this.aShortArray131 = new short[this.anInt7103];
		for (@Pc(12) int local12 = 0; local12 < this.anInt7103; local12++) {
			this.aShortArray131[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!vfa", name = "c", descriptor = "(I)V")
	protected abstract void method5904();

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IZI)V")
	protected abstract void method5905(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IZII)V")
	protected final void method5906() {
		@Pc(14) int[] local14 = new int[128];
		@Pc(17) int[] local17 = new int[128];
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			local14[local19] = (local19 << 12) / 128;
		}
		@Pc(40) int[] local40 = new int[16];
		for (@Pc(42) int local42 = 0; local42 < 128; local42++) {
			local17[local42] = (local42 << 12) / 128;
		}
		for (@Pc(58) int local58 = 0; local58 < 16; local58++) {
			local40[local58] = (local58 << 12) / 16;
		}
		this.method5902();
		for (@Pc(81) int local81 = 0; local81 < 16; local81++) {
			for (@Pc(85) int local85 = 0; local85 < 128; local85++) {
				for (@Pc(89) int local89 = 0; local89 < 128; local89++) {
					for (@Pc(93) int local93 = 0; local93 < this.anInt7103; local93++) {
						@Pc(102) int local102 = this.aShortArray131[local93] << 12;
						@Pc(110) int local110 = local17[local85] * local102 >> 12;
						@Pc(118) int local118 = local102 * local14[local89] >> 12;
						@Pc(125) int local125 = local102 * this.anInt7099 >> 12;
						@Pc(133) int local133 = local40[local81] * local102 >> 12;
						@Pc(140) int local140 = local102 * this.anInt7100 >> 12;
						@Pc(147) int local147 = this.anInt7098 * local102 >> 12;
						@Pc(152) int local152 = local133 * this.anInt7099;
						@Pc(157) int local157 = local118 * this.anInt7098;
						@Pc(162) int local162 = local110 * this.anInt7100;
						@Pc(166) int local166 = local157 >> 12;
						@Pc(170) int local170 = local166 + 1;
						@Pc(174) int local174 = local166 & 0xFF;
						@Pc(178) int local178 = local162 >> 12;
						@Pc(182) int local182 = local178 + 1;
						@Pc(186) int local186 = local178 & 0xFF;
						@Pc(190) int local190 = local152 >> 12;
						@Pc(194) int local194 = local190 + 1;
						if (local194 < local125) {
							local194 &= 0xFF;
						} else {
							local194 = 0;
						}
						if (local147 <= local170) {
							local170 = 0;
						} else {
							local170 &= 0xFF;
						}
						local133 = local152 & 0xFFF;
						local118 = local157 & 0xFFF;
						local110 = local162 & 0xFFF;
						if (local182 < local140) {
							local182 &= 0xFF;
						} else {
							local182 = 0;
						}
						local190 &= 0xFF;
						@Pc(255) int local255 = Class131.anIntArray370[local110];
						@Pc(259) int local259 = Class131.anIntArray370[local118];
						@Pc(263) int local263 = local133 - 4096;
						@Pc(268) short local268 = this.aShortArray133[local194];
						@Pc(272) int local272 = local110 - 4096;
						@Pc(277) short local277 = this.aShortArray133[local190];
						@Pc(281) int local281 = Class131.anIntArray370[local133];
						@Pc(285) int local285 = local118 - 4096;
						@Pc(292) short local292 = this.aShortArray133[local182 + local268];
						@Pc(299) short local299 = this.aShortArray133[local277 + local186];
						@Pc(306) short local306 = this.aShortArray133[local268 + local186];
						@Pc(314) short local314 = this.aShortArray133[local182 + local277];
						@Pc(326) int local326 = Static261.method4301(local110, local133, local118, this.aShortArray133[local299 + local174]);
						@Pc(338) int local338 = Static261.method4301(local110, local133, local285, this.aShortArray133[local299 + local170]);
						@Pc(350) int local350 = local326 + (local259 * (local338 - local326) >> 12);
						@Pc(362) int local362 = Static261.method4301(local272, local133, local118, this.aShortArray133[local314 + local174]);
						@Pc(374) int local374 = Static261.method4301(local272, local133, local285, this.aShortArray133[local170 + local314]);
						@Pc(386) int local386 = local362 + ((local374 - local362) * local259 >> 12);
						@Pc(397) int local397 = local350 + ((local386 - local350) * local255 >> 12);
						@Pc(409) int local409 = Static261.method4301(local110, local263, local118, this.aShortArray133[local174 + local306]);
						@Pc(421) int local421 = Static261.method4301(local110, local263, local285, this.aShortArray133[local306 + local170]);
						@Pc(433) int local433 = local409 + (local259 * (local421 - local409) >> 12);
						@Pc(445) int local445 = Static261.method4301(local272, local263, local118, this.aShortArray133[local174 + local292]);
						@Pc(457) int local457 = Static261.method4301(local272, local263, local285, this.aShortArray133[local292 + local170]);
						@Pc(468) int local468 = local445 + (local259 * (local457 - local445) >> 12);
						@Pc(478) int local478 = ((local468 - local433) * local255 >> 12) + local433;
						this.method5905(local93, (local281 * (local478 - local397) >> 12) + local397);
					}
					this.method5904();
				}
			}
		}
	}
}
