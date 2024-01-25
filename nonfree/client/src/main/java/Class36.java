import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bha")
public final class Class36 {

	@OriginalMember(owner = "client!bha", name = "e", descriptor = "[[Lclient!er;")
	private Class94[][] aClass94ArrayArray1;

	@OriginalMember(owner = "client!bha", name = "i", descriptor = "Lclient!aga;")
	private final Class12_Sub1 aClass12_Sub1_1;

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "Lclient!lba;")
	private final Class132_Sub1 aClass132_Sub1_4;

	@OriginalMember(owner = "client!bha", name = "c", descriptor = "I")
	public final int anInt966;

	@OriginalMember(owner = "client!bha", name = "b", descriptor = "I")
	private final int anInt965;

	@OriginalMember(owner = "client!bha", name = "q", descriptor = "[B")
	public final byte[] aByteArray10;

	@OriginalMember(owner = "client!bha", name = "o", descriptor = "I")
	private final int anInt975;

	@OriginalMember(owner = "client!bha", name = "n", descriptor = "I")
	private final int anInt974;

	@OriginalMember(owner = "client!bha", name = "f", descriptor = "I")
	private final int anInt967;

	@OriginalMember(owner = "client!bha", name = "<init>", descriptor = "(Lclient!lba;Lclient!aga;)V")
	public Class36(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) Class12_Sub1 arg1) {
		this.aClass12_Sub1_1 = arg1;
		this.aClass132_Sub1_4 = arg0;
		this.anInt966 = (this.aClass12_Sub1_1.anInt9306 * this.aClass12_Sub1_1.anInt9314 >> this.aClass132_Sub1_4.anInt8967) + 2;
		this.anInt965 = (this.aClass12_Sub1_1.anInt9306 * this.aClass12_Sub1_1.anInt9313 >> this.aClass132_Sub1_4.anInt8967) + 2;
		this.aByteArray10 = new byte[this.anInt965 * this.anInt966];
		this.anInt975 = this.aClass132_Sub1_4.anInt8967 + 7 - this.aClass12_Sub1_1.anInt9312;
		this.anInt974 = this.aClass12_Sub1_1.anInt9314 >> this.anInt975;
		this.anInt967 = this.aClass12_Sub1_1.anInt9313 >> this.anInt975;
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(IILclient!r;I)V")
	public void method930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub4_Sub5 arg2) {
		@Pc(6) Class6_Sub4_Sub5_Sub2 local6 = (Class6_Sub4_Sub5_Sub2) arg2;
		arg0 += local6.anInt9646 + 1;
		arg1 += local6.anInt9645 + 1;
		@Pc(33) int local33 = this.anInt966 * arg1 + arg0;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = local6.anInt9648;
		@Pc(41) int local41 = local6.anInt9644;
		@Pc(47) int local47 = this.anInt966 - local41;
		@Pc(49) int local49 = 0;
		@Pc(59) int local59;
		if (arg1 <= 0) {
			local59 = 1 - arg1;
			arg1 = 1;
			local33 += this.anInt966 * local59;
			local38 -= local59;
			local35 = local41 * local59;
		}
		if (this.anInt965 <= arg1 + local38) {
			local59 = arg1 + local38 + 1 - this.anInt965;
			local38 -= local59;
		}
		if (arg0 <= 0) {
			local59 = 1 - arg0;
			local35 += local59;
			local47 += local59;
			local41 -= local59;
			local49 = local59;
			local33 += local59;
			arg0 = 1;
		}
		if (local41 + arg0 >= this.anInt966) {
			local59 = arg0 + local41 + 1 - this.anInt966;
			local49 += local59;
			local47 += local59;
			local41 -= local59;
		}
		if (local41 > 0 && local38 > 0) {
			Static270.method3999(local49, local38, local33, local47, local41, local35, local6.aByteArray100, this.aByteArray10);
			this.method938(local38, arg0, arg1, local41);
		}
	}

	@OriginalMember(owner = "client!bha", name = "b", descriptor = "(I)V")
	public void method932() {
		this.aClass94ArrayArray1 = new Class94[this.anInt974][this.anInt967];
		for (@Pc(14) int local14 = 0; local14 < this.anInt967; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt974; local18++) {
				this.aClass94ArrayArray1[local18][local14] = new Class94(this.aClass132_Sub1_4, this, this.aClass12_Sub1_1, local18, local14, this.anInt975, local18 * 128 + 1, local14 * 128 + 1);
				if (this.aClass94ArrayArray1[local18][local14].anInt2395 == 0) {
					this.aClass94ArrayArray1[local18][local14] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(Lclient!r;III)Z")
	public boolean method934(@OriginalArg(0) Class6_Sub4_Sub5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class6_Sub4_Sub5_Sub2 local6 = (Class6_Sub4_Sub5_Sub2) arg0;
		arg1 += local6.anInt9645 + 1;
		arg2 += local6.anInt9646 + 1;
		@Pc(27) int local27 = arg2 + this.anInt966 * arg1;
		@Pc(39) int local39 = local6.anInt9648;
		@Pc(42) int local42 = local6.anInt9644;
		@Pc(47) int local47 = this.anInt966 - local42;
		@Pc(54) int local54;
		if (arg1 <= 0) {
			local54 = 1 - arg1;
			local39 -= local54;
			arg1 = 1;
			local27 += this.anInt966 * local54;
		}
		if (arg1 + local39 >= this.anInt965) {
			local54 = arg1 + local39 + 1 - this.anInt965;
			local39 -= local54;
		}
		if (arg2 <= 0) {
			local54 = 1 - arg2;
			local27 += local54;
			local42 -= local54;
			arg2 = 1;
			local47 += local54;
		}
		if (arg2 + local42 >= this.anInt966) {
			local54 = local42 + arg2 + 1 - this.anInt966;
			local42 -= local54;
			local47 += local54;
		}
		if (local42 > 0 && local39 > 0) {
			local47 += this.anInt966 * 7;
			return Static59.method1101(local47, this.aByteArray10, local42, local27, local39);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(IIILclient!r;)V")
	public void method936(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub4_Sub5 arg2) {
		@Pc(6) Class6_Sub4_Sub5_Sub2 local6 = (Class6_Sub4_Sub5_Sub2) arg2;
		arg0 += local6.anInt9645 + 1;
		arg1 += local6.anInt9646 + 1;
		@Pc(27) int local27 = arg1 + arg0 * this.anInt966;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt9648;
		@Pc(35) int local35 = local6.anInt9644;
		@Pc(41) int local41 = this.anInt966 - local35;
		@Pc(43) int local43 = 0;
		@Pc(52) int local52;
		if (arg0 <= 0) {
			local52 = 1 - arg0;
			local29 = local52 * local35;
			arg0 = 1;
			local32 -= local52;
			local27 += this.anInt966 * local52;
		}
		if (this.anInt965 <= arg0 + local32) {
			local52 = local32 + arg0 + 1 - this.anInt965;
			local32 -= local52;
		}
		if (arg1 <= 0) {
			local52 = 1 - arg1;
			local41 += local52;
			local43 = local52;
			arg1 = 1;
			local29 += local52;
			local35 -= local52;
			local27 += local52;
		}
		if (this.anInt966 <= arg1 + local35) {
			local52 = local35 + arg1 + 1 - this.anInt966;
			local35 -= local52;
			local43 += local52;
			local41 += local52;
		}
		if (local35 > 0 && local32 > 0) {
			Static243.method3609(local35, local41, local6.aByteArray100, local43, local27, this.aByteArray10, local29, local32);
			this.method938(local32, arg1, arg0, local35);
		}
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(Z[[ZIIII)V")
	public void method937(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass132_Sub1_4.method7536(false);
		this.aClass132_Sub1_4.method7622(false);
		this.aClass132_Sub1_4.method7547(1);
		this.aClass132_Sub1_4.method7652(1);
		this.aClass132_Sub1_4.method7610(false, false, -2);
		@Pc(47) float local47 = 1.0F / (float) (this.aClass132_Sub1_4.anInt8992 * 128);
		@Pc(51) int local51;
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(67) int local67;
		if (arg0) {
			for (local51 = 0; local51 < this.anInt967; local51++) {
				local58 = local51 << this.anInt975;
				local65 = local51 + 1 << this.anInt975;
				label138: for (local67 = 0; local67 < this.anInt974; local67++) {
					if (this.aClass94ArrayArray1[local67][local51] != null) {
						@Pc(81) int local81 = local67 << this.anInt975;
						@Pc(88) int local88 = local67 + 1 << this.anInt975;
						for (@Pc(90) int local90 = local81; local90 < local88; local90++) {
							if (-arg2 <= local90 - arg3 && arg2 >= local90 - arg3) {
								for (@Pc(107) int local107 = local58; local107 < local65; local107++) {
									if (local107 - arg4 >= -arg2 && local107 - arg4 <= arg2 && arg1[arg2 + local90 - arg3][local107 + arg2 - arg4]) {
										@Pc(149) Class207_Sub3 local149 = this.aClass132_Sub1_4.method7613();
										local149.method8239(local47, local47, 1.0F);
										local149.method8209(-local67, -local51, 0);
										this.aClass132_Sub1_4.method7618(Static87.aClass257_2);
										this.aClass94ArrayArray1[local67][local51].method2065();
										continue label138;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local51 = 0; local51 < this.anInt967; local51++) {
				local58 = local51 << this.anInt975;
				local65 = local51 + 1 << this.anInt975;
				for (local67 = 0; local67 < this.anInt974; local67++) {
					@Pc(236) Class94 local236 = this.aClass94ArrayArray1[local67][local51];
					if (local236 != null) {
						@Pc(247) Interface21 local247 = this.aClass132_Sub1_4.method7606(local236.anInt2395 * 3);
						@Pc(252) Buffer local252 = local247.method5806();
						if (local252 != null) {
							@Pc(260) Stream local260 = this.aClass132_Sub1_4.method7592(local252);
							@Pc(262) int local262 = 0;
							@Pc(267) int local267 = local67 << this.anInt975;
							@Pc(274) int local274 = local67 + 1 << this.anInt975;
							for (@Pc(276) int local276 = local58; local276 < local65; local276++) {
								if (-arg2 <= local276 - arg4 && local276 - arg4 <= arg2) {
									@Pc(303) int local303 = this.aClass12_Sub1_1.anInt9314 * local276 + local267;
									for (@Pc(305) int local305 = local267; local305 < local274; local305++) {
										if (-arg2 <= local305 - arg3 && arg2 >= local305 - arg3 && arg1[local305 + arg2 - arg3][arg2 + local276 - arg4]) {
											@Pc(346) short[] local346 = this.aClass12_Sub1_1.aShortArrayArray1[local303];
											if (local346 != null) {
												@Pc(352) int local352;
												if (Stream.b()) {
													for (local352 = 0; local352 < local346.length; local352++) {
														local262++;
														local260.b(local346[local352] & 0xFFFF);
													}
												} else {
													for (local352 = 0; local352 < local346.length; local352++) {
														local260.c(local346[local352] & 0xFFFF);
														local262++;
													}
												}
											}
										}
										local303++;
									}
								}
							}
							local260.c();
							if (local247.method5808() && local262 > 0) {
								@Pc(419) Class207_Sub3 local419 = this.aClass132_Sub1_4.method7613();
								local419.method8239(local47, local47, 1.0F);
								local419.method8209(-local67, -local51, 0);
								this.aClass132_Sub1_4.method7618(Static87.aClass257_2);
								local236.method2060(local262 / 3, local247);
							}
						}
					}
				}
			}
		}
		this.aClass132_Sub1_4.method7520();
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(IIIII)V")
	private void method938(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass94ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg1 - 1 >> 7;
		@Pc(25) int local25 = arg1 + arg3 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg2 - 1 >> 7;
		@Pc(42) int local42 = arg2 + arg0 - 1 - 1 >> 7;
		for (@Pc(49) int local49 = local15; local49 <= local25; local49++) {
			@Pc(56) Class94[] local56 = this.aClass94ArrayArray1[local49];
			for (@Pc(58) int local58 = local31; local58 <= local42; local58++) {
				if (local56[local58] != null) {
					local56[local58].aBoolean150 = true;
				}
			}
		}
	}
}
