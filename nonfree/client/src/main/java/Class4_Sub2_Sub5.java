import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class4_Sub2_Sub5 extends Class4_Sub2 {

	@OriginalMember(owner = "client!cn", name = "J", descriptor = "I")
	private int anInt1531 = 2;

	@OriginalMember(owner = "client!cn", name = "N", descriptor = "I")
	private int anInt1533 = 5;

	@OriginalMember(owner = "client!cn", name = "S", descriptor = "I")
	private int anInt1537 = 5;

	@OriginalMember(owner = "client!cn", name = "W", descriptor = "I")
	private int anInt1541 = 0;

	@OriginalMember(owner = "client!cn", name = "T", descriptor = "I")
	private int anInt1538 = 1;

	@OriginalMember(owner = "client!cn", name = "X", descriptor = "[S")
	private short[] aShortArray15 = new short[512];

	@OriginalMember(owner = "client!cn", name = "Q", descriptor = "[B")
	private byte[] aByteArray11 = new byte[512];

	@OriginalMember(owner = "client!cn", name = "cb", descriptor = "I")
	private int anInt1544 = 2048;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5838(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass9_41.method279(arg0);
		if (super.aClass9_41.aBoolean15) {
			@Pc(30) int local30 = Static293.anIntArray461[arg0] * this.anInt1533 + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static350.anInt6330; local40++) {
				Static244.anInt4449 = Integer.MAX_VALUE;
				Static224.anInt4141 = Integer.MAX_VALUE;
				Static106.anInt2250 = Integer.MAX_VALUE;
				Static335.anInt5876 = Integer.MAX_VALUE;
				@Pc(59) int local59 = this.anInt1537 * Static197.anIntArray566[local40] + 2048;
				@Pc(63) int local63 = local59 >> 12;
				@Pc(67) int local67 = local63 + 1;
				@Pc(153) int local153;
				for (@Pc(71) int local71 = local34 - 1; local71 <= local38; local71++) {
					@Pc(95) int local95 = this.aByteArray11[(this.anInt1533 <= local71 ? local71 - this.anInt1533 : local71) & 0xFF] & 0xFF;
					for (@Pc(99) int local99 = local63 - 1; local99 <= local67; local99++) {
						@Pc(125) int local125 = (this.aByteArray11[local95 + (local99 < this.anInt1537 ? local99 : local99 - this.anInt1537) & 0xFF] & 0xFF) * 2;
						@Pc(129) int local129 = local125 + 1;
						@Pc(138) int local138 = local59 - this.aShortArray15[local125] - (local99 << 12);
						@Pc(150) int local150 = local30 - this.aShortArray15[local129] - (local71 << 12);
						local153 = this.anInt1538;
						@Pc(183) int local183;
						if (local153 == 1) {
							local183 = local138 * local138 + local150 * local150 >> 12;
						} else if (local153 == 3) {
							local138 = local138 >= 0 ? local138 : -local138;
							local150 = local150 < 0 ? -local150 : local150;
							local183 = local150 < local138 ? local138 : local150;
						} else if (local153 == 4) {
							local138 = (int) (Math.sqrt((double) ((float) (local138 >= 0 ? local138 : -local138) / 4096.0F)) * 4096.0D);
							local150 = (int) (Math.sqrt((double) ((float) (local150 < 0 ? -local150 : local150) / 4096.0F)) * 4096.0D);
							local183 = local150 + local138;
							local183 = local183 * local183 >> 12;
						} else if (local153 == 5) {
							local138 *= local138;
							local150 *= local150;
							local183 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local150 + local138) / 1.6777216E7F))) * 4096.0D);
						} else if (local153 == 2) {
							local183 = (local150 < 0 ? -local150 : local150) + (local138 < 0 ? -local138 : local138);
						} else {
							local183 = (int) (Math.sqrt((double) ((float) (local138 * local138 + local150 * local150) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static335.anInt5876 > local183) {
							Static244.anInt4449 = Static224.anInt4141;
							Static224.anInt4141 = Static106.anInt2250;
							Static106.anInt2250 = Static335.anInt5876;
							Static335.anInt5876 = local183;
						} else if (local183 < Static106.anInt2250) {
							Static244.anInt4449 = Static224.anInt4141;
							Static224.anInt4141 = Static106.anInt2250;
							Static106.anInt2250 = local183;
						} else if (local183 < Static224.anInt4141) {
							Static244.anInt4449 = Static224.anInt4141;
							Static224.anInt4141 = local183;
						} else if (local183 < Static244.anInt4449) {
							Static244.anInt4449 = local183;
						}
					}
				}
				local153 = this.anInt1531;
				if (local153 == 0) {
					local17[local40] = Static335.anInt5876;
				} else if (local153 == 1) {
					local17[local40] = Static106.anInt2250;
				} else if (local153 == 3) {
					local17[local40] = Static224.anInt4141;
				} else if (local153 == 4) {
					local17[local40] = Static244.anInt4449;
				} else if (local153 == 2) {
					local17[local40] = Static106.anInt2250 - Static335.anInt5876;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "(I)V")
	private void method1156() {
		@Pc(19) Random local19 = new Random((long) this.anInt1541);
		this.aShortArray15 = new short[512];
		if (this.anInt1544 > 0) {
			for (@Pc(31) int local31 = 0; local31 < 512; local31++) {
				this.aShortArray15[local31] = (short) Static346.method4895(local19, this.anInt1544);
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			this.anInt1537 = this.anInt1533 = arg1.method4864();
		} else if (arg0 == 1) {
			this.anInt1541 = arg1.method4864();
		} else if (arg0 == 2) {
			this.anInt1544 = arg1.method4877();
		} else if (arg0 == 3) {
			this.anInt1531 = arg1.method4864();
		} else if (arg0 == 4) {
			this.anInt1538 = arg1.method4864();
		} else if (arg0 == 5) {
			this.anInt1537 = arg1.method4864();
		} else if (arg0 == 6) {
			this.anInt1533 = arg1.method4864();
		}
	}

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "(I)V")
	@Override
	public void method5845() {
		this.aByteArray11 = Static92.method1504(this.anInt1541);
		this.method1156();
	}
}
