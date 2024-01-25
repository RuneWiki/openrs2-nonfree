import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class295 {

	@OriginalMember(owner = "client!pv", name = "f", descriptor = "[S")
	private short[] aShortArray111;

	@OriginalMember(owner = "client!pv", name = "j", descriptor = "[S")
	private short[] aShortArray112;

	@OriginalMember(owner = "client!pv", name = "l", descriptor = "[S")
	private short[] aShortArray113;

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "I")
	private int anInt7612;

	@OriginalMember(owner = "client!pv", name = "u", descriptor = "[S")
	private short[] aShortArray114;

	@OriginalMember(owner = "client!pv", name = "x", descriptor = "I")
	public int anInt7615;

	@OriginalMember(owner = "client!pv", name = "s", descriptor = "Lclient!tj;")
	public Class352 aClass352_2;

	@OriginalMember(owner = "client!pv", name = "A", descriptor = "I")
	public int anInt7610 = -1;

	@OriginalMember(owner = "client!pv", name = "z", descriptor = "I")
	private int anInt7613 = 0;

	@OriginalMember(owner = "client!pv", name = "v", descriptor = "I")
	private int anInt7622 = 128;

	@OriginalMember(owner = "client!pv", name = "r", descriptor = "I")
	private int anInt7616 = 0;

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
	private int anInt7618 = 128;

	@OriginalMember(owner = "client!pv", name = "k", descriptor = "B")
	public byte aByte107 = 0;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "I")
	private int anInt7625 = 0;

	@OriginalMember(owner = "client!pv", name = "p", descriptor = "I")
	private int anInt7623 = -1;

	@OriginalMember(owner = "client!pv", name = "B", descriptor = "Z")
	public boolean aBoolean514 = false;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILclient!s;IILclient!s;Lclient!ha;Lclient!aia;IIIIZI)Lclient!ka;")
	public Class43 method6628(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class84 arg4, @OriginalArg(5) Class100 arg5, @OriginalArg(6) Class14 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(12) int arg10) {
		return this.method6630(arg9, arg3, arg8, arg2, true, arg6, arg5, arg7, (byte) 2, arg0, arg1, arg4, arg10);
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIIZLclient!aia;Lclient!ha;IIBILclient!s;Lclient!s;I)Lclient!ka;")
	private Class43 method6630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class14 arg5, @OriginalArg(6) Class100 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class84 arg10, @OriginalArg(12) Class84 arg11, @OriginalArg(13) int arg12) {
		@Pc(15) int local15 = arg9;
		@Pc(34) Class264 local34 = this.anInt7610 == -1 || arg12 == -1 ? null : arg5.method227(this.anInt7610);
		@Pc(47) boolean local47 = arg4 & this.aByte107 != 0;
		if (local34 != null) {
			local15 = arg9 | local34.method6131(false, arg3, arg12);
		}
		if (local47) {
			local15 |= this.aByte107 == 3 ? 7 : 2;
		}
		if (this.anInt7618 != 128) {
			local15 |= 0x2;
		}
		if (this.anInt7622 != 128 || this.anInt7616 != 0) {
			local15 |= 0x5;
		}
		@Pc(102) Class168 local102 = this.aClass352_2.aClass168_84;
		@Pc(122) Class43 local122;
		synchronized (this.aClass352_2.aClass168_84) {
			local122 = (Class43) this.aClass352_2.aClass168_84.method3860((long) (this.anInt7615 |= arg6.anInt10048 << 29));
		}
		if (local122 == null || arg6.method8628(local122.ua(), local15) != 0) {
			if (local122 != null) {
				local15 = arg6.method8665(local15, local122.ua());
			}
			@Pc(150) int local150 = local15;
			if (this.aShortArray112 != null) {
				local150 = local15 | 0x4000;
			}
			if (this.aShortArray114 != null) {
				local150 |= 0x8000;
			}
			@Pc(173) Class197 local173 = Static485.method8979(this.aClass352_2.aClass126_263, this.anInt7612);
			if (local173 == null) {
				return null;
			}
			if (local173.anInt5125 < 13) {
				local173.method4604();
			}
			local122 = arg6.method8588(local173, local150, this.aClass352_2.anInt9370, this.anInt7625 + 64, this.anInt7613 - -850);
			@Pc(209) int local209;
			if (this.aShortArray112 != null) {
				for (local209 = 0; local209 < this.aShortArray112.length; local209++) {
					local122.ia(this.aShortArray112[local209], this.aShortArray111[local209]);
				}
			}
			if (this.aShortArray114 != null) {
				for (local209 = 0; local209 < this.aShortArray114.length; local209++) {
					local122.aa(this.aShortArray114[local209], this.aShortArray113[local209]);
				}
			}
			local122.s(local15);
			@Pc(271) Class168 local271 = this.aClass352_2.aClass168_84;
			synchronized (this.aClass352_2.aClass168_84) {
				this.aClass352_2.aClass168_84.method3853((long) (this.anInt7615 |= arg6.anInt10048 << 29), local122);
			}
		}
		@Pc(316) Class43 local316 = local34 == null ? local122.method8840(arg8, local15, true) : local34.method6126(local122, arg3, local15, arg12, arg8, 0, arg2);
		if (this.anInt7622 != 128 || this.anInt7618 != 128) {
			local316.O(this.anInt7622, this.anInt7618, this.anInt7622);
		}
		if (this.anInt7616 != 0) {
			if (this.anInt7616 == 90) {
				local316.a(4096);
			}
			if (this.anInt7616 == 180) {
				local316.a(8192);
			}
			if (this.anInt7616 == 270) {
				local316.a(12288);
			}
		}
		if (local47) {
			local316.p(this.aByte107, this.anInt7623, arg10, arg11, arg0, arg1, arg7);
		}
		local316.s(arg9);
		return local316;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!ha;BIILclient!aia;III)Lclient!ka;")
	public Class43 method6632(@OriginalArg(0) Class100 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class14 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		return this.method6630(0, 0, arg5, arg3, false, arg4, arg0, 0, arg1, arg2, (Class84) null, (Class84) null, arg6);
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILclient!wq;)V")
	public void method6634(@OriginalArg(1) Class5_Sub36 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method7291();
			if (local18 == 0) {
				return;
			}
			this.method6635(arg0, local18);
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!wq;II)V")
	private void method6635(@OriginalArg(0) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt7612 = arg0.method7333();
		} else if (arg1 == 2) {
			this.anInt7610 = arg0.method7333();
		} else if (arg1 == 4) {
			this.anInt7622 = arg0.method7333();
		} else if (arg1 == 5) {
			this.anInt7618 = arg0.method7333();
		} else if (arg1 == 6) {
			this.anInt7616 = arg0.method7333();
		} else if (arg1 == 7) {
			this.anInt7625 = arg0.method7291();
		} else if (arg1 == 8) {
			this.anInt7613 = arg0.method7291();
		} else if (arg1 == 9) {
			this.aByte107 = 3;
			this.anInt7623 = 8224;
		} else if (arg1 == 10) {
			this.aBoolean514 = true;
		} else if (arg1 == 11) {
			this.aByte107 = 1;
		} else if (arg1 == 12) {
			this.aByte107 = 4;
		} else if (arg1 == 13) {
			this.aByte107 = 5;
		} else if (arg1 == 14) {
			this.aByte107 = 2;
			this.anInt7623 = arg0.method7291() * 256;
		} else if (arg1 == 15) {
			this.aByte107 = 3;
			this.anInt7623 = arg0.method7333();
		} else if (arg1 == 16) {
			this.aByte107 = 3;
			this.anInt7623 = arg0.method7268();
		} else {
			@Pc(149) int local149;
			@Pc(159) int local159;
			if (arg1 == 40) {
				local149 = arg0.method7291();
				this.aShortArray111 = new short[local149];
				this.aShortArray112 = new short[local149];
				for (local159 = 0; local159 < local149; local159++) {
					this.aShortArray112[local159] = (short) arg0.method7333();
					this.aShortArray111[local159] = (short) arg0.method7333();
				}
			} else if (arg1 == 41) {
				local149 = arg0.method7291();
				this.aShortArray114 = new short[local149];
				this.aShortArray113 = new short[local149];
				for (local159 = 0; local159 < local149; local159++) {
					this.aShortArray114[local159] = (short) arg0.method7333();
					this.aShortArray113[local159] = (short) arg0.method7333();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!aia;IIIILclient!ha;I)Lclient!ka;")
	public Class43 method6637(@OriginalArg(0) Class14 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class100 arg4, @OriginalArg(6) int arg5) {
		return this.method6630(0, 0, arg5, arg1, false, arg0, arg4, 0, (byte) 2, arg2, (Class84) null, (Class84) null, arg3);
	}
}
