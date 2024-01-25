import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class25_Sub1_Sub1_Sub2 extends Class25_Sub1_Sub1 {

	@OriginalMember(owner = "client!h", name = "mc", descriptor = "Lclient!dr;")
	public Class59 aClass59_1;

	@OriginalMember(owner = "client!h", name = "xc", descriptor = "I")
	public int anInt2391 = -1;

	@OriginalMember(owner = "client!h", name = "Dc", descriptor = "I")
	public int anInt2396 = -1;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!tq;)V")
	@Override
	public void method5232(@OriginalArg(1) Class164 arg0) {
		if (this.aClass59_1 != null && (super.aBoolean192 || this.method1895(arg0, 0))) {
			this.method1884(super.aBoolean192, arg0, super.aClass22Array3);
		}
	}

	@OriginalMember(owner = "client!h", name = "k", descriptor = "(I)Z")
	public boolean method1892() {
		return this.aClass59_1 != null;
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(I)I")
	@Override
	public int method5239() {
		return super.anInt2315;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!tq;III)Z")
	@Override
	public boolean method5234(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass59_1 == null || !this.method1895(arg0, 65536)) {
			return false;
		}
		@Pc(19) Class127 local19 = arg0.method5378();
		@Pc(24) int local24 = super.aClass99_7.method2036();
		local19.method5274(local24);
		local19.method5260(super.anInt6080, super.anInt6085, super.anInt6077);
		for (@Pc(45) int local45 = 0; local45 < super.aClass22Array3.length; local45++) {
			if (super.aClass22Array3[local45] != null && super.aClass22Array3[local45].method1584(arg1, arg2, local19, this.aClass59_1.anInt1420 == 1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
	@Override
	public void method5233() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!h", name = "j", descriptor = "(I)I")
	@Override
	public int method1883() {
		if (this.aClass59_1.anIntArray186 != null) {
			@Pc(20) Class59 local20 = this.aClass59_1.method1150(Static230.aClass72_3);
			if (local20 != null && local20.anInt1430 != -1) {
				return local20.anInt1430;
			}
		}
		return this.aClass59_1.anInt1430;
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(B)Z")
	private boolean method1893() {
		return this.aClass59_1.aBoolean125;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!tq;I)Z")
	private boolean method1895(@OriginalArg(1) Class164 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class8 local11 = this.method1880();
		@Pc(29) Class185 local29 = super.anInt2333 != -1 && super.anInt2323 == 0 ? Static25.aClass67_1.method1227(super.anInt2333) : null;
		@Pc(46) Class185 local46 = super.anInt2340 == -1 || super.aBoolean191 && local29 != null ? null : Static25.aClass67_1.method1227(super.anInt2340);
		@Pc(49) int local49 = local11.anInt152;
		@Pc(52) int local52 = local11.anInt125;
		if (local49 != 0 || local52 != 0 || local11.anInt126 != 0 || local11.anInt129 != 0) {
			arg1 |= 0x7;
		}
		@Pc(103) Class22 local103 = super.aClass22Array3[0] = this.aClass59_1.method1147(arg0, Static25.aClass67_1, super.anInt2326, super.anInt2354, super.anInt2322, Static230.aClass72_3, super.anInt2375, super.aClass103Array3, local29, super.anInt2332, local46, super.anInt2325, arg1, Static160.aClass163_1);
		if (local103 == null) {
			return false;
		}
		super.anInt2315 = local103.method1561();
		this.method1887(local103);
		@Pc(120) int local120 = super.aClass99_7.method2036();
		super.anInt2374 = 0;
		super.anInt2365 = 0;
		super.anInt2350 = 0;
		if (local49 == 0 && local52 == 0) {
			this.method1885(local120, this.method1877() << 7, this.method1877() << 7);
		} else {
			this.method1885(local120, local49, local52);
			if (super.anInt2365 != 0) {
				super.aClass22Array3[0].method1582(super.anInt2365);
			}
			if (super.anInt2374 != 0) {
				super.aClass22Array3[0].method1580(super.anInt2374);
			}
			if (super.anInt2350 != 0) {
				super.aClass22Array3[0].method1568(0, super.anInt2350, 0);
			}
		}
		super.aClass22Array3[1] = null;
		if (super.anInt2338 != -1 && super.anInt2373 != -1) {
			@Pc(214) Class134 local214 = Static10.aClass246_1.method5429(super.anInt2338);
			@Pc(234) Class22 local234 = local214.method2734((local214.aBoolean298 ? 7 : 2) | local7, arg0, super.anInt2373, super.anInt2330, super.anInt2372, Static25.aClass67_1);
			if (local234 != null) {
				local234.method1568(0, -super.anInt2351, 0);
				if (local214.aBoolean298 && (local49 != 0 || local52 != 0)) {
					if (super.anInt2365 != 0) {
						local234.method1582(super.anInt2365);
					}
					if (super.anInt2374 != 0) {
						local234.method1580(super.anInt2374);
					}
					if (super.anInt2350 != 0) {
						local234.method1568(0, super.anInt2350, 0);
					}
				}
				super.aClass22Array3[1] = local234;
			}
		}
		super.aClass22Array3[2] = null;
		if (super.aClass1_Sub44_3 != null) {
			if (Static366.anInt5883 >= super.aClass1_Sub44_3.anInt6141) {
				super.aClass1_Sub44_3 = null;
			} else if (Static366.anInt5883 >= super.aClass1_Sub44_3.anInt6143) {
				@Pc(319) Class22 local319 = super.aClass1_Sub44_3.method5300(arg0, local7 | 0x7);
				if (local319 != null) {
					local319.method1568(-super.anInt6080 + super.aClass1_Sub44_3.anInt6140, -super.anInt6085 + super.aClass1_Sub44_3.anInt6135, -super.anInt6077 + super.aClass1_Sub44_3.anInt6133);
					if (local120 != 0) {
						local319.method1605(local120);
					}
					super.aClass22Array3[2] = local319;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BZLclient!tq;Lclient!hm;III)V")
	@Override
	public void method5235(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class164 arg1, @OriginalArg(3) Class25 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Lclient!tq;I)Lclient!cj;")
	@Override
	public Class41_Sub1 method5229(@OriginalArg(0) Class164 arg0) {
		if (this.aClass59_1 == null || !this.method1895(arg0, 1024)) {
			return null;
		}
		@Pc(17) Class127 local17 = arg0.method5378();
		@Pc(22) int local22 = super.aClass99_7.method2036();
		local17.method5274(local22);
		local17.method5260(super.anInt6080, super.anInt6085, super.anInt6077);
		@Pc(37) Class8 local37 = this.method1880();
		@Pc(50) Class59 local50 = this.aClass59_1.anIntArray186 == null ? this.aClass59_1 : this.aClass59_1.method1150(Static230.aClass72_3);
		if (Static188.aClass135_Sub1_1.aBoolean327 && local50.aBoolean128 && local37.aBoolean11) {
			@Pc(75) Class185 local75 = super.anInt2333 != -1 && super.anInt2323 == 0 ? Static25.aClass67_1.method1227(super.anInt2333) : null;
			@Pc(93) Class185 local93 = super.anInt2340 == -1 || super.aBoolean191 && local75 != null ? null : Static25.aClass67_1.method1227(super.anInt2340);
			@Pc(145) Class22 local145 = Static343.method4861(local22, super.aClass22Array3[0], arg0, super.anInt2365, this.aClass59_1.aShort27 & 0xFFFF, this.aClass59_1.aByte17 & 0xFF, local93 == null ? super.anInt2322 : super.anInt2332, super.aBoolean189, super.anInt2350, local93 == null ? local75 : local93, super.anInt2374, this.aClass59_1.aShort26 & 0xFFFF, this.aClass59_1.anInt1420, this.aClass59_1.aByte15 & 0xFF);
			if (local145 != null) {
				@Pc(150) float local150 = arg0.method5338();
				@Pc(153) float local153 = arg0.method5333();
				arg0.method5307(false);
				arg0.method5314(local150, local153 - 150.0F);
				local145.method1565(local17, null, 0);
				arg0.method5314(local150, local153);
				arg0.method5307(true);
			}
		}
		@Pc(176) Class41_Sub1 local176 = null;
		if (this.method1893()) {
			local176 = Static277.method4255(super.aClass22Array3.length);
		}
		if (super.aClass41_Sub3_5 == null) {
			arg0.method5370(super.aClass22Array3, local17, local176 == null ? null : local176.aClass41_Sub5Array1, 0);
		} else {
			@Pc(207) Class108 local207 = super.aClass41_Sub3_5.method2143();
			arg0.method5316(super.aClass22Array3, local207, local17, local176 == null ? null : local176.aClass41_Sub5Array1, 0);
		}
		this.method1884(false, arg0, super.aClass22Array3);
		if (super.aClass22Array3[2] != null) {
			if (local22 != 0) {
				super.aClass22Array3[2].method1605(local22);
			}
			super.aClass22Array3[2].method1568(super.anInt6080 - super.aClass1_Sub44_3.anInt6140, -super.aClass1_Sub44_3.anInt6135 + super.anInt6085, -super.aClass1_Sub44_3.anInt6133 + super.anInt6077);
		}
		super.anInt2367 = Static32.anInt649;
		return local176;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(III)V")
	public void method1898(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray296[0];
		@Pc(15) int local15 = super.anIntArray295[0];
		if (arg1 == 0) {
			local15++;
		}
		if (arg1 == 1) {
			local10++;
			local15++;
		}
		if (arg1 == 2) {
			local10++;
		}
		if (arg1 == 3) {
			local10++;
			local15--;
		}
		if (arg1 == 4) {
			local15--;
		}
		if (arg1 == 5) {
			local15--;
			local10--;
		}
		if (arg1 == 6) {
			local10--;
		}
		if (arg1 == 7) {
			local15++;
			local10--;
		}
		if (super.anInt2333 != -1 && Static25.aClass67_1.method1227(super.anInt2333).anInt4804 == 1) {
			super.anInt2333 = -1;
		}
		if (super.anInt2338 != -1) {
			@Pc(94) Class134 local94 = Static10.aClass246_1.method5429(super.anInt2338);
			if (local94.aBoolean297 && local94.anInt3346 != -1 && Static25.aClass67_1.method1227(local94.anInt3346).anInt4804 == 1) {
				super.anInt2338 = -1;
			}
		}
		if (super.anInt2381 < 9) {
			super.anInt2381++;
		}
		for (@Pc(129) int local129 = super.anInt2381; local129 > 0; local129--) {
			super.anIntArray296[local129] = super.anIntArray296[local129 - 1];
			super.anIntArray295[local129] = super.anIntArray295[local129 - 1];
			super.aByteArray40[local129] = super.aByteArray40[local129 - 1];
		}
		super.anIntArray296[0] = local10;
		super.anIntArray295[0] = local15;
		super.aByteArray40[0] = (byte) arg0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!dr;B)V")
	public void method1899(@OriginalArg(0) Class59 arg0) {
		this.aClass59_1 = arg0;
		if (super.aClass41_Sub3_5 != null) {
			super.aClass41_Sub3_5.method2142();
		}
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5236() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIZI)V")
	public void method1900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		super.aByte70 = (byte) arg0;
		if (super.anInt2333 != -1 && Static25.aClass67_1.method1227(super.anInt2333).anInt4804 == 1) {
			super.anInt2333 = -1;
		}
		if (super.anInt2338 != -1) {
			@Pc(35) Class134 local35 = Static10.aClass246_1.method5429(super.anInt2338);
			if (local35.aBoolean297 && local35.anInt3346 != -1 && Static25.aClass67_1.method1227(local35.anInt3346).anInt4804 == 1) {
				super.anInt2338 = -1;
			}
		}
		if (!arg3) {
			@Pc(70) int local70 = arg4 - super.anIntArray296[0];
			@Pc(78) int local78 = arg1 - super.anIntArray295[0];
			if (local70 >= -8 && local70 <= 8 && local78 >= -8 && local78 <= 8) {
				if (super.anInt2381 < 9) {
					super.anInt2381++;
				}
				for (@Pc(109) int local109 = super.anInt2381; local109 > 0; local109--) {
					super.anIntArray296[local109] = super.anIntArray296[local109 - 1];
					super.anIntArray295[local109] = super.anIntArray295[local109 - 1];
					super.aByteArray40[local109] = super.aByteArray40[local109 - 1];
				}
				super.anIntArray296[0] = arg4;
				super.anIntArray295[0] = arg1;
				super.aByteArray40[0] = 1;
				return;
			}
		}
		super.anInt2379 = 0;
		super.anIntArray296[0] = arg4;
		super.anInt2380 = 0;
		super.anInt2381 = 0;
		super.anIntArray295[0] = arg1;
		super.anInt6080 = arg2 * 64 + super.anIntArray296[0] * 128;
		super.anInt6077 = arg2 * 64 + super.anIntArray295[0] * 128;
		if (super.aClass41_Sub3_5 != null) {
			super.aClass41_Sub3_5.method2142();
		}
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(B)I")
	@Override
	public int method1879() {
		if (this.aClass59_1.anIntArray186 != null) {
			@Pc(25) Class59 local25 = this.aClass59_1.method1150(Static230.aClass72_3);
			if (local25 != null && local25.anInt1393 != -1) {
				return local25.anInt1393;
			}
		}
		return this.aClass59_1.anInt1393 == -1 ? super.method1879() : this.aClass59_1.anInt1393;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)I")
	@Override
	protected int method1886() {
		if (this.aClass59_1.anIntArray186 != null) {
			@Pc(24) Class59 local24 = this.aClass59_1.method1150(Static230.aClass72_3);
			if (local24 != null && local24.anInt1416 != -1) {
				return local24.anInt1416;
			}
		}
		return this.aClass59_1.anInt1416;
	}
}
