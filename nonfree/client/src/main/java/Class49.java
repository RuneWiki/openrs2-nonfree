import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cba")
public final class Class49 {

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!cba", name = "h", descriptor = "I")
	private int anInt1452;

	@OriginalMember(owner = "client!cba", name = "j", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!cba", name = "k", descriptor = "I")
	public int anInt1454;

	@OriginalMember(owner = "client!cba", name = "o", descriptor = "Lclient!gw;")
	public Class132 aClass132_1;

	@OriginalMember(owner = "client!cba", name = "t", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!cba", name = "x", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "I")
	private int anInt1447 = 0;

	@OriginalMember(owner = "client!cba", name = "d", descriptor = "I")
	private int anInt1448 = 0;

	@OriginalMember(owner = "client!cba", name = "n", descriptor = "I")
	private int anInt1457 = 0;

	@OriginalMember(owner = "client!cba", name = "u", descriptor = "Z")
	public boolean aBoolean119 = false;

	@OriginalMember(owner = "client!cba", name = "w", descriptor = "I")
	private int anInt1462 = 128;

	@OriginalMember(owner = "client!cba", name = "e", descriptor = "I")
	private int anInt1449 = 128;

	@OriginalMember(owner = "client!cba", name = "v", descriptor = "I")
	private int anInt1461 = -1;

	@OriginalMember(owner = "client!cba", name = "r", descriptor = "I")
	public int anInt1459 = -1;

	@OriginalMember(owner = "client!cba", name = "p", descriptor = "B")
	public byte aByte14 = 0;

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(ILclient!ek;)V")
	public void method1281(@OriginalArg(1) Class4_Sub13 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method7004();
			if (local13 == 0) {
				return;
			}
			this.method1286(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IILclient!oq;ILclient!r;II)Lclient!da;")
	public Class65 method1282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class7 arg4, @OriginalArg(5) int arg5) {
		return this.method1288(0, arg5, arg4, arg0, null, (byte) 2, null, 0, arg2, 0, arg1, false, arg3);
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IILclient!i;Lclient!i;BIILclient!oq;IIZLclient!r;I)Lclient!da;")
	public Class65 method1284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class115 arg2, @OriginalArg(3) Class115 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class254 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(11) Class7 arg9, @OriginalArg(12) int arg10) {
		return this.method1288(arg5, arg7, arg9, arg4, arg3, (byte) 2, arg2, arg8, arg6, arg0, arg10, true, arg1);
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIBILclient!oq;ILclient!r;)Lclient!da;")
	public Class65 method1285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class254 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class7 arg5) {
		return this.method1288(0, arg1, arg5, arg0, null, (byte) 5, null, 0, arg3, 0, arg4, false, arg2);
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IBLclient!ek;)V")
	private void method1286(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt1452 = arg1.method7054();
		} else if (arg0 == 2) {
			this.anInt1459 = arg1.method7054();
		} else if (arg0 == 4) {
			this.anInt1462 = arg1.method7054();
		} else if (arg0 == 5) {
			this.anInt1449 = arg1.method7054();
		} else if (arg0 == 6) {
			this.anInt1447 = arg1.method7054();
		} else if (arg0 == 7) {
			this.anInt1448 = arg1.method7004();
		} else if (arg0 == 8) {
			this.anInt1457 = arg1.method7004();
		} else if (arg0 == 9) {
			this.anInt1461 = 8224;
			this.aByte14 = 3;
		} else if (arg0 == 10) {
			this.aBoolean119 = true;
		} else if (arg0 == 11) {
			this.aByte14 = 1;
		} else if (arg0 == 12) {
			this.aByte14 = 4;
		} else if (arg0 == 13) {
			this.aByte14 = 5;
		} else if (arg0 == 14) {
			this.aByte14 = 2;
			this.anInt1461 = arg1.method7004() * 256;
		} else if (arg0 == 15) {
			this.aByte14 = 3;
			this.anInt1461 = arg1.method7054();
		} else if (arg0 == 16) {
			this.aByte14 = 3;
			this.anInt1461 = arg1.method6990();
		} else {
			@Pc(136) int local136;
			@Pc(146) int local146;
			if (arg0 == 40) {
				local136 = arg1.method7004();
				this.aShortArray1 = new short[local136];
				this.aShortArray4 = new short[local136];
				for (local146 = 0; local146 < local136; local146++) {
					this.aShortArray4[local146] = (short) arg1.method7054();
					this.aShortArray1[local146] = (short) arg1.method7054();
				}
				return;
			}
			if (arg0 == 41) {
				local136 = arg1.method7004();
				this.aShortArray3 = new short[local136];
				this.aShortArray2 = new short[local136];
				for (local146 = 0; local146 < local136; local146++) {
					this.aShortArray2[local146] = (short) arg1.method7054();
					this.aShortArray3[local146] = (short) arg1.method7054();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IILclient!r;ILclient!i;BILclient!i;ILclient!oq;IIZI)Lclient!da;")
	private Class65 method1288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class115 arg4, @OriginalArg(5) byte arg5, @OriginalArg(7) Class115 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class254 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean arg11, @OriginalArg(13) int arg12) {
		@Pc(7) int local7 = arg10;
		@Pc(22) Class111 local22 = this.anInt1459 == -1 || arg3 == -1 ? null : arg8.method5936(this.anInt1459);
		@Pc(34) boolean local34 = arg11 & this.aByte14 != 0;
		if (local22 != null) {
			local7 = arg10 | local22.method2551(arg1, arg3, false);
		}
		if (local34) {
			local7 |= this.aByte14 == 3 ? 7 : 2;
		}
		if (this.anInt1449 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt1462 != 128 || this.anInt1447 != 0) {
			local7 |= 0x5;
		}
		@Pc(92) Class167 local92 = this.aClass132_1.aClass167_14;
		@Pc(112) Class65 local112;
		synchronized (this.aClass132_1.aClass167_14) {
			local112 = (Class65) this.aClass132_1.aClass167_14.method3966((long) (this.anInt1454 |= arg2.anInt10078 << 29));
		}
		if (local112 == null || arg2.method7793(local112.PA(), local7) != 0) {
			if (local112 != null) {
				local7 = arg2.method7778(local7, local112.PA());
			}
			@Pc(136) int local136 = local7;
			if (this.aShortArray4 != null) {
				local136 = local7 | 0x4000;
			}
			if (this.aShortArray2 != null) {
				local136 |= 0x8000;
			}
			@Pc(159) Class59 local159 = Static485.method7071(this.aClass132_1.aClass348_46, this.anInt1452);
			if (local159 == null) {
				return null;
			}
			if (local159.anInt1895 < 13) {
				local159.method1588();
			}
			local112 = arg2.method7828(local159, local136, this.aClass132_1.anInt3763, this.anInt1448 + 64, this.anInt1457 + 850);
			@Pc(192) int local192;
			if (this.aShortArray4 != null) {
				for (local192 = 0; local192 < this.aShortArray4.length; local192++) {
					local112.d(this.aShortArray4[local192], this.aShortArray1[local192]);
				}
			}
			if (this.aShortArray2 != null) {
				for (local192 = 0; local192 < this.aShortArray2.length; local192++) {
					local112.DA(this.aShortArray2[local192], this.aShortArray3[local192]);
				}
			}
			local112.SA(local7);
			@Pc(244) Class167 local244 = this.aClass132_1.aClass167_14;
			synchronized (this.aClass132_1.aClass167_14) {
				this.aClass132_1.aClass167_14.method3974((long) (this.anInt1454 |= arg2.anInt10078 << 29), local112);
			}
		}
		@Pc(288) Class65 local288 = local22 == null ? local112.method7682(arg5, local7, true) : local22.method2548(arg12, local112, arg5, arg3, local7, 0, arg1);
		if (this.anInt1462 != 128 || this.anInt1449 != 128) {
			local288.R(this.anInt1462, this.anInt1449, this.anInt1462);
		}
		if (this.anInt1447 != 0) {
			if (this.anInt1447 == 90) {
				local288.M(4096);
			}
			if (this.anInt1447 == 180) {
				local288.M(8192);
			}
			if (this.anInt1447 == 270) {
				local288.M(12288);
			}
		}
		if (local34) {
			local288.ba(this.aByte14, this.anInt1461, arg6, arg4, arg7, arg9, arg0);
		}
		local288.SA(arg10);
		return local288;
	}
}
