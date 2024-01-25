import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class1_Sub3_Sub17 extends Class1_Sub3 {

	@OriginalMember(owner = "client!i", name = "P", descriptor = "I")
	private int anInt3099 = 2;

	@OriginalMember(owner = "client!i", name = "R", descriptor = "[S")
	private short[] aShortArray49 = new short[512];

	@OriginalMember(owner = "client!i", name = "Q", descriptor = "I")
	private int anInt3100 = 0;

	@OriginalMember(owner = "client!i", name = "T", descriptor = "I")
	private int anInt3102 = 5;

	@OriginalMember(owner = "client!i", name = "N", descriptor = "I")
	private int anInt3097 = 1;

	@OriginalMember(owner = "client!i", name = "S", descriptor = "I")
	private int anInt3101 = 5;

	@OriginalMember(owner = "client!i", name = "W", descriptor = "I")
	private int anInt3104 = 2048;

	@OriginalMember(owner = "client!i", name = "V", descriptor = "[B")
	private byte[] aByteArray46 = new byte[512];

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(B)V")
	private void method2660() {
		@Pc(12) Random local12 = new Random((long) this.anInt3100);
		this.aShortArray49 = new short[512];
		if (this.anInt3104 > 0) {
			for (@Pc(21) int local21 = 0; local21 < 512; local21++) {
				this.aShortArray49[local21] = (short) Static301.method3334(this.anInt3104, local12);
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(I)V")
	@Override
	public void method6074() {
		this.aByteArray46 = Static79.method1380(this.anInt3100);
		this.method2660();
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6084(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass172_41.method3962(arg0);
		if (super.aClass172_41.aBoolean327) {
			@Pc(25) int local25 = Static342.anIntArray469[arg0] * this.anInt3101 + 2048;
			@Pc(29) int local29 = local25 >> 12;
			@Pc(33) int local33 = local29 + 1;
			for (@Pc(35) int local35 = 0; local35 < Static347.anInt5974; local35++) {
				Static249.anInt4478 = Integer.MAX_VALUE;
				Static391.anInt6814 = Integer.MAX_VALUE;
				Static178.anInt3223 = Integer.MAX_VALUE;
				Static388.anInt6764 = Integer.MAX_VALUE;
				@Pc(55) int local55 = this.anInt3102 * Static384.anIntArray551[local35] + 2048;
				@Pc(59) int local59 = local55 >> 12;
				@Pc(63) int local63 = local59 + 1;
				@Pc(146) int local146;
				for (@Pc(67) int local67 = local29 - 1; local67 <= local33; local67++) {
					@Pc(88) int local88 = this.aByteArray46[(local67 >= this.anInt3101 ? local67 - this.anInt3101 : local67) & 0xFF] & 0xFF;
					for (@Pc(92) int local92 = local59 - 1; local92 <= local63; local92++) {
						@Pc(117) int local117 = (this.aByteArray46[local88 + (local92 >= this.anInt3102 ? local92 - this.anInt3102 : local92) & 0xFF] & 0xFF) * 2;
						@Pc(121) int local121 = local117 + 1;
						@Pc(131) int local131 = local55 - this.aShortArray49[local117] - (local92 << 12);
						@Pc(143) int local143 = local25 - this.aShortArray49[local121] - (local67 << 12);
						local146 = this.anInt3097;
						@Pc(177) int local177;
						if (local146 == 1) {
							local177 = local143 * local143 + local131 * local131 >> 12;
						} else if (local146 == 3) {
							local143 = local143 >= 0 ? local143 : -local143;
							local131 = local131 >= 0 ? local131 : -local131;
							local177 = local143 < local131 ? local131 : local143;
						} else if (local146 == 4) {
							local131 = (int) (Math.sqrt((double) ((float) (local131 >= 0 ? local131 : -local131) / 4096.0F)) * 4096.0D);
							local143 = (int) (Math.sqrt((double) ((float) (local143 >= 0 ? local143 : -local143) / 4096.0F)) * 4096.0D);
							local177 = local143 + local131;
							local177 = local177 * local177 >> 12;
						} else if (local146 == 5) {
							local131 *= local131;
							local143 *= local143;
							local177 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local143 + local131) / 1.6777216E7F))) * 4096.0D);
						} else if (local146 == 2) {
							local177 = (local131 >= 0 ? local131 : -local131) + (local143 >= 0 ? local143 : -local143);
						} else {
							local177 = (int) (Math.sqrt((double) ((float) (local131 * local131 + local143 * local143) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static388.anInt6764 > local177) {
							Static249.anInt4478 = Static391.anInt6814;
							Static391.anInt6814 = Static178.anInt3223;
							Static178.anInt3223 = Static388.anInt6764;
							Static388.anInt6764 = local177;
						} else if (local177 < Static178.anInt3223) {
							Static249.anInt4478 = Static391.anInt6814;
							Static391.anInt6814 = Static178.anInt3223;
							Static178.anInt3223 = local177;
						} else if (local177 < Static391.anInt6814) {
							Static249.anInt4478 = Static391.anInt6814;
							Static391.anInt6814 = local177;
						} else if (local177 < Static249.anInt4478) {
							Static249.anInt4478 = local177;
						}
					}
				}
				local146 = this.anInt3099;
				if (local146 == 0) {
					local11[local35] = Static388.anInt6764;
				} else if (local146 == 1) {
					local11[local35] = Static178.anInt3223;
				} else if (local146 == 3) {
					local11[local35] = Static391.anInt6814;
				} else if (local146 == 4) {
					local11[local35] = Static249.anInt4478;
				} else if (local146 == 2) {
					local11[local35] = Static178.anInt3223 - Static388.anInt6764;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3102 = this.anInt3101 = arg0.method4130();
		} else if (arg1 == 1) {
			this.anInt3100 = arg0.method4130();
		} else if (arg1 == 2) {
			this.anInt3104 = arg0.method4093();
		} else if (arg1 == 3) {
			this.anInt3099 = arg0.method4130();
		} else if (arg1 == 4) {
			this.anInt3097 = arg0.method4130();
		} else if (arg1 == 5) {
			this.anInt3102 = arg0.method4130();
		} else if (arg1 == 6) {
			this.anInt3101 = arg0.method4130();
		}
	}
}
