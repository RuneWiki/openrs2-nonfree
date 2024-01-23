import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class1_Sub3_Sub17 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ja", name = "db", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!ja", name = "kb", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!ja", name = "X", descriptor = "I")
	private int anInt1932 = 4;

	@OriginalMember(owner = "client!ja", name = "ab", descriptor = "I")
	private int anInt1935 = 4;

	@OriginalMember(owner = "client!ja", name = "R", descriptor = "I")
	private int anInt1929 = 4;

	@OriginalMember(owner = "client!ja", name = "V", descriptor = "Z")
	private boolean aBoolean86 = true;

	@OriginalMember(owner = "client!ja", name = "Z", descriptor = "I")
	private int anInt1934 = 1638;

	@OriginalMember(owner = "client!ja", name = "hb", descriptor = "I")
	private int anInt1939 = 0;

	@OriginalMember(owner = "client!ja", name = "ob", descriptor = "[B")
	private byte[] aByteArray25 = new byte[512];

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V")
	private void method1489() {
		@Pc(24) int local24;
		if (this.anInt1934 > 0) {
			this.aShortArray27 = new short[this.anInt1929];
			this.aShortArray28 = new short[this.anInt1929];
			for (local24 = 0; local24 < this.anInt1929; local24++) {
				this.aShortArray28[local24] = (short) (Math.pow((double) ((float) this.anInt1934 / 4096.0F), (double) local24) * 4096.0D);
				this.aShortArray27[local24] = (short) Math.pow(2.0D, (double) local24);
			}
		} else if (this.aShortArray28 != null && this.anInt1929 == this.aShortArray28.length) {
			this.aShortArray27 = new short[this.anInt1929];
			for (local24 = 0; local24 < this.anInt1929; local24++) {
				this.aShortArray27[local24] = (short) Math.pow(2.0D, (double) local24);
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.aBoolean86 = arg1.method2142() == 1;
		} else if (arg0 == 1) {
			this.anInt1929 = arg1.method2142();
		} else if (arg0 == 2) {
			this.anInt1934 = arg1.method2167();
			if (this.anInt1934 < 0) {
				this.aShortArray28 = new short[this.anInt1929];
				for (@Pc(72) int local72 = 0; local72 < this.anInt1929; local72++) {
					this.aShortArray28[local72] = (short) arg1.method2167();
				}
			}
		} else if (arg0 == 3) {
			this.anInt1935 = this.anInt1932 = arg1.method2142();
		} else if (arg0 == 4) {
			this.anInt1939 = arg1.method2142();
		} else if (arg0 == 5) {
			this.anInt1935 = arg1.method2142();
		} else if (arg0 == 6) {
			this.anInt1932 = arg1.method2142();
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I[IZ)V")
	private void method1491(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(12) int local12 = Static23.anIntArray47[arg0] * this.anInt1932;
		@Pc(110) int local110;
		@Pc(124) int local124;
		@Pc(28) int local28;
		@Pc(33) short local33;
		@Pc(101) int local101;
		@Pc(39) int local39;
		@Pc(50) int local50;
		@Pc(78) int local78;
		@Pc(71) int local71;
		@Pc(43) int local43;
		@Pc(63) int local63;
		@Pc(59) int local59;
		@Pc(96) int local96;
		if (this.anInt1929 == 1) {
			local28 = this.aShortArray27[0] << 12;
			local33 = this.aShortArray28[0];
			local39 = local28 * local12 >> 12;
			local43 = local39 >> 12;
			local50 = local28 * this.anInt1935 >> 12;
			local59 = this.aByteArray25[local43 & 0xFF] & 0xFF;
			local63 = local43 + 1;
			local39 &= 0xFFF;
			local71 = Class117.anIntArray471[local39];
			local78 = this.anInt1932 * local28 >> 12;
			if (local63 >= local78) {
				local63 = 0;
			}
			local96 = this.aByteArray25[local63 & 0xFF] & 0xFF;
			if (this.aBoolean86) {
				for (local101 = 0; local101 < Static76.anInt1531; local101++) {
					local110 = Static106.anIntArray202[local101] * this.anInt1935;
					local124 = this.method1495(local59, local71, local39, local50, local96, local110 * local28 >> 12);
					local124 = local33 * local124 >> 12;
					arg1[local101] = (local124 >> 1) + 2048;
				}
			} else {
				for (local101 = 0; local101 < Static76.anInt1531; local101++) {
					local110 = Static106.anIntArray202[local101] * this.anInt1935;
					local124 = this.method1495(local59, local71, local39, local50, local96, local110 * local28 >> 12);
					arg1[local101] = local33 * local124 >> 12;
				}
			}
			return;
		}
		local33 = this.aShortArray28[0];
		if (local33 > 8 || local33 < -8) {
			local28 = this.aShortArray27[0] << 12;
			local39 = local28 * local12 >> 12;
			local50 = local28 * this.anInt1935 >> 12;
			local43 = local39 >> 12;
			local63 = local43 + 1;
			local78 = local28 * this.anInt1932 >> 12;
			local59 = this.aByteArray25[local43 & 0xFF] & 0xFF;
			if (local78 <= local63) {
				local63 = 0;
			}
			local96 = this.aByteArray25[local63 & 0xFF] & 0xFF;
			local39 &= 0xFFF;
			local71 = Class117.anIntArray471[local39];
			for (local101 = 0; local101 < Static76.anInt1531; local101++) {
				local110 = this.anInt1935 * Static106.anIntArray202[local101];
				local124 = this.method1495(local59, local71, local39, local50, local96, local28 * local110 >> 12);
				arg1[local101] = local124 * local33 >> 12;
			}
		}
		for (@Pc(315) int local315 = 1; local315 < this.anInt1929; local315++) {
			local33 = this.aShortArray28[local315];
			if (local33 > 8 || local33 < -8) {
				local28 = this.aShortArray27[local315] << 12;
				local78 = local28 * this.anInt1932 >> 12;
				local50 = local28 * this.anInt1935 >> 12;
				local39 = local12 * local28 >> 12;
				local43 = local39 >> 12;
				local63 = local43 + 1;
				if (local78 <= local63) {
					local63 = 0;
				}
				local39 &= 0xFFF;
				local71 = Class117.anIntArray471[local39];
				local96 = this.aByteArray25[local63 & 0xFF] & 0xFF;
				local59 = this.aByteArray25[local43 & 0xFF] & 0xFF;
				if (this.aBoolean86 && local315 == this.anInt1929 - 1) {
					for (local101 = 0; local101 < Static76.anInt1531; local101++) {
						local110 = this.anInt1935 * Static106.anIntArray202[local101];
						local124 = this.method1495(local59, local71, local39, local50, local96, local28 * local110 >> 12);
						local124 = arg1[local101] + (local33 * local124 >> 12);
						arg1[local101] = (local124 >> 1) + 2048;
					}
				} else {
					for (local101 = 0; local101 < Static76.anInt1531; local101++) {
						local110 = Static106.anIntArray202[local101] * this.anInt1935;
						local124 = this.method1495(local59, local71, local39, local50, local96, local28 * local110 >> 12);
						arg1[local101] += local33 * local124 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIII)I")
	private int method1495(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg2 - 4096;
		@Pc(13) int local13 = arg5 >> 12;
		@Pc(22) int local22 = arg5 & 0xFFF;
		@Pc(26) int local26 = Class117.anIntArray471[local22];
		@Pc(30) int local30 = local13 + 1;
		if (arg3 <= local30) {
			local30 = 0;
		}
		local13 &= 0xFF;
		@Pc(52) int local52 = this.aByteArray25[arg0 + local13] & 0x3;
		@Pc(69) int local69;
		if (local52 <= 1) {
			local69 = local52 == 0 ? arg2 + local22 : arg2 + -local22;
		} else {
			local69 = local52 == 2 ? local22 - arg2 : -local22 + -arg2;
		}
		@Pc(90) int local90 = local22 - 4096;
		local30 &= 0xFF;
		local52 = this.aByteArray25[local30 + arg0] & 0x3;
		@Pc(119) int local119;
		if (local52 <= 1) {
			local119 = local52 == 0 ? arg2 + local90 : -local90 + arg2;
		} else {
			local119 = local52 == 2 ? local90 - arg2 : -local90 - arg2;
		}
		local52 = this.aByteArray25[local13 + arg4] & 0x3;
		@Pc(156) int local156 = local69 + (local26 * (local119 - local69) >> 12);
		if (local52 > 1) {
			local69 = local52 == 2 ? local22 - local9 : -local22 + -local9;
		} else {
			local69 = local52 == 0 ? local9 + local22 : local9 + -local22;
		}
		local52 = this.aByteArray25[arg4 + local30] & 0x3;
		if (local52 > 1) {
			local119 = local52 == 2 ? local90 - local9 : -local90 - local9;
		} else {
			local119 = local52 == 0 ? local90 + local9 : local9 + -local90;
		}
		@Pc(241) int local241 = ((local119 - local69) * local26 >> 12) + local69;
		return local156 + ((local241 - local156) * arg1 >> 12);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass79_41.method2341(arg0);
		if (super.aClass79_41.aBoolean125) {
			this.method1491(arg0, local14);
		}
		return local14;
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(B)V")
	@Override
	public void method3474() {
		this.aByteArray25 = Static27.method394(this.anInt1939);
		this.method1489();
		for (@Pc(23) int local23 = this.anInt1929 - 1; local23 >= 1; local23--) {
			@Pc(30) short local30 = this.aShortArray28[local23];
			if (local30 > 8) {
				return;
			}
			if (local30 < -8) {
				return;
			}
			this.anInt1929--;
		}
	}
}
