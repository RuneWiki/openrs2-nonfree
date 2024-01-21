import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class3_Sub4_Sub2 extends Class3_Sub4 {

	@OriginalMember(owner = "client!sd", name = "H", descriptor = "I")
	private final int anInt2465 = 16;

	@OriginalMember(owner = "client!sd", name = "J", descriptor = "[Lclient!fc;")
	private final Class24[] aClass24Array1 = new Class24[8];

	@OriginalMember(owner = "client!sd", name = "I", descriptor = "Lclient!fc;")
	private final Class24 aClass24_71 = new Class24();

	@OriginalMember(owner = "client!sd", name = "K", descriptor = "I")
	private int anInt2466 = 0;

	@OriginalMember(owner = "client!sd", name = "M", descriptor = "I")
	private int anInt2468 = 0;

	@OriginalMember(owner = "client!sd", name = "L", descriptor = "I")
	private int anInt2467 = -1;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub2() {
		for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
			this.aClass24Array1[local24] = new Class24();
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "([III)I")
	private int method1568(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2466 -= arg2;
		@Pc(18) int local18;
		@Pc(24) Class24 local24;
		@Pc(29) Class3_Sub4 local29;
		@Pc(33) int local33;
		if (this.anInt2466 <= 0) {
			this.anInt2466 += Static14.anInt545 >> 4;
			for (local18 = 0; local18 < 8; local18++) {
				local24 = this.aClass24Array1[local18];
				for (local29 = (Class3_Sub4) local24.method534(); local29 != null; local29 = (Class3_Sub4) local24.method525()) {
					local33 = Static115.method1572(local29);
					if (local33 != local18) {
						this.aClass24Array1[local33].method524(local29);
					}
				}
			}
		}
		for (local18 = 0; local18 < 8; local18++) {
			local24 = this.aClass24Array1[local18];
			for (local29 = (Class3_Sub4) local24.method534(); local29 != null; local29 = (Class3_Sub4) local24.method525()) {
				local29.aBoolean153 = false;
				if (local29.aClass3_Sub5_3 != null) {
					local29.aClass3_Sub5_3.anInt855 = 0;
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
					@Pc(137) Class24 local137 = this.aClass24Array1[local102];
					for (@Pc(142) Class3_Sub4 local142 = (Class3_Sub4) local137.method534(); local142 != null; local142 = (Class3_Sub4) local137.method525()) {
						if (!local142.aBoolean153) {
							@Pc(149) Class3_Sub5 local149 = local142.aClass3_Sub5_3;
							if (local149 == null || local149.anInt855 <= local107) {
								if (local91 < this.anInt2465) {
									@Pc(172) int local172 = local142.method1567(arg0, arg1, arg2);
									local91 += local172;
									if (local149 != null) {
										local149.anInt855 += local172;
									}
								} else {
									local142.method1566(arg2);
								}
								local142.aBoolean153 = true;
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

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "()V")
	private void method1569() {
		if (this.anInt2468 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub3 local8 = (Class3_Sub3) this.aClass24_71.method534(); local8 != null; local8 = (Class3_Sub3) this.aClass24_71.method525()) {
			local8.anInt244 -= this.anInt2468;
		}
		this.anInt2467 -= this.anInt2468;
		this.anInt2468 = 0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!i;)V")
	public synchronized void method1570(@OriginalArg(0) Class3_Sub4 arg0) {
		arg0.method1852();
	}

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)V")
	private void method1571(@OriginalArg(0) int arg0) {
		this.anInt2466 -= arg0;
		if (this.anInt2466 < 0) {
			this.anInt2466 = 0;
		}
		for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
			@Pc(19) Class24 local19 = this.aClass24Array1[local13];
			for (@Pc(24) Class3_Sub4 local24 = (Class3_Sub4) local19.method534(); local24 != null; local24 = (Class3_Sub4) local19.method525()) {
				local24.method1566(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!bb;)V")
	private void method1573(@OriginalArg(0) Class3_Sub3 arg0) {
		arg0.method1852();
		arg0.method190();
		@Pc(9) Class3 local9 = this.aClass24_71.aClass3_27.aClass3_96;
		if (local9 == this.aClass24_71.aClass3_27) {
			this.anInt2467 = -1;
		} else {
			this.anInt2467 = ((Class3_Sub3) local9).anInt244;
		}
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(Lclient!i;)V")
	public synchronized void method1574(@OriginalArg(0) Class3_Sub4 arg0) {
		@Pc(5) Class24 local5 = this.aClass24Array1[Static115.method1572(arg0)];
		local5.method524(arg0);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!de;Lclient!bb;)V")
	private void method1575(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub3 arg1) {
		while (arg0 != this.aClass24_71.aClass3_27 && ((Class3_Sub3) arg0).anInt244 <= arg1.anInt244) {
			arg0 = arg0.aClass3_96;
		}
		this.aClass24_71.method523(arg0, arg1);
		this.anInt2467 = ((Class3_Sub3) this.aClass24_71.aClass3_27.aClass3_96).anInt244;
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method1566(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2467 < 0) {
				this.method1571(arg0);
				return;
			}
			if (this.anInt2468 + arg0 < this.anInt2467) {
				this.anInt2468 += arg0;
				this.method1571(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2467 - this.anInt2468;
			this.method1571(local29);
			arg0 -= local29;
			this.anInt2468 += local29;
			this.method1569();
			@Pc(50) Class3_Sub3 local50 = (Class3_Sub3) this.aClass24_71.method534();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method191(this);
				if (local58 < 0) {
					local50.anInt244 = 0;
					this.method1573(local50);
				} else {
					local50.anInt244 = local58;
					this.method1575(local50.aClass3_96, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([III)I")
	@Override
	public synchronized int method1567(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(39) int local39;
		do {
			if (this.anInt2467 < 0) {
				return this.method1568(arg0, arg1, arg2);
			}
			if (this.anInt2468 + arg2 < this.anInt2467) {
				this.anInt2468 += arg2;
				return this.method1568(arg0, arg1, arg2);
			}
			@Pc(33) int local33 = this.anInt2467 - this.anInt2468;
			local39 = this.method1568(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2468 += local33;
			this.method1569();
			@Pc(61) Class3_Sub3 local61 = (Class3_Sub3) this.aClass24_71.method534();
			synchronized (local61) {
				@Pc(69) int local69 = local61.method191(this);
				if (local69 < 0) {
					local61.anInt244 = 0;
					this.method1573(local61);
				} else {
					local61.anInt244 = local69;
					this.method1575(local61.aClass3_96, local61);
				}
			}
		} while (arg2 != 0);
		return local39;
	}
}
