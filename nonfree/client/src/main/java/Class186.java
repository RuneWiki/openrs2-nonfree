import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lw")
public final class Class186 {

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "[S")
	private short[] aShortArray106;

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "[S")
	private short[] aShortArray107;

	@OriginalMember(owner = "client!lw", name = "f", descriptor = "[S")
	private short[] aShortArray108;

	@OriginalMember(owner = "client!lw", name = "i", descriptor = "I")
	public int anInt5834;

	@OriginalMember(owner = "client!lw", name = "j", descriptor = "Lclient!pn;")
	public Class231 aClass231_3;

	@OriginalMember(owner = "client!lw", name = "s", descriptor = "[S")
	private short[] aShortArray109;

	@OriginalMember(owner = "client!lw", name = "v", descriptor = "I")
	private int anInt5844;

	@OriginalMember(owner = "client!lw", name = "o", descriptor = "I")
	public int anInt5838 = -1;

	@OriginalMember(owner = "client!lw", name = "h", descriptor = "I")
	private int anInt5833 = 0;

	@OriginalMember(owner = "client!lw", name = "q", descriptor = "I")
	private int anInt5840 = 0;

	@OriginalMember(owner = "client!lw", name = "u", descriptor = "I")
	private int anInt5843 = 128;

	@OriginalMember(owner = "client!lw", name = "r", descriptor = "I")
	private int anInt5841 = 0;

	@OriginalMember(owner = "client!lw", name = "e", descriptor = "B")
	public byte aByte48 = 0;

	@OriginalMember(owner = "client!lw", name = "l", descriptor = "I")
	private int anInt5835 = -1;

	@OriginalMember(owner = "client!lw", name = "z", descriptor = "I")
	private int anInt5846 = 128;

	@OriginalMember(owner = "client!lw", name = "y", descriptor = "Z")
	public boolean aBoolean375 = false;

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!qi;IIILclient!oa;ZI)Lclient!ba;")
	public Class2 method4861(@OriginalArg(0) Class247 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(6) int arg5) {
		return this.method4867(arg3, null, 0, arg0, (byte) 5, arg2, arg4, null, arg5, 0, false, arg1, 0);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(BLclient!d;Lclient!qi;IIIIILclient!oa;ZLclient!d;II)Lclient!ba;")
	public Class2 method4862(@OriginalArg(1) Class52 arg0, @OriginalArg(2) Class247 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class5 arg7, @OriginalArg(10) Class52 arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10) {
		return this.method4867(arg2, arg8, arg10, arg1, (byte) 2, arg5, arg7, arg0, arg4, arg9, true, arg6, arg3);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILclient!rt;)V")
	public void method4864(@OriginalArg(1) Class3_Sub27 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method7548();
			if (local13 == 0) {
				return;
			}
			this.method4865(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(BLclient!rt;I)V")
	private void method4865(@OriginalArg(1) Class3_Sub27 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5844 = arg0.method7591();
		} else if (arg1 == 2) {
			this.anInt5838 = arg0.method7591();
		} else if (arg1 == 4) {
			this.anInt5846 = arg0.method7591();
		} else if (arg1 == 5) {
			this.anInt5843 = arg0.method7591();
		} else if (arg1 == 6) {
			this.anInt5840 = arg0.method7591();
		} else if (arg1 == 7) {
			this.anInt5833 = arg0.method7548();
		} else if (arg1 == 8) {
			this.anInt5841 = arg0.method7548();
		} else if (arg1 == 9) {
			this.aByte48 = 3;
			this.anInt5835 = 8224;
		} else if (arg1 == 10) {
			this.aBoolean375 = true;
		} else if (arg1 == 11) {
			this.aByte48 = 1;
		} else if (arg1 == 12) {
			this.aByte48 = 4;
		} else if (arg1 == 13) {
			this.aByte48 = 5;
		} else if (arg1 == 14) {
			this.aByte48 = 2;
			this.anInt5835 = arg0.method7548() * 256;
		} else if (arg1 == 15) {
			this.aByte48 = 3;
			this.anInt5835 = arg0.method7591();
		} else if (arg1 == 16) {
			this.aByte48 = 3;
			this.anInt5835 = arg0.method7549();
		} else {
			@Pc(140) int local140;
			@Pc(150) int local150;
			if (arg1 == 40) {
				local140 = arg0.method7548();
				this.aShortArray109 = new short[local140];
				this.aShortArray108 = new short[local140];
				for (local150 = 0; local150 < local140; local150++) {
					this.aShortArray108[local150] = (short) arg0.method7591();
					this.aShortArray109[local150] = (short) arg0.method7591();
				}
			} else if (arg1 == 41) {
				local140 = arg0.method7548();
				this.aShortArray107 = new short[local140];
				this.aShortArray106 = new short[local140];
				for (local150 = 0; local150 < local140; local150++) {
					this.aShortArray106[local150] = (short) arg0.method7591();
					this.aShortArray107[local150] = (short) arg0.method7591();
				}
			}
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILclient!d;ILclient!qi;BILclient!oa;Lclient!d;IIZIII)Lclient!ba;")
	private Class2 method4867(@OriginalArg(0) int arg0, @OriginalArg(1) Class52 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class247 arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) Class52 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		@Pc(7) int local7 = arg0;
		@Pc(24) Class122 local24 = this.anInt5838 == -1 || arg11 == -1 ? null : arg3.method6029(this.anInt5838);
		@Pc(36) boolean local36 = arg10 & this.aByte48 != 0;
		if (local24 != null) {
			local7 = arg0 | local24.method3439(arg5, arg11, false);
		}
		if (local36) {
			local7 |= this.aByte48 == 3 ? 7 : 2;
		}
		if (this.anInt5843 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt5846 != 128 || this.anInt5840 != 0) {
			local7 |= 0x5;
		}
		@Pc(86) Class125 local86 = this.aClass231_3.aClass125_45;
		@Pc(108) Class2 local108;
		synchronized (this.aClass231_3.aClass125_45) {
			local108 = (Class2) this.aClass231_3.aClass125_45.method3512((long) (this.anInt5834 |= arg6.anInt9037 << 29));
		}
		if (local108 == null || arg6.method7435(local108.h(), local7) != 0) {
			if (local108 != null) {
				local7 = arg6.method7418(local7, local108.h());
			}
			@Pc(135) int local135 = local7;
			if (this.aShortArray108 != null) {
				local135 = local7 | 0x4000;
			}
			if (this.aShortArray106 != null) {
				local135 |= 0x8000;
			}
			@Pc(160) Class222 local160 = Static264.method4649(this.anInt5844, this.aClass231_3.aClass161_85);
			if (local160 == null) {
				return null;
			}
			if (local160.anInt6710 < 13) {
				local160.method5605();
			}
			local108 = arg6.method7443(local160, local135, this.aClass231_3.anInt7070, this.anInt5833 + 64, this.anInt5841 + 850);
			@Pc(195) int local195;
			if (this.aShortArray108 != null) {
				for (local195 = 0; local195 < this.aShortArray108.length; local195++) {
					local108.UA(this.aShortArray108[local195], this.aShortArray109[local195]);
				}
			}
			if (this.aShortArray106 != null) {
				for (local195 = 0; local195 < this.aShortArray106.length; local195++) {
					local108.ka(this.aShortArray106[local195], this.aShortArray107[local195]);
				}
			}
			local108.ia(local7);
			@Pc(251) Class125 local251 = this.aClass231_3.aClass125_45;
			synchronized (this.aClass231_3.aClass125_45) {
				this.aClass231_3.aClass125_45.method3519((long) (this.anInt5834 |= arg6.anInt9037 << 29), local108);
			}
		}
		@Pc(297) Class2 local297 = local24 == null ? local108.method5775(arg4, local7, true) : local24.method3446(local7, arg5, arg4, arg11, 0, local108, arg8);
		if (this.anInt5846 != 128 || this.anInt5843 != 128) {
			local297.l(this.anInt5846, this.anInt5843, this.anInt5846);
		}
		if (this.anInt5840 != 0) {
			if (this.anInt5840 == 90) {
				local297.I(4096);
			}
			if (this.anInt5840 == 180) {
				local297.I(8192);
			}
			if (this.anInt5840 == 270) {
				local297.I(12288);
			}
		}
		if (local36) {
			local297.OA(this.aByte48, this.anInt5835, arg7, arg1, arg12, arg2, arg9);
		}
		local297.ia(arg0);
		return local297;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IILclient!qi;ILclient!oa;II)Lclient!ba;")
	public Class2 method4868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class247 arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return this.method4867(arg1, null, 0, arg2, (byte) 2, arg4, arg3, null, arg5, 0, false, arg0, 0);
	}
}
