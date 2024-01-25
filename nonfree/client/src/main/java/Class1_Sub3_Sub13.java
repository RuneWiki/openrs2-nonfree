import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class1_Sub3_Sub13 extends Class1_Sub3 {

	@OriginalMember(owner = "client!fe", name = "Z", descriptor = "[I")
	public static final int[] anIntArray248 = new int[128];

	@OriginalMember(owner = "client!fe", name = "F", descriptor = "I")
	private int anInt2614 = 1;

	@OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
	private int anInt2621 = 2;

	@OriginalMember(owner = "client!fe", name = "R", descriptor = "[B")
	private byte[] aByteArray32 = new byte[512];

	@OriginalMember(owner = "client!fe", name = "L", descriptor = "I")
	private int anInt2619 = 0;

	@OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
	private int anInt2625 = 5;

	@OriginalMember(owner = "client!fe", name = "H", descriptor = "[S")
	private short[] aShortArray35 = new short[512];

	@OriginalMember(owner = "client!fe", name = "J", descriptor = "I")
	private int anInt2617 = 2048;

	@OriginalMember(owner = "client!fe", name = "K", descriptor = "I")
	private int anInt2618 = 5;

	static {
		for (@Pc(12) int local12 = 0; local12 < anIntArray248.length; local12++) {
			anIntArray248[local12] = -1;
		}
		for (@Pc(24) int local24 = 65; local24 <= 90; local24++) {
			anIntArray248[local24] = local24 - 65;
		}
		for (@Pc(37) int local37 = 97; local37 <= 122; local37++) {
			anIntArray248[local37] = local37 + 26 - 97;
		}
		for (@Pc(52) int local52 = 48; local52 <= 57; local52++) {
			anIntArray248[local52] = local52 + 52 - 48;
		}
		anIntArray248[42] = anIntArray248[43] = 62;
		anIntArray248[45] = anIntArray248[47] = 63;
	}

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "(I)V")
	@Override
	public void method7126() {
		this.aByteArray32 = Static187.method2922(this.anInt2619);
		this.method2207();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2618 = this.anInt2625 = arg0.method3922();
		} else if (arg1 == 1) {
			this.anInt2619 = arg0.method3922();
		} else if (arg1 == 2) {
			this.anInt2617 = arg0.method3967();
		} else if (arg1 == 3) {
			this.anInt2621 = arg0.method3922();
		} else if (arg1 == 4) {
			this.anInt2614 = arg0.method3922();
		} else if (arg1 == 5) {
			this.anInt2618 = arg0.method3922();
		} else if (arg1 == 6) {
			this.anInt2625 = arg0.method3922();
		}
	}

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "(I)V")
	private void method2207() {
		@Pc(16) Random local16 = new Random((long) this.anInt2619);
		this.aShortArray35 = new short[512];
		if (this.anInt2617 > 0) {
			for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
				this.aShortArray35[local28] = (short) Static220.method3801(local16, this.anInt2617);
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7123(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass12_41.method502(arg0);
		if (super.aClass12_41.aBoolean23) {
			@Pc(29) int local29 = this.anInt2625 * Static7.anIntArray20[arg0] + 2048;
			@Pc(33) int local33 = local29 >> 12;
			@Pc(37) int local37 = local33 + 1;
			for (@Pc(39) int local39 = 0; local39 < Static452.anInt7734; local39++) {
				Static454.anInt7746 = Integer.MAX_VALUE;
				Static226.anInt4481 = Integer.MAX_VALUE;
				Static104.anInt2088 = Integer.MAX_VALUE;
				Static335.anInt6037 = Integer.MAX_VALUE;
				@Pc(58) int local58 = Static228.anIntArray442[local39] * this.anInt2618 + 2048;
				@Pc(62) int local62 = local58 >> 12;
				@Pc(66) int local66 = local62 + 1;
				@Pc(149) int local149;
				for (@Pc(70) int local70 = local33 - 1; local70 <= local37; local70++) {
					@Pc(91) int local91 = this.aByteArray32[(local70 >= this.anInt2625 ? local70 - this.anInt2625 : local70) & 0xFF] & 0xFF;
					for (@Pc(95) int local95 = local62 - 1; local95 <= local66; local95++) {
						@Pc(120) int local120 = (this.aByteArray32[(local95 < this.anInt2618 ? local95 : local95 - this.anInt2618) + local91 & 0xFF] & 0xFF) * 2;
						@Pc(124) int local124 = -(local95 << 12);
						@Pc(128) int local128 = local120 + 1;
						@Pc(134) int local134 = local124 + local58 - this.aShortArray35[local120];
						@Pc(146) int local146 = local29 - this.aShortArray35[local128] - (local70 << 12);
						local149 = this.anInt2614;
						@Pc(181) int local181;
						if (local149 == 1) {
							local181 = local134 * local134 + local146 * local146 >> 12;
						} else if (local149 == 3) {
							local134 = local134 >= 0 ? local134 : -local134;
							local146 = local146 >= 0 ? local146 : -local146;
							local181 = local146 < local134 ? local134 : local146;
						} else if (local149 == 4) {
							local134 = (int) (Math.sqrt((double) ((float) (local134 < 0 ? -local134 : local134) / 4096.0F)) * 4096.0D);
							local146 = (int) (Math.sqrt((double) ((float) (local146 < 0 ? -local146 : local146) / 4096.0F)) * 4096.0D);
							local181 = local146 + local134;
							local181 = local181 * local181 >> 12;
						} else if (local149 == 5) {
							local134 *= local134;
							local146 *= local146;
							local181 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local134 + local146) / 1.6777216E7F))) * 4096.0D);
						} else if (local149 == 2) {
							local181 = (local134 < 0 ? -local134 : local134) + (local146 < 0 ? -local146 : local146);
						} else {
							local181 = (int) (Math.sqrt((double) ((float) (local146 * local146 + local134 * local134) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static335.anInt6037 > local181) {
							Static454.anInt7746 = Static226.anInt4481;
							Static226.anInt4481 = Static104.anInt2088;
							Static104.anInt2088 = Static335.anInt6037;
							Static335.anInt6037 = local181;
						} else if (Static104.anInt2088 > local181) {
							Static454.anInt7746 = Static226.anInt4481;
							Static226.anInt4481 = Static104.anInt2088;
							Static104.anInt2088 = local181;
						} else if (local181 < Static226.anInt4481) {
							Static454.anInt7746 = Static226.anInt4481;
							Static226.anInt4481 = local181;
						} else if (local181 < Static454.anInt7746) {
							Static454.anInt7746 = local181;
						}
					}
				}
				local149 = this.anInt2621;
				if (local149 == 0) {
					local16[local39] = Static335.anInt6037;
				} else if (local149 == 1) {
					local16[local39] = Static104.anInt2088;
				} else if (local149 == 3) {
					local16[local39] = Static226.anInt4481;
				} else if (local149 == 4) {
					local16[local39] = Static454.anInt7746;
				} else if (local149 == 2) {
					local16[local39] = Static104.anInt2088 - Static335.anInt6037;
				}
			}
		}
		return local16;
	}
}
