import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class38 {

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
	private int anInt1002;

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "Lclient!vv;")
	public Class263 aClass263_1;

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
	public int anInt1009;

	@OriginalMember(owner = "client!ci", name = "q", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "B")
	public byte aByte3 = 0;

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
	private int anInt1003 = -1;

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
	private int anInt1004 = 0;

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
	private int anInt1007 = 0;

	@OriginalMember(owner = "client!ci", name = "s", descriptor = "Z")
	public boolean aBoolean50 = false;

	@OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
	private int anInt1013 = 0;

	@OriginalMember(owner = "client!ci", name = "w", descriptor = "I")
	public int anInt1014 = -1;

	@OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
	private int anInt1015 = 128;

	@OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
	private int anInt1008 = 128;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IILclient!jq;ILclient!ya;II)Lclient!t;")
	public Class105 method913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class39 arg4, @OriginalArg(5) int arg5) {
		return this.method919(null, arg3, arg2, arg0, arg4, 0, null, arg1, arg5, 0, false, 0, (byte) 5);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!jq;IIILclient!ta;IZIIILclient!ta;Lclient!ya;I)Lclient!t;")
	public Class105 method914(@OriginalArg(0) Class127 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class149 arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class149 arg8, @OriginalArg(11) Class39 arg9, @OriginalArg(12) int arg10) {
		return this.method919(arg8, arg5, arg0, arg6, arg9, arg7, arg3, arg1, arg10, arg4, true, arg2, (byte) 2);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLclient!hp;I)V")
	private void method915(@OriginalArg(1) Class1_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1002 = arg0.method5362();
		} else if (arg1 == 2) {
			this.anInt1014 = arg0.method5362();
		} else if (arg1 == 4) {
			this.anInt1015 = arg0.method5362();
		} else if (arg1 == 5) {
			this.anInt1008 = arg0.method5362();
		} else if (arg1 == 6) {
			this.anInt1007 = arg0.method5362();
		} else if (arg1 == 7) {
			this.anInt1004 = arg0.method5366();
		} else if (arg1 == 8) {
			this.anInt1013 = arg0.method5366();
		} else if (arg1 == 9) {
			this.aByte3 = 3;
			this.anInt1003 = 8224;
		} else if (arg1 == 10) {
			this.aBoolean50 = true;
		} else if (arg1 == 11) {
			this.aByte3 = 1;
		} else if (arg1 == 12) {
			this.aByte3 = 4;
		} else if (arg1 == 13) {
			this.aByte3 = 5;
		} else if (arg1 == 14) {
			this.aByte3 = 2;
			this.anInt1003 = arg0.method5366() * 256;
		} else if (arg1 == 15) {
			this.aByte3 = 3;
			this.anInt1003 = arg0.method5362();
		} else if (arg1 == 16) {
			this.aByte3 = 3;
			this.anInt1003 = arg0.method5407();
		} else {
			@Pc(139) int local139;
			@Pc(149) int local149;
			if (arg1 == 40) {
				local139 = arg0.method5366();
				this.aShortArray15 = new short[local139];
				this.aShortArray16 = new short[local139];
				for (local149 = 0; local149 < local139; local149++) {
					this.aShortArray15[local149] = (short) arg0.method5362();
					this.aShortArray16[local149] = (short) arg0.method5362();
				}
			} else if (arg1 == 41) {
				local139 = arg0.method5366();
				this.aShortArray14 = new short[local139];
				this.aShortArray17 = new short[local139];
				for (local149 = 0; local149 < local139; local149++) {
					this.aShortArray17[local149] = (short) arg0.method5362();
					this.aShortArray14[local149] = (short) arg0.method5362();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!hp;I)V")
	public void method917(@OriginalArg(0) Class1_Sub5 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method5366();
			if (local7 == 0) {
				return;
			}
			this.method915(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIZIILclient!ya;Lclient!jq;)Lclient!t;")
	public Class105 method918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class39 arg4, @OriginalArg(6) Class127 arg5) {
		return this.method919(null, arg0, arg5, arg1, arg4, 0, null, arg3, arg2, 0, false, 0, (byte) 2);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!ta;ZILclient!jq;ILclient!ya;ILclient!ta;IIIZIB)Lclient!t;")
	private Class105 method919(@OriginalArg(0) Class149 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class127 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class39 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class149 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) int arg11, @OriginalArg(13) byte arg12) {
		@Pc(5) int local5 = arg7;
		@Pc(21) Class223 local21 = this.anInt1014 == -1 || arg1 == -1 ? null : arg2.method2975(this.anInt1014);
		@Pc(33) boolean local33 = arg10 & this.aByte3 != 0;
		if (local21 != null) {
			local5 = arg7 | local21.method5050(arg1, false, arg8);
		}
		if (local33) {
			local5 |= this.aByte3 == 3 ? 7 : 2;
		}
		if (this.anInt1008 != 128) {
			local5 |= 0x2;
		}
		if (this.anInt1015 != 128 || this.anInt1007 != 0) {
			local5 |= 0x5;
		}
		@Pc(83) Class134 local83 = this.aClass263_1.aClass134_58;
		@Pc(103) Class105 local103;
		synchronized (this.aClass263_1.aClass134_58) {
			local103 = (Class105) this.aClass263_1.aClass134_58.method3266((long) (this.anInt1009 |= arg4.anInt5452 << 29));
		}
		if (local103 == null || arg4.method4528(local103.P(), local5) != 0) {
			if (local103 != null) {
				local5 = arg4.method4530(local5, local103.P());
			}
			@Pc(130) int local130 = local5;
			if (this.aShortArray15 != null) {
				local130 = local5 | 0x4000;
			}
			if (this.aShortArray17 != null) {
				local130 |= 0x8000;
			}
			@Pc(153) Class236 local153 = Static74.method1492(this.anInt1002, this.aClass263_1.aClass246_214);
			if (local153 == null) {
				return null;
			}
			if (local153.anInt6297 < 13) {
				local153.method5247();
			}
			local103 = arg4.method4540(local153, local130, this.aClass263_1.anInt7068, this.anInt1004 + 64, this.anInt1013 + 850);
			@Pc(188) int local188;
			if (this.aShortArray15 != null) {
				for (local188 = 0; local188 < this.aShortArray15.length; local188++) {
					local103.BA(this.aShortArray15[local188], this.aShortArray16[local188]);
				}
			}
			if (this.aShortArray17 != null) {
				for (local188 = 0; local188 < this.aShortArray17.length; local188++) {
					local103.I(this.aShortArray17[local188], this.aShortArray14[local188]);
				}
			}
			local103.UA(local5);
			@Pc(242) Class134 local242 = this.aClass263_1.aClass134_58;
			synchronized (this.aClass263_1.aClass134_58) {
				this.aClass263_1.aClass134_58.method3263((long) (this.anInt1009 |= arg4.anInt5452 << 29), local103);
			}
		}
		@Pc(291) Class105 local291 = local21 == null ? local103.method3548(arg12, local5, true) : local21.method5056(local103, 0, arg8, arg12, arg3, local5, arg1);
		if (this.anInt1015 != 128 || this.anInt1008 != 128) {
			local291.H(this.anInt1015, this.anInt1008, this.anInt1015);
		}
		if (this.anInt1007 != 0) {
			if (this.anInt1007 == 90) {
				local291.Q(4096);
			}
			if (this.anInt1007 == 180) {
				local291.Q(8192);
			}
			if (this.anInt1007 == 270) {
				local291.Q(12288);
			}
		}
		if (local33) {
			local291.h(this.aByte3, this.anInt1003, arg0, arg6, arg5, arg9, arg11);
		}
		local291.UA(arg7);
		return local291;
	}
}
