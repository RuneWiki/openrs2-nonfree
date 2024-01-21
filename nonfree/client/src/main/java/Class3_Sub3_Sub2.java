import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class3_Sub3_Sub2 extends Class3_Sub3 {

	@OriginalMember(owner = "client!le", name = "K", descriptor = "[Lclient!dd;")
	private final Class20[] aClass20Array1 = new Class20[8];

	@OriginalMember(owner = "client!le", name = "L", descriptor = "I")
	private final int anInt1562 = 16;

	@OriginalMember(owner = "client!le", name = "J", descriptor = "Lclient!dd;")
	private final Class20 aClass20_7 = new Class20();

	@OriginalMember(owner = "client!le", name = "N", descriptor = "I")
	private int anInt1564 = 0;

	@OriginalMember(owner = "client!le", name = "M", descriptor = "I")
	private int anInt1563 = -1;

	@OriginalMember(owner = "client!le", name = "O", descriptor = "I")
	private int anInt1565 = 0;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub2() {
		for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
			this.aClass20Array1[local24] = new Class20();
		}
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method1047(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1563 < 0) {
				this.method1052(arg0);
				return;
			}
			if (this.anInt1564 + arg0 < this.anInt1563) {
				this.anInt1564 += arg0;
				this.method1052(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1563 - this.anInt1564;
			this.method1052(local29);
			arg0 -= local29;
			this.anInt1564 += local29;
			this.method1051();
			@Pc(50) Class3_Sub10 local50 = (Class3_Sub10) this.aClass20_7.method308();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1781(this);
				if (local58 < 0) {
					local50.anInt2619 = 0;
					this.method1054(local50);
				} else {
					local50.anInt2619 = local58;
					this.method1056(local50.aClass3_98, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "([III)I")
	private int method1050(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1565 -= arg2;
		@Pc(18) int local18;
		@Pc(24) Class20 local24;
		@Pc(29) Class3_Sub3 local29;
		@Pc(33) int local33;
		if (this.anInt1565 <= 0) {
			this.anInt1565 += Static89.anInt2053 >> 4;
			for (local18 = 0; local18 < 8; local18++) {
				local24 = this.aClass20Array1[local18];
				for (local29 = (Class3_Sub3) local24.method308(); local29 != null; local29 = (Class3_Sub3) local24.method309()) {
					local33 = Static118.method1053(local29);
					if (local33 != local18) {
						this.aClass20Array1[local33].method307(local29);
					}
				}
			}
		}
		for (local18 = 0; local18 < 8; local18++) {
			local24 = this.aClass20Array1[local18];
			for (local29 = (Class3_Sub3) local24.method308(); local29 != null; local29 = (Class3_Sub3) local24.method309()) {
				local29.aBoolean121 = false;
				if (local29.aClass3_Sub9_3 != null) {
					local29.aClass3_Sub9_3.anInt2415 = 0;
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
					@Pc(137) Class20 local137 = this.aClass20Array1[local102];
					for (@Pc(142) Class3_Sub3 local142 = (Class3_Sub3) local137.method308(); local142 != null; local142 = (Class3_Sub3) local137.method309()) {
						if (!local142.aBoolean121) {
							@Pc(149) Class3_Sub9 local149 = local142.aClass3_Sub9_3;
							if (local149 == null || local149.anInt2415 <= local107) {
								if (local91 < this.anInt1562) {
									@Pc(172) int local172 = local142.method1049(arg0, arg1, arg2);
									local91 += local172;
									if (local149 != null) {
										local149.anInt2415 += local172;
									}
								} else {
									local142.method1047(arg2);
								}
								local142.aBoolean121 = true;
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

	@OriginalMember(owner = "client!le", name = "a", descriptor = "([III)I")
	@Override
	public synchronized int method1049(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(39) int local39;
		do {
			if (this.anInt1563 < 0) {
				return this.method1050(arg0, arg1, arg2);
			}
			if (this.anInt1564 + arg2 < this.anInt1563) {
				this.anInt1564 += arg2;
				return this.method1050(arg0, arg1, arg2);
			}
			@Pc(33) int local33 = this.anInt1563 - this.anInt1564;
			local39 = this.method1050(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1564 += local33;
			this.method1051();
			@Pc(61) Class3_Sub10 local61 = (Class3_Sub10) this.aClass20_7.method308();
			synchronized (local61) {
				@Pc(69) int local69 = local61.method1781(this);
				if (local69 < 0) {
					local61.anInt2619 = 0;
					this.method1054(local61);
				} else {
					local61.anInt2619 = local69;
					this.method1056(local61.aClass3_98, local61);
				}
			}
		} while (arg2 != 0);
		return local39;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "()V")
	private void method1051() {
		if (this.anInt1564 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub10 local8 = (Class3_Sub10) this.aClass20_7.method308(); local8 != null; local8 = (Class3_Sub10) this.aClass20_7.method309()) {
			local8.anInt2619 -= this.anInt1564;
		}
		this.anInt1563 -= this.anInt1564;
		this.anInt1564 = 0;
	}

	@OriginalMember(owner = "client!le", name = "e", descriptor = "(I)V")
	private void method1052(@OriginalArg(0) int arg0) {
		this.anInt1565 -= arg0;
		if (this.anInt1565 < 0) {
			this.anInt1565 = 0;
		}
		for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
			@Pc(19) Class20 local19 = this.aClass20Array1[local13];
			for (@Pc(24) Class3_Sub3 local24 = (Class3_Sub3) local19.method308(); local24 != null; local24 = (Class3_Sub3) local19.method309()) {
				local24.method1047(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!ue;)V")
	private void method1054(@OriginalArg(0) Class3_Sub10 arg0) {
		arg0.method1930();
		arg0.method1782();
		@Pc(9) Class3 local9 = this.aClass20_7.aClass3_13.aClass3_98;
		if (local9 == this.aClass20_7.aClass3_13) {
			this.anInt1563 = -1;
		} else {
			this.anInt1563 = ((Class3_Sub10) local9).anInt2619;
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(Lclient!v;)V")
	public synchronized void method1055(@OriginalArg(0) Class3_Sub3 arg0) {
		@Pc(5) Class20 local5 = this.aClass20Array1[Static118.method1053(arg0)];
		local5.method307(arg0);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!be;Lclient!ue;)V")
	private void method1056(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub10 arg1) {
		while (arg0 != this.aClass20_7.aClass3_13 && ((Class3_Sub10) arg0).anInt2619 <= arg1.anInt2619) {
			arg0 = arg0.aClass3_98;
		}
		this.aClass20_7.method313(arg1, arg0);
		this.anInt1563 = ((Class3_Sub10) this.aClass20_7.aClass3_13.aClass3_98).anInt2619;
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(Lclient!v;)V")
	public synchronized void method1057(@OriginalArg(0) Class3_Sub3 arg0) {
		arg0.method1930();
	}
}
