import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class105 {

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
	public int anInt2897;

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "[S")
	private short[] aShortArray48;

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "Lclient!ss;")
	public Class231 aClass231_2;

	@OriginalMember(owner = "client!hk", name = "r", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
	private int anInt2910;

	@OriginalMember(owner = "client!hk", name = "y", descriptor = "[S")
	private short[] aShortArray50;

	@OriginalMember(owner = "client!hk", name = "z", descriptor = "[S")
	private short[] aShortArray51;

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
	public int anInt2900 = -1;

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "Z")
	public boolean aBoolean176 = false;

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
	private int anInt2903 = 128;

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
	private int anInt2901 = 0;

	@OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
	private int anInt2905 = -1;

	@OriginalMember(owner = "client!hk", name = "q", descriptor = "B")
	public byte aByte28 = 0;

	@OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
	private int anInt2908 = 128;

	@OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
	private int anInt2906 = 0;

	@OriginalMember(owner = "client!hk", name = "x", descriptor = "I")
	private int anInt2912 = 0;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!m;IIIIIILclient!ta;Lclient!ya;IIZLclient!ta;)Lclient!t;")
	public Class163 method2331(@OriginalArg(0) Class151 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class165 arg6, @OriginalArg(8) Class51 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(12) Class165 arg10) {
		return this.method2334(arg1, arg7, arg10, arg0, arg9, arg4, true, (byte) 2, arg2, arg8, arg3, arg5, arg6);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIBILclient!ya;Lclient!m;)Lclient!t;")
	public Class163 method2333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class51 arg4, @OriginalArg(6) Class151 arg5) {
		return this.method2334(arg0, arg4, null, arg5, 0, 0, false, (byte) 2, arg3, arg1, 0, arg2, null);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILclient!ya;ILclient!ta;Lclient!m;IIZBIIIILclient!ta;)Lclient!t;")
	private Class163 method2334(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(3) Class165 arg2, @OriginalArg(4) Class151 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) byte arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class165 arg12) {
		@Pc(7) int local7 = arg9;
		@Pc(23) Class139 local23 = this.anInt2900 == -1 || arg8 == -1 ? null : arg3.method3293(this.anInt2900);
		@Pc(35) boolean local35 = arg6 & this.aByte28 != 0;
		if (local23 != null) {
			local7 = arg9 | local23.method3129(arg8, arg11, false);
		}
		if (local35) {
			local7 |= this.aByte28 == 3 ? 7 : 2;
		}
		if (this.anInt2908 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt2903 != 128 || this.anInt2906 != 0) {
			local7 |= 0x5;
		}
		@Pc(91) Class126 local91 = this.aClass231_2.aClass126_55;
		@Pc(111) Class163 local111;
		synchronized (this.aClass231_2.aClass126_55) {
			local111 = (Class163) this.aClass231_2.aClass126_55.method2822((long) (this.anInt2897 |= arg1.anInt6714 << 29));
		}
		if (local111 == null || arg1.method5352(local111.P(), local7) != 0) {
			if (local111 != null) {
				local7 = arg1.method5323(local7, local111.P());
			}
			@Pc(138) int local138 = local7;
			if (this.aShortArray48 != null) {
				local138 = local7 | 0x4000;
			}
			if (this.aShortArray49 != null) {
				local138 |= 0x8000;
			}
			@Pc(161) Class117 local161 = Static49.method625(this.aClass231_2.aClass178_115, this.anInt2910);
			if (local161 == null) {
				return null;
			}
			if (local161.anInt3204 < 13) {
				local161.method2587();
			}
			local111 = arg1.method5346(local161, local138, this.aClass231_2.anInt6099, this.anInt2912 + 64, this.anInt2901 + 850);
			@Pc(194) int local194;
			if (this.aShortArray48 != null) {
				for (local194 = 0; local194 < this.aShortArray48.length; local194++) {
					local111.BA(this.aShortArray48[local194], this.aShortArray50[local194]);
				}
			}
			if (this.aShortArray49 != null) {
				for (local194 = 0; local194 < this.aShortArray49.length; local194++) {
					local111.I(this.aShortArray49[local194], this.aShortArray51[local194]);
				}
			}
			local111.UA(local7);
			@Pc(246) Class126 local246 = this.aClass231_2.aClass126_55;
			synchronized (this.aClass231_2.aClass126_55) {
				this.aClass231_2.aClass126_55.method2824((long) (this.anInt2897 |= arg1.anInt6714 << 29), local111);
			}
		}
		@Pc(290) Class163 local290 = local23 == null ? local111.method4654(arg7, local7, true) : local23.method3133(local7, 0, arg7, arg8, arg0, local111, arg11);
		if (this.anInt2903 != 128 || this.anInt2908 != 128) {
			local290.H(this.anInt2903, this.anInt2908, this.anInt2903);
		}
		if (this.anInt2906 != 0) {
			if (this.anInt2906 == 90) {
				local290.Q(4096);
			}
			if (this.anInt2906 == 180) {
				local290.Q(8192);
			}
			if (this.anInt2906 == 270) {
				local290.Q(12288);
			}
		}
		if (local35) {
			local290.h(this.aByte28, this.anInt2905, arg2, arg12, arg4, arg10, arg5);
		}
		local290.UA(arg9);
		return local290;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IILclient!gk;)V")
	private void method2335(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt2910 = arg1.method3943();
		} else if (arg0 == 2) {
			this.anInt2900 = arg1.method3943();
		} else if (arg0 == 4) {
			this.anInt2903 = arg1.method3943();
		} else if (arg0 == 5) {
			this.anInt2908 = arg1.method3943();
		} else if (arg0 == 6) {
			this.anInt2906 = arg1.method3943();
		} else if (arg0 == 7) {
			this.anInt2912 = arg1.method3981();
		} else if (arg0 == 8) {
			this.anInt2901 = arg1.method3981();
		} else if (arg0 == 9) {
			this.anInt2905 = 8224;
			this.aByte28 = 3;
		} else if (arg0 == 10) {
			this.aBoolean176 = true;
		} else if (arg0 == 11) {
			this.aByte28 = 1;
		} else if (arg0 == 12) {
			this.aByte28 = 4;
		} else if (arg0 == 13) {
			this.aByte28 = 5;
		} else if (arg0 == 14) {
			this.aByte28 = 2;
			this.anInt2905 = arg1.method3981() * 256;
		} else if (arg0 == 15) {
			this.aByte28 = 3;
			this.anInt2905 = arg1.method3943();
		} else if (arg0 == 16) {
			this.aByte28 = 3;
			this.anInt2905 = arg1.method3938();
		} else {
			@Pc(142) int local142;
			@Pc(152) int local152;
			if (arg0 == 40) {
				local142 = arg1.method3981();
				this.aShortArray48 = new short[local142];
				this.aShortArray50 = new short[local142];
				for (local152 = 0; local152 < local142; local152++) {
					this.aShortArray48[local152] = (short) arg1.method3943();
					this.aShortArray50[local152] = (short) arg1.method3943();
				}
			} else if (arg0 == 41) {
				local142 = arg1.method3981();
				this.aShortArray51 = new short[local142];
				this.aShortArray49 = new short[local142];
				for (local152 = 0; local152 < local142; local152++) {
					this.aShortArray49[local152] = (short) arg1.method3943();
					this.aShortArray51[local152] = (short) arg1.method3943();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILclient!m;IIIZLclient!ya;)Lclient!t;")
	public Class163 method2338(@OriginalArg(0) int arg0, @OriginalArg(1) Class151 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class51 arg5) {
		return this.method2334(arg4, arg5, null, arg1, 0, 0, false, (byte) 5, arg3, arg2, 0, arg0, null);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLclient!gk;)V")
	public void method2339(@OriginalArg(1) Class7_Sub14 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3981();
			if (local13 == 0) {
				return;
			}
			this.method2335(local13, arg0);
		}
	}
}
