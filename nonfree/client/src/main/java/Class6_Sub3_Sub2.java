import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class6_Sub3_Sub2 extends Class6_Sub3 {

	@OriginalMember(owner = "client!ud", name = "A", descriptor = "[Lclient!ab;")
	private final Class3[] aClass3Array1 = new Class3[8];

	@OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
	private final int anInt3056 = 16;

	@OriginalMember(owner = "client!ud", name = "D", descriptor = "Lclient!ab;")
	private final Class3 aClass3_10 = new Class3();

	@OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
	private int anInt3058 = -1;

	@OriginalMember(owner = "client!ud", name = "F", descriptor = "I")
	private int anInt3057 = 0;

	@OriginalMember(owner = "client!ud", name = "H", descriptor = "I")
	private int anInt3059 = 0;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub2() {
		for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
			this.aClass3Array1[local24] = new Class3();
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ke;Lclient!hb;)V")
	private void method1974(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class6_Sub6 arg1) {
		while (arg0 != this.aClass3_10.aClass6_1 && ((Class6_Sub6) arg0).anInt1332 <= arg1.anInt1332) {
			arg0 = arg0.aClass6_99;
		}
		this.aClass3_10.method37(arg1, arg0);
		this.anInt3058 = ((Class6_Sub6) this.aClass3_10.aClass6_1.aClass6_99).anInt1332;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!c;)V")
	public synchronized void method1975(@OriginalArg(0) Class6_Sub3 arg0) {
		@Pc(5) Class3 local5 = this.aClass3Array1[Static122.method1978(arg0)];
		local5.method29(arg0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "([III)I")
	@Override
	public synchronized int method1972(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(39) int local39;
		do {
			if (this.anInt3058 < 0) {
				return this.method1977(arg0, arg1, arg2);
			}
			if (this.anInt3059 + arg2 < this.anInt3058) {
				this.anInt3059 += arg2;
				return this.method1977(arg0, arg1, arg2);
			}
			@Pc(33) int local33 = this.anInt3058 - this.anInt3059;
			local39 = this.method1977(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt3059 += local33;
			this.method1979();
			@Pc(61) Class6_Sub6 local61 = (Class6_Sub6) this.aClass3_10.method31();
			synchronized (local61) {
				@Pc(69) int local69 = local61.method859(this);
				if (local69 < 0) {
					local61.anInt1332 = 0;
					this.method1981(local61);
				} else {
					local61.anInt1332 = local69;
					this.method1974(local61.aClass6_99, local61);
				}
			}
		} while (arg2 != 0);
		return local39;
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V")
	private void method1976(@OriginalArg(0) int arg0) {
		this.anInt3057 -= arg0;
		if (this.anInt3057 < 0) {
			this.anInt3057 = 0;
		}
		for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
			@Pc(19) Class3 local19 = this.aClass3Array1[local13];
			for (@Pc(24) Class6_Sub3 local24 = (Class6_Sub3) local19.method31(); local24 != null; local24 = (Class6_Sub3) local19.method26()) {
				local24.method1973(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "([III)I")
	private int method1977(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3057 -= arg2;
		@Pc(18) int local18;
		@Pc(24) Class3 local24;
		@Pc(29) Class6_Sub3 local29;
		@Pc(33) int local33;
		if (this.anInt3057 <= 0) {
			this.anInt3057 += Static59.anInt1823 >> 4;
			for (local18 = 0; local18 < 8; local18++) {
				local24 = this.aClass3Array1[local18];
				for (local29 = (Class6_Sub3) local24.method31(); local29 != null; local29 = (Class6_Sub3) local24.method26()) {
					local33 = Static122.method1978(local29);
					if (local33 != local18) {
						this.aClass3Array1[local33].method29(local29);
					}
				}
			}
		}
		for (local18 = 0; local18 < 8; local18++) {
			local24 = this.aClass3Array1[local18];
			for (local29 = (Class6_Sub3) local24.method31(); local29 != null; local29 = (Class6_Sub3) local24.method26()) {
				local29.aBoolean156 = false;
				if (local29.aClass6_Sub4_3 != null) {
					local29.aClass6_Sub4_3.anInt909 = 0;
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
					@Pc(137) Class3 local137 = this.aClass3Array1[local102];
					for (@Pc(142) Class6_Sub3 local142 = (Class6_Sub3) local137.method31(); local142 != null; local142 = (Class6_Sub3) local137.method26()) {
						if (!local142.aBoolean156) {
							@Pc(149) Class6_Sub4 local149 = local142.aClass6_Sub4_3;
							if (local149 == null || local149.anInt909 <= local107) {
								if (local91 < this.anInt3056) {
									@Pc(172) int local172 = local142.method1972(arg0, arg1, arg2);
									local91 += local172;
									if (local149 != null) {
										local149.anInt909 += local172;
									}
								} else {
									local142.method1973(arg2);
								}
								local142.aBoolean156 = true;
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

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "()V")
	private void method1979() {
		if (this.anInt3059 <= 0) {
			return;
		}
		for (@Pc(8) Class6_Sub6 local8 = (Class6_Sub6) this.aClass3_10.method31(); local8 != null; local8 = (Class6_Sub6) this.aClass3_10.method26()) {
			local8.anInt1332 -= this.anInt3059;
		}
		this.anInt3058 -= this.anInt3059;
		this.anInt3059 = 0;
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(Lclient!c;)V")
	public synchronized void method1980(@OriginalArg(0) Class6_Sub3 arg0) {
		arg0.method2083();
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1973(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt3058 < 0) {
				this.method1976(arg0);
				return;
			}
			if (this.anInt3059 + arg0 < this.anInt3058) {
				this.anInt3059 += arg0;
				this.method1976(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt3058 - this.anInt3059;
			this.method1976(local29);
			arg0 -= local29;
			this.anInt3059 += local29;
			this.method1979();
			@Pc(50) Class6_Sub6 local50 = (Class6_Sub6) this.aClass3_10.method31();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method859(this);
				if (local58 < 0) {
					local50.anInt1332 = 0;
					this.method1981(local50);
				} else {
					local50.anInt1332 = local58;
					this.method1974(local50.aClass6_99, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!hb;)V")
	private void method1981(@OriginalArg(0) Class6_Sub6 arg0) {
		arg0.method2083();
		arg0.method860();
		@Pc(9) Class6 local9 = this.aClass3_10.aClass6_1.aClass6_99;
		if (local9 == this.aClass3_10.aClass6_1) {
			this.anInt3058 = -1;
		} else {
			this.anInt3058 = ((Class6_Sub6) local9).anInt1332;
		}
	}
}
