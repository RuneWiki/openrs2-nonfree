import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class5_Sub2_Sub27 extends Class5_Sub2 {

	@OriginalMember(owner = "client!qb", name = "O", descriptor = "[S")
	private short[] aShortArray82 = new short[512];

	@OriginalMember(owner = "client!qb", name = "M", descriptor = "I")
	private int anInt4887 = 5;

	@OriginalMember(owner = "client!qb", name = "R", descriptor = "I")
	private int anInt4891 = 5;

	@OriginalMember(owner = "client!qb", name = "Q", descriptor = "I")
	private int anInt4890 = 2048;

	@OriginalMember(owner = "client!qb", name = "W", descriptor = "[B")
	private byte[] aByteArray70 = new byte[512];

	@OriginalMember(owner = "client!qb", name = "Z", descriptor = "I")
	private int anInt4897 = 1;

	@OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
	private int anInt4889 = 2;

	@OriginalMember(owner = "client!qb", name = "X", descriptor = "I")
	private int anInt4895 = 0;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5821(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass52_41.method1260(arg0);
		if (super.aClass52_41.aBoolean95) {
			@Pc(28) int local28 = this.anInt4891 * Static287.anIntArray413[arg0] + 2048;
			@Pc(32) int local32 = local28 >> 12;
			@Pc(36) int local36 = local32 + 1;
			for (@Pc(38) int local38 = 0; local38 < Static15.anInt493; local38++) {
				Static138.anInt2770 = Integer.MAX_VALUE;
				Static188.anInt3739 = Integer.MAX_VALUE;
				Static62.anInt1432 = Integer.MAX_VALUE;
				Static153.anInt3098 = Integer.MAX_VALUE;
				@Pc(57) int local57 = this.anInt4887 * Static257.anIntArray386[local38] + 2048;
				@Pc(61) int local61 = local57 >> 12;
				@Pc(65) int local65 = local61 + 1;
				@Pc(147) int local147;
				for (@Pc(69) int local69 = local32 - 1; local69 <= local36; local69++) {
					@Pc(89) int local89 = this.aByteArray70[(this.anInt4891 > local69 ? local69 : local69 - this.anInt4891) & 0xFF] & 0xFF;
					for (@Pc(93) int local93 = local61 - 1; local93 <= local65; local93++) {
						@Pc(117) int local117 = (this.aByteArray70[(local93 >= this.anInt4887 ? local93 - this.anInt4887 : local93) + local89 & 0xFF] & 0xFF) * 2;
						@Pc(122) int local122 = local117 + 1;
						@Pc(131) int local131 = local57 - this.aShortArray82[local117] - (local93 << 12);
						@Pc(144) int local144 = local28 - this.aShortArray82[local122] - (local69 << 12);
						local147 = this.anInt4897;
						@Pc(180) int local180;
						if (local147 == 1) {
							local180 = local131 * local131 + local144 * local144 >> 12;
						} else if (local147 == 3) {
							local131 = local131 >= 0 ? local131 : -local131;
							local144 = local144 < 0 ? -local144 : local144;
							local180 = local144 >= local131 ? local144 : local131;
						} else if (local147 == 4) {
							local131 = (int) (Math.sqrt((double) ((float) (local131 >= 0 ? local131 : -local131) / 4096.0F)) * 4096.0D);
							local144 = (int) (Math.sqrt((double) ((float) (local144 >= 0 ? local144 : -local144) / 4096.0F)) * 4096.0D);
							local180 = local144 + local131;
							local180 = local180 * local180 >> 12;
						} else if (local147 == 5) {
							local131 *= local131;
							local144 *= local144;
							local180 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local131 + local144) / 1.6777216E7F))) * 4096.0D);
						} else if (local147 == 2) {
							local180 = (local131 >= 0 ? local131 : -local131) + (local144 < 0 ? -local144 : local144);
						} else {
							local180 = (int) (Math.sqrt((double) ((float) (local131 * local131 + local144 * local144) / 1.6777216E7F)) * 4096.0D);
						}
						if (local180 < Static153.anInt3098) {
							Static138.anInt2770 = Static188.anInt3739;
							Static188.anInt3739 = Static62.anInt1432;
							Static62.anInt1432 = Static153.anInt3098;
							Static153.anInt3098 = local180;
						} else if (local180 < Static62.anInt1432) {
							Static138.anInt2770 = Static188.anInt3739;
							Static188.anInt3739 = Static62.anInt1432;
							Static62.anInt1432 = local180;
						} else if (Static188.anInt3739 > local180) {
							Static138.anInt2770 = Static188.anInt3739;
							Static188.anInt3739 = local180;
						} else if (Static138.anInt2770 > local180) {
							Static138.anInt2770 = local180;
						}
					}
				}
				local147 = this.anInt4889;
				if (local147 == 0) {
					local11[local38] = Static153.anInt3098;
				} else if (local147 == 1) {
					local11[local38] = Static62.anInt1432;
				} else if (local147 == 3) {
					local11[local38] = Static188.anInt3739;
				} else if (local147 == 4) {
					local11[local38] = Static138.anInt2770;
				} else if (local147 == 2) {
					local11[local38] = Static62.anInt1432 - Static153.anInt3098;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
	@Override
	public void method5811() {
		this.aByteArray70 = Static104.method2067(this.anInt4895);
		this.method4405();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
	private void method4405() {
		@Pc(16) Random local16 = new Random((long) this.anInt4895);
		this.aShortArray82 = new short[512];
		if (this.anInt4890 > 0) {
			for (@Pc(25) int local25 = 0; local25 < 512; local25++) {
				this.aShortArray82[local25] = (short) Static210.method4979(this.anInt4890, local16);
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4887 = this.anInt4891 = arg0.method1832();
		} else if (arg1 == 1) {
			this.anInt4895 = arg0.method1832();
		} else if (arg1 == 2) {
			this.anInt4890 = arg0.method1845();
		} else if (arg1 == 3) {
			this.anInt4889 = arg0.method1832();
		} else if (arg1 == 4) {
			this.anInt4897 = arg0.method1832();
		} else if (arg1 == 5) {
			this.anInt4887 = arg0.method1832();
		} else if (arg1 == 6) {
			this.anInt4891 = arg0.method1832();
		}
	}
}
