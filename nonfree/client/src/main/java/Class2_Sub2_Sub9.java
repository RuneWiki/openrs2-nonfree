import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class2_Sub2_Sub9 extends Class2_Sub2 {

	@OriginalMember(owner = "client!h", name = "V", descriptor = "I")
	private int anInt1680 = 0;

	@OriginalMember(owner = "client!h", name = "fb", descriptor = "I")
	private int anInt1685 = 2;

	@OriginalMember(owner = "client!h", name = "hb", descriptor = "[S")
	private short[] aShortArray52 = new short[512];

	@OriginalMember(owner = "client!h", name = "lb", descriptor = "I")
	private int anInt1689 = 1;

	@OriginalMember(owner = "client!h", name = "Z", descriptor = "I")
	private int anInt1682 = 2048;

	@OriginalMember(owner = "client!h", name = "qb", descriptor = "[B")
	private byte[] aByteArray23 = new byte[512];

	@OriginalMember(owner = "client!h", name = "pb", descriptor = "I")
	private int anInt1693 = 5;

	@OriginalMember(owner = "client!h", name = "jb", descriptor = "I")
	private int anInt1687 = 5;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1693 = this.anInt1687 = arg0.method2122();
		} else if (arg1 == 1) {
			this.anInt1680 = arg0.method2122();
		} else if (arg1 == 2) {
			this.anInt1682 = arg0.method2095();
		} else if (arg1 == 3) {
			this.anInt1685 = arg0.method2122();
		} else if (arg1 == 4) {
			this.anInt1689 = arg0.method2122();
		} else if (arg1 == 5) {
			this.anInt1693 = arg0.method2122();
		} else if (arg1 == 6) {
			this.anInt1687 = arg0.method2122();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3961(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass16_41.method300(arg0);
		if (super.aClass16_41.aBoolean12) {
			@Pc(30) int local30 = this.anInt1687 * Static157.anIntArray604[arg0] + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static54.anInt953; local40++) {
				Static177.anInt4107 = Integer.MAX_VALUE;
				Static79.anInt1725 = Integer.MAX_VALUE;
				Static100.anInt2199 = Integer.MAX_VALUE;
				Static114.anInt2555 = Integer.MAX_VALUE;
				@Pc(59) int local59 = this.anInt1693 * Static179.anIntArray682[local40] + 2048;
				@Pc(63) int local63 = local59 >> 12;
				@Pc(67) int local67 = local63 + 1;
				@Pc(155) int local155;
				for (@Pc(71) int local71 = local34 - 1; local71 <= local38; local71++) {
					@Pc(92) int local92 = this.aByteArray23[(local71 < this.anInt1687 ? local71 : local71 - this.anInt1687) & 0xFF] & 0xFF;
					for (@Pc(96) int local96 = local63 - 1; local96 <= local67; local96++) {
						@Pc(125) int local125 = (this.aByteArray23[(local96 >= this.anInt1693 ? local96 - this.anInt1693 : local96) + local92 & 0xFF] & 0xFF) * 2;
						@Pc(129) int local129 = -(local96 << 12);
						@Pc(133) int local133 = local125 + 1;
						@Pc(139) int local139 = local129 + local59 - this.aShortArray52[local125];
						@Pc(152) int local152 = local30 - this.aShortArray52[local133] - (local71 << 12);
						local155 = this.anInt1689;
						@Pc(184) int local184;
						if (local155 == 1) {
							local184 = local152 * local152 + local139 * local139 >> 12;
						} else if (local155 == 3) {
							local139 = local139 >= 0 ? local139 : -local139;
							local152 = local152 >= 0 ? local152 : -local152;
							local184 = local152 < local139 ? local139 : local152;
						} else if (local155 == 4) {
							local139 = (int) (Math.sqrt((double) ((float) (local139 < 0 ? -local139 : local139) / 4096.0F)) * 4096.0D);
							local152 = (int) (Math.sqrt((double) ((float) (local152 >= 0 ? local152 : -local152) / 4096.0F)) * 4096.0D);
							local184 = local139 + local152;
							local184 = local184 * local184 >> 12;
						} else if (local155 == 5) {
							local152 *= local152;
							local139 *= local139;
							local184 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local152 + local139) / 1.6777216E7F))) * 4096.0D);
						} else if (local155 == 2) {
							local184 = (local152 < 0 ? -local152 : local152) + (local139 >= 0 ? local139 : -local139);
						} else {
							local184 = (int) (Math.sqrt((double) ((float) (local152 * local152 + local139 * local139) / 1.6777216E7F)) * 4096.0D);
						}
						if (local184 < Static114.anInt2555) {
							Static177.anInt4107 = Static79.anInt1725;
							Static79.anInt1725 = Static100.anInt2199;
							Static100.anInt2199 = Static114.anInt2555;
							Static114.anInt2555 = local184;
						} else if (Static100.anInt2199 > local184) {
							Static177.anInt4107 = Static79.anInt1725;
							Static79.anInt1725 = Static100.anInt2199;
							Static100.anInt2199 = local184;
						} else if (Static79.anInt1725 > local184) {
							Static177.anInt4107 = Static79.anInt1725;
							Static79.anInt1725 = local184;
						} else if (local184 < Static177.anInt4107) {
							Static177.anInt4107 = local184;
						}
					}
				}
				local155 = this.anInt1685;
				if (local155 == 0) {
					local17[local40] = Static114.anInt2555;
				} else if (local155 == 1) {
					local17[local40] = Static100.anInt2199;
				} else if (local155 == 3) {
					local17[local40] = Static79.anInt1725;
				} else if (local155 == 4) {
					local17[local40] = Static177.anInt4107;
				} else if (local155 == 2) {
					local17[local40] = Static100.anInt2199 - Static114.anInt2555;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V")
	@Override
	public void method3958() {
		this.aByteArray23 = Static185.method3421(this.anInt1680);
		this.method1315();
	}

	@OriginalMember(owner = "client!h", name = "k", descriptor = "(I)V")
	private void method1315() {
		@Pc(12) Random local12 = new Random((long) this.anInt1680);
		this.aShortArray52 = new short[512];
		if (this.anInt1682 > 0) {
			for (@Pc(27) int local27 = 0; local27 < 512; local27++) {
				this.aShortArray52[local27] = (short) Static8.method184(local12, this.anInt1682);
			}
		}
	}
}
