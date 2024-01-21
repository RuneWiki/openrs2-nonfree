import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class28 {

	@OriginalMember(owner = "client!he", name = "b", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "[I")
	private int[] anIntArray187;

	@OriginalMember(owner = "client!he", name = "j", descriptor = "I")
	private int anInt1377;

	@OriginalMember(owner = "client!he", name = "k", descriptor = "[I")
	private int[] anIntArray189;

	@OriginalMember(owner = "client!he", name = "m", descriptor = "Z")
	public boolean aBoolean118;

	@OriginalMember(owner = "client!he", name = "s", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)I")
	public int method862() {
		return this.anInt1377 == -1 ? (this.anIntArray189[11] << 5) + (this.anIntArray189[8] << 10) + (this.anIntArray187[4] << 20) + (this.anIntArray187[0] << 25) + (this.anIntArray189[0] << 15) + this.anIntArray189[1] : Static120.method2132(this.anInt1377).anInt903 + 305419896;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!qc;)V")
	public void method863(@OriginalArg(1) Class1_Sub18 arg0) {
		arg0.method2168(this.aBoolean118 ? 1 : 0);
		@Pc(21) int local21;
		for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
			local21 = this.anIntArray189[Static32.anIntArray105[local12]];
			if (local21 == 0) {
				arg0.method2168(-1);
			} else {
				arg0.method2168(local21 - 256);
			}
		}
		for (local21 = 0; local21 < 5; local21++) {
			arg0.method2168(this.anIntArray187[local21]);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BZ)V")
	public void method865(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean118) {
			this.method868(arg0, null, -1, this.anIntArray187);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIILclient!f;Lclient!f;)Lclient!na;")
	public Class1_Sub1_Sub2_Sub7 method866(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub7 arg2, @OriginalArg(4) Class1_Sub1_Sub7 arg3) {
		if (this.anInt1377 != -1) {
			return Static120.method2132(this.anInt1377).method518(arg1, arg0, arg3, arg2);
		}
		@Pc(24) int[] local24 = this.anIntArray189;
		@Pc(27) long local27 = this.aLong33;
		if (arg3 != null && (arg3.anInt1033 >= 0 || arg3.anInt1031 >= 0)) {
			local24 = new int[12];
			for (@Pc(43) int local43 = 0; local43 < 12; local43++) {
				local24[local43] = this.anIntArray189[local43];
			}
			if (arg3.anInt1033 >= 0) {
				local27 += arg3.anInt1033 - this.anIntArray189[5] << 8;
				local24[5] = arg3.anInt1033;
			}
			if (arg3.anInt1031 >= 0) {
				local27 += arg3.anInt1031 - this.anIntArray189[3] << 16;
				local24[3] = arg3.anInt1031;
			}
		}
		@Pc(111) Class1_Sub1_Sub2_Sub7 local111 = (Class1_Sub1_Sub2_Sub7) Static58.aClass33_21.method1038(local27);
		if (local111 == null) {
			@Pc(115) boolean local115 = false;
			for (@Pc(117) int local117 = 0; local117 < 12; local117++) {
				@Pc(123) int local123 = local24[local117];
				if (local123 >= 256 && local123 < 512 && !Static54.method991(local123 - 256).method1024()) {
					local115 = true;
				}
				if (local123 >= 512 && !Static8.method224(local123 - 512).method1906(this.aBoolean118)) {
					local115 = true;
				}
			}
			if (local115) {
				if (this.aLong32 != -1L) {
					local111 = (Class1_Sub1_Sub2_Sub7) Static58.aClass33_21.method1038(this.aLong32);
				}
				if (local111 == null) {
					return null;
				}
			}
			if (local111 == null) {
				@Pc(187) Class1_Sub1_Sub2_Sub5[] local187 = new Class1_Sub1_Sub2_Sub5[12];
				@Pc(189) int local189 = 0;
				for (@Pc(191) int local191 = 0; local191 < 12; local191++) {
					@Pc(197) int local197 = local24[local191];
					@Pc(215) Class1_Sub1_Sub2_Sub5 local215;
					if (local197 >= 256 && local197 < 512) {
						local215 = Static54.method991(local197 - 256).method1023();
						if (local215 != null) {
							local187[local189++] = local215;
						}
					}
					if (local197 >= 512) {
						local215 = Static8.method224(local197 - 512).method1917(this.aBoolean118);
						if (local215 != null) {
							local187[local189++] = local215;
						}
					}
				}
				@Pc(254) Class1_Sub1_Sub2_Sub5 local254 = new Class1_Sub1_Sub2_Sub5(local187, local189);
				for (@Pc(256) int local256 = 0; local256 < 5; local256++) {
					if (this.anIntArray187[local256] != 0) {
						local254.method1104(Static76.aShortArrayArray1[local256][0], Static76.aShortArrayArray1[local256][this.anIntArray187[local256]]);
						if (local256 == 1) {
							local254.method1104(Static94.aShortArray8[0], Static94.aShortArray8[this.anIntArray187[local256]]);
						}
					}
				}
				local111 = local254.method1101(64, 850, -30, -50, -30);
				Static58.aClass33_21.method1042(local111, local27);
				this.aLong32 = local27;
			}
		}
		if (arg3 == null && arg2 == null) {
			return local111;
		}
		@Pc(333) Class1_Sub1_Sub2_Sub7 local333;
		if (arg3 != null && arg2 != null) {
			local333 = arg3.method628(arg2, arg0, local111, arg1);
		} else if (arg3 == null) {
			local333 = arg2.method626(local111, arg1);
		} else {
			local333 = arg3.method626(local111, arg0);
		}
		return local333;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IZB)V")
	public void method867(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == 1 && this.aBoolean118) {
			return;
		}
		@Pc(21) int local21 = this.anIntArray189[Static32.anIntArray105[arg0]];
		if (local21 == 0) {
			return;
		}
		local21 -= 256;
		@Pc(56) Class1_Sub1_Sub12 local56;
		do {
			if (arg1) {
				local21++;
				if (Static64.anInt1664 <= local21) {
					local21 = 0;
				}
			} else {
				local21--;
				if (local21 < 0) {
					local21 = Static64.anInt1664 - 1;
				}
			}
			local56 = Static54.method991(local21);
		} while (local56 == null || local56.aBoolean135 || (this.aBoolean118 ? 7 : 0) + arg0 != local56.anInt1543);
		this.anIntArray189[Static32.anIntArray105[arg0]] = local21 + 256;
		this.method869();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Z[III[I)V")
	public void method868(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 == null) {
			arg1 = new int[12];
			for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
				for (@Pc(20) int local20 = 0; local20 < Static64.anInt1664; local20++) {
					@Pc(26) Class1_Sub1_Sub12 local26 = Static54.method991(local20);
					if (local26 != null && !local26.aBoolean135 && (arg0 ? 7 : 0) + local16 == local26.anInt1543) {
						arg1[Static32.anIntArray105[local16]] = local20 + 256;
						break;
					}
				}
			}
		}
		this.aBoolean118 = arg0;
		this.anInt1377 = arg2;
		this.anIntArray187 = arg3;
		this.anIntArray189 = arg1;
		this.method869();
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
	private void method869() {
		@Pc(8) long local8 = this.aLong33;
		this.aLong33 = 0L;
		@Pc(20) int local20 = this.anIntArray189[9];
		@Pc(25) int local25 = this.anIntArray189[5];
		this.anIntArray189[9] = local25;
		this.anIntArray189[5] = local20;
		for (@Pc(37) int local37 = 0; local37 < 12; local37++) {
			this.aLong33 <<= 0x4;
			if (this.anIntArray189[local37] >= 256) {
				this.aLong33 += this.anIntArray189[local37] - 256;
			}
		}
		if (this.anIntArray189[0] >= 256) {
			this.aLong33 += this.anIntArray189[0] - 256 >> 4;
		}
		if (this.anIntArray189[1] >= 256) {
			this.aLong33 += this.anIntArray189[1] - 256 >> 8;
		}
		for (@Pc(115) int local115 = 0; local115 < 5; local115++) {
			this.aLong33 <<= 0x3;
			this.aLong33 += this.anIntArray187[local115];
		}
		this.anIntArray189[9] = local20;
		this.anIntArray189[5] = local25;
		this.aLong33 <<= 0x1;
		this.aLong33 += this.aBoolean118 ? 1 : 0;
		if (local8 != 0L && local8 != this.aLong33) {
			Static58.aClass33_21.method1037(local8);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZIZ)V")
	public void method870(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anIntArray187[arg1];
		if (arg0) {
			local8++;
			if (local8 >= Static76.aShortArrayArray1[arg1].length) {
				local8 = 0;
			}
		} else {
			local8--;
			if (local8 < 0) {
				local8 = Static76.aShortArrayArray1[arg1].length - 1;
			}
		}
		this.anIntArray187[arg1] = local8;
		this.method869();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)Lclient!je;")
	public Class1_Sub1_Sub2_Sub5 method871() {
		if (this.anInt1377 != -1) {
			return Static120.method2132(this.anInt1377).method524();
		}
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int local21 = 0; local21 < 12; local21++) {
			@Pc(28) int local28 = this.anIntArray189[local21];
			if (local28 >= 256 && local28 < 512 && !Static54.method991(local28 - 256).method1026()) {
				local19 = true;
			}
			if (local28 >= 512 && !Static8.method224(local28 - 512).method1909(this.aBoolean118)) {
				local19 = true;
			}
		}
		if (local19) {
			return null;
		}
		@Pc(74) Class1_Sub1_Sub2_Sub5[] local74 = new Class1_Sub1_Sub2_Sub5[12];
		@Pc(76) int local76 = 0;
		for (@Pc(78) int local78 = 0; local78 < 12; local78++) {
			@Pc(85) int local85 = this.anIntArray189[local78];
			@Pc(101) Class1_Sub1_Sub2_Sub5 local101;
			if (local85 >= 256 && local85 < 512) {
				local101 = Static54.method991(local85 - 256).method1030();
				if (local101 != null) {
					local74[local76++] = local101;
				}
			}
			if (local85 >= 512) {
				local101 = Static8.method224(local85 - 512).method1918(this.aBoolean118);
				if (local101 != null) {
					local74[local76++] = local101;
				}
			}
		}
		@Pc(140) Class1_Sub1_Sub2_Sub5 local140 = new Class1_Sub1_Sub2_Sub5(local74, local76);
		for (@Pc(142) int local142 = 0; local142 < 5; local142++) {
			if (this.anIntArray187[local142] != 0) {
				local140.method1104(Static76.aShortArrayArray1[local142][0], Static76.aShortArrayArray1[local142][this.anIntArray187[local142]]);
				if (local142 == 1) {
					local140.method1104(Static94.aShortArray8[0], Static94.aShortArray8[this.anIntArray187[local142]]);
				}
			}
		}
		return local140;
	}
}
