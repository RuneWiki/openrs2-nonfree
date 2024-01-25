import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class262 {

	@OriginalMember(owner = "client!oo", name = "q", descriptor = "[[Lclient!in;")
	private Class163[][] aClass163ArrayArray1;

	@OriginalMember(owner = "client!oo", name = "o", descriptor = "Lclient!lp;")
	private final Class91_Sub2 aClass91_Sub2_2;

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "Lclient!ij;")
	private final Class13_Sub3 aClass13_Sub3_16;

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
	public final int anInt6979;

	@OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
	private final int anInt6981;

	@OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
	private final int anInt6983;

	@OriginalMember(owner = "client!oo", name = "n", descriptor = "[B")
	public final byte[] aByteArray72;

	@OriginalMember(owner = "client!oo", name = "r", descriptor = "I")
	private final int anInt6988;

	@OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
	private final int anInt6982;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Lclient!ij;Lclient!lp;)V")
	public Class262(@OriginalArg(0) Class13_Sub3 arg0, @OriginalArg(1) Class91_Sub2 arg1) {
		this.aClass91_Sub2_2 = arg1;
		this.aClass13_Sub3_16 = arg0;
		this.anInt6979 = (this.aClass91_Sub2_2.anInt8650 * this.aClass91_Sub2_2.anInt8647 >> this.aClass13_Sub3_16.anInt9738) + 2;
		this.anInt6981 = (this.aClass91_Sub2_2.anInt8647 * this.aClass91_Sub2_2.anInt8645 >> this.aClass13_Sub3_16.anInt9738) + 2;
		this.anInt6983 = this.aClass13_Sub3_16.anInt9738 + 7 - this.aClass91_Sub2_2.anInt8641;
		this.aByteArray72 = new byte[this.anInt6979 * this.anInt6981];
		this.anInt6988 = this.aClass91_Sub2_2.anInt8650 >> this.anInt6983;
		this.anInt6982 = this.aClass91_Sub2_2.anInt8645 >> this.anInt6983;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZII[[ZII)V")
	public void method6100(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(5) int arg4) {
		this.aClass13_Sub3_16.method8302(false);
		this.aClass13_Sub3_16.method8218(false);
		this.aClass13_Sub3_16.method8306(1);
		this.aClass13_Sub3_16.method8204(1);
		this.aClass13_Sub3_16.method8261(false, false, -2);
		@Pc(47) float local47 = 1.0F / (float) (this.aClass13_Sub3_16.anInt9750 * 128);
		@Pc(51) int local51;
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(67) int local67;
		if (arg0) {
			for (local51 = 0; local51 < this.anInt6982; local51++) {
				local58 = local51 << this.anInt6983;
				local65 = local51 + 1 << this.anInt6983;
				label87: for (local67 = 0; local67 < this.anInt6988; local67++) {
					if (this.aClass163ArrayArray1[local67][local51] != null) {
						@Pc(335) int local335 = local67 << this.anInt6983;
						@Pc(342) int local342 = local67 + 1 << this.anInt6983;
						for (@Pc(344) int local344 = local335; local344 < local342; local344++) {
							if (-arg2 <= local344 - arg1 && arg2 >= local344 - arg1) {
								for (@Pc(364) int local364 = local58; local364 < local65; local364++) {
									if (local364 - arg4 >= -arg2 && arg2 >= local364 - arg4 && arg3[local344 + arg2 - arg1][local364 + arg2 - arg4]) {
										@Pc(409) Class51_Sub2 local409 = this.aClass13_Sub3_16.method8181();
										local409.method3247(local47, local47, 1.0F);
										local409.method6711(-local67, -local51, 0);
										this.aClass13_Sub3_16.method8217(Static593.aClass100_6);
										this.aClass163ArrayArray1[local67][local51].method4143();
										continue label87;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local51 = 0; local51 < this.anInt6982; local51++) {
				local58 = local51 << this.anInt6983;
				local65 = local51 + 1 << this.anInt6983;
				for (local67 = 0; local67 < this.anInt6988; local67++) {
					@Pc(76) Class163 local76 = this.aClass163ArrayArray1[local67][local51];
					if (local76 != null) {
						@Pc(87) Interface11 local87 = this.aClass13_Sub3_16.method8287(local76.anInt4733 * 3);
						@Pc(92) Buffer local92 = local87.method7405();
						if (local92 != null) {
							@Pc(100) Stream local100 = this.aClass13_Sub3_16.method8260(local92);
							@Pc(102) int local102 = 0;
							@Pc(107) int local107 = local67 << this.anInt6983;
							@Pc(114) int local114 = local67 + 1 << this.anInt6983;
							for (@Pc(116) int local116 = local58; local116 < local65; local116++) {
								if (local116 - arg4 >= -arg2 && arg2 >= local116 - arg4) {
									@Pc(142) int local142 = local116 * this.aClass91_Sub2_2.anInt8650 + local107;
									for (@Pc(144) int local144 = local107; local144 < local114; local144++) {
										if (local144 - arg1 >= -arg2 && local144 - arg1 <= arg2 && arg3[local144 + arg2 - arg1][arg2 + local116 - arg4]) {
											@Pc(189) short[] local189 = this.aClass91_Sub2_2.aShortArrayArray4[local142];
											if (local189 != null) {
												@Pc(195) int local195;
												if (Stream.c()) {
													for (local195 = 0; local195 < local189.length; local195++) {
														local102++;
														local100.b(local189[local195] & 0xFFFF);
													}
												} else {
													for (local195 = 0; local195 < local189.length; local195++) {
														local100.e(local189[local195] & 0xFFFF);
														local102++;
													}
												}
											}
										}
										local142++;
									}
								}
							}
							local100.b();
							if (local87.method7409() && local102 > 0) {
								@Pc(262) Class51_Sub2 local262 = this.aClass13_Sub3_16.method8181();
								local262.method3247(local47, local47, 1.0F);
								local262.method6711(-local67, -local51, 0);
								this.aClass13_Sub3_16.method8217(Static593.aClass100_6);
								local76.method4142(local102 / 3, local87);
							}
						}
					}
				}
			}
		}
		this.aClass13_Sub3_16.method8270();
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(BLclient!r;II)V")
	public void method6101(@OriginalArg(1) Class2_Sub7_Sub17 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class2_Sub7_Sub17_Sub2 local6 = (Class2_Sub7_Sub17_Sub2) arg0;
		arg2 += local6.anInt9957 + 1;
		arg1 += local6.anInt9960 + 1;
		@Pc(27) int local27 = this.anInt6979 * arg2 + arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt9954;
		@Pc(39) int local39 = local6.anInt9956;
		@Pc(45) int local45 = this.anInt6979 - local39;
		@Pc(55) int local55;
		if (arg2 <= 0) {
			local55 = 1 - arg2;
			local32 -= local55;
			local27 += local55 * this.anInt6979;
			local29 = local39 * local55;
			arg2 = 1;
		}
		@Pc(76) int local76 = 0;
		if (this.anInt6981 <= arg2 + local32) {
			local55 = local32 + arg2 + 1 - this.anInt6981;
			local32 -= local55;
		}
		if (arg1 <= 0) {
			local55 = 1 - arg1;
			arg1 = 1;
			local45 += local55;
			local39 -= local55;
			local27 += local55;
			local29 += local55;
			local76 = local55;
		}
		if (local39 + arg1 >= this.anInt6979) {
			local55 = local39 + arg1 + 1 - this.anInt6979;
			local39 -= local55;
			local76 += local55;
			local45 += local55;
		}
		if (local39 > 0 && local32 > 0) {
			Static584.method8078(local27, local45, local76, local6.aByteArray103, local39, local32, local29, this.aByteArray72);
			this.method6102(local32, arg2, local39, arg1);
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIII)V")
	private void method6102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass163ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg3 - 1 >> 7;
		@Pc(26) int local26 = arg3 + arg2 - 1 - 1 >> 7;
		@Pc(36) int local36 = arg1 - 1 >> 7;
		@Pc(46) int local46 = arg0 + arg1 - 1 - 1 >> 7;
		for (@Pc(48) int local48 = local15; local48 <= local26; local48++) {
			@Pc(55) Class163[] local55 = this.aClass163ArrayArray1[local48];
			for (@Pc(57) int local57 = local36; local57 <= local46; local57++) {
				if (local55[local57] != null) {
					local55[local57].aBoolean356 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)V")
	public void method6103() {
		this.aClass163ArrayArray1 = new Class163[this.anInt6988][this.anInt6982];
		for (@Pc(14) int local14 = 0; local14 < this.anInt6982; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt6988; local18++) {
				this.aClass163ArrayArray1[local18][local14] = new Class163(this.aClass13_Sub3_16, this, this.aClass91_Sub2_2, local18, local14, this.anInt6983, local18 * 128 + 1, local14 * 128 + 1);
				if (this.aClass163ArrayArray1[local18][local14].anInt4733 == 0) {
					this.aClass163ArrayArray1[local18][local14] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILclient!r;II)V")
	public void method6104(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7_Sub17 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class2_Sub7_Sub17_Sub2 local6 = (Class2_Sub7_Sub17_Sub2) arg1;
		arg2 += local6.anInt9960 + 1;
		arg0 += local6.anInt9957 + 1;
		@Pc(28) int local28 = arg2 + this.anInt6979 * arg0;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt9954;
		@Pc(36) int local36 = local6.anInt9956;
		@Pc(42) int local42 = this.anInt6979 - local36;
		@Pc(49) int local49;
		if (arg0 <= 0) {
			local49 = 1 - arg0;
			local28 += this.anInt6979 * local49;
			local33 -= local49;
			arg0 = 1;
			local30 = local49 * local36;
		}
		@Pc(70) int local70 = 0;
		if (this.anInt6981 <= local33 + arg0) {
			local49 = local33 + arg0 + 1 - this.anInt6981;
			local33 -= local49;
		}
		if (arg2 <= 0) {
			local49 = 1 - arg2;
			local70 = local49;
			local36 -= local49;
			local28 += local49;
			local30 += local49;
			local42 += local49;
			arg2 = 1;
		}
		if (this.anInt6979 <= local36 + arg2) {
			local49 = arg2 + local36 + 1 - this.anInt6979;
			local70 += local49;
			local42 += local49;
			local36 -= local49;
		}
		if (local36 > 0 && local33 > 0) {
			Static135.method2480(this.aByteArray72, local6.aByteArray103, local33, local42, local28, local30, local70, local36);
			this.method6102(local33, arg0, local36, arg2);
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!r;III)Z")
	public boolean method6105(@OriginalArg(0) Class2_Sub7_Sub17 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class2_Sub7_Sub17_Sub2 local6 = (Class2_Sub7_Sub17_Sub2) arg0;
		arg2 += local6.anInt9957 + 1;
		arg1 += local6.anInt9960 + 1;
		@Pc(27) int local27 = arg1 + this.anInt6979 * arg2;
		@Pc(30) int local30 = local6.anInt9954;
		@Pc(33) int local33 = local6.anInt9956;
		@Pc(39) int local39;
		if (arg2 <= 0) {
			local39 = 1 - arg2;
			local27 += this.anInt6979 * local39;
			local30 -= local39;
			arg2 = 1;
		}
		@Pc(58) int local58 = this.anInt6979 - local33;
		if (arg2 + local30 >= this.anInt6981) {
			local39 = local30 + arg2 + 1 - this.anInt6981;
			local30 -= local39;
		}
		if (arg1 <= 0) {
			local39 = 1 - arg1;
			local27 += local39;
			arg1 = 1;
			local58 += local39;
			local33 -= local39;
		}
		if (arg1 + local33 >= this.anInt6979) {
			local39 = local33 + arg1 + 1 - this.anInt6979;
			local58 += local39;
			local33 -= local39;
		}
		if (local33 > 0 && local30 > 0) {
			local58 += this.anInt6979 * 7;
			return Static47.method1201(this.aByteArray72, local58, local30, local27, local33);
		} else {
			return false;
		}
	}
}
