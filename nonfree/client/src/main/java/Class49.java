import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class49 {

	@OriginalMember(owner = "client!gj", name = "j", descriptor = "[Z")
	public boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "[I")
	public int[] anIntArray168;

	@OriginalMember(owner = "client!gj", name = "t", descriptor = "[[I")
	public int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!gj", name = "u", descriptor = "[I")
	public int[] anIntArray170;

	@OriginalMember(owner = "client!gj", name = "x", descriptor = "I")
	public int anInt2191;

	@OriginalMember(owner = "client!gj", name = "y", descriptor = "[I")
	private int[] anIntArray171;

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
	public int anInt2183 = -1;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
	public int anInt2179 = -1;

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
	public int anInt2181 = -1;

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
	public int anInt2182 = -1;

	@OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
	public int anInt2187 = 99;

	@OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
	public int anInt2189 = 5;

	@OriginalMember(owner = "client!gj", name = "v", descriptor = "I")
	public int anInt2190 = 2;

	@OriginalMember(owner = "client!gj", name = "C", descriptor = "Z")
	public boolean aBoolean132 = false;

	@OriginalMember(owner = "client!gj", name = "w", descriptor = "Z")
	public boolean aBoolean131 = false;

	@OriginalMember(owner = "client!gj", name = "D", descriptor = "I")
	public int anInt2195 = -1;

	@OriginalMember(owner = "client!gj", name = "o", descriptor = "Z")
	public boolean aBoolean130 = false;

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "Z")
	public boolean aBoolean128 = false;

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
	public void method1631() {
		if (this.anInt2179 == -1) {
			if (this.aBooleanArray5 == null) {
				this.anInt2179 = 0;
			} else {
				this.anInt2179 = 2;
			}
		}
		if (this.anInt2183 != -1) {
			return;
		}
		if (this.aBooleanArray5 == null) {
			this.anInt2183 = 0;
		} else {
			this.anInt2183 = 2;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLclient!ql;)V")
	public void method1632(@OriginalArg(1) Class1_Sub13 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method1772();
			if (local18 == 0) {
				return;
			}
			this.method1633(local18, arg0);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZLclient!ql;)V")
	private void method1633(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub13 arg1) {
		@Pc(24) int local24;
		@Pc(30) int local30;
		@Pc(53) int local53;
		@Pc(72) int local72;
		if (arg0 == 1) {
			local24 = arg1.method1764();
			this.anIntArray170 = new int[local24];
			for (local30 = 0; local30 < local24; local30++) {
				this.anIntArray170[local30] = arg1.method1764();
			}
			this.anIntArray168 = new int[local24];
			for (local53 = 0; local53 < local24; local53++) {
				this.anIntArray168[local53] = arg1.method1764();
			}
			for (local72 = 0; local72 < local24; local72++) {
				this.anIntArray168[local72] = (arg1.method1764() << 16) + this.anIntArray168[local72];
			}
		} else if (arg0 == 2) {
			this.anInt2195 = arg1.method1764();
		} else if (arg0 == 3) {
			this.aBooleanArray5 = new boolean[256];
			local24 = arg1.method1772();
			for (local30 = 0; local30 < local24; local30++) {
				this.aBooleanArray5[arg1.method1772()] = true;
			}
		} else if (arg0 == 4) {
			this.aBoolean128 = true;
		} else if (arg0 == 5) {
			this.anInt2189 = arg1.method1772();
		} else if (arg0 == 6) {
			this.anInt2182 = arg1.method1764();
		} else if (arg0 == 7) {
			this.anInt2181 = arg1.method1764();
		} else if (arg0 == 8) {
			this.anInt2187 = arg1.method1772();
		} else if (arg0 == 9) {
			this.anInt2183 = arg1.method1772();
		} else if (arg0 == 10) {
			this.anInt2179 = arg1.method1772();
		} else if (arg0 == 11) {
			this.anInt2190 = arg1.method1772();
		} else if (arg0 == 12) {
			local24 = arg1.method1772();
			this.anIntArray171 = new int[local24];
			for (local30 = 0; local30 < local24; local30++) {
				this.anIntArray171[local30] = arg1.method1764();
			}
			for (local53 = 0; local53 < local24; local53++) {
				this.anIntArray171[local53] += arg1.method1764() << 16;
			}
		} else if (arg0 == 13) {
			local24 = arg1.method1764();
			this.anIntArrayArray17 = new int[local24][];
			for (local30 = 0; local30 < local24; local30++) {
				local53 = arg1.method1772();
				if (local53 > 0) {
					this.anIntArrayArray17[local30] = new int[local53];
					this.anIntArrayArray17[local30][0] = arg1.method1773();
					for (local72 = 1; local72 < local53; local72++) {
						this.anIntArrayArray17[local30][local72] = arg1.method1764();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean132 = true;
		} else if (arg0 == 15) {
			this.aBoolean130 = true;
		} else if (arg0 == 16) {
			this.aBoolean131 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BILclient!gh;II)Lclient!gh;")
	public Class9_Sub5 method1634(@OriginalArg(1) int arg0, @OriginalArg(2) Class9_Sub5 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray170[arg3];
		@Pc(13) int local13 = this.anIntArray168[arg3];
		@Pc(19) Class1_Sub2_Sub8 local19 = Static210.method3478(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg1.method3625(true, true, true);
		}
		@Pc(39) Class1_Sub2_Sub8 local39 = null;
		if ((this.aBoolean130 || Static33.aBoolean265) && arg2 != -1 && this.anIntArray168.length > arg2) {
			@Pc(61) int local61 = this.anIntArray168[arg2];
			local39 = Static210.method3478(local61 >> 16);
			arg2 = local61 & 0xFFFF;
		}
		@Pc(100) Class9_Sub5 local100;
		if (local39 == null) {
			local100 = arg1.method3625(!local19.method1657(local23), !local19.method1660(local23), !this.aBoolean132);
		} else {
			local100 = arg1.method3625(!local19.method1657(local23) & !local39.method1657(arg2), !local19.method1660(local23) & !local39.method1660(arg2), !this.aBoolean132);
		}
		local100.method3601(local19, local23, local39, arg2, arg0 - 1, local8, this.aBoolean132);
		return local100;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILclient!gh;IIIZ)Lclient!gh;")
	public Class9_Sub5 method1636(@OriginalArg(0) int arg0, @OriginalArg(1) Class9_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = this.anIntArray170[arg0];
		@Pc(15) int local15 = this.anIntArray168[arg0];
		@Pc(21) Class1_Sub2_Sub8 local21 = Static210.method3478(local15 >> 16);
		@Pc(25) int local25 = local15 & 0xFFFF;
		if (local21 == null) {
			return arg1.method3603(true, true, true);
		}
		@Pc(37) int local37 = arg4 & 0x3;
		@Pc(39) Class1_Sub2_Sub8 local39 = null;
		if ((this.aBoolean130 || Static33.aBoolean265) && arg2 != -1 && this.anIntArray168.length > arg2) {
			@Pc(62) int local62 = this.anIntArray168[arg2];
			local39 = Static210.method3478(local62 >> 16);
			arg2 = local62 & 0xFFFF;
		}
		@Pc(99) Class9_Sub5 local99;
		if (local39 == null) {
			local99 = arg1.method3603(!local21.method1657(local25), !local21.method1660(local25), !this.aBoolean132);
		} else {
			local99 = arg1.method3603(!local21.method1657(local25) & !local39.method1657(arg2), !local21.method1660(local25) & !local39.method1660(arg2), !this.aBoolean132);
		}
		if (local37 == 1) {
			local99.method3612();
		} else if (local37 == 2) {
			local99.method3618();
		} else if (local37 == 3) {
			local99.method3626();
		}
		local99.method3601(local21, local25, local39, arg2, arg3 - 1, local10, this.aBoolean132);
		if (local37 == 1) {
			local99.method3626();
		} else if (local37 == 2) {
			local99.method3618();
		} else if (local37 == 3) {
			local99.method3612();
		}
		return local99;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBIILclient!gh;)Lclient!gh;")
	public Class9_Sub5 method1637(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class9_Sub5 arg3) {
		@Pc(4) int local4 = this.anIntArray170[arg2];
		@Pc(13) int local13 = this.anIntArray168[arg2];
		@Pc(19) Class1_Sub2_Sub8 local19 = Static210.method3478(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg3.method3610(true, true, true);
		}
		@Pc(41) Class1_Sub2_Sub8 local41 = null;
		if ((this.aBoolean130 || Static33.aBoolean265) && arg1 != -1 && arg1 < this.anIntArray168.length) {
			@Pc(63) int local63 = this.anIntArray168[arg1];
			local41 = Static210.method3478(local63 >> 16);
			arg1 = local63 & 0xFFFF;
		}
		@Pc(75) Class1_Sub2_Sub8 local75 = null;
		@Pc(77) int local77 = 0;
		@Pc(79) Class1_Sub2_Sub8 local79 = null;
		@Pc(81) int local81 = 0;
		if (this.anIntArray171 != null) {
			if (arg2 < this.anIntArray171.length) {
				local77 = this.anIntArray171[arg2];
				if (local77 != 65535) {
					local79 = Static210.method3478(local77 >> 16);
					local77 &= 0xFFFF;
				}
			}
			if ((this.aBoolean130 || Static33.aBoolean265) && arg1 != -1 && arg1 < this.anIntArray171.length) {
				local81 = this.anIntArray171[arg1];
				if (local81 != 65535) {
					local75 = Static210.method3478(local81 >> 16);
					local81 &= 0xFFFF;
				}
			}
		}
		@Pc(151) boolean local151 = !local19.method1657(local23);
		@Pc(160) boolean local160 = !local19.method1660(local23);
		if (local79 != null) {
			local151 &= !local79.method1657(local77);
			local160 &= !local79.method1660(local77);
		}
		if (local41 != null) {
			local151 &= !local41.method1657(arg1);
			local160 &= !local41.method1660(arg1);
		}
		if (local75 != null) {
			local151 &= !local75.method1657(local81);
			local160 &= !local75.method1660(local81);
		}
		@Pc(243) Class9_Sub5 local243 = arg3.method3610(local151, local160, !this.aBoolean132);
		local243.method3601(local19, local23, local41, arg1, arg0 - 1, local4, this.aBoolean132);
		if (local79 != null) {
			local243.method3601(local79, local77, local75, local81, arg0 - 1, local4, this.aBoolean132);
		}
		return local243;
	}
}
