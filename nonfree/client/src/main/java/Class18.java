import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class18 {

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
	private int anInt533;

	@OriginalMember(owner = "client!ba", name = "n", descriptor = "Lclient!qv;")
	public Class6_Sub7 aClass6_Sub7_1;

	@OriginalMember(owner = "client!ba", name = "p", descriptor = "Lclient!aba;")
	private Class4 aClass4_1;

	@OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
	private int anInt541;

	@OriginalMember(owner = "client!ba", name = "t", descriptor = "Lclient!k;")
	private Class2_Sub13_Sub6 aClass2_Sub13_Sub6_1;

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "Lclient!r;")
	private Class63 aClass63_1;

	@OriginalMember(owner = "client!ba", name = "w", descriptor = "[Z")
	private boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
	private int anInt546;

	@OriginalMember(owner = "client!ba", name = "D", descriptor = "I")
	private int anInt550;

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "Z")
	private boolean aBoolean38 = false;

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "Z")
	private boolean aBoolean39 = false;

	@OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
	private int anInt544 = -32768;

	@OriginalMember(owner = "client!ba", name = "A", descriptor = "I")
	private int anInt547 = -1;

	@OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
	private int anInt549 = -1;

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
	public final int anInt532;

	@OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
	public final int anInt542;

	@OriginalMember(owner = "client!ba", name = "E", descriptor = "B")
	private final byte aByte17;

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "B")
	private final byte aByte16;

	@OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
	private int anInt540;

	@OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
	private int anInt539;

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
	public final int anInt534;

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "Z")
	private final boolean aBoolean37;

	static {
		new Class202(null, "der Spieler ist momentan nicht verfügbar.", null, null);
	}

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lclient!qa;Lclient!ih;IIIIIIZI)V")
	public Class18(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class129 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt532 = arg2;
		this.aBoolean38 = arg8;
		this.anInt542 = arg1.anInt3646;
		this.aByte17 = (byte) arg5;
		this.aByte16 = (byte) arg4;
		this.anInt540 = arg7;
		this.anInt539 = arg6;
		this.anInt534 = arg3;
		this.aBoolean37 = arg0.method6065() && arg1.aBoolean291 && !this.aBoolean38;
		if (arg9 != -1) {
			this.aBoolean39 = true;
		}
		this.method639(arg9);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!r;Lclient!qa;IBIIIZ)V")
	public void method630(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		@Pc(10) Class192[] local10 = arg0.method7708();
		@Pc(13) Class169[] local13 = arg0.method7702();
		if ((this.aClass6_Sub7_1 == null || this.aClass6_Sub7_1.aBoolean566) && (local10 != null || local13 != null)) {
			@Pc(30) Class129 local30 = Static505.aClass206_4.method5326(this.anInt542);
			if (local30.anIntArray392 != null) {
				local30 = local30.method3276(Static84.aClass302_1);
			}
			if (local30 != null) {
				this.aClass6_Sub7_1 = Static406.method6402(Static115.anInt2326);
			}
		}
		if (this.aClass6_Sub7_1 == null) {
			return;
		}
		if (arg6) {
			this.aClass6_Sub7_1.method6397(arg1, (long) Static115.anInt2326, local10, local13);
		} else {
			this.aClass6_Sub7_1.method6403((long) Static115.anInt2326);
		}
		this.aClass6_Sub7_1.method6407(this.aByte16, arg3, arg5, arg4, arg2);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)I")
	public int method631() {
		return this.anInt544;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!qa;I)V")
	public void method633(@OriginalArg(0) Class39 arg0) {
		this.method636(262144, arg0, this.anInt539, true, true, this.anInt540);
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)Z")
	public boolean method634() {
		return this.aBoolean37;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)V")
	public void method635(@OriginalArg(0) int arg0) {
		this.aBoolean39 = true;
		this.method639(arg0);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IBLclient!qa;IZZI)Lclient!r;")
	public Class63 method636(@OriginalArg(0) int arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(11) Class129 local11 = Static505.aClass206_4.method5326(this.anInt542);
		if (local11.anIntArray392 != null) {
			local11 = local11.method3276(Static84.aClass302_1);
		}
		if (local11 == null) {
			this.method640(arg1);
			this.anInt547 = -1;
			this.anInt549 = this.anInt546;
			return null;
		}
		if (!this.aBoolean39 && this.anInt547 != local11.anInt3646) {
			this.aClass63_1 = null;
			this.method639(-1);
		}
		this.method637(arg5, arg2);
		@Pc(73) boolean local73 = arg4 & this.aBoolean37 & Static281.aClass2_Sub19_Sub1_1.method2135(Static266.anInt4923) != 0;
		@Pc(119) boolean local119 = local73 & (this.anInt547 != local11.anInt3646 || (this.anInt549 != this.anInt546 || this.aClass4_1 != null && (this.aClass4_1.aBoolean8 || Static112.aBoolean204) && this.anInt533 != this.anInt546) && Static281.aClass2_Sub19_Sub1_1.method2135(Static266.anInt4923) >= 2);
		if (arg3 && !local119) {
			this.anInt549 = this.anInt546;
			this.anInt547 = local11.anInt3646;
			return null;
		}
		if (local119) {
			Static297.method4693(this.aClass2_Sub13_Sub6_1, this.aByte17, this.anInt539, this.anInt540, this.aBooleanArray4);
		}
		@Pc(151) Class75 local151 = Static532.aClass75Array3[this.aByte17];
		@Pc(169) Class75 local169;
		if (this.aBoolean38) {
			local169 = Static164.aClass75Array1[0];
		} else {
			local169 = this.aByte17 >= 3 ? null : Static532.aClass75Array3[this.aByte17 + 1];
		}
		@Pc(177) Class63 local177 = null;
		if (this.aClass4_1 != null) {
			if (local119) {
				arg0 |= 0x40000;
			}
			local177 = local11.method3279(this.anInt546, this.anInt532 == 11 ? this.anInt534 + 4 : this.anInt534, this.anInt550, arg1, this.anInt539, this.anInt533, local151, this.aClass4_1, arg0, local169, this.anInt540, this.anInt532 == 11 ? 10 : this.anInt532, local151.aa(this.anInt539, this.anInt540));
			if (local177 == null) {
				this.anInt544 = 0;
				this.aBooleanArray4 = null;
				this.aClass2_Sub13_Sub6_1 = null;
			} else {
				if (local119) {
					if (this.aBooleanArray4 == null) {
						this.aBooleanArray4 = new boolean[4];
					}
					this.aClass2_Sub13_Sub6_1 = local177.EA(this.aClass2_Sub13_Sub6_1);
					Static151.method2619(this.aClass2_Sub13_Sub6_1, this.aByte17, arg2, arg5, this.aBooleanArray4);
				}
				this.anInt544 = local177.TA();
			}
			this.aClass63_1 = null;
		} else if (this.aClass63_1 != null && (arg0 & this.aClass63_1.ba()) == arg0 && local11.anInt3646 == this.anInt547) {
			local177 = this.aClass63_1;
		} else {
			if (this.aClass63_1 != null) {
				arg0 |= this.aClass63_1.ba();
			}
			@Pc(356) Class252 local356 = local11.method3271(local151.aa(this.anInt539, this.anInt540), this.anInt539, local151, this.anInt540, this.anInt532 == 11 ? 10 : this.anInt532, local119, arg0, this.anInt532 == 11 ? this.anInt534 + 4 : this.anInt534, local169, arg1);
			if (local356 == null) {
				this.aClass2_Sub13_Sub6_1 = null;
				this.anInt544 = 0;
				this.aClass63_1 = null;
				this.aBooleanArray4 = null;
			} else {
				local177 = local356.aClass63_5;
				this.aClass63_1 = local356.aClass63_5;
				if (local119) {
					this.aBooleanArray4 = null;
					this.aClass2_Sub13_Sub6_1 = local356.aClass2_Sub13_Sub6_5;
					Static151.method2619(this.aClass2_Sub13_Sub6_1, this.aByte17, arg2, arg5, null);
				}
				this.anInt544 = local177.TA();
			}
		}
		this.anInt547 = local11.anInt3646;
		this.anInt539 = arg2;
		this.anInt540 = arg5;
		this.anInt549 = this.anInt546;
		return local177;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)V")
	private void method637(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass4_1 == null) {
				if (this.aBoolean39) {
					return;
				}
				this.method639(-1);
				if (this.aClass4_1 == null) {
					return;
				}
			}
			@Pc(32) int local32 = Static115.anInt2326 - this.anInt541;
			if (local32 > 100 && this.aClass4_1.anInt116 > 0) {
				@Pc(52) int local52 = this.aClass4_1.anIntArray11.length - this.aClass4_1.anInt116;
				while (local52 > this.anInt546 && this.aClass4_1.anIntArray12[this.anInt546] < local32) {
					local32 -= this.aClass4_1.anIntArray12[this.anInt546];
					this.anInt546++;
				}
				if (local52 <= this.anInt546) {
					@Pc(87) int local87 = 0;
					for (@Pc(89) int local89 = local52; local89 < this.aClass4_1.anIntArray11.length; local89++) {
						local87 += this.aClass4_1.anIntArray12[local89];
					}
					local32 %= local87;
				}
				this.anInt533 = this.anInt546 + 1;
				if (this.anInt533 >= this.aClass4_1.anIntArray11.length) {
					this.anInt533 -= this.aClass4_1.anInt116;
					if (this.anInt533 < 0 || this.aClass4_1.anIntArray11.length <= this.anInt533) {
						this.anInt533 = -1;
					}
				}
			}
			while (this.aClass4_1.anIntArray12[this.anInt546] < local32) {
				Static250.method3962(this.anInt546, arg0, this.aByte16, this.aClass4_1, false, arg1);
				local32 -= this.aClass4_1.anIntArray12[this.anInt546];
				this.anInt546++;
				if (this.anInt546 >= this.aClass4_1.anIntArray11.length) {
					this.anInt546 -= this.aClass4_1.anInt116;
					if (this.anInt546 < 0 || this.aClass4_1.anIntArray11.length <= this.anInt546) {
						this.aClass4_1 = null;
						continue label80;
					}
				}
				this.anInt533 = this.anInt546 + 1;
				if (this.aClass4_1.anIntArray11.length <= this.anInt533) {
					this.anInt533 -= this.aClass4_1.anInt116;
					if (this.anInt533 < 0 || this.aClass4_1.anIntArray11.length <= this.anInt533) {
						this.anInt533 = -1;
					}
				}
			}
			this.anInt541 = Static115.anInt2326 - local32;
			this.anInt550 = local32;
			return;
		}
	}

	@OriginalMember(owner = "client!ba", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass6_Sub7_1 != null) {
			this.aClass6_Sub7_1.method6406();
		}
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)V")
	private void method639(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(18) Class129 local18 = Static505.aClass206_4.method5326(this.anInt542);
			@Pc(20) Class129 local20 = local18;
			if (local18.anIntArray392 != null) {
				local18 = local18.method3276(Static84.aClass302_1);
			}
			if (local18 == null) {
				return;
			}
			if (local20 == local18) {
				local20 = null;
			}
			if (local18.anIntArray394 != null) {
				if (this.aClass4_1 != null && local18.method3270(this.aClass4_1.anInt130)) {
					return;
				}
				local7 = local18.method3277();
				if (local18.anInt3646 != this.anInt547) {
					local9 = local18.aBoolean281;
				}
			} else if (local18.anInt3686 == -1) {
				if (local20 != null && local20.anIntArray394 != null) {
					if (this.aClass4_1 != null && local20.method3270(this.aClass4_1.anInt130)) {
						return;
					}
					local7 = local20.method3277();
					if (local20.anInt3646 != this.anInt547) {
						local9 = local20.aBoolean281;
					}
				} else if (local20 != null && local20.anInt3686 != -1 && local20.anInt3646 != this.anInt547) {
					local7 = local20.anInt3686;
					local9 = local20.aBoolean281;
				}
			} else if (this.anInt547 != local18.anInt3646) {
				local9 = local18.aBoolean281;
				local7 = local18.anInt3686;
			}
		}
		if (local7 == -1) {
			this.aClass4_1 = null;
			return;
		}
		this.aClass63_1 = null;
		if (this.aClass4_1 == null || local7 != this.aClass4_1.anInt130) {
			this.aClass4_1 = Static396.aClass157_2.method3745(local7);
		} else if (this.aClass4_1.anInt123 == 0) {
			return;
		}
		if (this.aClass4_1.anIntArray11 == null) {
			this.aClass4_1 = null;
			return;
		}
		if (local9) {
			this.anInt546 = (int) ((double) this.aClass4_1.anIntArray11.length * Math.random());
			this.anInt550 = (int) ((double) this.aClass4_1.anIntArray12[this.anInt546] * Math.random()) + 1;
		} else {
			this.anInt550 = 1;
			this.anInt546 = 0;
		}
		this.anInt533 = this.anInt546 + 1;
		if (this.anInt533 < 0 || this.anInt533 >= this.aClass4_1.anIntArray11.length) {
			this.anInt533 = -1;
		}
		this.anInt541 = Static115.anInt2326 - this.anInt550;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(Lclient!qa;I)V")
	public void method640(@OriginalArg(0) Class39 arg0) {
		if (this.aClass2_Sub13_Sub6_1 != null) {
			Static297.method4693(this.aClass2_Sub13_Sub6_1, this.aByte17, this.anInt539, this.anInt540, this.aBooleanArray4);
			this.aClass2_Sub13_Sub6_1 = null;
			this.aBooleanArray4 = null;
		}
	}
}
