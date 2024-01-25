import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class145 {

	@OriginalMember(owner = "client!hq", name = "i", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!hq", name = "j", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!hq", name = "o", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!hq", name = "p", descriptor = "I")
	public int anInt4233;

	@OriginalMember(owner = "client!hq", name = "r", descriptor = "[S")
	private short[] aShortArray68;

	@OriginalMember(owner = "client!hq", name = "v", descriptor = "Lclient!dea;")
	public Class68 aClass68_1;

	@OriginalMember(owner = "client!hq", name = "y", descriptor = "I")
	private int anInt4238;

	@OriginalMember(owner = "client!hq", name = "g", descriptor = "I")
	private int anInt4227 = 128;

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "I")
	private int anInt4225 = -1;

	@OriginalMember(owner = "client!hq", name = "q", descriptor = "Z")
	public boolean aBoolean288 = false;

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
	public int anInt4224 = -1;

	@OriginalMember(owner = "client!hq", name = "l", descriptor = "I")
	private int anInt4230 = 0;

	@OriginalMember(owner = "client!hq", name = "z", descriptor = "I")
	private int anInt4239 = 128;

	@OriginalMember(owner = "client!hq", name = "t", descriptor = "B")
	public byte aByte63 = 0;

	@OriginalMember(owner = "client!hq", name = "A", descriptor = "I")
	private int anInt4240 = 0;

	@OriginalMember(owner = "client!hq", name = "h", descriptor = "I")
	private int anInt4228 = 0;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IBLclient!nc;IILclient!ha;I)Lclient!ka;")
	public Class17 method3711(@OriginalArg(0) int arg0, @OriginalArg(2) Class227 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class5 arg4, @OriginalArg(6) int arg5) {
		return this.method3713(0, 0, arg2, arg5, arg4, null, arg0, false, (byte) 2, arg1, 0, null, arg3);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!nc;IILclient!ha;BZILclient!s;IILclient!s;II)Lclient!ka;")
	public Class17 method3712(@OriginalArg(0) Class227 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class5 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class51 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class51 arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10) {
		return this.method3713(arg6, arg2, arg9, arg1, arg3, arg5, arg10, true, (byte) 2, arg0, arg4, arg8, arg7);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIILclient!ha;Lclient!s;IZBLclient!nc;IILclient!s;I)Lclient!ka;")
	private Class17 method3713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(5) Class51 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) Class227 arg9, @OriginalArg(10) int arg10, @OriginalArg(12) Class51 arg11, @OriginalArg(13) int arg12) {
		@Pc(7) int local7 = arg12;
		@Pc(23) Class361 local23 = this.anInt4224 == -1 || arg6 == -1 ? null : arg9.method5968(this.anInt4224);
		@Pc(35) boolean local35 = arg7 & this.aByte63 != 0;
		if (local23 != null) {
			local7 = arg12 | local23.method8452(arg3, false, arg6);
		}
		if (local35) {
			local7 |= this.aByte63 == 3 ? 7 : 2;
		}
		if (this.anInt4227 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt4239 != 128 || this.anInt4228 != 0) {
			local7 |= 0x5;
		}
		@Pc(85) Class102 local85 = this.aClass68_1.aClass102_13;
		@Pc(107) Class17 local107;
		synchronized (this.aClass68_1.aClass102_13) {
			local107 = (Class17) this.aClass68_1.aClass102_13.method2677((long) (this.anInt4233 |= arg4.anInt8747 << 29));
		}
		if (local107 == null || arg4.method7541(local107.ua(), local7) != 0) {
			if (local107 != null) {
				local7 = arg4.method7501(local7, local107.ua());
			}
			@Pc(134) int local134 = local7;
			if (this.aShortArray66 != null) {
				local134 = local7 | 0x4000;
			}
			if (this.aShortArray67 != null) {
				local134 |= 0x8000;
			}
			@Pc(157) Class118 local157 = Static330.method5390(this.aClass68_1.aClass196_28, this.anInt4238);
			if (local157 == null) {
				return null;
			}
			if (local157.anInt3246 < 13) {
				local157.method2926();
			}
			local107 = arg4.method7490(local157, local134, this.aClass68_1.anInt2206, this.anInt4240 + 64, this.anInt4230 + 850);
			@Pc(192) int local192;
			if (this.aShortArray66 != null) {
				for (local192 = 0; local192 < this.aShortArray66.length; local192++) {
					local107.ia(this.aShortArray66[local192], this.aShortArray65[local192]);
				}
			}
			if (this.aShortArray67 != null) {
				for (local192 = 0; local192 < this.aShortArray67.length; local192++) {
					local107.aa(this.aShortArray67[local192], this.aShortArray68[local192]);
				}
			}
			local107.s(local7);
			@Pc(240) Class102 local240 = this.aClass68_1.aClass102_13;
			synchronized (this.aClass68_1.aClass102_13) {
				this.aClass68_1.aClass102_13.method2674((long) (this.anInt4233 |= arg4.anInt8747 << 29), local107);
			}
		}
		@Pc(284) Class17 local284 = local23 == null ? local107.method5409(arg8, local7, true) : local23.method8447(arg6, arg3, arg2, local107, 0, arg8, local7);
		if (this.anInt4239 != 128 || this.anInt4227 != 128) {
			local284.O(this.anInt4239, this.anInt4227, this.anInt4239);
		}
		if (this.anInt4228 != 0) {
			if (this.anInt4228 == 90) {
				local284.a(4096);
			}
			if (this.anInt4228 == 180) {
				local284.a(8192);
			}
			if (this.anInt4228 == 270) {
				local284.a(12288);
			}
		}
		if (local35) {
			local284.p(this.aByte63, this.anInt4225, arg5, arg11, arg0, arg10, arg1);
		}
		local284.s(arg12);
		return local284;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!sl;Z)V")
	public void method3715(@OriginalArg(0) Class3_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4225();
			if (local5 == 0) {
				return;
			}
			this.method3718(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIBILclient!nc;Lclient!ha;)Lclient!ka;")
	public Class17 method3716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class227 arg4, @OriginalArg(6) Class5 arg5) {
		return this.method3713(0, 0, arg0, arg3, arg5, null, arg2, false, (byte) 5, arg4, 0, null, arg1);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BILclient!sl;)V")
	private void method3718(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt4238 = arg1.method4221();
		} else if (arg0 == 2) {
			this.anInt4224 = arg1.method4221();
		} else if (arg0 == 4) {
			this.anInt4239 = arg1.method4221();
		} else if (arg0 == 5) {
			this.anInt4227 = arg1.method4221();
		} else if (arg0 == 6) {
			this.anInt4228 = arg1.method4221();
		} else if (arg0 == 7) {
			this.anInt4240 = arg1.method4225();
		} else if (arg0 == 8) {
			this.anInt4230 = arg1.method4225();
		} else if (arg0 == 9) {
			this.anInt4225 = 8224;
			this.aByte63 = 3;
		} else if (arg0 == 10) {
			this.aBoolean288 = true;
		} else if (arg0 == 11) {
			this.aByte63 = 1;
		} else if (arg0 == 12) {
			this.aByte63 = 4;
		} else if (arg0 == 13) {
			this.aByte63 = 5;
		} else if (arg0 == 14) {
			this.aByte63 = 2;
			this.anInt4225 = arg1.method4225() * 256;
		} else if (arg0 == 15) {
			this.aByte63 = 3;
			this.anInt4225 = arg1.method4221();
		} else if (arg0 == 16) {
			this.aByte63 = 3;
			this.anInt4225 = arg1.method4207();
		} else {
			@Pc(128) int local128;
			@Pc(138) int local138;
			if (arg0 == 40) {
				local128 = arg1.method4225();
				this.aShortArray66 = new short[local128];
				this.aShortArray65 = new short[local128];
				for (local138 = 0; local138 < local128; local138++) {
					this.aShortArray66[local138] = (short) arg1.method4221();
					this.aShortArray65[local138] = (short) arg1.method4221();
				}
				return;
			}
			if (arg0 == 41) {
				local128 = arg1.method4225();
				this.aShortArray68 = new short[local128];
				this.aShortArray67 = new short[local128];
				for (local138 = 0; local138 < local128; local138++) {
					this.aShortArray67[local138] = (short) arg1.method4221();
					this.aShortArray68[local138] = (short) arg1.method4221();
				}
				return;
			}
		}
	}
}
