import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public final class Class167 {

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
	public int anInt4363;

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
	private int anInt4364;

	@OriginalMember(owner = "client!iv", name = "i", descriptor = "[S")
	private short[] aShortArray73;

	@OriginalMember(owner = "client!iv", name = "k", descriptor = "Lclient!bea;")
	public Class33 aClass33_2;

	@OriginalMember(owner = "client!iv", name = "m", descriptor = "[S")
	private short[] aShortArray74;

	@OriginalMember(owner = "client!iv", name = "o", descriptor = "[S")
	private short[] aShortArray75;

	@OriginalMember(owner = "client!iv", name = "s", descriptor = "[S")
	private short[] aShortArray76;

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "I")
	private int anInt4361 = -1;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
	private int anInt4360 = 0;

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "I")
	private int anInt4362 = 128;

	@OriginalMember(owner = "client!iv", name = "w", descriptor = "I")
	public int anInt4374 = -1;

	@OriginalMember(owner = "client!iv", name = "r", descriptor = "B")
	public byte aByte59 = 0;

	@OriginalMember(owner = "client!iv", name = "v", descriptor = "I")
	private int anInt4373 = 128;

	@OriginalMember(owner = "client!iv", name = "q", descriptor = "I")
	private int anInt4370 = 0;

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "Z")
	public boolean aBoolean352 = false;

	@OriginalMember(owner = "client!iv", name = "z", descriptor = "I")
	private int anInt4376 = 0;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILclient!es;)V")
	public void method3640(@OriginalArg(1) Class2_Sub15 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method4325();
			if (local7 == 0) {
				return;
			}
			this.method3641(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IBLclient!es;)V")
	private void method3641(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt4364 = arg1.method4294();
		} else if (arg0 == 2) {
			this.anInt4374 = arg1.method4294();
		} else if (arg0 == 4) {
			this.anInt4373 = arg1.method4294();
		} else if (arg0 == 5) {
			this.anInt4362 = arg1.method4294();
		} else if (arg0 == 6) {
			this.anInt4370 = arg1.method4294();
		} else if (arg0 == 7) {
			this.anInt4376 = arg1.method4325();
		} else if (arg0 == 8) {
			this.anInt4360 = arg1.method4325();
		} else if (arg0 == 9) {
			this.anInt4361 = 8224;
			this.aByte59 = 3;
		} else if (arg0 == 10) {
			this.aBoolean352 = true;
		} else if (arg0 == 11) {
			this.aByte59 = 1;
		} else if (arg0 == 12) {
			this.aByte59 = 4;
		} else if (arg0 == 13) {
			this.aByte59 = 5;
		} else if (arg0 == 14) {
			this.aByte59 = 2;
			this.anInt4361 = arg1.method4325() * 256;
		} else if (arg0 == 15) {
			this.aByte59 = 3;
			this.anInt4361 = arg1.method4294();
		} else if (arg0 == 16) {
			this.aByte59 = 3;
			this.anInt4361 = arg1.method4307();
		} else {
			@Pc(146) int local146;
			@Pc(156) int local156;
			if (arg0 == 40) {
				local146 = arg1.method4325();
				this.aShortArray74 = new short[local146];
				this.aShortArray75 = new short[local146];
				for (local156 = 0; local156 < local146; local156++) {
					this.aShortArray75[local156] = (short) arg1.method4294();
					this.aShortArray74[local156] = (short) arg1.method4294();
				}
			} else if (arg0 == 41) {
				local146 = arg1.method4325();
				this.aShortArray76 = new short[local146];
				this.aShortArray73 = new short[local146];
				for (local156 = 0; local156 < local146; local156++) {
					this.aShortArray73[local156] = (short) arg1.method4294();
					this.aShortArray76[local156] = (short) arg1.method4294();
				}
			}
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILclient!r;ILclient!hl;III)Lclient!da;")
	public Class66 method3642(@OriginalArg(0) int arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(3) Class140 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return this.method3647(0, 0, false, 0, arg0, arg4, arg5, null, (byte) 2, arg3, null, arg1, arg2);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lclient!hl;ILclient!r;IIII)Lclient!da;")
	public Class66 method3643(@OriginalArg(0) Class140 arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return this.method3647(0, 0, false, 0, arg2, arg3, arg5, null, (byte) 5, arg4, null, arg1, arg0);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIIBLclient!i;IZLclient!i;ILclient!r;Lclient!hl;I)Lclient!da;")
	public Class66 method3645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class67 arg4, @OriginalArg(6) int arg5, @OriginalArg(8) Class67 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class100 arg8, @OriginalArg(11) Class140 arg9, @OriginalArg(12) int arg10) {
		return this.method3647(arg10, arg3, true, arg0, arg2, arg1, arg7, arg6, (byte) 2, arg5, arg4, arg8, arg9);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIZIIIILclient!i;BILclient!i;ZLclient!r;Lclient!hl;)Lclient!da;")
	private Class66 method3647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class67 arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class67 arg10, @OriginalArg(12) Class100 arg11, @OriginalArg(13) Class140 arg12) {
		@Pc(7) int local7 = arg5;
		@Pc(24) Class84 local24 = this.anInt4374 == -1 || arg9 == -1 ? null : arg12.method3287(this.anInt4374);
		@Pc(33) boolean local33 = arg2 & this.aByte59 != 0;
		if (local24 != null) {
			local7 = arg5 | local24.method1508(arg4, false, arg9);
		}
		if (local33) {
			local7 |= this.aByte59 == 3 ? 7 : 2;
		}
		if (this.anInt4362 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt4373 != 128 || this.anInt4370 != 0) {
			local7 |= 0x5;
		}
		@Pc(87) Class313 local87 = this.aClass33_2.aClass313_9;
		@Pc(107) Class66 local107;
		synchronized (this.aClass33_2.aClass313_9) {
			local107 = (Class66) this.aClass33_2.aClass313_9.method6989((long) (this.anInt4363 |= arg11.anInt7465 << 29));
		}
		if (local107 == null || arg11.method6216(local107.PA(), local7) != 0) {
			if (local107 != null) {
				local7 = arg11.method6215(local7, local107.PA());
			}
			@Pc(131) int local131 = local7;
			if (this.aShortArray75 != null) {
				local131 = local7 | 0x4000;
			}
			if (this.aShortArray73 != null) {
				local131 |= 0x8000;
			}
			@Pc(154) Class93 local154 = Static117.method1747(this.anInt4364, this.aClass33_2.aClass259_19);
			if (local154 == null) {
				return null;
			}
			if (local154.anInt2361 < 13) {
				local154.method1763();
			}
			local107 = arg11.method6191(local154, local131, this.aClass33_2.anInt855, this.anInt4376 + 64, this.anInt4360 - -850);
			@Pc(189) int local189;
			if (this.aShortArray75 != null) {
				for (local189 = 0; local189 < this.aShortArray75.length; local189++) {
					local107.d(this.aShortArray75[local189], this.aShortArray74[local189]);
				}
			}
			if (this.aShortArray73 != null) {
				for (local189 = 0; local189 < this.aShortArray73.length; local189++) {
					local107.DA(this.aShortArray73[local189], this.aShortArray76[local189]);
				}
			}
			local107.SA(local7);
			@Pc(237) Class313 local237 = this.aClass33_2.aClass313_9;
			synchronized (this.aClass33_2.aClass313_9) {
				this.aClass33_2.aClass313_9.method6980((long) (this.anInt4363 |= arg11.anInt7465 << 29), local107);
			}
		}
		@Pc(281) Class66 local281 = local24 == null ? local107.method7551(arg8, local7, true) : local24.method1512(arg8, local107, local7, 0, arg6, arg9, arg4);
		if (this.anInt4373 != 128 || this.anInt4362 != 128) {
			local281.R(this.anInt4373, this.anInt4362, this.anInt4373);
		}
		if (this.anInt4370 != 0) {
			if (this.anInt4370 == 90) {
				local281.M(4096);
			}
			if (this.anInt4370 == 180) {
				local281.M(8192);
			}
			if (this.anInt4370 == 270) {
				local281.M(12288);
			}
		}
		if (local33) {
			local281.ba(this.aByte59, this.anInt4361, arg10, arg7, arg3, arg1, arg0);
		}
		local281.SA(arg5);
		return local281;
	}
}
