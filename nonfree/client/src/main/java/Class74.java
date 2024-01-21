import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class74 {

	@OriginalMember(owner = "client!td", name = "c", descriptor = "I")
	private int anInt2889;

	@OriginalMember(owner = "client!td", name = "i", descriptor = "J")
	private long aLong89;

	@OriginalMember(owner = "client!td", name = "j", descriptor = "J")
	private long aLong90;

	@OriginalMember(owner = "client!td", name = "o", descriptor = "Z")
	public boolean aBoolean115;

	@OriginalMember(owner = "client!td", name = "s", descriptor = "[I")
	private int[] anIntArray434;

	@OriginalMember(owner = "client!td", name = "v", descriptor = "[I")
	private int[] anIntArray435;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)I")
	public int method2035() {
		return this.anInt2889 == -1 ? (this.anIntArray434[8] << 10) + (this.anIntArray434[0] << 15) + (this.anIntArray435[4] << 20) + (this.anIntArray435[0] << 25) + (this.anIntArray434[11] << 5) + this.anIntArray434[1] : 305419896 - -Static115.method2023(this.anInt2889).anInt2105;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZI)V")
	public void method2036(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean115) {
			this.method2045(null, arg0, this.anIntArray435, -1);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)Lclient!c;")
	public Class1_Sub3_Sub4_Sub1 method2037() {
		if (this.anInt2889 != -1) {
			return Static115.method2023(this.anInt2889).method1480();
		}
		@Pc(21) boolean local21 = false;
		for (@Pc(28) int local28 = 0; local28 < 12; local28++) {
			@Pc(35) int local35 = this.anIntArray434[local28];
			if (local35 >= 256 && local35 < 512 && !Static70.method1225(local35 - 256).method1529()) {
				local21 = true;
			}
			if (local35 >= 512 && !Static56.method1022(local35 - 512).method2019(this.aBoolean115)) {
				local21 = true;
			}
		}
		if (local21) {
			return null;
		}
		@Pc(84) int local84 = 0;
		@Pc(87) Class1_Sub3_Sub4_Sub1[] local87 = new Class1_Sub3_Sub4_Sub1[12];
		for (@Pc(89) int local89 = 0; local89 < 12; local89++) {
			@Pc(96) int local96 = this.anIntArray434[local89];
			@Pc(116) Class1_Sub3_Sub4_Sub1 local116;
			if (local96 >= 256 && local96 < 512) {
				local116 = Static70.method1225(local96 - 256).method1531();
				if (local116 != null) {
					local87[local84++] = local116;
				}
			}
			if (local96 >= 512) {
				local116 = Static56.method1022(local96 - 512).method2030(this.aBoolean115);
				if (local116 != null) {
					local87[local84++] = local116;
				}
			}
		}
		@Pc(155) Class1_Sub3_Sub4_Sub1 local155 = new Class1_Sub3_Sub4_Sub1(local87, local84);
		for (@Pc(157) int local157 = 0; local157 < 5; local157++) {
			if (this.anIntArray435[local157] != 0) {
				local155.method347(Static3.aShortArrayArray1[local157][0], Static3.aShortArrayArray1[local157][this.anIntArray435[local157]]);
				if (local157 == 1) {
					local155.method347(Static124.aShortArray14[0], Static124.aShortArray14[this.anIntArray435[local157]]);
				}
			}
		}
		return local155;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!rd;I)V")
	public void method2038(@OriginalArg(0) Class1_Sub20 arg0) {
		arg0.method2081(this.aBoolean115 ? 1 : 0);
		@Pc(31) int local31;
		for (@Pc(22) int local22 = 0; local22 < 7; local22++) {
			local31 = this.anIntArray434[Static106.anIntArray395[local22]];
			if (local31 == 0) {
				arg0.method2081(-1);
			} else {
				arg0.method2081(local31 - 256);
			}
		}
		for (local31 = 0; local31 < 5; local31++) {
			arg0.method2081(this.anIntArray435[local31]);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
	private void method2039() {
		@Pc(8) long local8 = this.aLong90;
		@Pc(17) int local17 = this.anIntArray434[5];
		@Pc(22) int local22 = this.anIntArray434[9];
		this.anIntArray434[5] = local22;
		this.anIntArray434[9] = local17;
		this.aLong90 = 0L;
		for (@Pc(37) int local37 = 0; local37 < 12; local37++) {
			this.aLong90 <<= 0x4;
			if (this.anIntArray434[local37] >= 256) {
				this.aLong90 += this.anIntArray434[local37] - 256;
			}
		}
		if (this.anIntArray434[0] >= 256) {
			this.aLong90 += this.anIntArray434[0] - 256 >> 4;
		}
		if (this.anIntArray434[1] >= 256) {
			this.aLong90 += this.anIntArray434[1] - 256 >> 8;
		}
		for (@Pc(115) int local115 = 0; local115 < 5; local115++) {
			this.aLong90 <<= 0x3;
			this.aLong90 += this.anIntArray435[local115];
		}
		this.anIntArray434[9] = local22;
		this.aLong90 <<= 0x1;
		this.aLong90 += this.aBoolean115 ? 1 : 0;
		this.anIntArray434[5] = local17;
		if (local8 != 0L && local8 != this.aLong90) {
			Static65.aClass28_45.method795(local8);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZII)V")
	public void method2040(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = this.anIntArray435[arg1];
		if (arg0) {
			local11++;
			if (Static3.aShortArrayArray1[arg1].length <= local11) {
				local11 = 0;
			}
		} else {
			local11--;
			if (local11 < 0) {
				local11 = Static3.aShortArrayArray1[arg1].length - 1;
			}
		}
		this.anIntArray435[arg1] = local11;
		this.method2039();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZZI)V")
	public void method2041(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 && this.aBoolean115) {
			return;
		}
		@Pc(21) int local21 = this.anIntArray434[Static106.anIntArray395[arg1]];
		if (local21 == 0) {
			return;
		}
		local21 -= 256;
		@Pc(56) Class1_Sub3_Sub13 local56;
		do {
			if (arg0) {
				local21++;
				if (local21 >= Static109.anInt2692) {
					local21 = 0;
				}
			} else {
				local21--;
				if (local21 < 0) {
					local21 = Static109.anInt2692 - 1;
				}
			}
			local56 = Static70.method1225(local21);
		} while (local56 == null || local56.aBoolean76 || arg1 + (this.aBoolean115 ? 7 : 0) != local56.anInt2197);
		this.anIntArray434[Static106.anIntArray395[arg1]] = local21 + 256;
		this.method2039();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIILclient!nc;Lclient!nc;)Lclient!eb;")
	public Class1_Sub3_Sub4_Sub4 method2042(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub3_Sub11 arg2, @OriginalArg(4) Class1_Sub3_Sub11 arg3) {
		if (this.anInt2889 != -1) {
			return Static115.method2023(this.anInt2889).method1482(arg2, arg1, arg3, arg0);
		}
		@Pc(33) int[] local33 = this.anIntArray434;
		@Pc(36) long local36 = this.aLong90;
		if (arg3 != null && (arg3.anInt2034 >= 0 || arg3.anInt2045 >= 0)) {
			local33 = new int[12];
			for (@Pc(49) int local49 = 0; local49 < 12; local49++) {
				local33[local49] = this.anIntArray434[local49];
			}
			if (arg3.anInt2034 >= 0) {
				local36 += arg3.anInt2034 - this.anIntArray434[5] << 8;
				local33[5] = arg3.anInt2034;
			}
			if (arg3.anInt2045 >= 0) {
				local36 += arg3.anInt2045 - this.anIntArray434[3] << 16;
				local33[3] = arg3.anInt2045;
			}
		}
		@Pc(115) Class1_Sub3_Sub4_Sub4 local115 = (Class1_Sub3_Sub4_Sub4) Static65.aClass28_45.method796(local36);
		if (local115 == null) {
			@Pc(119) boolean local119 = false;
			for (@Pc(121) int local121 = 0; local121 < 12; local121++) {
				@Pc(127) int local127 = local33[local121];
				if (local127 >= 256 && local127 < 512 && !Static70.method1225(local127 - 256).method1527()) {
					local119 = true;
				}
				if (local127 >= 512 && !Static56.method1022(local127 - 512).method2024(this.aBoolean115)) {
					local119 = true;
				}
			}
			if (local119) {
				if (this.aLong89 != -1L) {
					local115 = (Class1_Sub3_Sub4_Sub4) Static65.aClass28_45.method796(this.aLong89);
				}
				if (local115 == null) {
					return null;
				}
			}
			if (local115 == null) {
				@Pc(195) Class1_Sub3_Sub4_Sub1[] local195 = new Class1_Sub3_Sub4_Sub1[12];
				@Pc(197) int local197 = 0;
				for (@Pc(199) int local199 = 0; local199 < 12; local199++) {
					@Pc(205) int local205 = local33[local199];
					@Pc(221) Class1_Sub3_Sub4_Sub1 local221;
					if (local205 >= 256 && local205 < 512) {
						local221 = Static70.method1225(local205 - 256).method1530();
						if (local221 != null) {
							local195[local197++] = local221;
						}
					}
					if (local205 >= 512) {
						local221 = Static56.method1022(local205 - 512).method2032(this.aBoolean115);
						if (local221 != null) {
							local195[local197++] = local221;
						}
					}
				}
				@Pc(260) Class1_Sub3_Sub4_Sub1 local260 = new Class1_Sub3_Sub4_Sub1(local195, local197);
				for (@Pc(262) int local262 = 0; local262 < 5; local262++) {
					if (this.anIntArray435[local262] != 0) {
						local260.method347(Static3.aShortArrayArray1[local262][0], Static3.aShortArrayArray1[local262][this.anIntArray435[local262]]);
						if (local262 == 1) {
							local260.method347(Static124.aShortArray14[0], Static124.aShortArray14[this.anIntArray435[local262]]);
						}
					}
				}
				local115 = local260.method356(64, 850, -30, -50, -30);
				Static65.aClass28_45.method789(local115, local36);
				this.aLong89 = local36;
			}
		}
		if (arg3 == null && arg2 == null) {
			return local115;
		}
		@Pc(344) Class1_Sub3_Sub4_Sub4 local344;
		if (arg3 != null && arg2 != null) {
			local344 = arg3.method1434(arg2, local115, arg0, arg1);
		} else if (arg3 == null) {
			local344 = arg2.method1430(local115, arg0);
		} else {
			local344 = arg3.method1430(local115, arg1);
		}
		return local344;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([IIZ[II)V")
	public void method2045(@OriginalArg(0) int[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 == null) {
			arg0 = new int[12];
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static109.anInt2692; local16++) {
					@Pc(22) Class1_Sub3_Sub13 local22 = Static70.method1225(local16);
					if (local22 != null && !local22.aBoolean76 && local22.anInt2197 == local12 + (arg1 ? 7 : 0)) {
						arg0[Static106.anIntArray395[local12]] = local16 + 256;
						break;
					}
				}
			}
		}
		this.anIntArray435 = arg2;
		this.anInt2889 = arg3;
		this.aBoolean115 = arg1;
		this.anIntArray434 = arg0;
		this.method2039();
	}
}
