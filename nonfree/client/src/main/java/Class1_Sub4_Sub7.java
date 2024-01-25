import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class1_Sub4_Sub7 extends Class1_Sub4 {

	@OriginalMember(owner = "client!cs", name = "D", descriptor = "I")
	private int anInt1492 = 5;

	@OriginalMember(owner = "client!cs", name = "C", descriptor = "I")
	private int anInt1491 = 0;

	@OriginalMember(owner = "client!cs", name = "E", descriptor = "[B")
	private byte[] aByteArray36 = new byte[512];

	@OriginalMember(owner = "client!cs", name = "B", descriptor = "[S")
	private short[] aShortArray18 = new short[512];

	@OriginalMember(owner = "client!cs", name = "G", descriptor = "I")
	private int anInt1494 = 2048;

	@OriginalMember(owner = "client!cs", name = "H", descriptor = "I")
	private int anInt1495 = 1;

	@OriginalMember(owner = "client!cs", name = "N", descriptor = "I")
	private int anInt1500 = 2;

	@OriginalMember(owner = "client!cs", name = "M", descriptor = "I")
	private int anInt1499 = 5;

	static {
		new Class7("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5957(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass15_41.method508(arg0);
		if (super.aClass15_41.aBoolean17) {
			@Pc(29) int local29 = Static266.anIntArray628[arg0] * this.anInt1492 + 2048;
			@Pc(33) int local33 = local29 >> 12;
			@Pc(37) int local37 = local33 + 1;
			for (@Pc(39) int local39 = 0; local39 < Static66.anInt1511; local39++) {
				Static74.anInt1678 = Integer.MAX_VALUE;
				Static265.anInt4717 = Integer.MAX_VALUE;
				Static274.anInt4847 = Integer.MAX_VALUE;
				Static450.anInt7234 = Integer.MAX_VALUE;
				@Pc(58) int local58 = this.anInt1499 * Static121.anIntArray197[local39] + 2048;
				@Pc(62) int local62 = local58 >> 12;
				@Pc(66) int local66 = local62 + 1;
				@Pc(147) int local147;
				for (@Pc(70) int local70 = local33 - 1; local70 <= local37; local70++) {
					@Pc(90) int local90 = this.aByteArray36[(local70 >= this.anInt1492 ? local70 - this.anInt1492 : local70) & 0xFF] & 0xFF;
					for (@Pc(94) int local94 = local62 - 1; local94 <= local66; local94++) {
						@Pc(119) int local119 = (this.aByteArray36[local90 + (local94 >= this.anInt1499 ? local94 - this.anInt1499 : local94) & 0xFF] & 0xFF) * 2;
						@Pc(123) int local123 = local119 + 1;
						@Pc(133) int local133 = local58 - this.aShortArray18[local119] - (local94 << 12);
						@Pc(144) int local144 = local29 - (local70 << 12) - this.aShortArray18[local123];
						local147 = this.anInt1495;
						@Pc(179) int local179;
						if (local147 == 1) {
							local179 = local133 * local133 + local144 * local144 >> 12;
						} else if (local147 == 3) {
							local133 = local133 < 0 ? -local133 : local133;
							local144 = local144 < 0 ? -local144 : local144;
							local179 = local144 < local133 ? local133 : local144;
						} else if (local147 == 4) {
							local133 = (int) (Math.sqrt((double) ((float) (local133 >= 0 ? local133 : -local133) / 4096.0F)) * 4096.0D);
							local144 = (int) (Math.sqrt((double) ((float) (local144 < 0 ? -local144 : local144) / 4096.0F)) * 4096.0D);
							local179 = local133 + local144;
							local179 = local179 * local179 >> 12;
						} else if (local147 == 5) {
							local144 *= local144;
							local133 *= local133;
							local179 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local133 + local144) / 1.6777216E7F))) * 4096.0D);
						} else if (local147 == 2) {
							local179 = (local133 < 0 ? -local133 : local133) + (local144 < 0 ? -local144 : local144);
						} else {
							local179 = (int) (Math.sqrt((double) ((float) (local133 * local133 + local144 * local144) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static450.anInt7234 > local179) {
							Static74.anInt1678 = Static265.anInt4717;
							Static265.anInt4717 = Static274.anInt4847;
							Static274.anInt4847 = Static450.anInt7234;
							Static450.anInt7234 = local179;
						} else if (Static274.anInt4847 > local179) {
							Static74.anInt1678 = Static265.anInt4717;
							Static265.anInt4717 = Static274.anInt4847;
							Static274.anInt4847 = local179;
						} else if (Static265.anInt4717 > local179) {
							Static74.anInt1678 = Static265.anInt4717;
							Static265.anInt4717 = local179;
						} else if (local179 < Static74.anInt1678) {
							Static74.anInt1678 = local179;
						}
					}
				}
				local147 = this.anInt1500;
				if (local147 == 0) {
					local16[local39] = Static450.anInt7234;
				} else if (local147 == 1) {
					local16[local39] = Static274.anInt4847;
				} else if (local147 == 3) {
					local16[local39] = Static265.anInt4717;
				} else if (local147 == 4) {
					local16[local39] = Static74.anInt1678;
				} else if (local147 == 2) {
					local16[local39] = Static274.anInt4847 - Static450.anInt7234;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!cs", name = "i", descriptor = "(I)V")
	private void method1315() {
		@Pc(16) Random local16 = new Random((long) this.anInt1491);
		this.aShortArray18 = new short[512];
		if (this.anInt1494 > 0) {
			for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
				this.aShortArray18[local28] = (short) Static300.method5748(local16, this.anInt1494);
			}
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
	@Override
	public void method5950() {
		this.aByteArray36 = Static459.method4527(this.anInt1491);
		this.method1315();
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			this.anInt1499 = this.anInt1492 = arg1.method5366();
		} else if (arg0 == 1) {
			this.anInt1491 = arg1.method5366();
		} else if (arg0 == 2) {
			this.anInt1494 = arg1.method5362();
		} else if (arg0 == 3) {
			this.anInt1500 = arg1.method5366();
		} else if (arg0 == 4) {
			this.anInt1495 = arg1.method5366();
		} else if (arg0 == 5) {
			this.anInt1499 = arg1.method5366();
		} else if (arg0 == 6) {
			this.anInt1492 = arg1.method5366();
		}
	}
}
