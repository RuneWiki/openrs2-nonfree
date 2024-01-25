import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hga")
public final class Class134 {

	@OriginalMember(owner = "client!hga", name = "e", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!hga", name = "g", descriptor = "Lclient!om;")
	public Class256 aClass256_1;

	@OriginalMember(owner = "client!hga", name = "j", descriptor = "I")
	public int anInt3770;

	@OriginalMember(owner = "client!hga", name = "m", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!hga", name = "n", descriptor = "I")
	private int anInt3773;

	@OriginalMember(owner = "client!hga", name = "q", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!hga", name = "t", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!hga", name = "f", descriptor = "Z")
	public boolean aBoolean272 = false;

	@OriginalMember(owner = "client!hga", name = "i", descriptor = "I")
	private int anInt3769 = 0;

	@OriginalMember(owner = "client!hga", name = "p", descriptor = "I")
	public int anInt3775 = -1;

	@OriginalMember(owner = "client!hga", name = "l", descriptor = "I")
	private int anInt3772 = -1;

	@OriginalMember(owner = "client!hga", name = "r", descriptor = "I")
	private int anInt3776 = 128;

	@OriginalMember(owner = "client!hga", name = "d", descriptor = "I")
	private int anInt3767 = 128;

	@OriginalMember(owner = "client!hga", name = "s", descriptor = "I")
	private int anInt3777 = 0;

	@OriginalMember(owner = "client!hga", name = "u", descriptor = "B")
	public byte aByte52 = 0;

	@OriginalMember(owner = "client!hga", name = "v", descriptor = "I")
	private int anInt3778 = 0;

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(ILclient!nu;ILclient!r;IZI)Lclient!da;")
	public Class52 method3062(@OriginalArg(0) int arg0, @OriginalArg(1) Class245 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class78 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		return this.method3064(arg5, null, arg4, arg1, arg0, 0, (byte) 2, null, 0, arg3, arg2, 0, false);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(ILclient!ac;)V")
	public void method3063(@OriginalArg(1) Class1_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7974();
			if (local5 == 0) {
				return;
			}
			this.method3066(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(ILclient!i;ILclient!nu;IIIBLclient!i;ILclient!r;IIZ)Lclient!da;")
	private Class52 method3064(@OriginalArg(0) int arg0, @OriginalArg(1) Class129 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class245 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) Class129 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class78 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) boolean arg12) {
		@Pc(7) int local7 = arg0;
		@Pc(23) Class197 local23 = this.anInt3775 == -1 || arg10 == -1 ? null : arg3.method5312(this.anInt3775);
		@Pc(35) boolean local35 = arg12 & this.aByte52 != 0;
		if (local23 != null) {
			local7 = arg0 | local23.method4037(arg10, arg2, false);
		}
		if (local35) {
			local7 |= this.aByte52 == 3 ? 7 : 2;
		}
		if (this.anInt3776 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt3767 != 128 || this.anInt3769 != 0) {
			local7 |= 0x5;
		}
		@Pc(94) Class207 local94 = this.aClass256_1.aClass207_42;
		@Pc(114) Class52 local114;
		synchronized (this.aClass256_1.aClass207_42) {
			local114 = (Class52) this.aClass256_1.aClass207_42.method4390((long) (this.anInt3770 |= arg9.anInt8385 << 29));
		}
		if (local114 == null || arg9.method6819(local114.PA(), local7) != 0) {
			if (local114 != null) {
				local7 = arg9.method6782(local7, local114.PA());
			}
			@Pc(138) int local138 = local7;
			if (this.aShortArray22 != null) {
				local138 = local7 | 0x4000;
			}
			if (this.aShortArray20 != null) {
				local138 |= 0x8000;
			}
			@Pc(161) Class231 local161 = Static317.method7563(this.anInt3773, this.aClass256_1.aClass308_133);
			if (local161 == null) {
				return null;
			}
			if (local161.anInt6254 < 13) {
				local161.method5067();
			}
			local114 = arg9.method6817(local161, local138, this.aClass256_1.anInt6761, this.anInt3777 + 64, this.anInt3778 + 850);
			@Pc(196) int local196;
			if (this.aShortArray22 != null) {
				for (local196 = 0; local196 < this.aShortArray22.length; local196++) {
					local114.d(this.aShortArray22[local196], this.aShortArray21[local196]);
				}
			}
			if (this.aShortArray20 != null) {
				for (local196 = 0; local196 < this.aShortArray20.length; local196++) {
					local114.DA(this.aShortArray20[local196], this.aShortArray23[local196]);
				}
			}
			local114.SA(local7);
			@Pc(252) Class207 local252 = this.aClass256_1.aClass207_42;
			synchronized (this.aClass256_1.aClass207_42) {
				this.aClass256_1.aClass207_42.method4391((long) (this.anInt3770 |= arg9.anInt8385 << 29), local114);
			}
		}
		@Pc(296) Class52 local296 = local23 == null ? local114.method7412(arg6, local7, true) : local23.method4040(arg6, arg10, arg2, local7, local114, 0, arg4);
		if (this.anInt3767 != 128 || this.anInt3776 != 128) {
			local296.R(this.anInt3767, this.anInt3776, this.anInt3767);
		}
		if (this.anInt3769 != 0) {
			if (this.anInt3769 == 90) {
				local296.M(4096);
			}
			if (this.anInt3769 == 180) {
				local296.M(8192);
			}
			if (this.anInt3769 == 270) {
				local296.M(12288);
			}
		}
		if (local35) {
			local296.ba(this.aByte52, this.anInt3772, arg1, arg7, arg5, arg8, arg11);
		}
		local296.SA(arg0);
		return local296;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Lclient!nu;ILclient!r;IIII)Lclient!da;")
	public Class52 method3065(@OriginalArg(0) Class245 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class78 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method3064(arg5, null, arg4, arg0, arg3, 0, (byte) 5, null, 0, arg2, arg1, 0, false);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IILclient!ac;)V")
	private void method3066(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt3773 = arg1.method7945();
		} else if (arg0 == 2) {
			this.anInt3775 = arg1.method7945();
		} else if (arg0 == 4) {
			this.anInt3767 = arg1.method7945();
		} else if (arg0 == 5) {
			this.anInt3776 = arg1.method7945();
		} else if (arg0 == 6) {
			this.anInt3769 = arg1.method7945();
		} else if (arg0 == 7) {
			this.anInt3777 = arg1.method7974();
		} else if (arg0 == 8) {
			this.anInt3778 = arg1.method7974();
		} else if (arg0 == 9) {
			this.anInt3772 = 8224;
			this.aByte52 = 3;
		} else if (arg0 == 10) {
			this.aBoolean272 = true;
		} else if (arg0 == 11) {
			this.aByte52 = 1;
		} else if (arg0 == 12) {
			this.aByte52 = 4;
		} else if (arg0 == 13) {
			this.aByte52 = 5;
		} else if (arg0 == 14) {
			this.aByte52 = 2;
			this.anInt3772 = arg1.method7974() * 256;
		} else if (arg0 == 15) {
			this.aByte52 = 3;
			this.anInt3772 = arg1.method7945();
		} else if (arg0 == 16) {
			this.aByte52 = 3;
			this.anInt3772 = arg1.method7940();
		} else {
			@Pc(102) int local102;
			@Pc(112) int local112;
			if (arg0 == 40) {
				local102 = arg1.method7974();
				this.aShortArray21 = new short[local102];
				this.aShortArray22 = new short[local102];
				for (local112 = 0; local112 < local102; local112++) {
					this.aShortArray22[local112] = (short) arg1.method7945();
					this.aShortArray21[local112] = (short) arg1.method7945();
				}
			} else if (arg0 == 41) {
				local102 = arg1.method7974();
				this.aShortArray20 = new short[local102];
				this.aShortArray23 = new short[local102];
				for (local112 = 0; local112 < local102; local112++) {
					this.aShortArray20[local112] = (short) arg1.method7945();
					this.aShortArray23[local112] = (short) arg1.method7945();
				}
			}
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Lclient!i;IIIILclient!i;IZLclient!r;Lclient!nu;IBI)Lclient!da;")
	public Class52 method3067(@OriginalArg(0) Class129 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class129 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class78 arg7, @OriginalArg(9) Class245 arg8, @OriginalArg(10) int arg9, @OriginalArg(12) int arg10) {
		return this.method3064(arg6, arg5, arg2, arg8, arg3, arg4, (byte) 2, arg0, arg1, arg7, arg9, arg10, true);
	}
}
