import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qt")
public final class Class5_Sub1_Sub33 extends Class5_Sub1 {

	@OriginalMember(owner = "client!qt", name = "N", descriptor = "I")
	private int anInt5665 = 1;

	@OriginalMember(owner = "client!qt", name = "J", descriptor = "[S")
	private short[] aShortArray100 = new short[512];

	@OriginalMember(owner = "client!qt", name = "R", descriptor = "I")
	private int anInt5668 = 5;

	@OriginalMember(owner = "client!qt", name = "T", descriptor = "I")
	private int anInt5670 = 0;

	@OriginalMember(owner = "client!qt", name = "O", descriptor = "I")
	private int anInt5666 = 2;

	@OriginalMember(owner = "client!qt", name = "S", descriptor = "I")
	private int anInt5669 = 2048;

	@OriginalMember(owner = "client!qt", name = "X", descriptor = "I")
	private int anInt5673 = 5;

	@OriginalMember(owner = "client!qt", name = "U", descriptor = "[B")
	private byte[] aByteArray73 = new byte[512];

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5770(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass239_41.method5400(arg0);
		if (super.aClass239_41.aBoolean460) {
			@Pc(25) int local25 = Static346.anIntArray401[arg0] * this.anInt5673 + 2048;
			@Pc(29) int local29 = local25 >> 12;
			@Pc(33) int local33 = local29 + 1;
			for (@Pc(35) int local35 = 0; local35 < Static148.anInt2666; local35++) {
				Static449.anInt7375 = Integer.MAX_VALUE;
				Static206.anInt3421 = Integer.MAX_VALUE;
				Static75.anInt1384 = Integer.MAX_VALUE;
				Static299.anInt4664 = Integer.MAX_VALUE;
				@Pc(54) int local54 = Static224.anIntArray234[local35] * this.anInt5668 + 2048;
				@Pc(58) int local58 = local54 >> 12;
				@Pc(62) int local62 = local58 + 1;
				@Pc(147) int local147;
				for (@Pc(66) int local66 = local29 - 1; local66 <= local33; local66++) {
					@Pc(87) int local87 = this.aByteArray73[(this.anInt5673 > local66 ? local66 : local66 - this.anInt5673) & 0xFF] & 0xFF;
					for (@Pc(91) int local91 = local58 - 1; local91 <= local62; local91++) {
						@Pc(119) int local119 = (this.aByteArray73[local87 + (local91 < this.anInt5668 ? local91 : local91 - this.anInt5668) & 0xFF] & 0xFF) * 2;
						@Pc(124) int local124 = local54 - (local91 << 12);
						@Pc(128) int local128 = local119 + 1;
						@Pc(131) int local131 = local124 - this.aShortArray100[local119];
						@Pc(144) int local144 = local25 - (local66 << 12) - this.aShortArray100[local128];
						local147 = this.anInt5665;
						@Pc(177) int local177;
						if (local147 == 1) {
							local177 = local131 * local131 + local144 * local144 >> 12;
						} else if (local147 == 3) {
							local144 = local144 < 0 ? -local144 : local144;
							local131 = local131 < 0 ? -local131 : local131;
							local177 = local144 >= local131 ? local144 : local131;
						} else if (local147 == 4) {
							local131 = (int) (Math.sqrt((double) ((float) (local131 >= 0 ? local131 : -local131) / 4096.0F)) * 4096.0D);
							local144 = (int) (Math.sqrt((double) ((float) (local144 < 0 ? -local144 : local144) / 4096.0F)) * 4096.0D);
							local177 = local131 + local144;
							local177 = local177 * local177 >> 12;
						} else if (local147 == 5) {
							local144 *= local144;
							local131 *= local131;
							local177 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local144 + local131) / 1.6777216E7F))) * 4096.0D);
						} else if (local147 == 2) {
							local177 = (local131 < 0 ? -local131 : local131) + (local144 >= 0 ? local144 : -local144);
						} else {
							local177 = (int) (Math.sqrt((double) ((float) (local144 * local144 + local131 * local131) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static299.anInt4664 > local177) {
							Static449.anInt7375 = Static206.anInt3421;
							Static206.anInt3421 = Static75.anInt1384;
							Static75.anInt1384 = Static299.anInt4664;
							Static299.anInt4664 = local177;
						} else if (Static75.anInt1384 > local177) {
							Static449.anInt7375 = Static206.anInt3421;
							Static206.anInt3421 = Static75.anInt1384;
							Static75.anInt1384 = local177;
						} else if (Static206.anInt3421 > local177) {
							Static449.anInt7375 = Static206.anInt3421;
							Static206.anInt3421 = local177;
						} else if (Static449.anInt7375 > local177) {
							Static449.anInt7375 = local177;
						}
					}
				}
				local147 = this.anInt5666;
				if (local147 == 0) {
					local11[local35] = Static299.anInt4664;
				} else if (local147 == 1) {
					local11[local35] = Static75.anInt1384;
				} else if (local147 == 3) {
					local11[local35] = Static206.anInt3421;
				} else if (local147 == 4) {
					local11[local35] = Static449.anInt7375;
				} else if (local147 == 2) {
					local11[local35] = Static75.anInt1384 - Static299.anInt4664;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt5668 = this.anInt5673 = arg1.method5539();
		} else if (arg0 == 1) {
			this.anInt5670 = arg1.method5539();
		} else if (arg0 == 2) {
			this.anInt5669 = arg1.method5598();
		} else if (arg0 == 3) {
			this.anInt5666 = arg1.method5539();
		} else if (arg0 == 4) {
			this.anInt5665 = arg1.method5539();
		} else if (arg0 == 5) {
			this.anInt5668 = arg1.method5539();
		} else if (arg0 == 6) {
			this.anInt5673 = arg1.method5539();
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)V")
	@Override
	public void method5762() {
		this.aByteArray73 = Static215.method2846(this.anInt5670);
		this.method4498();
	}

	@OriginalMember(owner = "client!qt", name = "e", descriptor = "(B)V")
	private void method4498() {
		@Pc(12) Random local12 = new Random((long) this.anInt5670);
		this.aShortArray100 = new short[512];
		if (this.anInt5669 > 0) {
			for (@Pc(21) int local21 = 0; local21 < 512; local21++) {
				this.aShortArray100[local21] = (short) Static44.method700(this.anInt5669, local12);
			}
		}
	}
}
