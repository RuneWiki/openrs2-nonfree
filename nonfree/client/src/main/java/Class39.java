import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class39 {

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "I")
	public int anInt1046;

	@OriginalMember(owner = "client!bq", name = "d", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!bq", name = "h", descriptor = "Lclient!io;")
	public Class155 aClass155_1;

	@OriginalMember(owner = "client!bq", name = "s", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!bq", name = "t", descriptor = "I")
	private int anInt1055;

	@OriginalMember(owner = "client!bq", name = "A", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
	private int anInt1045 = -1;

	@OriginalMember(owner = "client!bq", name = "j", descriptor = "Z")
	public boolean aBoolean74 = false;

	@OriginalMember(owner = "client!bq", name = "l", descriptor = "B")
	public byte aByte22 = 0;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
	public int anInt1044 = -1;

	@OriginalMember(owner = "client!bq", name = "u", descriptor = "I")
	private int anInt1056 = 128;

	@OriginalMember(owner = "client!bq", name = "k", descriptor = "I")
	private int anInt1049 = 0;

	@OriginalMember(owner = "client!bq", name = "B", descriptor = "I")
	private int anInt1062 = 0;

	@OriginalMember(owner = "client!bq", name = "y", descriptor = "I")
	private int anInt1060 = 128;

	@OriginalMember(owner = "client!bq", name = "z", descriptor = "I")
	private int anInt1061 = 0;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ILclient!jn;ZLclient!ha;IIIILclient!s;IILclient!s;I)Lclient!ka;")
	public Class182 method812(@OriginalArg(0) int arg0, @OriginalArg(1) Class173 arg1, @OriginalArg(3) Class95 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class76 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class76 arg9, @OriginalArg(12) int arg10) {
		return this.method818(arg1, arg2, arg10, arg0, arg9, (byte) 2, arg5, arg6, true, arg7, arg8, arg3, arg4);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!vj;IB)V")
	private void method815(@OriginalArg(0) Class2_Sub22 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1055 = arg0.method8546();
		} else if (arg1 == 2) {
			this.anInt1044 = arg0.method8546();
		} else if (arg1 == 4) {
			this.anInt1056 = arg0.method8546();
		} else if (arg1 == 5) {
			this.anInt1060 = arg0.method8546();
		} else if (arg1 == 6) {
			this.anInt1062 = arg0.method8546();
		} else if (arg1 == 7) {
			this.anInt1061 = arg0.method8547();
		} else if (arg1 == 8) {
			this.anInt1049 = arg0.method8547();
		} else if (arg1 == 9) {
			this.aByte22 = 3;
			this.anInt1045 = 8224;
		} else if (arg1 == 10) {
			this.aBoolean74 = true;
		} else if (arg1 == 11) {
			this.aByte22 = 1;
		} else if (arg1 == 12) {
			this.aByte22 = 4;
		} else if (arg1 == 13) {
			this.aByte22 = 5;
		} else if (arg1 == 14) {
			this.aByte22 = 2;
			this.anInt1045 = arg0.method8547() * 256;
		} else if (arg1 == 15) {
			this.aByte22 = 3;
			this.anInt1045 = arg0.method8546();
		} else if (arg1 == 16) {
			this.aByte22 = 3;
			this.anInt1045 = arg0.method8542();
		} else {
			@Pc(139) int local139;
			@Pc(149) int local149;
			if (arg1 == 40) {
				local139 = arg0.method8547();
				this.aShortArray13 = new short[local139];
				this.aShortArray14 = new short[local139];
				for (local149 = 0; local149 < local139; local149++) {
					this.aShortArray14[local149] = (short) arg0.method8546();
					this.aShortArray13[local149] = (short) arg0.method8546();
				}
			} else if (arg1 == 41) {
				local139 = arg0.method8547();
				this.aShortArray12 = new short[local139];
				this.aShortArray11 = new short[local139];
				for (local149 = 0; local149 < local139; local149++) {
					this.aShortArray12[local149] = (short) arg0.method8546();
					this.aShortArray11[local149] = (short) arg0.method8546();
				}
			}
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!ha;ILclient!jn;IIII)Lclient!ka;")
	public Class182 method816(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class173 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return this.method818(arg2, arg0, 0, arg1, null, (byte) 2, 0, null, false, arg4, arg5, arg3, 0);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!vj;I)V")
	public void method817(@OriginalArg(0) Class2_Sub22 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method8547();
			if (local15 == 0) {
				return;
			}
			this.method815(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!jn;Lclient!ha;IILclient!s;BILclient!s;ZIIIII)Lclient!ka;")
	private Class182 method818(@OriginalArg(0) Class173 arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class76 arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class76 arg7, @OriginalArg(8) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(7) int local7 = arg11;
		@Pc(23) Class81 local23 = this.anInt1044 == -1 || arg3 == -1 ? null : arg0.method3791(this.anInt1044);
		@Pc(35) boolean local35 = arg8 & this.aByte22 != 0;
		if (local23 != null) {
			local7 = arg11 | local23.method1751(false, arg9, arg3);
		}
		if (local35) {
			local7 |= this.aByte22 == 3 ? 7 : 2;
		}
		if (this.anInt1060 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt1056 != 128 || this.anInt1062 != 0) {
			local7 |= 0x5;
		}
		@Pc(83) Class32 local83 = this.aClass155_1.aClass32_41;
		@Pc(105) Class182 local105;
		synchronized (this.aClass155_1.aClass32_41) {
			local105 = (Class182) this.aClass155_1.aClass32_41.method630((long) (this.anInt1046 |= arg1.anInt8154 << 29));
		}
		if (local105 == null || arg1.method6963(local105.ua(), local7) != 0) {
			if (local105 != null) {
				local7 = arg1.method7005(local7, local105.ua());
			}
			@Pc(132) int local132 = local7;
			if (this.aShortArray14 != null) {
				local132 = local7 | 0x4000;
			}
			if (this.aShortArray12 != null) {
				local132 |= 0x8000;
			}
			@Pc(157) Class186 local157 = Static439.method6023(this.aClass155_1.aClass380_59, this.anInt1055);
			if (local157 == null) {
				return null;
			}
			if (local157.anInt4702 < 13) {
				local157.method3992();
			}
			local105 = arg1.method6938(local157, local132, this.aClass155_1.anInt3929, this.anInt1061 + 64, this.anInt1049 + 850);
			@Pc(192) int local192;
			if (this.aShortArray14 != null) {
				for (local192 = 0; local192 < this.aShortArray14.length; local192++) {
					local105.ia(this.aShortArray14[local192], this.aShortArray13[local192]);
				}
			}
			if (this.aShortArray12 != null) {
				for (local192 = 0; local192 < this.aShortArray12.length; local192++) {
					local105.aa(this.aShortArray12[local192], this.aShortArray11[local192]);
				}
			}
			local105.s(local7);
			@Pc(244) Class32 local244 = this.aClass155_1.aClass32_41;
			synchronized (this.aClass155_1.aClass32_41) {
				this.aClass155_1.aClass32_41.method629(local105, (long) (this.anInt1046 |= arg1.anInt8154 << 29));
			}
		}
		@Pc(288) Class182 local288 = local23 == null ? local105.method6208(arg5, local7, true) : local23.method1750(0, local7, arg3, arg10, arg5, arg9, local105);
		if (this.anInt1056 != 128 || this.anInt1060 != 128) {
			local288.O(this.anInt1056, this.anInt1060, this.anInt1056);
		}
		if (this.anInt1062 != 0) {
			if (this.anInt1062 == 90) {
				local288.a(4096);
			}
			if (this.anInt1062 == 180) {
				local288.a(8192);
			}
			if (this.anInt1062 == 270) {
				local288.a(12288);
			}
		}
		if (local35) {
			local288.p(this.aByte22, this.anInt1045, arg4, arg7, arg12, arg2, arg6);
		}
		local288.s(arg11);
		return local288;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!ha;IIBILclient!jn;I)Lclient!ka;")
	public Class182 method819(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class173 arg4, @OriginalArg(6) int arg5) {
		return this.method818(arg4, arg0, 0, arg1, null, (byte) 5, 0, null, false, arg5, arg2, arg3, 0);
	}
}
