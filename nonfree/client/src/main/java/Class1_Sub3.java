import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "[I")
	private int[] anIntArray11 = new int[128];

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "[Lclient!pc;")
	public Class1_Sub23_Sub1[] aClass1_Sub23_Sub1Array1 = new Class1_Sub23_Sub1[128];

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "[B")
	public byte[] aByteArray6 = new byte[128];

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "[B")
	public byte[] aByteArray7 = new byte[128];

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "[Lclient!tb;")
	public Class162[] aClass162Array1 = new Class162[128];

	@OriginalMember(owner = "client!ad", name = "v", descriptor = "[S")
	public short[] aShortArray1 = new short[128];

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
	public int anInt115;

	@OriginalMember(owner = "client!ad", name = "B", descriptor = "[B")
	public byte[] aByteArray8 = new byte[128];

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "([B)V")
	public Class1_Sub3(@OriginalArg(0) byte[] arg0) {
		@Pc(36) Class1_Sub13 local36 = new Class1_Sub13(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray63[local36.anInt2018 + local38] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		@Pc(57) int local57;
		for (local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method1829();
		}
		local38++;
		local36.anInt2018++;
		@Pc(78) int local78 = 0;
		local57 = local36.anInt2018;
		local36.anInt2018 += local38;
		while (local36.aByteArray63[local78 + local36.anInt2018] != 0) {
			local78++;
		}
		@Pc(102) byte[] local102 = new byte[local78];
		@Pc(104) int local104;
		for (local104 = 0; local104 < local78; local104++) {
			local102[local104] = local36.method1829();
		}
		local36.anInt2018++;
		local78++;
		local104 = local36.anInt2018;
		@Pc(132) int local132 = 0;
		local36.anInt2018 += local78;
		while (local36.aByteArray63[local132 + local36.anInt2018] != 0) {
			local132++;
		}
		@Pc(155) byte[] local155 = new byte[local132];
		for (@Pc(157) int local157 = 0; local157 < local132; local157++) {
			local155[local157] = local36.method1829();
		}
		local132++;
		local36.anInt2018++;
		@Pc(179) byte[] local179 = new byte[local132];
		@Pc(184) int local184;
		@Pc(196) int local196;
		if (local132 <= 1) {
			local184 = local132;
		} else {
			local179[1] = 1;
			local184 = 2;
			@Pc(194) int local194 = 1;
			for (local196 = 2; local196 < local132; local196++) {
				@Pc(203) int local203 = local36.method1853();
				if (local203 == 0) {
					local194 = local184++;
				} else {
					if (local194 >= local203) {
						local203--;
					}
					local194 = local203;
				}
				local179[local196] = (byte) local194;
			}
		}
		@Pc(230) Class162[] local230 = new Class162[local184];
		for (local196 = 0; local196 < local230.length; local196++) {
			@Pc(244) Class162 local244 = local230[local196] = new Class162();
			@Pc(248) int local248 = local36.method1853();
			if (local248 > 0) {
				local244.aByteArray168 = new byte[local248 * 2];
			}
			local248 = local36.method1853();
			if (local248 > 0) {
				local244.aByteArray167 = new byte[local248 * 2 + 2];
				local244.aByteArray167[1] = 64;
			}
		}
		local196 = local36.method1853();
		@Pc(296) byte[] local296 = local196 <= 0 ? null : new byte[local196 * 2];
		local196 = local36.method1853();
		@Pc(310) byte[] local310 = local196 <= 0 ? null : new byte[local196 * 2];
		@Pc(312) int local312;
		for (local312 = 0; local36.aByteArray63[local36.anInt2018 + local312] != 0; local312++) {
		}
		@Pc(329) byte[] local329 = new byte[local312];
		@Pc(331) int local331;
		for (local331 = 0; local331 < local312; local331++) {
			local329[local331] = local36.method1829();
		}
		local36.anInt2018++;
		local331 = 0;
		local312++;
		@Pc(354) int local354;
		for (local354 = 0; local354 < 128; local354++) {
			local331 += local36.method1853();
			this.aShortArray1[local354] = (short) local331;
		}
		local331 = 0;
		for (local354 = 0; local354 < 128; local354++) {
			local331 += local36.method1853();
			this.aShortArray1[local354] = (short) (this.aShortArray1[local354] + (local331 << 8));
		}
		local354 = 0;
		@Pc(405) int local405 = 0;
		@Pc(407) int local407 = 0;
		@Pc(409) int local409;
		for (local409 = 0; local409 < 128; local409++) {
			if (local354 == 0) {
				if (local329.length <= local405) {
					local354 = -1;
				} else {
					local354 = local329[local405++];
				}
				local407 = local36.method1863();
			}
			this.aShortArray1[local409] = (short) (this.aShortArray1[local409] + ((local407 - 1 & 0x2) << 14));
			local354--;
			this.anIntArray11[local409] = local407;
		}
		local354 = 0;
		local405 = 0;
		local409 = 0;
		@Pc(467) int local467;
		for (local467 = 0; local467 < 128; local467++) {
			if (this.anIntArray11[local467] != 0) {
				if (local354 == 0) {
					local409 = local36.aByteArray63[local57++] - 1;
					if (local55.length <= local405) {
						local354 = -1;
					} else {
						local354 = local55[local405++];
					}
				}
				local354--;
				this.aByteArray7[local467] = (byte) local409;
			}
		}
		local405 = 0;
		local467 = 0;
		local354 = 0;
		for (@Pc(526) int local526 = 0; local526 < 128; local526++) {
			if (this.anIntArray11[local526] != 0) {
				if (local354 == 0) {
					local467 = local36.aByteArray63[local104++] + 16 << 2;
					if (local405 >= local102.length) {
						local354 = -1;
					} else {
						local354 = local102[local405++];
					}
				}
				local354--;
				this.aByteArray6[local526] = (byte) local467;
			}
		}
		local405 = 0;
		local354 = 0;
		@Pc(584) Class162 local584 = null;
		@Pc(586) int local586;
		for (local586 = 0; local586 < 128; local586++) {
			if (this.anIntArray11[local586] != 0) {
				if (local354 == 0) {
					local584 = local230[local179[local405]];
					if (local405 < local155.length) {
						local354 = local155[local405++];
					} else {
						local354 = -1;
					}
				}
				local354--;
				this.aClass162Array1[local586] = local584;
			}
		}
		local405 = 0;
		local586 = 0;
		local354 = 0;
		@Pc(644) int local644;
		for (local644 = 0; local644 < 128; local644++) {
			if (local354 == 0) {
				if (local329.length > local405) {
					local354 = local329[local405++];
				} else {
					local354 = -1;
				}
				if (this.anIntArray11[local644] > 0) {
					local586 = local36.method1853() + 1;
				}
			}
			local354--;
			this.aByteArray8[local644] = (byte) local586;
		}
		this.anInt115 = local36.method1853() + 1;
		@Pc(709) Class162 local709;
		@Pc(715) int local715;
		for (local644 = 0; local644 < local184; local644++) {
			local709 = local230[local644];
			if (local709.aByteArray168 != null) {
				for (local715 = 1; local715 < local709.aByteArray168.length; local715 += 2) {
					local709.aByteArray168[local715] = local36.method1829();
				}
			}
			if (local709.aByteArray167 != null) {
				for (local715 = 3; local715 < local709.aByteArray167.length - 2; local715 += 2) {
					local709.aByteArray167[local715] = local36.method1829();
				}
			}
		}
		if (local296 != null) {
			for (local644 = 1; local644 < local296.length; local644 += 2) {
				local296[local644] = local36.method1829();
			}
		}
		if (local310 != null) {
			for (local644 = 1; local644 < local310.length; local644 += 2) {
				local310[local644] = local36.method1829();
			}
		}
		for (local644 = 0; local644 < local184; local644++) {
			local709 = local230[local644];
			if (local709.aByteArray167 != null) {
				local331 = 0;
				for (local715 = 2; local715 < local709.aByteArray167.length; local715 += 2) {
					local331 += local36.method1853() + 1;
					local709.aByteArray167[local715] = (byte) local331;
				}
			}
		}
		for (local644 = 0; local644 < local184; local644++) {
			local709 = local230[local644];
			if (local709.aByteArray168 != null) {
				local331 = 0;
				for (local715 = 2; local715 < local709.aByteArray168.length; local715 += 2) {
					local331 = local36.method1853() + local331 + 1;
					local709.aByteArray168[local715] = (byte) local331;
				}
			}
		}
		@Pc(973) byte local973;
		@Pc(994) int local994;
		@Pc(996) int local996;
		@Pc(1006) int local1006;
		@Pc(1038) int local1038;
		@Pc(928) byte local928;
		if (local296 != null) {
			local331 = local36.method1853();
			local296[0] = (byte) local331;
			for (local644 = 2; local644 < local296.length; local644 += 2) {
				local331 += local36.method1853() + 1;
				local296[local644] = (byte) local331;
			}
			local928 = local296[0];
			@Pc(932) byte local932 = local296[1];
			for (local715 = 0; local715 < local928; local715++) {
				this.aByteArray8[local715] = (byte) (local932 * this.aByteArray8[local715] + 32 >> 6);
			}
			local715 = 2;
			while (local715 < local296.length) {
				local973 = local296[local715];
				@Pc(979) byte local979 = local296[local715 + 1];
				local715 += 2;
				local994 = (local973 - local928) / 2 + (local973 - local928) * local932;
				for (local996 = local928; local996 < local973; local996++) {
					local1006 = Static299.method4477(local994, local973 - local928);
					local994 += local979 - local932;
					this.aByteArray8[local996] = (byte) (local1006 * this.aByteArray8[local996] + 32 >> 6);
				}
				local928 = local973;
				local932 = local979;
			}
			for (local1038 = local928; local1038 < 128; local1038++) {
				this.aByteArray8[local1038] = (byte) (local932 * this.aByteArray8[local1038] + 32 >> 6);
			}
		}
		if (local310 != null) {
			local331 = local36.method1853();
			local310[0] = (byte) local331;
			for (local644 = 2; local644 < local310.length; local644 += 2) {
				local331 -= -local36.method1853() - 1;
				local310[local644] = (byte) local331;
			}
			local928 = local310[0];
			@Pc(1109) int local1109 = local310[1] << 1;
			for (local715 = 0; local715 < local928; local715++) {
				local1038 = local1109 + (this.aByteArray6[local715] & 0xFF);
				if (local1038 < 0) {
					local1038 = 0;
				}
				if (local1038 > 128) {
					local1038 = 128;
				}
				this.aByteArray6[local715] = (byte) local1038;
			}
			local715 = 2;
			@Pc(1156) int local1156;
			while (local715 < local310.length) {
				local1156 = local310[local715 + 1] << 1;
				local973 = local310[local715];
				local715 += 2;
				local994 = local1109 * (local973 - local928) + (local973 - local928) / 2;
				for (local996 = local928; local996 < local973; local996++) {
					local1006 = Static299.method4477(local994, local973 - local928);
					local994 += local1156 - local1109;
					@Pc(1203) int local1203 = local1006 + (this.aByteArray6[local996] & 0xFF);
					if (local1203 < 0) {
						local1203 = 0;
					}
					if (local1203 > 128) {
						local1203 = 128;
					}
					this.aByteArray6[local996] = (byte) local1203;
				}
				local1109 = local1156;
				local928 = local973;
			}
			for (local1038 = local928; local1038 < 128; local1038++) {
				local1156 = (this.aByteArray6[local1038] & 0xFF) + local1109;
				if (local1156 < 0) {
					local1156 = 0;
				}
				if (local1156 > 128) {
					local1156 = 128;
				}
				this.aByteArray6[local1038] = (byte) local1156;
			}
		}
		for (local644 = 0; local644 < local184; local644++) {
			local230[local644].anInt4831 = local36.method1853();
		}
		for (local644 = 0; local644 < local184; local644++) {
			local709 = local230[local644];
			if (local709.aByteArray168 != null) {
				local709.anInt4822 = local36.method1853();
			}
			if (local709.aByteArray167 != null) {
				local709.anInt4823 = local36.method1853();
			}
			if (local709.anInt4831 > 0) {
				local709.anInt4829 = local36.method1853();
			}
		}
		for (local644 = 0; local644 < local184; local644++) {
			local230[local644].anInt4834 = local36.method1853();
		}
		for (local644 = 0; local644 < local184; local644++) {
			local709 = local230[local644];
			if (local709.anInt4834 > 0) {
				local709.anInt4827 = local36.method1853();
			}
		}
		for (local644 = 0; local644 < local184; local644++) {
			local709 = local230[local644];
			if (local709.anInt4827 > 0) {
				local709.anInt4826 = local36.method1853();
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!g;[IB[B)Z")
	public boolean method63(@OriginalArg(0) Class58 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) int local7 = 0;
		@Pc(9) Class1_Sub23_Sub1 local9 = null;
		@Pc(11) boolean local11 = true;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg2 == null || arg2[local13] != 0) {
				@Pc(32) int local32 = this.anIntArray11[local13];
				if (local32 != 0) {
					if (local32 != local7) {
						local7 = local32--;
						if ((local32 & 0x1) == 0) {
							local9 = arg0.method1669(local32 >> 2, arg1);
						} else {
							local9 = arg0.method1664(arg1, local32 >> 2);
						}
						if (local9 == null) {
							local11 = false;
						}
					}
					if (local9 != null) {
						this.aClass1_Sub23_Sub1Array1[local13] = local9;
						this.anIntArray11[local13] = 0;
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V")
	public void method65() {
		this.anIntArray11 = null;
	}
}
