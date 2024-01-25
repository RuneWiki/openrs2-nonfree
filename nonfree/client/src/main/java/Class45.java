import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cw")
public final class Class45 {

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!cw", name = "i", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!cw", name = "l", descriptor = "I")
	private int anInt1314;

	@OriginalMember(owner = "client!cw", name = "m", descriptor = "Lclient!ii;")
	public Class115 aClass115_1;

	@OriginalMember(owner = "client!cw", name = "x", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!cw", name = "A", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!cw", name = "B", descriptor = "I")
	public int anInt1322;

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
	private int anInt1306 = 128;

	@OriginalMember(owner = "client!cw", name = "k", descriptor = "I")
	private int anInt1313 = -1;

	@OriginalMember(owner = "client!cw", name = "e", descriptor = "I")
	private int anInt1308 = 128;

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
	private int anInt1307 = 0;

	@OriginalMember(owner = "client!cw", name = "o", descriptor = "I")
	private int anInt1315 = 0;

	@OriginalMember(owner = "client!cw", name = "y", descriptor = "B")
	public byte aByte7 = 0;

	@OriginalMember(owner = "client!cw", name = "d", descriptor = "Z")
	public boolean aBoolean62 = false;

	@OriginalMember(owner = "client!cw", name = "s", descriptor = "I")
	private int anInt1318 = 0;

	@OriginalMember(owner = "client!cw", name = "q", descriptor = "I")
	public int anInt1316 = -1;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILclient!qa;Lclient!na;BZLclient!na;IIIILclient!bk;II)Lclient!c;")
	public Class37 method1102(@OriginalArg(0) int arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) Class136 arg2, @OriginalArg(5) Class136 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class28 arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10) {
		return this.method1109(arg10, arg3, arg0, arg5, arg7, arg4, arg1, arg8, (byte) 2, arg2, true, arg9, arg6);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IZLclient!lh;)V")
	private void method1103(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		if (arg0 == 1) {
			this.anInt1314 = arg1.method4093();
		} else if (arg0 == 2) {
			this.anInt1316 = arg1.method4093();
		} else if (arg0 == 4) {
			this.anInt1308 = arg1.method4093();
		} else if (arg0 == 5) {
			this.anInt1306 = arg1.method4093();
		} else if (arg0 == 6) {
			this.anInt1318 = arg1.method4093();
		} else if (arg0 == 7) {
			this.anInt1315 = arg1.method4130();
		} else if (arg0 == 8) {
			this.anInt1307 = arg1.method4130();
		} else if (arg0 == 9) {
			this.aByte7 = 3;
			this.anInt1313 = 8224;
		} else if (arg0 == 10) {
			this.aBoolean62 = true;
		} else if (arg0 == 11) {
			this.aByte7 = 1;
		} else if (arg0 == 12) {
			this.aByte7 = 4;
		} else if (arg0 == 13) {
			this.aByte7 = 5;
		} else if (arg0 == 14) {
			this.aByte7 = 2;
			this.anInt1313 = arg1.method4130() * 256;
		} else if (arg0 == 15) {
			this.aByte7 = 3;
			this.anInt1313 = arg1.method4093();
		} else if (arg0 == 16) {
			this.aByte7 = 3;
			this.anInt1313 = arg1.method4087();
		} else {
			@Pc(111) int local111;
			@Pc(121) int local121;
			if (arg0 == 40) {
				local111 = arg1.method4130();
				this.aShortArray14 = new short[local111];
				this.aShortArray15 = new short[local111];
				for (local121 = 0; local121 < local111; local121++) {
					this.aShortArray15[local121] = (short) arg1.method4093();
					this.aShortArray14[local121] = (short) arg1.method4093();
				}
			} else if (arg0 == 41) {
				local111 = arg1.method4130();
				this.aShortArray13 = new short[local111];
				this.aShortArray16 = new short[local111];
				for (local121 = 0; local121 < local111; local121++) {
					this.aShortArray13[local121] = (short) arg1.method4093();
					this.aShortArray16[local121] = (short) arg1.method4093();
				}
			}
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIILclient!bk;IILclient!qa;)Lclient!c;")
	public Class37 method1104(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class28 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class109 arg5) {
		return this.method1109(0, null, arg1, arg3, arg0, arg4, arg5, arg2, (byte) 2, null, false, 0, 0);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILclient!lh;)V")
	public void method1105(@OriginalArg(1) Class1_Sub1 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method4130();
			if (local7 == 0) {
				return;
			}
			this.method1103(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!bk;BILclient!qa;III)Lclient!c;")
	public Class37 method1106(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class109 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return this.method1109(0, null, arg5, arg3, arg4, arg1, arg2, arg0, (byte) 5, null, false, 0, 0);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILclient!na;IIIIILclient!qa;Lclient!bk;BLclient!na;ZII)Lclient!c;")
	private Class37 method1109(@OriginalArg(0) int arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class109 arg6, @OriginalArg(8) Class28 arg7, @OriginalArg(9) byte arg8, @OriginalArg(10) Class136 arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(7) int local7 = arg5;
		@Pc(23) Class191 local23 = this.anInt1316 == -1 || arg3 == -1 ? null : arg7.method567(this.anInt1316);
		@Pc(32) boolean local32 = arg10 & this.aByte7 != 0;
		if (local23 != null) {
			local7 = arg5 | local23.method4612(false, arg2, arg3);
		}
		if (local32) {
			local7 |= this.aByte7 == 3 ? 7 : 2;
		}
		if (this.anInt1306 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt1308 != 128 || this.anInt1318 != 0) {
			local7 |= 0x5;
		}
		@Pc(83) Class83 local83 = this.aClass115_1.aClass83_28;
		@Pc(103) Class37 local103;
		synchronized (this.aClass115_1.aClass83_28) {
			local103 = (Class37) this.aClass115_1.aClass83_28.method1658((long) (this.anInt1322 |= arg6.anInt5850 << 29));
		}
		if (local103 == null || arg6.method4710(local103.n(), local7) != 0) {
			if (local103 != null) {
				local7 = arg6.method4699(local7, local103.n());
			}
			@Pc(130) int local130 = local7;
			if (this.aShortArray15 != null) {
				local130 = local7 | 0x4000;
			}
			if (this.aShortArray13 != null) {
				local130 |= 0x8000;
			}
			@Pc(153) Class264 local153 = Static358.method4932(this.aClass115_1.aClass250_37, this.anInt1314);
			if (local153 == null) {
				return null;
			}
			if (local153.anInt7617 < 13) {
				local153.method5909();
			}
			local103 = arg6.method4697(local153, local130, this.aClass115_1.anInt3175, this.anInt1315 + 64, this.anInt1307 + 850);
			@Pc(188) int local188;
			if (this.aShortArray15 != null) {
				for (local188 = 0; local188 < this.aShortArray15.length; local188++) {
					local103.N(this.aShortArray15[local188], this.aShortArray14[local188]);
				}
			}
			if (this.aShortArray13 != null) {
				for (local188 = 0; local188 < this.aShortArray13.length; local188++) {
					local103.YA(this.aShortArray13[local188], this.aShortArray16[local188]);
				}
			}
			local103.u(local7);
			@Pc(244) Class83 local244 = this.aClass115_1.aClass83_28;
			synchronized (this.aClass115_1.aClass83_28) {
				this.aClass115_1.aClass83_28.method1675((long) (this.anInt1322 |= arg6.anInt5850 << 29), local103);
			}
		}
		@Pc(288) Class37 local288 = local23 == null ? local103.method4221(arg8, local7, true) : local23.method4615(arg8, arg3, local103, local7, arg4, 0, arg2);
		if (this.anInt1308 != 128 || this.anInt1306 != 128) {
			local288.XA(this.anInt1308, this.anInt1306, this.anInt1308);
		}
		if (this.anInt1318 != 0) {
			if (this.anInt1318 == 90) {
				local288.k(4096);
			}
			if (this.anInt1318 == 180) {
				local288.k(8192);
			}
			if (this.anInt1318 == 270) {
				local288.k(12288);
			}
		}
		if (local32) {
			local288.ea(this.aByte7, this.anInt1313, arg9, arg1, arg0, arg11, arg12);
		}
		local288.u(arg5);
		return local288;
	}
}
