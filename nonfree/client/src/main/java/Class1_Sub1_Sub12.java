import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class1_Sub1_Sub12 extends Class1_Sub1 {

	@OriginalMember(owner = "client!fc", name = "tb", descriptor = "[B")
	private byte[] aByteArray19 = new byte[512];

	@OriginalMember(owner = "client!fc", name = "ib", descriptor = "I")
	private int anInt1476 = 0;

	@OriginalMember(owner = "client!fc", name = "sb", descriptor = "I")
	private int anInt1485 = 5;

	@OriginalMember(owner = "client!fc", name = "jb", descriptor = "I")
	private int anInt1477 = 1;

	@OriginalMember(owner = "client!fc", name = "zb", descriptor = "I")
	private int anInt1489 = 2048;

	@OriginalMember(owner = "client!fc", name = "vb", descriptor = "[S")
	private short[] aShortArray25 = new short[512];

	@OriginalMember(owner = "client!fc", name = "mb", descriptor = "I")
	private int anInt1479 = 5;

	@OriginalMember(owner = "client!fc", name = "pb", descriptor = "I")
	private int anInt1482 = 2;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)V")
	private void method973() {
		@Pc(8) Random local8 = new Random((long) this.anInt1476);
		this.aShortArray25 = new short[512];
		if (this.anInt1489 > 0) {
			for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
				this.aShortArray25[local28] = (short) Static3.method61(local8, this.anInt1489);
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3310(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass80_41.method2876(arg0);
		if (super.aClass80_41.aBoolean151) {
			@Pc(29) int local29 = this.anInt1479 * Static22.anIntArray68[arg0] + 2048;
			@Pc(33) int local33 = local29 >> 12;
			@Pc(37) int local37 = local33 + 1;
			for (@Pc(39) int local39 = 0; local39 < Static176.anInt3921; local39++) {
				Static199.anInt4284 = Integer.MAX_VALUE;
				Static209.anInt4434 = Integer.MAX_VALUE;
				Static140.anInt3420 = Integer.MAX_VALUE;
				Static167.anInt3781 = Integer.MAX_VALUE;
				@Pc(58) int local58 = Static171.anIntArray439[local39] * this.anInt1485 + 2048;
				@Pc(62) int local62 = local58 >> 12;
				@Pc(66) int local66 = local62 + 1;
				@Pc(151) int local151;
				for (@Pc(70) int local70 = local33 - 1; local70 <= local37; local70++) {
					@Pc(94) int local94 = this.aByteArray19[(local70 >= this.anInt1479 ? local70 - this.anInt1479 : local70) & 0xFF] & 0xFF;
					for (@Pc(98) int local98 = local62 - 1; local98 <= local66; local98++) {
						@Pc(123) int local123 = (this.aByteArray19[(local98 >= this.anInt1485 ? local98 - this.anInt1485 : local98) + local94 & 0xFF] & 0xFF) * 2;
						@Pc(128) int local128 = local123 + 1;
						@Pc(135) int local135 = local58 - this.aShortArray25[local123] - (local98 << 12);
						@Pc(148) int local148 = local29 - this.aShortArray25[local128] - (local70 << 12);
						local151 = this.anInt1477;
						@Pc(185) int local185;
						if (local151 == 1) {
							local185 = local135 * local135 + local148 * local148 >> 12;
						} else if (local151 == 3) {
							local148 = local148 >= 0 ? local148 : -local148;
							local135 = local135 < 0 ? -local135 : local135;
							local185 = local135 <= local148 ? local148 : local135;
						} else if (local151 == 4) {
							local135 = (int) (Math.sqrt((double) ((float) (local135 < 0 ? -local135 : local135) / 4096.0F)) * 4096.0D);
							local148 = (int) (Math.sqrt((double) ((float) (local148 >= 0 ? local148 : -local148) / 4096.0F)) * 4096.0D);
							local185 = local135 + local148;
							local185 = local185 * local185 >> 12;
						} else if (local151 == 5) {
							local148 *= local148;
							local135 *= local135;
							local185 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local148 + local135) / 1.6777216E7F))) * 4096.0D);
						} else if (local151 == 2) {
							local185 = (local135 < 0 ? -local135 : local135) + (local148 >= 0 ? local148 : -local148);
						} else {
							local185 = (int) (Math.sqrt((double) ((float) (local148 * local148 + local135 * local135) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static167.anInt3781 > local185) {
							Static199.anInt4284 = Static209.anInt4434;
							Static209.anInt4434 = Static140.anInt3420;
							Static140.anInt3420 = Static167.anInt3781;
							Static167.anInt3781 = local185;
						} else if (Static140.anInt3420 > local185) {
							Static199.anInt4284 = Static209.anInt4434;
							Static209.anInt4434 = Static140.anInt3420;
							Static140.anInt3420 = local185;
						} else if (Static209.anInt4434 > local185) {
							Static199.anInt4284 = Static209.anInt4434;
							Static209.anInt4434 = local185;
						} else if (Static199.anInt4284 > local185) {
							Static199.anInt4284 = local185;
						}
					}
				}
				local151 = this.anInt1482;
				if (local151 == 0) {
					local16[local39] = Static167.anInt3781;
				} else if (local151 == 1) {
					local16[local39] = Static140.anInt3420;
				} else if (local151 == 3) {
					local16[local39] = Static209.anInt4434;
				} else if (local151 == 4) {
					local16[local39] = Static199.anInt4284;
				} else if (local151 == 2) {
					local16[local39] = Static140.anInt3420 - Static167.anInt3781;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
	@Override
	public void method3301() {
		this.aByteArray19 = Static179.method3029(this.anInt1476);
		this.method973();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt1485 = this.anInt1479 = arg1.method1738();
		} else if (arg0 == 1) {
			this.anInt1476 = arg1.method1738();
		} else if (arg0 == 2) {
			this.anInt1489 = arg1.method1753();
		} else if (arg0 == 3) {
			this.anInt1482 = arg1.method1738();
		} else if (arg0 == 4) {
			this.anInt1477 = arg1.method1738();
		} else if (arg0 == 5) {
			this.anInt1485 = arg1.method1738();
		} else if (arg0 == 6) {
			this.anInt1479 = arg1.method1738();
		}
	}
}
