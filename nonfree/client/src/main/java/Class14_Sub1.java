import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!bj", name = "Z", descriptor = "Lclient!sa;")
	private Class86_Sub1 aClass86_Sub1_1;

	@OriginalMember(owner = "client!bj", name = "J", descriptor = "I")
	private int anInt423 = -32768;

	@OriginalMember(owner = "client!bj", name = "A", descriptor = "Lclient!tj;")
	private Class12_Sub2 aClass12_Sub2_1 = null;

	@OriginalMember(owner = "client!bj", name = "P", descriptor = "I")
	private int anInt428 = -1;

	@OriginalMember(owner = "client!bj", name = "N", descriptor = "I")
	private int anInt426 = 0;

	@OriginalMember(owner = "client!bj", name = "x", descriptor = "I")
	private int anInt415 = -1;

	@OriginalMember(owner = "client!bj", name = "G", descriptor = "I")
	private int anInt420 = 0;

	@OriginalMember(owner = "client!bj", name = "U", descriptor = "Z")
	private boolean aBoolean34 = false;

	@OriginalMember(owner = "client!bj", name = "bb", descriptor = "I")
	private int anInt435 = 0;

	@OriginalMember(owner = "client!bj", name = "X", descriptor = "Z")
	private boolean aBoolean35 = true;

	@OriginalMember(owner = "client!bj", name = "L", descriptor = "I")
	private int anInt424;

	@OriginalMember(owner = "client!bj", name = "I", descriptor = "I")
	private int anInt422;

	@OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
	private int anInt411;

	@OriginalMember(owner = "client!bj", name = "cb", descriptor = "I")
	private int anInt436;

	@OriginalMember(owner = "client!bj", name = "u", descriptor = "I")
	private int anInt413;

	@OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
	private int anInt409;

	@OriginalMember(owner = "client!bj", name = "F", descriptor = "Lclient!om;")
	private Class125 aClass125_1;

	@OriginalMember(owner = "client!bj", name = "S", descriptor = "I")
	private int anInt430;

	@OriginalMember(owner = "client!bj", name = "ab", descriptor = "I")
	private int anInt434;

	@OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
	private int anInt410;

	@OriginalMember(owner = "client!bj", name = "w", descriptor = "I")
	private int anInt414;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(IIIIIIIZLclient!dn;)V")
	public Class14_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class14 arg8) {
		this.anInt424 = arg1;
		this.anInt422 = arg3;
		this.anInt411 = arg4;
		this.anInt436 = arg2;
		this.anInt413 = arg0;
		this.anInt409 = arg5;
		@Pc(60) Class181 local60;
		if (Static277.aBoolean412 && arg8 != null) {
			if (arg8 instanceof Class14_Sub1) {
				((Class14_Sub1) arg8).method410();
			} else {
				local60 = Static183.method3511(this.anInt413);
				if (local60.anIntArray552 != null) {
					local60 = local60.method4427();
				}
				if (local60 != null) {
					Static233.method3604(this.anInt436, this.anInt422, local60, this.anInt409, 0, 0, this.anInt424, this.anInt411);
				}
			}
		}
		if (arg6 != -1) {
			this.aClass125_1 = Static90.method1591(arg6);
			this.anInt430 = 0;
			if (this.aClass125_1.anIntArray357.length <= 1) {
				this.anInt434 = 0;
			} else {
				this.anInt434 = 1;
			}
			this.anInt410 = Static237.anInt4710 - 1;
			this.anInt414 = 1;
			if (this.aClass125_1.anInt3941 == 0 && arg8 != null && arg8 instanceof Class14_Sub1) {
				@Pc(143) Class14_Sub1 local143 = (Class14_Sub1) arg8;
				if (local143.aClass125_1 == this.aClass125_1) {
					this.anInt430 = local143.anInt430;
					this.anInt434 = local143.anInt434;
					this.anInt410 = local143.anInt410;
					this.anInt414 = local143.anInt414;
					return;
				}
			}
			if (arg7 && this.aClass125_1.anInt3946 != -1) {
				this.anInt430 = (int) ((double) this.aClass125_1.anIntArray357.length * Math.random());
				this.anInt434 = this.anInt430 + 1;
				if (this.aClass125_1.anIntArray357.length <= this.anInt434) {
					this.anInt434 -= this.aClass125_1.anInt3946;
					if (this.anInt434 < 0 || this.aClass125_1.anIntArray357.length <= this.anInt434) {
						this.anInt434 = -1;
					}
				}
				this.anInt414 = (int) ((double) this.aClass125_1.anIntArray356[this.anInt430] * Math.random()) + 1;
				this.anInt410 = Static237.anInt4710 - this.anInt414;
			}
		}
		if (Static277.aBoolean412 && arg8 != null) {
			this.method407(true);
		}
		if (arg8 == null) {
			local60 = Static183.method3511(this.anInt413);
			if (local60.anIntArray552 != null) {
				this.aBoolean34 = true;
			}
		}
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(III)V")
	private void method404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass125_1 == null) {
			return;
		}
		@Pc(14) int local14 = Static237.anInt4710 - this.anInt410;
		if (local14 > 100 && this.aClass125_1.anInt3946 > 0) {
			@Pc(35) int local35 = this.aClass125_1.anIntArray357.length - this.aClass125_1.anInt3946;
			while (local35 > this.anInt430 && local14 > this.aClass125_1.anIntArray356[this.anInt430]) {
				local14 -= this.aClass125_1.anIntArray356[this.anInt430];
				this.anInt430++;
			}
			if (this.anInt430 >= local35) {
				@Pc(82) int local82 = 0;
				for (@Pc(84) int local84 = local35; local84 < this.aClass125_1.anIntArray357.length; local84++) {
					local82 += this.aClass125_1.anIntArray356[local84];
				}
				local14 %= local82;
			}
			this.anInt434 = this.anInt430 + 1;
			if (this.aClass125_1.anIntArray357.length <= this.anInt434) {
				this.anInt434 -= this.aClass125_1.anInt3946;
				if (this.anInt434 < 0 || this.aClass125_1.anIntArray357.length <= this.anInt434) {
					this.anInt434 = -1;
				}
			}
		}
		while (this.aClass125_1.anIntArray356[this.anInt430] < local14) {
			Static77.method1354(this.anInt430, false, arg1, this.aClass125_1, arg0);
			local14 -= this.aClass125_1.anIntArray356[this.anInt430];
			this.anInt430++;
			if (this.aClass125_1.anIntArray357.length <= this.anInt430) {
				this.anInt430 -= this.aClass125_1.anInt3946;
				if (this.anInt430 < 0 || this.aClass125_1.anIntArray357.length <= this.anInt430) {
					this.aClass125_1 = null;
					break;
				}
			}
			this.anInt434 = this.anInt430 + 1;
			if (this.anInt434 >= this.aClass125_1.anIntArray357.length) {
				this.anInt434 -= this.aClass125_1.anInt3946;
				if (this.anInt434 < 0 || this.anInt434 >= this.aClass125_1.anIntArray357.length) {
					this.anInt434 = -1;
				}
			}
		}
		this.anInt410 = Static237.anInt4710 - local14;
		this.anInt414 = local14;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIIIIJILclient!sa;)V")
	@Override
	public void method4097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class86_Sub1 arg10) {
		@Pc(7) Class14 local7 = this.method408();
		if (local7 != null) {
			local7.method4097(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass86_Sub1_1);
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static277.aBoolean412) {
			this.method407(true);
		} else {
			this.method404(arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZ)Lclient!dn;")
	private Class14 method407(@OriginalArg(1) boolean arg0) {
		@Pc(12) boolean local12 = Static55.anIntArrayArrayArray3 != Static108.anIntArrayArrayArray7;
		@Pc(17) Class181 local17 = Static183.method3511(this.anInt413);
		@Pc(20) int local20 = local17.anInt5579;
		if (local17.anIntArray552 != null) {
			local17 = local17.method4427();
		}
		if (local17 == null) {
			if (Static277.aBoolean412 && !local12) {
				this.method410();
			}
			return null;
		}
		@Pc(55) int local55;
		if (Static87.anInt1946 != 0 && this.aBoolean34 && (this.aClass125_1 == null || this.aClass125_1 != null && local17.anInt5579 != this.aClass125_1.anInt3945)) {
			local55 = local17.anInt5579;
			if (local17.anInt5579 == -1) {
				local55 = local20;
			}
			if (local55 == -1) {
				this.aClass125_1 = null;
			} else {
				this.aClass125_1 = Static90.method1591(local55);
			}
			if (this.aClass125_1 != null) {
				if (local17.aBoolean441 && this.aClass125_1.anInt3946 != -1) {
					this.anInt430 = (int) ((double) this.aClass125_1.anIntArray357.length * Math.random());
					this.anInt410 -= (int) ((double) this.aClass125_1.anIntArray356[this.anInt430] * Math.random());
				} else {
					this.anInt410 = Static237.anInt4710 - 1;
					this.anInt430 = 0;
				}
			}
		}
		local55 = this.anInt436 & 0x3;
		@Pc(153) int local153;
		@Pc(150) int local150;
		if (local55 == 1 || local55 == 3) {
			local150 = local17.anInt5559;
			local153 = local17.anInt5534;
		} else {
			local150 = local17.anInt5534;
			local153 = local17.anInt5559;
		}
		@Pc(176) int local176 = this.anInt411 + (local153 + 1 >> 1);
		@Pc(183) int local183 = (local150 >> 1) + this.anInt409;
		@Pc(191) int local191 = this.anInt411 + (local153 >> 1);
		@Pc(201) int local201 = this.anInt409 + (local150 + 1 >> 1);
		this.method404(local183 * 128, local191 * 128);
		@Pc(251) boolean local251 = !local12 && local17.aBoolean440 && (this.anInt415 != local17.anInt5578 || (this.anInt430 != this.anInt428 || this.aClass125_1 != null && (this.aClass125_1.aBoolean300 || Static297.aBoolean453) && this.anInt434 != this.anInt430) && Static262.anInt5132 >= 2);
		if (arg0 && !local251) {
			return null;
		}
		@Pc(263) int[][] local263 = Static55.anIntArrayArrayArray3[this.anInt422];
		@Pc(290) int local290 = local263[local191][local201] + local263[local176][local183] + local263[local191][local183] + local263[local176][local201] >> 2;
		@Pc(299) int local299 = (local153 << 6) + (this.anInt411 << 7);
		@Pc(302) int[][] local302 = null;
		if (local12) {
			local302 = Static108.anIntArrayArrayArray7[0];
		} else if (this.anInt422 < 3) {
			local302 = Static55.anIntArrayArrayArray3[this.anInt422 + 1];
		}
		@Pc(332) int local332 = (this.anInt409 << 7) + (local150 << 6);
		if (Static277.aBoolean412 && local251) {
			Static292.method4399(this.aClass12_Sub2_1, this.anInt426, this.anInt435, this.anInt420);
		}
		@Pc(352) boolean local352 = this.aClass12_Sub2_1 == null;
		@Pc(383) Class32 local383;
		if (this.aClass125_1 == null) {
			local383 = local17.method4415(local299, local302, local263, local251, local290, false, local352 ? Static211.aClass12_Sub2_3 : this.aClass12_Sub2_1, local332, this.anInt424, this.anInt436);
		} else {
			local383 = local17.method4430(this.aClass125_1, local299, this.anInt430, local332, this.anInt414, local263, local352 ? Static211.aClass12_Sub2_3 : this.aClass12_Sub2_1, local302, this.anInt436, this.anInt424, local251, this.anInt434, local290);
		}
		if (local383 == null) {
			return null;
		}
		if (Static277.aBoolean412 && local251) {
			if (local352) {
				Static211.aClass12_Sub2_3 = local383.aClass12_Sub2_2;
			}
			@Pc(423) int local423 = 0;
			if (this.anInt422 != 0) {
				@Pc(433) int[][] local433 = Static55.anIntArrayArrayArray3[0];
				local423 = local290 - (local433[local176][local201] + local433[local176][local183] + local433[local191][local183] + local433[local191][local201] >> 2);
			}
			@Pc(465) Class12_Sub2 local465 = local383.aClass12_Sub2_2;
			if (this.aBoolean35 && Static292.method4401(local465, local299, local423, local332)) {
				this.aBoolean35 = false;
			}
			if (!this.aBoolean35) {
				Static292.method4404(local465, local299, local423, local332);
				this.aClass12_Sub2_1 = local465;
				this.anInt426 = local299;
				this.anInt420 = local332;
				if (local352) {
					Static211.aClass12_Sub2_3 = null;
				}
				this.anInt435 = local423;
			}
			this.anInt428 = this.anInt430;
			this.anInt415 = local17.anInt5578;
		}
		return local383.aClass14_5;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)Lclient!dn;")
	public Class14 method408() {
		return this.method407(false);
	}

	@OriginalMember(owner = "client!bj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
	public void method410() {
		if (this.aClass12_Sub2_1 != null) {
			Static292.method4399(this.aClass12_Sub2_1, this.anInt426, this.anInt435, this.anInt420);
		}
		this.aClass12_Sub2_1 = null;
		this.anInt428 = -1;
		this.anInt415 = -1;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "()I")
	@Override
	public int method4091() {
		return this.anInt423;
	}
}
