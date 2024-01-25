import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class336 {

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "[S")
	private short[] aShortArray125;

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "[S")
	private short[] aShortArray126;

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "Lclient!rk;")
	public Class319 aClass319_2;

	@OriginalMember(owner = "client!sm", name = "j", descriptor = "[S")
	private short[] aShortArray127;

	@OriginalMember(owner = "client!sm", name = "m", descriptor = "[S")
	private short[] aShortArray128;

	@OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
	private int anInt9658;

	@OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
	public int anInt9663;

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
	private int anInt9654 = 0;

	@OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
	private int anInt9659 = 0;

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
	private int anInt9652 = 128;

	@OriginalMember(owner = "client!sm", name = "s", descriptor = "I")
	private int anInt9661 = 0;

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
	public int anInt9651 = -1;

	@OriginalMember(owner = "client!sm", name = "r", descriptor = "B")
	public byte aByte130 = 0;

	@OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
	private int anInt9660 = 128;

	@OriginalMember(owner = "client!sm", name = "y", descriptor = "I")
	private int anInt9666 = -1;

	@OriginalMember(owner = "client!sm", name = "z", descriptor = "Z")
	public boolean aBoolean711 = false;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILclient!ol;I)V")
	private void method8455(@OriginalArg(1) Class2_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt9658 = arg0.method5211();
		} else if (arg1 == 2) {
			this.anInt9651 = arg0.method5211();
		} else if (arg1 == 4) {
			this.anInt9660 = arg0.method5211();
		} else if (arg1 == 5) {
			this.anInt9652 = arg0.method5211();
		} else if (arg1 == 6) {
			this.anInt9654 = arg0.method5211();
		} else if (arg1 == 7) {
			this.anInt9661 = arg0.method5203();
		} else if (arg1 == 8) {
			this.anInt9659 = arg0.method5203();
		} else if (arg1 == 9) {
			this.aByte130 = 3;
			this.anInt9666 = 8224;
		} else if (arg1 == 10) {
			this.aBoolean711 = true;
		} else if (arg1 == 11) {
			this.aByte130 = 1;
		} else if (arg1 == 12) {
			this.aByte130 = 4;
		} else if (arg1 == 13) {
			this.aByte130 = 5;
		} else if (arg1 == 14) {
			this.aByte130 = 2;
			this.anInt9666 = arg0.method5203() * 256;
		} else if (arg1 == 15) {
			this.aByte130 = 3;
			this.anInt9666 = arg0.method5211();
		} else if (arg1 == 16) {
			this.aByte130 = 3;
			this.anInt9666 = arg0.method5172();
		} else {
			@Pc(126) int local126;
			@Pc(136) int local136;
			if (arg1 == 40) {
				local126 = arg0.method5203();
				this.aShortArray127 = new short[local126];
				this.aShortArray125 = new short[local126];
				for (local136 = 0; local136 < local126; local136++) {
					this.aShortArray127[local136] = (short) arg0.method5211();
					this.aShortArray125[local136] = (short) arg0.method5211();
				}
			} else if (arg1 == 41) {
				local126 = arg0.method5203();
				this.aShortArray128 = new short[local126];
				this.aShortArray126 = new short[local126];
				for (local136 = 0; local136 < local126; local136++) {
					this.aShortArray128[local136] = (short) arg0.method5211();
					this.aShortArray126[local136] = (short) arg0.method5211();
				}
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!s;Lclient!ha;IIIILclient!br;ZIBILclient!s;II)Lclient!ka;")
	private Class14 method8457(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class40 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(9) byte arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class18 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(15) int local15 = arg2;
		@Pc(31) Class178 local31 = this.anInt9651 == -1 || arg4 == -1 ? null : arg6.method1123(this.anInt9651);
		@Pc(40) boolean local40 = arg7 & this.aByte130 != 0;
		if (local31 != null) {
			local15 = arg2 | local31.method4685(false, arg9, arg4);
		}
		if (local40) {
			local15 |= this.aByte130 == 3 ? 7 : 2;
		}
		if (this.anInt9652 != 128) {
			local15 |= 0x2;
		}
		if (this.anInt9660 != 128 || this.anInt9654 != 0) {
			local15 |= 0x5;
		}
		@Pc(86) Class22 local86 = this.aClass319_2.aClass22_47;
		@Pc(106) Class14 local106;
		synchronized (this.aClass319_2.aClass22_47) {
			local106 = (Class14) this.aClass319_2.aClass22_47.method462((long) (this.anInt9663 |= arg1.anInt9210 << 29));
		}
		if (local106 == null || arg1.method8083(local106.ua(), local15) != 0) {
			if (local106 != null) {
				local15 = arg1.method8095(local15, local106.ua());
			}
			@Pc(133) int local133 = local15;
			if (this.aShortArray127 != null) {
				local133 = local15 | 0x4000;
			}
			if (this.aShortArray128 != null) {
				local133 |= 0x8000;
			}
			@Pc(156) Class159 local156 = Static452.method7285(this.aClass319_2.aClass124_109, this.anInt9658);
			if (local156 == null) {
				return null;
			}
			if (local156.anInt4809 < 13) {
				local156.method4358();
			}
			local106 = arg1.method8064(local156, local133, this.aClass319_2.anInt9184, this.anInt9661 + 64, this.anInt9659 - -850);
			@Pc(191) int local191;
			if (this.aShortArray127 != null) {
				for (local191 = 0; local191 < this.aShortArray127.length; local191++) {
					local106.ia(this.aShortArray127[local191], this.aShortArray125[local191]);
				}
			}
			if (this.aShortArray128 != null) {
				for (local191 = 0; local191 < this.aShortArray128.length; local191++) {
					local106.aa(this.aShortArray128[local191], this.aShortArray126[local191]);
				}
			}
			local106.s(local15);
			@Pc(243) Class22 local243 = this.aClass319_2.aClass22_47;
			synchronized (this.aClass319_2.aClass22_47) {
				this.aClass319_2.aClass22_47.method470((long) (this.anInt9663 |= arg1.anInt9210 << 29), local106);
			}
		}
		@Pc(287) Class14 local287 = local31 == null ? local106.method8622(arg8, local15, true) : local31.method4681(local15, arg5, arg8, local106, arg9, arg4, 0);
		if (this.anInt9660 != 128 || this.anInt9652 != 128) {
			local287.O(this.anInt9660, this.anInt9652, this.anInt9660);
		}
		if (this.anInt9654 != 0) {
			if (this.anInt9654 == 90) {
				local287.a(4096);
			}
			if (this.anInt9654 == 180) {
				local287.a(8192);
			}
			if (this.anInt9654 == 270) {
				local287.a(12288);
			}
		}
		if (local40) {
			local287.p(this.aByte130, this.anInt9666, arg0, arg10, arg12, arg11, arg3);
		}
		local287.s(arg2);
		return local287;
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(BLclient!ol;)V")
	public void method8458(@OriginalArg(1) Class2_Sub8 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method5203();
			if (local11 == 0) {
				return;
			}
			this.method8455(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IILclient!ha;IILclient!br;I)Lclient!ka;")
	public Class14 method8460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class101 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class40 arg5) {
		return this.method8457((Class18) null, arg2, arg4, 0, arg0, arg3, arg5, false, (byte) 2, arg1, (Class18) null, 0, 0);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!ha;ILclient!s;ZIIILclient!br;IILclient!s;II)Lclient!ka;")
	public Class14 method8461(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class18 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class40 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class18 arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10) {
		return this.method8457(arg2, arg0, arg4, arg3, arg9, arg7, arg5, true, (byte) 2, arg10, arg8, arg6, arg1);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIBILclient!br;ILclient!ha;I)Lclient!ka;")
	public Class14 method8462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class40 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class101 arg6) {
		return this.method8457((Class18) null, arg6, arg3, 0, arg1, arg5, arg4, false, arg2, arg0, (Class18) null, 0, 0);
	}
}
