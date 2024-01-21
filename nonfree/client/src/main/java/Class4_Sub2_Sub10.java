import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class4_Sub2_Sub10 extends Class4_Sub2 {

	@OriginalMember(owner = "client!j", name = "V", descriptor = "[I")
	private int[] anIntArray143;

	@OriginalMember(owner = "client!j", name = "ib", descriptor = "[I")
	public int[] anIntArray144;

	@OriginalMember(owner = "client!j", name = "Fb", descriptor = "I")
	public int anInt1415;

	@OriginalMember(owner = "client!j", name = "Ib", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!j", name = "Jb", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!j", name = "Pb", descriptor = "[I")
	private int[] anIntArray145;

	@OriginalMember(owner = "client!j", name = "Vb", descriptor = "[I")
	public int[] anIntArray147;

	@OriginalMember(owner = "client!j", name = "Z", descriptor = "I")
	public int anInt1391 = 0;

	@OriginalMember(owner = "client!j", name = "W", descriptor = "Z")
	public boolean aBoolean72 = false;

	@OriginalMember(owner = "client!j", name = "bb", descriptor = "I")
	private int anInt1393 = 0;

	@OriginalMember(owner = "client!j", name = "ob", descriptor = "I")
	public int anInt1404 = -1;

	@OriginalMember(owner = "client!j", name = "sb", descriptor = "I")
	public int anInt1408 = -1;

	@OriginalMember(owner = "client!j", name = "gb", descriptor = "Z")
	public boolean aBoolean75 = true;

	@OriginalMember(owner = "client!j", name = "Ab", descriptor = "I")
	public int anInt1410 = 1;

	@OriginalMember(owner = "client!j", name = "qb", descriptor = "I")
	private int anInt1406 = 0;

	@OriginalMember(owner = "client!j", name = "vb", descriptor = "Z")
	public boolean aBoolean76 = false;

	@OriginalMember(owner = "client!j", name = "ub", descriptor = "I")
	public int anInt1409 = 0;

	@OriginalMember(owner = "client!j", name = "eb", descriptor = "I")
	public int anInt1396 = -1;

	@OriginalMember(owner = "client!j", name = "Y", descriptor = "Z")
	public boolean aBoolean74 = false;

	@OriginalMember(owner = "client!j", name = "X", descriptor = "Z")
	public boolean aBoolean73 = true;

	@OriginalMember(owner = "client!j", name = "fb", descriptor = "I")
	private int anInt1397 = 128;

	@OriginalMember(owner = "client!j", name = "Kb", descriptor = "I")
	private int anInt1417 = 128;

	@OriginalMember(owner = "client!j", name = "Eb", descriptor = "I")
	private int anInt1414 = 0;

	@OriginalMember(owner = "client!j", name = "Mb", descriptor = "I")
	private int anInt1418 = 0;

	@OriginalMember(owner = "client!j", name = "wb", descriptor = "Lclient!ja;")
	public Class39 aClass39_787 = Static114.aClass39_1492;

	@OriginalMember(owner = "client!j", name = "xb", descriptor = "[Lclient!ja;")
	public final Class39[] aClass39Array12 = new Class39[5];

	@OriginalMember(owner = "client!j", name = "Cb", descriptor = "I")
	public int anInt1412 = 16;

	@OriginalMember(owner = "client!j", name = "Zb", descriptor = "I")
	public int anInt1425 = 0;

	@OriginalMember(owner = "client!j", name = "Yb", descriptor = "Z")
	private boolean aBoolean79 = false;

	@OriginalMember(owner = "client!j", name = "mb", descriptor = "I")
	public int anInt1402 = -1;

	@OriginalMember(owner = "client!j", name = "Tb", descriptor = "I")
	private int anInt1421 = 128;

	@OriginalMember(owner = "client!j", name = "cb", descriptor = "I")
	private int anInt1394 = 0;

	@OriginalMember(owner = "client!j", name = "rb", descriptor = "I")
	public int anInt1407 = 2;

	@OriginalMember(owner = "client!j", name = "Lb", descriptor = "Z")
	private boolean aBoolean77 = false;

	@OriginalMember(owner = "client!j", name = "Db", descriptor = "I")
	public int anInt1413 = 1;

	@OriginalMember(owner = "client!j", name = "cc", descriptor = "I")
	public int anInt1428 = -1;

	@OriginalMember(owner = "client!j", name = "Xb", descriptor = "I")
	public int anInt1424 = 0;

	@OriginalMember(owner = "client!j", name = "bc", descriptor = "I")
	public int anInt1427 = -1;

	@OriginalMember(owner = "client!j", name = "nb", descriptor = "I")
	private int anInt1403 = -1;

	@OriginalMember(owner = "client!j", name = "Ob", descriptor = "Z")
	public boolean aBoolean78 = false;

	@OriginalMember(owner = "client!j", name = "Wb", descriptor = "I")
	private int anInt1423 = -1;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IZLclient!s;)V")
	private void method916(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub16 arg1) {
		@Pc(14) int local14;
		@Pc(44) int local44;
		if (arg0 == 1) {
			local14 = arg1.method1474();
			if (local14 > 0) {
				if (this.anIntArray145 == null || Static46.aBoolean52) {
					this.anIntArray145 = new int[local14];
					this.anIntArray143 = new int[local14];
					for (local44 = 0; local44 < local14; local44++) {
						this.anIntArray145[local44] = arg1.method1490();
						this.anIntArray143[local44] = arg1.method1474();
					}
				} else {
					arg1.anInt2019 += local14 * 3;
				}
			}
		} else if (arg0 == 2) {
			this.aClass39_787 = arg1.method1464();
		} else if (arg0 == 5) {
			local14 = arg1.method1474();
			if (local14 > 0) {
				if (this.anIntArray145 == null || Static46.aBoolean52) {
					this.anIntArray143 = null;
					this.anIntArray145 = new int[local14];
					for (local44 = 0; local44 < local14; local44++) {
						this.anIntArray145[local44] = arg1.method1490();
					}
				} else {
					arg1.anInt2019 += local14 * 2;
				}
			}
		} else if (arg0 == 14) {
			this.anInt1410 = arg1.method1474();
		} else if (arg0 == 15) {
			this.anInt1413 = arg1.method1474();
		} else if (arg0 == 17) {
			this.aBoolean75 = false;
			this.anInt1407 = 0;
		} else if (arg0 == 18) {
			this.aBoolean75 = false;
		} else if (arg0 == 19) {
			this.anInt1404 = arg1.method1474();
		} else if (arg0 == 21) {
			this.aBoolean72 = true;
		} else if (arg0 == 22) {
			this.aBoolean77 = true;
		} else if (arg0 == 23) {
			this.aBoolean78 = true;
		} else if (arg0 == 24) {
			this.anInt1428 = arg1.method1490();
			if (this.anInt1428 == 65535) {
				this.anInt1428 = -1;
			}
		} else if (arg0 == 27) {
			this.anInt1407 = 1;
		} else if (arg0 == 28) {
			this.anInt1412 = arg1.method1474();
		} else if (arg0 == 29) {
			this.anInt1414 = arg1.method1477();
		} else if (arg0 == 39) {
			this.anInt1393 = arg1.method1477() * 5;
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass39Array12[arg0 - 30] = arg1.method1464();
			if (this.aClass39Array12[arg0 - 30].method954(Static114.aClass39_1489)) {
				this.aClass39Array12[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local14 = arg1.method1474();
			this.aShortArray5 = new short[local14];
			this.aShortArray4 = new short[local14];
			for (local44 = 0; local44 < local14; local44++) {
				this.aShortArray4[local44] = (short) arg1.method1490();
				this.aShortArray5[local44] = (short) arg1.method1490();
			}
		} else if (arg0 == 60) {
			this.anInt1402 = arg1.method1490();
		} else if (arg0 == 62) {
			this.aBoolean79 = true;
		} else if (arg0 == 64) {
			this.aBoolean73 = false;
		} else if (arg0 == 65) {
			this.anInt1397 = arg1.method1490();
		} else if (arg0 == 66) {
			this.anInt1417 = arg1.method1490();
		} else if (arg0 == 67) {
			this.anInt1421 = arg1.method1490();
		} else if (arg0 == 68) {
			this.anInt1408 = arg1.method1490();
		} else if (arg0 == 69) {
			this.anInt1424 = arg1.method1474();
		} else if (arg0 == 70) {
			this.anInt1406 = arg1.method1476();
		} else if (arg0 == 71) {
			this.anInt1394 = arg1.method1476();
		} else if (arg0 == 72) {
			this.anInt1418 = arg1.method1476();
		} else if (arg0 == 73) {
			this.aBoolean74 = true;
		} else if (arg0 == 74) {
			this.aBoolean76 = true;
		} else if (arg0 == 75) {
			this.anInt1396 = arg1.method1474();
		} else if (arg0 == 77) {
			this.anInt1423 = arg1.method1490();
			if (this.anInt1423 == 65535) {
				this.anInt1423 = -1;
			}
			this.anInt1403 = arg1.method1490();
			if (this.anInt1403 == 65535) {
				this.anInt1403 = -1;
			}
			local14 = arg1.method1474();
			this.anIntArray144 = new int[local14 + 1];
			for (local44 = 0; local44 <= local14; local44++) {
				this.anIntArray144[local44] = arg1.method1490();
				if (this.anIntArray144[local44] == 65535) {
					this.anIntArray144[local44] = -1;
				}
			}
		} else if (arg0 == 78) {
			this.anInt1427 = arg1.method1490();
			this.anInt1425 = arg1.method1474();
		} else if (arg0 == 79) {
			this.anInt1409 = arg1.method1490();
			this.anInt1391 = arg1.method1490();
			this.anInt1425 = arg1.method1474();
			local14 = arg1.method1474();
			this.anIntArray147 = new int[local14];
			for (local44 = 0; local44 < local14; local44++) {
				this.anIntArray147[local44] = arg1.method1490();
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)Z")
	public boolean method917() {
		if (this.anIntArray145 == null) {
			return true;
		}
		@Pc(18) boolean local18 = true;
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray145.length; local20++) {
			local18 &= Static74.aClass20_37.method491(this.anIntArray145[local20] & 0xFFFF, 0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ZLclient!s;)V")
	public void method919(@OriginalArg(1) Class4_Sub16 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1474();
			if (local5 == 0) {
				return;
			}
			this.method916(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!j", name = "e", descriptor = "(B)V")
	public void method920() {
		if (this.anInt1404 == -1) {
			this.anInt1404 = 0;
			if (this.anIntArray145 != null && (this.anIntArray143 == null || this.anIntArray143[0] == 10)) {
				this.anInt1404 = 1;
			}
			for (@Pc(29) int local29 = 0; local29 < 5; local29++) {
				if (this.aClass39Array12[local29] != null) {
					this.anInt1404 = 1;
				}
			}
		}
		if (this.anInt1396 == -1) {
			this.anInt1396 = this.anInt1407 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ZI)Z")
	public boolean method921(@OriginalArg(1) int arg0) {
		if (this.anIntArray143 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.anIntArray143.length; local16++) {
				if (this.anIntArray143[local16] == arg0) {
					return Static74.aClass20_37.method491(this.anIntArray145[local16] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray145 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(61) boolean local61 = true;
			for (@Pc(63) int local63 = 0; local63 < this.anIntArray145.length; local63++) {
				local61 &= Static74.aClass20_37.method491(this.anIntArray145[local63] & 0xFFFF, 0);
			}
			return local61;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!j", name = "g", descriptor = "(I)Z")
	public boolean method922() {
		if (this.anIntArray144 == null) {
			return this.anInt1427 != -1 || this.anIntArray147 != null;
		}
		for (@Pc(26) int local26 = 0; local26 < this.anIntArray144.length; local26++) {
			if (this.anIntArray144[local26] != -1) {
				@Pc(42) Class4_Sub2_Sub10 local42 = Static73.method1207(this.anIntArray144[local26]);
				if (local42.anInt1427 != -1 || local42.anIntArray147 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)Lclient!qb;")
	private Class4_Sub2_Sub1_Sub4 method924(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class4_Sub2_Sub1_Sub4 local12 = null;
		@Pc(35) boolean local35;
		@Pc(39) int local39;
		@Pc(41) int local41;
		@Pc(47) int local47;
		if (this.anIntArray143 == null) {
			if (arg0 != 10) {
				return null;
			}
			if (this.anIntArray145 == null) {
				return null;
			}
			local35 = this.aBoolean79 ^ arg1 > 3;
			local39 = this.anIntArray145.length;
			for (local41 = 0; local41 < local39; local41++) {
				local47 = this.anIntArray145[local41];
				if (local35) {
					local47 += 65536;
				}
				local12 = (Class4_Sub2_Sub1_Sub4) Static63.aClass12_43.method235((long) local47);
				if (local12 == null) {
					local12 = Static95.method1747(Static74.aClass20_37, local47 & 0xFFFF);
					if (local12 == null) {
						return null;
					}
					if (local35) {
						local12.method1735();
					}
					Static63.aClass12_43.method234(local12, (long) local47);
				}
				if (local39 > 1) {
					Static41.aClass4_Sub2_Sub1_Sub4Array1[local41] = local12;
				}
			}
			if (local39 > 1) {
				local12 = new Class4_Sub2_Sub1_Sub4(Static41.aClass4_Sub2_Sub1_Sub4Array1, local39);
			}
		} else {
			@Pc(112) int local112 = -1;
			for (local39 = 0; local39 < this.anIntArray143.length; local39++) {
				if (arg0 == this.anIntArray143[local39]) {
					local112 = local39;
					break;
				}
			}
			if (local112 == -1) {
				return null;
			}
			local41 = this.anIntArray145[local112];
			@Pc(161) boolean local161 = this.aBoolean79 ^ arg1 > 3;
			if (local161) {
				local41 += 65536;
			}
			local12 = (Class4_Sub2_Sub1_Sub4) Static63.aClass12_43.method235((long) local41);
			if (local12 == null) {
				local12 = Static95.method1747(Static74.aClass20_37, local41 & 0xFFFF);
				if (local12 == null) {
					return null;
				}
				if (local161) {
					local12.method1735();
				}
				Static63.aClass12_43.method234(local12, (long) local41);
			}
		}
		if (this.anInt1397 == 128 && this.anInt1417 == 128 && this.anInt1421 == 128) {
			local35 = false;
		} else {
			local35 = true;
		}
		@Pc(238) boolean local238;
		if (this.anInt1406 == 0 && this.anInt1394 == 0 && this.anInt1418 == 0) {
			local238 = false;
		} else {
			local238 = true;
		}
		@Pc(266) Class4_Sub2_Sub1_Sub4 local266 = new Class4_Sub2_Sub1_Sub4(local12, arg1 == 0 && !local35 && !local238, this.aShortArray4 == null, true);
		@Pc(270) int local270 = arg1 & 0x3;
		if (local270 == 1) {
			local266.method1742();
		} else if (local270 == 2) {
			local266.method1741();
		} else if (local270 == 3) {
			local266.method1749();
		}
		if (this.aShortArray4 != null) {
			for (local47 = 0; local47 < this.aShortArray4.length; local47++) {
				local266.method1731(this.aShortArray4[local47], this.aShortArray5[local47]);
			}
		}
		if (local35) {
			local266.method1738(this.anInt1397, this.anInt1417, this.anInt1421);
		}
		if (local238) {
			local266.method1740(this.anInt1406, this.anInt1394, this.anInt1418);
		}
		return local266;
	}

	@OriginalMember(owner = "client!j", name = "h", descriptor = "(I)Lclient!j;")
	public Class4_Sub2_Sub10 method925() {
		@Pc(5) int local5 = -1;
		if (this.anInt1423 != -1) {
			local5 = Static3.method15(this.anInt1423);
		} else if (this.anInt1403 != -1) {
			local5 = Static22.anIntArray64[this.anInt1403];
		}
		return local5 < 0 || this.anIntArray144.length <= local5 || this.anIntArray144[local5] == -1 ? null : Static73.method1207(this.anIntArray144[local5]);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIII)Lclient!vb;")
	public Class4_Sub2_Sub1_Sub6 method926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(24) long local24;
		if (this.anIntArray143 == null) {
			local24 = arg4 + (this.anInt1415 << 10);
		} else {
			local24 = (arg0 << 3) + (this.anInt1415 << 10) + arg4;
		}
		@Pc(40) Class4_Sub2_Sub1_Sub6 local40 = (Class4_Sub2_Sub1_Sub6) Static1.aClass12_1.method235(local24);
		if (local40 == null) {
			@Pc(48) Class4_Sub2_Sub1_Sub4 local48 = this.method924(arg0, arg4);
			if (local48 == null) {
				return null;
			}
			local40 = local48.method1743(this.anInt1414 + 64, this.anInt1393 * 5 + 768, -50, -10, -50);
			Static1.aClass12_1.method234(local40, local24);
		}
		if (this.aBoolean72) {
			local40 = local40.method2149(arg5, arg1, arg3, arg2, true);
		}
		return local40;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BILclient!bd;IIIIII)Lclient!vb;")
	public Class4_Sub2_Sub1_Sub6 method927(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub2_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) long local16;
		if (this.anIntArray143 == null) {
			local16 = arg4 + (this.anInt1415 << 10);
		} else {
			local16 = (arg0 << 3) + (this.anInt1415 << 10) + arg4;
		}
		@Pc(38) Class4_Sub2_Sub1_Sub6 local38 = (Class4_Sub2_Sub1_Sub6) Static1.aClass12_1.method235(local16);
		if (local38 == null) {
			@Pc(51) Class4_Sub2_Sub1_Sub4 local51 = this.method924(arg0, arg4);
			if (local51 == null) {
				return null;
			}
			local38 = local51.method1743(this.anInt1414 + 64, this.anInt1393 * 5 + 768, -50, -10, -50);
			Static1.aClass12_1.method234(local38, local16);
		}
		if (arg1 == null && !this.aBoolean72) {
			return local38;
		}
		if (arg1 == null) {
			local38 = local38.method2133(true);
		} else {
			local38 = arg1.method209(arg6, arg4, local38);
		}
		if (this.aBoolean72) {
			local38.method2149(arg5, arg7, arg3, arg2, false);
		}
		return local38;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIBI)Lclient!uc;")
	public Class4_Sub2_Sub1 method929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(16) long local16;
		if (this.anIntArray143 == null) {
			local16 = (this.anInt1415 << 10) + arg1;
		} else {
			local16 = arg1 + (arg2 << 3) + (this.anInt1415 << 10);
		}
		@Pc(36) Class4_Sub2_Sub1 local36 = (Class4_Sub2_Sub1) Static52.aClass12_36.method235(local16);
		if (local36 == null) {
			@Pc(52) Class4_Sub2_Sub1_Sub4 local52 = this.method924(arg2, arg1);
			if (local52 == null) {
				return null;
			}
			if (this.aBoolean77) {
				local52.aShort1 = (short) (this.anInt1414 + 64);
				local52.aShort2 = (short) (this.anInt1393 * 5 + 768);
				local36 = local52;
				local52.method1748();
			} else {
				local36 = local52.method1743(this.anInt1414 + 64, this.anInt1393 * 5 + 768, -50, -10, -50);
			}
			Static52.aClass12_36.method234(local36, local16);
		}
		if (this.aBoolean77) {
			local36 = ((Class4_Sub2_Sub1_Sub4) local36).method1732();
		}
		if (this.aBoolean72) {
			if (local36 instanceof Class4_Sub2_Sub1_Sub6) {
				local36 = ((Class4_Sub2_Sub1_Sub6) local36).method2149(arg4, arg0, arg3, arg5, true);
			} else if (local36 instanceof Class4_Sub2_Sub1_Sub4) {
				local36 = ((Class4_Sub2_Sub1_Sub4) local36).method1733(arg4, arg0, arg3, arg5);
			}
		}
		return local36;
	}
}
