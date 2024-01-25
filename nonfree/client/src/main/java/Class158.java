import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jga")
public final class Class158 {

	@OriginalMember(owner = "client!jga", name = "p", descriptor = "[[Lclient!pn;")
	private Class264[][] aClass264ArrayArray1;

	@OriginalMember(owner = "client!jga", name = "m", descriptor = "Lclient!bm;")
	private final Class33_Sub1 aClass33_Sub1_8;

	@OriginalMember(owner = "client!jga", name = "j", descriptor = "Lclient!up;")
	private final Class274_Sub3 aClass274_Sub3_2;

	@OriginalMember(owner = "client!jga", name = "k", descriptor = "I")
	public final int anInt5724;

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "I")
	private final int anInt5719;

	@OriginalMember(owner = "client!jga", name = "i", descriptor = "[B")
	public final byte[] aByteArray62;

	@OriginalMember(owner = "client!jga", name = "s", descriptor = "I")
	private final int anInt5729;

	@OriginalMember(owner = "client!jga", name = "c", descriptor = "I")
	private final int anInt5720;

	@OriginalMember(owner = "client!jga", name = "o", descriptor = "I")
	private final int anInt5727;

	@OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Lclient!bm;Lclient!up;)V")
	public Class158(@OriginalArg(0) Class33_Sub1 arg0, @OriginalArg(1) Class274_Sub3 arg1) {
		this.aClass33_Sub1_8 = arg0;
		this.aClass274_Sub3_2 = arg1;
		this.anInt5724 = (this.aClass274_Sub3_2.anInt9726 * this.aClass274_Sub3_2.anInt9722 >> this.aClass33_Sub1_8.anInt2165) + 2;
		this.anInt5719 = (this.aClass274_Sub3_2.anInt9722 * this.aClass274_Sub3_2.anInt9723 >> this.aClass33_Sub1_8.anInt2165) + 2;
		this.aByteArray62 = new byte[this.anInt5724 * this.anInt5719];
		this.anInt5729 = this.aClass33_Sub1_8.anInt2165 + 7 - this.aClass274_Sub3_2.anInt9727;
		this.anInt5720 = this.aClass274_Sub3_2.anInt9726 >> this.anInt5729;
		this.anInt5727 = this.aClass274_Sub3_2.anInt9723 >> this.anInt5729;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(ZIIIZ[[Z)V")
	public void method4853(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean[][] arg4) {
		this.aClass33_Sub1_8.method2044(false);
		this.aClass33_Sub1_8.method2080(false);
		this.aClass33_Sub1_8.method2032(1);
		this.aClass33_Sub1_8.method2105(1);
		this.aClass33_Sub1_8.method2012(false, -2, false);
		@Pc(45) float local45 = 1.0F / (float) (this.aClass33_Sub1_8.anInt2160 * 128);
		@Pc(49) int local49;
		@Pc(56) int local56;
		@Pc(63) int local63;
		@Pc(65) int local65;
		if (arg3) {
			for (local49 = 0; local49 < this.anInt5727; local49++) {
				local56 = local49 << this.anInt5729;
				local63 = local49 + 1 << this.anInt5729;
				label138: for (local65 = 0; local65 < this.anInt5720; local65++) {
					if (this.aClass264ArrayArray1[local65][local49] != null) {
						@Pc(79) int local79 = local65 << this.anInt5729;
						@Pc(86) int local86 = local65 + 1 << this.anInt5729;
						for (@Pc(88) int local88 = local79; local88 < local86; local88++) {
							if (-arg2 <= local88 - arg1 && local88 - arg1 <= arg2) {
								for (@Pc(108) int local108 = local56; local108 < local63; local108++) {
									if (local108 - arg0 >= -arg2 && local108 - arg0 <= arg2 && arg4[arg2 + local88 - arg1][local108 + arg2 - arg0]) {
										@Pc(147) Class47_Sub3 local147 = this.aClass33_Sub1_8.method2020();
										local147.method7901(local45, 1.0F, local45);
										local147.method7876(-local65, -local49, 0);
										this.aClass33_Sub1_8.method2088(Static235.aClass180_4);
										this.aClass264ArrayArray1[local65][local49].method6674();
										continue label138;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local49 = 0; local49 < this.anInt5727; local49++) {
				local56 = local49 << this.anInt5729;
				local63 = local49 + 1 << this.anInt5729;
				for (local65 = 0; local65 < this.anInt5720; local65++) {
					@Pc(234) Class264 local234 = this.aClass264ArrayArray1[local65][local49];
					if (local234 != null) {
						@Pc(245) Interface23 local245 = this.aClass33_Sub1_8.method1990(local234.anInt7985 * 3);
						@Pc(250) Buffer local250 = local245.method4807();
						if (local250 != null) {
							@Pc(258) Stream local258 = this.aClass33_Sub1_8.method2092(local250);
							@Pc(260) int local260 = 0;
							@Pc(265) int local265 = local65 << this.anInt5729;
							@Pc(272) int local272 = local65 + 1 << this.anInt5729;
							for (@Pc(274) int local274 = local56; local274 < local63; local274++) {
								if (-arg2 <= local274 - arg0 && local274 - arg0 <= arg2) {
									@Pc(297) int local297 = this.aClass274_Sub3_2.anInt9726 * local274 + local265;
									for (@Pc(299) int local299 = local265; local299 < local272; local299++) {
										if (-arg2 <= local299 - arg1 && arg2 >= local299 - arg1 && arg4[arg2 + local299 - arg1][arg2 + local274 - arg0]) {
											@Pc(336) short[] local336 = this.aClass274_Sub3_2.aShortArrayArray20[local297];
											if (local336 != null) {
												@Pc(342) int local342;
												if (Stream.b()) {
													for (local342 = 0; local342 < local336.length; local342++) {
														local260++;
														local258.e(local336[local342] & 0xFFFF);
													}
												} else {
													for (local342 = 0; local342 < local336.length; local342++) {
														local258.a(local336[local342] & 0xFFFF);
														local260++;
													}
												}
											}
										}
										local297++;
									}
								}
							}
							local258.a();
							if (local245.method4806() && local260 > 0) {
								@Pc(409) Class47_Sub3 local409 = this.aClass33_Sub1_8.method2020();
								local409.method7901(local45, 1.0F, local45);
								local409.method7876(-local65, -local49, 0);
								this.aClass33_Sub1_8.method2088(Static235.aClass180_4);
								local234.method6672(local260 / 3, local245);
							}
						}
					}
				}
			}
		}
		this.aClass33_Sub1_8.method2029();
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIBII)V")
	private void method4855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass264ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg2 - 1 >> 7;
		@Pc(26) int local26 = arg2 + arg0 - 1 - 1 >> 7;
		@Pc(38) int local38 = arg1 - 1 >> 7;
		@Pc(48) int local48 = arg3 + arg1 - 1 - 1 >> 7;
		for (@Pc(50) int local50 = local15; local50 <= local26; local50++) {
			@Pc(57) Class264[] local57 = this.aClass264ArrayArray1[local50];
			for (@Pc(59) int local59 = local38; local59 <= local48; local59++) {
				if (local57[local59] != null) {
					local57[local59].aBoolean677 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(ZILclient!r;I)V")
	public void method4856(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub6 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub1_Sub6_Sub1 local6 = (Class3_Sub1_Sub6_Sub1) arg1;
		arg2 += local6.anInt4907 + 1;
		arg0 += local6.anInt4906 + 1;
		@Pc(27) int local27 = arg0 + arg2 * this.anInt5724;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt4908;
		@Pc(35) int local35 = local6.anInt4902;
		@Pc(40) int local40 = this.anInt5724 - local35;
		@Pc(42) int local42 = 0;
		@Pc(52) int local52;
		if (arg2 <= 0) {
			local52 = 1 - arg2;
			arg2 = 1;
			local32 -= local52;
			local27 += this.anInt5724 * local52;
			local29 = local35 * local52;
		}
		if (this.anInt5719 <= local32 + arg2) {
			local52 = local32 + arg2 + 1 - this.anInt5719;
			local32 -= local52;
		}
		if (arg0 <= 0) {
			local52 = 1 - arg0;
			local42 = local52;
			local29 += local52;
			local27 += local52;
			local40 += local52;
			arg0 = 1;
			local35 -= local52;
		}
		if (this.anInt5724 <= arg0 + local35) {
			local52 = local35 + arg0 + 1 - this.anInt5724;
			local35 -= local52;
			local40 += local52;
			local42 += local52;
		}
		if (local35 > 0 && local32 > 0) {
			Static302.method5160(local32, local6.aByteArray46, this.aByteArray62, local35, local27, local29, local42, local40);
			this.method4855(local35, arg2, arg0, local32);
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(Z)V")
	public void method4857() {
		this.aClass264ArrayArray1 = new Class264[this.anInt5720][this.anInt5727];
		for (@Pc(14) int local14 = 0; local14 < this.anInt5727; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt5720; local18++) {
				this.aClass264ArrayArray1[local18][local14] = new Class264(this.aClass33_Sub1_8, this, this.aClass274_Sub3_2, local18, local14, this.anInt5729, local18 * 128 + 1, local14 * 128 + 1);
				if (this.aClass264ArrayArray1[local18][local14].anInt7985 == 0) {
					this.aClass264ArrayArray1[local18][local14] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IBLclient!r;I)V")
	public void method4858(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub6 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub1_Sub6_Sub1 local6 = (Class3_Sub1_Sub6_Sub1) arg1;
		arg0 += local6.anInt4907 + 1;
		arg2 += local6.anInt4906 + 1;
		@Pc(27) int local27 = arg0 * this.anInt5724 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt4908;
		@Pc(35) int local35 = local6.anInt4902;
		@Pc(41) int local41 = this.anInt5724 - local35;
		@Pc(43) int local43 = 0;
		@Pc(50) int local50;
		if (arg0 <= 0) {
			local50 = 1 - arg0;
			arg0 = 1;
			local29 = local50 * local35;
			local27 += this.anInt5724 * local50;
			local32 -= local50;
		}
		if (this.anInt5719 <= local32 + arg0) {
			local50 = arg0 + local32 + 1 - this.anInt5719;
			local32 -= local50;
		}
		if (arg2 <= 0) {
			local50 = 1 - arg2;
			local29 += local50;
			arg2 = 1;
			local27 += local50;
			local43 = local50;
			local41 += local50;
			local35 -= local50;
		}
		if (this.anInt5724 <= arg2 + local35) {
			local50 = local35 + arg2 + 1 - this.anInt5724;
			local41 += local50;
			local35 -= local50;
			local43 += local50;
		}
		if (local35 > 0 && local32 > 0) {
			Static464.method6943(local35, local29, local41, local27, this.aByteArray62, local43, local6.aByteArray46, local32);
			this.method4855(local35, arg0, arg2, local32);
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(Lclient!r;III)Z")
	public boolean method4861(@OriginalArg(0) Class3_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub1_Sub6_Sub1 local6 = (Class3_Sub1_Sub6_Sub1) arg0;
		arg1 += local6.anInt4907 + 1;
		arg2 += local6.anInt4906 + 1;
		@Pc(28) int local28 = arg2 + this.anInt5724 * arg1;
		@Pc(31) int local31 = local6.anInt4908;
		@Pc(34) int local34 = local6.anInt4902;
		@Pc(49) int local49;
		if (arg1 <= 0) {
			local49 = 1 - arg1;
			arg1 = 1;
			local31 -= local49;
			local28 += local49 * this.anInt5724;
		}
		@Pc(68) int local68 = this.anInt5724 - local34;
		if (this.anInt5719 <= arg1 + local31) {
			local49 = local31 + arg1 + 1 - this.anInt5719;
			local31 -= local49;
		}
		if (arg2 <= 0) {
			local49 = 1 - arg2;
			arg2 = 1;
			local68 += local49;
			local28 += local49;
			local34 -= local49;
		}
		if (arg2 + local34 >= this.anInt5724) {
			local49 = arg2 + local34 + 1 - this.anInt5724;
			local68 += local49;
			local34 -= local49;
		}
		if (local34 > 0 && local31 > 0) {
			local68 += this.anInt5724 * 7;
			return Static349.method5729(local68, local34, local28, this.aByteArray62, local31);
		} else {
			return false;
		}
	}
}
