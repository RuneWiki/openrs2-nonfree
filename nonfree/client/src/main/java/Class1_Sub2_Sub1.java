import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class1_Sub2_Sub1 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ag", name = "G", descriptor = "[B")
	private byte[] aByteArray2 = new byte[512];

	@OriginalMember(owner = "client!ag", name = "J", descriptor = "I")
	private int anInt200 = 0;

	@OriginalMember(owner = "client!ag", name = "P", descriptor = "I")
	private int anInt206 = 2048;

	@OriginalMember(owner = "client!ag", name = "R", descriptor = "[S")
	private short[] aShortArray1 = new short[512];

	@OriginalMember(owner = "client!ag", name = "V", descriptor = "I")
	private int anInt209 = 2;

	@OriginalMember(owner = "client!ag", name = "L", descriptor = "I")
	private int anInt202 = 1;

	@OriginalMember(owner = "client!ag", name = "Z", descriptor = "I")
	private int anInt213 = 5;

	@OriginalMember(owner = "client!ag", name = "Y", descriptor = "I")
	private int anInt212 = 5;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "(B)V")
	private void method282() {
		@Pc(12) Random local12 = new Random((long) this.anInt200);
		this.aShortArray1 = new short[512];
		if (this.anInt206 > 0) {
			for (@Pc(32) int local32 = 0; local32 < 512; local32++) {
				this.aShortArray1[local32] = (short) Static263.method4610(local12, this.anInt206);
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5662(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass84_41.method2422(arg0);
		if (super.aClass84_41.aBoolean227) {
			@Pc(30) int local30 = Static66.anIntArray158[arg0] * this.anInt212 + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static251.anInt6509; local40++) {
				Static218.anInt4275 = Integer.MAX_VALUE;
				Static39.anInt907 = Integer.MAX_VALUE;
				Static294.anInt5736 = Integer.MAX_VALUE;
				Static230.anInt4530 = Integer.MAX_VALUE;
				@Pc(59) int local59 = Static7.anIntArray23[local40] * this.anInt213 + 2048;
				@Pc(63) int local63 = local59 >> 12;
				@Pc(67) int local67 = local63 + 1;
				@Pc(157) int local157;
				for (@Pc(71) int local71 = local34 - 1; local71 <= local38; local71++) {
					@Pc(96) int local96 = this.aByteArray2[(this.anInt212 <= local71 ? local71 - this.anInt212 : local71) & 0xFF] & 0xFF;
					for (@Pc(100) int local100 = local63 - 1; local100 <= local67; local100++) {
						@Pc(129) int local129 = (this.aByteArray2[(this.anInt213 <= local100 ? local100 - this.anInt213 : local100) + local96 & 0xFF] & 0xFF) * 2;
						@Pc(133) int local133 = local129 + 1;
						@Pc(143) int local143 = local59 - this.aShortArray1[local129] - (local100 << 12);
						@Pc(154) int local154 = local30 - this.aShortArray1[local133] - (local71 << 12);
						local157 = this.anInt202;
						@Pc(191) int local191;
						if (local157 == 1) {
							local191 = local143 * local143 + local154 * local154 >> 12;
						} else if (local157 == 3) {
							local143 = local143 < 0 ? -local143 : local143;
							local154 = local154 >= 0 ? local154 : -local154;
							local191 = local154 < local143 ? local143 : local154;
						} else if (local157 == 4) {
							local143 = (int) (Math.sqrt((double) ((float) (local143 < 0 ? -local143 : local143) / 4096.0F)) * 4096.0D);
							local154 = (int) (Math.sqrt((double) ((float) (local154 >= 0 ? local154 : -local154) / 4096.0F)) * 4096.0D);
							local191 = local143 + local154;
							local191 = local191 * local191 >> 12;
						} else if (local157 == 5) {
							local143 *= local143;
							local154 *= local154;
							local191 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local154 + local143) / 1.6777216E7F))) * 4096.0D);
						} else if (local157 == 2) {
							local191 = (local143 >= 0 ? local143 : -local143) + (local154 < 0 ? -local154 : local154);
						} else {
							local191 = (int) (Math.sqrt((double) ((float) (local143 * local143 + local154 * local154) / 1.6777216E7F)) * 4096.0D);
						}
						if (local191 < Static230.anInt4530) {
							Static218.anInt4275 = Static39.anInt907;
							Static39.anInt907 = Static294.anInt5736;
							Static294.anInt5736 = Static230.anInt4530;
							Static230.anInt4530 = local191;
						} else if (local191 < Static294.anInt5736) {
							Static218.anInt4275 = Static39.anInt907;
							Static39.anInt907 = Static294.anInt5736;
							Static294.anInt5736 = local191;
						} else if (local191 < Static39.anInt907) {
							Static218.anInt4275 = Static39.anInt907;
							Static39.anInt907 = local191;
						} else if (local191 < Static218.anInt4275) {
							Static218.anInt4275 = local191;
						}
					}
				}
				local157 = this.anInt209;
				if (local157 == 0) {
					local17[local40] = Static230.anInt4530;
				} else if (local157 == 1) {
					local17[local40] = Static294.anInt5736;
				} else if (local157 == 3) {
					local17[local40] = Static39.anInt907;
				} else if (local157 == 4) {
					local17[local40] = Static218.anInt4275;
				} else if (local157 == 2) {
					local17[local40] = Static294.anInt5736 - Static230.anInt4530;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)V")
	@Override
	public void method5661() {
		this.aByteArray2 = Static310.method5232(this.anInt200);
		this.method282();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt213 = this.anInt212 = arg1.method3141();
		} else if (arg0 == 1) {
			this.anInt200 = arg1.method3141();
		} else if (arg0 == 2) {
			this.anInt206 = arg1.method3115();
		} else if (arg0 == 3) {
			this.anInt209 = arg1.method3141();
		} else if (arg0 == 4) {
			this.anInt202 = arg1.method3141();
		} else if (arg0 == 5) {
			this.anInt213 = arg1.method3141();
		} else if (arg0 == 6) {
			this.anInt212 = arg1.method3141();
		}
	}
}
