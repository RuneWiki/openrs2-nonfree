import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vja")
public final class Class8_Sub1_Sub5_Sub1 extends Class8_Sub1_Sub5 {

	@OriginalMember(owner = "client!vja", name = "gb", descriptor = "I")
	public int anInt10374;

	@OriginalMember(owner = "client!vja", name = "X", descriptor = "I")
	public int anInt10382;

	@OriginalMember(owner = "client!vja", name = "db", descriptor = "I")
	public int anInt10385;

	@OriginalMember(owner = "client!vja", name = "ib", descriptor = "I")
	public int anInt10388;

	@OriginalMember(owner = "client!vja", name = "bb", descriptor = "I")
	public int anInt10377 = -1;

	@OriginalMember(owner = "client!vja", name = "U", descriptor = "I")
	public int anInt10379 = 0;

	@OriginalMember(owner = "client!vja", name = "R", descriptor = "Z")
	private boolean aBoolean771 = false;

	@OriginalMember(owner = "client!vja", name = "fb", descriptor = "I")
	public int anInt10386 = -1;

	@OriginalMember(owner = "client!vja", name = "S", descriptor = "I")
	private int anInt10387 = 0;

	@OriginalMember(owner = "client!vja", name = "<init>", descriptor = "(IIIII)V")
	public Class8_Sub1_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!vja", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method8897(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static637.aClass5_Sub20_31 = null;
		}
		return this.aBoolean771;
	}

	@OriginalMember(owner = "client!vja", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8906(@OriginalArg(0) byte arg0) {
		if (arg0 != 27) {
			this.anInt10382 = -63;
		}
		return false;
	}

	@OriginalMember(owner = "client!vja", name = "g", descriptor = "(I)I")
	@Override
	public int method8908(@OriginalArg(0) int arg0) {
		@Pc(9) Class204 local9 = Static201.aClass127_1.method2501(this.anInt10388);
		@Pc(12) int local12 = local9.anInt5698;
		@Pc(23) Class204 local23;
		if (this.anInt10386 != -1) {
			local23 = Static201.aClass127_1.method2501(this.anInt10386);
			if (local23.anInt5698 > local12) {
				local12 = local23.anInt5698;
			}
		}
		if (arg0 != 1) {
			Static637.aClass301_1 = null;
		}
		if (this.anInt10377 != -1) {
			local23 = Static201.aClass127_1.method2501(this.anInt10377);
			if (local23.anInt5698 > local12) {
				local12 = local23.anInt5698;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!vja", name = "h", descriptor = "(I)I")
	@Override
	protected int method8911() {
		this.method8908(-63);
		return this.anInt10387;
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(Lclient!ha;I)Lclient!cca;")
	@Override
	public Class59 method8904(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1) {
		return arg1 < 65 ? null : null;
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(IILclient!ha;B)Z")
	@Override
	public boolean method8895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class57 arg2, @OriginalArg(3) byte arg3) {
		@Pc(6) Class203 local6 = arg2.method7672();
		local6.method8332(super.anInt10355, super.anInt10357 - 10, super.anInt10363);
		@Pc(22) Class204 local22 = Static201.aClass127_1.method2501(this.anInt10388);
		if (arg3 >= -43) {
			return true;
		}
		@Pc(41) Class164 local41 = local22.method4868((Class100) null, 114, 0, 0, -1, this.anInt10374, (Class165) null, arg2, 131072);
		if (local41 != null && (Static565.aBoolean768 ? local41.method9069(arg1, arg0, local6, true, local22.anInt5698, Static243.anInt4189) : local41.method9093(arg1, arg0, local6, true, local22.anInt5698))) {
			return true;
		}
		@Pc(80) Class204 local80;
		if (this.anInt10386 != -1) {
			local80 = Static201.aClass127_1.method2501(this.anInt10386);
			local41 = local80.method4868((Class100) null, 89, 0, 0, -1, this.anInt10385, (Class165) null, arg2, 131072);
			if (local41 != null && (Static565.aBoolean768 ? local41.method9069(arg1, arg0, local6, true, local80.anInt5698, Static243.anInt4189) : local41.method9093(arg1, arg0, local6, true, local80.anInt5698))) {
				return true;
			}
		}
		if (this.anInt10377 != -1) {
			local80 = Static201.aClass127_1.method2501(this.anInt10377);
			local41 = local80.method4868((Class100) null, 105, 0, 0, -1, this.anInt10382, (Class165) null, arg2, 131072);
			if (local41 != null && (Static565.aBoolean768 ? local41.method9069(arg1, arg0, local6, true, local80.anInt5698, Static243.anInt4189) : local41.method9093(arg1, arg0, local6, true, local80.anInt5698))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vja", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8907(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		if (arg0 != 0) {
			this.method8906((byte) 18);
		}
	}

	@OriginalMember(owner = "client!vja", name = "j", descriptor = "(I)I")
	@Override
	public int method8900(@OriginalArg(0) int arg0) {
		return arg0 == -2226 ? -10 : -36;
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(BLclient!ha;)Lclient!tf;")
	@Override
	public Class8_Sub10 method8909(@OriginalArg(0) byte arg0, @OriginalArg(1) Class57 arg1) {
		@Pc(17) Class273 local17 = Static191.method2762(super.aByte145, super.anInt10355 >> Static611.anInt10115, super.anInt10363 >> Static611.anInt10115);
		@Pc(29) Class8_Sub1_Sub1 local29 = Static209.method3036(super.aByte145, super.anInt10355 >> Static611.anInt10115, super.anInt10363 >> Static611.anInt10115);
		@Pc(31) int local31 = 0;
		if (local17 != null && local17.aClass8_Sub1_Sub3_1.aBoolean738) {
			local31 = local17.aClass8_Sub1_Sub3_1.method8900(arg0 ^ 0x8D6);
		}
		if (local29 != null && -local31 < local29.aShort4) {
			local31 = -local29.aShort4;
		}
		if (arg0 != -104) {
			this.anInt10382 = -50;
		}
		if (local31 != this.anInt10379) {
			super.anInt10357 -= this.anInt10379;
			this.anInt10379 = local31;
			super.anInt10357 += local31;
		}
		@Pc(96) Class203 local96 = arg1.method7672();
		local96.method8337();
		if (this.anInt10379 == 0) {
			@Pc(112) Class22 local112 = Static242.aClass22Array3[super.aByte146];
			@Pc(117) int local117 = this.anInt10387 << 1;
			@Pc(124) int local124 = -local117 / 2;
			@Pc(129) int local129 = -local117 / 2;
			@Pc(142) int local142 = local112.method8032(super.anInt10355 + local124, super.anInt10363 - -local129);
			@Pc(146) int local146 = local117 / 2;
			@Pc(151) int local151 = -local117 / 2;
			@Pc(164) int local164 = local112.method8032(super.anInt10355 + local146, super.anInt10363 - -local151);
			@Pc(169) int local169 = -local117 / 2;
			@Pc(173) int local173 = local117 / 2;
			@Pc(185) int local185 = local112.method8032(local169 + super.anInt10355, local173 + super.anInt10363);
			@Pc(189) int local189 = local117 / 2;
			@Pc(193) int local193 = local117 / 2;
			@Pc(205) int local205 = local112.method8032(local189 + super.anInt10355, local193 + super.anInt10363);
			@Pc(217) int local217 = local164 > local142 ? local142 : local164;
			@Pc(225) int local225 = local185 < local205 ? local185 : local205;
			@Pc(233) int local233 = local205 <= local164 ? local205 : local164;
			@Pc(241) int local241 = local185 > local142 ? local142 : local185;
			if (local117 != 0) {
				@Pc(256) int local256 = (int) (Math.atan2((double) (local217 - local225), (double) local117) * 2607.5945876176133D) & 0x3FFF;
				if (local256 != 0) {
					local96.method8326(local256);
				}
			}
			@Pc(267) int local267 = local205 + local142;
			if (local117 != 0) {
				@Pc(282) int local282 = (int) (Math.atan2((double) (local241 - local233), (double) local117) * 2607.5945876176133D) & 0x3FFF;
				if (local282 != 0) {
					local96.method8329(-local282);
				}
			}
			if (local267 > local164 + local185) {
				local267 = local185 + local164;
			}
			local267 = (local267 >> 1) - super.anInt10357;
			if (local267 != 0) {
				local96.method8335(0, local267, 0);
			}
		}
		local96.method8335(super.anInt10355, super.anInt10357 - 10, super.anInt10363);
		@Pc(339) Class8_Sub10 local339 = Static213.method3056(true, 0, 3);
		this.aBoolean771 = false;
		this.anInt10387 = 0;
		@Pc(366) Class164 local366;
		if (this.anInt10377 != -1) {
			local366 = Static201.aClass127_1.method2501(this.anInt10377).method4868((Class100) null, 94, 0, 0, -1, this.anInt10382, (Class165) null, arg1, 2048);
			if (local366 != null) {
				if (Static565.aBoolean768) {
					local366.method9092(local96, local339.aClass8_Sub7Array1[2], Static243.anInt4189, 0);
				} else {
					local366.method9073(local96, local339.aClass8_Sub7Array1[2], 0);
				}
				this.aBoolean771 |= local366.F();
				this.anInt10387 = local366.ma();
			}
		}
		if (this.anInt10386 != -1) {
			local366 = Static201.aClass127_1.method2501(this.anInt10386).method4868((Class100) null, arg0 ^ 0xFFFFFFD5, 0, 0, -1, this.anInt10385, (Class165) null, arg1, 2048);
			if (local366 != null) {
				if (Static565.aBoolean768) {
					local366.method9092(local96, local339.aClass8_Sub7Array1[1], Static243.anInt4189, 0);
				} else {
					local366.method9073(local96, local339.aClass8_Sub7Array1[1], 0);
				}
				this.aBoolean771 |= local366.F();
				if (local366.ma() > this.anInt10387) {
					this.anInt10387 = local366.ma();
				}
			}
		}
		local366 = Static201.aClass127_1.method2501(this.anInt10388).method4868((Class100) null, arg0 ^ 0xFFFFFFA3, 0, 0, -1, this.anInt10374, (Class165) null, arg1, 2048);
		if (local366 != null) {
			if (Static565.aBoolean768) {
				local366.method9092(local96, local339.aClass8_Sub7Array1[0], Static243.anInt4189, 0);
			} else {
				local366.method9073(local96, local339.aClass8_Sub7Array1[0], 0);
			}
			this.aBoolean771 |= local366.F();
			if (local366.ma() > this.anInt10387) {
				this.anInt10387 = local366.ma();
			}
		}
		return local339;
	}
}
