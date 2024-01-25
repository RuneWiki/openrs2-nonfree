import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class5_Sub2_Sub20 extends Class5_Sub2 {

	@OriginalMember(owner = "client!mv", name = "L", descriptor = "[S")
	private short[] aShortArray97 = new short[512];

	@OriginalMember(owner = "client!mv", name = "J", descriptor = "I")
	private int anInt5960 = 0;

	@OriginalMember(owner = "client!mv", name = "E", descriptor = "I")
	private int anInt5955 = 5;

	@OriginalMember(owner = "client!mv", name = "D", descriptor = "[B")
	private byte[] aByteArray60 = new byte[512];

	@OriginalMember(owner = "client!mv", name = "H", descriptor = "I")
	private int anInt5958 = 1;

	@OriginalMember(owner = "client!mv", name = "G", descriptor = "I")
	private int anInt5957 = 2048;

	@OriginalMember(owner = "client!mv", name = "I", descriptor = "I")
	private int anInt5959 = 2;

	@OriginalMember(owner = "client!mv", name = "Q", descriptor = "I")
	private int anInt5966 = 5;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mv", name = "c", descriptor = "(I)V")
	@Override
	public void method9044() {
		this.aByteArray60 = Static625.method8858(this.anInt5960);
		this.method5306();
	}

	@OriginalMember(owner = "client!mv", name = "f", descriptor = "(I)V")
	private void method5306() {
		@Pc(16) Random local16 = new Random((long) this.anInt5960);
		this.aShortArray97 = new short[512];
		if (this.anInt5957 > 0) {
			for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
				this.aShortArray97[local28] = (short) Static130.method1947(this.anInt5957, local16);
			}
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9034(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass379_41.method9012(arg0);
		if (super.aClass379_41.aBoolean761) {
			@Pc(25) int local25 = Static493.anIntArray476[arg0] * this.anInt5966 + 2048;
			@Pc(29) int local29 = local25 >> 12;
			@Pc(33) int local33 = local29 + 1;
			for (@Pc(35) int local35 = 0; local35 < Static597.anInt10025; local35++) {
				Static208.anInt3993 = Integer.MAX_VALUE;
				Static322.anInt5455 = Integer.MAX_VALUE;
				Static593.anInt9932 = Integer.MAX_VALUE;
				Static213.anInt4046 = Integer.MAX_VALUE;
				@Pc(55) int local55 = Static352.anIntArray331[local35] * this.anInt5955 + 2048;
				@Pc(59) int local59 = local55 >> 12;
				@Pc(63) int local63 = local59 + 1;
				@Pc(147) int local147;
				for (@Pc(67) int local67 = local29 - 1; local67 <= local33; local67++) {
					@Pc(88) int local88 = this.aByteArray60[(this.anInt5966 > local67 ? local67 : local67 - this.anInt5966) & 0xFF] & 0xFF;
					for (@Pc(92) int local92 = local59 - 1; local92 <= local63; local92++) {
						@Pc(117) int local117 = (this.aByteArray60[(this.anInt5955 > local92 ? local92 : local92 - this.anInt5955) + local88 & 0xFF] & 0xFF) * 2;
						@Pc(121) int local121 = local117 + 1;
						@Pc(131) int local131 = local55 - this.aShortArray97[local117] - (local92 << 12);
						@Pc(144) int local144 = local25 - this.aShortArray97[local121] - (local67 << 12);
						local147 = this.anInt5958;
						@Pc(183) int local183;
						if (local147 == 1) {
							local183 = local131 * local131 + local144 * local144 >> 12;
						} else if (local147 == 3) {
							local144 = local144 >= 0 ? local144 : -local144;
							local131 = local131 < 0 ? -local131 : local131;
							local183 = local131 <= local144 ? local144 : local131;
						} else if (local147 == 4) {
							local131 = (int) (Math.sqrt((double) ((float) (local131 >= 0 ? local131 : -local131) / 4096.0F)) * 4096.0D);
							local144 = (int) (Math.sqrt((double) ((float) (local144 < 0 ? -local144 : local144) / 4096.0F)) * 4096.0D);
							local183 = local131 + local144;
							local183 = local183 * local183 >> 12;
						} else if (local147 == 5) {
							local144 *= local144;
							local131 *= local131;
							local183 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local131 + local144) / 1.6777216E7F))) * 4096.0D);
						} else if (local147 == 2) {
							local183 = (local131 >= 0 ? local131 : -local131) + (local144 < 0 ? -local144 : local144);
						} else {
							local183 = (int) (Math.sqrt((double) ((float) (local144 * local144 + local131 * local131) / 1.6777216E7F)) * 4096.0D);
						}
						if (local183 < Static213.anInt4046) {
							Static208.anInt3993 = Static322.anInt5455;
							Static322.anInt5455 = Static593.anInt9932;
							Static593.anInt9932 = Static213.anInt4046;
							Static213.anInt4046 = local183;
						} else if (Static593.anInt9932 > local183) {
							Static208.anInt3993 = Static322.anInt5455;
							Static322.anInt5455 = Static593.anInt9932;
							Static593.anInt9932 = local183;
						} else if (Static322.anInt5455 > local183) {
							Static208.anInt3993 = Static322.anInt5455;
							Static322.anInt5455 = local183;
						} else if (local183 < Static208.anInt3993) {
							Static208.anInt3993 = local183;
						}
					}
				}
				local147 = this.anInt5959;
				if (local147 == 0) {
					local11[local35] = Static213.anInt4046;
				} else if (local147 == 1) {
					local11[local35] = Static593.anInt9932;
				} else if (local147 == 3) {
					local11[local35] = Static322.anInt5455;
				} else if (local147 == 4) {
					local11[local35] = Static208.anInt3993;
				} else if (local147 == 2) {
					local11[local35] = Static593.anInt9932 - Static213.anInt4046;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5955 = this.anInt5966 = arg0.method5966();
		} else if (arg1 == 1) {
			this.anInt5960 = arg0.method5966();
		} else if (arg1 == 2) {
			this.anInt5957 = arg0.method5968();
		} else if (arg1 == 3) {
			this.anInt5959 = arg0.method5966();
		} else if (arg1 == 4) {
			this.anInt5958 = arg0.method5966();
		} else if (arg1 == 5) {
			this.anInt5955 = arg0.method5966();
		} else if (arg1 == 6) {
			this.anInt5966 = arg0.method5966();
		}
	}
}
