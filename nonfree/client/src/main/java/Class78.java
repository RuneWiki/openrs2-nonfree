import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class78 {

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "[I")
	public static final int[] anIntArray213 = new int[4096];

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "[S")
	private short[] aShortArray57;

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
	private int anInt2299;

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "[S")
	private short[] aShortArray58;

	@OriginalMember(owner = "client!gj", name = "j", descriptor = "[S")
	private short[] aShortArray59;

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "[S")
	private short[] aShortArray60;

	@OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
	public int anInt2304;

	@OriginalMember(owner = "client!gj", name = "i", descriptor = "Z")
	public boolean aBoolean160 = false;

	@OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
	private int anInt2303 = 0;

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "Z")
	public boolean aBoolean161 = false;

	@OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
	public int anInt2302 = -1;

	@OriginalMember(owner = "client!gj", name = "x", descriptor = "I")
	private int anInt2309 = 128;

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
	private int anInt2297 = 0;

	@OriginalMember(owner = "client!gj", name = "y", descriptor = "I")
	private int anInt2310 = 0;

	@OriginalMember(owner = "client!gj", name = "z", descriptor = "I")
	private int anInt2311 = 128;

	static {
		for (@Pc(6) int local6 = 0; local6 < 4096; local6++) {
			anIntArray213[local6] = Static251.method2945(local6);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLclient!jg;)V")
	public void method2265(@OriginalArg(1) Class14_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2548();
			if (local5 == 0) {
				return;
			}
			this.method2268(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIILclient!e;I)Lclient!id;")
	public Class45 method2266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class46 arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = arg2;
		@Pc(22) Class79 local22 = this.anInt2302 == -1 || arg1 == -1 ? null : Static233.method4080(this.anInt2302);
		if (local22 != null) {
			local7 = arg2 | local22.method2295(false, arg0, arg1);
		}
		if (this.anInt2309 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt2311 != 128 || this.anInt2310 != 0) {
			local7 |= 0x5;
		}
		@Pc(57) Class11 local57 = Static24.aClass11_16;
		@Pc(75) Class45 local75;
		synchronized (Static24.aClass11_16) {
			local75 = (Class45) Static24.aClass11_16.method209((long) (this.anInt2304 |= arg3.anInt5722 << 29));
		}
		if (local75 == null || arg3.method5149(local75.method1809(), local7) != 0) {
			if (local75 != null) {
				local7 = arg3.method5112(local7, local75.method1809());
			}
			@Pc(102) int local102 = local7;
			if (this.aShortArray59 != null) {
				local102 = local7 | 0x2000;
			}
			if (this.aShortArray57 != null) {
				local102 |= 0x4000;
			}
			@Pc(123) Class71 local123 = Static222.method3992(this.anInt2299, Static171.aClass143_71);
			if (local123 == null) {
				return null;
			}
			local75 = arg3.method5148(local123, local102, Static161.anInt3398, this.anInt2303 + 64, this.anInt2297 - -850);
			@Pc(146) int local146;
			if (this.aShortArray59 != null) {
				for (local146 = 0; local146 < this.aShortArray59.length; local146++) {
					local75.method1821(this.aShortArray59[local146], this.aShortArray58[local146]);
				}
			}
			if (this.aShortArray57 != null) {
				for (local146 = 0; local146 < this.aShortArray57.length; local146++) {
					local75.method1824(this.aShortArray57[local146], this.aShortArray60[local146]);
				}
			}
			local75.method1782(local7);
			@Pc(196) Class11 local196 = Static24.aClass11_16;
			synchronized (Static24.aClass11_16) {
				Static24.aClass11_16.method219((long) (this.anInt2304 |= arg3.anInt5722 << 29), local75);
			}
		}
		@Pc(238) Class45 local238 = local22 == null ? local75.method1793((byte) 2, local7, true) : local22.method2301(arg4, (byte) 2, local7, arg0, arg1, local75, 0);
		if (this.anInt2311 != 128 || this.anInt2309 != 128) {
			local238.method1802(this.anInt2311, this.anInt2309, this.anInt2311);
		}
		if (this.anInt2310 != 0) {
			if (this.anInt2310 == 90) {
				local238.method1797(4096);
			}
			if (this.anInt2310 == 180) {
				local238.method1797(8192);
			}
			if (this.anInt2310 == 270) {
				local238.method1797(12288);
			}
		}
		local238.method1782(arg2);
		return local238;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IILclient!jg;)V")
	private void method2268(@OriginalArg(0) int arg0, @OriginalArg(2) Class14_Sub4 arg1) {
		if (arg0 == 1) {
			this.anInt2299 = arg1.method2498();
		} else if (arg0 == 2) {
			this.anInt2302 = arg1.method2498();
		} else if (arg0 == 4) {
			this.anInt2311 = arg1.method2498();
		} else if (arg0 == 5) {
			this.anInt2309 = arg1.method2498();
		} else if (arg0 == 6) {
			this.anInt2310 = arg1.method2498();
		} else if (arg0 == 7) {
			this.anInt2303 = arg1.method2548();
		} else if (arg0 == 8) {
			this.anInt2297 = arg1.method2548();
		} else if (arg0 == 9) {
			this.aBoolean160 = true;
		} else if (arg0 == 10) {
			this.aBoolean161 = true;
		} else {
			@Pc(80) int local80;
			@Pc(90) int local90;
			if (arg0 == 40) {
				local80 = arg1.method2548();
				this.aShortArray58 = new short[local80];
				this.aShortArray59 = new short[local80];
				for (local90 = 0; local90 < local80; local90++) {
					this.aShortArray59[local90] = (short) arg1.method2498();
					this.aShortArray58[local90] = (short) arg1.method2498();
				}
			} else if (arg0 == 41) {
				local80 = arg1.method2548();
				this.aShortArray60 = new short[local80];
				this.aShortArray57 = new short[local80];
				for (local90 = 0; local90 < local80; local90++) {
					this.aShortArray57[local90] = (short) arg1.method2498();
					this.aShortArray60[local90] = (short) arg1.method2498();
				}
			}
		}
	}
}
