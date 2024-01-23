import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class4_Sub1_Sub8 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ff", name = "I", descriptor = "I")
	private int anInt1583 = 2048;

	@OriginalMember(owner = "client!ff", name = "N", descriptor = "[B")
	private byte[] aByteArray19 = new byte[512];

	@OriginalMember(owner = "client!ff", name = "M", descriptor = "I")
	private int anInt1587 = 1;

	@OriginalMember(owner = "client!ff", name = "R", descriptor = "[S")
	private short[] aShortArray32 = new short[512];

	@OriginalMember(owner = "client!ff", name = "L", descriptor = "I")
	private int anInt1586 = 5;

	@OriginalMember(owner = "client!ff", name = "T", descriptor = "I")
	private int anInt1592 = 0;

	@OriginalMember(owner = "client!ff", name = "W", descriptor = "I")
	private int anInt1595 = 2;

	@OriginalMember(owner = "client!ff", name = "X", descriptor = "I")
	private int anInt1596 = 5;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)V")
	private void method1318() {
		@Pc(8) Random local8 = new Random((long) this.anInt1592);
		this.aShortArray32 = new short[512];
		if (this.anInt1583 > 0) {
			for (@Pc(27) int local27 = 0; local27 < 512; local27++) {
				this.aShortArray32[local27] = (short) Static59.method1118(this.anInt1583, local8);
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt1586 = this.anInt1596 = arg1.method3110();
		} else if (arg0 == 1) {
			this.anInt1592 = arg1.method3110();
		} else if (arg0 == 2) {
			this.anInt1583 = arg1.method3085();
		} else if (arg0 == 3) {
			this.anInt1595 = arg1.method3110();
		} else if (arg0 == 4) {
			this.anInt1587 = arg1.method3110();
		} else if (arg0 == 5) {
			this.anInt1586 = arg1.method3110();
		} else if (arg0 == 6) {
			this.anInt1596 = arg1.method3110();
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass43_41.method1180(arg0);
		if (this.aClass43_41.aBoolean82) {
			@Pc(30) int local30 = Static10.anIntArray7[arg0] * this.anInt1596 + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static68.anInt1753; local40++) {
				Static30.anInt633 = Integer.MAX_VALUE;
				Static91.anInt1811 = Integer.MAX_VALUE;
				Static122.anInt2470 = Integer.MAX_VALUE;
				Static236.anInt4698 = Integer.MAX_VALUE;
				@Pc(64) int local64 = Static94.anIntArray163[local40] * this.anInt1586 + 2048;
				@Pc(68) int local68 = local64 >> 12;
				@Pc(72) int local72 = local68 + 1;
				@Pc(163) int local163;
				for (@Pc(76) int local76 = local34 - 1; local76 <= local38; local76++) {
					@Pc(106) int local106 = this.aByteArray19[(this.anInt1596 <= local76 ? local76 - this.anInt1596 : local76) & 0xFF] & 0xFF;
					for (@Pc(110) int local110 = local68 - 1; local110 <= local72; local110++) {
						@Pc(136) int local136 = (this.aByteArray19[local106 + (this.anInt1586 > local110 ? local110 : local110 - this.anInt1586) & 0xFF] & 0xFF) * 2;
						@Pc(141) int local141 = local64 - (local110 << 12);
						@Pc(145) int local145 = local136 + 1;
						@Pc(148) int local148 = local141 - this.aShortArray32[local136];
						@Pc(160) int local160 = local30 - this.aShortArray32[local145] - (local76 << 12);
						local163 = this.anInt1587;
						@Pc(198) int local198;
						if (local163 == 1) {
							local198 = local160 * local160 + local148 * local148 >> 12;
						} else if (local163 == 3) {
							local148 = local148 >= 0 ? local148 : -local148;
							local160 = local160 < 0 ? -local160 : local160;
							local198 = local160 < local148 ? local148 : local160;
						} else if (local163 == 4) {
							local148 = (int) (Math.sqrt((double) ((float) (local148 >= 0 ? local148 : -local148) / 4096.0F)) * 4096.0D);
							local160 = (int) (Math.sqrt((double) ((float) (local160 >= 0 ? local160 : -local160) / 4096.0F)) * 4096.0D);
							local198 = local160 + local148;
							local198 = local198 * local198 >> 12;
						} else if (local163 == 5) {
							local148 *= local148;
							local160 *= local160;
							local198 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local148 + local160) / 1.6777216E7F))) * 4096.0D);
						} else if (local163 == 2) {
							local198 = (local160 < 0 ? -local160 : local160) + (local148 >= 0 ? local148 : -local148);
						} else {
							local198 = (int) (Math.sqrt((double) ((float) (local160 * local160 + local148 * local148) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static236.anInt4698 > local198) {
							Static30.anInt633 = Static91.anInt1811;
							Static91.anInt1811 = Static122.anInt2470;
							Static122.anInt2470 = Static236.anInt4698;
							Static236.anInt4698 = local198;
						} else if (Static122.anInt2470 > local198) {
							Static30.anInt633 = Static91.anInt1811;
							Static91.anInt1811 = Static122.anInt2470;
							Static122.anInt2470 = local198;
						} else if (local198 < Static91.anInt1811) {
							Static30.anInt633 = Static91.anInt1811;
							Static91.anInt1811 = local198;
						} else if (Static30.anInt633 > local198) {
							Static30.anInt633 = local198;
						}
					}
				}
				local163 = this.anInt1595;
				if (local163 == 0) {
					local17[local40] = Static236.anInt4698;
				} else if (local163 == 1) {
					local17[local40] = Static122.anInt2470;
				} else if (local163 == 3) {
					local17[local40] = Static91.anInt1811;
				} else if (local163 == 4) {
					local17[local40] = Static30.anInt633;
				} else if (local163 == 2) {
					local17[local40] = Static122.anInt2470 - Static236.anInt4698;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V")
	@Override
	public void method4537() {
		this.aByteArray19 = Static173.method2813(this.anInt1592);
		this.method1318();
	}
}
