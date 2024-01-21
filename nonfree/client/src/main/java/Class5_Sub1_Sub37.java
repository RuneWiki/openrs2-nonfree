import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class5_Sub1_Sub37 extends Class5_Sub1 {

	@OriginalMember(owner = "client!we", name = "M", descriptor = "I")
	private int anInt4143 = 2048;

	@OriginalMember(owner = "client!we", name = "L", descriptor = "I")
	private int anInt4142 = 0;

	@OriginalMember(owner = "client!we", name = "V", descriptor = "I")
	private int anInt4148 = 2;

	@OriginalMember(owner = "client!we", name = "X", descriptor = "I")
	private int anInt4150 = 5;

	@OriginalMember(owner = "client!we", name = "hb", descriptor = "I")
	private int anInt4156 = 1;

	@OriginalMember(owner = "client!we", name = "Z", descriptor = "[B")
	private byte[] aByteArray58 = new byte[512];

	@OriginalMember(owner = "client!we", name = "db", descriptor = "I")
	private int anInt4153 = 5;

	@OriginalMember(owner = "client!we", name = "gb", descriptor = "[S")
	private short[] aShortArray60 = new short[512];

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4150 = this.anInt4153 = arg0.method3062();
		} else if (arg1 == 1) {
			this.anInt4142 = arg0.method3062();
		} else if (arg1 == 2) {
			this.anInt4143 = arg0.method3077();
		} else if (arg1 == 3) {
			this.anInt4148 = arg0.method3062();
		} else if (arg1 == 4) {
			this.anInt4156 = arg0.method3062();
		} else if (arg1 == 5) {
			this.anInt4150 = arg0.method3062();
		} else if (arg1 == 6) {
			this.anInt4153 = arg0.method3062();
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass101_41.method2886(arg0);
		if (super.aClass101_41.aBoolean174) {
			@Pc(28) int local28 = Static147.anIntArray321[arg0] * this.anInt4153 + 2048;
			@Pc(32) int local32 = local28 >> 12;
			@Pc(36) int local36 = local32 + 1;
			for (@Pc(38) int local38 = 0; local38 < Static174.anInt3489; local38++) {
				Static45.anInt1030 = Integer.MAX_VALUE;
				Static129.anInt2698 = Integer.MAX_VALUE;
				Static62.anInt1366 = Integer.MAX_VALUE;
				Static125.anInt2637 = Integer.MAX_VALUE;
				@Pc(57) int local57 = Static117.anIntArray274[local38] * this.anInt4150 + 2048;
				@Pc(61) int local61 = local57 >> 12;
				@Pc(65) int local65 = local61 + 1;
				@Pc(152) int local152;
				for (@Pc(69) int local69 = local32 - 1; local69 <= local36; local69++) {
					@Pc(90) int local90 = this.aByteArray58[(this.anInt4153 <= local69 ? local69 - this.anInt4153 : local69) & 0xFF] & 0xFF;
					for (@Pc(94) int local94 = local61 - 1; local94 <= local65; local94++) {
						@Pc(124) int local124 = (this.aByteArray58[local90 + (local94 < this.anInt4150 ? local94 : local94 - this.anInt4150) & 0xFF] & 0xFF) * 2;
						@Pc(128) int local128 = local124 + 1;
						@Pc(137) int local137 = local57 - this.aShortArray60[local124] - (local94 << 12);
						@Pc(149) int local149 = local28 - this.aShortArray60[local128] - (local69 << 12);
						local152 = this.anInt4156;
						@Pc(185) int local185;
						if (local152 == 1) {
							local185 = local149 * local149 + local137 * local137 >> 12;
						} else if (local152 == 3) {
							local149 = local149 < 0 ? -local149 : local149;
							local137 = local137 < 0 ? -local137 : local137;
							local185 = local149 >= local137 ? local149 : local137;
						} else if (local152 == 4) {
							local137 = (int) (Math.sqrt((double) ((float) (local137 < 0 ? -local137 : local137) / 4096.0F)) * 4096.0D);
							local149 = (int) (Math.sqrt((double) ((float) (local149 >= 0 ? local149 : -local149) / 4096.0F)) * 4096.0D);
							local185 = local149 + local137;
							local185 = local185 * local185 >> 12;
						} else if (local152 == 5) {
							local137 *= local137;
							local149 *= local149;
							local185 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local149 + local137) / 1.6777216E7F))) * 4096.0D);
						} else if (local152 == 2) {
							local185 = (local137 < 0 ? -local137 : local137) + (local149 >= 0 ? local149 : -local149);
						} else {
							local185 = (int) (Math.sqrt((double) ((float) (local137 * local137 + local149 * local149) / 1.6777216E7F)) * 4096.0D);
						}
						if (local185 < Static125.anInt2637) {
							Static45.anInt1030 = Static129.anInt2698;
							Static129.anInt2698 = Static62.anInt1366;
							Static62.anInt1366 = Static125.anInt2637;
							Static125.anInt2637 = local185;
						} else if (Static62.anInt1366 > local185) {
							Static45.anInt1030 = Static129.anInt2698;
							Static129.anInt2698 = Static62.anInt1366;
							Static62.anInt1366 = local185;
						} else if (local185 < Static129.anInt2698) {
							Static45.anInt1030 = Static129.anInt2698;
							Static129.anInt2698 = local185;
						} else if (Static45.anInt1030 > local185) {
							Static45.anInt1030 = local185;
						}
					}
				}
				local152 = this.anInt4148;
				if (local152 == 0) {
					local7[local38] = Static125.anInt2637;
				} else if (local152 == 1) {
					local7[local38] = Static62.anInt1366;
				} else if (local152 == 3) {
					local7[local38] = Static129.anInt2698;
				} else if (local152 == 4) {
					local7[local38] = Static45.anInt1030;
				} else if (local152 == 2) {
					local7[local38] = Static62.anInt1366 - Static125.anInt2637;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!we", name = "f", descriptor = "(I)V")
	@Override
	public void method3200() {
		this.aByteArray58 = Static186.method2816(this.anInt4142);
		this.method3156();
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(Z)V")
	private void method3156() {
		@Pc(16) Random local16 = new Random((long) this.anInt4142);
		this.aShortArray60 = new short[512];
		if (this.anInt4143 > 0) {
			for (@Pc(25) int local25 = 0; local25 < 512; local25++) {
				this.aShortArray60[local25] = (short) Static85.method1454(local16, this.anInt4143);
			}
		}
	}
}
