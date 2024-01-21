import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class32 {

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "[I")
	private int[] anIntArray155;

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "[I")
	private int[] anIntArray156;

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "Z")
	public boolean aBoolean51;

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
	private int anInt1363;

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "J")
	private long aLong49;

	@OriginalMember(owner = "client!ib", name = "I", descriptor = "J")
	private long aLong50;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZ)V")
	public void method925(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean51) {
			this.method938(this.anIntArray155, -1, arg0, null);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILclient!wc;Lclient!wc;I)Lclient!bf;")
	public Class5_Sub1_Sub1_Sub2 method927(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub1_Sub18 arg1, @OriginalArg(3) Class5_Sub1_Sub18 arg2, @OriginalArg(4) int arg3) {
		if (this.anInt1363 != -1) {
			return Static56.method994(this.anInt1363).method1888(arg2, arg0, arg1, arg3);
		}
		@Pc(23) long local23 = this.aLong50;
		@Pc(26) int[] local26 = this.anIntArray156;
		if (arg1 != null && (arg1.anInt2947 >= 0 || arg1.anInt2942 >= 0)) {
			local26 = new int[12];
			for (@Pc(39) int local39 = 0; local39 < 12; local39++) {
				local26[local39] = this.anIntArray156[local39];
			}
			if (arg1.anInt2947 >= 0) {
				local23 += arg1.anInt2947 - this.anIntArray156[5] << 8;
				local26[5] = arg1.anInt2947;
			}
			if (arg1.anInt2942 >= 0) {
				local23 += arg1.anInt2942 - this.anIntArray156[3] << 16;
				local26[3] = arg1.anInt2942;
			}
		}
		@Pc(108) Class5_Sub1_Sub1_Sub2 local108 = (Class5_Sub1_Sub1_Sub2) Static72.aClass54_28.method1397(local23);
		if (local108 == null) {
			@Pc(112) boolean local112 = false;
			for (@Pc(114) int local114 = 0; local114 < 12; local114++) {
				@Pc(120) int local120 = local26[local114];
				if (local120 >= 256 && local120 < 512 && !Static28.method576(local120 - 256).method1384()) {
					local112 = true;
				}
				if (local120 >= 512 && !Static33.method691(local120 - 512).method1933(this.aBoolean51)) {
					local112 = true;
				}
			}
			if (local112) {
				if (this.aLong49 != -1L) {
					local108 = (Class5_Sub1_Sub1_Sub2) Static72.aClass54_28.method1397(this.aLong49);
				}
				if (local108 == null) {
					return null;
				}
			}
			if (local108 == null) {
				@Pc(184) Class5_Sub1_Sub1_Sub7[] local184 = new Class5_Sub1_Sub1_Sub7[12];
				@Pc(186) int local186 = 0;
				for (@Pc(188) int local188 = 0; local188 < 12; local188++) {
					@Pc(194) int local194 = local26[local188];
					@Pc(210) Class5_Sub1_Sub1_Sub7 local210;
					if (local194 >= 256 && local194 < 512) {
						local210 = Static28.method576(local194 - 256).method1392();
						if (local210 != null) {
							local184[local186++] = local210;
						}
					}
					if (local194 >= 512) {
						local210 = Static33.method691(local194 - 512).method1925(this.aBoolean51);
						if (local210 != null) {
							local184[local186++] = local210;
						}
					}
				}
				@Pc(249) Class5_Sub1_Sub1_Sub7 local249 = new Class5_Sub1_Sub1_Sub7(local184, local186);
				for (@Pc(251) int local251 = 0; local251 < 5; local251++) {
					if (this.anIntArray155[local251] != 0) {
						local249.method1988(Static19.aShortArrayArray1[local251][0], Static19.aShortArrayArray1[local251][this.anIntArray155[local251]]);
						if (local251 == 1) {
							local249.method1988(Static66.aShortArray2[0], Static66.aShortArray2[this.anIntArray155[local251]]);
						}
					}
				}
				local108 = local249.method1987(64, 850, -30, -50, -30);
				Static72.aClass54_28.method1399(local108, local23);
				this.aLong49 = local23;
			}
		}
		if (arg1 == null && arg2 == null) {
			return local108;
		}
		@Pc(333) Class5_Sub1_Sub1_Sub2 local333;
		if (arg1 != null && arg2 != null) {
			local333 = arg1.method1954(arg0, arg3, arg2, local108);
		} else if (arg1 == null) {
			local333 = arg2.method1958(arg3, local108);
		} else {
			local333 = arg1.method1958(arg0, local108);
		}
		return local333;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZZ)V")
	public void method929(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) int local4 = this.anIntArray155[arg0];
		if (arg1) {
			local4++;
			if (local4 >= Static19.aShortArrayArray1[arg0].length) {
				local4 = 0;
			}
		} else {
			local4--;
			if (local4 < 0) {
				local4 = Static19.aShortArrayArray1[arg0].length - 1;
			}
		}
		this.anIntArray155[arg0] = local4;
		this.method930();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
	private void method930() {
		@Pc(8) long local8 = this.aLong50;
		this.aLong50 = 0L;
		@Pc(16) int local16 = this.anIntArray156[5];
		@Pc(21) int local21 = this.anIntArray156[9];
		this.anIntArray156[5] = local21;
		this.anIntArray156[9] = local16;
		for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
			this.aLong50 <<= 0x4;
			if (this.anIntArray156[local33] >= 256) {
				this.aLong50 += this.anIntArray156[local33] - 256;
			}
		}
		if (this.anIntArray156[0] >= 256) {
			this.aLong50 += this.anIntArray156[0] - 256 >> 4;
		}
		if (this.anIntArray156[1] >= 256) {
			this.aLong50 += this.anIntArray156[1] - 256 >> 8;
		}
		for (@Pc(115) int local115 = 0; local115 < 5; local115++) {
			this.aLong50 <<= 0x3;
			this.aLong50 += this.anIntArray155[local115];
		}
		this.anIntArray156[9] = local21;
		this.aLong50 <<= 0x1;
		this.anIntArray156[5] = local16;
		this.aLong50 += this.aBoolean51 ? 1 : 0;
		if (local8 != 0L && this.aLong50 != local8) {
			Static72.aClass54_28.method1403(local8);
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)I")
	public int method931() {
		return this.anInt1363 == -1 ? (this.anIntArray156[11] << 5) + (this.anIntArray156[8] << 10) + (this.anIntArray155[0] << 25) + (this.anIntArray155[4] << 20) + (this.anIntArray156[0] << 15) + this.anIntArray156[1] : Static56.method994(this.anInt1363).anInt2823 + 305419896;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)Lclient!wd;")
	public Class5_Sub1_Sub1_Sub7 method932() {
		if (this.anInt1363 != -1) {
			return Static56.method994(this.anInt1363).method1887();
		}
		@Pc(18) boolean local18 = false;
		for (@Pc(20) int local20 = 0; local20 < 12; local20++) {
			@Pc(27) int local27 = this.anIntArray156[local20];
			if (local27 >= 256 && local27 < 512 && !Static28.method576(local27 - 256).method1383()) {
				local18 = true;
			}
			if (local27 >= 512 && !Static33.method691(local27 - 512).method1930(this.aBoolean51)) {
				local18 = true;
			}
		}
		if (local18) {
			return null;
		}
		@Pc(75) Class5_Sub1_Sub1_Sub7[] local75 = new Class5_Sub1_Sub1_Sub7[12];
		@Pc(77) int local77 = 0;
		for (@Pc(79) int local79 = 0; local79 < 12; local79++) {
			@Pc(86) int local86 = this.anIntArray156[local79];
			@Pc(104) Class5_Sub1_Sub1_Sub7 local104;
			if (local86 >= 256 && local86 < 512) {
				local104 = Static28.method576(local86 - 256).method1386();
				if (local104 != null) {
					local75[local77++] = local104;
				}
			}
			if (local86 >= 512) {
				local104 = Static33.method691(local86 - 512).method1921(this.aBoolean51);
				if (local104 != null) {
					local75[local77++] = local104;
				}
			}
		}
		@Pc(145) Class5_Sub1_Sub1_Sub7 local145 = new Class5_Sub1_Sub1_Sub7(local75, local77);
		for (@Pc(152) int local152 = 0; local152 < 5; local152++) {
			if (this.anIntArray155[local152] != 0) {
				local145.method1988(Static19.aShortArrayArray1[local152][0], Static19.aShortArrayArray1[local152][this.anIntArray155[local152]]);
				if (local152 == 1) {
					local145.method1988(Static66.aShortArray2[0], Static66.aShortArray2[this.anIntArray155[local152]]);
				}
			}
		}
		return local145;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZBI)V")
	public void method933(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 && this.aBoolean51) {
			return;
		}
		@Pc(21) int local21 = this.anIntArray156[Static68.anIntArray206[arg1]];
		if (local21 == 0) {
			return;
		}
		local21 -= 256;
		@Pc(57) Class5_Sub1_Sub12 local57;
		do {
			if (arg0) {
				local21++;
				if (local21 >= Static98.anInt1927) {
					local21 = 0;
				}
			} else {
				local21--;
				if (local21 < 0) {
					local21 = Static98.anInt1927 - 1;
				}
			}
			local57 = Static28.method576(local21);
		} while (local57 == null || local57.aBoolean97 || local57.anInt2047 != arg1 + (this.aBoolean51 ? 7 : 0));
		this.anIntArray156[Static68.anIntArray206[arg1]] = local21 + 256;
		this.method930();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!qe;I)V")
	public void method934(@OriginalArg(0) Class5_Sub11 arg0) {
		arg0.method1545(this.aBoolean51 ? 1 : 0);
		@Pc(25) int local25;
		for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
			local25 = this.anIntArray156[Static68.anIntArray206[local16]];
			if (local25 == 0) {
				arg0.method1545(-1);
			} else {
				arg0.method1545(local25 - 256);
			}
		}
		for (local25 = 0; local25 < 5; local25++) {
			arg0.method1545(this.anIntArray155[local25]);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([IIIZ[I)V")
	public void method938(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[] arg3) {
		if (arg3 == null) {
			arg3 = new int[12];
			for (@Pc(8) int local8 = 0; local8 < 7; local8++) {
				for (@Pc(12) int local12 = 0; local12 < Static98.anInt1927; local12++) {
					@Pc(18) Class5_Sub1_Sub12 local18 = Static28.method576(local12);
					if (local18 != null && !local18.aBoolean97 && local18.anInt2047 == local8 + (arg2 ? 7 : 0)) {
						arg3[Static68.anIntArray206[local8]] = local12 + 256;
						break;
					}
				}
			}
		}
		this.aBoolean51 = arg2;
		this.anIntArray155 = arg0;
		this.anInt1363 = arg1;
		this.anIntArray156 = arg3;
		this.method930();
	}
}
