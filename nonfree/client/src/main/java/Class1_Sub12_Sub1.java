import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class1_Sub12_Sub1 extends Class1_Sub12 {

	@OriginalMember(owner = "client!rc", name = "x", descriptor = "[Lclient!fa;")
	private final Class22[] aClass22Array1 = new Class22[8];

	@OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
	private final int anInt2285 = 16;

	@OriginalMember(owner = "client!rc", name = "z", descriptor = "Lclient!fa;")
	private final Class22 aClass22_12 = new Class22();

	@OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
	private int anInt2286 = -1;

	@OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
	private int anInt2287 = 0;

	@OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
	private int anInt2288 = 0;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
	public Class1_Sub12_Sub1() {
		for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
			this.aClass22Array1[local24] = new Class22();
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!lc;Lclient!ic;)V")
	private void method1590(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub7 arg1) {
		while (arg0 != this.aClass22_12.aClass1_21 && ((Class1_Sub7) arg0).anInt1105 <= arg1.anInt1105) {
			arg0 = arg0.aClass1_95;
		}
		this.aClass22_12.method520(arg1, arg0);
		this.anInt2286 = ((Class1_Sub7) this.aClass22_12.aClass1_21.aClass1_95).anInt1105;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!oe;)V")
	public synchronized void method1591(@OriginalArg(0) Class1_Sub12 arg0) {
		@Pc(5) Class22 local5 = this.aClass22Array1[Static116.method1597(arg0)];
		local5.method513(arg0);
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V")
	private void method1592(@OriginalArg(0) int arg0) {
		this.anInt2287 -= arg0;
		if (this.anInt2287 < 0) {
			this.anInt2287 = 0;
		}
		for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
			@Pc(19) Class22 local19 = this.aClass22Array1[local13];
			for (@Pc(24) Class1_Sub12 local24 = (Class1_Sub12) local19.method515(); local24 != null; local24 = (Class1_Sub12) local19.method519()) {
				local24.method1785(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "()V")
	private void method1593() {
		if (this.anInt2288 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub7 local8 = (Class1_Sub7) this.aClass22_12.method515(); local8 != null; local8 = (Class1_Sub7) this.aClass22_12.method519()) {
			local8.anInt1105 -= this.anInt2288;
		}
		this.anInt2286 -= this.anInt2288;
		this.anInt2288 = 0;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1785(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2286 < 0) {
				this.method1592(arg0);
				return;
			}
			if (this.anInt2288 + arg0 < this.anInt2286) {
				this.anInt2288 += arg0;
				this.method1592(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2286 - this.anInt2288;
			this.method1592(local29);
			arg0 -= local29;
			this.anInt2288 += local29;
			this.method1593();
			@Pc(50) Class1_Sub7 local50 = (Class1_Sub7) this.aClass22_12.method515();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method752(this);
				if (local58 < 0) {
					local50.anInt1105 = 0;
					this.method1596(local50);
				} else {
					local50.anInt1105 = local58;
					this.method1590(local50.aClass1_95, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(Lclient!oe;)V")
	public synchronized void method1594(@OriginalArg(0) Class1_Sub12 arg0) {
		arg0.method1825();
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "([III)I")
	private int method1595(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2287 -= arg2;
		@Pc(18) int local18;
		@Pc(24) Class22 local24;
		@Pc(29) Class1_Sub12 local29;
		@Pc(33) int local33;
		if (this.anInt2287 <= 0) {
			this.anInt2287 += Static7.anInt234 >> 4;
			for (local18 = 0; local18 < 8; local18++) {
				local24 = this.aClass22Array1[local18];
				for (local29 = (Class1_Sub12) local24.method515(); local29 != null; local29 = (Class1_Sub12) local24.method519()) {
					local33 = Static116.method1597(local29);
					if (local33 != local18) {
						this.aClass22Array1[local33].method513(local29);
					}
				}
			}
		}
		for (local18 = 0; local18 < 8; local18++) {
			local24 = this.aClass22Array1[local18];
			for (local29 = (Class1_Sub12) local24.method515(); local29 != null; local29 = (Class1_Sub12) local24.method519()) {
				local29.aBoolean144 = false;
				if (local29.aClass1_Sub10_3 != null) {
					local29.aClass1_Sub10_3.anInt1555 = 0;
				}
			}
		}
		@Pc(91) int local91 = 0;
		@Pc(93) int local93 = 255;
		local33 = 7;
		while (local93 != 0) {
			@Pc(102) int local102;
			@Pc(107) int local107;
			if (local33 < 0) {
				local102 = local33 & 0x3;
				local107 = -(local33 >> 2);
			} else {
				local102 = local33;
				local107 = 0;
			}
			for (@Pc(118) int local118 = local93 >>> local102 & 0x11111111; local118 != 0; local118 >>>= 0x4) {
				if ((local118 & 0x1) != 0) {
					local93 &= ~(0x1 << local102);
					@Pc(137) Class22 local137 = this.aClass22Array1[local102];
					for (@Pc(142) Class1_Sub12 local142 = (Class1_Sub12) local137.method515(); local142 != null; local142 = (Class1_Sub12) local137.method519()) {
						if (!local142.aBoolean144) {
							@Pc(149) Class1_Sub10 local149 = local142.aClass1_Sub10_3;
							if (local149 == null || local149.anInt1555 <= local107) {
								if (local91 < this.anInt2285) {
									@Pc(172) int local172 = local142.method1786(arg0, arg1, arg2);
									local91 += local172;
									if (local149 != null) {
										local149.anInt1555 += local172;
									}
								} else {
									local142.method1785(arg2);
								}
								local142.aBoolean144 = true;
							} else {
								local93 |= 0x1 << local102;
							}
						}
					}
				}
				local102 += 4;
				local107++;
			}
			local33--;
		}
		return local91;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!ic;)V")
	private void method1596(@OriginalArg(0) Class1_Sub7 arg0) {
		arg0.method1825();
		arg0.method751();
		@Pc(9) Class1 local9 = this.aClass22_12.aClass1_21.aClass1_95;
		if (local9 == this.aClass22_12.aClass1_21) {
			this.anInt2286 = -1;
		} else {
			this.anInt2286 = ((Class1_Sub7) local9).anInt1105;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "([III)I")
	@Override
	public synchronized int method1786(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(39) int local39;
		do {
			if (this.anInt2286 < 0) {
				return this.method1595(arg0, arg1, arg2);
			}
			if (this.anInt2288 + arg2 < this.anInt2286) {
				this.anInt2288 += arg2;
				return this.method1595(arg0, arg1, arg2);
			}
			@Pc(33) int local33 = this.anInt2286 - this.anInt2288;
			local39 = this.method1595(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2288 += local33;
			this.method1593();
			@Pc(61) Class1_Sub7 local61 = (Class1_Sub7) this.aClass22_12.method515();
			synchronized (local61) {
				@Pc(69) int local69 = local61.method752(this);
				if (local69 < 0) {
					local61.anInt1105 = 0;
					this.method1596(local61);
				} else {
					local61.anInt1105 = local69;
					this.method1590(local61.aClass1_95, local61);
				}
			}
		} while (arg2 != 0);
		return local39;
	}
}
