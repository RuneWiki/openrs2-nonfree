import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class1_Sub4_Sub3 extends Class1_Sub4 {

	@OriginalMember(owner = "client!bg", name = "L", descriptor = "I")
	private int anInt375 = 5;

	@OriginalMember(owner = "client!bg", name = "R", descriptor = "[S")
	private short[] aShortArray3 = new short[512];

	@OriginalMember(owner = "client!bg", name = "Q", descriptor = "I")
	private int anInt380 = 5;

	@OriginalMember(owner = "client!bg", name = "S", descriptor = "I")
	private int anInt381 = 1;

	@OriginalMember(owner = "client!bg", name = "H", descriptor = "I")
	private int anInt372 = 2;

	@OriginalMember(owner = "client!bg", name = "J", descriptor = "I")
	private int anInt373 = 2048;

	@OriginalMember(owner = "client!bg", name = "U", descriptor = "I")
	private int anInt383 = 0;

	@OriginalMember(owner = "client!bg", name = "X", descriptor = "[B")
	private byte[] aByteArray2 = new byte[512];

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4746(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = this.aClass7_41.method116(arg0);
		if (this.aClass7_41.aBoolean4) {
			@Pc(33) int local33 = this.anInt380 * Static250.anIntArray398[arg0] + 2048;
			@Pc(37) int local37 = local33 >> 12;
			@Pc(41) int local41 = local37 + 1;
			for (@Pc(43) int local43 = 0; local43 < Static182.anInt3492; local43++) {
				Static302.anInt5360 = Integer.MAX_VALUE;
				Static208.anInt3969 = Integer.MAX_VALUE;
				Static300.anInt5351 = Integer.MAX_VALUE;
				Static234.anInt4276 = Integer.MAX_VALUE;
				@Pc(67) int local67 = Static279.anIntArray454[local43] * this.anInt375 + 2048;
				@Pc(71) int local71 = local67 >> 12;
				@Pc(75) int local75 = local71 + 1;
				@Pc(162) int local162;
				for (@Pc(79) int local79 = local37 - 1; local79 <= local41; local79++) {
					@Pc(104) int local104 = this.aByteArray2[(local79 < this.anInt380 ? local79 : local79 - this.anInt380) & 0xFF] & 0xFF;
					for (@Pc(108) int local108 = local71 - 1; local108 <= local75; local108++) {
						@Pc(134) int local134 = (this.aByteArray2[local104 + (local108 >= this.anInt375 ? local108 - this.anInt375 : local108) & 0xFF] & 0xFF) * 2;
						@Pc(138) int local138 = local134 + 1;
						@Pc(148) int local148 = local67 - this.aShortArray3[local134] - (local108 << 12);
						@Pc(159) int local159 = local33 - (local79 << 12) - this.aShortArray3[local138];
						local162 = this.anInt381;
						@Pc(193) int local193;
						if (local162 == 1) {
							local193 = local148 * local148 + local159 * local159 >> 12;
						} else if (local162 == 3) {
							local159 = local159 >= 0 ? local159 : -local159;
							local148 = local148 >= 0 ? local148 : -local148;
							local193 = local148 <= local159 ? local159 : local148;
						} else if (local162 == 4) {
							local148 = (int) (Math.sqrt((double) ((float) (local148 < 0 ? -local148 : local148) / 4096.0F)) * 4096.0D);
							local159 = (int) (Math.sqrt((double) ((float) (local159 < 0 ? -local159 : local159) / 4096.0F)) * 4096.0D);
							local193 = local159 + local148;
							local193 = local193 * local193 >> 12;
						} else if (local162 == 5) {
							local159 *= local159;
							local148 *= local148;
							local193 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local148 + local159) / 1.6777216E7F))) * 4096.0D);
						} else if (local162 == 2) {
							local193 = (local159 < 0 ? -local159 : local159) + (local148 < 0 ? -local148 : local148);
						} else {
							local193 = (int) (Math.sqrt((double) ((float) (local159 * local159 + local148 * local148) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static234.anInt4276 > local193) {
							Static302.anInt5360 = Static208.anInt3969;
							Static208.anInt3969 = Static300.anInt5351;
							Static300.anInt5351 = Static234.anInt4276;
							Static234.anInt4276 = local193;
						} else if (local193 < Static300.anInt5351) {
							Static302.anInt5360 = Static208.anInt3969;
							Static208.anInt3969 = Static300.anInt5351;
							Static300.anInt5351 = local193;
						} else if (Static208.anInt3969 > local193) {
							Static302.anInt5360 = Static208.anInt3969;
							Static208.anInt3969 = local193;
						} else if (Static302.anInt5360 > local193) {
							Static302.anInt5360 = local193;
						}
					}
				}
				local162 = this.anInt372;
				if (local162 == 0) {
					local19[local43] = Static234.anInt4276;
				} else if (local162 == 1) {
					local19[local43] = Static300.anInt5351;
				} else if (local162 == 3) {
					local19[local43] = Static208.anInt3969;
				} else if (local162 == 4) {
					local19[local43] = Static302.anInt5360;
				} else if (local162 == 2) {
					local19[local43] = Static300.anInt5351 - Static234.anInt4276;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt375 = this.anInt380 = arg0.method1378();
		} else if (arg1 == 1) {
			this.anInt383 = arg0.method1378();
		} else if (arg1 == 2) {
			this.anInt373 = arg0.method1386();
		} else if (arg1 == 3) {
			this.anInt372 = arg0.method1378();
		} else if (arg1 == 4) {
			this.anInt381 = arg0.method1378();
		} else if (arg1 == 5) {
			this.anInt375 = arg0.method1378();
		} else if (arg1 == 6) {
			this.anInt380 = arg0.method1378();
		}
	}

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "(I)V")
	private void method357() {
		@Pc(12) Random local12 = new Random((long) this.anInt383);
		this.aShortArray3 = new short[512];
		if (this.anInt373 > 0) {
			for (@Pc(30) int local30 = 0; local30 < 512; local30++) {
				this.aShortArray3[local30] = (short) Static151.method2554(this.anInt373, local12);
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "(B)V")
	@Override
	public void method4755() {
		this.aByteArray2 = Static47.method897(this.anInt383);
		this.method357();
	}
}
