import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public abstract class Class49 {

	@OriginalMember(owner = "client!ds", name = "h", descriptor = "[S")
	private short[] aShortArray84;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
	private int anInt4685 = 0;

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "[S")
	private final short[] aShortArray83 = new short[512];

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
	private int anInt4689 = 4;

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
	private int anInt4690 = 4;

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
	private int anInt4693 = 4;

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
	protected int anInt4694 = 4;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(IIIII)V")
	protected Class49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4685 = arg0;
		this.anInt4689 = arg4;
		this.anInt4694 = arg1;
		this.anInt4693 = arg2;
		this.anInt4690 = arg3;
		this.method4152();
		this.method4156();
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)V")
	protected abstract void method4151(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)V")
	private void method4152() {
		this.aShortArray84 = new short[this.anInt4694];
		for (@Pc(12) int local12 = 0; local12 < this.anInt4694; local12++) {
			this.aShortArray84[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
	protected abstract void method4153();

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(Z)V")
	protected abstract void method4154();

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)V")
	private void method4156() {
		@Pc(12) Random local12 = new Random((long) this.anInt4685);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray83[local14] = (short) local14;
		}
		for (@Pc(35) int local35 = 0; local35 < 255; local35++) {
			@Pc(42) int local42 = 255 - local35;
			@Pc(47) int local47 = Static331.method4885(local12, local42);
			@Pc(52) short local52 = this.aShortArray83[local47];
			this.aShortArray83[local47] = this.aShortArray83[local42];
			this.aShortArray83[local42] = this.aShortArray83[local42 + 256] = local52;
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIB)V")
	protected final void method4157() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		@Pc(14) int[] local14 = new int[16];
		for (@Pc(20) int local20 = 0; local20 < 128; local20++) {
			local8[local20] = (local20 << 12) / 128;
		}
		for (@Pc(36) int local36 = 0; local36 < 128; local36++) {
			local11[local36] = (local36 << 12) / 128;
		}
		for (@Pc(56) int local56 = 0; local56 < 16; local56++) {
			local14[local56] = (local56 << 12) / 16;
		}
		this.method4154();
		for (@Pc(75) int local75 = 0; local75 < 16; local75++) {
			for (@Pc(79) int local79 = 0; local79 < 128; local79++) {
				for (@Pc(83) int local83 = 0; local83 < 128; local83++) {
					for (@Pc(87) int local87 = 0; local87 < this.anInt4694; local87++) {
						@Pc(96) int local96 = this.aShortArray84[local87] << 12;
						@Pc(104) int local104 = local14[local75] * local96 >> 12;
						@Pc(111) int local111 = this.anInt4689 * local96 >> 12;
						@Pc(118) int local118 = this.anInt4693 * local96 >> 12;
						@Pc(125) int local125 = local96 * this.anInt4690 >> 12;
						@Pc(133) int local133 = local96 * local8[local83] >> 12;
						@Pc(141) int local141 = local96 * local11[local79] >> 12;
						@Pc(146) int local146 = local104 * this.anInt4689;
						@Pc(151) int local151 = local133 * this.anInt4693;
						@Pc(156) int local156 = local141 * this.anInt4690;
						@Pc(160) int local160 = local151 >> 12;
						@Pc(164) int local164 = local160 + 1;
						@Pc(168) int local168 = local156 >> 12;
						@Pc(172) int local172 = local160 & 0xFF;
						@Pc(176) int local176 = local168 + 1;
						@Pc(180) int local180 = local168 & 0xFF;
						@Pc(184) int local184 = local146 >> 12;
						@Pc(188) int local188 = local184 + 1;
						@Pc(192) int local192 = local156 & 0xFFF;
						if (local125 <= local176) {
							local176 = 0;
						} else {
							local176 &= 0xFF;
						}
						if (local188 < local111) {
							local188 &= 0xFF;
						} else {
							local188 = 0;
						}
						local133 = local151 & 0xFFF;
						if (local118 > local164) {
							local164 &= 0xFF;
						} else {
							local164 = 0;
						}
						local184 &= 0xFF;
						local104 = local146 & 0xFFF;
						@Pc(241) int local241 = Class142.anIntArray703[local104];
						@Pc(246) short local246 = this.aShortArray83[local184];
						@Pc(250) int local250 = local133 - 4096;
						@Pc(254) int local254 = Class142.anIntArray703[local192];
						@Pc(258) int local258 = local104 - 4096;
						@Pc(262) int local262 = Class142.anIntArray703[local133];
						@Pc(267) short local267 = this.aShortArray83[local188];
						@Pc(271) int local271 = local192 - 4096;
						@Pc(278) short local278 = this.aShortArray83[local267 + local180];
						@Pc(286) short local286 = this.aShortArray83[local176 + local246];
						@Pc(293) short local293 = this.aShortArray83[local246 + local180];
						@Pc(301) short local301 = this.aShortArray83[local176 + local267];
						@Pc(313) int local313 = Static23.method418(local104, local192, local133, this.aShortArray83[local293 + local172]);
						@Pc(328) int local328 = Static23.method418(local104, local192, local250, this.aShortArray83[local164 + local293]);
						@Pc(338) int local338 = (local262 * (local328 - local313) >> 12) + local313;
						@Pc(351) int local351 = Static23.method418(local104, local271, local133, this.aShortArray83[local172 + local286]);
						@Pc(363) int local363 = Static23.method418(local104, local271, local250, this.aShortArray83[local164 + local286]);
						@Pc(374) int local374 = local351 + ((local363 - local351) * local262 >> 12);
						@Pc(386) int local386 = Static23.method418(local258, local192, local133, this.aShortArray83[local278 + local172]);
						@Pc(397) int local397 = (local254 * (local374 - local338) >> 12) + local338;
						@Pc(409) int local409 = Static23.method418(local258, local192, local250, this.aShortArray83[local164 + local278]);
						@Pc(419) int local419 = ((local409 - local386) * local262 >> 12) + local386;
						@Pc(431) int local431 = Static23.method418(local258, local271, local133, this.aShortArray83[local301 + local172]);
						@Pc(443) int local443 = Static23.method418(local258, local271, local250, this.aShortArray83[local301 + local164]);
						@Pc(453) int local453 = (local262 * (local443 - local431) >> 12) + local431;
						@Pc(464) int local464 = local419 + ((local453 - local419) * local254 >> 12);
						this.method4151(local87, local397 + ((local464 - local397) * local241 >> 12));
					}
					this.method4153();
				}
			}
		}
	}
}
