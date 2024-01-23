import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class8_Sub33 extends Class8 {

	@OriginalMember(owner = "client!ul", name = "n", descriptor = "[B")
	public byte[] aByteArray59;

	@OriginalMember(owner = "client!ul", name = "s", descriptor = "[I")
	private int[] anIntArray471;

	@OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
	public int anInt5360;

	@OriginalMember(owner = "client!ul", name = "u", descriptor = "[B")
	public byte[] aByteArray60;

	@OriginalMember(owner = "client!ul", name = "w", descriptor = "[Lclient!rk;")
	public Class8_Sub20_Sub1[] aClass8_Sub20_Sub1Array1 = new Class8_Sub20_Sub1[128];

	@OriginalMember(owner = "client!ul", name = "z", descriptor = "[S")
	public short[] aShortArray64;

	@OriginalMember(owner = "client!ul", name = "A", descriptor = "[Lclient!jh;")
	public Class88[] aClass88Array1;

	@OriginalMember(owner = "client!ul", name = "C", descriptor = "[B")
	public byte[] aByteArray61 = new byte[128];

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "([B)V")
	public Class8_Sub33(@OriginalArg(0) byte[] arg0) {
		@Pc(13) int local13 = 0;
		this.aShortArray64 = new short[128];
		this.aByteArray59 = new byte[128];
		this.aClass88Array1 = new Class88[128];
		this.aByteArray60 = new byte[128];
		this.anIntArray471 = new int[128];
		@Pc(38) Class8_Sub2 local38 = new Class8_Sub2(arg0);
		while (local38.aByteArray24[local13 + local38.anInt2955] != 0) {
			local13++;
		}
		@Pc(55) byte[] local55 = new byte[local13];
		@Pc(57) int local57;
		for (local57 = 0; local57 < local13; local57++) {
			local55[local57] = local38.method2374();
		}
		local13++;
		local38.anInt2955++;
		local57 = local38.anInt2955;
		local38.anInt2955 += local13;
		@Pc(91) int local91;
		for (local91 = 0; local38.aByteArray24[local38.anInt2955 + local91] != 0; local91++) {
		}
		@Pc(107) byte[] local107 = new byte[local91];
		@Pc(109) int local109;
		for (local109 = 0; local109 < local91; local109++) {
			local107[local109] = local38.method2374();
		}
		local38.anInt2955++;
		local91++;
		local109 = local38.anInt2955;
		local38.anInt2955 += local91;
		@Pc(139) int local139;
		for (local139 = 0; local38.aByteArray24[local38.anInt2955 + local139] != 0; local139++) {
		}
		@Pc(153) byte[] local153 = new byte[local139];
		for (@Pc(155) int local155 = 0; local155 < local139; local155++) {
			local153[local155] = local38.method2374();
		}
		local38.anInt2955++;
		local139++;
		@Pc(181) byte[] local181 = new byte[local139];
		@Pc(188) int local188;
		@Pc(194) int local194;
		if (local139 > 1) {
			@Pc(186) int local186 = 1;
			local188 = 2;
			local181[1] = 1;
			for (local194 = 2; local194 < local139; local194++) {
				@Pc(201) int local201 = local38.method2334();
				if (local201 == 0) {
					local186 = local188++;
				} else {
					if (local201 <= local186) {
						local201--;
					}
					local186 = local201;
				}
				local181[local194] = (byte) local186;
			}
		} else {
			local188 = local139;
		}
		@Pc(230) Class88[] local230 = new Class88[local188];
		for (local194 = 0; local194 < local230.length; local194++) {
			@Pc(248) Class88 local248 = local230[local194] = new Class88();
			@Pc(252) int local252 = local38.method2334();
			if (local252 > 0) {
				local248.aByteArray18 = new byte[local252 * 2];
			}
			local252 = local38.method2334();
			if (local252 > 0) {
				local248.aByteArray19 = new byte[local252 * 2 + 2];
				local248.aByteArray19[1] = 64;
			}
		}
		local194 = local38.method2334();
		@Pc(303) byte[] local303 = local194 > 0 ? new byte[local194 * 2] : null;
		local194 = local38.method2334();
		@Pc(309) int local309;
		for (local309 = 0; local38.aByteArray24[local309 + local38.anInt2955] != 0; local309++) {
		}
		@Pc(326) byte[] local326 = new byte[local309];
		@Pc(328) int local328;
		for (local328 = 0; local328 < local309; local328++) {
			local326[local328] = local38.method2374();
		}
		local309++;
		local38.anInt2955++;
		@Pc(359) byte[] local359 = local194 > 0 ? new byte[local194 * 2] : null;
		local328 = 0;
		@Pc(363) int local363;
		for (local363 = 0; local363 < 128; local363++) {
			local328 += local38.method2334();
			this.aShortArray64[local363] = (short) local328;
		}
		local328 = 0;
		for (local363 = 0; local363 < 128; local363++) {
			local328 += local38.method2334();
			this.aShortArray64[local363] = (short) (this.aShortArray64[local363] + (local328 << 8));
		}
		@Pc(412) int local412 = 0;
		local363 = 0;
		@Pc(416) int local416 = 0;
		@Pc(418) int local418;
		for (local418 = 0; local418 < 128; local418++) {
			if (local363 == 0) {
				if (local412 >= local326.length) {
					local363 = -1;
				} else {
					local363 = local326[local412++];
				}
				local416 = local38.method2353();
			}
			local363--;
			this.aShortArray64[local418] = (short) (this.aShortArray64[local418] + ((local416 - 1 & 0x2) << 14));
			this.anIntArray471[local418] = local416;
		}
		local363 = 0;
		local418 = 0;
		local412 = 0;
		@Pc(478) int local478;
		for (local478 = 0; local478 < 128; local478++) {
			if (this.anIntArray471[local478] != 0) {
				if (local363 == 0) {
					local418 = local38.aByteArray24[local57++] - 1;
					if (local55.length <= local412) {
						local363 = -1;
					} else {
						local363 = local55[local412++];
					}
				}
				local363--;
				this.aByteArray60[local478] = (byte) local418;
			}
		}
		local363 = 0;
		local412 = 0;
		local478 = 0;
		for (@Pc(533) int local533 = 0; local533 < 128; local533++) {
			if (this.anIntArray471[local533] != 0) {
				if (local363 == 0) {
					local478 = local38.aByteArray24[local109++] + 16 << 2;
					if (local107.length <= local412) {
						local363 = -1;
					} else {
						local363 = local107[local412++];
					}
				}
				this.aByteArray59[local533] = (byte) local478;
				local363--;
			}
		}
		local412 = 0;
		local363 = 0;
		@Pc(590) Class88 local590 = null;
		@Pc(592) int local592;
		for (local592 = 0; local592 < 128; local592++) {
			if (this.anIntArray471[local592] != 0) {
				if (local363 == 0) {
					local590 = local230[local181[local412]];
					if (local412 < local153.length) {
						local363 = local153[local412++];
					} else {
						local363 = -1;
					}
				}
				this.aClass88Array1[local592] = local590;
				local363--;
			}
		}
		local363 = 0;
		local412 = 0;
		local592 = 0;
		@Pc(647) int local647;
		for (local647 = 0; local647 < 128; local647++) {
			if (local363 == 0) {
				if (local326.length > local412) {
					local363 = local326[local412++];
				} else {
					local363 = -1;
				}
				if (this.anIntArray471[local647] > 0) {
					local592 = local38.method2334() + 1;
				}
			}
			local363--;
			this.aByteArray61[local647] = (byte) local592;
		}
		this.anInt5360 = local38.method2334() + 1;
		@Pc(720) Class88 local720;
		@Pc(726) int local726;
		for (local647 = 0; local647 < local188; local647++) {
			local720 = local230[local647];
			if (local720.aByteArray18 != null) {
				for (local726 = 1; local726 < local720.aByteArray18.length; local726 += 2) {
					local720.aByteArray18[local726] = local38.method2374();
				}
			}
			if (local720.aByteArray19 != null) {
				for (local726 = 3; local726 < local720.aByteArray19.length - 2; local726 += 2) {
					local720.aByteArray19[local726] = local38.method2374();
				}
			}
		}
		if (local303 != null) {
			for (local647 = 1; local647 < local303.length; local647 += 2) {
				local303[local647] = local38.method2374();
			}
		}
		if (local359 != null) {
			for (local647 = 1; local647 < local359.length; local647 += 2) {
				local359[local647] = local38.method2374();
			}
		}
		for (local647 = 0; local647 < local188; local647++) {
			local720 = local230[local647];
			if (local720.aByteArray19 != null) {
				local328 = 0;
				for (local726 = 2; local726 < local720.aByteArray19.length; local726 += 2) {
					local328 = local328 + local38.method2334() + 1;
					local720.aByteArray19[local726] = (byte) local328;
				}
			}
		}
		for (local647 = 0; local647 < local188; local647++) {
			local720 = local230[local647];
			if (local720.aByteArray18 != null) {
				local328 = 0;
				for (local726 = 2; local726 < local720.aByteArray18.length; local726 += 2) {
					local328 += local38.method2334() + 1;
					local720.aByteArray18[local726] = (byte) local328;
				}
			}
		}
		@Pc(978) byte local978;
		@Pc(999) int local999;
		@Pc(1001) int local1001;
		@Pc(1012) int local1012;
		@Pc(1046) int local1046;
		@Pc(937) byte local937;
		if (local303 != null) {
			local328 = local38.method2334();
			local303[0] = (byte) local328;
			for (local647 = 2; local647 < local303.length; local647 += 2) {
				local328 = local328 + local38.method2334() + 1;
				local303[local647] = (byte) local328;
			}
			local937 = local303[0];
			@Pc(941) byte local941 = local303[1];
			for (local726 = 0; local726 < local937; local726++) {
				this.aByteArray61[local726] = (byte) (local941 * this.aByteArray61[local726] + 32 >> 6);
			}
			local726 = 2;
			while (local726 < local303.length) {
				local978 = local303[local726];
				@Pc(984) byte local984 = local303[local726 + 1];
				local726 += 2;
				local999 = (local978 - local937) / 2 + local941 * (local978 - local937);
				for (local1001 = local937; local1001 < local978; local1001++) {
					local1012 = Static297.method4296(local999, local978 - local937);
					local999 += local984 - local941;
					this.aByteArray61[local1001] = (byte) (local1012 * this.aByteArray61[local1001] + 32 >> 6);
				}
				local937 = local978;
				local941 = local984;
			}
			for (local1046 = local937; local1046 < 128; local1046++) {
				this.aByteArray61[local1046] = (byte) (local941 * this.aByteArray61[local1046] + 32 >> 6);
			}
		}
		if (local359 != null) {
			local328 = local38.method2334();
			local359[0] = (byte) local328;
			for (local647 = 2; local647 < local359.length; local647 += 2) {
				local328 = local38.method2334() + local328 + 1;
				local359[local647] = (byte) local328;
			}
			local937 = local359[0];
			@Pc(1116) int local1116 = local359[1] << 1;
			for (local726 = 0; local726 < local937; local726++) {
				local1046 = (this.aByteArray59[local726] & 0xFF) + local1116;
				if (local1046 < 0) {
					local1046 = 0;
				}
				if (local1046 > 128) {
					local1046 = 128;
				}
				this.aByteArray59[local726] = (byte) local1046;
			}
			local726 = 2;
			@Pc(1176) int local1176;
			while (local726 < local359.length) {
				local978 = local359[local726];
				local1176 = local359[local726 + 1] << 1;
				local726 += 2;
				local999 = (local978 - local937) * local1116 + (local978 - local937) / 2;
				for (local1001 = local937; local1001 < local978; local1001++) {
					local1012 = Static297.method4296(local999, local978 - local937);
					local999 += local1176 - local1116;
					@Pc(1220) int local1220 = local1012 + (this.aByteArray59[local1001] & 0xFF);
					if (local1220 < 0) {
						local1220 = 0;
					}
					if (local1220 > 128) {
						local1220 = 128;
					}
					this.aByteArray59[local1001] = (byte) local1220;
				}
				local937 = local978;
				local1116 = local1176;
			}
			for (local1046 = local937; local1046 < 128; local1046++) {
				local1176 = (this.aByteArray59[local1046] & 0xFF) + local1116;
				if (local1176 < 0) {
					local1176 = 0;
				}
				if (local1176 > 128) {
					local1176 = 128;
				}
				this.aByteArray59[local1046] = (byte) local1176;
			}
		}
		for (local647 = 0; local647 < local188; local647++) {
			local230[local647].anInt2498 = local38.method2334();
		}
		for (local647 = 0; local647 < local188; local647++) {
			local720 = local230[local647];
			if (local720.aByteArray18 != null) {
				local720.anInt2488 = local38.method2334();
			}
			if (local720.aByteArray19 != null) {
				local720.anInt2494 = local38.method2334();
			}
			if (local720.anInt2498 > 0) {
				local720.anInt2491 = local38.method2334();
			}
		}
		for (local647 = 0; local647 < local188; local647++) {
			local230[local647].anInt2496 = local38.method2334();
		}
		for (local647 = 0; local647 < local188; local647++) {
			local720 = local230[local647];
			if (local720.anInt2496 > 0) {
				local720.anInt2492 = local38.method2334();
			}
		}
		for (local647 = 0; local647 < local188; local647++) {
			local720 = local230[local647];
			if (local720.anInt2492 > 0) {
				local720.anInt2493 = local38.method2334();
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLclient!ke;[I[B)Z")
	public boolean method4049(@OriginalArg(1) Class93 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(3) boolean local3 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class8_Sub20_Sub1 local11 = null;
		for (@Pc(20) int local20 = 0; local20 < 128; local20++) {
			if (arg2 == null || arg2[local20] != 0) {
				@Pc(38) int local38 = this.anIntArray471[local20];
				if (local38 != 0) {
					if (local38 != local9) {
						local9 = local38--;
						if ((local38 & 0x1) == 0) {
							local11 = arg0.method2200(local38 >> 2, arg1);
						} else {
							local11 = arg0.method2199(arg1, local38 >> 2);
						}
						if (local11 == null) {
							local3 = false;
						}
					}
					if (local11 != null) {
						this.aClass8_Sub20_Sub1Array1[local20] = local11;
						this.anIntArray471[local20] = 0;
					}
				}
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)V")
	public void method4051() {
		this.anIntArray471 = null;
	}
}
