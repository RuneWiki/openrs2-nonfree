import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public abstract class Class27 {

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "[S")
	private short[] aShortArray80;

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
	private int anInt5190 = 0;

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
	private int anInt5191 = 4;

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
	private int anInt5189 = 4;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
	protected int anInt5196 = 4;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
	private int anInt5195 = 4;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "[S")
	private final short[] aShortArray81 = new short[512];

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(IIIII)V")
	protected Class27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5195 = arg2;
		this.anInt5190 = arg0;
		this.anInt5191 = arg3;
		this.anInt5196 = arg1;
		this.anInt5189 = arg4;
		this.method4646();
		this.method4648();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
	protected abstract void method4643();

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	private void method4646() {
		this.aShortArray80 = new short[this.anInt5196];
		for (@Pc(12) int local12 = 0; local12 < this.anInt5196; local12++) {
			this.aShortArray80[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BIII)V")
	protected final void method4647() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		@Pc(14) int[] local14 = new int[16];
		for (@Pc(16) int local16 = 0; local16 < 128; local16++) {
			local8[local16] = (local16 << 12) / 128;
		}
		for (@Pc(38) int local38 = 0; local38 < 128; local38++) {
			local11[local38] = (local38 << 12) / 128;
		}
		for (@Pc(54) int local54 = 0; local54 < 16; local54++) {
			local14[local54] = (local54 << 12) / 16;
		}
		this.method4643();
		for (@Pc(73) int local73 = 0; local73 < 16; local73++) {
			for (@Pc(77) int local77 = 0; local77 < 128; local77++) {
				for (@Pc(81) int local81 = 0; local81 < 128; local81++) {
					for (@Pc(85) int local85 = 0; local85 < this.anInt5196; local85++) {
						@Pc(94) int local94 = this.aShortArray80[local85] << 12;
						@Pc(101) int local101 = local94 * this.anInt5191 >> 12;
						@Pc(109) int local109 = local14[local73] * local94 >> 12;
						@Pc(116) int local116 = this.anInt5189 * local94 >> 12;
						@Pc(124) int local124 = local94 * local11[local77] >> 12;
						@Pc(132) int local132 = local94 * local8[local81] >> 12;
						@Pc(139) int local139 = local94 * this.anInt5195 >> 12;
						@Pc(144) int local144 = local132 * this.anInt5195;
						@Pc(149) int local149 = local124 * this.anInt5191;
						@Pc(154) int local154 = local109 * this.anInt5189;
						@Pc(158) int local158 = local144 >> 12;
						@Pc(162) int local162 = local158 + 1;
						@Pc(166) int local166 = local158 & 0xFF;
						@Pc(170) int local170 = local149 >> 12;
						@Pc(174) int local174 = local170 + 1;
						@Pc(178) int local178 = local154 >> 12;
						@Pc(182) int local182 = local170 & 0xFF;
						@Pc(186) int local186 = local178 + 1;
						if (local174 < local101) {
							local174 &= 0xFF;
						} else {
							local174 = 0;
						}
						if (local186 >= local116) {
							local186 = 0;
						} else {
							local186 &= 0xFF;
						}
						local178 &= 0xFF;
						if (local139 <= local162) {
							local162 = 0;
						} else {
							local162 &= 0xFF;
						}
						local132 = local144 & 0xFFF;
						local124 = local149 & 0xFFF;
						local109 = local154 & 0xFFF;
						@Pc(243) int local243 = Class4.anIntArray8[local132];
						@Pc(247) int local247 = Class4.anIntArray8[local124];
						@Pc(251) int local251 = local124 - 4096;
						@Pc(255) int local255 = local109 - 4096;
						@Pc(259) int local259 = Class4.anIntArray8[local109];
						@Pc(264) short local264 = this.aShortArray81[local178];
						@Pc(269) short local269 = this.aShortArray81[local186];
						@Pc(273) int local273 = local132 - 4096;
						@Pc(281) short local281 = this.aShortArray81[local174 + local269];
						@Pc(289) short local289 = this.aShortArray81[local182 + local269];
						@Pc(296) short local296 = this.aShortArray81[local264 + local182];
						@Pc(303) short local303 = this.aShortArray81[local174 + local264];
						@Pc(315) int local315 = Static71.method1204(local132, local109, local124, this.aShortArray81[local166 + local296]);
						@Pc(328) int local328 = Static71.method1204(local273, local109, local124, this.aShortArray81[local162 + local296]);
						@Pc(340) int local340 = local315 + (local243 * (local328 - local315) >> 12);
						@Pc(352) int local352 = Static71.method1204(local132, local109, local251, this.aShortArray81[local166 + local303]);
						@Pc(364) int local364 = Static71.method1204(local273, local109, local251, this.aShortArray81[local162 + local303]);
						@Pc(375) int local375 = ((local364 - local352) * local243 >> 12) + local352;
						@Pc(387) int local387 = Static71.method1204(local132, local255, local124, this.aShortArray81[local289 + local166]);
						@Pc(397) int local397 = local340 + ((local375 - local340) * local247 >> 12);
						@Pc(409) int local409 = Static71.method1204(local273, local255, local124, this.aShortArray81[local289 + local162]);
						@Pc(420) int local420 = ((local409 - local387) * local243 >> 12) + local387;
						@Pc(432) int local432 = Static71.method1204(local132, local255, local251, this.aShortArray81[local166 + local281]);
						@Pc(445) int local445 = Static71.method1204(local273, local255, local251, this.aShortArray81[local162 + local281]);
						@Pc(456) int local456 = (local243 * (local445 - local432) >> 12) + local432;
						@Pc(466) int local466 = ((local456 - local420) * local247 >> 12) + local420;
						this.method4650(local85, ((local466 - local397) * local259 >> 12) + local397);
					}
					this.method4649();
				}
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
	private void method4648() {
		@Pc(12) Random local12 = new Random((long) this.anInt5190);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray81[local14] = (short) local14;
		}
		for (@Pc(33) int local33 = 0; local33 < 255; local33++) {
			@Pc(39) int local39 = 255 - local33;
			@Pc(44) int local44 = Static213.method3319(local12, local39);
			@Pc(49) short local49 = this.aShortArray81[local44];
			this.aShortArray81[local44] = this.aShortArray81[local39];
			this.aShortArray81[local39] = this.aShortArray81[local39 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
	protected abstract void method4649();

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BII)V")
	protected abstract void method4650(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
