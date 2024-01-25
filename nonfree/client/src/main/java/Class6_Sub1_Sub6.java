import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class6_Sub1_Sub6 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ch", name = "M", descriptor = "I")
	private int anInt749 = 0;

	@OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
	private int anInt746 = 1;

	@OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
	private int anInt751 = 5;

	@OriginalMember(owner = "client!ch", name = "W", descriptor = "I")
	private int anInt754 = 2;

	@OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
	private int anInt748 = 2048;

	@OriginalMember(owner = "client!ch", name = "fb", descriptor = "[B")
	private byte[] aByteArray6 = new byte[512];

	@OriginalMember(owner = "client!ch", name = "U", descriptor = "I")
	private int anInt753 = 5;

	@OriginalMember(owner = "client!ch", name = "bb", descriptor = "[S")
	private short[] aShortArray5 = new short[512];

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V")
	@Override
	public void method5611() {
		this.aByteArray6 = Static184.method3478(this.anInt749);
		this.method684();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt753 = this.anInt751 = arg0.method3972();
		} else if (arg1 == 1) {
			this.anInt749 = arg0.method3972();
		} else if (arg1 == 2) {
			this.anInt748 = arg0.method4021();
		} else if (arg1 == 3) {
			this.anInt754 = arg0.method3972();
		} else if (arg1 == 4) {
			this.anInt746 = arg0.method3972();
		} else if (arg1 == 5) {
			this.anInt753 = arg0.method3972();
		} else if (arg1 == 6) {
			this.anInt751 = arg0.method3972();
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5616(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass140_41.method3664(arg0);
		if (super.aClass140_41.aBoolean287) {
			@Pc(29) int local29 = Static273.anIntArray703[arg0] * this.anInt751 + 2048;
			@Pc(33) int local33 = local29 >> 12;
			@Pc(37) int local37 = local33 + 1;
			for (@Pc(39) int local39 = 0; local39 < Static299.anInt5659; local39++) {
				Static197.anInt5290 = Integer.MAX_VALUE;
				Static256.anInt4751 = Integer.MAX_VALUE;
				Static215.anInt3936 = Integer.MAX_VALUE;
				Static120.anInt2269 = Integer.MAX_VALUE;
				@Pc(59) int local59 = this.anInt753 * Static18.anIntArray32[local39] + 2048;
				@Pc(63) int local63 = local59 >> 12;
				@Pc(67) int local67 = local63 + 1;
				@Pc(152) int local152;
				for (@Pc(71) int local71 = local33 - 1; local71 <= local37; local71++) {
					@Pc(92) int local92 = this.aByteArray6[(local71 >= this.anInt751 ? local71 - this.anInt751 : local71) & 0xFF] & 0xFF;
					for (@Pc(96) int local96 = local63 - 1; local96 <= local67; local96++) {
						@Pc(125) int local125 = (this.aByteArray6[local92 + (local96 < this.anInt753 ? local96 : local96 - this.anInt753) & 0xFF] & 0xFF) * 2;
						@Pc(130) int local130 = local59 - (local96 << 12);
						@Pc(134) int local134 = local125 + 1;
						@Pc(137) int local137 = local130 - this.aShortArray5[local125];
						@Pc(149) int local149 = local29 - this.aShortArray5[local134] - (local71 << 12);
						local152 = this.anInt746;
						@Pc(184) int local184;
						if (local152 == 1) {
							local184 = local137 * local137 + local149 * local149 >> 12;
						} else if (local152 == 3) {
							local149 = local149 < 0 ? -local149 : local149;
							local137 = local137 < 0 ? -local137 : local137;
							local184 = local137 > local149 ? local137 : local149;
						} else if (local152 == 4) {
							local137 = (int) (Math.sqrt((double) ((float) (local137 < 0 ? -local137 : local137) / 4096.0F)) * 4096.0D);
							local149 = (int) (Math.sqrt((double) ((float) (local149 < 0 ? -local149 : local149) / 4096.0F)) * 4096.0D);
							local184 = local137 + local149;
							local184 = local184 * local184 >> 12;
						} else if (local152 == 5) {
							local149 *= local149;
							local137 *= local137;
							local184 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local137 + local149) / 1.6777216E7F))) * 4096.0D);
						} else if (local152 == 2) {
							local184 = (local149 >= 0 ? local149 : -local149) + (local137 < 0 ? -local137 : local137);
						} else {
							local184 = (int) (Math.sqrt((double) ((float) (local149 * local149 + local137 * local137) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static120.anInt2269 > local184) {
							Static197.anInt5290 = Static256.anInt4751;
							Static256.anInt4751 = Static215.anInt3936;
							Static215.anInt3936 = Static120.anInt2269;
							Static120.anInt2269 = local184;
						} else if (local184 < Static215.anInt3936) {
							Static197.anInt5290 = Static256.anInt4751;
							Static256.anInt4751 = Static215.anInt3936;
							Static215.anInt3936 = local184;
						} else if (local184 < Static256.anInt4751) {
							Static197.anInt5290 = Static256.anInt4751;
							Static256.anInt4751 = local184;
						} else if (local184 < Static197.anInt5290) {
							Static197.anInt5290 = local184;
						}
					}
				}
				local152 = this.anInt754;
				if (local152 == 0) {
					local16[local39] = Static120.anInt2269;
				} else if (local152 == 1) {
					local16[local39] = Static215.anInt3936;
				} else if (local152 == 3) {
					local16[local39] = Static256.anInt4751;
				} else if (local152 == 4) {
					local16[local39] = Static197.anInt5290;
				} else if (local152 == 2) {
					local16[local39] = Static215.anInt3936 - Static120.anInt2269;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "(B)V")
	private void method684() {
		@Pc(12) Random local12 = new Random((long) this.anInt749);
		this.aShortArray5 = new short[512];
		if (this.anInt748 > 0) {
			for (@Pc(29) int local29 = 0; local29 < 512; local29++) {
				this.aShortArray5[local29] = (short) Static24.method368(this.anInt748, local12);
			}
		}
	}
}
