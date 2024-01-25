import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class1_Sub5_Sub1_Sub1 extends Class1_Sub5_Sub1 {

	@OriginalMember(owner = "client!gf", name = "jc", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!gf", name = "rc", descriptor = "I")
	public int anInt2276;

	@OriginalMember(owner = "client!gf", name = "tc", descriptor = "I")
	private int anInt2278;

	@OriginalMember(owner = "client!gf", name = "wc", descriptor = "Lclient!tj;")
	public Class224 aClass224_1;

	@OriginalMember(owner = "client!gf", name = "yc", descriptor = "I")
	public int anInt2281;

	@OriginalMember(owner = "client!gf", name = "Mc", descriptor = "Ljava/lang/String;")
	public String aString25;

	@OriginalMember(owner = "client!gf", name = "ec", descriptor = "I")
	public int anInt2265 = 0;

	@OriginalMember(owner = "client!gf", name = "lc", descriptor = "I")
	public int anInt2271 = 0;

	@OriginalMember(owner = "client!gf", name = "mc", descriptor = "I")
	public int anInt2272 = -1;

	@OriginalMember(owner = "client!gf", name = "gc", descriptor = "I")
	public int anInt2267 = 0;

	@OriginalMember(owner = "client!gf", name = "ic", descriptor = "I")
	public int anInt2269 = -1;

	@OriginalMember(owner = "client!gf", name = "Ic", descriptor = "I")
	public int anInt2290 = -1;

	@OriginalMember(owner = "client!gf", name = "Hc", descriptor = "Z")
	public boolean aBoolean179 = false;

	@OriginalMember(owner = "client!gf", name = "qc", descriptor = "B")
	private byte aByte19 = 0;

	@OriginalMember(owner = "client!gf", name = "Lc", descriptor = "I")
	public int anInt2293 = -1;

	@OriginalMember(owner = "client!gf", name = "vc", descriptor = "I")
	public int anInt2280 = -1;

	@OriginalMember(owner = "client!gf", name = "xc", descriptor = "B")
	private byte aByte20 = 0;

	@OriginalMember(owner = "client!gf", name = "Pc", descriptor = "I")
	public int anInt2296 = 0;

	@OriginalMember(owner = "client!gf", name = "Dc", descriptor = "I")
	public int anInt2286 = -1;

	@OriginalMember(owner = "client!gf", name = "Nc", descriptor = "I")
	public int anInt2294 = -1;

	@OriginalMember(owner = "client!gf", name = "Rc", descriptor = "I")
	public int anInt2298 = -1;

	@OriginalMember(owner = "client!gf", name = "Tc", descriptor = "I")
	public int anInt2299 = 255;

	@OriginalMember(owner = "client!gf", name = "Wc", descriptor = "B")
	private byte aByte21 = 0;

	@OriginalMember(owner = "client!gf", name = "Uc", descriptor = "I")
	public int anInt2300 = 0;

	static {
		new Class32("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZLclient!vc;)Z")
	private boolean method2245(@OriginalArg(0) int arg0, @OriginalArg(2) Class63 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class103 local11 = this.method5552();
		@Pc(30) Class202 local30 = super.anInt6405 != -1 && super.anInt6429 == 0 ? Static36.aClass236_1.method5396(super.anInt6405) : null;
		@Pc(51) Class202 local51 = super.anInt6423 == -1 || this.aBoolean179 || super.aBoolean460 && local30 != null ? null : Static36.aClass236_1.method5396(super.anInt6423);
		@Pc(54) int local54 = local11.anInt2846;
		@Pc(57) int local57 = local11.anInt2810;
		if (local54 != 0 || local57 != 0 || local11.anInt2837 != 0 || local11.anInt2823 != 0) {
			arg0 |= 0x7;
		}
		super.aClass66Array3[0] = this.aClass224_1.method4881(Static321.aClass211_1, local30, super.anInt6450, super.aClass12Array3, super.anInt6427, arg1, Static15.aClass81_1, super.anInt6414, super.anInt6425, arg0, super.anInt6443, Static36.aClass236_1, Static192.aClass196_1, super.anInt6436, local51, Static46.aClass139_1, Static356.aClass48_2);
		@Pc(110) int local110 = Static291.method4410();
		if (Static253.anInt4468 < 96 && local110 > 50) {
			Static82.method1233();
		}
		@Pc(131) int local131;
		if (Static17.aClass117_1 != Static141.aClass117_7 && local110 < 50) {
			local131 = 50 - local110;
			while (Static30.anInt642 < local131) {
				Static168.aByteArrayArray6[Static30.anInt642] = new byte[102400];
				Static30.anInt642++;
			}
			while (local131 < Static30.anInt642) {
				Static30.anInt642--;
				Static168.aByteArrayArray6[Static30.anInt642] = null;
			}
		} else if (Static141.aClass117_7 != Static17.aClass117_1) {
			Static30.anInt642 = 0;
			Static168.aByteArrayArray6 = new byte[50][];
		}
		if (super.aClass66Array3[0] == null) {
			return false;
		}
		super.anInt6399 = super.aClass66Array3[0].method5140();
		this.method5550(super.aClass66Array3[0]);
		local131 = super.aClass247_7.method5629();
		super.anInt6445 = 0;
		super.anInt6426 = 0;
		super.anInt6409 = 0;
		if (local54 == 0 && local57 == 0) {
			this.method5541(this.method5547() << 7, this.method5547() << 7, local131);
		} else {
			this.method5541(local57, local54, local131);
			if (super.anInt6445 != 0) {
				super.aClass66Array3[0].method5153(super.anInt6445);
			}
			if (super.anInt6426 != 0) {
				super.aClass66Array3[0].method5145(super.anInt6426);
			}
			if (super.anInt6409 != 0) {
				super.aClass66Array3[0].method5132(0, super.anInt6409, 0);
			}
		}
		super.aClass66Array3[1] = null;
		if (!this.aBoolean179 && super.anInt6420 != -1 && super.anInt6404 != -1) {
			@Pc(287) Class34 local287 = Static149.aClass173_5.method3800(super.anInt6420);
			@Pc(307) Class66 local307 = local287.method735(super.anInt6404, (local287.aBoolean64 ? 7 : 2) | local7, super.anInt6442, Static36.aClass236_1, arg1, super.anInt6400);
			if (local307 != null) {
				local307.method5132(0, -super.anInt6411, 0);
				if (local287.aBoolean64 && (local54 != 0 || local57 != 0)) {
					if (super.anInt6445 != 0) {
						local307.method5153(super.anInt6445);
					}
					if (super.anInt6426 != 0) {
						local307.method5145(super.anInt6426);
					}
					if (super.anInt6409 != 0) {
						local307.method5132(0, super.anInt6409, 0);
					}
				}
				super.aClass66Array3[1] = local307;
			}
		}
		super.aClass66Array3[2] = null;
		if (!this.aBoolean179 && super.aClass2_Sub42_3 != null) {
			if (Static253.anInt4469 >= super.aClass2_Sub42_3.anInt6016) {
				super.aClass2_Sub42_3 = null;
			} else if (Static253.anInt4469 >= super.aClass2_Sub42_3.anInt6014) {
				@Pc(400) Class66 local400 = super.aClass2_Sub42_3.method5243(arg1, local7 | 0x7);
				if (local400 != null) {
					local400.method5132(-super.anInt6390 + super.aClass2_Sub42_3.anInt6007, super.aClass2_Sub42_3.anInt6023 + -super.anInt6387, -super.anInt6386 + super.aClass2_Sub42_3.anInt6021);
					if (local131 != 0) {
						local400.method5157(-local131 & 0x3FFF);
					}
					super.aClass66Array3[2] = local400;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZIIB)V")
	public void method2246(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt6456 < 9) {
			super.anInt6456++;
		}
		for (@Pc(20) int local20 = super.anInt6456; local20 > 0; local20--) {
			super.anIntArray1324[local20] = super.anIntArray1324[local20 - 1];
			super.anIntArray1323[local20] = super.anIntArray1323[local20 - 1];
			super.aByteArray115[local20] = super.aByteArray115[local20 - 1];
		}
		super.anIntArray1324[0] = arg0;
		super.anIntArray1323[0] = arg1;
		super.aByteArray115[0] = arg2;
	}

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "(I)Z")
	public boolean method2247() {
		return this.aClass224_1 != null;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(III)V")
	public void method2248(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anInt6454 = 0;
		super.anIntArray1324[0] = arg1;
		super.anInt6456 = 0;
		super.anInt6455 = 0;
		super.anIntArray1323[0] = arg0;
		@Pc(26) int local26 = this.method5547();
		super.anInt6390 = local26 * 64 + super.anIntArray1324[0] * 128;
		super.anInt6386 = local26 * 64 + super.anIntArray1323[0] * 128;
		if (Static206.aClass1_Sub5_Sub1_Sub1_1 == this) {
			Static181.method5324();
		}
		if (super.aClass10_Sub1_7 != null) {
			super.aClass10_Sub1_7.method232();
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!vc;II)Z")
	@Override
	public boolean method5642(@OriginalArg(1) Class63 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass224_1 == null || !this.method2245(65536, arg0)) {
			return true;
		}
		@Pc(19) Class44 local19 = arg0.method2024();
		@Pc(24) int local24 = super.aClass247_7.method5629();
		local19.method3536(local24);
		local19.method3527(super.anInt6390, super.anInt6387, super.anInt6386);
		for (@Pc(37) int local37 = 0; local37 < super.aClass66Array3.length; local37++) {
			if (super.aClass66Array3[local37] != null && super.aClass66Array3[local37].method5131(arg1, arg2, local19, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)I")
	@Override
	public int method5551() {
		return -1;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)I")
	@Override
	public int method5547() {
		return this.aClass224_1 == null || this.aClass224_1.anInt5666 == -1 ? super.method5547() : Static356.aClass48_2.method951(this.aClass224_1.anInt5666).anInt3332;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZB)Ljava/lang/String;")
	public String method2250() {
		return this.aString24;
	}

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "(B)V")
	@Override
	public void method5643() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!kk;B)V")
	public void method2251(@OriginalArg(0) Class2_Sub16 arg0) {
		arg0.anInt6145 = 0;
		@Pc(12) int local12 = arg0.method5350();
		this.aByte19 = (byte) (local12 & 0x1);
		@Pc(34) boolean local34 = (local12 & 0x2) != 0;
		@Pc(45) boolean local45 = (local12 & 0x4) != 0;
		@Pc(49) int local49 = super.method5547();
		this.method5544((local12 >> 3 & 0x7) + 1);
		this.aByte21 = (byte) (local12 >> 6 & 0x3);
		super.anInt6390 += (this.method5547() - local49) * 64;
		super.anInt6386 += (this.method5547() - local49) * 64;
		this.aByte20 = arg0.method5330();
		this.anInt2272 = arg0.method5330();
		this.anInt2269 = arg0.method5330();
		@Pc(109) int local109 = -1;
		this.anInt2267 = 0;
		@Pc(115) int[] local115 = new int[12];
		@Pc(138) int local138;
		@Pc(145) int local145;
		@Pc(187) int local187;
		for (@Pc(117) int local117 = 0; local117 < 12; local117++) {
			@Pc(123) int local123 = arg0.method5350();
			if (local123 == 0) {
				local115[local117] = 0;
			} else {
				local138 = arg0.method5350();
				local145 = (local123 << 8) + local138;
				if (local117 == 0 && local145 == 65535) {
					local109 = arg0.method5312();
					this.anInt2267 = arg0.method5350();
					break;
				}
				if (local145 >= 32768) {
					local145 = Static192.anIntArray722[local145 - 32768];
					local115[local117] = local145 | 0x40000000;
					local187 = Static15.aClass81_1.method2175(local145).anInt4412;
					if (local187 != 0) {
						this.anInt2267 = local187;
					}
				} else {
					local115[local117] = Integer.MIN_VALUE | local145 - 256;
				}
			}
		}
		@Pc(212) int[] local212 = new int[5];
		for (local138 = 0; local138 < 5; local138++) {
			local145 = arg0.method5350();
			if (local145 < 0 || Static158.aShortArrayArray3[local138].length <= local145) {
				local145 = 0;
			}
			local212[local138] = local145;
		}
		this.anInt2278 = arg0.method5312();
		this.aString25 = arg0.method5364();
		if (local34) {
			this.aString24 = arg0.method5364();
		} else {
			this.aString24 = this.aString25;
		}
		this.anInt2300 = arg0.method5350();
		if (local45) {
			this.anInt2271 = arg0.method5312();
			this.anInt2286 = -1;
			this.anInt2265 = this.anInt2300;
		} else {
			this.anInt2271 = 0;
			this.anInt2265 = arg0.method5350();
			this.anInt2286 = arg0.method5350();
			if (this.anInt2286 == 255) {
				this.anInt2286 = -1;
			}
		}
		local145 = this.anInt2296;
		this.anInt2296 = arg0.method5350();
		@Pc(335) int local335;
		if (this.anInt2296 == 0) {
			Static233.method3791(this);
		} else {
			local187 = this.anInt2294;
			@Pc(332) int local332 = this.anInt2298;
			local335 = this.anInt2290;
			@Pc(338) int local338 = this.anInt2293;
			@Pc(341) int local341 = this.anInt2299;
			this.anInt2294 = arg0.method5312();
			this.anInt2298 = arg0.method5312();
			this.anInt2290 = arg0.method5312();
			this.anInt2293 = arg0.method5312();
			this.anInt2299 = arg0.method5350();
			if (this.anInt2296 != local145 || this.anInt2294 != local187 || this.anInt2298 != local332 || local335 != this.anInt2290 || local338 != this.anInt2293 || this.anInt2299 != local341) {
				Static347.method5041(this);
			}
		}
		if (this.aClass224_1 == null) {
			this.aClass224_1 = new Class224();
		}
		local187 = this.aClass224_1.anInt5666;
		@Pc(425) int[] local425 = this.aClass224_1.anIntArray1158;
		this.aClass224_1.method4891(local115, local109, this.method5548(), local212, this.aByte19 == 1);
		if (local187 != local109) {
			super.anInt6390 = super.anIntArray1324[0] * 128 + this.method5547() * 64;
			super.anInt6386 = super.anIntArray1323[0] * 128 + this.method5547() * 64;
		}
		if (Static176.anInt3381 == super.anInt6413 && local425 != null) {
			for (local335 = 0; local335 < local212.length; local335++) {
				if (local425[local335] != local212[local335]) {
					Static15.aClass81_1.method2187();
					break;
				}
			}
		}
		if (super.aClass10_Sub1_7 != null) {
			super.aClass10_Sub1_7.method232();
		}
		if (super.anInt6423 == -1 || !super.aBoolean460) {
			return;
		}
		@Pc(528) Class103 local528 = this.method5552();
		if (!local528.method2673(super.anInt6423)) {
			super.anInt6423 = -1;
			super.aBoolean460 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIBI)V")
	public void method2252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (super.anInt6405 != -1 && Static36.aClass236_1.method5396(super.anInt6405).anInt4934 == 1) {
			super.anInt6405 = -1;
		}
		if (super.anInt6420 != -1) {
			@Pc(33) Class34 local33 = Static149.aClass173_5.method3800(super.anInt6420);
			if (local33.aBoolean65 && local33.anInt863 != -1 && Static36.aClass236_1.method5396(local33.anInt863).anInt4934 == 1) {
				super.anInt6420 = -1;
			}
		}
		this.anInt2280 = -1;
		if (arg1 < 0 || arg1 >= Static246.anInt4374 || arg0 < 0 || arg0 >= Static185.anInt3485) {
			this.method2248(arg0, arg1);
		} else if (super.anIntArray1324[0] >= 0 && super.anIntArray1324[0] < Static246.anInt4374 && super.anIntArray1323[0] >= 0 && Static185.anInt3485 > super.anIntArray1323[0]) {
			if (arg2 == 2) {
				Static46.method800(this, arg0, arg1);
			}
			this.method2246(arg1, arg0, arg2);
		} else {
			this.method2248(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZILclient!vc;IILclient!uq;I)V")
	@Override
	public void method5637(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class63 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)I")
	@Override
	protected int method5548() {
		return this.anInt2278;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	public String method2253() {
		@Pc(7) String local7 = "";
		if (Static110.aStringArray60 != null) {
			local7 = local7 + Static110.aStringArray60[this.aByte21];
		}
		@Pc(36) int[] local36;
		if (this.aByte19 == 1 && Static184.anIntArray666 != null) {
			local36 = Static184.anIntArray666;
		} else {
			local36 = Static145.anIntArray1070;
		}
		if (local36 != null && local36[this.aByte21] != -1) {
			@Pc(59) Class159 local59 = Static289.aClass235_1.method5390(local36[this.aByte21]);
			if (local59.aChar2 == 's') {
				local7 = local7 + local59.method3549(this.aByte20 & 0xFF);
			} else {
				Static142.method2676(new Throwable(), "gdn1");
				local36[this.aByte21] = -1;
			}
		}
		local7 = local7 + this.aString25;
		if (Static156.aStringArray78 != null) {
			local7 = local7 + Static156.aStringArray78[this.aByte21];
		}
		return local7;
	}

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "(B)I")
	@Override
	public int method5540() {
		return super.anInt6399;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!vc;I)Lclient!ep;")
	@Override
	public Class10_Sub3 method5640(@OriginalArg(0) Class63 arg0) {
		if (this.aClass224_1 == null || !this.method2245(1024, arg0)) {
			return null;
		}
		@Pc(25) Class44 local25 = arg0.method2024();
		@Pc(30) int local30 = super.aClass247_7.method5629();
		local25.method3536(local30);
		local25.method3527(super.anInt6390, super.anInt6387, super.anInt6386);
		@Pc(44) float local44 = arg0.method2002();
		@Pc(47) float local47 = arg0.method2056();
		if (Static178.aBoolean265) {
			@Pc(53) Class103 local53 = this.method5552();
			if (local53.aBoolean212 && (this.aClass224_1.anInt5666 == -1 || Static356.aClass48_2.method951(this.aClass224_1.anInt5666).aBoolean258)) {
				@Pc(84) Class202 local84 = super.anInt6405 != -1 && super.anInt6429 == 0 ? Static36.aClass236_1.method5396(super.anInt6405) : null;
				@Pc(105) Class202 local105 = super.anInt6423 == -1 || this.aBoolean179 || super.aBoolean460 && local84 != null ? null : Static36.aClass236_1.method5396(super.anInt6423);
				@Pc(141) Class66 local141 = Static249.method5588(local105 == null ? super.anInt6443 : super.anInt6414, 1, super.anInt6409, super.anInt6426, local30, 160, super.aClass66Array3[0], 240, 0, super.anInt6445, local105 == null ? local84 : local105, arg0, 0, super.aBoolean461);
				if (local141 != null) {
					arg0.method2030(local44, local47 - 128.0F);
					arg0.method2053(false);
					local141.method5126(local25, null, 0);
					arg0.method2053(true);
				}
			}
		}
		if (Static206.aClass1_Sub5_Sub1_Sub1_1 == this) {
			arg0.method2030(local44, local47 - 144.0F);
			local25.method3541(super.anInt6390, super.anInt6387, super.anInt6386);
			for (@Pc(182) int local182 = Static335.aClass141Array1.length - 1; local182 >= 0; local182--) {
				@Pc(188) Class141 local188 = Static335.aClass141Array1[local182];
				if (local188 != null && local188.anInt3555 != -1) {
					@Pc(242) int local242;
					@Pc(232) int local232;
					if (local188.anInt3559 == 1 && local188.anInt3561 >= 0 && local188.anInt3561 < Static299.aClass1_Sub5_Sub1_Sub2Array1.length) {
						@Pc(220) Class1_Sub5_Sub1_Sub2 local220 = Static299.aClass1_Sub5_Sub1_Sub2Array1[local188.anInt3561];
						if (local220 != null) {
							local232 = local220.anInt6390 / 32 - Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6390 / 32;
							local242 = local220.anInt6386 / 32 - Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6386 / 32;
							this.method2254(super.aClass66Array3[0], 360000, arg0, local25, local242, local232, local188.anInt3555);
						}
					}
					if (local188.anInt3559 == 2) {
						@Pc(275) int local275 = (local188.anInt3557 - Static28.anInt606) * 4 + 2 - Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6390 / 32;
						local232 = (local188.anInt3563 - Static319.anInt5425) * 4 + 2 - Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6386 / 32;
						local242 = local188.anInt3560 * 4;
						local242 *= local242;
						this.method2254(super.aClass66Array3[0], local242, arg0, local25, local232, local275, local188.anInt3555);
					}
					if (local188.anInt3559 == 10 && local188.anInt3561 >= 0 && local188.anInt3561 < Static125.aClass1_Sub5_Sub1_Sub1Array1.length) {
						@Pc(337) Class1_Sub5_Sub1_Sub1 local337 = Static125.aClass1_Sub5_Sub1_Sub1Array1[local188.anInt3561];
						if (local337 != null) {
							local232 = local337.anInt6390 / 32 - Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6390 / 32;
							local242 = local337.anInt6386 / 32 - Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6386 / 32;
							this.method2254(super.aClass66Array3[0], 360000, arg0, local25, local242, local232, local188.anInt3555);
						}
					}
				}
			}
			local25.method3536(local30);
			local25.method3527(super.anInt6390, super.anInt6387, super.anInt6386);
		}
		arg0.method2030(local44, local47);
		@Pc(401) Class10_Sub3 local401 = Static299.method4461(super.aClass66Array3.length);
		if (super.aClass10_Sub1_7 == null) {
			arg0.method2007(super.aClass66Array3, local25, local401.aClass10_Sub7Array1, Static206.aClass1_Sub5_Sub1_Sub1_1 == this ? 1 : 0);
		} else {
			@Pc(408) Class186 local408 = super.aClass10_Sub1_7.method229();
			arg0.method1969(super.aClass66Array3, local408, local25, local401.aClass10_Sub7Array1, Static206.aClass1_Sub5_Sub1_Sub1_1 == this ? 1 : 0);
		}
		this.method5545(arg0, super.aClass66Array3, false);
		if (super.aClass66Array3[2] != null) {
			if (local30 != 0) {
				super.aClass66Array3[2].method5157(local30);
			}
			super.aClass66Array3[2].method5132(-super.aClass2_Sub42_3.anInt6007 + super.anInt6390, super.anInt6387 + -super.aClass2_Sub42_3.anInt6023, -super.aClass2_Sub42_3.anInt6021 + super.anInt6386);
		}
		return local401;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!n;ILclient!vc;ILclient!de;III)V")
	private void method2254(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class63 arg2, @OriginalArg(4) Class44 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(12) int local12 = arg5 * arg5 + arg4 * arg4;
		if (local12 < 16 || arg1 < local12) {
			return;
		}
		@Pc(40) int local40 = (int) (Math.atan2((double) arg5, (double) arg4) * 2607.5945876176133D) & 0x3FFF;
		@Pc(59) Class66 local59 = Static280.method4263(super.anInt6409, super.anInt6445, super.anInt6386, arg0, super.anInt6390, local40, arg6, super.anInt6426, super.anInt6387, arg2);
		if (local59 != null) {
			arg2.method2053(false);
			local59.method5126(arg3, null, 0);
			arg2.method2053(true);
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(ZLclient!vc;)V")
	@Override
	public void method5644(@OriginalArg(1) Class63 arg0) {
		if (this.aClass224_1 != null && (super.aBoolean462 || this.method2245(0, arg0))) {
			this.method5545(arg0, super.aClass66Array3, super.aBoolean462);
		}
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5641() {
		return false;
	}
}
