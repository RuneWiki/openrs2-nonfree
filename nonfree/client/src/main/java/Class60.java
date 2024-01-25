import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class60 {

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
	public int anInt1668;

	@OriginalMember(owner = "client!cl", name = "h", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!cl", name = "m", descriptor = "Lclient!ll;")
	public Class216 aClass216_1;

	@OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
	private int anInt1676;

	@OriginalMember(owner = "client!cl", name = "t", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!cl", name = "w", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
	public int anInt1664 = -1;

	@OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
	private int anInt1675 = -1;

	@OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
	private int anInt1674 = 128;

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "Z")
	public boolean aBoolean127 = false;

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
	private int anInt1672 = 0;

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
	private int anInt1669 = 0;

	@OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
	private int anInt1680 = 128;

	@OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
	private int anInt1677 = 0;

	@OriginalMember(owner = "client!cl", name = "u", descriptor = "B")
	public byte aByte44 = 0;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILclient!so;I)V")
	private void method1437(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub29 arg1) {
		if (arg0 == 1) {
			this.anInt1676 = arg1.method5900();
		} else if (arg0 == 2) {
			this.anInt1664 = arg1.method5900();
		} else if (arg0 == 4) {
			this.anInt1680 = arg1.method5900();
		} else if (arg0 == 5) {
			this.anInt1674 = arg1.method5900();
		} else if (arg0 == 6) {
			this.anInt1672 = arg1.method5900();
		} else if (arg0 == 7) {
			this.anInt1677 = arg1.method5866();
		} else if (arg0 == 8) {
			this.anInt1669 = arg1.method5866();
		} else if (arg0 == 9) {
			this.anInt1675 = 8224;
			this.aByte44 = 3;
		} else if (arg0 == 10) {
			this.aBoolean127 = true;
		} else if (arg0 == 11) {
			this.aByte44 = 1;
		} else if (arg0 == 12) {
			this.aByte44 = 4;
		} else if (arg0 == 13) {
			this.aByte44 = 5;
		} else if (arg0 == 14) {
			this.aByte44 = 2;
			this.anInt1675 = arg1.method5866() * 256;
		} else if (arg0 == 15) {
			this.aByte44 = 3;
			this.anInt1675 = arg1.method5900();
		} else if (arg0 == 16) {
			this.aByte44 = 3;
			this.anInt1675 = arg1.method5878();
		} else {
			@Pc(137) int local137;
			@Pc(147) int local147;
			if (arg0 == 40) {
				local137 = arg1.method5866();
				this.aShortArray17 = new short[local137];
				this.aShortArray18 = new short[local137];
				for (local147 = 0; local147 < local137; local147++) {
					this.aShortArray17[local147] = (short) arg1.method5900();
					this.aShortArray18[local147] = (short) arg1.method5900();
				}
			} else if (arg0 == 41) {
				local137 = arg1.method5866();
				this.aShortArray16 = new short[local137];
				this.aShortArray15 = new short[local137];
				for (local147 = 0; local147 < local137; local147++) {
					this.aShortArray15[local147] = (short) arg1.method5900();
					this.aShortArray16[local147] = (short) arg1.method5900();
				}
			}
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILclient!s;IBZLclient!ha;ILclient!s;ILclient!jv;IIII)Lclient!ka;")
	private Class80 method1438(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class137 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class51 arg7, @OriginalArg(9) Class191 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(7) int local7 = arg10;
		@Pc(23) Class275 local23 = this.anInt1664 == -1 || arg9 == -1 ? null : arg8.method4322(this.anInt1664);
		@Pc(32) boolean local32 = arg4 & this.aByte44 != 0;
		if (local23 != null) {
			local7 = arg10 | local23.method6549(arg6, false, arg9);
		}
		if (local32) {
			local7 |= this.aByte44 == 3 ? 7 : 2;
		}
		if (this.anInt1674 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt1680 != 128 || this.anInt1672 != 0) {
			local7 |= 0x5;
		}
		@Pc(85) Class264 local85 = this.aClass216_1.aClass264_40;
		@Pc(105) Class80 local105;
		synchronized (this.aClass216_1.aClass264_40) {
			local105 = (Class80) this.aClass216_1.aClass264_40.method6367((long) (this.anInt1668 |= arg5.anInt9522 << 29));
		}
		if (local105 == null || arg5.method7922(local105.ua(), local7) != 0) {
			if (local105 != null) {
				local7 = arg5.method7943(local7, local105.ua());
			}
			@Pc(132) int local132 = local7;
			if (this.aShortArray17 != null) {
				local132 = local7 | 0x4000;
			}
			if (this.aShortArray15 != null) {
				local132 |= 0x8000;
			}
			@Pc(155) Class67 local155 = Static40.method1465(this.aClass216_1.aClass386_80, this.anInt1676);
			if (local155 == null) {
				return null;
			}
			if (local155.anInt2022 < 13) {
				local155.method1718();
			}
			local105 = arg5.method7901(local155, local132, this.aClass216_1.anInt6363, this.anInt1677 + 64, this.anInt1669 - -850);
			@Pc(188) int local188;
			if (this.aShortArray17 != null) {
				for (local188 = 0; local188 < this.aShortArray17.length; local188++) {
					local105.ia(this.aShortArray17[local188], this.aShortArray18[local188]);
				}
			}
			if (this.aShortArray15 != null) {
				for (local188 = 0; local188 < this.aShortArray15.length; local188++) {
					local105.aa(this.aShortArray15[local188], this.aShortArray16[local188]);
				}
			}
			local105.s(local7);
			@Pc(236) Class264 local236 = this.aClass216_1.aClass264_40;
			synchronized (this.aClass216_1.aClass264_40) {
				this.aClass216_1.aClass264_40.method6364((long) (this.anInt1668 |= arg5.anInt9522 << 29), local105);
			}
		}
		@Pc(280) Class80 local280 = local23 == null ? local105.method6378(arg3, local7, true) : local23.method6545(local105, arg3, local7, arg12, arg9, arg6, 0);
		if (this.anInt1680 != 128 || this.anInt1674 != 128) {
			local280.O(this.anInt1680, this.anInt1674, this.anInt1680);
		}
		if (this.anInt1672 != 0) {
			if (this.anInt1672 == 90) {
				local280.a(4096);
			}
			if (this.anInt1672 == 180) {
				local280.a(8192);
			}
			if (this.anInt1672 == 270) {
				local280.a(12288);
			}
		}
		if (local32) {
			local280.p(this.aByte44, this.anInt1675, arg7, arg1, arg11, arg0, arg2);
		}
		local280.s(arg10);
		return local280;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!jv;IIIIBLclient!ha;)Lclient!ka;")
	public Class80 method1442(@OriginalArg(0) Class191 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class137 arg5) {
		return this.method1438(0, (Class51) null, 0, (byte) 2, false, arg5, arg1, (Class51) null, arg0, arg2, arg3, 0, arg4);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILclient!so;)V")
	public void method1443(@OriginalArg(1) Class14_Sub29 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5866();
			if (local5 == 0) {
				return;
			}
			this.method1437(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIILclient!jv;ZBILclient!ha;)Lclient!ka;")
	public Class80 method1444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class191 arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class137 arg6) {
		return this.method1438(0, (Class51) null, 0, arg4, false, arg6, arg2, (Class51) null, arg3, arg1, arg0, 0, arg5);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!jv;Lclient!ha;Lclient!s;IIIILclient!s;IIZII)Lclient!ka;")
	public Class80 method1445(@OriginalArg(0) Class191 arg0, @OriginalArg(1) Class137 arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class51 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		return this.method1438(arg4, arg7, arg5, (byte) 2, true, arg1, arg6, arg2, arg0, arg10, arg9, arg8, arg3);
	}
}
