import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class2_Sub1_Sub10 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ia", name = "Eb", descriptor = "[I")
	private int[] anIntArray149;

	@OriginalMember(owner = "client!ia", name = "Kb", descriptor = "[I")
	private int[] anIntArray150;

	@OriginalMember(owner = "client!ia", name = "Qb", descriptor = "[I")
	private int[] anIntArray151;

	@OriginalMember(owner = "client!ia", name = "Rb", descriptor = "[I")
	public int[] anIntArray152;

	@OriginalMember(owner = "client!ia", name = "Tb", descriptor = "[I")
	private int[] anIntArray153;

	@OriginalMember(owner = "client!ia", name = "cc", descriptor = "[I")
	public int[] anIntArray154;

	@OriginalMember(owner = "client!ia", name = "gc", descriptor = "I")
	public int anInt1502;

	@OriginalMember(owner = "client!ia", name = "Fb", descriptor = "I")
	public int anInt1487 = -1;

	@OriginalMember(owner = "client!ia", name = "wb", descriptor = "I")
	public int anInt1480 = 0;

	@OriginalMember(owner = "client!ia", name = "Gb", descriptor = "I")
	public int anInt1488 = 0;

	@OriginalMember(owner = "client!ia", name = "Hb", descriptor = "I")
	public int anInt1489 = -1;

	@OriginalMember(owner = "client!ia", name = "tb", descriptor = "I")
	public int anInt1478 = 0;

	@OriginalMember(owner = "client!ia", name = "ub", descriptor = "I")
	private int anInt1479 = 0;

	@OriginalMember(owner = "client!ia", name = "Bb", descriptor = "I")
	private int anInt1485 = 128;

	@OriginalMember(owner = "client!ia", name = "Mb", descriptor = "Z")
	public boolean aBoolean76 = false;

	@OriginalMember(owner = "client!ia", name = "Pb", descriptor = "Z")
	public boolean aBoolean78 = false;

	@OriginalMember(owner = "client!ia", name = "Yb", descriptor = "Z")
	public boolean aBoolean80 = false;

	@OriginalMember(owner = "client!ia", name = "bc", descriptor = "I")
	public int anInt1498 = -1;

	@OriginalMember(owner = "client!ia", name = "Ab", descriptor = "I")
	public int anInt1484 = -1;

	@OriginalMember(owner = "client!ia", name = "zb", descriptor = "I")
	public int anInt1483 = 16;

	@OriginalMember(owner = "client!ia", name = "Cb", descriptor = "[Lclient!a;")
	public final Class1[] aClass1Array13 = new Class1[5];

	@OriginalMember(owner = "client!ia", name = "Nb", descriptor = "I")
	private int anInt1493 = 0;

	@OriginalMember(owner = "client!ia", name = "vb", descriptor = "Z")
	public boolean aBoolean75 = true;

	@OriginalMember(owner = "client!ia", name = "Jb", descriptor = "I")
	public int anInt1491 = 1;

	@OriginalMember(owner = "client!ia", name = "kc", descriptor = "I")
	public int anInt1505 = 0;

	@OriginalMember(owner = "client!ia", name = "yb", descriptor = "I")
	private int anInt1482 = 0;

	@OriginalMember(owner = "client!ia", name = "Ob", descriptor = "Z")
	private boolean aBoolean77 = false;

	@OriginalMember(owner = "client!ia", name = "fc", descriptor = "I")
	public int anInt1501 = -1;

	@OriginalMember(owner = "client!ia", name = "Wb", descriptor = "Z")
	public boolean aBoolean79 = true;

	@OriginalMember(owner = "client!ia", name = "xb", descriptor = "I")
	public int anInt1481 = 1;

	@OriginalMember(owner = "client!ia", name = "pc", descriptor = "Z")
	public boolean aBoolean82 = false;

	@OriginalMember(owner = "client!ia", name = "ic", descriptor = "I")
	private int anInt1504 = 128;

	@OriginalMember(owner = "client!ia", name = "rc", descriptor = "Lclient!a;")
	public Class1 aClass1_1486 = Static73.aClass1_2051;

	@OriginalMember(owner = "client!ia", name = "jc", descriptor = "Z")
	public boolean aBoolean81 = true;

	@OriginalMember(owner = "client!ia", name = "mc", descriptor = "I")
	private int anInt1507 = 0;

	@OriginalMember(owner = "client!ia", name = "ec", descriptor = "I")
	private int anInt1500 = -1;

	@OriginalMember(owner = "client!ia", name = "vc", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "client!ia", name = "qc", descriptor = "I")
	private int anInt1509 = -1;

	@OriginalMember(owner = "client!ia", name = "oc", descriptor = "I")
	public int anInt1508 = -1;

	@OriginalMember(owner = "client!ia", name = "Vb", descriptor = "I")
	private int anInt1494 = 0;

	@OriginalMember(owner = "client!ia", name = "Lb", descriptor = "I")
	private int anInt1492 = 128;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIBI)Lclient!pa;")
	public Class2_Sub1_Sub1_Sub5 method1007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(17) long local17;
		if (this.anIntArray151 == null) {
			local17 = (this.anInt1502 << 10) + arg2;
		} else {
			local17 = arg2 + (this.anInt1502 << 10) + (arg4 << 3);
		}
		@Pc(43) Class2_Sub1_Sub1_Sub5 local43 = (Class2_Sub1_Sub1_Sub5) Static32.aClass11_10.method431(local17);
		if (local43 == null) {
			local43 = this.method1013(!this.aBoolean77, false, arg2, arg4);
			if (local43 == null) {
				return null;
			}
			Static32.aClass11_10.method430(local17, local43);
		}
		if (this.aBoolean80 || this.aBoolean77) {
			local43 = new Class2_Sub1_Sub1_Sub5(local43, this.aBoolean80, this.aBoolean77);
		}
		if (this.aBoolean80) {
			@Pc(95) int local95 = (arg0 + arg5 + arg3 + arg1) / 4;
			for (@Pc(97) int local97 = 0; local97 < local43.anInt2031; local97++) {
				@Pc(104) int local104 = local43.anIntArray238[local97];
				@Pc(109) int local109 = local43.anIntArray225[local97];
				@Pc(123) int local123 = arg3 + (local104 + 64) * (arg5 + -arg3) / 128;
				@Pc(137) int local137 = arg1 + (local104 + 64) * (-arg1 + arg0) / 128;
				@Pc(150) int local150 = local123 + (local109 + 64) * (local137 - local123) / 128;
				local43.anIntArray237[local97] += local150 - local95;
			}
		}
		return local43;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)Z")
	public boolean method1008() {
		if (this.anIntArray154 == null) {
			return this.anInt1489 != -1 || this.anIntArray152 != null;
		}
		for (@Pc(28) int local28 = 0; local28 < this.anIntArray154.length; local28++) {
			if (this.anIntArray154[local28] != -1) {
				@Pc(44) Class2_Sub1_Sub10 local44 = Static28.method739(this.anIntArray154[local28]);
				if (local44.anInt1489 != -1 || local44.anIntArray152 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!ba;I)V")
	public void method1010(@OriginalArg(0) Class2_Sub3 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method791();
			if (local9 == 0) {
				return;
			}
			this.method1015(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(Z)V")
	public void method1012() {
		if (this.anInt1508 == -1) {
			this.anInt1508 = 0;
			if (this.anIntArray153 != null && (this.anIntArray151 == null || this.anIntArray151[0] == 10)) {
				this.anInt1508 = 1;
			}
			for (@Pc(28) int local28 = 0; local28 < 5; local28++) {
				if (this.aClass1Array13[local28] != null) {
					this.anInt1508 = 1;
				}
			}
		}
		if (this.anInt1498 == -1) {
			this.anInt1498 = this.aBoolean75 ? 1 : 0;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZBZII)Lclient!pa;")
	private Class2_Sub1_Sub1_Sub5 method1013(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class2_Sub1_Sub1_Sub5 local7 = null;
		@Pc(30) boolean local30;
		@Pc(34) int local34;
		@Pc(36) int local36;
		@Pc(42) int local42;
		if (this.anIntArray151 == null) {
			if (arg3 != 10) {
				return null;
			}
			if (this.anIntArray153 == null) {
				return null;
			}
			local30 = arg2 > 3 ^ this.aBoolean83;
			local34 = this.anIntArray153.length;
			for (local36 = 0; local36 < local34; local36++) {
				local42 = this.anIntArray153[local36];
				if (local30) {
					local42 += 65536;
				}
				local7 = (Class2_Sub1_Sub1_Sub5) Static77.aClass11_18.method431((long) local42);
				if (local7 == null) {
					local7 = Static75.method1431(Static1.aClass8_1, local42 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local30) {
						local7.method1419();
					}
					Static77.aClass11_18.method430((long) local42, local7);
				}
				if (local34 > 1) {
					Static86.aClass2_Sub1_Sub1_Sub5Array1[local36] = local7;
				}
			}
			if (local34 > 1) {
				local7 = new Class2_Sub1_Sub1_Sub5(Static86.aClass2_Sub1_Sub1_Sub5Array1, local34);
			}
		} else {
			@Pc(103) int local103 = -1;
			for (local34 = 0; local34 < this.anIntArray151.length; local34++) {
				if (arg3 == this.anIntArray151[local34]) {
					local103 = local34;
					break;
				}
			}
			if (local103 == -1) {
				return null;
			}
			local36 = this.anIntArray153[local103];
			@Pc(147) boolean local147 = this.aBoolean83 ^ arg2 > 3;
			if (local147) {
				local36 += 65536;
			}
			local7 = (Class2_Sub1_Sub1_Sub5) Static77.aClass11_18.method431((long) local36);
			if (local7 == null) {
				local7 = Static75.method1431(Static1.aClass8_1, local36 & 0xFFFF);
				if (local7 == null) {
					return null;
				}
				if (local147) {
					local7.method1419();
				}
				Static77.aClass11_18.method430((long) local36, local7);
			}
		}
		if (this.anInt1485 == 128 && this.anInt1504 == 128 && this.anInt1492 == 128) {
			local30 = false;
		} else {
			local30 = true;
		}
		@Pc(215) boolean local215;
		if (this.anInt1479 == 0 && this.anInt1493 == 0 && this.anInt1482 == 0) {
			local215 = false;
		} else {
			local215 = true;
		}
		@Pc(240) Class2_Sub1_Sub1_Sub5 local240 = new Class2_Sub1_Sub1_Sub5(local7, arg2 == 0 && !local30 && !local215, this.anIntArray150 == null, true);
		@Pc(244) int local244 = arg2 & 0x3;
		if (local244 == 1) {
			local240.method1414();
		} else if (local244 == 2) {
			local240.method1420();
		} else if (local244 == 3) {
			local240.method1425();
		}
		if (this.anIntArray150 != null) {
			for (local42 = 0; local42 < this.anIntArray150.length; local42++) {
				local240.method1404(this.anIntArray150[local42], this.anIntArray149[local42]);
			}
		}
		if (local30) {
			local240.method1422(this.anInt1485, this.anInt1504, this.anInt1492);
		}
		if (local215) {
			local240.method1429(this.anInt1479, this.anInt1493, this.anInt1482);
		}
		if (arg1) {
			local240.method1411();
		}
		local240.method1403(this.anInt1494 + 64, 768 - -(this.anInt1507 * 5), -50, -10, -50, arg0);
		return local240;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIILclient!he;II)Lclient!pa;")
	public Class2_Sub1_Sub1_Sub5 method1014(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class2_Sub1_Sub9 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) long local16;
		if (this.anIntArray151 == null) {
			local16 = arg4 + (this.anInt1502 << 10);
		} else {
			local16 = arg4 + (this.anInt1502 << 10) + (arg3 << 3);
		}
		@Pc(36) Class2_Sub1_Sub1_Sub5 local36 = (Class2_Sub1_Sub1_Sub5) Static82.aClass11_19.method431(local16);
		if (local36 == null) {
			local36 = this.method1013(true, true, arg4, arg3);
			if (local36 == null) {
				return null;
			}
			Static82.aClass11_19.method430(local16, local36);
		}
		if (arg5 == null && !this.aBoolean80) {
			return local36;
		}
		if (arg5 == null) {
			local36 = local36.method1418(true);
		} else {
			local36 = arg5.method980(arg2, local36, arg4);
		}
		if (this.aBoolean80) {
			@Pc(97) int local97 = (arg1 + arg0 + arg7 + arg6) / 4;
			for (@Pc(99) int local99 = 0; local99 < local36.anInt2031; local99++) {
				@Pc(106) int local106 = local36.anIntArray225[local99];
				@Pc(111) int local111 = local36.anIntArray238[local99];
				@Pc(123) int local123 = arg0 + (local111 + 64) * (arg1 - arg0) / 128;
				@Pc(136) int local136 = arg6 + (local111 + 64) * (arg7 + -arg6) / 128;
				@Pc(149) int local149 = local123 + (local106 + 64) * (-local123 + local136) / 128;
				local36.anIntArray237[local99] += local149 - local97;
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!ba;II)V")
	private void method1015(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(297) int local297;
		@Pc(303) int local303;
		if (arg1 == 1) {
			local297 = arg0.method791();
			if (local297 > 0) {
				if (this.anIntArray153 == null || Static63.aBoolean101) {
					this.anIntArray151 = new int[local297];
					this.anIntArray153 = new int[local297];
					for (local303 = 0; local303 < local297; local303++) {
						this.anIntArray153[local303] = arg0.method792();
						this.anIntArray151[local303] = arg0.method791();
					}
				} else {
					arg0.anInt1168 += local297 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.aClass1_1486 = arg0.method787();
		} else if (arg1 == 5) {
			local297 = arg0.method791();
			if (local297 > 0) {
				if (this.anIntArray153 == null || Static63.aBoolean101) {
					this.anIntArray151 = null;
					this.anIntArray153 = new int[local297];
					for (local303 = 0; local303 < local297; local303++) {
						this.anIntArray153[local303] = arg0.method792();
					}
				} else {
					arg0.anInt1168 += local297 * 2;
				}
			}
		} else if (arg1 == 14) {
			this.anInt1481 = arg0.method791();
		} else if (arg1 == 15) {
			this.anInt1491 = arg0.method791();
		} else if (arg1 == 17) {
			this.aBoolean75 = false;
		} else if (arg1 == 18) {
			this.aBoolean79 = false;
		} else if (arg1 == 19) {
			this.anInt1508 = arg0.method791();
		} else if (arg1 == 21) {
			this.aBoolean80 = true;
		} else if (arg1 == 22) {
			this.aBoolean77 = true;
		} else if (arg1 == 23) {
			this.aBoolean78 = true;
		} else if (arg1 == 24) {
			this.anInt1484 = arg0.method792();
			if (this.anInt1484 == 65535) {
				this.anInt1484 = -1;
			}
		} else if (arg1 == 28) {
			this.anInt1483 = arg0.method791();
		} else if (arg1 == 29) {
			this.anInt1494 = arg0.method831();
		} else if (arg1 == 39) {
			this.anInt1507 = arg0.method831() * 5;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass1Array13[arg1 - 30] = arg0.method787();
			if (this.aClass1Array13[arg1 - 30].method14(Static98.aClass1_2627)) {
				this.aClass1Array13[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local297 = arg0.method791();
			this.anIntArray150 = new int[local297];
			this.anIntArray149 = new int[local297];
			for (local303 = 0; local303 < local297; local303++) {
				this.anIntArray150[local303] = arg0.method792();
				this.anIntArray149[local303] = arg0.method792();
			}
		} else if (arg1 == 60) {
			this.anInt1487 = arg0.method792();
		} else if (arg1 == 62) {
			this.aBoolean83 = true;
		} else if (arg1 == 64) {
			this.aBoolean81 = false;
		} else if (arg1 == 65) {
			this.anInt1485 = arg0.method792();
		} else if (arg1 == 66) {
			this.anInt1504 = arg0.method792();
		} else if (arg1 == 67) {
			this.anInt1492 = arg0.method792();
		} else if (arg1 == 68) {
			this.anInt1501 = arg0.method792();
		} else if (arg1 == 69) {
			this.anInt1488 = arg0.method791();
		} else if (arg1 == 70) {
			this.anInt1479 = arg0.method786();
		} else if (arg1 == 71) {
			this.anInt1493 = arg0.method786();
		} else if (arg1 == 72) {
			this.anInt1482 = arg0.method786();
		} else if (arg1 == 73) {
			this.aBoolean82 = true;
		} else if (arg1 == 74) {
			this.aBoolean76 = true;
		} else if (arg1 == 75) {
			this.anInt1498 = arg0.method791();
		} else if (arg1 == 77) {
			this.anInt1509 = arg0.method792();
			if (this.anInt1509 == 65535) {
				this.anInt1509 = -1;
			}
			this.anInt1500 = arg0.method792();
			if (this.anInt1500 == 65535) {
				this.anInt1500 = -1;
			}
			local297 = arg0.method791();
			this.anIntArray154 = new int[local297 + 1];
			for (local303 = 0; local303 <= local297; local303++) {
				this.anIntArray154[local303] = arg0.method792();
				if (this.anIntArray154[local303] == 65535) {
					this.anIntArray154[local303] = -1;
				}
			}
		} else if (arg1 == 78) {
			this.anInt1489 = arg0.method792();
			this.anInt1480 = arg0.method791();
		} else if (arg1 == 79) {
			this.anInt1478 = arg0.method792();
			this.anInt1505 = arg0.method792();
			this.anInt1480 = arg0.method791();
			local297 = arg0.method791();
			this.anIntArray152 = new int[local297];
			for (local303 = 0; local303 < local297; local303++) {
				this.anIntArray152[local303] = arg0.method792();
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)Z")
	public boolean method1017(@OriginalArg(0) int arg0) {
		if (this.anIntArray151 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray151.length; local15++) {
				if (arg0 == this.anIntArray151[local15]) {
					return Static1.aClass8_1.method1685(this.anIntArray153[local15] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray153 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(64) boolean local64 = true;
			for (@Pc(66) int local66 = 0; local66 < this.anIntArray153.length; local66++) {
				local64 &= Static1.aClass8_1.method1685(this.anIntArray153[local66] & 0xFFFF, 0);
			}
			return local64;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)Lclient!ia;")
	public Class2_Sub1_Sub10 method1018() {
		@Pc(5) int local5 = -1;
		if (this.anInt1509 != -1) {
			local5 = Static41.method962(this.anInt1509);
		} else if (this.anInt1500 != -1) {
			local5 = Static94.anIntArray295[this.anInt1500];
		}
		return local5 < 0 || this.anIntArray154.length <= local5 || this.anIntArray154[local5] == -1 ? null : Static28.method739(this.anIntArray154[local5]);
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)Z")
	public boolean method1019() {
		if (this.anIntArray153 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray153.length; local14++) {
			local12 &= Static1.aClass8_1.method1685(this.anIntArray153[local14] & 0xFFFF, 0);
		}
		return local12;
	}
}
