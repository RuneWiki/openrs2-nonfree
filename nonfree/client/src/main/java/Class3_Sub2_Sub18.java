import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class3_Sub2_Sub18 extends Class3_Sub2 {

	@OriginalMember(owner = "client!io", name = "M", descriptor = "[S")
	private short[] aShortArray51 = new short[512];

	@OriginalMember(owner = "client!io", name = "X", descriptor = "I")
	private int anInt2368 = 5;

	@OriginalMember(owner = "client!io", name = "K", descriptor = "I")
	private int anInt2358 = 2;

	@OriginalMember(owner = "client!io", name = "V", descriptor = "I")
	private int anInt2367 = 1;

	@OriginalMember(owner = "client!io", name = "Y", descriptor = "I")
	private int anInt2369 = 2048;

	@OriginalMember(owner = "client!io", name = "Z", descriptor = "I")
	private int anInt2370 = 5;

	@OriginalMember(owner = "client!io", name = "S", descriptor = "[B")
	private byte[] aByteArray34 = new byte[512];

	@OriginalMember(owner = "client!io", name = "N", descriptor = "I")
	private int anInt2360 = 0;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(B)V")
	private void method2076() {
		@Pc(12) Random local12 = new Random((long) this.anInt2360);
		this.aShortArray51 = new short[512];
		if (this.anInt2369 > 0) {
			for (@Pc(29) int local29 = 0; local29 < 512; local29++) {
				this.aShortArray51[local29] = (short) Static276.method4529(this.anInt2369, local12);
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "d", descriptor = "(I)V")
	@Override
	public void method4952() {
		this.aByteArray34 = Static100.method1605(this.anInt2360);
		this.method2076();
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass168_41.method4366(arg0);
		if (this.aClass168_41.aBoolean373) {
			@Pc(30) int local30 = this.anInt2368 * Static205.anIntArray450[arg0] + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static22.anInt421; local40++) {
				Static244.anInt4944 = Integer.MAX_VALUE;
				Static59.anInt1142 = Integer.MAX_VALUE;
				Static196.anInt3826 = Integer.MAX_VALUE;
				Static17.anInt336 = Integer.MAX_VALUE;
				@Pc(60) int local60 = this.anInt2370 * Static185.anIntArray424[local40] + 2048;
				@Pc(64) int local64 = local60 >> 12;
				@Pc(68) int local68 = local64 + 1;
				@Pc(159) int local159;
				for (@Pc(72) int local72 = local34 - 1; local72 <= local38; local72++) {
					@Pc(97) int local97 = this.aByteArray34[(this.anInt2368 > local72 ? local72 : local72 - this.anInt2368) & 0xFF] & 0xFF;
					for (@Pc(101) int local101 = local64 - 1; local101 <= local68; local101++) {
						@Pc(131) int local131 = (this.aByteArray34[local97 + (local101 < this.anInt2370 ? local101 : local101 - this.anInt2370) & 0xFF] & 0xFF) * 2;
						@Pc(135) int local135 = local131 + 1;
						@Pc(144) int local144 = local60 - this.aShortArray51[local131] - (local101 << 12);
						@Pc(156) int local156 = local30 - this.aShortArray51[local135] - (local72 << 12);
						local159 = this.anInt2367;
						@Pc(199) int local199;
						if (local159 == 1) {
							local199 = local144 * local144 + local156 * local156 >> 12;
						} else if (local159 == 3) {
							local144 = local144 < 0 ? -local144 : local144;
							local156 = local156 >= 0 ? local156 : -local156;
							local199 = local156 < local144 ? local144 : local156;
						} else if (local159 == 4) {
							local144 = (int) (Math.sqrt((double) ((float) (local144 >= 0 ? local144 : -local144) / 4096.0F)) * 4096.0D);
							local156 = (int) (Math.sqrt((double) ((float) (local156 < 0 ? -local156 : local156) / 4096.0F)) * 4096.0D);
							local199 = local144 + local156;
							local199 = local199 * local199 >> 12;
						} else if (local159 == 5) {
							local156 *= local156;
							local144 *= local144;
							local199 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local144 + local156) / 1.6777216E7F))) * 4096.0D);
						} else if (local159 == 2) {
							local199 = (local144 >= 0 ? local144 : -local144) + (local156 >= 0 ? local156 : -local156);
						} else {
							local199 = (int) (Math.sqrt((double) ((float) (local156 * local156 + local144 * local144) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static17.anInt336 > local199) {
							Static244.anInt4944 = Static59.anInt1142;
							Static59.anInt1142 = Static196.anInt3826;
							Static196.anInt3826 = Static17.anInt336;
							Static17.anInt336 = local199;
						} else if (Static196.anInt3826 > local199) {
							Static244.anInt4944 = Static59.anInt1142;
							Static59.anInt1142 = Static196.anInt3826;
							Static196.anInt3826 = local199;
						} else if (local199 < Static59.anInt1142) {
							Static244.anInt4944 = Static59.anInt1142;
							Static59.anInt1142 = local199;
						} else if (Static244.anInt4944 > local199) {
							Static244.anInt4944 = local199;
						}
					}
				}
				local159 = this.anInt2358;
				if (local159 == 0) {
					local17[local40] = Static17.anInt336;
				} else if (local159 == 1) {
					local17[local40] = Static196.anInt3826;
				} else if (local159 == 3) {
					local17[local40] = Static59.anInt1142;
				} else if (local159 == 4) {
					local17[local40] = Static244.anInt4944;
				} else if (local159 == 2) {
					local17[local40] = Static196.anInt3826 - Static17.anInt336;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt2370 = this.anInt2368 = arg1.method3915();
		} else if (arg0 == 1) {
			this.anInt2360 = arg1.method3915();
		} else if (arg0 == 2) {
			this.anInt2369 = arg1.method3948();
		} else if (arg0 == 3) {
			this.anInt2358 = arg1.method3915();
		} else if (arg0 == 4) {
			this.anInt2367 = arg1.method3915();
		} else if (arg0 == 5) {
			this.anInt2370 = arg1.method3915();
		} else if (arg0 == 6) {
			this.anInt2368 = arg1.method3915();
		}
	}
}
