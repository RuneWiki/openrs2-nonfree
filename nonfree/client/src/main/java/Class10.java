import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class10 {

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "[I")
	private int[] anIntArray56;

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "Z")
	public boolean aBoolean29;

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "[I")
	private int[] anIntArray59;

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "J")
	private long aLong35;

	@OriginalMember(owner = "client!cb", name = "A", descriptor = "J")
	private long aLong36;

	@OriginalMember(owner = "client!cb", name = "C", descriptor = "I")
	private int anInt615;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZZ)V")
	public void method352(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(16) int local16 = this.anIntArray56[arg0];
		if (arg1) {
			local16++;
			if (Static127.aShortArrayArray7[arg0].length <= local16) {
				local16 = 0;
			}
		} else {
			local16--;
			if (local16 < 0) {
				local16 = Static127.aShortArrayArray7[arg0].length - 1;
			}
		}
		this.anIntArray56[arg0] = local16;
		this.method358();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!of;)V")
	public void method353(@OriginalArg(1) Class1_Sub19 arg0) {
		arg0.method2061(this.aBoolean29 ? 1 : 0);
		@Pc(29) int local29;
		for (@Pc(20) int local20 = 0; local20 < 7; local20++) {
			local29 = this.anIntArray59[Static51.anIntArray154[local20]];
			if (local29 == 0) {
				arg0.method2061(-1);
			} else {
				arg0.method2061(local29 - 256);
			}
		}
		for (local29 = 0; local29 < 5; local29++) {
			arg0.method2061(this.anIntArray56[local29]);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZII)V")
	public void method354(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1 && this.aBoolean29) {
			return;
		}
		@Pc(19) int local19 = this.anIntArray59[Static51.anIntArray154[arg1]];
		if (local19 == 0) {
			return;
		}
		local19 -= 256;
		@Pc(49) Class1_Sub1_Sub5 local49;
		do {
			if (arg0) {
				local19++;
				if (local19 >= Static116.anInt2809) {
					local19 = 0;
				}
			} else {
				local19--;
				if (local19 < 0) {
					local19 = Static116.anInt2809 - 1;
				}
			}
			local49 = Static102.method1711(local19);
		} while (local49 == null || local49.aBoolean66 || (this.aBoolean29 ? 7 : 0) + arg1 != local49.anInt1134);
		this.anIntArray59[Static51.anIntArray154[arg1]] = local19 + 256;
		this.method358();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!gd;IILclient!gd;I)Lclient!ka;")
	public Class1_Sub1_Sub1_Sub2 method355(@OriginalArg(0) Class1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub1_Sub6 arg2, @OriginalArg(4) int arg3) {
		if (this.anInt615 != -1) {
			return Static65.method1119(this.anInt615).method2017(arg3, arg0, arg1, arg2);
		}
		@Pc(30) int[] local30 = this.anIntArray59;
		@Pc(33) long local33 = this.aLong35;
		if (arg2 != null && (arg2.anInt1210 >= 0 || arg2.anInt1207 >= 0)) {
			local30 = new int[12];
			for (@Pc(46) int local46 = 0; local46 < 12; local46++) {
				local30[local46] = this.anIntArray59[local46];
			}
			if (arg2.anInt1210 >= 0) {
				local33 += arg2.anInt1210 - this.anIntArray59[5] << 8;
				local30[5] = arg2.anInt1210;
			}
			if (arg2.anInt1207 >= 0) {
				local33 += arg2.anInt1207 - this.anIntArray59[3] << 16;
				local30[3] = arg2.anInt1207;
			}
		}
		@Pc(116) Class1_Sub1_Sub1_Sub2 local116 = (Class1_Sub1_Sub1_Sub2) Static29.aClass63_7.method1663(local33);
		if (local116 == null) {
			@Pc(120) boolean local120 = false;
			for (@Pc(122) int local122 = 0; local122 < 12; local122++) {
				@Pc(128) int local128 = local30[local122];
				if (local128 >= 256 && local128 < 512 && !Static102.method1711(local128 - 256).method677()) {
					local120 = true;
				}
				if (local128 >= 512 && !Static74.method1334(local128 - 512).method1325(this.aBoolean29)) {
					local120 = true;
				}
			}
			if (local120) {
				if (this.aLong36 != -1L) {
					local116 = (Class1_Sub1_Sub1_Sub2) Static29.aClass63_7.method1663(this.aLong36);
				}
				if (local116 == null) {
					return null;
				}
			}
			if (local116 == null) {
				@Pc(192) Class1_Sub1_Sub1_Sub4[] local192 = new Class1_Sub1_Sub1_Sub4[12];
				@Pc(194) int local194 = 0;
				for (@Pc(196) int local196 = 0; local196 < 12; local196++) {
					@Pc(202) int local202 = local30[local196];
					@Pc(220) Class1_Sub1_Sub1_Sub4 local220;
					if (local202 >= 256 && local202 < 512) {
						local220 = Static102.method1711(local202 - 256).method673();
						if (local220 != null) {
							local192[local194++] = local220;
						}
					}
					if (local202 >= 512) {
						local220 = Static74.method1334(local202 - 512).method1322(this.aBoolean29);
						if (local220 != null) {
							local192[local194++] = local220;
						}
					}
				}
				@Pc(261) Class1_Sub1_Sub1_Sub4 local261 = new Class1_Sub1_Sub1_Sub4(local192, local194);
				for (@Pc(263) int local263 = 0; local263 < 5; local263++) {
					if (this.anIntArray56[local263] < Static127.aShortArrayArray7[local263].length) {
						local261.method1415(Static56.aShortArray12[local263], Static127.aShortArrayArray7[local263][this.anIntArray56[local263]]);
					}
					if (this.anIntArray56[local263] < Static54.aShortArrayArray6[local263].length) {
						local261.method1415(Static77.aShortArray10[local263], Static54.aShortArrayArray6[local263][this.anIntArray56[local263]]);
					}
				}
				local116 = local261.method1410(64, 850, -30, -50, -30);
				Static29.aClass63_7.method1659(local116, local33);
				this.aLong36 = local33;
			}
		}
		if (arg2 == null && arg0 == null) {
			return local116;
		}
		@Pc(351) Class1_Sub1_Sub1_Sub2 local351;
		if (arg2 != null && arg0 != null) {
			local351 = arg2.method724(arg1, arg3, local116, arg0);
		} else if (arg2 == null) {
			local351 = arg0.method716(arg3, local116);
		} else {
			local351 = arg2.method716(arg1, local116);
		}
		return local351;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)Lclient!nf;")
	public Class1_Sub1_Sub1_Sub4 method356() {
		if (this.anInt615 != -1) {
			return Static65.method1119(this.anInt615).method2021();
		}
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int local21 = 0; local21 < 12; local21++) {
			@Pc(28) int local28 = this.anIntArray59[local21];
			if (local28 >= 256 && local28 < 512 && !Static102.method1711(local28 - 256).method672()) {
				local19 = true;
			}
			if (local28 >= 512 && !Static74.method1334(local28 - 512).method1329(this.aBoolean29)) {
				local19 = true;
			}
		}
		if (local19) {
			return null;
		}
		@Pc(74) Class1_Sub1_Sub1_Sub4[] local74 = new Class1_Sub1_Sub1_Sub4[12];
		@Pc(76) int local76 = 0;
		for (@Pc(78) int local78 = 0; local78 < 12; local78++) {
			@Pc(85) int local85 = this.anIntArray59[local78];
			@Pc(99) Class1_Sub1_Sub1_Sub4 local99;
			if (local85 >= 256 && local85 < 512) {
				local99 = Static102.method1711(local85 - 256).method670();
				if (local99 != null) {
					local74[local76++] = local99;
				}
			}
			if (local85 >= 512) {
				local99 = Static74.method1334(local85 - 512).method1324(this.aBoolean29);
				if (local99 != null) {
					local74[local76++] = local99;
				}
			}
		}
		@Pc(140) Class1_Sub1_Sub1_Sub4 local140 = new Class1_Sub1_Sub1_Sub4(local74, local76);
		for (@Pc(142) int local142 = 0; local142 < 5; local142++) {
			if (Static127.aShortArrayArray7[local142].length > this.anIntArray56[local142]) {
				local140.method1415(Static56.aShortArray12[local142], Static127.aShortArrayArray7[local142][this.anIntArray56[local142]]);
			}
			if (this.anIntArray56[local142] < Static54.aShortArrayArray6[local142].length) {
				local140.method1415(Static77.aShortArray10[local142], Static54.aShortArrayArray6[local142][this.anIntArray56[local142]]);
			}
		}
		return local140;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)I")
	public int method357() {
		return this.anInt615 == -1 ? (this.anIntArray59[0] << 15) + (this.anIntArray56[4] << 20) + (this.anIntArray56[0] << 25) + (this.anIntArray59[8] << 10) + (this.anIntArray59[11] << 5) + this.anIntArray59[1] : Static65.method1119(this.anInt615).anInt3043 + 305419896;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
	private void method358() {
		@Pc(8) long local8 = this.aLong35;
		this.aLong35 = 0L;
		@Pc(16) int local16 = this.anIntArray59[5];
		@Pc(21) int local21 = this.anIntArray59[9];
		this.anIntArray59[9] = local16;
		this.anIntArray59[5] = local21;
		for (@Pc(41) int local41 = 0; local41 < 12; local41++) {
			this.aLong35 <<= 0x4;
			if (this.anIntArray59[local41] >= 256) {
				this.aLong35 += this.anIntArray59[local41] - 256;
			}
		}
		if (this.anIntArray59[0] >= 256) {
			this.aLong35 += this.anIntArray59[0] - 256 >> 4;
		}
		if (this.anIntArray59[1] >= 256) {
			this.aLong35 += this.anIntArray59[1] - 256 >> 8;
		}
		for (@Pc(113) int local113 = 0; local113 < 5; local113++) {
			this.aLong35 <<= 0x3;
			this.aLong35 += this.anIntArray56[local113];
		}
		this.anIntArray59[5] = local16;
		this.aLong35 <<= 0x1;
		this.aLong35 += this.aBoolean29 ? 1 : 0;
		this.anIntArray59[9] = local21;
		if (local8 != 0L && local8 != this.aLong35) {
			Static29.aClass63_7.method1660(local8);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II[I[IZ)V")
	public void method362(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3) {
		if (arg1 == null) {
			arg1 = new int[12];
			for (@Pc(8) int local8 = 0; local8 < 7; local8++) {
				for (@Pc(12) int local12 = 0; local12 < Static116.anInt2809; local12++) {
					@Pc(18) Class1_Sub1_Sub5 local18 = Static102.method1711(local12);
					if (local18 != null && !local18.aBoolean66 && (arg3 ? 7 : 0) + local8 == local18.anInt1134) {
						arg1[Static51.anIntArray154[local8]] = local12 + 256;
						break;
					}
				}
			}
		}
		this.anInt615 = arg0;
		this.anIntArray59 = arg1;
		this.aBoolean29 = arg3;
		this.anIntArray56 = arg2;
		this.method358();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZI)V")
	public void method363(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean29) {
			this.method362(-1, null, this.anIntArray56, arg0);
		}
	}
}
