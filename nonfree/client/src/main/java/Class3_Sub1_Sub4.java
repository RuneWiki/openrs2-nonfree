import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class3_Sub1_Sub4 extends Class3_Sub1 {

	@OriginalMember(owner = "client!cq", name = "L", descriptor = "I")
	private int anInt1964 = 2;

	@OriginalMember(owner = "client!cq", name = "M", descriptor = "I")
	private int anInt1965 = 5;

	@OriginalMember(owner = "client!cq", name = "N", descriptor = "[S")
	private short[] aShortArray39 = new short[512];

	@OriginalMember(owner = "client!cq", name = "T", descriptor = "I")
	private int anInt1969 = 2048;

	@OriginalMember(owner = "client!cq", name = "Q", descriptor = "[B")
	private byte[] aByteArray18 = new byte[512];

	@OriginalMember(owner = "client!cq", name = "I", descriptor = "I")
	private int anInt1961 = 1;

	@OriginalMember(owner = "client!cq", name = "S", descriptor = "I")
	private int anInt1968 = 5;

	@OriginalMember(owner = "client!cq", name = "R", descriptor = "I")
	private int anInt1967 = 0;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(B)V")
	private void method1679() {
		@Pc(12) Random local12 = new Random((long) this.anInt1967);
		this.aShortArray39 = new short[512];
		if (this.anInt1969 > 0) {
			for (@Pc(29) int local29 = 0; local29 < 512; local29++) {
				this.aShortArray39[local29] = (short) Static231.method3920(local12, this.anInt1969);
			}
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1965 = this.anInt1968 = arg0.method3118();
		} else if (arg1 == 1) {
			this.anInt1967 = arg0.method3118();
		} else if (arg1 == 2) {
			this.anInt1969 = arg0.method3109();
		} else if (arg1 == 3) {
			this.anInt1964 = arg0.method3118();
		} else if (arg1 == 4) {
			this.anInt1961 = arg0.method3118();
		} else if (arg1 == 5) {
			this.anInt1965 = arg0.method3118();
		} else if (arg1 == 6) {
			this.anInt1968 = arg0.method3118();
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
	@Override
	public void method7763() {
		this.aByteArray18 = Static136.method2645(this.anInt1967);
		this.method1679();
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7767(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass85_41.method2548(arg0);
		if (super.aClass85_41.aBoolean239) {
			@Pc(30) int local30 = Static9.anIntArray15[arg0] * this.anInt1968 + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static206.anInt4182; local40++) {
				Static376.anInt6362 = Integer.MAX_VALUE;
				Static119.anInt2718 = Integer.MAX_VALUE;
				Static414.anInt6961 = Integer.MAX_VALUE;
				Static537.anInt4380 = Integer.MAX_VALUE;
				@Pc(59) int local59 = Static329.anIntArray456[local40] * this.anInt1965 + 2048;
				@Pc(63) int local63 = local59 >> 12;
				@Pc(67) int local67 = local63 + 1;
				@Pc(155) int local155;
				for (@Pc(71) int local71 = local34 - 1; local71 <= local38; local71++) {
					@Pc(96) int local96 = this.aByteArray18[(this.anInt1968 > local71 ? local71 : local71 - this.anInt1968) & 0xFF] & 0xFF;
					for (@Pc(100) int local100 = local63 - 1; local100 <= local67; local100++) {
						@Pc(125) int local125 = (this.aByteArray18[(local100 >= this.anInt1965 ? local100 - this.anInt1965 : local100) + local96 & 0xFF] & 0xFF) * 2;
						@Pc(130) int local130 = -(local100 << 12);
						@Pc(134) int local134 = local125 + 1;
						@Pc(139) int local139 = local59 + local130 - this.aShortArray39[local125];
						@Pc(152) int local152 = local30 - this.aShortArray39[local134] - (local71 << 12);
						local155 = this.anInt1961;
						@Pc(191) int local191;
						if (local155 == 1) {
							local191 = local139 * local139 + local152 * local152 >> 12;
						} else if (local155 == 3) {
							local139 = local139 >= 0 ? local139 : -local139;
							local152 = local152 < 0 ? -local152 : local152;
							local191 = local139 <= local152 ? local152 : local139;
						} else if (local155 == 4) {
							local139 = (int) (Math.sqrt((double) ((float) (local139 >= 0 ? local139 : -local139) / 4096.0F)) * 4096.0D);
							local152 = (int) (Math.sqrt((double) ((float) (local152 >= 0 ? local152 : -local152) / 4096.0F)) * 4096.0D);
							local191 = local139 + local152;
							local191 = local191 * local191 >> 12;
						} else if (local155 == 5) {
							local139 *= local139;
							local152 *= local152;
							local191 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local139 + local152) / 1.6777216E7F))) * 4096.0D);
						} else if (local155 == 2) {
							local191 = (local139 < 0 ? -local139 : local139) + (local152 >= 0 ? local152 : -local152);
						} else {
							local191 = (int) (Math.sqrt((double) ((float) (local139 * local139 + local152 * local152) / 1.6777216E7F)) * 4096.0D);
						}
						if (local191 < Static537.anInt4380) {
							Static376.anInt6362 = Static119.anInt2718;
							Static119.anInt2718 = Static414.anInt6961;
							Static414.anInt6961 = Static537.anInt4380;
							Static537.anInt4380 = local191;
						} else if (Static414.anInt6961 > local191) {
							Static376.anInt6362 = Static119.anInt2718;
							Static119.anInt2718 = Static414.anInt6961;
							Static414.anInt6961 = local191;
						} else if (local191 < Static119.anInt2718) {
							Static376.anInt6362 = Static119.anInt2718;
							Static119.anInt2718 = local191;
						} else if (local191 < Static376.anInt6362) {
							Static376.anInt6362 = local191;
						}
					}
				}
				local155 = this.anInt1964;
				if (local155 == 0) {
					local17[local40] = Static537.anInt4380;
				} else if (local155 == 1) {
					local17[local40] = Static414.anInt6961;
				} else if (local155 == 3) {
					local17[local40] = Static119.anInt2718;
				} else if (local155 == 4) {
					local17[local40] = Static376.anInt6362;
				} else if (local155 == 2) {
					local17[local40] = Static414.anInt6961 - Static537.anInt4380;
				}
			}
		}
		return local17;
	}
}
