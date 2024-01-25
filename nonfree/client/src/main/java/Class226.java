import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class226 {

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "I")
	public int anInt6965;

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "Lclient!ao;")
	public Class14 aClass14_2;

	@OriginalMember(owner = "client!pp", name = "g", descriptor = "[S")
	private short[] aShortArray87;

	@OriginalMember(owner = "client!pp", name = "j", descriptor = "[S")
	private short[] aShortArray88;

	@OriginalMember(owner = "client!pp", name = "m", descriptor = "[S")
	private short[] aShortArray89;

	@OriginalMember(owner = "client!pp", name = "s", descriptor = "[S")
	private short[] aShortArray90;

	@OriginalMember(owner = "client!pp", name = "t", descriptor = "I")
	private int anInt6974;

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
	public int anInt6964 = -1;

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
	private int anInt6966 = -1;

	@OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
	private int anInt6969 = 128;

	@OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
	private int anInt6971 = 0;

	@OriginalMember(owner = "client!pp", name = "u", descriptor = "I")
	private int anInt6975 = 0;

	@OriginalMember(owner = "client!pp", name = "r", descriptor = "I")
	private int anInt6973 = 0;

	@OriginalMember(owner = "client!pp", name = "q", descriptor = "Z")
	public boolean aBoolean524 = false;

	@OriginalMember(owner = "client!pp", name = "y", descriptor = "B")
	public byte aByte89 = 0;

	@OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
	private int anInt6967 = 128;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILclient!qa;IIIILclient!kca;)Lclient!r;")
	public Class63 method5915(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class157 arg5) {
		return this.method5920(arg4, arg3, null, 0, arg1, 0, arg2, null, arg5, (byte) 5, false, arg0, 0);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!qa;IILclient!kca;Lclient!sa;IZBIIILclient!sa;I)Lclient!r;")
	public Class63 method5916(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class157 arg3, @OriginalArg(4) Class75 arg4, @OriginalArg(5) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class75 arg9, @OriginalArg(12) int arg10) {
		return this.method5920(arg1, arg8, arg4, arg6, arg0, arg10, arg2, arg9, arg3, (byte) 2, true, arg7, arg5);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!qa;IILclient!kca;IBI)Lclient!r;")
	public Class63 method5917(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class157 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		return this.method5920(arg1, arg5, null, 0, arg0, 0, arg2, null, arg3, (byte) 2, false, arg4, 0);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!ps;BI)V")
	private void method5918(@OriginalArg(0) Class2_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6974 = arg0.method5229();
		} else if (arg1 == 2) {
			this.anInt6964 = arg0.method5229();
		} else if (arg1 == 4) {
			this.anInt6967 = arg0.method5229();
		} else if (arg1 == 5) {
			this.anInt6969 = arg0.method5229();
		} else if (arg1 == 6) {
			this.anInt6975 = arg0.method5229();
		} else if (arg1 == 7) {
			this.anInt6971 = arg0.method5170();
		} else if (arg1 == 8) {
			this.anInt6973 = arg0.method5170();
		} else if (arg1 == 9) {
			this.anInt6966 = 8224;
			this.aByte89 = 3;
		} else if (arg1 == 10) {
			this.aBoolean524 = true;
		} else if (arg1 == 11) {
			this.aByte89 = 1;
		} else if (arg1 == 12) {
			this.aByte89 = 4;
		} else if (arg1 == 13) {
			this.aByte89 = 5;
		} else if (arg1 == 14) {
			this.aByte89 = 2;
			this.anInt6966 = arg0.method5170() * 256;
		} else if (arg1 == 15) {
			this.aByte89 = 3;
			this.anInt6966 = arg0.method5229();
		} else if (arg1 == 16) {
			this.aByte89 = 3;
			this.anInt6966 = arg0.method5198();
		} else {
			@Pc(92) int local92;
			@Pc(102) int local102;
			if (arg1 == 40) {
				local92 = arg0.method5170();
				this.aShortArray89 = new short[local92];
				this.aShortArray87 = new short[local92];
				for (local102 = 0; local102 < local92; local102++) {
					this.aShortArray87[local102] = (short) arg0.method5229();
					this.aShortArray89[local102] = (short) arg0.method5229();
				}
			} else if (arg1 == 41) {
				local92 = arg0.method5170();
				this.aShortArray90 = new short[local92];
				this.aShortArray88 = new short[local92];
				for (local102 = 0; local102 < local92; local102++) {
					this.aShortArray90[local102] = (short) arg0.method5229();
					this.aShortArray88[local102] = (short) arg0.method5229();
				}
			}
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BLclient!ps;)V")
	public void method5919(@OriginalArg(1) Class2_Sub29 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5170();
			if (local5 == 0) {
				return;
			}
			this.method5918(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IILclient!sa;ILclient!qa;IILclient!sa;Lclient!kca;BZIIZ)Lclient!r;")
	private Class63 method5920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class75 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class39 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class75 arg7, @OriginalArg(8) Class157 arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		@Pc(7) int local7 = arg0;
		@Pc(22) Class4 local22 = this.anInt6964 == -1 || arg11 == -1 ? null : arg8.method3745(this.anInt6964);
		@Pc(34) boolean local34 = arg10 & this.aByte89 != 0;
		if (local22 != null) {
			local7 = arg0 | local22.method275(false, arg11, arg1);
		}
		if (local34) {
			local7 |= this.aByte89 == 3 ? 7 : 2;
		}
		if (this.anInt6969 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt6967 != 128 || this.anInt6975 != 0) {
			local7 |= 0x5;
		}
		@Pc(90) Class231 local90 = this.aClass14_2.aClass231_5;
		@Pc(110) Class63 local110;
		synchronized (this.aClass14_2.aClass231_5) {
			local110 = (Class63) this.aClass14_2.aClass231_5.method6228((long) (this.anInt6965 |= arg4.anInt7092 << 29));
		}
		if (local110 == null || arg4.method6070(local110.ba(), local7) != 0) {
			if (local110 != null) {
				local7 = arg4.method6028(local7, local110.ba());
			}
			@Pc(137) int local137 = local7;
			if (this.aShortArray87 != null) {
				local137 = local7 | 0x4000;
			}
			if (this.aShortArray90 != null) {
				local137 |= 0x8000;
			}
			@Pc(160) Class29 local160 = Static342.method5377(this.anInt6974, this.aClass14_2.aClass53_6);
			if (local160 == null) {
				return null;
			}
			if (local160.anInt849 < 13) {
				local160.method868();
			}
			local110 = arg4.method6011(local160, local137, this.aClass14_2.anInt465, this.anInt6971 + 64, this.anInt6973 + 850);
			@Pc(193) int local193;
			if (this.aShortArray87 != null) {
				for (local193 = 0; local193 < this.aShortArray87.length; local193++) {
					local110.pa(this.aShortArray87[local193], this.aShortArray89[local193]);
				}
			}
			if (this.aShortArray90 != null) {
				for (local193 = 0; local193 < this.aShortArray90.length; local193++) {
					local110.L(this.aShortArray90[local193], this.aShortArray88[local193]);
				}
			}
			local110.m(local7);
			@Pc(249) Class231 local249 = this.aClass14_2.aClass231_5;
			synchronized (this.aClass14_2.aClass231_5) {
				this.aClass14_2.aClass231_5.method6232(local110, (long) (this.anInt6965 |= arg4.anInt7092 << 29));
			}
		}
		@Pc(293) Class63 local293 = local22 == null ? local110.method7706(arg9, local7, true) : local22.method270(arg6, local110, local7, arg9, arg1, 0, arg11);
		if (this.anInt6967 != 128 || this.anInt6969 != 128) {
			local293.V(this.anInt6967, this.anInt6969, this.anInt6967);
		}
		if (this.anInt6975 != 0) {
			if (this.anInt6975 == 90) {
				local293.OA(4096);
			}
			if (this.anInt6975 == 180) {
				local293.OA(8192);
			}
			if (this.anInt6975 == 270) {
				local293.OA(12288);
			}
		}
		if (local34) {
			local293.RA(this.aByte89, this.anInt6966, arg2, arg7, arg3, arg12, arg5);
		}
		local293.m(arg0);
		return local293;
	}
}
