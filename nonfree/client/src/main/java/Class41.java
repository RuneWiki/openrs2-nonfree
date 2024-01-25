import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class41 {

	@OriginalMember(owner = "client!e", name = "a", descriptor = "[B")
	public byte[] aByteArray26;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "[S")
	public short[] aShortArray31;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "[B")
	public byte[] aByteArray29;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "[S")
	public short[] aShortArray32;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "[Lclient!jo;")
	public Class107[] aClass107Array3;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "[B")
	public byte[] aByteArray30;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "[S")
	public short[] aShortArray33;

	@OriginalMember(owner = "client!e", name = "m", descriptor = "[Lclient!ai;")
	public Class6[] aClass6Array3;

	@OriginalMember(owner = "client!e", name = "n", descriptor = "[S")
	public short[] aShortArray34;

	@OriginalMember(owner = "client!e", name = "o", descriptor = "[I")
	public int[] anIntArray127;

	@OriginalMember(owner = "client!e", name = "p", descriptor = "[S")
	public short[] aShortArray35;

	@OriginalMember(owner = "client!e", name = "u", descriptor = "[I")
	public int[] anIntArray128;

	@OriginalMember(owner = "client!e", name = "v", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!e", name = "x", descriptor = "[S")
	public short[] aShortArray36;

	@OriginalMember(owner = "client!e", name = "z", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!e", name = "A", descriptor = "[S")
	public short[] aShortArray37;

	@OriginalMember(owner = "client!e", name = "C", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!e", name = "F", descriptor = "[S")
	public short[] aShortArray38;

	@OriginalMember(owner = "client!e", name = "G", descriptor = "[I")
	public int[] anIntArray129;

	@OriginalMember(owner = "client!e", name = "H", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!e", name = "L", descriptor = "[S")
	public short[] aShortArray39;

	@OriginalMember(owner = "client!e", name = "N", descriptor = "[I")
	public int[] anIntArray130;

	@OriginalMember(owner = "client!e", name = "S", descriptor = "[S")
	public short[] aShortArray40;

	@OriginalMember(owner = "client!e", name = "T", descriptor = "[B")
	public byte[] aByteArray35;

	@OriginalMember(owner = "client!e", name = "U", descriptor = "[I")
	public int[] anIntArray131;

	@OriginalMember(owner = "client!e", name = "Y", descriptor = "[S")
	public short[] aShortArray41;

	@OriginalMember(owner = "client!e", name = "ab", descriptor = "[S")
	public short[] aShortArray42;

	@OriginalMember(owner = "client!e", name = "hb", descriptor = "[S")
	public short[] aShortArray43;

	@OriginalMember(owner = "client!e", name = "E", descriptor = "I")
	public int anInt1551 = 0;

	@OriginalMember(owner = "client!e", name = "y", descriptor = "I")
	public int anInt1548 = 0;

	@OriginalMember(owner = "client!e", name = "Z", descriptor = "B")
	public byte aByte11 = 0;

	@OriginalMember(owner = "client!e", name = "J", descriptor = "I")
	public int anInt1553 = 0;

	@OriginalMember(owner = "client!e", name = "K", descriptor = "I")
	public int anInt1554 = 0;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "([B)V")
	public Class41(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1508(arg0);
		} else {
			this.method1512(arg0);
		}
	}

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(III)V")
	public Class41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShortArray40 = new short[arg1];
		this.aByteArray26 = new byte[arg1];
		this.anIntArray128 = new int[arg1];
		if (arg2 > 0) {
			this.aShortArray36 = new short[arg2];
			this.aByteArray31 = new byte[arg2];
			this.aByteArray32 = new byte[arg2];
			this.aShortArray34 = new short[arg2];
			this.aByteArray28 = new byte[arg2];
			this.aByteArray30 = new byte[arg2];
			this.aShortArray43 = new short[arg2];
			this.aShortArray37 = new short[arg2];
			this.aShortArray38 = new short[arg2];
			this.aByteArray29 = new byte[arg2];
			this.aShortArray42 = new short[arg2];
			this.aByteArray27 = new byte[arg2];
		}
		this.anIntArray127 = new int[arg0];
		this.aByteArray35 = new byte[arg1];
		this.aShortArray31 = new short[arg1];
		this.anIntArray129 = new int[arg0];
		this.aShortArray41 = new short[arg1];
		this.aByteArray33 = new byte[arg1];
		this.aByteArray34 = new byte[arg1];
		this.anIntArray131 = new int[arg0];
		this.anIntArray130 = new int[arg0];
		this.aShortArray33 = new short[arg1];
		this.aShortArray32 = new short[arg1];
	}

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "([Lclient!e;I)V")
	public Class41(@OriginalArg(0) Class41[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1548 = 0;
		this.anInt1553 = 0;
		this.anInt1554 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) boolean local37 = false;
		@Pc(39) boolean local39 = false;
		@Pc(41) boolean local41 = false;
		this.aByte11 = -1;
		@Pc(46) boolean local46 = false;
		for (@Pc(48) int local48 = 0; local48 < arg1; local48++) {
			@Pc(54) Class41 local54 = arg0[local48];
			if (local54 != null) {
				this.anInt1553 += local54.anInt1553;
				this.anInt1548 += local54.anInt1548;
				this.anInt1554 += local54.anInt1554;
				if (local54.aClass107Array3 != null) {
					local31 += local54.aClass107Array3.length;
				}
				local33 |= local54.aByteArray35 != null;
				if (local54.aClass6Array3 != null) {
					local29 += local54.aClass6Array3.length;
				}
				local46 |= local54.anIntArray128 != null;
				local41 |= local54.aShortArray41 != null;
				local37 |= local54.aByteArray34 != null;
				local39 |= local54.aByteArray26 != null;
				if (local54.aByteArray33 == null) {
					if (this.aByte11 == -1) {
						this.aByte11 = local54.aByte11;
					}
					if (this.aByte11 != local54.aByte11) {
						local35 = true;
					}
				} else {
					local35 = true;
				}
			}
		}
		this.aShortArray33 = new short[this.anInt1554];
		this.anIntArray127 = new int[this.anInt1548];
		this.anIntArray130 = new int[this.anInt1548];
		if (local46) {
			this.anIntArray128 = new int[this.anInt1554];
		}
		this.aShortArray32 = new short[this.anInt1554];
		this.anIntArray129 = new int[this.anInt1548];
		if (local41) {
			this.aShortArray41 = new short[this.anInt1554];
		}
		if (local31 > 0) {
			this.aClass107Array3 = new Class107[local31];
		}
		if (local39) {
			this.aByteArray26 = new byte[this.anInt1554];
		}
		if (this.anInt1553 > 0) {
			this.aShortArray36 = new short[this.anInt1553];
			this.aShortArray38 = new short[this.anInt1553];
			this.aByteArray27 = new byte[this.anInt1553];
			this.aByteArray31 = new byte[this.anInt1553];
			this.aShortArray37 = new short[this.anInt1553];
			this.aByteArray29 = new byte[this.anInt1553];
			this.aByteArray30 = new byte[this.anInt1553];
			this.aByteArray28 = new byte[this.anInt1553];
			this.aShortArray34 = new short[this.anInt1553];
			this.aByteArray32 = new byte[this.anInt1553];
			this.aShortArray42 = new short[this.anInt1553];
			this.aShortArray43 = new short[this.anInt1553];
		}
		this.aShortArray40 = new short[this.anInt1554];
		this.aShortArray39 = new short[this.anInt1554];
		if (local37) {
			this.aByteArray34 = new byte[this.anInt1554];
		}
		if (local35) {
			this.aByteArray33 = new byte[this.anInt1554];
		}
		this.anIntArray131 = new int[this.anInt1548];
		if (local29 > 0) {
			this.aClass6Array3 = new Class6[local29];
		}
		this.aShortArray35 = new short[this.anInt1548];
		if (local33) {
			this.aByteArray35 = new byte[this.anInt1554];
		}
		this.aShortArray31 = new short[this.anInt1554];
		this.anInt1553 = 0;
		this.anInt1554 = 0;
		local31 = 0;
		this.anInt1548 = 0;
		local29 = 0;
		@Pc(566) int local566;
		@Pc(577) int local577;
		for (@Pc(361) int local361 = 0; local361 < arg1; local361++) {
			@Pc(368) short local368 = (short) (0x1 << local361);
			@Pc(372) Class41 local372 = arg0[local361];
			if (local372 != null) {
				for (@Pc(376) int local376 = 0; local376 < local372.anInt1554; local376++) {
					if (local33 && local372.aByteArray35 != null) {
						this.aByteArray35[this.anInt1554] = local372.aByteArray35[local376];
					}
					if (local35) {
						if (local372.aByteArray33 == null) {
							this.aByteArray33[this.anInt1554] = local372.aByte11;
						} else {
							this.aByteArray33[this.anInt1554] = local372.aByteArray33[local376];
						}
					}
					if (local37 && local372.aByteArray34 != null) {
						this.aByteArray34[this.anInt1554] = local372.aByteArray34[local376];
					}
					if (local41) {
						if (local372.aShortArray41 == null) {
							this.aShortArray41[this.anInt1554] = -1;
						} else {
							this.aShortArray41[this.anInt1554] = local372.aShortArray41[local376];
						}
					}
					if (local46) {
						if (local372.anIntArray128 == null) {
							this.anIntArray128[this.anInt1554] = -1;
						} else {
							this.anIntArray128[this.anInt1554] = local372.anIntArray128[local376];
						}
					}
					this.aShortArray33[this.anInt1554] = (short) this.method1521(local372, local368, local372.aShortArray33[local376]);
					this.aShortArray40[this.anInt1554] = (short) this.method1521(local372, local368, local372.aShortArray40[local376]);
					this.aShortArray32[this.anInt1554] = (short) this.method1521(local372, local368, local372.aShortArray32[local376]);
					this.aShortArray39[this.anInt1554] = local368;
					this.aShortArray31[this.anInt1554] = local372.aShortArray31[local376];
					this.anInt1554++;
				}
				@Pc(553) int local553;
				if (local372.aClass6Array3 != null) {
					for (local553 = 0; local553 < local372.aClass6Array3.length; local553++) {
						local566 = this.method1521(local372, local368, local372.aClass6Array3[local553].anInt227);
						local577 = this.method1521(local372, local368, local372.aClass6Array3[local553].anInt225);
						@Pc(588) int local588 = this.method1521(local372, local368, local372.aClass6Array3[local553].anInt233);
						this.aClass6Array3[local29] = new Class6(local372.aClass6Array3[local553].anInt224, local566, local577, local588, local372.aClass6Array3[local553].aByte2);
						local29++;
					}
				}
				if (local372.aClass107Array3 != null) {
					for (local553 = 0; local553 < local372.aClass107Array3.length; local553++) {
						local566 = this.method1521(local372, local368, local372.aClass107Array3[local553].anInt3190);
						this.aClass107Array3[local31] = new Class107(local372.aClass107Array3[local553].anInt3189, local566);
						local31++;
					}
				}
			}
		}
		@Pc(663) int local663 = 0;
		this.anInt1551 = this.anInt1548;
		for (@Pc(669) int local669 = 0; local669 < arg1; local669++) {
			@Pc(676) short local676 = (short) (0x1 << local669);
			@Pc(680) Class41 local680 = arg0[local669];
			if (local680 != null) {
				for (local566 = 0; local566 < local680.anInt1554; local566++) {
					if (local39) {
						this.aByteArray26[local663++] = (byte) (local680.aByteArray26 == null || local680.aByteArray26[local566] == -1 ? -1 : this.anInt1553 + local680.aByteArray26[local566]);
					}
				}
				for (local577 = 0; local577 < local680.anInt1553; local577++) {
					@Pc(732) byte local732 = this.aByteArray27[this.anInt1553] = local680.aByteArray27[local577];
					if (local732 == 0) {
						this.aShortArray42[this.anInt1553] = (short) this.method1521(local680, local676, local680.aShortArray42[local577]);
						this.aShortArray38[this.anInt1553] = (short) this.method1521(local680, local676, local680.aShortArray38[local577]);
						this.aShortArray37[this.anInt1553] = (short) this.method1521(local680, local676, local680.aShortArray37[local577]);
					}
					if (local732 >= 1 && local732 <= 3) {
						this.aShortArray42[this.anInt1553] = local680.aShortArray42[local577];
						this.aShortArray38[this.anInt1553] = local680.aShortArray38[local577];
						this.aShortArray37[this.anInt1553] = local680.aShortArray37[local577];
						this.aShortArray43[this.anInt1553] = local680.aShortArray43[local577];
						this.aShortArray36[this.anInt1553] = local680.aShortArray36[local577];
						this.aShortArray34[this.anInt1553] = local680.aShortArray34[local577];
						this.aByteArray31[this.anInt1553] = local680.aByteArray31[local577];
						this.aByteArray30[this.anInt1553] = local680.aByteArray30[local577];
						this.aByteArray29[this.anInt1553] = local680.aByteArray29[local577];
					}
					if (local732 == 2) {
						this.aByteArray32[this.anInt1553] = local680.aByteArray32[local577];
						this.aByteArray28[this.anInt1553] = local680.aByteArray28[local577];
					}
					this.anInt1553++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(SSSSBSSBBB)B")
	public byte method1507() {
		if (this.anInt1553 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray27[this.anInt1553] = 3;
		this.aShortArray42[this.anInt1553] = 0;
		this.aShortArray38[this.anInt1553] = 32767;
		this.aShortArray37[this.anInt1553] = 0;
		this.aShortArray43[this.anInt1553] = 1024;
		this.aShortArray36[this.anInt1553] = 1024;
		this.aShortArray34[this.anInt1553] = 1024;
		this.aByteArray31[this.anInt1553] = 0;
		this.aByteArray30[this.anInt1553] = 0;
		this.aByteArray29[this.anInt1553] = 0;
		return (byte) this.anInt1553++;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([BB)V")
	private void method1508(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class1_Sub7 local10 = new Class1_Sub7(arg0);
		@Pc(15) Class1_Sub7 local15 = new Class1_Sub7(arg0);
		@Pc(20) Class1_Sub7 local20 = new Class1_Sub7(arg0);
		@Pc(25) Class1_Sub7 local25 = new Class1_Sub7(arg0);
		@Pc(30) Class1_Sub7 local30 = new Class1_Sub7(arg0);
		@Pc(35) Class1_Sub7 local35 = new Class1_Sub7(arg0);
		@Pc(40) Class1_Sub7 local40 = new Class1_Sub7(arg0);
		local10.anInt2219 = arg0.length - 23;
		this.anInt1548 = local10.method2161();
		this.anInt1554 = local10.method2161();
		this.anInt1553 = local10.method2132();
		@Pc(67) int local67 = local10.method2132();
		@Pc(78) boolean local78 = (local67 & 0x1) == 1;
		@Pc(87) boolean local87 = (local67 & 0x2) == 2;
		@Pc(91) int local91 = local10.method2132();
		@Pc(95) int local95 = local10.method2132();
		@Pc(99) int local99 = local10.method2132();
		@Pc(103) int local103 = local10.method2132();
		@Pc(107) int local107 = local10.method2132();
		@Pc(113) int local113 = local10.method2161();
		@Pc(119) int local119 = local10.method2161();
		@Pc(123) int local123 = local10.method2161();
		@Pc(127) int local127 = local10.method2161();
		@Pc(133) int local133 = local10.method2161();
		@Pc(135) int local135 = 0;
		@Pc(137) int local137 = 0;
		@Pc(139) int local139 = 0;
		@Pc(152) int local152;
		if (this.anInt1553 > 0) {
			local10.anInt2219 = 0;
			this.aByteArray27 = new byte[this.anInt1553];
			for (local152 = 0; local152 < this.anInt1553; local152++) {
				@Pc(163) byte local163 = this.aByteArray27[local152] = local10.method2122();
				if (local163 >= 1 && local163 <= 3) {
					local137++;
				}
				if (local163 == 2) {
					local139++;
				}
				if (local163 == 0) {
					local135++;
				}
			}
		}
		local152 = this.anInt1553;
		@Pc(195) int local195 = local152;
		local152 += this.anInt1548;
		@Pc(202) int local202 = local152;
		if (local78) {
			local152 += this.anInt1554;
		}
		@Pc(211) int local211 = local152;
		local152 += this.anInt1554;
		@Pc(222) int local222 = local152;
		if (local91 == 255) {
			local152 += this.anInt1554;
		}
		@Pc(232) int local232 = local152;
		if (local99 == 1) {
			local152 += this.anInt1554;
		}
		@Pc(244) int local244 = local152;
		if (local107 == 1) {
			local152 += this.anInt1548;
		}
		@Pc(254) int local254 = local152;
		if (local95 == 1) {
			local152 += this.anInt1554;
		}
		@Pc(264) int local264 = local152;
		local152 += local127;
		@Pc(270) int local270 = local152;
		if (local103 == 1) {
			local152 += this.anInt1554 * 2;
		}
		@Pc(282) int local282 = local152;
		local152 += local133;
		@Pc(288) int local288 = local152;
		local152 += this.anInt1554 * 2;
		@Pc(297) int local297 = local152;
		local152 += local113;
		@Pc(303) int local303 = local152;
		local152 += local119;
		@Pc(309) int local309 = local152;
		local152 += local123;
		@Pc(315) int local315 = local152;
		local152 += local135 * 6;
		@Pc(323) int local323 = local152;
		local152 += local137 * 6;
		@Pc(331) int local331 = local152;
		local152 += local137 * 6;
		@Pc(339) int local339 = local152;
		local152 += local137;
		@Pc(345) int local345 = local152;
		local152 += local137;
		@Pc(351) int local351 = local152;
		local152 += local139 * 2 + local137;
		this.anIntArray131 = new int[this.anInt1548];
		this.aShortArray40 = new short[this.anInt1554];
		if (local107 == 1) {
			this.anIntArray129 = new int[this.anInt1548];
		}
		if (local91 == 255) {
			this.aByteArray33 = new byte[this.anInt1554];
		} else {
			this.aByte11 = (byte) local91;
		}
		if (local95 == 1) {
			this.aByteArray34 = new byte[this.anInt1554];
		}
		local10.anInt2219 = local195;
		this.anIntArray127 = new int[this.anInt1548];
		if (local78) {
			this.aByteArray35 = new byte[this.anInt1554];
		}
		if (this.anInt1553 > 0) {
			this.aShortArray37 = new short[this.anInt1553];
			if (local137 > 0) {
				this.aShortArray34 = new short[local137];
				this.aShortArray36 = new short[local137];
				this.aByteArray29 = new byte[local137];
				this.aShortArray43 = new short[local137];
				this.aByteArray30 = new byte[local137];
				this.aByteArray31 = new byte[local137];
			}
			this.aShortArray42 = new short[this.anInt1553];
			this.aShortArray38 = new short[this.anInt1553];
			if (local139 > 0) {
				this.aByteArray32 = new byte[local139];
				this.aByteArray28 = new byte[local139];
			}
		}
		this.aShortArray31 = new short[this.anInt1554];
		if (local103 == 1 && this.anInt1553 > 0) {
			this.aByteArray26 = new byte[this.anInt1554];
		}
		this.aShortArray32 = new short[this.anInt1554];
		this.anIntArray130 = new int[this.anInt1548];
		if (local103 == 1) {
			this.aShortArray41 = new short[this.anInt1554];
		}
		this.aShortArray33 = new short[this.anInt1554];
		if (local99 == 1) {
			this.anIntArray128 = new int[this.anInt1554];
		}
		local15.anInt2219 = local297;
		local20.anInt2219 = local303;
		local25.anInt2219 = local309;
		local30.anInt2219 = local244;
		@Pc(549) int local549 = 0;
		@Pc(551) int local551 = 0;
		@Pc(553) int local553 = 0;
		@Pc(561) int local561;
		for (@Pc(555) int local555 = 0; local555 < this.anInt1548; local555++) {
			local561 = local10.method2132();
			@Pc(563) int local563 = 0;
			if ((local561 & 0x1) != 0) {
				local563 = local15.method2110();
			}
			@Pc(573) int local573 = 0;
			if ((local561 & 0x2) != 0) {
				local573 = local20.method2110();
			}
			@Pc(583) int local583 = 0;
			if ((local561 & 0x4) != 0) {
				local583 = local25.method2110();
			}
			this.anIntArray131[local555] = local563 + local549;
			this.anIntArray127[local555] = local551 + local573;
			this.anIntArray130[local555] = local583 + local553;
			local551 = this.anIntArray127[local555];
			local549 = this.anIntArray131[local555];
			local553 = this.anIntArray130[local555];
			if (local107 == 1) {
				this.anIntArray129[local555] = local30.method2132();
			}
		}
		local10.anInt2219 = local288;
		local15.anInt2219 = local202;
		local20.anInt2219 = local222;
		local25.anInt2219 = local254;
		local30.anInt2219 = local232;
		local35.anInt2219 = local270;
		local40.anInt2219 = local282;
		for (local561 = 0; local561 < this.anInt1554; local561++) {
			this.aShortArray31[local561] = (short) local10.method2161();
			if (local78) {
				this.aByteArray35[local561] = local15.method2122();
			}
			if (local91 == 255) {
				this.aByteArray33[local561] = local20.method2122();
			}
			if (local95 == 1) {
				this.aByteArray34[local561] = local25.method2122();
			}
			if (local99 == 1) {
				this.anIntArray128[local561] = local30.method2132();
			}
			if (local103 == 1) {
				this.aShortArray41[local561] = (short) (local35.method2161() - 1);
			}
			if (this.aByteArray26 != null) {
				if (this.aShortArray41[local561] == -1) {
					this.aByteArray26[local561] = -1;
				} else {
					this.aByteArray26[local561] = (byte) (local40.method2132() - 1);
				}
			}
		}
		this.anInt1551 = -1;
		local10.anInt2219 = local264;
		local15.anInt2219 = local211;
		@Pc(781) short local781 = 0;
		@Pc(783) short local783 = 0;
		@Pc(785) short local785 = 0;
		@Pc(787) short local787 = 0;
		@Pc(795) int local795;
		for (@Pc(789) int local789 = 0; local789 < this.anInt1554; local789++) {
			local795 = local15.method2132();
			if (local795 == 1) {
				local781 = (short) (local787 + local10.method2110());
				local783 = (short) (local10.method2110() + local781);
				local785 = (short) (local10.method2110() + local783);
				local787 = local785;
				this.aShortArray33[local789] = local781;
				this.aShortArray40[local789] = local783;
				this.aShortArray32[local789] = local785;
				if (this.anInt1551 < local781) {
					this.anInt1551 = local781;
				}
				if (local783 > this.anInt1551) {
					this.anInt1551 = local783;
				}
				if (this.anInt1551 < local785) {
					this.anInt1551 = local785;
				}
			}
			if (local795 == 2) {
				local783 = local785;
				local785 = (short) (local10.method2110() + local787);
				local787 = local785;
				this.aShortArray33[local789] = local781;
				this.aShortArray40[local789] = local783;
				this.aShortArray32[local789] = local785;
				if (this.anInt1551 < local785) {
					this.anInt1551 = local785;
				}
			}
			if (local795 == 3) {
				local781 = local785;
				local785 = (short) (local787 + local10.method2110());
				local787 = local785;
				this.aShortArray33[local789] = local781;
				this.aShortArray40[local789] = local783;
				this.aShortArray32[local789] = local785;
				if (this.anInt1551 < local785) {
					this.anInt1551 = local785;
				}
			}
			if (local795 == 4) {
				@Pc(948) short local948 = local781;
				local781 = local783;
				local785 = (short) (local787 + local10.method2110());
				local783 = local948;
				this.aShortArray33[local789] = local781;
				local787 = local785;
				this.aShortArray40[local789] = local948;
				this.aShortArray32[local789] = local785;
				if (local785 > this.anInt1551) {
					this.anInt1551 = local785;
				}
			}
		}
		local10.anInt2219 = local315;
		this.anInt1551++;
		local15.anInt2219 = local323;
		local20.anInt2219 = local331;
		local25.anInt2219 = local339;
		local30.anInt2219 = local345;
		local35.anInt2219 = local351;
		@Pc(1027) int local1027;
		for (local795 = 0; local795 < this.anInt1553; local795++) {
			local1027 = this.aByteArray27[local795] & 0xFF;
			if (local1027 == 0) {
				this.aShortArray42[local795] = (short) local10.method2161();
				this.aShortArray38[local795] = (short) local10.method2161();
				this.aShortArray37[local795] = (short) local10.method2161();
			}
			if (local1027 == 1) {
				this.aShortArray42[local795] = (short) local15.method2161();
				this.aShortArray38[local795] = (short) local15.method2161();
				this.aShortArray37[local795] = (short) local15.method2161();
				this.aShortArray43[local795] = (short) local20.method2161();
				this.aShortArray36[local795] = (short) local20.method2161();
				this.aShortArray34[local795] = (short) local20.method2161();
				this.aByteArray31[local795] = local25.method2122();
				this.aByteArray30[local795] = local30.method2122();
				this.aByteArray29[local795] = local35.method2122();
			}
			if (local1027 == 2) {
				this.aShortArray42[local795] = (short) local15.method2161();
				this.aShortArray38[local795] = (short) local15.method2161();
				this.aShortArray37[local795] = (short) local15.method2161();
				this.aShortArray43[local795] = (short) local20.method2161();
				this.aShortArray36[local795] = (short) local20.method2161();
				this.aShortArray34[local795] = (short) local20.method2161();
				this.aByteArray31[local795] = local25.method2122();
				this.aByteArray30[local795] = local30.method2122();
				this.aByteArray29[local795] = local35.method2122();
				this.aByteArray32[local795] = local35.method2122();
				this.aByteArray28[local795] = local35.method2122();
			}
			if (local1027 == 3) {
				this.aShortArray42[local795] = (short) local15.method2161();
				this.aShortArray38[local795] = (short) local15.method2161();
				this.aShortArray37[local795] = (short) local15.method2161();
				this.aShortArray43[local795] = (short) local20.method2161();
				this.aShortArray36[local795] = (short) local20.method2161();
				this.aShortArray34[local795] = (short) local20.method2161();
				this.aByteArray31[local795] = local25.method2122();
				this.aByteArray30[local795] = local30.method2122();
				this.aByteArray29[local795] = local35.method2122();
			}
		}
		if (!local87) {
			return;
		}
		local10.anInt2219 = local152;
		local1027 = local10.method2132();
		@Pc(1312) int local1312;
		@Pc(1318) int local1318;
		if (local1027 > 0) {
			this.aClass6Array3 = new Class6[local1027];
			for (local1312 = 0; local1312 < local1027; local1312++) {
				local1318 = local10.method2161();
				@Pc(1322) int local1322 = local10.method2161();
				@Pc(1328) byte local1328;
				if (local91 == 255) {
					local1328 = this.aByteArray33[local1322];
				} else {
					local1328 = (byte) local91;
				}
				this.aClass6Array3[local1312] = new Class6(local1318, this.aShortArray33[local1322], this.aShortArray40[local1322], this.aShortArray32[local1322], local1328);
			}
		}
		local1312 = local10.method2132();
		if (local1312 <= 0) {
			return;
		}
		this.aClass107Array3 = new Class107[local1312];
		for (local1318 = 0; local1318 < local1312; local1318++) {
			this.aClass107Array3[local1318] = new Class107(local10.method2161(), local10.method2161());
		}
		return;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(SSZ)V")
	public void method1511(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1554; local7++) {
			if (arg0 == this.aShortArray31[local7]) {
				this.aShortArray31[local7] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B[B)V")
	private void method1512(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class1_Sub7 local14 = new Class1_Sub7(arg0);
		@Pc(19) Class1_Sub7 local19 = new Class1_Sub7(arg0);
		@Pc(24) Class1_Sub7 local24 = new Class1_Sub7(arg0);
		@Pc(29) Class1_Sub7 local29 = new Class1_Sub7(arg0);
		@Pc(34) Class1_Sub7 local34 = new Class1_Sub7(arg0);
		local14.anInt2219 = arg0.length - 18;
		this.anInt1548 = local14.method2161();
		this.anInt1554 = local14.method2161();
		this.anInt1553 = local14.method2132();
		@Pc(59) int local59 = local14.method2132();
		@Pc(63) int local63 = local14.method2132();
		@Pc(67) int local67 = local14.method2132();
		@Pc(71) int local71 = local14.method2132();
		@Pc(75) int local75 = local14.method2132();
		@Pc(79) int local79 = local14.method2161();
		@Pc(83) int local83 = local14.method2161();
		@Pc(87) int local87 = local14.method2161();
		@Pc(91) int local91 = local14.method2161();
		@Pc(100) int local100 = this.anInt1548;
		@Pc(102) int local102 = local100;
		local100 += this.anInt1554;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt1554;
		}
		@Pc(119) int local119 = local100;
		if (local71 == 1) {
			local100 += this.anInt1554;
		}
		@Pc(129) int local129 = local100;
		if (local59 == 1) {
			local100 += this.anInt1554;
		}
		@Pc(139) int local139 = local100;
		if (local75 == 1) {
			local100 += this.anInt1548;
		}
		@Pc(151) int local151 = local100;
		if (local67 == 1) {
			local100 += this.anInt1554;
		}
		@Pc(161) int local161 = local100;
		local100 += local91;
		@Pc(167) int local167 = local100;
		local100 += this.anInt1554 * 2;
		@Pc(176) int local176 = local100;
		local100 += this.anInt1553 * 6;
		@Pc(185) int local185 = local100;
		local100 += local79;
		@Pc(191) int local191 = local100;
		local100 += local83;
		if (local75 == 1) {
			this.anIntArray129 = new int[this.anInt1548];
		}
		this.anIntArray130 = new int[this.anInt1548];
		if (local71 == 1) {
			this.anIntArray128 = new int[this.anInt1554];
		}
		this.aShortArray33 = new short[this.anInt1554];
		if (local59 == 1) {
			this.aShortArray41 = new short[this.anInt1554];
			this.aByteArray26 = new byte[this.anInt1554];
			this.aByteArray35 = new byte[this.anInt1554];
		}
		this.aShortArray32 = new short[this.anInt1554];
		local14.anInt2219 = 0;
		this.aShortArray40 = new short[this.anInt1554];
		if (this.anInt1553 > 0) {
			this.aByteArray27 = new byte[this.anInt1553];
			this.aShortArray38 = new short[this.anInt1553];
			this.aShortArray42 = new short[this.anInt1553];
			this.aShortArray37 = new short[this.anInt1553];
		}
		this.aShortArray31 = new short[this.anInt1554];
		if (local67 == 1) {
			this.aByteArray34 = new byte[this.anInt1554];
		}
		this.anIntArray127 = new int[this.anInt1548];
		this.anIntArray131 = new int[this.anInt1548];
		if (local63 == 255) {
			this.aByteArray33 = new byte[this.anInt1554];
		} else {
			this.aByte11 = (byte) local63;
		}
		local19.anInt2219 = local185;
		local24.anInt2219 = local191;
		local29.anInt2219 = local100;
		local34.anInt2219 = local139;
		@Pc(343) int local343 = 0;
		@Pc(345) int local345 = 0;
		@Pc(347) int local347 = 0;
		@Pc(362) int local362;
		@Pc(364) int local364;
		for (@Pc(356) int local356 = 0; local356 < this.anInt1548; local356++) {
			local362 = local14.method2132();
			local364 = 0;
			if ((local362 & 0x1) != 0) {
				local364 = local19.method2110();
			}
			@Pc(374) int local374 = 0;
			if ((local362 & 0x2) != 0) {
				local374 = local24.method2110();
			}
			@Pc(384) int local384 = 0;
			if ((local362 & 0x4) != 0) {
				local384 = local29.method2110();
			}
			this.anIntArray131[local356] = local364 + local343;
			this.anIntArray127[local356] = local345 + local374;
			this.anIntArray130[local356] = local384 + local347;
			local345 = this.anIntArray127[local356];
			local347 = this.anIntArray130[local356];
			local343 = this.anIntArray131[local356];
			if (local75 == 1) {
				this.anIntArray129[local356] = local34.method2132();
			}
		}
		local14.anInt2219 = local167;
		local19.anInt2219 = local129;
		local24.anInt2219 = local109;
		local29.anInt2219 = local151;
		local34.anInt2219 = local119;
		for (local362 = 0; local362 < this.anInt1554; local362++) {
			this.aShortArray31[local362] = (short) local14.method2161();
			if (local59 == 1) {
				local364 = local19.method2132();
				if ((local364 & 0x1) == 1) {
					this.aByteArray35[local362] = 1;
					local7 = true;
				} else {
					this.aByteArray35[local362] = 0;
				}
				if ((local364 & 0x2) == 2) {
					this.aByteArray26[local362] = (byte) (local364 >> 2);
					this.aShortArray41[local362] = this.aShortArray31[local362];
					this.aShortArray31[local362] = 127;
					if (this.aShortArray41[local362] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray26[local362] = -1;
					this.aShortArray41[local362] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray33[local362] = local24.method2122();
			}
			if (local67 == 1) {
				this.aByteArray34[local362] = local29.method2122();
			}
			if (local71 == 1) {
				this.anIntArray128[local362] = local34.method2132();
			}
		}
		local14.anInt2219 = local161;
		this.anInt1551 = -1;
		local19.anInt2219 = local102;
		@Pc(604) short local604 = 0;
		@Pc(606) short local606 = 0;
		@Pc(608) short local608 = 0;
		@Pc(610) short local610 = 0;
		@Pc(618) int local618;
		for (@Pc(612) int local612 = 0; local612 < this.anInt1554; local612++) {
			local618 = local19.method2132();
			if (local618 == 1) {
				local604 = (short) (local610 + local14.method2110());
				local606 = (short) (local604 + local14.method2110());
				local608 = (short) (local606 + local14.method2110());
				this.aShortArray33[local612] = local604;
				local610 = local608;
				this.aShortArray40[local612] = local606;
				this.aShortArray32[local612] = local608;
				if (this.anInt1551 < local604) {
					this.anInt1551 = local604;
				}
				if (this.anInt1551 < local606) {
					this.anInt1551 = local606;
				}
				if (local608 > this.anInt1551) {
					this.anInt1551 = local608;
				}
			}
			if (local618 == 2) {
				local606 = local608;
				local608 = (short) (local610 + local14.method2110());
				this.aShortArray33[local612] = local604;
				local610 = local608;
				this.aShortArray40[local612] = local606;
				this.aShortArray32[local612] = local608;
				if (this.anInt1551 < local608) {
					this.anInt1551 = local608;
				}
			}
			if (local618 == 3) {
				local604 = local608;
				local608 = (short) (local14.method2110() + local610);
				this.aShortArray33[local612] = local604;
				local610 = local608;
				this.aShortArray40[local612] = local606;
				this.aShortArray32[local612] = local608;
				if (this.anInt1551 < local608) {
					this.anInt1551 = local608;
				}
			}
			if (local618 == 4) {
				@Pc(785) short local785 = local604;
				local604 = local606;
				local608 = (short) (local14.method2110() + local610);
				local606 = local785;
				this.aShortArray33[local612] = local604;
				local610 = local608;
				this.aShortArray40[local612] = local785;
				this.aShortArray32[local612] = local608;
				if (local608 > this.anInt1551) {
					this.anInt1551 = local608;
				}
			}
		}
		this.anInt1551++;
		local14.anInt2219 = local176;
		for (local618 = 0; local618 < this.anInt1553; local618++) {
			this.aByteArray27[local618] = 0;
			this.aShortArray42[local618] = (short) local14.method2161();
			this.aShortArray38[local618] = (short) local14.method2161();
			this.aShortArray37[local618] = (short) local14.method2161();
		}
		if (this.aByteArray26 != null) {
			@Pc(881) boolean local881 = false;
			for (@Pc(883) int local883 = 0; local883 < this.anInt1554; local883++) {
				@Pc(892) int local892 = this.aByteArray26[local883] & 0xFF;
				if (local892 != 255) {
					if ((this.aShortArray42[local892] & 0xFFFF) == this.aShortArray33[local883] && (this.aShortArray38[local892] & 0xFFFF) == this.aShortArray40[local883] && this.aShortArray32[local883] == (this.aShortArray37[local892] & 0xFFFF)) {
						this.aByteArray26[local883] = -1;
					} else {
						local881 = true;
					}
				}
			}
			if (!local881) {
				this.aByteArray26 = null;
			}
		}
		if (!local7) {
			this.aByteArray35 = null;
		}
		if (!local9) {
			this.aShortArray41 = null;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)V")
	public void method1513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1548; local3++) {
			this.anIntArray131[local3] += arg2;
			this.anIntArray127[local3] += arg1;
			this.anIntArray130[local3] += arg0;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BISBIISBB)I")
	public int method1514(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) short arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray33[this.anInt1554] = (short) arg4;
		this.aShortArray40[this.anInt1554] = (short) arg3;
		this.aShortArray32[this.anInt1554] = (short) arg1;
		this.aByteArray35[this.anInt1554] = arg6;
		this.aByteArray26[this.anInt1554] = arg0;
		this.aShortArray31[this.anInt1554] = arg5;
		this.aByteArray34[this.anInt1554] = arg7;
		this.aShortArray41[this.anInt1554] = arg2;
		return this.anInt1554++;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(SSI)V")
	public void method1515(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray41 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt1554; local11++) {
			if (this.aShortArray41[local11] == arg1) {
				this.aShortArray41[local11] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(IIII)V")
	public void method1516(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		@Pc(13) int local13;
		@Pc(31) int local31;
		if (arg0 != 0) {
			local7 = Class208.anIntArray479[arg0];
			local11 = Class208.anIntArray478[arg0];
			for (local13 = 0; local13 < this.anInt1548; local13++) {
				local31 = this.anIntArray131[local13] * local11 + local7 * this.anIntArray127[local13] >> 15;
				this.anIntArray127[local13] = this.anIntArray127[local13] * local11 - this.anIntArray131[local13] * local7 >> 15;
				this.anIntArray131[local13] = local31;
			}
		}
		if (arg2 != 0) {
			local7 = Class208.anIntArray479[arg2];
			local11 = Class208.anIntArray478[arg2];
			for (local13 = 0; local13 < this.anInt1548; local13++) {
				local31 = local11 * this.anIntArray127[local13] - this.anIntArray130[local13] * local7 >> 15;
				this.anIntArray130[local13] = local7 * this.anIntArray127[local13] + local11 * this.anIntArray130[local13] >> 15;
				this.anIntArray127[local13] = local31;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local7 = Class208.anIntArray479[arg1];
		local11 = Class208.anIntArray478[arg1];
		for (local13 = 0; local13 < this.anInt1548; local13++) {
			local31 = this.anIntArray130[local13] * local7 + this.anIntArray131[local13] * local11 >> 15;
			this.anIntArray130[local13] = this.anIntArray130[local13] * local11 - this.anIntArray131[local13] * local7 >> 15;
			this.anIntArray131[local13] = local31;
		}
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)[[I")
	public int[][] method1517() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1554; local12++) {
			@Pc(25) int local25 = this.anIntArray128[local12];
			if (local25 >= 0) {
				@Pc(31) int local31 = local8[local25]++;
				if (local25 > local10) {
					local10 = local25;
				}
			}
		}
		@Pc(57) int[][] local57 = new int[local10 + 1][];
		for (@Pc(59) int local59 = 0; local59 <= local10; local59++) {
			local57[local59] = new int[local8[local59]];
			local8[local59] = 0;
		}
		for (@Pc(82) int local82 = 0; local82 < this.anInt1554; local82++) {
			@Pc(89) int local89 = this.anIntArray128[local82];
			if (local89 >= 0) {
				local57[local89][local8[local89]++] = local82;
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(I)[[I")
	public int[][] method1520() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1551; local12++) {
			@Pc(19) int local19 = this.anIntArray129[local12];
			if (local19 >= 0) {
				if (local10 < local19) {
					local10 = local19;
				}
				@Pc(37) int local37 = local8[local19]++;
			}
		}
		@Pc(54) int[][] local54 = new int[local10 + 1][];
		for (@Pc(56) int local56 = 0; local56 <= local10; local56++) {
			local54[local56] = new int[local8[local56]];
			local8[local56] = 0;
		}
		for (@Pc(84) int local84 = 0; local84 < this.anInt1551; local84++) {
			@Pc(91) int local91 = this.anIntArray129[local84];
			if (local91 >= 0) {
				local54[local91][local8[local91]++] = local84;
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!e;ISI)I")
	private int method1521(@OriginalArg(0) Class41 arg0, @OriginalArg(2) short arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray131[arg2];
		@Pc(15) int local15 = arg0.anIntArray127[arg2];
		@Pc(20) int local20 = arg0.anIntArray130[arg2];
		for (@Pc(22) int local22 = 0; local22 < this.anInt1548; local22++) {
			if (local10 == this.anIntArray131[local22] && local15 == this.anIntArray127[local22] && local20 == this.anIntArray130[local22]) {
				this.aShortArray35[local22] |= arg1;
				return local22;
			}
		}
		this.anIntArray131[this.anInt1548] = local10;
		this.anIntArray127[this.anInt1548] = local15;
		this.anIntArray130[this.anInt1548] = local20;
		this.aShortArray35[this.anInt1548] = arg1;
		this.anIntArray129[this.anInt1548] = arg0.anIntArray129 == null ? -1 : arg0.anIntArray129[arg2];
		return this.anInt1548++;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIZI)I")
	public int method1522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1548; local7++) {
			if (arg1 == this.anIntArray131[local7] && this.anIntArray127[local7] == arg2 && this.anIntArray130[local7] == arg0) {
				return local7;
			}
		}
		this.anIntArray131[this.anInt1548] = arg1;
		this.anIntArray127[this.anInt1548] = arg2;
		this.anIntArray130[this.anInt1548] = arg0;
		this.anInt1551 = this.anInt1548 + 1;
		return this.anInt1548++;
	}
}
