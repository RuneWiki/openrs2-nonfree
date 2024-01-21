import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class31 {

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
	private int anInt1942;

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "[I")
	private int[] anIntArray165;

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "J")
	private long aLong55;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "Z")
	public boolean aBoolean78;

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "[I")
	private int[] anIntArray166;

	@OriginalMember(owner = "client!ia", name = "u", descriptor = "J")
	private long aLong56;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)Lclient!ja;")
	public Class1_Sub1_Sub5_Sub5 method1279() {
		if (this.anInt1942 != -1) {
			return Static164.method3047(this.anInt1942).method2590();
		}
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int local21 = 0; local21 < 12; local21++) {
			@Pc(28) int local28 = this.anIntArray166[local21];
			if (local28 >= 256 && local28 < 512 && !Static169.method3113(local28 - 256).method204()) {
				local19 = true;
			}
			if (local28 >= 512 && !Static101.method2134(local28 - 512).method48(this.aBoolean78)) {
				local19 = true;
			}
		}
		if (local19) {
			return null;
		}
		@Pc(72) Class1_Sub1_Sub5_Sub5[] local72 = new Class1_Sub1_Sub5_Sub5[12];
		@Pc(74) int local74 = 0;
		for (@Pc(76) int local76 = 0; local76 < 12; local76++) {
			@Pc(83) int local83 = this.anIntArray166[local76];
			@Pc(101) Class1_Sub1_Sub5_Sub5 local101;
			if (local83 >= 256 && local83 < 512) {
				local101 = Static169.method3113(local83 - 256).method203();
				if (local101 != null) {
					local72[local74++] = local101;
				}
			}
			if (local83 >= 512) {
				local101 = Static101.method2134(local83 - 512).method46(this.aBoolean78);
				if (local101 != null) {
					local72[local74++] = local101;
				}
			}
		}
		@Pc(138) Class1_Sub1_Sub5_Sub5 local138 = new Class1_Sub1_Sub5_Sub5(local72, local74);
		for (@Pc(140) int local140 = 0; local140 < 5; local140++) {
			if (Static17.aShortArrayArray7[local140].length > this.anIntArray165[local140]) {
				local138.method1489(Static1.aShortArray3[local140], Static17.aShortArrayArray7[local140][this.anIntArray165[local140]]);
			}
			if (this.anIntArray165[local140] < Static106.aShortArrayArray6[local140].length) {
				local138.method1489(Static81.aShortArray21[local140], Static106.aShortArrayArray6[local140][this.anIntArray165[local140]]);
			}
		}
		return local138;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BZ)V")
	public void method1280(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean78 != arg0) {
			this.method1287(null, arg0, this.anIntArray165, -1);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!hc;I)V")
	public void method1281(@OriginalArg(0) Class1_Sub6 arg0) {
		arg0.method530(this.aBoolean78 ? 1 : 0);
		@Pc(21) int local21;
		for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
			local21 = this.anIntArray166[Static167.anIntArray413[local12]];
			if (local21 == 0) {
				arg0.method530(-1);
			} else {
				arg0.method530(local21 - 256);
			}
		}
		for (local21 = 0; local21 < 5; local21++) {
			arg0.method530(this.anIntArray165[local21]);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	private void method1283() {
		@Pc(8) long local8 = this.aLong55;
		this.aLong55 = 0L;
		@Pc(16) int local16 = this.anIntArray166[9];
		@Pc(26) int local26 = this.anIntArray166[5];
		this.anIntArray166[9] = local26;
		this.anIntArray166[5] = local16;
		for (@Pc(38) int local38 = 0; local38 < 12; local38++) {
			this.aLong55 <<= 0x4;
			if (this.anIntArray166[local38] >= 256) {
				this.aLong55 += this.anIntArray166[local38] - 256;
			}
		}
		if (this.anIntArray166[0] >= 256) {
			this.aLong55 += this.anIntArray166[0] - 256 >> 4;
		}
		if (this.anIntArray166[1] >= 256) {
			this.aLong55 += this.anIntArray166[1] - 256 >> 8;
		}
		for (@Pc(110) int local110 = 0; local110 < 5; local110++) {
			this.aLong55 <<= 0x3;
			this.aLong55 += this.anIntArray165[local110];
		}
		this.anIntArray166[5] = local26;
		this.aLong55 <<= 0x1;
		this.anIntArray166[9] = local16;
		this.aLong55 += this.aBoolean78 ? 1 : 0;
		if (local8 != 0L && local8 != this.aLong55) {
			Static30.aClass66_4.method2602(local8);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZB)V")
	public void method1284(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) int local4 = this.anIntArray165[arg0];
		if (arg1) {
			local4++;
			if (local4 >= Static17.aShortArrayArray7[arg0].length) {
				local4 = 0;
			}
		} else {
			local4--;
			if (local4 < 0) {
				local4 = Static17.aShortArrayArray7[arg0].length - 1;
			}
		}
		this.anIntArray165[arg0] = local4;
		this.method1283();
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)I")
	public int method1285() {
		return this.anInt1942 == -1 ? (this.anIntArray166[8] << 10) + (this.anIntArray165[4] << 20) + (this.anIntArray165[0] << 25) + (this.anIntArray166[0] << 15) + (this.anIntArray166[11] << 5) + this.anIntArray166[1] : Static164.method3047(this.anInt1942).anInt3799 + 305419896;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "([IZB[II)V")
	public void method1287(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 == null) {
			arg0 = new int[12];
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static8.anInt224; local16++) {
					@Pc(22) Class1_Sub1_Sub4 local22 = Static169.method3113(local16);
					if (local22 != null && !local22.aBoolean11 && local22.anInt335 == (arg1 ? 7 : 0) + local12) {
						arg0[Static167.anIntArray413[local12]] = local16 + 256;
						break;
					}
				}
			}
		}
		this.anIntArray165 = arg2;
		this.aBoolean78 = arg1;
		this.anIntArray166 = arg0;
		this.anInt1942 = arg3;
		this.method1283();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZI)V")
	public void method1288(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 && this.aBoolean78) {
			return;
		}
		@Pc(21) int local21 = this.anIntArray166[Static167.anIntArray413[arg1]];
		if (local21 == 0) {
			return;
		}
		local21 -= 256;
		@Pc(54) Class1_Sub1_Sub4 local54;
		do {
			if (arg0) {
				local21++;
				if (Static8.anInt224 <= local21) {
					local21 = 0;
				}
			} else {
				local21--;
				if (local21 < 0) {
					local21 = Static8.anInt224 - 1;
				}
			}
			local54 = Static169.method3113(local21);
		} while (local54 == null || local54.aBoolean11 || local54.anInt335 != arg1 + (this.aBoolean78 ? 7 : 0));
		this.anIntArray166[Static167.anIntArray413[arg1]] = local21 + 256;
		this.method1283();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!pf;IIILclient!pf;)Lclient!rg;")
	public Class1_Sub1_Sub5_Sub4 method1289(@OriginalArg(0) Class1_Sub1_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1_Sub12 arg3) {
		if (this.anInt1942 != -1) {
			return Static164.method3047(this.anInt1942).method2585(arg3, arg0, arg2, arg1);
		}
		@Pc(29) long local29 = this.aLong55;
		@Pc(32) int[] local32 = this.anIntArray166;
		if (arg0 != null && (arg0.anInt3458 >= 0 || arg0.anInt3448 >= 0)) {
			local32 = new int[12];
			for (@Pc(45) int local45 = 0; local45 < 12; local45++) {
				local32[local45] = this.anIntArray166[local45];
			}
			if (arg0.anInt3458 >= 0) {
				local29 += arg0.anInt3458 - this.anIntArray166[5] << 8;
				local32[5] = arg0.anInt3458;
			}
			if (arg0.anInt3448 >= 0) {
				local29 += arg0.anInt3448 - this.anIntArray166[3] << 16;
				local32[3] = arg0.anInt3448;
			}
		}
		@Pc(114) Class1_Sub1_Sub5_Sub4 local114 = (Class1_Sub1_Sub5_Sub4) Static30.aClass66_4.method2599(local29);
		if (local114 == null) {
			@Pc(118) boolean local118 = false;
			for (@Pc(120) int local120 = 0; local120 < 12; local120++) {
				@Pc(126) int local126 = local32[local120];
				if (local126 >= 256 && local126 < 512 && !Static169.method3113(local126 - 256).method201()) {
					local118 = true;
				}
				if (local126 >= 512 && !Static101.method2134(local126 - 512).method42(this.aBoolean78)) {
					local118 = true;
				}
			}
			if (local118) {
				if (this.aLong56 != -1L) {
					local114 = (Class1_Sub1_Sub5_Sub4) Static30.aClass66_4.method2599(this.aLong56);
				}
				if (local114 == null) {
					return null;
				}
			}
			if (local114 == null) {
				@Pc(188) Class1_Sub1_Sub5_Sub5[] local188 = new Class1_Sub1_Sub5_Sub5[12];
				@Pc(190) int local190 = 0;
				for (@Pc(192) int local192 = 0; local192 < 12; local192++) {
					@Pc(198) int local198 = local32[local192];
					@Pc(214) Class1_Sub1_Sub5_Sub5 local214;
					if (local198 >= 256 && local198 < 512) {
						local214 = Static169.method3113(local198 - 256).method202();
						if (local214 != null) {
							local188[local190++] = local214;
						}
					}
					if (local198 >= 512) {
						local214 = Static101.method2134(local198 - 512).method45(this.aBoolean78);
						if (local214 != null) {
							local188[local190++] = local214;
						}
					}
				}
				@Pc(255) Class1_Sub1_Sub5_Sub5 local255 = new Class1_Sub1_Sub5_Sub5(local188, local190);
				for (@Pc(257) int local257 = 0; local257 < 5; local257++) {
					if (this.anIntArray165[local257] < Static17.aShortArrayArray7[local257].length) {
						local255.method1489(Static1.aShortArray3[local257], Static17.aShortArrayArray7[local257][this.anIntArray165[local257]]);
					}
					if (this.anIntArray165[local257] < Static106.aShortArrayArray6[local257].length) {
						local255.method1489(Static81.aShortArray21[local257], Static106.aShortArrayArray6[local257][this.anIntArray165[local257]]);
					}
				}
				local114 = local255.method1472(64, 850, -30, -50, -30, true);
				Static30.aClass66_4.method2597(local29, local114);
				this.aLong56 = local29;
			}
		}
		if (arg0 == null && arg3 == null) {
			return local114;
		}
		@Pc(341) Class1_Sub1_Sub5_Sub4 local341;
		if (arg0 != null && arg3 != null) {
			local341 = arg0.method2406(arg2, local114, arg3, arg1);
		} else if (arg0 == null) {
			local341 = arg3.method2409(local114, arg1);
		} else {
			local341 = arg0.method2409(local114, arg2);
		}
		return local341;
	}
}
