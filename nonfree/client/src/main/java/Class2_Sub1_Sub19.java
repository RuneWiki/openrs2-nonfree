import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class2_Sub1_Sub19 extends Class2_Sub1 {

	@OriginalMember(owner = "client!l", name = "Q", descriptor = "I")
	private int anInt2576 = 5;

	@OriginalMember(owner = "client!l", name = "U", descriptor = "I")
	private int anInt2580 = 2;

	@OriginalMember(owner = "client!l", name = "W", descriptor = "[B")
	private byte[] aByteArray32 = new byte[512];

	@OriginalMember(owner = "client!l", name = "eb", descriptor = "I")
	private int anInt2586 = 2048;

	@OriginalMember(owner = "client!l", name = "hb", descriptor = "I")
	private int anInt2588 = 0;

	@OriginalMember(owner = "client!l", name = "jb", descriptor = "I")
	private int anInt2590 = 5;

	@OriginalMember(owner = "client!l", name = "V", descriptor = "[S")
	private short[] aShortArray74 = new short[512];

	@OriginalMember(owner = "client!l", name = "lb", descriptor = "I")
	private int anInt2591 = 1;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2590 = this.anInt2576 = arg0.method209();
		} else if (arg1 == 1) {
			this.anInt2588 = arg0.method209();
		} else if (arg1 == 2) {
			this.anInt2586 = arg0.method163();
		} else if (arg1 == 3) {
			this.anInt2580 = arg0.method209();
		} else if (arg1 == 4) {
			this.anInt2591 = arg0.method209();
		} else if (arg1 == 5) {
			this.anInt2590 = arg0.method209();
		} else if (arg1 == 6) {
			this.anInt2576 = arg0.method209();
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass73_41.method2249(arg0);
		if (super.aClass73_41.aBoolean188) {
			@Pc(30) int local30 = Static97.anIntArray240[arg0] * this.anInt2576 + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static62.anInt1675; local40++) {
				Static70.anInt1858 = Integer.MAX_VALUE;
				Static89.anInt2201 = Integer.MAX_VALUE;
				Static175.anInt4117 = Integer.MAX_VALUE;
				Static117.anInt2823 = Integer.MAX_VALUE;
				@Pc(59) int local59 = Static20.anIntArray45[local40] * this.anInt2590 + 2048;
				@Pc(63) int local63 = local59 >> 12;
				@Pc(67) int local67 = local63 + 1;
				@Pc(152) int local152;
				for (@Pc(71) int local71 = local34 - 1; local71 <= local38; local71++) {
					@Pc(92) int local92 = this.aByteArray32[(local71 < this.anInt2576 ? local71 : local71 - this.anInt2576) & 0xFF] & 0xFF;
					for (@Pc(96) int local96 = local63 - 1; local96 <= local67; local96++) {
						@Pc(122) int local122 = (this.aByteArray32[local92 + (this.anInt2590 <= local96 ? local96 - this.anInt2590 : local96) & 0xFF] & 0xFF) * 2;
						@Pc(127) int local127 = local122 + 1;
						@Pc(136) int local136 = local59 - this.aShortArray74[local122] - (local96 << 12);
						@Pc(149) int local149 = local30 - (local71 << 12) - this.aShortArray74[local127];
						local152 = this.anInt2591;
						@Pc(185) int local185;
						if (local152 == 1) {
							local185 = local136 * local136 + local149 * local149 >> 12;
						} else if (local152 == 3) {
							local149 = local149 >= 0 ? local149 : -local149;
							local136 = local136 < 0 ? -local136 : local136;
							local185 = local136 <= local149 ? local149 : local136;
						} else if (local152 == 4) {
							local136 = (int) (Math.sqrt((double) ((float) (local136 >= 0 ? local136 : -local136) / 4096.0F)) * 4096.0D);
							local149 = (int) (Math.sqrt((double) ((float) (local149 < 0 ? -local149 : local149) / 4096.0F)) * 4096.0D);
							local185 = local149 + local136;
							local185 = local185 * local185 >> 12;
						} else if (local152 == 5) {
							local136 *= local136;
							local149 *= local149;
							local185 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local136 + local149) / 1.6777216E7F))) * 4096.0D);
						} else if (local152 == 2) {
							local185 = (local149 >= 0 ? local149 : -local149) + (local136 < 0 ? -local136 : local136);
						} else {
							local185 = (int) (Math.sqrt((double) ((float) (local149 * local149 + local136 * local136) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static117.anInt2823 > local185) {
							Static70.anInt1858 = Static89.anInt2201;
							Static89.anInt2201 = Static175.anInt4117;
							Static175.anInt4117 = Static117.anInt2823;
							Static117.anInt2823 = local185;
						} else if (local185 < Static175.anInt4117) {
							Static70.anInt1858 = Static89.anInt2201;
							Static89.anInt2201 = Static175.anInt4117;
							Static175.anInt4117 = local185;
						} else if (local185 < Static89.anInt2201) {
							Static70.anInt1858 = Static89.anInt2201;
							Static89.anInt2201 = local185;
						} else if (local185 < Static70.anInt1858) {
							Static70.anInt1858 = local185;
						}
					}
				}
				local152 = this.anInt2580;
				if (local152 == 0) {
					local17[local40] = Static117.anInt2823;
				} else if (local152 == 1) {
					local17[local40] = Static175.anInt4117;
				} else if (local152 == 3) {
					local17[local40] = Static89.anInt2201;
				} else if (local152 == 4) {
					local17[local40] = Static70.anInt1858;
				} else if (local152 == 2) {
					local17[local40] = Static175.anInt4117 - Static117.anInt2823;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V")
	@Override
	public void method3207() {
		this.aByteArray32 = Static144.method2243(this.anInt2588);
		this.method1816();
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V")
	private void method1816() {
		@Pc(14) Random local14 = new Random((long) this.anInt2588);
		this.aShortArray74 = new short[512];
		if (this.anInt2586 > 0) {
			for (@Pc(26) int local26 = 0; local26 < 512; local26++) {
				this.aShortArray74[local26] = (short) Static105.method1788(this.anInt2586, local14);
			}
		}
	}
}
