import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class33 {

	@OriginalMember(owner = "client!la", name = "d", descriptor = "Z")
	public boolean aBoolean97;

	@OriginalMember(owner = "client!la", name = "m", descriptor = "[I")
	private int[] anIntArray187;

	@OriginalMember(owner = "client!la", name = "q", descriptor = "I")
	private int anInt1788;

	@OriginalMember(owner = "client!la", name = "H", descriptor = "[I")
	private int[] anIntArray190;

	@OriginalMember(owner = "client!la", name = "M", descriptor = "J")
	private long aLong59;

	@OriginalMember(owner = "client!la", name = "N", descriptor = "J")
	private long aLong60;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)I")
	public int method1240() {
		return this.anInt1788 == -1 ? this.anIntArray187[1] + (this.anIntArray187[11] << 5) + (this.anIntArray190[4] << 20) + ((this.anIntArray190[0] << 25) - -(this.anIntArray187[0] << 15)) + (this.anIntArray187[8] << 10) : Static84.method1529(this.anInt1788).anInt1366 + 305419896;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!ba;)V")
	public void method1241(@OriginalArg(1) Class2_Sub3 arg0) {
		arg0.method788(this.aBoolean97 ? 1 : 0);
		@Pc(25) int local25;
		for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
			local25 = this.anIntArray187[Static95.anIntArray297[local16]];
			if (local25 == 0) {
				arg0.method788(-1);
			} else {
				arg0.method788(local25 - 256);
			}
		}
		for (local25 = 0; local25 < 5; local25++) {
			arg0.method788(this.anIntArray190[local25]);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!he;Lclient!he;IIB)Lclient!pa;")
	public Class2_Sub1_Sub1_Sub5 method1243(@OriginalArg(0) Class2_Sub1_Sub9 arg0, @OriginalArg(1) Class2_Sub1_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt1788 != -1) {
			return Static84.method1529(this.anInt1788).method930(arg0, arg1, arg2, arg3);
		}
		@Pc(24) long local24 = this.aLong59;
		@Pc(27) int[] local27 = this.anIntArray187;
		if (arg0 != null && (arg0.anInt1433 >= 0 || arg0.anInt1438 >= 0)) {
			local27 = new int[12];
			for (@Pc(43) int local43 = 0; local43 < 12; local43++) {
				local27[local43] = this.anIntArray187[local43];
			}
			if (arg0.anInt1433 >= 0) {
				local24 += arg0.anInt1433 - this.anIntArray187[5] << 8;
				local27[5] = arg0.anInt1433;
			}
			if (arg0.anInt1438 >= 0) {
				local24 += arg0.anInt1438 - this.anIntArray187[3] << 16;
				local27[3] = arg0.anInt1438;
			}
		}
		@Pc(111) Class2_Sub1_Sub1_Sub5 local111 = (Class2_Sub1_Sub1_Sub5) Static10.aClass11_25.method431(local24);
		if (local111 == null) {
			@Pc(115) boolean local115 = false;
			for (@Pc(117) int local117 = 0; local117 < 12; local117++) {
				@Pc(123) int local123 = local27[local117];
				if (local123 >= 256 && local123 < 512 && !Static7.method824(local123 - 256).method1459()) {
					local115 = true;
				}
				if (local123 >= 512 && !Static73.method1374(local123 - 512).method1625(this.aBoolean97)) {
					local115 = true;
				}
			}
			if (local115) {
				if (this.aLong60 != -1L) {
					local111 = (Class2_Sub1_Sub1_Sub5) Static10.aClass11_25.method431(this.aLong60);
				}
				if (local111 == null) {
					return null;
				}
			}
			if (local111 == null) {
				@Pc(183) Class2_Sub1_Sub1_Sub5[] local183 = new Class2_Sub1_Sub1_Sub5[12];
				@Pc(185) int local185 = 0;
				@Pc(193) int local193;
				for (@Pc(187) int local187 = 0; local187 < 12; local187++) {
					local193 = local27[local187];
					@Pc(209) Class2_Sub1_Sub1_Sub5 local209;
					if (local193 >= 256 && local193 < 512) {
						local209 = Static7.method824(local193 - 256).method1466();
						if (local209 != null) {
							local183[local185++] = local209;
						}
					}
					if (local193 >= 512) {
						local209 = Static73.method1374(local193 - 512).method1626(this.aBoolean97);
						if (local209 != null) {
							local183[local185++] = local209;
						}
					}
				}
				local111 = new Class2_Sub1_Sub1_Sub5(local183, local185);
				for (local193 = 0; local193 < 5; local193++) {
					if (this.anIntArray190[local193] != 0) {
						local111.method1404(Static97.anIntArrayArray22[local193][0], Static97.anIntArrayArray22[local193][this.anIntArray190[local193]]);
						if (local193 == 1) {
							local111.method1404(Static63.anIntArray203[0], Static63.anIntArray203[this.anIntArray190[local193]]);
						}
					}
				}
				local111.method1411();
				local111.method1403(64, 850, -30, -50, -30, true);
				Static10.aClass11_25.method430(local24, local111);
				this.aLong60 = local24;
			}
		}
		if (arg0 == null && arg1 == null) {
			return local111;
		}
		@Pc(326) Class2_Sub1_Sub1_Sub5 local326;
		if (arg0 != null && arg1 != null) {
			local326 = arg0.method977(local111, arg1, arg3, arg2);
		} else if (arg0 == null) {
			local326 = arg1.method986(arg2, local111);
		} else {
			local326 = arg0.method986(arg3, local111);
		}
		return local326;
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V")
	private void method1244() {
		@Pc(10) int local10 = this.anIntArray187[9];
		@Pc(15) int local15 = this.anIntArray187[5];
		@Pc(18) long local18 = this.aLong59;
		this.anIntArray187[5] = local10;
		this.anIntArray187[9] = local15;
		this.aLong59 = 0L;
		for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
			this.aLong59 <<= 0x4;
			if (this.anIntArray187[local33] >= 256) {
				this.aLong59 += this.anIntArray187[local33] - 256;
			}
		}
		if (this.anIntArray187[0] >= 256) {
			this.aLong59 += this.anIntArray187[0] - 256 >> 4;
		}
		if (this.anIntArray187[1] >= 256) {
			this.aLong59 += this.anIntArray187[1] - 256 >> 8;
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			this.aLong59 <<= 0x3;
			this.aLong59 += this.anIntArray190[local109];
		}
		this.aLong59 <<= 0x1;
		this.aLong59 += this.aBoolean97 ? 1 : 0;
		this.anIntArray187[5] = local15;
		this.anIntArray187[9] = local10;
		if (local18 != 0L && this.aLong59 != local18) {
			Static10.aClass11_25.method432(local18);
		}
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(I)Lclient!pa;")
	public Class2_Sub1_Sub1_Sub5 method1245() {
		if (this.anInt1788 != -1) {
			return Static84.method1529(this.anInt1788).method937();
		}
		@Pc(18) boolean local18 = false;
		for (@Pc(20) int local20 = 0; local20 < 12; local20++) {
			@Pc(27) int local27 = this.anIntArray187[local20];
			if (local27 >= 256 && local27 < 512 && !Static7.method824(local27 - 256).method1460()) {
				local18 = true;
			}
			if (local27 >= 512 && !Static73.method1374(local27 - 512).method1624(this.aBoolean97)) {
				local18 = true;
			}
		}
		if (local18) {
			return null;
		}
		@Pc(78) Class2_Sub1_Sub1_Sub5[] local78 = new Class2_Sub1_Sub1_Sub5[12];
		@Pc(80) int local80 = 0;
		for (@Pc(82) int local82 = 0; local82 < 12; local82++) {
			@Pc(89) int local89 = this.anIntArray187[local82];
			@Pc(103) Class2_Sub1_Sub1_Sub5 local103;
			if (local89 >= 256 && local89 < 512) {
				local103 = Static7.method824(local89 - 256).method1465();
				if (local103 != null) {
					local78[local80++] = local103;
				}
			}
			if (local89 >= 512) {
				local103 = Static73.method1374(local89 - 512).method1633(this.aBoolean97);
				if (local103 != null) {
					local78[local80++] = local103;
				}
			}
		}
		@Pc(144) Class2_Sub1_Sub1_Sub5 local144 = new Class2_Sub1_Sub1_Sub5(local78, local80);
		for (@Pc(146) int local146 = 0; local146 < 5; local146++) {
			if (this.anIntArray190[local146] != 0) {
				local144.method1404(Static97.anIntArrayArray22[local146][0], Static97.anIntArrayArray22[local146][this.anIntArray190[local146]]);
				if (local146 == 1) {
					local144.method1404(Static63.anIntArray203[0], Static63.anIntArray203[this.anIntArray190[local146]]);
				}
			}
		}
		return local144;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([IZI[II)V")
	public void method1246(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 == null) {
			arg0 = new int[12];
			for (@Pc(8) int local8 = 0; local8 < 7; local8++) {
				for (@Pc(12) int local12 = 0; local12 < Static31.anInt1222; local12++) {
					@Pc(18) Class2_Sub1_Sub12 local18 = Static7.method824(local12);
					if (local18 != null && !local18.aBoolean116 && local8 + (arg1 ? 7 : 0) == local18.anInt2099) {
						arg0[Static95.anIntArray297[local8]] = local12 + 256;
						break;
					}
				}
			}
		}
		this.anInt1788 = arg3;
		this.aBoolean97 = arg1;
		this.anIntArray187 = arg0;
		this.anIntArray190 = arg2;
		this.method1244();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZI)V")
	public void method1248(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == 1 && this.aBoolean97) {
			return;
		}
		@Pc(19) int local19 = this.anIntArray187[Static95.anIntArray297[arg0]];
		if (local19 == 0) {
			return;
		}
		local19 -= 256;
		@Pc(55) Class2_Sub1_Sub12 local55;
		do {
			if (arg1) {
				local19++;
				if (Static31.anInt1222 <= local19) {
					local19 = 0;
				}
			} else {
				local19--;
				if (local19 < 0) {
					local19 = Static31.anInt1222 - 1;
				}
			}
			local55 = Static7.method824(local19);
		} while (local55 == null || local55.aBoolean116 || local55.anInt2099 != arg0 + (this.aBoolean97 ? 7 : 0));
		this.anIntArray187[Static95.anIntArray297[arg0]] = local19 + 256;
		this.method1244();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZB)V")
	public void method1249(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean97 != arg0) {
			this.method1246(null, arg0, this.anIntArray190, -1);
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(IZI)V")
	public void method1250(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anIntArray190[arg1];
		if (arg0) {
			local16++;
			if (local16 >= Static97.anIntArrayArray22[arg1].length) {
				local16 = 0;
			}
		} else {
			local16--;
			if (local16 < 0) {
				local16 = Static97.anIntArrayArray22[arg1].length - 1;
			}
		}
		this.anIntArray190[arg1] = local16;
		this.method1244();
	}
}
