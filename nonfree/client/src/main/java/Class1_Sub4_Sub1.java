import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class1_Sub4_Sub1 extends Class1_Sub4 {

	@OriginalMember(owner = "client!e", name = "G", descriptor = "I")
	private final int anInt729 = 16;

	@OriginalMember(owner = "client!e", name = "E", descriptor = "[Lclient!oe;")
	private final Class45[] aClass45Array1 = new Class45[8];

	@OriginalMember(owner = "client!e", name = "H", descriptor = "Lclient!oe;")
	private final Class45 aClass45_2 = new Class45();

	@OriginalMember(owner = "client!e", name = "I", descriptor = "I")
	private int anInt730 = 0;

	@OriginalMember(owner = "client!e", name = "K", descriptor = "I")
	private int anInt732 = 0;

	@OriginalMember(owner = "client!e", name = "J", descriptor = "I")
	private int anInt731 = -1;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub1() {
		for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
			this.aClass45Array1[local24] = new Class45();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!fc;)V")
	public synchronized void method370(@OriginalArg(0) Class1_Sub4 arg0) {
		arg0.method1913();
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(Lclient!fc;)V")
	public synchronized void method371(@OriginalArg(0) Class1_Sub4 arg0) {
		@Pc(5) Class45 local5 = this.aClass45Array1[Static117.method373(arg0)];
		local5.method1297(arg0);
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method930(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt731 < 0) {
				this.method376(arg0);
				return;
			}
			if (this.anInt730 + arg0 < this.anInt731) {
				this.anInt730 += arg0;
				this.method376(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt731 - this.anInt730;
			this.method376(local29);
			arg0 -= local29;
			this.anInt730 += local29;
			this.method375();
			@Pc(50) Class1_Sub3 local50 = (Class1_Sub3) this.aClass45_2.method1299();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method263(this);
				if (local58 < 0) {
					local50.anInt478 = 0;
					this.method372(local50);
				} else {
					local50.anInt478 = local58;
					this.method377(local50.aClass1_101, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!da;)V")
	private void method372(@OriginalArg(0) Class1_Sub3 arg0) {
		arg0.method1913();
		arg0.method264();
		@Pc(9) Class1 local9 = this.aClass45_2.aClass1_71.aClass1_101;
		if (local9 == this.aClass45_2.aClass1_71) {
			this.anInt731 = -1;
		} else {
			this.anInt731 = ((Class1_Sub3) local9).anInt478;
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "([III)I")
	private int method374(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt732 -= arg2;
		@Pc(18) int local18;
		@Pc(24) Class45 local24;
		@Pc(29) Class1_Sub4 local29;
		@Pc(33) int local33;
		if (this.anInt732 <= 0) {
			this.anInt732 += Static109.anInt2826 >> 4;
			for (local18 = 0; local18 < 8; local18++) {
				local24 = this.aClass45Array1[local18];
				for (local29 = (Class1_Sub4) local24.method1299(); local29 != null; local29 = (Class1_Sub4) local24.method1288()) {
					local33 = Static117.method373(local29);
					if (local33 != local18) {
						this.aClass45Array1[local33].method1297(local29);
					}
				}
			}
		}
		for (local18 = 0; local18 < 8; local18++) {
			local24 = this.aClass45Array1[local18];
			for (local29 = (Class1_Sub4) local24.method1299(); local29 != null; local29 = (Class1_Sub4) local24.method1288()) {
				local29.aBoolean73 = false;
				if (local29.aClass1_Sub9_3 != null) {
					local29.aClass1_Sub9_3.anInt2567 = 0;
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
					@Pc(137) Class45 local137 = this.aClass45Array1[local102];
					for (@Pc(142) Class1_Sub4 local142 = (Class1_Sub4) local137.method1299(); local142 != null; local142 = (Class1_Sub4) local137.method1288()) {
						if (!local142.aBoolean73) {
							@Pc(149) Class1_Sub9 local149 = local142.aClass1_Sub9_3;
							if (local149 == null || local149.anInt2567 <= local107) {
								if (local91 < this.anInt729) {
									@Pc(172) int local172 = local142.method929(arg0, arg1, arg2);
									local91 += local172;
									if (local149 != null) {
										local149.anInt2567 += local172;
									}
								} else {
									local142.method930(arg2);
								}
								local142.aBoolean73 = true;
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

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([III)I")
	@Override
	public synchronized int method929(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(39) int local39;
		do {
			if (this.anInt731 < 0) {
				return this.method374(arg0, arg1, arg2);
			}
			if (this.anInt730 + arg2 < this.anInt731) {
				this.anInt730 += arg2;
				return this.method374(arg0, arg1, arg2);
			}
			@Pc(33) int local33 = this.anInt731 - this.anInt730;
			local39 = this.method374(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt730 += local33;
			this.method375();
			@Pc(61) Class1_Sub3 local61 = (Class1_Sub3) this.aClass45_2.method1299();
			synchronized (local61) {
				@Pc(69) int local69 = local61.method263(this);
				if (local69 < 0) {
					local61.anInt478 = 0;
					this.method372(local61);
				} else {
					local61.anInt478 = local69;
					this.method377(local61.aClass1_101, local61);
				}
			}
		} while (arg2 != 0);
		return local39;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()V")
	private void method375() {
		if (this.anInt730 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub3 local8 = (Class1_Sub3) this.aClass45_2.method1299(); local8 != null; local8 = (Class1_Sub3) this.aClass45_2.method1288()) {
			local8.anInt478 -= this.anInt730;
		}
		this.anInt731 -= this.anInt730;
		this.anInt730 = 0;
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V")
	private void method376(@OriginalArg(0) int arg0) {
		this.anInt732 -= arg0;
		if (this.anInt732 < 0) {
			this.anInt732 = 0;
		}
		for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
			@Pc(19) Class45 local19 = this.aClass45Array1[local13];
			for (@Pc(24) Class1_Sub4 local24 = (Class1_Sub4) local19.method1299(); local24 != null; local24 = (Class1_Sub4) local19.method1288()) {
				local24.method930(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!sa;Lclient!da;)V")
	private void method377(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub3 arg1) {
		while (arg0 != this.aClass45_2.aClass1_71 && ((Class1_Sub3) arg0).anInt478 <= arg1.anInt478) {
			arg0 = arg0.aClass1_101;
		}
		this.aClass45_2.method1296(arg0, arg1);
		this.anInt731 = ((Class1_Sub3) this.aClass45_2.aClass1_71.aClass1_101).anInt478;
	}
}
