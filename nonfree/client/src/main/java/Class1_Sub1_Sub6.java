import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class1_Sub1_Sub6 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bh", name = "V", descriptor = "[S")
	private short[] aShortArray3 = new short[512];

	@OriginalMember(owner = "client!bh", name = "U", descriptor = "[B")
	private byte[] aByteArray4 = new byte[512];

	@OriginalMember(owner = "client!bh", name = "X", descriptor = "I")
	private int anInt545 = 2;

	@OriginalMember(owner = "client!bh", name = "O", descriptor = "I")
	private int anInt539 = 2048;

	@OriginalMember(owner = "client!bh", name = "W", descriptor = "I")
	private int anInt544 = 5;

	@OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
	private int anInt540 = 5;

	@OriginalMember(owner = "client!bh", name = "bb", descriptor = "I")
	private int anInt548 = 0;

	@OriginalMember(owner = "client!bh", name = "ib", descriptor = "I")
	private int anInt555 = 1;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "(I)V")
	@Override
	public void method4454() {
		this.aByteArray4 = Static286.method3892(this.anInt548);
		this.method428();
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt540 = this.anInt544 = arg0.method3122();
		} else if (arg1 == 1) {
			this.anInt548 = arg0.method3122();
		} else if (arg1 == 2) {
			this.anInt539 = arg0.method3107();
		} else if (arg1 == 3) {
			this.anInt545 = arg0.method3122();
		} else if (arg1 == 4) {
			this.anInt555 = arg0.method3122();
		} else if (arg1 == 5) {
			this.anInt540 = arg0.method3122();
		} else if (arg1 == 6) {
			this.anInt544 = arg0.method3122();
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		@Pc(20) int[] local20 = this.aClass176_41.method4469(arg0);
		if (this.aClass176_41.aBoolean437) {
			@Pc(34) int local34 = Static219.anIntArray515[arg0] * this.anInt544 + 2048;
			@Pc(38) int local38 = local34 >> 12;
			@Pc(42) int local42 = local38 + 1;
			for (@Pc(44) int local44 = 0; local44 < Static131.anInt2513; local44++) {
				Static120.anInt2325 = Integer.MAX_VALUE;
				Static48.anInt1032 = Integer.MAX_VALUE;
				Static192.anInt5396 = Integer.MAX_VALUE;
				Static287.anInt5668 = Integer.MAX_VALUE;
				@Pc(68) int local68 = Static105.anIntArray261[local44] * this.anInt540 + 2048;
				@Pc(72) int local72 = local68 >> 12;
				@Pc(76) int local76 = local72 + 1;
				@Pc(171) int local171;
				for (@Pc(80) int local80 = local38 - 1; local80 <= local42; local80++) {
					@Pc(106) int local106 = this.aByteArray4[(this.anInt544 <= local80 ? local80 - this.anInt544 : local80) & 0xFF] & 0xFF;
					for (@Pc(110) int local110 = local72 - 1; local110 <= local76; local110++) {
						@Pc(144) int local144 = (this.aByteArray4[(local110 < this.anInt540 ? local110 : local110 - this.anInt540) + local106 & 0xFF] & 0xFF) * 2;
						@Pc(149) int local149 = local68 - (local110 << 12);
						@Pc(153) int local153 = local144 + 1;
						@Pc(156) int local156 = local149 - this.aShortArray3[local144];
						@Pc(168) int local168 = local34 - this.aShortArray3[local153] - (local80 << 12);
						local171 = this.anInt555;
						@Pc(205) int local205;
						if (local171 == 1) {
							local205 = local156 * local156 + local168 * local168 >> 12;
						} else if (local171 == 3) {
							local156 = local156 >= 0 ? local156 : -local156;
							local168 = local168 >= 0 ? local168 : -local168;
							local205 = local156 > local168 ? local156 : local168;
						} else if (local171 == 4) {
							local156 = (int) (Math.sqrt((double) ((float) (local156 >= 0 ? local156 : -local156) / 4096.0F)) * 4096.0D);
							local168 = (int) (Math.sqrt((double) ((float) (local168 >= 0 ? local168 : -local168) / 4096.0F)) * 4096.0D);
							local205 = local168 + local156;
							local205 = local205 * local205 >> 12;
						} else if (local171 == 5) {
							local168 *= local168;
							local156 *= local156;
							local205 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local168 + local156) / 1.6777216E7F))) * 4096.0D);
						} else if (local171 == 2) {
							local205 = (local156 >= 0 ? local156 : -local156) + (local168 < 0 ? -local168 : local168);
						} else {
							local205 = (int) (Math.sqrt((double) ((float) (local156 * local156 + local168 * local168) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static287.anInt5668 > local205) {
							Static120.anInt2325 = Static48.anInt1032;
							Static48.anInt1032 = Static192.anInt5396;
							Static192.anInt5396 = Static287.anInt5668;
							Static287.anInt5668 = local205;
						} else if (Static192.anInt5396 > local205) {
							Static120.anInt2325 = Static48.anInt1032;
							Static48.anInt1032 = Static192.anInt5396;
							Static192.anInt5396 = local205;
						} else if (Static48.anInt1032 > local205) {
							Static120.anInt2325 = Static48.anInt1032;
							Static48.anInt1032 = local205;
						} else if (local205 < Static120.anInt2325) {
							Static120.anInt2325 = local205;
						}
					}
				}
				local171 = this.anInt545;
				if (local171 == 0) {
					local20[local44] = Static287.anInt5668;
				} else if (local171 == 1) {
					local20[local44] = Static192.anInt5396;
				} else if (local171 == 3) {
					local20[local44] = Static48.anInt1032;
				} else if (local171 == 4) {
					local20[local44] = Static120.anInt2325;
				} else if (local171 == 2) {
					local20[local44] = Static192.anInt5396 - Static287.anInt5668;
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "(B)V")
	private void method428() {
		@Pc(12) Random local12 = new Random((long) this.anInt548);
		this.aShortArray3 = new short[512];
		if (this.anInt539 > 0) {
			for (@Pc(31) int local31 = 0; local31 < 512; local31++) {
				this.aShortArray3[local31] = (short) Static14.method284(this.anInt539, local12);
			}
		}
	}
}
