import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class67 {

	@OriginalMember(owner = "client!fh", name = "m", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!fh", name = "n", descriptor = "[S")
	private short[] aShortArray38;

	@OriginalMember(owner = "client!fh", name = "p", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
	private int anInt2098;

	@OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
	public int anInt2099;

	@OriginalMember(owner = "client!fh", name = "w", descriptor = "[S")
	private short[] aShortArray40;

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "Z")
	public boolean aBoolean193 = false;

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
	public int anInt2088 = -1;

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
	private int anInt2094 = 128;

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
	private int anInt2090 = 128;

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
	private int anInt2095 = 0;

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "Z")
	public boolean aBoolean194 = false;

	@OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
	private int anInt2097 = 0;

	@OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
	private int anInt2100 = 0;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIILclient!uo;)Lclient!ge;")
	public Class73 method1823(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class32 arg4) {
		@Pc(7) int local7 = arg1;
		@Pc(23) Class24 local23 = this.anInt2088 == -1 || arg3 == -1 ? null : Static110.method5411(this.anInt2088);
		if (local23 != null) {
			local7 = arg1 | local23.method770(arg3, false, arg2);
		}
		if (this.anInt2090 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt2094 != 128 || this.anInt2097 != 0) {
			local7 |= 0x5;
		}
		@Pc(59) Class87 local59 = Static28.aClass87_5;
		@Pc(77) Class73 local77;
		synchronized (Static28.aClass87_5) {
			local77 = (Class73) Static28.aClass87_5.method2482((long) (this.anInt2099 |= arg4.anInt2472 << 29));
		}
		if (local77 == null || arg4.method2173(local77.method3298(), local7) != 0) {
			if (local77 != null) {
				local7 = arg4.method2159(local7, local77.method3298());
			}
			@Pc(104) int local104 = local7;
			if (this.aShortArray38 != null) {
				local104 = local7 | 0x2000;
			}
			if (this.aShortArray40 != null) {
				local104 |= 0x4000;
			}
			@Pc(125) Class82 local125 = Static221.method4154(this.anInt2098, Static122.aClass216_42);
			if (local125 == null) {
				return null;
			}
			local77 = arg4.method2153(local125, local104, Static111.anInt2596, this.anInt2100 + 64, this.anInt2095 + 850);
			@Pc(148) int local148;
			if (this.aShortArray38 != null) {
				for (local148 = 0; local148 < this.aShortArray38.length; local148++) {
					local77.method3300(this.aShortArray38[local148], this.aShortArray37[local148]);
				}
			}
			if (this.aShortArray40 != null) {
				for (local148 = 0; local148 < this.aShortArray40.length; local148++) {
					local77.method3292(this.aShortArray40[local148], this.aShortArray39[local148]);
				}
			}
			local77.method3287(local7);
			@Pc(194) Class87 local194 = Static28.aClass87_5;
			synchronized (Static28.aClass87_5) {
				Static28.aClass87_5.method2481(local77, (long) (this.anInt2099 |= arg4.anInt2472 << 29));
			}
		}
		@Pc(236) Class73 local236 = local23 == null ? local77.method3306((byte) 2, local7, true) : local23.method769(arg3, arg0, (byte) 2, 0, arg2, local77, local7);
		if (this.anInt2094 != 128 || this.anInt2090 != 128) {
			local236.method3290(this.anInt2094, this.anInt2090, this.anInt2094);
		}
		if (this.anInt2097 != 0) {
			if (this.anInt2097 == 90) {
				local236.method3319(4096);
			}
			if (this.anInt2097 == 180) {
				local236.method3319(8192);
			}
			if (this.anInt2097 == 270) {
				local236.method3319(12288);
			}
		}
		local236.method3287(arg1);
		return local236;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILclient!bg;)V")
	public void method1825(@OriginalArg(1) Class1_Sub8 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method4532();
			if (local15 == 0) {
				return;
			}
			this.method1828(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!bg;II)V")
	private void method1828(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2098 = arg0.method4556();
		} else if (arg1 == 2) {
			this.anInt2088 = arg0.method4556();
		} else if (arg1 == 4) {
			this.anInt2094 = arg0.method4556();
		} else if (arg1 == 5) {
			this.anInt2090 = arg0.method4556();
		} else if (arg1 == 6) {
			this.anInt2097 = arg0.method4556();
		} else if (arg1 == 7) {
			this.anInt2100 = arg0.method4532();
		} else if (arg1 == 8) {
			this.anInt2095 = arg0.method4532();
		} else if (arg1 == 9) {
			this.aBoolean194 = true;
		} else if (arg1 == 10) {
			this.aBoolean193 = true;
		} else {
			@Pc(96) int local96;
			@Pc(106) int local106;
			if (arg1 == 40) {
				local96 = arg0.method4532();
				this.aShortArray37 = new short[local96];
				this.aShortArray38 = new short[local96];
				for (local106 = 0; local106 < local96; local106++) {
					this.aShortArray38[local106] = (short) arg0.method4556();
					this.aShortArray37[local106] = (short) arg0.method4556();
				}
			} else if (arg1 == 41) {
				local96 = arg0.method4532();
				this.aShortArray40 = new short[local96];
				this.aShortArray39 = new short[local96];
				for (local106 = 0; local106 < local96; local106++) {
					this.aShortArray40[local106] = (short) arg0.method4556();
					this.aShortArray39[local106] = (short) arg0.method4556();
				}
				return;
			}
		}
	}
}
