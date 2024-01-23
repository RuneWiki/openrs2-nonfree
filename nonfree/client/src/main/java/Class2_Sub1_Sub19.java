import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class2_Sub1_Sub19 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ln", name = "T", descriptor = "I")
	private int anInt3226 = 2;

	@OriginalMember(owner = "client!ln", name = "eb", descriptor = "[B")
	private byte[] aByteArray27 = new byte[512];

	@OriginalMember(owner = "client!ln", name = "bb", descriptor = "I")
	private int anInt3233 = 0;

	@OriginalMember(owner = "client!ln", name = "W", descriptor = "I")
	private int anInt3229 = 1;

	@OriginalMember(owner = "client!ln", name = "U", descriptor = "I")
	private int anInt3227 = 5;

	@OriginalMember(owner = "client!ln", name = "Q", descriptor = "[S")
	private short[] aShortArray40 = new short[512];

	@OriginalMember(owner = "client!ln", name = "fb", descriptor = "I")
	private int anInt3236 = 2048;

	@OriginalMember(owner = "client!ln", name = "Y", descriptor = "I")
	private int anInt3231 = 5;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "(B)V")
	private void method2648() {
		@Pc(12) Random local12 = new Random((long) this.anInt3233);
		this.aShortArray40 = new short[512];
		if (this.anInt3236 > 0) {
			for (@Pc(31) int local31 = 0; local31 < 512; local31++) {
				this.aShortArray40[local31] = (short) Static21.method459(this.anInt3236, local12);
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass136_41.method3410(arg0);
		if (this.aClass136_41.aBoolean349) {
			@Pc(30) int local30 = Static234.anIntArray435[arg0] * this.anInt3231 + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static114.anInt1359; local40++) {
				Static101.anInt6023 = Integer.MAX_VALUE;
				Static286.anInt5907 = Integer.MAX_VALUE;
				Static126.anInt2643 = Integer.MAX_VALUE;
				Static186.anInt3936 = Integer.MAX_VALUE;
				@Pc(64) int local64 = this.anInt3227 * Static281.anIntArray506[local40] + 2048;
				@Pc(68) int local68 = local64 >> 12;
				@Pc(72) int local72 = local68 + 1;
				@Pc(162) int local162;
				for (@Pc(76) int local76 = local34 - 1; local76 <= local38; local76++) {
					@Pc(102) int local102 = this.aByteArray27[(this.anInt3231 <= local76 ? local76 - this.anInt3231 : local76) & 0xFF] & 0xFF;
					for (@Pc(106) int local106 = local68 - 1; local106 <= local72; local106++) {
						@Pc(133) int local133 = (this.aByteArray27[local102 + (this.anInt3227 <= local106 ? local106 - this.anInt3227 : local106) & 0xFF] & 0xFF) * 2;
						@Pc(137) int local137 = local133 + 1;
						@Pc(146) int local146 = local64 - this.aShortArray40[local133] - (local106 << 12);
						@Pc(159) int local159 = local30 - (local76 << 12) - this.aShortArray40[local137];
						local162 = this.anInt3229;
						@Pc(196) int local196;
						if (local162 == 1) {
							local196 = local146 * local146 + local159 * local159 >> 12;
						} else if (local162 == 3) {
							local159 = local159 < 0 ? -local159 : local159;
							local146 = local146 >= 0 ? local146 : -local146;
							local196 = local146 > local159 ? local146 : local159;
						} else if (local162 == 4) {
							local146 = (int) (Math.sqrt((double) ((float) (local146 < 0 ? -local146 : local146) / 4096.0F)) * 4096.0D);
							local159 = (int) (Math.sqrt((double) ((float) (local159 < 0 ? -local159 : local159) / 4096.0F)) * 4096.0D);
							local196 = local159 + local146;
							local196 = local196 * local196 >> 12;
						} else if (local162 == 5) {
							local159 *= local159;
							local146 *= local146;
							local196 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local146 + local159) / 1.6777216E7F))) * 4096.0D);
						} else if (local162 == 2) {
							local196 = (local146 >= 0 ? local146 : -local146) + (local159 >= 0 ? local159 : -local159);
						} else {
							local196 = (int) (Math.sqrt((double) ((float) (local146 * local146 + local159 * local159) / 1.6777216E7F)) * 4096.0D);
						}
						if (local196 < Static186.anInt3936) {
							Static101.anInt6023 = Static286.anInt5907;
							Static286.anInt5907 = Static126.anInt2643;
							Static126.anInt2643 = Static186.anInt3936;
							Static186.anInt3936 = local196;
						} else if (Static126.anInt2643 > local196) {
							Static101.anInt6023 = Static286.anInt5907;
							Static286.anInt5907 = Static126.anInt2643;
							Static126.anInt2643 = local196;
						} else if (Static286.anInt5907 > local196) {
							Static101.anInt6023 = Static286.anInt5907;
							Static286.anInt5907 = local196;
						} else if (Static101.anInt6023 > local196) {
							Static101.anInt6023 = local196;
						}
					}
				}
				local162 = this.anInt3226;
				if (local162 == 0) {
					local17[local40] = Static186.anInt3936;
				} else if (local162 == 1) {
					local17[local40] = Static126.anInt2643;
				} else if (local162 == 3) {
					local17[local40] = Static286.anInt5907;
				} else if (local162 == 4) {
					local17[local40] = Static101.anInt6023;
				} else if (local162 == 2) {
					local17[local40] = Static126.anInt2643 - Static186.anInt3936;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3227 = this.anInt3231 = arg0.method4261();
		} else if (arg1 == 1) {
			this.anInt3233 = arg0.method4261();
		} else if (arg1 == 2) {
			this.anInt3236 = arg0.method4242();
		} else if (arg1 == 3) {
			this.anInt3226 = arg0.method4261();
		} else if (arg1 == 4) {
			this.anInt3229 = arg0.method4261();
		} else if (arg1 == 5) {
			this.anInt3227 = arg0.method4261();
		} else if (arg1 == 6) {
			this.anInt3231 = arg0.method4261();
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)V")
	@Override
	public void method4934() {
		this.aByteArray27 = Static162.method2816(this.anInt3233);
		this.method2648();
	}
}
