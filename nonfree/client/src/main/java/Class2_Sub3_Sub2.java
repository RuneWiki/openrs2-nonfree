import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class2_Sub3_Sub2 extends Class2_Sub3 {

	@OriginalMember(owner = "client!w", name = "q", descriptor = "I")
	private final int anInt2965 = 32;

	@OriginalMember(owner = "client!w", name = "p", descriptor = "[Lclient!bb;")
	private final Class8[] aClass8Array1 = new Class8[8];

	@OriginalMember(owner = "client!w", name = "r", descriptor = "Lclient!bb;")
	private final Class8 aClass8_10 = new Class8();

	@OriginalMember(owner = "client!w", name = "t", descriptor = "I")
	private int anInt2967 = 0;

	@OriginalMember(owner = "client!w", name = "s", descriptor = "I")
	private int anInt2966 = 0;

	@OriginalMember(owner = "client!w", name = "u", descriptor = "I")
	private int anInt2968 = -1;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub2() {
		for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
			this.aClass8Array1[local24] = new Class8();
		}
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "()V")
	private void method2060() {
		if (this.anInt2967 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub14 local8 = (Class2_Sub14) this.aClass8_10.method175(); local8 != null; local8 = (Class2_Sub14) this.aClass8_10.method173()) {
			local8.anInt2688 -= this.anInt2967;
		}
		this.anInt2968 -= this.anInt2967;
		this.anInt2967 = 0;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!dd;)V")
	public synchronized void method2061(@OriginalArg(0) Class2_Sub3 arg0) {
		arg0.method2073();
	}

	@OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V")
	private void method2062(@OriginalArg(0) int arg0) {
		this.anInt2966 -= arg0;
		if (this.anInt2966 < 0) {
			this.anInt2966 = 0;
		}
		for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
			@Pc(19) Class8 local19 = this.aClass8Array1[local13];
			for (@Pc(24) Class2_Sub3 local24 = (Class2_Sub3) local19.method175(); local24 != null; local24 = (Class2_Sub3) local19.method173()) {
				local24.method2059(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!aa;Lclient!u;)V")
	private void method2063(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub14 arg1) {
		while (arg0 != this.aClass8_10.aClass2_11 && ((Class2_Sub14) arg0).anInt2688 <= arg1.anInt2688) {
			arg0 = arg0.aClass2_104;
		}
		this.aClass8_10.method186(arg0, arg1);
		this.anInt2968 = ((Class2_Sub14) this.aClass8_10.aClass2_11.aClass2_104).anInt2688;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!u;)V")
	private void method2064(@OriginalArg(0) Class2_Sub14 arg0) {
		arg0.method2073();
		arg0.method1906();
		@Pc(9) Class2 local9 = this.aClass8_10.aClass2_11.aClass2_104;
		if (local9 == this.aClass8_10.aClass2_11) {
			this.anInt2968 = -1;
		} else {
			this.anInt2968 = ((Class2_Sub14) local9).anInt2688;
		}
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(Lclient!dd;)V")
	public synchronized void method2065(@OriginalArg(0) Class2_Sub3 arg0) {
		@Pc(5) Class8 local5 = this.aClass8Array1[Static126.method2066(arg0)];
		local5.method188(arg0);
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method2059(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2968 < 0) {
				this.method2062(arg0);
				return;
			}
			if (this.anInt2967 + arg0 < this.anInt2968) {
				this.anInt2967 += arg0;
				this.method2062(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2968 - this.anInt2967;
			this.method2062(local29);
			arg0 -= local29;
			this.anInt2967 += local29;
			this.method2060();
			@Pc(50) Class2_Sub14 local50 = (Class2_Sub14) this.aClass8_10.method175();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1905(this);
				if (local58 < 0) {
					local50.anInt2688 = 0;
					this.method2064(local50);
				} else {
					local50.anInt2688 = local58;
					this.method2063(local50.aClass2_104, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "([III)I")
	private int method2067(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2966 -= arg2;
		@Pc(18) int local18;
		@Pc(24) Class8 local24;
		@Pc(29) Class2_Sub3 local29;
		@Pc(33) int local33;
		if (this.anInt2966 <= 0) {
			this.anInt2966 += Static3.anInt1282 >> 4;
			for (local18 = 0; local18 < 8; local18++) {
				local24 = this.aClass8Array1[local18];
				for (local29 = (Class2_Sub3) local24.method175(); local29 != null; local29 = (Class2_Sub3) local24.method173()) {
					local33 = Static126.method2066(local29);
					if (local33 != local18) {
						this.aClass8Array1[local33].method188(local29);
					}
				}
			}
		}
		for (local18 = 0; local18 < 8; local18++) {
			local24 = this.aClass8Array1[local18];
			for (local29 = (Class2_Sub3) local24.method175(); local29 != null; local29 = (Class2_Sub3) local24.method173()) {
				local29.aBoolean135 = false;
				if (local29.aClass2_Sub2_3 != null) {
					local29.aClass2_Sub2_3.anInt293 = 0;
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
					@Pc(137) Class8 local137 = this.aClass8Array1[local102];
					for (@Pc(142) Class2_Sub3 local142 = (Class2_Sub3) local137.method175(); local142 != null; local142 = (Class2_Sub3) local137.method173()) {
						if (!local142.aBoolean135) {
							@Pc(149) Class2_Sub2 local149 = local142.aClass2_Sub2_3;
							if (local149 == null || local149.anInt293 <= local107) {
								if (local91 < this.anInt2965) {
									@Pc(172) int local172 = local142.method2057(arg0, arg1, arg2);
									local91 += local172;
									if (local149 != null) {
										local149.anInt293 += local172;
									}
								} else {
									local142.method2059(arg2);
								}
								local142.aBoolean135 = true;
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

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([III)I")
	@Override
	public synchronized int method2057(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(39) int local39;
		do {
			if (this.anInt2968 < 0) {
				return this.method2067(arg0, arg1, arg2);
			}
			if (this.anInt2967 + arg2 < this.anInt2968) {
				this.anInt2967 += arg2;
				return this.method2067(arg0, arg1, arg2);
			}
			@Pc(33) int local33 = this.anInt2968 - this.anInt2967;
			local39 = this.method2067(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2967 += local33;
			this.method2060();
			@Pc(61) Class2_Sub14 local61 = (Class2_Sub14) this.aClass8_10.method175();
			synchronized (local61) {
				@Pc(69) int local69 = local61.method1905(this);
				if (local69 < 0) {
					local61.anInt2688 = 0;
					this.method2064(local61);
				} else {
					local61.anInt2688 = local69;
					this.method2063(local61.aClass2_104, local61);
				}
			}
		} while (arg2 != 0);
		return local39;
	}
}
