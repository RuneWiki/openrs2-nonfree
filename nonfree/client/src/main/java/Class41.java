import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class41 {

	@OriginalMember(owner = "client!k", name = "o", descriptor = "Z")
	public boolean aBoolean91;

	@OriginalMember(owner = "client!k", name = "p", descriptor = "[I")
	private int[] anIntArray178;

	@OriginalMember(owner = "client!k", name = "q", descriptor = "I")
	private int anInt1284;

	@OriginalMember(owner = "client!k", name = "s", descriptor = "J")
	private long aLong44;

	@OriginalMember(owner = "client!k", name = "u", descriptor = "J")
	private long aLong45;

	@OriginalMember(owner = "client!k", name = "F", descriptor = "[I")
	private int[] anIntArray181;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BIZ)V")
	public void method894(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(4) int local4 = this.anIntArray178[arg0];
		if (arg1) {
			local4++;
			if (Static45.anIntArrayArray14[arg0].length <= local4) {
				local4 = 0;
			}
		} else {
			local4--;
			if (local4 < 0) {
				local4 = Static45.anIntArrayArray14[arg0].length - 1;
			}
		}
		this.anIntArray178[arg0] = local4;
		this.method905();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BZ)V")
	public void method896(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean91 != arg0) {
			this.method898(arg0, this.anIntArray178, -1, null);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IZ[II[I)V")
	public void method898(@OriginalArg(1) boolean arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg3 == null) {
			arg3 = new int[12];
			for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
				for (@Pc(20) int local20 = 0; local20 < Static89.anInt2048; local20++) {
					@Pc(26) Class3_Sub1_Sub9 local26 = Static61.method1034(local20);
					if (local26 != null && !local26.aBoolean138 && (arg0 ? 7 : 0) + local16 == local26.anInt1800) {
						arg3[Static62.anIntArray221[local16]] = local20 + 256;
						break;
					}
				}
			}
		}
		this.anIntArray178 = arg1;
		this.anInt1284 = arg2;
		this.anIntArray181 = arg3;
		this.aBoolean91 = arg0;
		this.method905();
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(I)Lclient!hc;")
	public Class3_Sub1_Sub1_Sub4 method899() {
		if (this.anInt1284 != -1) {
			return Static44.method810(this.anInt1284).method1683();
		}
		@Pc(18) boolean local18 = false;
		for (@Pc(20) int local20 = 0; local20 < 12; local20++) {
			@Pc(27) int local27 = this.anIntArray181[local20];
			if (local27 >= 256 && local27 < 512 && !Static61.method1034(local27 - 256).method1209()) {
				local18 = true;
			}
			if (local27 >= 512 && !Static3.method1550(local27 - 512).method498(this.aBoolean91)) {
				local18 = true;
			}
		}
		if (local18) {
			return null;
		}
		@Pc(73) Class3_Sub1_Sub1_Sub4[] local73 = new Class3_Sub1_Sub1_Sub4[12];
		@Pc(75) int local75 = 0;
		for (@Pc(77) int local77 = 0; local77 < 12; local77++) {
			@Pc(84) int local84 = this.anIntArray181[local77];
			@Pc(102) Class3_Sub1_Sub1_Sub4 local102;
			if (local84 >= 256 && local84 < 512) {
				local102 = Static61.method1034(local84 - 256).method1207();
				if (local102 != null) {
					local73[local75++] = local102;
				}
			}
			if (local84 >= 512) {
				local102 = Static3.method1550(local84 - 512).method493(this.aBoolean91);
				if (local102 != null) {
					local73[local75++] = local102;
				}
			}
		}
		@Pc(141) Class3_Sub1_Sub1_Sub4 local141 = new Class3_Sub1_Sub1_Sub4(local73, local75);
		for (@Pc(148) int local148 = 0; local148 < 5; local148++) {
			if (this.anIntArray178[local148] != 0) {
				local141.method771(Static45.anIntArrayArray14[local148][0], Static45.anIntArrayArray14[local148][this.anIntArray178[local148]]);
				if (local148 == 1) {
					local141.method771(Static16.anIntArray33[0], Static16.anIntArray33[this.anIntArray178[local148]]);
				}
			}
		}
		return local141;
	}

	@OriginalMember(owner = "client!k", name = "e", descriptor = "(I)I")
	public int method903() {
		return this.anInt1284 == -1 ? this.anIntArray181[1] + (this.anIntArray178[0] << 25) + (this.anIntArray178[4] << 20) + (this.anIntArray181[0] << 15) + (this.anIntArray181[8] << 10) + (this.anIntArray181[11] << 5) : Static44.method810(this.anInt1284).anInt2522 + 305419896;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ZLclient!gb;)V")
	public void method904(@OriginalArg(1) Class3_Sub4 arg0) {
		arg0.method423(this.aBoolean91 ? 1 : 0);
		@Pc(21) int local21;
		for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
			local21 = this.anIntArray181[Static62.anIntArray221[local12]];
			if (local21 == 0) {
				arg0.method423(-1);
			} else {
				arg0.method423(local21 - 256);
			}
		}
		for (local21 = 0; local21 < 5; local21++) {
			arg0.method423(this.anIntArray178[local21]);
		}
	}

	@OriginalMember(owner = "client!k", name = "f", descriptor = "(I)V")
	private void method905() {
		@Pc(8) long local8 = this.aLong45;
		@Pc(13) int local13 = this.anIntArray181[5];
		@Pc(18) int local18 = this.anIntArray181[9];
		this.anIntArray181[5] = local18;
		this.anIntArray181[9] = local13;
		this.aLong45 = 0L;
		for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
			this.aLong45 <<= 0x4;
			if (this.anIntArray181[local33] >= 256) {
				this.aLong45 += this.anIntArray181[local33] - 256;
			}
		}
		if (this.anIntArray181[0] >= 256) {
			this.aLong45 += this.anIntArray181[0] - 256 >> 4;
		}
		if (this.anIntArray181[1] >= 256) {
			this.aLong45 += this.anIntArray181[1] - 256 >> 8;
		}
		for (@Pc(114) int local114 = 0; local114 < 5; local114++) {
			this.aLong45 <<= 0x3;
			this.aLong45 += this.anIntArray178[local114];
		}
		this.aLong45 <<= 0x1;
		this.aLong45 += this.aBoolean91 ? 1 : 0;
		this.anIntArray181[5] = local13;
		this.anIntArray181[9] = local18;
		if (local8 != 0L && local8 != this.aLong45) {
			Static67.aClass8_22.method197(local8);
		}
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(BIZ)V")
	public void method906(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 1 && this.aBoolean91) {
			return;
		}
		@Pc(23) int local23 = this.anIntArray181[Static62.anIntArray221[arg0]];
		if (local23 == 0) {
			return;
		}
		local23 -= 256;
		@Pc(52) Class3_Sub1_Sub9 local52;
		do {
			if (arg1) {
				local23++;
				if (Static89.anInt2048 <= local23) {
					local23 = 0;
				}
			} else {
				local23--;
				if (local23 < 0) {
					local23 = Static89.anInt2048 - 1;
				}
			}
			local52 = Static61.method1034(local23);
		} while (local52 == null || local52.aBoolean138 || arg0 + (this.aBoolean91 ? 7 : 0) != local52.anInt1800);
		this.anIntArray181[Static62.anIntArray221[arg0]] = local23 + 256;
		this.method905();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!m;Lclient!m;II)Lclient!hc;")
	public Class3_Sub1_Sub1_Sub4 method907(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub6 arg1, @OriginalArg(2) Class3_Sub1_Sub6 arg2, @OriginalArg(3) int arg3) {
		if (this.anInt1284 != -1) {
			return Static44.method810(this.anInt1284).method1680(arg0, arg1, arg2, arg3);
		}
		@Pc(33) long local33 = this.aLong45;
		@Pc(36) int[] local36 = this.anIntArray181;
		if (arg1 != null && (arg1.anInt1584 >= 0 || arg1.anInt1597 >= 0)) {
			local36 = new int[12];
			for (@Pc(52) int local52 = 0; local52 < 12; local52++) {
				local36[local52] = this.anIntArray181[local52];
			}
			if (arg1.anInt1584 >= 0) {
				local33 += arg1.anInt1584 - this.anIntArray181[5] << 8;
				local36[5] = arg1.anInt1584;
			}
			if (arg1.anInt1597 >= 0) {
				local33 += arg1.anInt1597 - this.anIntArray181[3] << 16;
				local36[3] = arg1.anInt1597;
			}
		}
		@Pc(120) Class3_Sub1_Sub1_Sub4 local120 = (Class3_Sub1_Sub1_Sub4) Static67.aClass8_22.method195(local33);
		if (local120 == null) {
			@Pc(124) boolean local124 = false;
			for (@Pc(126) int local126 = 0; local126 < 12; local126++) {
				@Pc(132) int local132 = local36[local126];
				if (local132 >= 256 && local132 < 512 && !Static61.method1034(local132 - 256).method1215()) {
					local124 = true;
				}
				if (local132 >= 512 && !Static3.method1550(local132 - 512).method497(this.aBoolean91)) {
					local124 = true;
				}
			}
			if (local124) {
				if (this.aLong44 != -1L) {
					local120 = (Class3_Sub1_Sub1_Sub4) Static67.aClass8_22.method195(this.aLong44);
				}
				if (local120 == null) {
					return null;
				}
			}
			if (local120 == null) {
				@Pc(195) int local195 = 0;
				@Pc(198) Class3_Sub1_Sub1_Sub4[] local198 = new Class3_Sub1_Sub1_Sub4[12];
				@Pc(206) int local206;
				for (@Pc(200) int local200 = 0; local200 < 12; local200++) {
					local206 = local36[local200];
					@Pc(222) Class3_Sub1_Sub1_Sub4 local222;
					if (local206 >= 256 && local206 < 512) {
						local222 = Static61.method1034(local206 - 256).method1211();
						if (local222 != null) {
							local198[local195++] = local222;
						}
					}
					if (local206 >= 512) {
						local222 = Static3.method1550(local206 - 512).method501(this.aBoolean91);
						if (local222 != null) {
							local198[local195++] = local222;
						}
					}
				}
				local120 = new Class3_Sub1_Sub1_Sub4(local198, local195);
				for (local206 = 0; local206 < 5; local206++) {
					if (this.anIntArray178[local206] != 0) {
						local120.method771(Static45.anIntArrayArray14[local206][0], Static45.anIntArrayArray14[local206][this.anIntArray178[local206]]);
						if (local206 == 1) {
							local120.method771(Static16.anIntArray33[0], Static16.anIntArray33[this.anIntArray178[local206]]);
						}
					}
				}
				local120.method768();
				local120.method781(64, 850, -30, -50, -30, true);
				Static67.aClass8_22.method199(local33, local120);
				this.aLong44 = local33;
			}
		}
		if (arg1 == null && arg2 == null) {
			return local120;
		}
		@Pc(346) Class3_Sub1_Sub1_Sub4 local346;
		if (arg1 != null && arg2 != null) {
			local346 = arg1.method1080(arg3, arg2, local120, arg0);
		} else if (arg1 == null) {
			local346 = arg2.method1075(local120, arg3);
		} else {
			local346 = arg1.method1075(local120, arg0);
		}
		return local346;
	}
}
