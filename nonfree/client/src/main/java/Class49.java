import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class49 {

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
	private int anInt1512;

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
	private int anInt1513;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
	private int anInt1515;

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "[Z")
	private boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "Lclient!bk;")
	private Class7 aClass7_2;

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
	private int anInt1521;

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "Lclient!kb;")
	private Class107 aClass107_1;

	@OriginalMember(owner = "client!ee", name = "J", descriptor = "Lclient!mm;")
	private Class2_Sub11_Sub10 aClass2_Sub11_Sub10_1;

	@OriginalMember(owner = "client!ee", name = "P", descriptor = "Lclient!om;")
	public Class55_Sub7 aClass55_Sub7_1;

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "Z")
	private boolean aBoolean142 = false;

	@OriginalMember(owner = "client!ee", name = "E", descriptor = "I")
	private int anInt1535 = -1;

	@OriginalMember(owner = "client!ee", name = "F", descriptor = "Z")
	private boolean aBoolean145 = false;

	@OriginalMember(owner = "client!ee", name = "D", descriptor = "I")
	private int anInt1534 = -1;

	@OriginalMember(owner = "client!ee", name = "N", descriptor = "I")
	private int anInt1540 = -32768;

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "B")
	private final byte aByte11;

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
	public final int anInt1517;

	@OriginalMember(owner = "client!ee", name = "O", descriptor = "I")
	public final int anInt1541;

	@OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
	public final int anInt1530;

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
	private int anInt1519;

	@OriginalMember(owner = "client!ee", name = "I", descriptor = "B")
	private final byte aByte12;

	@OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
	private int anInt1526;

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "Z")
	private final boolean aBoolean143;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!ae;Lclient!jh;IIIIIIZI)V")
	public Class49(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.aByte11 = (byte) arg5;
		this.anInt1517 = arg2;
		this.anInt1541 = arg3;
		this.anInt1530 = arg1.anInt3132;
		this.aBoolean142 = arg8;
		this.anInt1519 = arg6;
		this.aByte12 = (byte) arg4;
		this.anInt1526 = arg7;
		this.aBoolean143 = arg0.method4279() && arg1.aBoolean270 && !this.aBoolean142;
		if (arg9 != -1) {
			this.aBoolean145 = true;
		}
		this.method1580(arg9);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!ae;)V")
	public void method1571(@OriginalArg(1) Class4 arg0) {
		if (this.aClass2_Sub11_Sub10_1 != null) {
			Static76.method1680(this.aClass2_Sub11_Sub10_1, this.aByte11, this.anInt1519, this.anInt1526, this.aBooleanArray8);
			this.aClass2_Sub11_Sub10_1 = null;
			this.aBooleanArray8 = null;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BII)V")
	private void method1572(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass107_1 == null) {
				if (this.aBoolean145) {
					return;
				}
				this.method1580(-1);
				if (this.aClass107_1 == null) {
					return;
				}
			}
			@Pc(29) int local29 = Static212.anInt4090 - this.anInt1515;
			if (local29 > 100 && this.aClass107_1.anInt3276 > 0) {
				@Pc(51) int local51 = this.aClass107_1.anIntArray280.length - this.aClass107_1.anInt3276;
				while (this.anInt1513 < local51 && local29 > this.aClass107_1.anIntArray279[this.anInt1513]) {
					local29 -= this.aClass107_1.anIntArray279[this.anInt1513];
					this.anInt1513++;
				}
				if (this.anInt1513 >= local51) {
					@Pc(86) int local86 = 0;
					for (@Pc(88) int local88 = local51; local88 < this.aClass107_1.anIntArray280.length; local88++) {
						local86 += this.aClass107_1.anIntArray279[local88];
					}
					local29 %= local86;
				}
				this.anInt1521 = this.anInt1513 + 1;
				if (this.anInt1521 >= this.aClass107_1.anIntArray280.length) {
					this.anInt1521 -= this.aClass107_1.anInt3276;
					if (this.anInt1521 < 0 || this.aClass107_1.anIntArray280.length <= this.anInt1521) {
						this.anInt1521 = -1;
					}
				}
			}
			while (local29 > this.aClass107_1.anIntArray279[this.anInt1513]) {
				Static343.method5928(false, this.aClass107_1, arg0, this.anInt1513, arg1);
				local29 -= this.aClass107_1.anIntArray279[this.anInt1513];
				this.anInt1513++;
				if (this.aClass107_1.anIntArray280.length <= this.anInt1513) {
					this.anInt1513 -= this.aClass107_1.anInt3276;
					if (this.anInt1513 < 0 || this.anInt1513 >= this.aClass107_1.anIntArray280.length) {
						this.aClass107_1 = null;
						continue label80;
					}
				}
				this.anInt1521 = this.anInt1513 + 1;
				if (this.anInt1521 >= this.aClass107_1.anIntArray280.length) {
					this.anInt1521 -= this.aClass107_1.anInt3276;
					if (this.anInt1521 < 0 || this.anInt1521 >= this.aClass107_1.anIntArray280.length) {
						this.anInt1521 = -1;
					}
				}
			}
			this.anInt1512 = local29;
			this.anInt1515 = Static212.anInt4090 - local29;
			return;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZILclient!ae;IZI)Lclient!bk;")
	public Class7 method1575(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(10) Class96 local10 = Static234.method4051(this.anInt1530);
		if (local10.anIntArray259 != null) {
			local10 = local10.method2944();
		}
		if (local10 == null) {
			this.method1571(arg2);
			this.anInt1535 = -1;
			this.anInt1534 = this.anInt1513;
			return null;
		}
		if (!this.aBoolean145 && local10.anInt3132 != this.anInt1535) {
			this.aClass7_2 = null;
			this.method1580(-1);
		}
		this.method1572(arg5, arg3);
		@Pc(68) boolean local68 = arg4 & this.aBoolean143 & Static322.anInt6490 != 0;
		@Pc(101) boolean local101 = local68 & (this.anInt1535 != local10.anInt3132 || (this.anInt1513 != this.anInt1534 || this.aClass107_1 != null && (this.aClass107_1.aBoolean292 || Static70.aBoolean144) && this.anInt1521 != this.anInt1513) && Static322.anInt6490 >= 2);
		if (arg0 && !local101) {
			this.anInt1535 = local10.anInt3132;
			this.anInt1534 = this.anInt1513;
			return null;
		}
		if (local101) {
			Static76.method1680(this.aClass2_Sub11_Sub10_1, this.aByte11, this.anInt1519, this.anInt1526, this.aBooleanArray8);
		}
		@Pc(142) Class73 local142 = Static301.aClass73Array31[this.aByte11];
		@Pc(149) Class73 local149;
		if (this.aBoolean142) {
			local149 = Static265.aClass73Array44[0];
		} else {
			local149 = this.aByte11 < 3 ? Static301.aClass73Array31[this.aByte11 + 1] : null;
		}
		@Pc(168) Class7 local168 = null;
		if (this.aClass107_1 != null) {
			if (local101) {
				arg1 |= 0x20000;
			}
			local168 = local10.method2945(local142.method4932(this.anInt1519, this.anInt1526), arg2, local149, this.anInt1517 == 11 ? 10 : this.anInt1517, this.anInt1526, this.anInt1521, this.anInt1517 == 11 ? this.anInt1541 + 4 : this.anInt1541, this.anInt1513, this.anInt1512, this.anInt1519, arg1, local142, this.aClass107_1);
			if (local168 == null) {
				this.aBooleanArray8 = null;
				this.aClass2_Sub11_Sub10_1 = null;
				this.anInt1540 = 0;
			} else {
				if (local101) {
					if (this.aBooleanArray8 == null) {
						this.aBooleanArray8 = new boolean[4];
					}
					this.aClass2_Sub11_Sub10_1 = local168.method1404(this.aClass2_Sub11_Sub10_1);
					Static247.method4484(this.aClass2_Sub11_Sub10_1, this.aByte11, arg5, arg3, this.aBooleanArray8);
				}
				this.anInt1540 = local168.method1430();
			}
			this.aClass7_2 = null;
		} else if (this.aClass7_2 != null && (arg1 & this.aClass7_2.method1435()) == arg1 && this.anInt1535 == local10.anInt3132) {
			local168 = this.aClass7_2;
		} else {
			if (this.aClass7_2 != null) {
				arg1 |= this.aClass7_2.method1435();
			}
			@Pc(247) Class183 local247 = local10.method2946(this.anInt1517 == 11 ? this.anInt1541 + 4 : this.anInt1541, local101, local142, arg2, this.anInt1517 == 11 ? 10 : this.anInt1517, this.anInt1519, this.anInt1526, local142.method4932(this.anInt1519, this.anInt1526), arg1, local149);
			if (local247 == null) {
				this.aBooleanArray8 = null;
				this.anInt1540 = 0;
				this.aClass7_2 = null;
				this.aClass2_Sub11_Sub10_1 = null;
			} else {
				local168 = local247.aClass7_6;
				this.aClass7_2 = local247.aClass7_6;
				if (local101) {
					this.aBooleanArray8 = null;
					this.aClass2_Sub11_Sub10_1 = local247.aClass2_Sub11_Sub10_5;
					Static247.method4484(this.aClass2_Sub11_Sub10_1, this.aByte11, arg5, arg3, null);
				}
				this.anInt1540 = local168.method1430();
			}
		}
		this.anInt1526 = arg3;
		this.anInt1535 = local10.anInt3132;
		this.anInt1534 = this.anInt1513;
		this.anInt1519 = arg5;
		return local168;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIZLclient!ae;Lclient!bk;I)V")
	public void method1576(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class4 arg4, @OriginalArg(6) Class7 arg5, @OriginalArg(7) int arg6) {
		@Pc(10) Class161[] local10 = arg5.method1424();
		@Pc(13) Class44[] local13 = arg5.method1399();
		if ((this.aClass55_Sub7_1 == null || this.aClass55_Sub7_1.aBoolean393) && (local10 != null || local13 != null)) {
			@Pc(29) Class96 local29 = Static234.method4051(this.anInt1530);
			if (local29.anIntArray259 != null) {
				local29 = local29.method2944();
			}
			if (local29 != null) {
				this.aClass55_Sub7_1 = new Class55_Sub7(Static212.anInt4090);
			}
		}
		if (this.aClass55_Sub7_1 == null) {
			return;
		}
		if (arg3) {
			this.aClass55_Sub7_1.method4025(arg4, (long) Static212.anInt4090, local10, local13);
		} else {
			this.aClass55_Sub7_1.method4030((long) Static212.anInt4090);
		}
		this.aClass55_Sub7_1.method4035(this.aByte12, arg6, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)I")
	public int method1577() {
		return this.anInt1540;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)V")
	private void method1580(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(18) Class96 local18 = Static234.method4051(this.anInt1530);
			@Pc(20) Class96 local20 = local18;
			if (local18.anIntArray259 != null) {
				local18 = local18.method2944();
			}
			if (local18 == null) {
				return;
			}
			if (local18 == local20) {
				local20 = null;
			}
			if (local18.anIntArray255 != null) {
				if (this.aClass107_1 != null && local18.method2952(this.aClass107_1.anInt3285)) {
					return;
				}
				local7 = local18.method2940();
				if (local18.anInt3132 != this.anInt1535) {
					local9 = local18.aBoolean280;
				}
			} else if (local18.lb == -1) {
				if (local20 != null && local20.anIntArray255 != null) {
					if (this.aClass107_1 != null && local20.method2952(this.aClass107_1.anInt3285)) {
						return;
					}
					local7 = local20.method2940();
					if (this.anInt1535 != local20.anInt3132) {
						local9 = local20.aBoolean280;
					}
				} else if (local20 != null && local20.lb != -1 && local20.anInt3132 != this.anInt1535) {
					local7 = local20.lb;
					local9 = local20.aBoolean280;
				}
			} else if (local18.anInt3132 != this.anInt1535) {
				local9 = local18.aBoolean280;
				local7 = local18.lb;
			}
		}
		if (local7 == -1) {
			this.aClass107_1 = null;
			return;
		}
		this.aClass7_2 = null;
		if (this.aClass107_1 == null || this.aClass107_1.anInt3285 != local7) {
			this.aClass107_1 = Static212.method3773(local7);
		} else if (this.aClass107_1.anInt3273 == 0) {
			return;
		}
		if (this.aClass107_1.anIntArray280 == null) {
			this.aClass107_1 = null;
			return;
		}
		if (local9) {
			this.anInt1513 = (int) ((double) this.aClass107_1.anIntArray280.length * Math.random());
			this.anInt1512 = (int) (Math.random() * (double) this.aClass107_1.anIntArray279[this.anInt1513]) + 1;
		} else {
			this.anInt1513 = 0;
			this.anInt1512 = 1;
		}
		this.anInt1521 = this.anInt1513 + 1;
		if (this.anInt1521 < 0 || this.aClass107_1.anIntArray280.length <= this.anInt1521) {
			this.anInt1521 = -1;
		}
		this.anInt1515 = Static212.anInt4090 - this.anInt1512;
	}

	@OriginalMember(owner = "client!ee", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass55_Sub7_1 != null) {
			this.aClass55_Sub7_1.method4032();
		}
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(II)V")
	public void method1583(@OriginalArg(0) int arg0) {
		this.aBoolean145 = true;
		this.method1580(arg0);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!ae;B)V")
	public void method1584(@OriginalArg(0) Class4 arg0) {
		this.method1575(true, 131072, arg0, this.anInt1526, true, this.anInt1519);
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)Z")
	public boolean method1586() {
		return this.aBoolean143;
	}
}
