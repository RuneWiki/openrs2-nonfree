import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class52 {

	@OriginalMember(owner = "client!cp", name = "f", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!cp", name = "h", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!cp", name = "i", descriptor = "Lclient!mn;")
	public Class194 aClass194_1;

	@OriginalMember(owner = "client!cp", name = "k", descriptor = "I")
	private int anInt1345;

	@OriginalMember(owner = "client!cp", name = "l", descriptor = "I")
	public int anInt1346;

	@OriginalMember(owner = "client!cp", name = "w", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!cp", name = "x", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "I")
	public int anInt1342 = -1;

	@OriginalMember(owner = "client!cp", name = "p", descriptor = "B")
	public byte aByte13 = 0;

	@OriginalMember(owner = "client!cp", name = "s", descriptor = "I")
	private int anInt1351 = 0;

	@OriginalMember(owner = "client!cp", name = "t", descriptor = "I")
	private int anInt1352 = -1;

	@OriginalMember(owner = "client!cp", name = "j", descriptor = "I")
	private int anInt1344 = 0;

	@OriginalMember(owner = "client!cp", name = "n", descriptor = "I")
	private int anInt1348 = 128;

	@OriginalMember(owner = "client!cp", name = "o", descriptor = "Z")
	public boolean aBoolean84 = false;

	@OriginalMember(owner = "client!cp", name = "z", descriptor = "I")
	private int anInt1355 = 128;

	@OriginalMember(owner = "client!cp", name = "q", descriptor = "I")
	private int anInt1349 = 0;

	static {
		new Class306("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILclient!ge;B)V")
	private void method1268(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub6 arg1) {
		if (arg0 == 1) {
			this.anInt1345 = arg1.method3967();
		} else if (arg0 == 2) {
			this.anInt1342 = arg1.method3967();
		} else if (arg0 == 4) {
			this.anInt1348 = arg1.method3967();
		} else if (arg0 == 5) {
			this.anInt1355 = arg1.method3967();
		} else if (arg0 == 6) {
			this.anInt1344 = arg1.method3967();
		} else if (arg0 == 7) {
			this.anInt1351 = arg1.method3922();
		} else if (arg0 == 8) {
			this.anInt1349 = arg1.method3922();
		} else if (arg0 == 9) {
			this.anInt1352 = 8224;
			this.aByte13 = 3;
		} else if (arg0 == 10) {
			this.aBoolean84 = true;
		} else if (arg0 == 11) {
			this.aByte13 = 1;
		} else if (arg0 == 12) {
			this.aByte13 = 4;
		} else if (arg0 == 13) {
			this.aByte13 = 5;
		} else if (arg0 == 14) {
			this.aByte13 = 2;
			this.anInt1352 = arg1.method3922() * 256;
		} else if (arg0 == 15) {
			this.aByte13 = 3;
			this.anInt1352 = arg1.method3967();
		} else if (arg0 == 16) {
			this.aByte13 = 3;
			this.anInt1352 = arg1.method3925();
		} else {
			@Pc(111) int local111;
			@Pc(121) int local121;
			if (arg0 == 40) {
				local111 = arg1.method3922();
				this.aShortArray22 = new short[local111];
				this.aShortArray24 = new short[local111];
				for (local121 = 0; local121 < local111; local121++) {
					this.aShortArray24[local121] = (short) arg1.method3967();
					this.aShortArray22[local121] = (short) arg1.method3967();
				}
			} else if (arg0 == 41) {
				local111 = arg1.method3922();
				this.aShortArray23 = new short[local111];
				this.aShortArray25 = new short[local111];
				for (local121 = 0; local121 < local111; local121++) {
					this.aShortArray25[local121] = (short) arg1.method3967();
					this.aShortArray23[local121] = (short) arg1.method3967();
				}
			}
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIILclient!qa;ILclient!ok;)Lclient!r;")
	public Class145 method1270(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class122 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class218 arg5) {
		return this.method1272(arg5, null, 0, (byte) 2, 0, arg2, null, arg4, 0, arg1, false, arg0, arg3);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(BLclient!ge;)V")
	public void method1271(@OriginalArg(1) Class1_Sub6 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3922();
			if (local5 == 0) {
				return;
			}
			this.method1268(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lclient!ok;Lclient!sa;IBIILclient!sa;BIIIZILclient!qa;)Lclient!r;")
	private Class145 method1272(@OriginalArg(0) Class218 arg0, @OriginalArg(1) Class205 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class205 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class122 arg12) {
		@Pc(7) int local7 = arg9;
		@Pc(24) Class199 local24 = this.anInt1342 == -1 || arg5 == -1 ? null : arg0.method5221(this.anInt1342);
		@Pc(33) boolean local33 = arg10 & this.aByte13 != 0;
		if (local24 != null) {
			local7 = arg9 | local24.method4874(arg5, false, arg11);
		}
		if (local33) {
			local7 |= this.aByte13 == 3 ? 7 : 2;
		}
		if (this.anInt1355 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt1348 != 128 || this.anInt1344 != 0) {
			local7 |= 0x5;
		}
		@Pc(83) Class313 local83 = this.aClass194_1.aClass313_36;
		@Pc(103) Class145 local103;
		synchronized (this.aClass194_1.aClass313_36) {
			local103 = (Class145) this.aClass194_1.aClass313_36.method7406((long) (this.anInt1346 |= arg12.anInt8823 << 29));
		}
		if (local103 == null || arg12.method7225(local103.ba(), local7) != 0) {
			if (local103 != null) {
				local7 = arg12.method7241(local7, local103.ba());
			}
			@Pc(127) int local127 = local7;
			if (this.aShortArray24 != null) {
				local127 = local7 | 0x4000;
			}
			if (this.aShortArray25 != null) {
				local127 |= 0x8000;
			}
			@Pc(152) Class97 local152 = Static321.method4995(this.anInt1345, this.aClass194_1.aClass171_85);
			if (local152 == null) {
				return null;
			}
			if (local152.anInt2722 < 13) {
				local152.method2320();
			}
			local103 = arg12.method7280(local152, local127, this.aClass194_1.anInt5632, this.anInt1351 + 64, this.anInt1349 + 850);
			@Pc(187) int local187;
			if (this.aShortArray24 != null) {
				for (local187 = 0; local187 < this.aShortArray24.length; local187++) {
					local103.pa(this.aShortArray24[local187], this.aShortArray22[local187]);
				}
			}
			if (this.aShortArray25 != null) {
				for (local187 = 0; local187 < this.aShortArray25.length; local187++) {
					local103.L(this.aShortArray25[local187], this.aShortArray23[local187]);
				}
			}
			local103.m(local7);
			@Pc(239) Class313 local239 = this.aClass194_1.aClass313_36;
			synchronized (this.aClass194_1.aClass313_36) {
				this.aClass194_1.aClass313_36.method7399((long) (this.anInt1346 |= arg12.anInt8823 << 29), local103);
			}
		}
		@Pc(288) Class145 local288 = local24 == null ? local103.method6672(arg3, local7, true) : local24.method4876(arg5, arg7, local7, arg11, arg3, local103, 0);
		if (this.anInt1348 != 128 || this.anInt1355 != 128) {
			local288.V(this.anInt1348, this.anInt1355, this.anInt1348);
		}
		if (this.anInt1344 != 0) {
			if (this.anInt1344 == 90) {
				local288.OA(4096);
			}
			if (this.anInt1344 == 180) {
				local288.OA(8192);
			}
			if (this.anInt1344 == 270) {
				local288.OA(12288);
			}
		}
		if (local33) {
			local288.RA(this.aByte13, this.anInt1352, arg6, arg1, arg2, arg4, arg8);
		}
		local288.m(arg9);
		return local288;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IZIILclient!qa;BILclient!sa;IIILclient!sa;Lclient!ok;)Lclient!r;")
	public Class145 method1274(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class122 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class205 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class205 arg9, @OriginalArg(12) Class218 arg10) {
		return this.method1272(arg10, arg9, arg4, (byte) 2, arg7, arg2, arg5, arg1, arg8, arg0, true, arg6, arg3);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZIILclient!ok;Lclient!qa;II)Lclient!r;")
	public Class145 method1275(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class218 arg2, @OriginalArg(4) Class122 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return this.method1272(arg2, null, 0, (byte) 5, 0, arg1, null, arg4, 0, arg5, false, arg0, arg3);
	}
}
