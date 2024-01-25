import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dba")
public final class Class68 {

	@OriginalMember(owner = "client!dba", name = "f", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!dba", name = "g", descriptor = "I")
	private int anInt1409;

	@OriginalMember(owner = "client!dba", name = "h", descriptor = "I")
	public int anInt1410;

	@OriginalMember(owner = "client!dba", name = "n", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!dba", name = "w", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!dba", name = "x", descriptor = "Lclient!jha;")
	public Class170 aClass170_1;

	@OriginalMember(owner = "client!dba", name = "A", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!dba", name = "q", descriptor = "I")
	public int anInt1416 = -1;

	@OriginalMember(owner = "client!dba", name = "i", descriptor = "Z")
	public boolean aBoolean114 = false;

	@OriginalMember(owner = "client!dba", name = "k", descriptor = "I")
	private int anInt1412 = 0;

	@OriginalMember(owner = "client!dba", name = "l", descriptor = "I")
	private int anInt1413 = 128;

	@OriginalMember(owner = "client!dba", name = "t", descriptor = "I")
	private int anInt1418 = 128;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "I")
	private int anInt1404 = 0;

	@OriginalMember(owner = "client!dba", name = "j", descriptor = "I")
	private int anInt1411 = -1;

	@OriginalMember(owner = "client!dba", name = "p", descriptor = "B")
	public byte aByte20 = 0;

	@OriginalMember(owner = "client!dba", name = "z", descriptor = "I")
	private int anInt1421 = 0;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILclient!ha;IILclient!vga;BBI)Lclient!ka;")
	public Class180 method1351(@OriginalArg(0) int arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class359 arg4, @OriginalArg(5) byte arg5, @OriginalArg(7) int arg6) {
		return this.method1352(arg1, 0, 0, arg0, false, arg2, arg3, 0, arg4, (Class40) null, arg5, (Class40) null, arg6);
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(Lclient!ha;IIIZIBIILclient!vga;Lclient!s;BLclient!s;I)Lclient!ka;")
	private Class180 method1352(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class359 arg8, @OriginalArg(10) Class40 arg9, @OriginalArg(11) byte arg10, @OriginalArg(12) Class40 arg11, @OriginalArg(13) int arg12) {
		@Pc(15) int local15 = arg12;
		@Pc(32) Class200 local32 = this.anInt1416 == -1 || arg3 == -1 ? null : arg8.method8415(this.anInt1416);
		@Pc(41) boolean local41 = arg4 & this.aByte20 != 0;
		if (local32 != null) {
			local15 = arg12 | local32.method4467(false, arg3, arg5);
		}
		if (local41) {
			local15 |= this.aByte20 == 3 ? 7 : 2;
		}
		if (this.anInt1413 != 128) {
			local15 |= 0x2;
		}
		if (this.anInt1418 != 128 || this.anInt1412 != 0) {
			local15 |= 0x5;
		}
		@Pc(92) Class293 local92 = this.aClass170_1.aClass293_35;
		@Pc(112) Class180 local112;
		synchronized (this.aClass170_1.aClass293_35) {
			local112 = (Class180) this.aClass170_1.aClass293_35.method6921((long) (this.anInt1410 |= arg0.anInt8069 << 29));
		}
		if (local112 == null || arg0.method6985(local112.ua(), local15) != 0) {
			if (local112 != null) {
				local15 = arg0.method6989(local15, local112.ua());
			}
			@Pc(136) int local136 = local15;
			if (this.aShortArray21 != null) {
				local136 = local15 | 0x4000;
			}
			if (this.aShortArray23 != null) {
				local136 |= 0x8000;
			}
			@Pc(159) Class349 local159 = Static277.method4157(this.aClass170_1.aClass384_64, this.anInt1409);
			if (local159 == null) {
				return null;
			}
			if (local159.anInt9580 < 13) {
				local159.method8212();
			}
			local112 = arg0.method6982(local159, local136, this.aClass170_1.anInt4376, this.anInt1421 + 64, this.anInt1404 - -850);
			@Pc(192) int local192;
			if (this.aShortArray21 != null) {
				for (local192 = 0; local192 < this.aShortArray21.length; local192++) {
					local112.ia(this.aShortArray21[local192], this.aShortArray22[local192]);
				}
			}
			if (this.aShortArray23 != null) {
				for (local192 = 0; local192 < this.aShortArray23.length; local192++) {
					local112.aa(this.aShortArray23[local192], this.aShortArray24[local192]);
				}
			}
			local112.s(local15);
			@Pc(240) Class293 local240 = this.aClass170_1.aClass293_35;
			synchronized (this.aClass170_1.aClass293_35) {
				this.aClass170_1.aClass293_35.method6925((long) (this.anInt1410 |= arg0.anInt8069 << 29), local112);
			}
		}
		@Pc(284) Class180 local284 = local32 == null ? local112.method7945(arg10, local15, true) : local32.method4469(arg6, arg3, 0, local112, local15, arg5, arg10);
		if (this.anInt1418 != 128 || this.anInt1413 != 128) {
			local284.O(this.anInt1418, this.anInt1413, this.anInt1418);
		}
		if (this.anInt1412 != 0) {
			if (this.anInt1412 == 90) {
				local284.a(4096);
			}
			if (this.anInt1412 == 180) {
				local284.a(8192);
			}
			if (this.anInt1412 == 270) {
				local284.a(12288);
			}
		}
		if (local41) {
			local284.p(this.aByte20, this.anInt1411, arg11, arg9, arg7, arg2, arg1);
		}
		local284.s(arg12);
		return local284;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILclient!s;ILclient!vga;ILclient!ha;Lclient!s;IIIIZZ)Lclient!ka;")
	public Class180 method1353(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class359 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class126 arg5, @OriginalArg(6) Class40 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return this.method1352(arg5, arg0, arg10, arg4, true, arg7, arg8, arg9, arg3, arg1, (byte) 2, arg6, arg2);
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILclient!ee;)V")
	public void method1356(@OriginalArg(1) Class5_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8645();
			if (local5 == 0) {
				return;
			}
			this.method1358(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(Lclient!ha;IIIILclient!vga;I)Lclient!ka;")
	public Class180 method1357(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class359 arg4, @OriginalArg(6) int arg5) {
		return this.method1352(arg0, 0, 0, arg3, false, arg5, arg2, 0, arg4, (Class40) null, (byte) 2, (Class40) null, arg1);
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(BILclient!ee;)V")
	private void method1358(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt1409 = arg1.method8631();
		} else if (arg0 == 2) {
			this.anInt1416 = arg1.method8631();
		} else if (arg0 == 4) {
			this.anInt1418 = arg1.method8631();
		} else if (arg0 == 5) {
			this.anInt1413 = arg1.method8631();
		} else if (arg0 == 6) {
			this.anInt1412 = arg1.method8631();
		} else if (arg0 == 7) {
			this.anInt1421 = arg1.method8645();
		} else if (arg0 == 8) {
			this.anInt1404 = arg1.method8645();
		} else if (arg0 == 9) {
			this.aByte20 = 3;
			this.anInt1411 = 8224;
		} else if (arg0 == 10) {
			this.aBoolean114 = true;
		} else if (arg0 == 11) {
			this.aByte20 = 1;
		} else if (arg0 == 12) {
			this.aByte20 = 4;
		} else if (arg0 == 13) {
			this.aByte20 = 5;
		} else if (arg0 == 14) {
			this.aByte20 = 2;
			this.anInt1411 = arg1.method8645() * 256;
		} else if (arg0 == 15) {
			this.aByte20 = 3;
			this.anInt1411 = arg1.method8631();
		} else if (arg0 == 16) {
			this.aByte20 = 3;
			this.anInt1411 = arg1.method8623();
		} else {
			@Pc(128) int local128;
			@Pc(138) int local138;
			if (arg0 == 40) {
				local128 = arg1.method8645();
				this.aShortArray21 = new short[local128];
				this.aShortArray22 = new short[local128];
				for (local138 = 0; local138 < local128; local138++) {
					this.aShortArray21[local138] = (short) arg1.method8631();
					this.aShortArray22[local138] = (short) arg1.method8631();
				}
			} else if (arg0 == 41) {
				local128 = arg1.method8645();
				this.aShortArray24 = new short[local128];
				this.aShortArray23 = new short[local128];
				for (local138 = 0; local138 < local128; local138++) {
					this.aShortArray23[local138] = (short) arg1.method8631();
					this.aShortArray24[local138] = (short) arg1.method8631();
				}
			}
		}
	}
}
