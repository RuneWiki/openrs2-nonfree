import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class50 {

	@OriginalMember(owner = "client!ce", name = "y", descriptor = "[F")
	public static final float[] aFloatArray27 = new float[16384];

	@OriginalMember(owner = "client!ce", name = "x", descriptor = "[F")
	public static final float[] aFloatArray26 = new float[16384];

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!ce", name = "s", descriptor = "Lclient!nb;")
	public Class212 aClass212_1;

	@OriginalMember(owner = "client!ce", name = "z", descriptor = "I")
	private int anInt1441;

	@OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
	public int anInt1443;

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "B")
	public byte aByte29 = 0;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
	private int anInt1426 = 0;

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
	public int anInt1432 = -1;

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
	private int anInt1430 = 128;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
	private int anInt1427 = 0;

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
	private int anInt1434 = -1;

	@OriginalMember(owner = "client!ce", name = "v", descriptor = "I")
	private int anInt1439 = 128;

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
	private int anInt1435 = 0;

	@OriginalMember(owner = "client!ce", name = "r", descriptor = "Z")
	public boolean aBoolean101 = false;

	static {
		@Pc(18) double local18 = 3.834951969714103E-4D;
		for (@Pc(20) int local20 = 0; local20 < 16384; local20++) {
			aFloatArray27[local20] = (float) Math.sin((double) local20 * local18);
			aFloatArray26[local20] = (float) Math.cos(local18 * (double) local20);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!daa;I)V")
	public void method1437(@OriginalArg(0) Class12_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5216();
			if (local5 == 0) {
				return;
			}
			this.method1443(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!sa;IIIIZLclient!sa;IIBILclient!bu;ILclient!qa;)Lclient!r;")
	private Class26 method1438(@OriginalArg(0) Class215 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) Class215 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte arg9, @OriginalArg(11) Class41 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class42 arg12) {
		@Pc(7) int local7 = arg2;
		@Pc(24) Class64 local24 = this.anInt1432 == -1 || arg7 == -1 ? null : arg10.method911(this.anInt1432);
		@Pc(33) boolean local33 = arg5 & this.aByte29 != 0;
		if (local24 != null) {
			local7 = arg2 | local24.method1829(arg4, false, arg7);
		}
		if (local33) {
			local7 |= this.aByte29 == 3 ? 7 : 2;
		}
		if (this.anInt1430 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt1439 != 128 || this.anInt1427 != 0) {
			local7 |= 0x5;
		}
		@Pc(85) Class125 local85 = this.aClass212_1.aClass125_47;
		@Pc(105) Class26 local105;
		synchronized (this.aClass212_1.aClass125_47) {
			local105 = (Class26) this.aClass212_1.aClass125_47.method3446((long) (this.anInt1443 |= arg12.anInt6927 << 29));
		}
		if (local105 == null || arg12.method5857(local105.ba(), local7) != 0) {
			if (local105 != null) {
				local7 = arg12.method5820(local7, local105.ba());
			}
			@Pc(132) int local132 = local7;
			if (this.aShortArray28 != null) {
				local132 = local7 | 0x4000;
			}
			if (this.aShortArray27 != null) {
				local132 |= 0x8000;
			}
			@Pc(155) Class192 local155 = Static510.method7591(this.anInt1441, this.aClass212_1.aClass16_79);
			if (local155 == null) {
				return null;
			}
			if (local155.anInt5552 < 13) {
				local155.method4657();
			}
			local105 = arg12.method5812(local155, local132, this.aClass212_1.anInt6050, this.anInt1426 + 64, this.anInt1435 + 850);
			@Pc(190) int local190;
			if (this.aShortArray28 != null) {
				for (local190 = 0; local190 < this.aShortArray28.length; local190++) {
					local105.pa(this.aShortArray28[local190], this.aShortArray25[local190]);
				}
			}
			if (this.aShortArray27 != null) {
				for (local190 = 0; local190 < this.aShortArray27.length; local190++) {
					local105.L(this.aShortArray27[local190], this.aShortArray26[local190]);
				}
			}
			local105.m(local7);
			@Pc(242) Class125 local242 = this.aClass212_1.aClass125_47;
			synchronized (this.aClass212_1.aClass125_47) {
				this.aClass212_1.aClass125_47.method3437(local105, (long) (this.anInt1443 |= arg12.anInt6927 << 29));
			}
		}
		@Pc(286) Class26 local286 = local24 == null ? local105.method7992(arg9, local7, true) : local24.method1834(local105, arg9, arg4, 0, local7, arg7, arg1);
		if (this.anInt1439 != 128 || this.anInt1430 != 128) {
			local286.V(this.anInt1439, this.anInt1430, this.anInt1439);
		}
		if (this.anInt1427 != 0) {
			if (this.anInt1427 == 90) {
				local286.OA(4096);
			}
			if (this.anInt1427 == 180) {
				local286.OA(8192);
			}
			if (this.anInt1427 == 270) {
				local286.OA(12288);
			}
		}
		if (local33) {
			local286.RA(this.aByte29, this.anInt1434, arg6, arg0, arg8, arg11, arg3);
		}
		local286.m(arg2);
		return local286;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!qa;IIILclient!bu;I)Lclient!r;")
	public Class26 method1439(@OriginalArg(0) int arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class41 arg4, @OriginalArg(6) int arg5) {
		return this.method1438(null, arg3, arg2, 0, arg5, false, null, arg0, 0, (byte) 5, arg4, 0, arg1);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BIIILclient!bu;Lclient!qa;I)Lclient!r;")
	public Class26 method1440(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class41 arg3, @OriginalArg(5) Class42 arg4, @OriginalArg(6) int arg5) {
		return this.method1438(null, arg0, arg1, 0, arg5, false, null, arg2, 0, (byte) 2, arg3, 0, arg4);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IILclient!qa;IIBILclient!bu;Lclient!sa;ILclient!sa;ZI)Lclient!r;")
	public Class26 method1441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class41 arg6, @OriginalArg(8) Class215 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class215 arg9, @OriginalArg(12) int arg10) {
		return this.method1438(arg7, arg4, arg5, arg1, arg10, true, arg9, arg3, arg8, (byte) 2, arg6, arg0, arg2);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!daa;IB)V")
	private void method1443(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1441 = arg0.method5199();
		} else if (arg1 == 2) {
			this.anInt1432 = arg0.method5199();
		} else if (arg1 == 4) {
			this.anInt1439 = arg0.method5199();
		} else if (arg1 == 5) {
			this.anInt1430 = arg0.method5199();
		} else if (arg1 == 6) {
			this.anInt1427 = arg0.method5199();
		} else if (arg1 == 7) {
			this.anInt1426 = arg0.method5216();
		} else if (arg1 == 8) {
			this.anInt1435 = arg0.method5216();
		} else if (arg1 == 9) {
			this.aByte29 = 3;
			this.anInt1434 = 8224;
		} else if (arg1 == 10) {
			this.aBoolean101 = true;
		} else if (arg1 == 11) {
			this.aByte29 = 1;
		} else if (arg1 == 12) {
			this.aByte29 = 4;
		} else if (arg1 == 13) {
			this.aByte29 = 5;
		} else if (arg1 == 14) {
			this.aByte29 = 2;
			this.anInt1434 = arg0.method5216() * 256;
		} else if (arg1 == 15) {
			this.aByte29 = 3;
			this.anInt1434 = arg0.method5199();
		} else if (arg1 == 16) {
			this.aByte29 = 3;
			this.anInt1434 = arg0.method5225();
		} else {
			@Pc(122) int local122;
			@Pc(132) int local132;
			if (arg1 == 40) {
				local122 = arg0.method5216();
				this.aShortArray28 = new short[local122];
				this.aShortArray25 = new short[local122];
				for (local132 = 0; local132 < local122; local132++) {
					this.aShortArray28[local132] = (short) arg0.method5199();
					this.aShortArray25[local132] = (short) arg0.method5199();
				}
			} else if (arg1 == 41) {
				local122 = arg0.method5216();
				this.aShortArray26 = new short[local122];
				this.aShortArray27 = new short[local122];
				for (local132 = 0; local132 < local122; local132++) {
					this.aShortArray27[local132] = (short) arg0.method5199();
					this.aShortArray26[local132] = (short) arg0.method5199();
				}
			}
		}
	}
}
