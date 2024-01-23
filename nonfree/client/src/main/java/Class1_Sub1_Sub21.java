import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class1_Sub1_Sub21 extends Class1_Sub1 {

	@OriginalMember(owner = "client!jg", name = "G", descriptor = "[B")
	private byte[] aByteArray79 = new byte[512];

	@OriginalMember(owner = "client!jg", name = "F", descriptor = "I")
	private int anInt2534 = 2048;

	@OriginalMember(owner = "client!jg", name = "K", descriptor = "I")
	private int anInt2538 = 2;

	@OriginalMember(owner = "client!jg", name = "I", descriptor = "I")
	private int anInt2536 = 5;

	@OriginalMember(owner = "client!jg", name = "Q", descriptor = "I")
	private int anInt2544 = 0;

	@OriginalMember(owner = "client!jg", name = "H", descriptor = "I")
	private int anInt2535 = 5;

	@OriginalMember(owner = "client!jg", name = "P", descriptor = "I")
	private int anInt2543 = 1;

	@OriginalMember(owner = "client!jg", name = "T", descriptor = "[S")
	private short[] aShortArray53 = new short[512];

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2536 = this.anInt2535 = arg0.method1853();
		} else if (arg1 == 1) {
			this.anInt2544 = arg0.method1853();
		} else if (arg1 == 2) {
			this.anInt2534 = arg0.method1879();
		} else if (arg1 == 3) {
			this.anInt2538 = arg0.method1853();
		} else if (arg1 == 4) {
			this.anInt2543 = arg0.method1853();
		} else if (arg1 == 5) {
			this.anInt2536 = arg0.method1853();
		} else if (arg1 == 6) {
			this.anInt2535 = arg0.method1853();
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method4465(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass190_41.method4648(arg0);
		if (this.aClass190_41.aBoolean527) {
			@Pc(24) int local24 = Static10.anIntArray604[arg0] * this.anInt2535 + 2048;
			@Pc(28) int local28 = local24 >> 12;
			@Pc(32) int local32 = local28 + 1;
			for (@Pc(34) int local34 = 0; local34 < Static6.anInt4960; local34++) {
				Static284.anInt5159 = Integer.MAX_VALUE;
				Static55.anInt1174 = Integer.MAX_VALUE;
				Static75.anInt2048 = Integer.MAX_VALUE;
				Static97.anInt2086 = Integer.MAX_VALUE;
				@Pc(58) int local58 = Static298.anIntArray589[local34] * this.anInt2536 + 2048;
				@Pc(62) int local62 = local58 >> 12;
				@Pc(66) int local66 = local62 + 1;
				@Pc(165) int local165;
				for (@Pc(70) int local70 = local28 - 1; local70 <= local32; local70++) {
					@Pc(96) int local96 = this.aByteArray79[(this.anInt2535 <= local70 ? local70 - this.anInt2535 : local70) & 0xFF] & 0xFF;
					for (@Pc(100) int local100 = local62 - 1; local100 <= local66; local100++) {
						@Pc(135) int local135 = (this.aByteArray79[local96 + (local100 < this.anInt2536 ? local100 : local100 - this.anInt2536) & 0xFF] & 0xFF) * 2;
						@Pc(139) int local139 = local135 + 1;
						@Pc(149) int local149 = local58 - this.aShortArray53[local135] - (local100 << 12);
						@Pc(162) int local162 = local24 - this.aShortArray53[local139] - (local70 << 12);
						local165 = this.anInt2543;
						@Pc(197) int local197;
						if (local165 == 1) {
							local197 = local149 * local149 + local162 * local162 >> 12;
						} else if (local165 == 3) {
							local162 = local162 >= 0 ? local162 : -local162;
							local149 = local149 >= 0 ? local149 : -local149;
							local197 = local162 >= local149 ? local162 : local149;
						} else if (local165 == 4) {
							local149 = (int) (Math.sqrt((double) ((float) (local149 >= 0 ? local149 : -local149) / 4096.0F)) * 4096.0D);
							local162 = (int) (Math.sqrt((double) ((float) (local162 >= 0 ? local162 : -local162) / 4096.0F)) * 4096.0D);
							local197 = local162 + local149;
							local197 = local197 * local197 >> 12;
						} else if (local165 == 5) {
							local149 *= local149;
							local162 *= local162;
							local197 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local149 + local162) / 1.6777216E7F))) * 4096.0D);
						} else if (local165 == 2) {
							local197 = (local149 >= 0 ? local149 : -local149) + (local162 >= 0 ? local162 : -local162);
						} else {
							local197 = (int) (Math.sqrt((double) ((float) (local162 * local162 + local149 * local149) / 1.6777216E7F)) * 4096.0D);
						}
						if (local197 < Static97.anInt2086) {
							Static284.anInt5159 = Static55.anInt1174;
							Static55.anInt1174 = Static75.anInt2048;
							Static75.anInt2048 = Static97.anInt2086;
							Static97.anInt2086 = local197;
						} else if (local197 < Static75.anInt2048) {
							Static284.anInt5159 = Static55.anInt1174;
							Static55.anInt1174 = Static75.anInt2048;
							Static75.anInt2048 = local197;
						} else if (Static55.anInt1174 > local197) {
							Static284.anInt5159 = Static55.anInt1174;
							Static55.anInt1174 = local197;
						} else if (Static284.anInt5159 > local197) {
							Static284.anInt5159 = local197;
						}
					}
				}
				local165 = this.anInt2538;
				if (local165 == 0) {
					local11[local34] = Static97.anInt2086;
				} else if (local165 == 1) {
					local11[local34] = Static75.anInt2048;
				} else if (local165 == 3) {
					local11[local34] = Static55.anInt1174;
				} else if (local165 == 4) {
					local11[local34] = Static284.anInt5159;
				} else if (local165 == 2) {
					local11[local34] = Static75.anInt2048 - Static97.anInt2086;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "(I)V")
	private void method2263() {
		@Pc(12) Random local12 = new Random((long) this.anInt2544);
		this.aShortArray53 = new short[512];
		if (this.anInt2534 > 0) {
			for (@Pc(27) int local27 = 0; local27 < 512; local27++) {
				this.aShortArray53[local27] = (short) Static118.method2140(local12, this.anInt2534);
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "(B)V")
	@Override
	public void method4460() {
		this.aByteArray79 = Static210.method3472(this.anInt2544);
		this.method2263();
	}
}
