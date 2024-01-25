import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class3_Sub18 extends Class3 {

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!fk", name = "r", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!fk", name = "t", descriptor = "[Lclient!eb;")
	public Class3_Sub13_Sub1[] aClass3_Sub13_Sub1Array1;

	@OriginalMember(owner = "client!fk", name = "w", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!fk", name = "x", descriptor = "I")
	public int anInt2554;

	@OriginalMember(owner = "client!fk", name = "y", descriptor = "[I")
	private int[] anIntArray213;

	@OriginalMember(owner = "client!fk", name = "A", descriptor = "[Lclient!bh;")
	public Class20[] aClass20Array1;

	@OriginalMember(owner = "client!fk", name = "B", descriptor = "[S")
	public short[] aShortArray40;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
	private Class3_Sub18() {
	}

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "([B)V")
	public Class3_Sub18(@OriginalArg(0) byte[] arg0) {
		this.anIntArray213 = new int[128];
		this.aByteArray32 = new byte[128];
		this.aByteArray33 = new byte[128];
		this.aClass20Array1 = new Class20[128];
		this.aClass3_Sub13_Sub1Array1 = new Class3_Sub13_Sub1[128];
		this.aByteArray31 = new byte[128];
		this.aShortArray40 = new short[128];
		@Pc(34) Class3_Sub2 local34 = new Class3_Sub2(arg0);
		@Pc(36) int local36;
		for (local36 = 0; local34.aByteArray95[local36 + local34.anInt7620] != 0; local36++) {
		}
		@Pc(52) byte[] local52 = new byte[local36];
		for (@Pc(54) int local54 = 0; local54 < local36; local54++) {
			local52[local54] = local34.method6011();
		}
		local34.anInt7620++;
		local36++;
		@Pc(79) int local79 = local34.anInt7620;
		local34.anInt7620 += local36;
		@Pc(87) int local87;
		for (local87 = 0; local34.aByteArray95[local87 + local34.anInt7620] != 0; local87++) {
		}
		@Pc(103) byte[] local103 = new byte[local87];
		for (@Pc(105) int local105 = 0; local105 < local87; local105++) {
			local103[local105] = local34.method6011();
		}
		local34.anInt7620++;
		local87++;
		@Pc(126) int local126 = local34.anInt7620;
		local34.anInt7620 += local87;
		@Pc(134) int local134;
		for (local134 = 0; local34.aByteArray95[local134 + local34.anInt7620] != 0; local134++) {
		}
		@Pc(150) byte[] local150 = new byte[local134];
		for (@Pc(152) int local152 = 0; local152 < local134; local152++) {
			local150[local152] = local34.method6011();
		}
		local34.anInt7620++;
		local134++;
		@Pc(173) byte[] local173 = new byte[local134];
		@Pc(178) int local178;
		@Pc(189) int local189;
		@Pc(194) int local194;
		if (local134 <= 1) {
			local178 = local134;
		} else {
			local173[1] = 1;
			@Pc(185) int local185 = 1;
			local178 = 2;
			for (local189 = 2; local189 < local134; local189++) {
				local194 = local34.method6053();
				if (local194 == 0) {
					local185 = local178++;
				} else {
					if (local185 >= local194) {
						local194--;
					}
					local185 = local194;
				}
				local173[local189] = (byte) local185;
			}
		}
		@Pc(225) Class20[] local225 = new Class20[local178];
		for (local189 = 0; local189 < local225.length; local189++) {
			@Pc(236) Class20 local236 = local225[local189] = new Class20();
			@Pc(240) int local240 = local34.method6053();
			if (local240 > 0) {
				local236.aByteArray8 = new byte[local240 * 2];
			}
			local240 = local34.method6053();
			if (local240 > 0) {
				local236.aByteArray7 = new byte[local240 * 2 + 2];
				local236.aByteArray7[1] = 64;
			}
		}
		local194 = local34.method6053();
		@Pc(292) byte[] local292 = local194 > 0 ? new byte[local194 * 2] : null;
		local194 = local34.method6053();
		@Pc(308) byte[] local308 = local194 > 0 ? new byte[local194 * 2] : null;
		@Pc(310) int local310;
		for (local310 = 0; local34.aByteArray95[local310 + local34.anInt7620] != 0; local310++) {
		}
		@Pc(323) byte[] local323 = new byte[local310];
		for (@Pc(325) int local325 = 0; local325 < local310; local325++) {
			local323[local325] = local34.method6011();
		}
		local310++;
		local34.anInt7620++;
		@Pc(345) int local345 = 0;
		for (@Pc(347) int local347 = 0; local347 < 128; local347++) {
			local345 += local34.method6053();
			this.aShortArray40[local347] = (short) local345;
		}
		local345 = 0;
		for (@Pc(370) int local370 = 0; local370 < 128; local370++) {
			local345 += local34.method6053();
			this.aShortArray40[local370] = (short) (this.aShortArray40[local370] + (local345 << 8));
		}
		@Pc(394) int local394 = 0;
		@Pc(396) int local396 = 0;
		@Pc(398) int local398 = 0;
		for (@Pc(400) int local400 = 0; local400 < 128; local400++) {
			if (local394 == 0) {
				if (local396 >= local323.length) {
					local394 = -1;
				} else {
					local394 = local323[local396++];
				}
				local398 = local34.method6028();
			}
			this.aShortArray40[local400] = (short) (this.aShortArray40[local400] + ((local398 - 1 & 0x2) << 14));
			this.anIntArray213[local400] = local398;
			local394--;
		}
		local394 = 0;
		local396 = 0;
		@Pc(456) int local456 = 0;
		for (@Pc(458) int local458 = 0; local458 < 128; local458++) {
			if (this.anIntArray213[local458] != 0) {
				if (local394 == 0) {
					if (local52.length <= local396) {
						local394 = -1;
					} else {
						local394 = local52[local396++];
					}
					local456 = local34.aByteArray95[local79++] - 1;
				}
				this.aByteArray32[local458] = (byte) local456;
				local394--;
			}
		}
		local396 = 0;
		local394 = 0;
		@Pc(507) int local507 = 0;
		for (@Pc(509) int local509 = 0; local509 < 128; local509++) {
			if (this.anIntArray213[local509] != 0) {
				if (local394 == 0) {
					local507 = local34.aByteArray95[local126++] + 16 << 2;
					if (local396 >= local103.length) {
						local394 = -1;
					} else {
						local394 = local103[local396++];
					}
				}
				this.aByteArray33[local509] = (byte) local507;
				local394--;
			}
		}
		local396 = 0;
		local394 = 0;
		@Pc(560) Class20 local560 = null;
		for (@Pc(562) int local562 = 0; local562 < 128; local562++) {
			if (this.anIntArray213[local562] != 0) {
				if (local394 == 0) {
					local560 = local225[local173[local396]];
					if (local396 >= local150.length) {
						local394 = -1;
					} else {
						local394 = local150[local396++];
					}
				}
				local394--;
				this.aClass20Array1[local562] = local560;
			}
		}
		local396 = 0;
		local394 = 0;
		@Pc(612) int local612 = 0;
		for (@Pc(614) int local614 = 0; local614 < 128; local614++) {
			if (local394 == 0) {
				if (local396 >= local323.length) {
					local394 = -1;
				} else {
					local394 = local323[local396++];
				}
				if (this.anIntArray213[local614] > 0) {
					local612 = local34.method6053() + 1;
				}
			}
			local394--;
			this.aByteArray31[local614] = (byte) local612;
		}
		this.anInt2554 = local34.method6053() + 1;
		@Pc(673) int local673;
		for (@Pc(663) int local663 = 0; local663 < local178; local663++) {
			@Pc(668) Class20 local668 = local225[local663];
			if (local668.aByteArray8 != null) {
				for (local673 = 1; local673 < local668.aByteArray8.length; local673 += 2) {
					local668.aByteArray8[local673] = local34.method6011();
				}
			}
			if (local668.aByteArray7 != null) {
				for (local673 = 3; local673 < local668.aByteArray7.length - 2; local673 += 2) {
					local668.aByteArray7[local673] = local34.method6011();
				}
			}
		}
		@Pc(720) int local720;
		if (local292 != null) {
			for (local720 = 1; local720 < local292.length; local720 += 2) {
				local292[local720] = local34.method6011();
			}
		}
		if (local308 != null) {
			for (local720 = 1; local720 < local308.length; local720 += 2) {
				local308[local720] = local34.method6011();
			}
		}
		@Pc(766) int local766;
		for (local720 = 0; local720 < local178; local720++) {
			@Pc(759) Class20 local759 = local225[local720];
			if (local759.aByteArray7 != null) {
				local345 = 0;
				for (local766 = 2; local766 < local759.aByteArray7.length; local766 += 2) {
					local345 = local34.method6053() + local345 + 1;
					local759.aByteArray7[local766] = (byte) local345;
				}
			}
		}
		@Pc(805) int local805;
		for (local673 = 0; local673 < local178; local673++) {
			@Pc(798) Class20 local798 = local225[local673];
			if (local798.aByteArray8 != null) {
				local345 = 0;
				for (local805 = 2; local805 < local798.aByteArray8.length; local805 += 2) {
					local345 = local345 + local34.method6053() + 1;
					local798.aByteArray8[local805] = (byte) local345;
				}
			}
		}
		@Pc(881) int local881;
		@Pc(903) int local903;
		@Pc(908) byte local908;
		@Pc(927) int local927;
		@Pc(929) int local929;
		@Pc(938) int local938;
		@Pc(875) byte local875;
		@Pc(981) int local981;
		if (local292 != null) {
			local345 = local34.method6053();
			local292[0] = (byte) local345;
			for (local766 = 2; local766 < local292.length; local766 += 2) {
				local345 = local34.method6053() + local345 + 1;
				local292[local766] = (byte) local345;
			}
			local875 = local292[0];
			@Pc(879) byte local879 = local292[1];
			for (local881 = 0; local881 < local875; local881++) {
				this.aByteArray31[local881] = (byte) (local879 * this.aByteArray31[local881] + 32 >> 6);
			}
			local903 = 2;
			while (local292.length > local903) {
				local908 = local292[local903];
				@Pc(914) byte local914 = local292[local903 + 1];
				local927 = (local908 - local875) / 2 + (local908 - local875) * local879;
				for (local929 = local875; local929 < local908; local929++) {
					local938 = Static34.method818(local927, local908 - local875);
					this.aByteArray31[local929] = (byte) (local938 * this.aByteArray31[local929] + 32 >> 6);
					local927 += local914 - local879;
				}
				local879 = local914;
				local903 += 2;
				local875 = local908;
			}
			for (local981 = local875; local981 < 128; local981++) {
				this.aByteArray31[local981] = (byte) (this.aByteArray31[local981] * local879 + 32 >> 6);
			}
		}
		@Pc(1043) int local1043;
		if (local308 != null) {
			local345 = local34.method6053();
			local308[0] = (byte) local345;
			for (local766 = 2; local766 < local308.length; local766 += 2) {
				local345 += local34.method6053() + 1;
				local308[local766] = (byte) local345;
			}
			local875 = local308[0];
			local1043 = local308[1] << 1;
			for (local881 = 0; local881 < local875; local881++) {
				local903 = local1043 + (this.aByteArray33[local881] & 0xFF);
				if (local903 < 0) {
					local903 = 0;
				}
				if (local903 > 128) {
					local903 = 128;
				}
				this.aByteArray33[local881] = (byte) local903;
			}
			local903 = 2;
			@Pc(1091) int local1091;
			while (local308.length > local903) {
				local908 = local308[local903];
				local1091 = local308[local903 + 1] << 1;
				local927 = (local908 - local875) / 2 + (local908 - local875) * local1043;
				for (local929 = local875; local929 < local908; local929++) {
					local938 = Static34.method818(local927, local908 - local875);
					@Pc(1125) int local1125 = local938 + (this.aByteArray33[local929] & 0xFF);
					if (local1125 < 0) {
						local1125 = 0;
					}
					if (local1125 > 128) {
						local1125 = 128;
					}
					this.aByteArray33[local929] = (byte) local1125;
					local927 += local1091 - local1043;
				}
				local903 += 2;
				local875 = local908;
				local1043 = local1091;
			}
			for (local981 = local875; local981 < 128; local981++) {
				local1091 = local1043 + (this.aByteArray33[local981] & 0xFF);
				if (local1091 < 0) {
					local1091 = 0;
				}
				if (local1091 > 128) {
					local1091 = 128;
				}
				this.aByteArray33[local981] = (byte) local1091;
			}
		}
		for (local766 = 0; local766 < local178; local766++) {
			local225[local766].anInt790 = local34.method6053();
		}
		for (local805 = 0; local805 < local178; local805++) {
			@Pc(1236) Class20 local1236 = local225[local805];
			if (local1236.aByteArray8 != null) {
				local1236.anInt795 = local34.method6053();
			}
			if (local1236.aByteArray7 != null) {
				local1236.anInt794 = local34.method6053();
			}
			if (local1236.anInt790 > 0) {
				local1236.anInt791 = local34.method6053();
			}
		}
		for (local1043 = 0; local1043 < local178; local1043++) {
			local225[local1043].anInt797 = local34.method6053();
		}
		for (local881 = 0; local881 < local178; local881++) {
			@Pc(1289) Class20 local1289 = local225[local881];
			if (local1289.anInt797 > 0) {
				local1289.anInt793 = local34.method6053();
			}
		}
		for (local903 = 0; local903 < local178; local903++) {
			@Pc(1312) Class20 local1312 = local225[local903];
			if (local1312.anInt793 > 0) {
				local1312.anInt792 = local34.method6053();
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!wh;[B[IB)Z")
	public boolean method2114(@OriginalArg(0) Class261 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) boolean local15 = true;
		@Pc(17) int local17 = 0;
		@Pc(19) Class3_Sub13_Sub1 local19 = null;
		for (@Pc(21) int local21 = 0; local21 < 128; local21++) {
			if (arg1 == null || arg1[local21] != 0) {
				@Pc(33) int local33 = this.anIntArray213[local21];
				if (local33 != 0) {
					if (local33 != local17) {
						local17 = local33--;
						if ((local33 & 0x1) == 0) {
							local19 = arg0.method5904(arg2, local33 >> 2);
						} else {
							local19 = arg0.method5900(arg2, local33 >> 2);
						}
						if (local19 == null) {
							local15 = false;
						}
					}
					if (local19 != null) {
						this.aClass3_Sub13_Sub1Array1[local21] = local19;
						this.anIntArray213[local21] = 0;
					}
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(B)V")
	public void method2115() {
		this.anIntArray213 = null;
	}
}
