import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class91 {

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "[S")
	private short[] aShortArray48;

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "Lclient!sg;")
	public Class211 aClass211_1;

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!hf", name = "l", descriptor = "[S")
	private short[] aShortArray50;

	@OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
	private int anInt2449;

	@OriginalMember(owner = "client!hf", name = "r", descriptor = "[S")
	private short[] aShortArray51;

	@OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
	public int anInt2450;

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
	private int anInt2442 = 0;

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
	private int anInt2444 = 128;

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
	private int anInt2443 = 0;

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "Z")
	public boolean aBoolean177 = false;

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
	public int anInt2445 = -1;

	@OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
	private int anInt2451 = 128;

	@OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
	private int anInt2447 = 0;

	@OriginalMember(owner = "client!hf", name = "q", descriptor = "Z")
	public boolean aBoolean178 = false;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLclient!bt;)V", line = 28)
	public void method2432(@OriginalArg(1) Class2_Sub4 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4816();
			if (local17 == 0) {
				return;
			}
			this.method2433(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!bt;I)V", line = 57)
	private void method2433(@OriginalArg(1) Class2_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2449 = arg0.method4830();
		} else if (arg1 == 2) {
			this.anInt2445 = arg0.method4830();
		} else if (arg1 == 4) {
			this.anInt2451 = arg0.method4830();
		} else if (arg1 == 5) {
			this.anInt2444 = arg0.method4830();
		} else if (arg1 == 6) {
			this.anInt2442 = arg0.method4830();
		} else if (arg1 == 7) {
			this.anInt2443 = arg0.method4816();
		} else if (arg1 == 8) {
			this.anInt2447 = arg0.method4816();
		} else if (arg1 == 9) {
			this.aBoolean178 = true;
		} else if (arg1 == 10) {
			this.aBoolean177 = true;
		} else {
			@Pc(96) int local96;
			@Pc(106) int local106;
			if (arg1 == 40) {
				local96 = arg0.method4816();
				this.aShortArray51 = new short[local96];
				this.aShortArray48 = new short[local96];
				for (local106 = 0; local106 < local96; local106++) {
					this.aShortArray51[local106] = (short) arg0.method4830();
					this.aShortArray48[local106] = (short) arg0.method4830();
				}
			} else if (arg1 == 41) {
				local96 = arg0.method4816();
				this.aShortArray50 = new short[local96];
				this.aShortArray49 = new short[local96];
				for (local106 = 0; local106 < local96; local106++) {
					this.aShortArray50[local106] = (short) arg0.method4830();
					this.aShortArray49[local106] = (short) arg0.method4830();
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILclient!wm;BILclient!gp;I)Lclient!gn;", line = 180)
	public Class31 method2435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class85 arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg3;
		@Pc(23) Class157 local23 = this.anInt2445 == -1 || arg5 == -1 ? null : arg4.method2373(this.anInt2445);
		if (local23 != null) {
			local7 = arg3 | local23.method3991(arg5, false, arg0);
		}
		if (this.anInt2444 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt2451 != 128 || this.anInt2442 != 0) {
			local7 |= 0x5;
		}
		@Pc(62) Class98 local62 = this.aClass211_1.aClass98_51;
		@Pc(82) Class31 local82;
		synchronized (this.aClass211_1.aClass98_51) {
			local82 = (Class31) this.aClass211_1.aClass98_51.method2614((long) (this.anInt2450 |= arg2.anInt2833 << 29));
		}
		if (local82 == null || arg2.method2865(local82.method3828(), local7) != 0) {
			if (local82 != null) {
				local7 = arg2.method2808(local7, local82.method3828());
			}
			@Pc(109) int local109 = local7;
			if (this.aShortArray51 != null) {
				local109 = local7 | 0x2000;
			}
			if (this.aShortArray50 != null) {
				local109 |= 0x4000;
			}
			@Pc(132) Class185 local132 = Static275.method2428(this.aClass211_1.aClass197_81, this.anInt2449);
			if (local132 == null) {
				return null;
			}
			local82 = arg2.method2866(local132, local109, this.aClass211_1.anInt5946, this.anInt2443 + 64, this.anInt2447 + 850);
			@Pc(157) int local157;
			if (this.aShortArray51 != null) {
				for (local157 = 0; local157 < this.aShortArray51.length; local157++) {
					local82.method3839(this.aShortArray51[local157], this.aShortArray48[local157]);
				}
			}
			if (this.aShortArray50 != null) {
				for (local157 = 0; local157 < this.aShortArray50.length; local157++) {
					local82.method3817(this.aShortArray50[local157], this.aShortArray49[local157]);
				}
			}
			local82.method3815(local7);
			@Pc(209) Class98 local209 = this.aClass211_1.aClass98_51;
			synchronized (this.aClass211_1.aClass98_51) {
				this.aClass211_1.aClass98_51.method2626((long) (this.anInt2450 |= arg2.anInt2833 << 29), local82);
			}
		}
		@Pc(253) Class31 local253 = local23 == null ? local82.method3801((byte) 2, local7, true) : local23.method3988(arg0, (byte) 2, arg5, 0, arg1, local7, local82);
		if (this.anInt2451 != 128 || this.anInt2444 != 128) {
			local253.method3843(this.anInt2451, this.anInt2444, this.anInt2451);
		}
		if (this.anInt2442 != 0) {
			if (this.anInt2442 == 90) {
				local253.method3834(4096);
			}
			if (this.anInt2442 == 180) {
				local253.method3834(8192);
			}
			if (this.anInt2442 == 270) {
				local253.method3834(12288);
			}
		}
		local253.method3815(arg3);
		return local253;
	}
}
