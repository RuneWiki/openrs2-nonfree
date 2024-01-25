import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class6_Sub1_Sub11 extends Class6_Sub1 {

	@OriginalMember(owner = "client!gb", name = "E", descriptor = "I")
	private int anInt2875 = 2048;

	@OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
	private int anInt2882 = 5;

	@OriginalMember(owner = "client!gb", name = "G", descriptor = "I")
	private int anInt2877 = 2;

	@OriginalMember(owner = "client!gb", name = "I", descriptor = "I")
	private int anInt2879 = 1;

	@OriginalMember(owner = "client!gb", name = "C", descriptor = "[S")
	private short[] aShortArray54 = new short[512];

	@OriginalMember(owner = "client!gb", name = "N", descriptor = "I")
	private int anInt2884 = 5;

	@OriginalMember(owner = "client!gb", name = "O", descriptor = "I")
	private int anInt2885 = 0;

	@OriginalMember(owner = "client!gb", name = "Q", descriptor = "[B")
	private byte[] aByteArray32 = new byte[512];

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Z)V")
	private void method2453() {
		@Pc(12) Random local12 = new Random((long) this.anInt2885);
		this.aShortArray54 = new short[512];
		if (this.anInt2875 > 0) {
			for (@Pc(24) int local24 = 0; local24 < 512; local24++) {
				this.aShortArray54[local24] = (short) Static316.method4556(local12, this.anInt2875);
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(B)V")
	@Override
	public void method8964() {
		this.aByteArray32 = Static263.method3891(this.anInt2885);
		this.method2453();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass135_41.method3057(arg0);
		if (super.aClass135_41.aBoolean210) {
			@Pc(24) int local24 = this.anInt2884 * Static230.anIntArray222[arg0] + 2048;
			@Pc(28) int local28 = local24 >> 12;
			@Pc(32) int local32 = local28 + 1;
			for (@Pc(34) int local34 = 0; local34 < Static479.anInt8231; local34++) {
				Static4.anInt81 = Integer.MAX_VALUE;
				Static578.anInt9543 = Integer.MAX_VALUE;
				Static425.anInt7329 = Integer.MAX_VALUE;
				Static426.anInt7555 = Integer.MAX_VALUE;
				@Pc(54) int local54 = Static205.anIntArray199[local34] * this.anInt2882 + 2048;
				@Pc(58) int local58 = local54 >> 12;
				@Pc(62) int local62 = local58 + 1;
				@Pc(149) int local149;
				for (@Pc(66) int local66 = local28 - 1; local66 <= local32; local66++) {
					@Pc(91) int local91 = this.aByteArray32[(this.anInt2884 <= local66 ? local66 - this.anInt2884 : local66) & 0xFF] & 0xFF;
					for (@Pc(95) int local95 = local58 - 1; local95 <= local62; local95++) {
						@Pc(120) int local120 = (this.aByteArray32[local91 + (local95 >= this.anInt2882 ? local95 - this.anInt2882 : local95) & 0xFF] & 0xFF) * 2;
						@Pc(124) int local124 = -(local95 << 12);
						@Pc(128) int local128 = local120 + 1;
						@Pc(133) int local133 = local124 + local54 - this.aShortArray54[local120];
						@Pc(146) int local146 = local24 - this.aShortArray54[local128] - (local66 << 12);
						local149 = this.anInt2879;
						@Pc(180) int local180;
						if (local149 == 1) {
							local180 = local146 * local146 + local133 * local133 >> 12;
						} else if (local149 == 3) {
							local133 = local133 < 0 ? -local133 : local133;
							local146 = local146 < 0 ? -local146 : local146;
							local180 = local146 >= local133 ? local146 : local133;
						} else if (local149 == 4) {
							local133 = (int) (Math.sqrt((double) ((float) (local133 >= 0 ? local133 : -local133) / 4096.0F)) * 4096.0D);
							local146 = (int) (Math.sqrt((double) ((float) (local146 < 0 ? -local146 : local146) / 4096.0F)) * 4096.0D);
							local180 = local133 + local146;
							local180 = local180 * local180 >> 12;
						} else if (local149 == 5) {
							local146 *= local146;
							local133 *= local133;
							local180 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local133 + local146) / 1.6777216E7F))) * 4096.0D);
						} else if (local149 == 2) {
							local180 = (local146 >= 0 ? local146 : -local146) + (local133 < 0 ? -local133 : local133);
						} else {
							local180 = (int) (Math.sqrt((double) ((float) (local146 * local146 + local133 * local133) / 1.6777216E7F)) * 4096.0D);
						}
						if (local180 < Static426.anInt7555) {
							Static4.anInt81 = Static578.anInt9543;
							Static578.anInt9543 = Static425.anInt7329;
							Static425.anInt7329 = Static426.anInt7555;
							Static426.anInt7555 = local180;
						} else if (Static425.anInt7329 > local180) {
							Static4.anInt81 = Static578.anInt9543;
							Static578.anInt9543 = Static425.anInt7329;
							Static425.anInt7329 = local180;
						} else if (Static578.anInt9543 > local180) {
							Static4.anInt81 = Static578.anInt9543;
							Static578.anInt9543 = local180;
						} else if (Static4.anInt81 > local180) {
							Static4.anInt81 = local180;
						}
					}
				}
				local149 = this.anInt2877;
				if (local149 == 0) {
					local11[local34] = Static426.anInt7555;
				} else if (local149 == 1) {
					local11[local34] = Static425.anInt7329;
				} else if (local149 == 3) {
					local11[local34] = Static578.anInt9543;
				} else if (local149 == 4) {
					local11[local34] = Static4.anInt81;
				} else if (local149 == 2) {
					local11[local34] = Static425.anInt7329 - Static426.anInt7555;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2882 = this.anInt2884 = arg0.method8374();
		} else if (arg1 == 1) {
			this.anInt2885 = arg0.method8374();
		} else if (arg1 == 2) {
			this.anInt2875 = arg0.method8363();
		} else if (arg1 == 3) {
			this.anInt2877 = arg0.method8374();
		} else if (arg1 == 4) {
			this.anInt2879 = arg0.method8374();
		} else if (arg1 == 5) {
			this.anInt2882 = arg0.method8374();
		} else if (arg1 == 6) {
			this.anInt2884 = arg0.method8374();
		}
	}
}
