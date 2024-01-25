import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class34 {

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
	public int anInt1213;

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
	private int anInt1216;

	@OriginalMember(owner = "client!bg", name = "o", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!bg", name = "r", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!bg", name = "u", descriptor = "Lclient!saa;")
	public Class315 aClass315_1;

	@OriginalMember(owner = "client!bg", name = "w", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
	public int anInt1217 = -1;

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "Z")
	public boolean aBoolean105 = false;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
	private int anInt1212 = 0;

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
	private int anInt1214 = 128;

	@OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
	private int anInt1225 = -1;

	@OriginalMember(owner = "client!bg", name = "v", descriptor = "I")
	private int anInt1227 = 128;

	@OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
	private int anInt1226 = 0;

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
	private int anInt1219 = 0;

	@OriginalMember(owner = "client!bg", name = "z", descriptor = "B")
	public byte aByte21 = 0;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!fca;)V")
	public void method1224(@OriginalArg(1) Class3_Sub17 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method4888();
			if (local10 == 0) {
				return;
			}
			this.method1230(local10, arg0);
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!vf;IIILclient!ha;BI)Lclient!ka;")
	public Class28 method1226(@OriginalArg(0) Class373 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class16 arg4, @OriginalArg(6) int arg5) {
		return this.method1228((Class104) null, 0, arg3, arg5, arg0, arg4, (byte) 2, arg2, 0, (Class104) null, arg1, 0, false);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!s;IILclient!s;ZBIIILclient!ha;Lclient!vf;I)Lclient!ka;")
	public Class28 method1227(@OriginalArg(0) int arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class104 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class16 arg8, @OriginalArg(11) Class373 arg9, @OriginalArg(12) int arg10) {
		return this.method1228(arg1, arg10, arg7, arg6, arg9, arg8, (byte) 2, arg3, arg0, arg4, arg5, arg2, true);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!s;IIILclient!vf;Lclient!ha;BBIILclient!s;IIZ)Lclient!ka;")
	private Class28 method1228(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class373 arg4, @OriginalArg(5) Class16 arg5, @OriginalArg(6) byte arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class104 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) boolean arg12) {
		@Pc(7) int local7 = arg2;
		@Pc(22) Class48 local22 = this.anInt1217 == -1 || arg10 == -1 ? null : arg4.method8323(this.anInt1217);
		@Pc(31) boolean local31 = arg12 & this.aByte21 != 0;
		if (local22 != null) {
			local7 = arg2 | local22.method1520(arg10, arg3, false);
		}
		if (local31) {
			local7 |= this.aByte21 == 3 ? 7 : 2;
		}
		if (this.anInt1227 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt1214 != 128 || this.anInt1212 != 0) {
			local7 |= 0x5;
		}
		@Pc(86) Class279 local86 = this.aClass315_1.aClass279_47;
		@Pc(106) Class28 local106;
		synchronized (this.aClass315_1.aClass279_47) {
			local106 = (Class28) this.aClass315_1.aClass279_47.method6631((long) (this.anInt1213 |= arg5.anInt9594 << 29));
		}
		if (local106 == null || arg5.method8122(local106.ua(), local7) != 0) {
			if (local106 != null) {
				local7 = arg5.method8198(local7, local106.ua());
			}
			@Pc(130) int local130 = local7;
			if (this.aShortArray25 != null) {
				local130 = local7 | 0x4000;
			}
			if (this.aShortArray22 != null) {
				local130 |= 0x8000;
			}
			@Pc(153) Class73 local153 = Static573.method7744(this.anInt1216, this.aClass315_1.aClass143_119);
			if (local153 == null) {
				return null;
			}
			if (local153.anInt2049 < 13) {
				local153.method1895();
			}
			local106 = arg5.method8137(local153, local130, this.aClass315_1.anInt8774, this.anInt1219 + 64, this.anInt1226 + 850);
			@Pc(188) int local188;
			if (this.aShortArray25 != null) {
				for (local188 = 0; local188 < this.aShortArray25.length; local188++) {
					local106.ia(this.aShortArray25[local188], this.aShortArray24[local188]);
				}
			}
			if (this.aShortArray22 != null) {
				for (local188 = 0; local188 < this.aShortArray22.length; local188++) {
					local106.aa(this.aShortArray22[local188], this.aShortArray23[local188]);
				}
			}
			local106.s(local7);
			@Pc(240) Class279 local240 = this.aClass315_1.aClass279_47;
			synchronized (this.aClass315_1.aClass279_47) {
				this.aClass315_1.aClass279_47.method6635(local106, (long) (this.anInt1213 |= arg5.anInt9594 << 29));
			}
		}
		@Pc(284) Class28 local284 = local22 == null ? local106.method6900(arg6, local7, true) : local22.method1518(arg10, arg7, 0, arg3, local7, arg6, local106);
		if (this.anInt1214 != 128 || this.anInt1227 != 128) {
			local284.O(this.anInt1214, this.anInt1227, this.anInt1214);
		}
		if (this.anInt1212 != 0) {
			if (this.anInt1212 == 90) {
				local284.a(4096);
			}
			if (this.anInt1212 == 180) {
				local284.a(8192);
			}
			if (this.anInt1212 == 270) {
				local284.a(12288);
			}
		}
		if (local31) {
			local284.p(this.aByte21, this.anInt1225, arg0, arg9, arg1, arg8, arg11);
		}
		local284.s(arg2);
		return local284;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIBLclient!vf;Lclient!ha;)Lclient!ka;")
	public Class28 method1229(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) Class373 arg5, @OriginalArg(7) Class16 arg6) {
		return this.method1228((Class104) null, 0, arg1, arg2, arg5, arg6, arg4, arg3, 0, (Class104) null, arg0, 0, false);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BILclient!fca;)V")
	private void method1230(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt1216 = arg1.method4858();
		} else if (arg0 == 2) {
			this.anInt1217 = arg1.method4858();
		} else if (arg0 == 4) {
			this.anInt1214 = arg1.method4858();
		} else if (arg0 == 5) {
			this.anInt1227 = arg1.method4858();
		} else if (arg0 == 6) {
			this.anInt1212 = arg1.method4858();
		} else if (arg0 == 7) {
			this.anInt1219 = arg1.method4888();
		} else if (arg0 == 8) {
			this.anInt1226 = arg1.method4888();
		} else if (arg0 == 9) {
			this.anInt1225 = 8224;
			this.aByte21 = 3;
		} else if (arg0 == 10) {
			this.aBoolean105 = true;
		} else if (arg0 == 11) {
			this.aByte21 = 1;
		} else if (arg0 == 12) {
			this.aByte21 = 4;
		} else if (arg0 == 13) {
			this.aByte21 = 5;
		} else if (arg0 == 14) {
			this.aByte21 = 2;
			this.anInt1225 = arg1.method4888() * 256;
		} else if (arg0 == 15) {
			this.aByte21 = 3;
			this.anInt1225 = arg1.method4858();
		} else if (arg0 == 16) {
			this.aByte21 = 3;
			this.anInt1225 = arg1.method4868();
		} else {
			@Pc(123) int local123;
			@Pc(133) int local133;
			if (arg0 == 40) {
				local123 = arg1.method4888();
				this.aShortArray25 = new short[local123];
				this.aShortArray24 = new short[local123];
				for (local133 = 0; local133 < local123; local133++) {
					this.aShortArray25[local133] = (short) arg1.method4858();
					this.aShortArray24[local133] = (short) arg1.method4858();
				}
			} else if (arg0 == 41) {
				local123 = arg1.method4888();
				this.aShortArray23 = new short[local123];
				this.aShortArray22 = new short[local123];
				for (local133 = 0; local133 < local123; local133++) {
					this.aShortArray22[local133] = (short) arg1.method4858();
					this.aShortArray23[local133] = (short) arg1.method4858();
				}
			}
		}
	}
}
