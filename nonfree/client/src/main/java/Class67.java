import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public abstract class Class67 {

	@OriginalMember(owner = "client!le", name = "e", descriptor = "[S")
	private short[] aShortArray82;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "I")
	private int anInt5867 = 4;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "I")
	private int anInt5868 = 0;

	@OriginalMember(owner = "client!le", name = "i", descriptor = "I")
	private int anInt5870 = 4;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "[S")
	private final short[] aShortArray83 = new short[512];

	@OriginalMember(owner = "client!le", name = "j", descriptor = "I")
	protected int anInt5871 = 4;

	@OriginalMember(owner = "client!le", name = "m", descriptor = "I")
	private int anInt5873 = 4;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(IIIII)V")
	protected Class67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5873 = arg4;
		this.anInt5868 = arg0;
		this.anInt5871 = arg1;
		this.anInt5870 = arg3;
		this.anInt5867 = arg2;
		this.method4683();
		this.method4685();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	protected abstract void method4678();

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZIII)V")
	protected final void method4680() {
		@Pc(12) int[] local12 = new int[128];
		@Pc(15) int[] local15 = new int[128];
		@Pc(18) int[] local18 = new int[16];
		for (@Pc(20) int local20 = 0; local20 < 128; local20++) {
			local12[local20] = (local20 << 12) / 128;
		}
		for (@Pc(35) int local35 = 0; local35 < 128; local35++) {
			local15[local35] = (local35 << 12) / 128;
		}
		for (@Pc(50) int local50 = 0; local50 < 16; local50++) {
			local18[local50] = (local50 << 12) / 16;
		}
		this.method4678();
		for (@Pc(72) int local72 = 0; local72 < 16; local72++) {
			for (@Pc(75) int local75 = 0; local75 < 128; local75++) {
				for (@Pc(78) int local78 = 0; local78 < 128; local78++) {
					for (@Pc(81) int local81 = 0; local81 < this.anInt5871; local81++) {
						@Pc(89) int local89 = this.aShortArray82[local81] << 12;
						@Pc(97) int local97 = local18[local72] * local89 >> 12;
						@Pc(104) int local104 = this.anInt5873 * local89 >> 12;
						@Pc(112) int local112 = local89 * local15[local75] >> 12;
						@Pc(119) int local119 = this.anInt5867 * local89 >> 12;
						@Pc(127) int local127 = local89 * local12[local78] >> 12;
						@Pc(134) int local134 = local89 * this.anInt5870 >> 12;
						@Pc(139) int local139 = local112 * this.anInt5870;
						@Pc(144) int local144 = local97 * this.anInt5873;
						@Pc(149) int local149 = local127 * this.anInt5867;
						@Pc(153) int local153 = local149 >> 12;
						@Pc(157) int local157 = local153 + 1;
						@Pc(161) int local161 = local153 & 0xFF;
						@Pc(165) int local165 = local139 >> 12;
						@Pc(169) int local169 = local165 + 1;
						@Pc(173) int local173 = local165 & 0xFF;
						@Pc(177) int local177 = local144 >> 12;
						@Pc(181) int local181 = local177 + 1;
						@Pc(185) int local185 = local149 & 0xFFF;
						if (local134 > local169) {
							local169 &= 0xFF;
						} else {
							local169 = 0;
						}
						local97 = local144 & 0xFFF;
						local177 &= 0xFF;
						if (local181 >= local104) {
							local181 = 0;
						} else {
							local181 &= 0xFF;
						}
						local112 = local139 & 0xFFF;
						if (local157 >= local119) {
							local157 = 0;
						} else {
							local157 &= 0xFF;
						}
						@Pc(231) int local231 = Class80.anIntArray219[local185];
						@Pc(236) short local236 = this.aShortArray83[local177];
						@Pc(240) int local240 = Class80.anIntArray219[local112];
						@Pc(244) int local244 = Class80.anIntArray219[local97];
						@Pc(249) short local249 = this.aShortArray83[local181];
						@Pc(253) int local253 = local185 - 4096;
						@Pc(257) int local257 = local112 - 4096;
						@Pc(261) int local261 = local97 - 4096;
						@Pc(268) short local268 = this.aShortArray83[local249 + local173];
						@Pc(275) short local275 = this.aShortArray83[local236 + local169];
						@Pc(282) short local282 = this.aShortArray83[local236 + local173];
						@Pc(289) short local289 = this.aShortArray83[local169 + local249];
						@Pc(305) int local305 = Static17.method514(local185, this.aShortArray83[local282 + local161], local97, local112);
						@Pc(317) int local317 = Static17.method514(local253, this.aShortArray83[local282 + local157], local97, local112);
						@Pc(329) int local329 = local305 + (local231 * (local317 - local305) >> 12);
						@Pc(341) int local341 = Static17.method514(local185, this.aShortArray83[local161 + local275], local97, local257);
						@Pc(354) int local354 = Static17.method514(local253, this.aShortArray83[local157 + local275], local97, local257);
						@Pc(365) int local365 = local341 + (local231 * (local354 - local341) >> 12);
						@Pc(377) int local377 = Static17.method514(local185, this.aShortArray83[local268 + local161], local261, local112);
						@Pc(388) int local388 = (local240 * (local365 - local329) >> 12) + local329;
						@Pc(400) int local400 = Static17.method514(local253, this.aShortArray83[local157 + local268], local261, local112);
						@Pc(411) int local411 = local377 + ((local400 - local377) * local231 >> 12);
						@Pc(423) int local423 = Static17.method514(local185, this.aShortArray83[local161 + local289], local261, local257);
						@Pc(435) int local435 = Static17.method514(local253, this.aShortArray83[local289 + local157], local261, local257);
						@Pc(447) int local447 = local423 + ((local435 - local423) * local231 >> 12);
						@Pc(458) int local458 = (local240 * (local447 - local411) >> 12) + local411;
						this.method4682(local81, (local244 * (local458 - local388) >> 12) + local388);
					}
					this.method4684();
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(III)V")
	protected abstract void method4682(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(B)V")
	private void method4683() {
		this.aShortArray82 = new short[this.anInt5871];
		for (@Pc(10) int local10 = 0; local10 < this.anInt5871; local10++) {
			this.aShortArray82[local10] = (short) Math.pow(2.0D, (double) local10);
		}
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
	protected abstract void method4684();

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V")
	private void method4685() {
		@Pc(10) Random local10 = new Random((long) this.anInt5868);
		for (@Pc(12) int local12 = 0; local12 < 255; local12++) {
			this.aShortArray83[local12] = (short) local12;
		}
		for (@Pc(33) int local33 = 0; local33 < 255; local33++) {
			@Pc(39) int local39 = 255 - local33;
			@Pc(44) int local44 = Static36.method851(local10, local39);
			@Pc(49) short local49 = this.aShortArray83[local44];
			this.aShortArray83[local44] = this.aShortArray83[local39];
			this.aShortArray83[local39] = this.aShortArray83[local39 + 256] = local49;
		}
	}
}
