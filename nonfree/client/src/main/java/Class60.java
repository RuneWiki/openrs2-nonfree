import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class60 {

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!cs", name = "g", descriptor = "Lclient!kw;")
	public Class200 aClass200_1;

	@OriginalMember(owner = "client!cs", name = "h", descriptor = "I")
	private int anInt1386;

	@OriginalMember(owner = "client!cs", name = "j", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!cs", name = "n", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!cs", name = "y", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!cs", name = "z", descriptor = "I")
	public int anInt1398;

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
	private int anInt1382 = 128;

	@OriginalMember(owner = "client!cs", name = "l", descriptor = "B")
	public byte aByte33 = 0;

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
	public int anInt1383 = -1;

	@OriginalMember(owner = "client!cs", name = "w", descriptor = "I")
	private int anInt1396 = 0;

	@OriginalMember(owner = "client!cs", name = "v", descriptor = "Z")
	public boolean aBoolean111 = false;

	@OriginalMember(owner = "client!cs", name = "A", descriptor = "I")
	private int anInt1399 = 0;

	@OriginalMember(owner = "client!cs", name = "m", descriptor = "I")
	private int anInt1389 = 128;

	@OriginalMember(owner = "client!cs", name = "p", descriptor = "I")
	private int anInt1391 = -1;

	@OriginalMember(owner = "client!cs", name = "u", descriptor = "I")
	private int anInt1395 = 0;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILclient!ln;BIILclient!r;I)Lclient!da;")
	public Class63 method1216(@OriginalArg(0) int arg0, @OriginalArg(1) Class211 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class134 arg4, @OriginalArg(6) int arg5) {
		return this.method1217(0, arg2, 0, null, null, arg1, arg4, false, arg0, (byte) 5, arg5, 0, arg3);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIILclient!i;Lclient!i;Lclient!ln;Lclient!r;IZIBIII)Lclient!da;")
	private Class63 method1217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class47 arg3, @OriginalArg(4) Class47 arg4, @OriginalArg(5) Class211 arg5, @OriginalArg(6) Class134 arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(7) int local7 = arg1;
		@Pc(24) Class290 local24 = this.anInt1383 == -1 || arg12 == -1 ? null : arg5.method4277(this.anInt1383);
		@Pc(33) boolean local33 = arg7 & this.aByte33 != 0;
		if (local24 != null) {
			local7 = arg1 | local24.method6261(false, arg8, arg12);
		}
		if (local33) {
			local7 |= this.aByte33 == 3 ? 7 : 2;
		}
		if (this.anInt1389 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt1382 != 128 || this.anInt1399 != 0) {
			local7 |= 0x5;
		}
		@Pc(83) Class222 local83 = this.aClass200_1.aClass222_30;
		@Pc(103) Class63 local103;
		synchronized (this.aClass200_1.aClass222_30) {
			local103 = (Class63) this.aClass200_1.aClass222_30.method4430((long) (this.anInt1398 |= arg6.anInt8508 << 29));
		}
		if (local103 == null || arg6.method6915(local103.PA(), local7) != 0) {
			if (local103 != null) {
				local7 = arg6.method6967(local7, local103.PA());
			}
			@Pc(127) int local127 = local7;
			if (this.aShortArray16 != null) {
				local127 = local7 | 0x4000;
			}
			if (this.aShortArray18 != null) {
				local127 |= 0x8000;
			}
			@Pc(150) Class210 local150 = Static127.method2013(this.anInt1386, this.aClass200_1.aClass270_56);
			if (local150 == null) {
				return null;
			}
			if (local150.anInt5251 < 13) {
				local150.method4260();
			}
			local103 = arg6.method6910(local150, local127, this.aClass200_1.anInt4947, this.anInt1395 + 64, this.anInt1396 + 850);
			@Pc(187) int local187;
			if (this.aShortArray16 != null) {
				for (local187 = 0; local187 < this.aShortArray16.length; local187++) {
					local103.d(this.aShortArray16[local187], this.aShortArray17[local187]);
				}
			}
			if (this.aShortArray18 != null) {
				for (local187 = 0; local187 < this.aShortArray18.length; local187++) {
					local103.DA(this.aShortArray18[local187], this.aShortArray19[local187]);
				}
			}
			local103.SA(local7);
			@Pc(243) Class222 local243 = this.aClass200_1.aClass222_30;
			synchronized (this.aClass200_1.aClass222_30) {
				this.aClass200_1.aClass222_30.method4434(local103, (long) (this.anInt1398 |= arg6.anInt8508 << 29));
			}
		}
		@Pc(291) Class63 local291 = local24 == null ? local103.method7417(arg9, local7, true) : local24.method6259(local7, arg12, arg10, 0, arg8, local103, arg9);
		if (this.anInt1382 != 128 || this.anInt1389 != 128) {
			local291.R(this.anInt1382, this.anInt1389, this.anInt1382);
		}
		if (this.anInt1399 != 0) {
			if (this.anInt1399 == 90) {
				local291.M(4096);
			}
			if (this.anInt1399 == 180) {
				local291.M(8192);
			}
			if (this.anInt1399 == 270) {
				local291.M(12288);
			}
		}
		if (local33) {
			local291.ba(this.aByte33, this.anInt1391, arg3, arg4, arg0, arg11, arg2);
		}
		local291.SA(arg1);
		return local291;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILclient!ln;ILclient!r;IIB)Lclient!da;")
	public Class63 method1219(@OriginalArg(0) int arg0, @OriginalArg(1) Class211 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class134 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method1217(0, arg4, 0, null, null, arg1, arg3, false, arg5, (byte) 2, arg0, 0, arg2);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZLclient!mo;I)V")
	private void method1220(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1386 = arg0.method5771();
		} else if (arg1 == 2) {
			this.anInt1383 = arg0.method5771();
		} else if (arg1 == 4) {
			this.anInt1382 = arg0.method5771();
		} else if (arg1 == 5) {
			this.anInt1389 = arg0.method5771();
		} else if (arg1 == 6) {
			this.anInt1399 = arg0.method5771();
		} else if (arg1 == 7) {
			this.anInt1395 = arg0.method5750();
		} else if (arg1 == 8) {
			this.anInt1396 = arg0.method5750();
		} else if (arg1 == 9) {
			this.aByte33 = 3;
			this.anInt1391 = 8224;
		} else if (arg1 == 10) {
			this.aBoolean111 = true;
		} else if (arg1 == 11) {
			this.aByte33 = 1;
		} else if (arg1 == 12) {
			this.aByte33 = 4;
		} else if (arg1 == 13) {
			this.aByte33 = 5;
		} else if (arg1 == 14) {
			this.aByte33 = 2;
			this.anInt1391 = arg0.method5750() * 256;
		} else if (arg1 == 15) {
			this.aByte33 = 3;
			this.anInt1391 = arg0.method5771();
		} else if (arg1 == 16) {
			this.aByte33 = 3;
			this.anInt1391 = arg0.method5804();
		} else {
			@Pc(140) int local140;
			@Pc(150) int local150;
			if (arg1 == 40) {
				local140 = arg0.method5750();
				this.aShortArray17 = new short[local140];
				this.aShortArray16 = new short[local140];
				for (local150 = 0; local150 < local140; local150++) {
					this.aShortArray16[local150] = (short) arg0.method5771();
					this.aShortArray17[local150] = (short) arg0.method5771();
				}
			} else if (arg1 == 41) {
				local140 = arg0.method5750();
				this.aShortArray19 = new short[local140];
				this.aShortArray18 = new short[local140];
				for (local150 = 0; local150 < local140; local150++) {
					this.aShortArray18[local150] = (short) arg0.method5771();
					this.aShortArray19[local150] = (short) arg0.method5771();
				}
			}
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!mo;I)V")
	public void method1222(@OriginalArg(0) Class1_Sub35 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5750();
			if (local5 == 0) {
				return;
			}
			this.method1220(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIILclient!i;ILclient!r;ZIBIILclient!i;Lclient!ln;)Lclient!da;")
	public Class63 method1224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class47 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class134 arg5, @OriginalArg(7) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class47 arg9, @OriginalArg(12) Class211 arg10) {
		return this.method1217(arg8, arg0, arg7, arg9, arg3, arg10, arg5, true, arg2, (byte) 2, arg6, arg1, arg4);
	}
}
