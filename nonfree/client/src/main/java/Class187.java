import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jga")
public final class Class187 {

	@OriginalMember(owner = "client!jga", name = "k", descriptor = "[[Lclient!sda;")
	private Class327[][] aClass327ArrayArray1;

	@OriginalMember(owner = "client!jga", name = "g", descriptor = "Lclient!he;")
	private final Class144_Sub1 aClass144_Sub1_10;

	@OriginalMember(owner = "client!jga", name = "f", descriptor = "Lclient!hn;")
	private final Class159_Sub1 aClass159_Sub1_1;

	@OriginalMember(owner = "client!jga", name = "h", descriptor = "I")
	public final int anInt5159;

	@OriginalMember(owner = "client!jga", name = "c", descriptor = "I")
	private final int anInt5152;

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "I")
	private final int anInt5157;

	@OriginalMember(owner = "client!jga", name = "s", descriptor = "[B")
	public final byte[] aByteArray64;

	@OriginalMember(owner = "client!jga", name = "n", descriptor = "I")
	private final int anInt5153;

	@OriginalMember(owner = "client!jga", name = "l", descriptor = "I")
	private final int anInt5158;

	@OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Lclient!he;Lclient!hn;)V")
	public Class187(@OriginalArg(0) Class144_Sub1 arg0, @OriginalArg(1) Class159_Sub1 arg1) {
		this.aClass144_Sub1_10 = arg0;
		this.aClass159_Sub1_1 = arg1;
		this.anInt5159 = (this.aClass159_Sub1_1.anInt9502 * this.aClass159_Sub1_1.anInt9504 >> this.aClass144_Sub1_10.anInt6523) + 2;
		this.anInt5152 = (this.aClass159_Sub1_1.anInt9506 * this.aClass159_Sub1_1.anInt9502 >> this.aClass144_Sub1_10.anInt6523) + 2;
		this.anInt5157 = this.aClass144_Sub1_10.anInt6523 + 7 - this.aClass159_Sub1_1.anInt9501;
		this.aByteArray64 = new byte[this.anInt5159 * this.anInt5152];
		this.anInt5153 = this.aClass159_Sub1_1.anInt9504 >> this.anInt5157;
		this.anInt5158 = this.aClass159_Sub1_1.anInt9506 >> this.anInt5157;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)V")
	public void method4695() {
		this.aClass327ArrayArray1 = new Class327[this.anInt5153][this.anInt5158];
		for (@Pc(22) int local22 = 0; local22 < this.anInt5158; local22++) {
			for (@Pc(26) int local26 = 0; local26 < this.anInt5153; local26++) {
				this.aClass327ArrayArray1[local26][local22] = new Class327(this.aClass144_Sub1_10, this, this.aClass159_Sub1_1, local26, local22, this.anInt5157, local26 * 128 + 1, local22 * 128 + 1);
				if (this.aClass327ArrayArray1[local26][local22].anInt9251 == 0) {
					this.aClass327ArrayArray1[local26][local22] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IILclient!r;I)Z")
	public boolean method4696(@OriginalArg(1) int arg0, @OriginalArg(2) Class14_Sub2_Sub5 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class14_Sub2_Sub5_Sub1 local6 = (Class14_Sub2_Sub5_Sub1) arg1;
		arg2 += local6.anInt1266 + 1;
		arg0 += local6.anInt1267 + 1;
		@Pc(27) int local27 = arg2 * this.anInt5159 + arg0;
		@Pc(41) int local41 = local6.anInt1268;
		@Pc(44) int local44 = local6.anInt1263;
		@Pc(50) int local50 = this.anInt5159 - local44;
		@Pc(59) int local59;
		if (arg2 <= 0) {
			local59 = 1 - arg2;
			arg2 = 1;
			local27 += this.anInt5159 * local59;
			local41 -= local59;
		}
		if (local41 + arg2 >= this.anInt5152) {
			local59 = local41 + arg2 + 1 - this.anInt5152;
			local41 -= local59;
		}
		if (arg0 <= 0) {
			local59 = 1 - arg0;
			local50 += local59;
			local44 -= local59;
			local27 += local59;
			arg0 = 1;
		}
		if (this.anInt5159 <= local44 + arg0) {
			local59 = arg0 + local44 + 1 - this.anInt5159;
			local50 += local59;
			local44 -= local59;
		}
		if (local44 > 0 && local41 > 0) {
			local50 += this.anInt5159 * 7;
			return Static490.method7389(local50, local44, local27, this.aByteArray64, local41);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IZIII[[Z)V")
	public void method4697(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean[][] arg4) {
		this.aClass144_Sub1_10.method5745(false);
		this.aClass144_Sub1_10.method5694(false);
		this.aClass144_Sub1_10.method5685(1);
		this.aClass144_Sub1_10.method5723(1);
		this.aClass144_Sub1_10.method5769(false, -2, false);
		@Pc(45) float local45 = 1.0F / (float) (this.aClass144_Sub1_10.anInt6518 * 128);
		@Pc(49) int local49;
		@Pc(56) int local56;
		@Pc(63) int local63;
		@Pc(65) int local65;
		if (arg0) {
			for (local49 = 0; local49 < this.anInt5158; local49++) {
				local56 = local49 << this.anInt5157;
				local63 = local49 + 1 << this.anInt5157;
				label87: for (local65 = 0; local65 < this.anInt5153; local65++) {
					if (this.aClass327ArrayArray1[local65][local49] != null) {
						@Pc(373) int local373 = local65 << this.anInt5157;
						@Pc(380) int local380 = local65 + 1 << this.anInt5157;
						for (@Pc(382) int local382 = local373; local382 < local380; local382++) {
							if (-arg2 <= local382 - arg3 && arg2 >= local382 - arg3) {
								for (@Pc(406) int local406 = local56; local406 < local63; local406++) {
									if (local406 - arg1 >= -arg2 && local406 - arg1 <= arg2 && arg4[local382 + arg2 - arg3][local406 + arg2 - arg1]) {
										@Pc(456) Class263_Sub2 local456 = this.aClass144_Sub1_10.method5724();
										local456.method7276(1.0F, local45, local45);
										local456.method8442(-local65, -local49, 0);
										this.aClass144_Sub1_10.method5750(Static282.aClass199_6);
										this.aClass327ArrayArray1[local65][local49].method7973();
										continue label87;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local49 = 0; local49 < this.anInt5158; local49++) {
				local56 = local49 << this.anInt5157;
				local63 = local49 + 1 << this.anInt5157;
				for (local65 = 0; local65 < this.anInt5153; local65++) {
					@Pc(74) Class327 local74 = this.aClass327ArrayArray1[local65][local49];
					if (local74 != null) {
						@Pc(85) Interface8 local85 = this.aClass144_Sub1_10.method5681(local74.anInt9251 * 3);
						@Pc(92) Buffer local92 = local85.method5085();
						if (local92 != null) {
							@Pc(100) Stream local100 = this.aClass144_Sub1_10.method5747(local92);
							@Pc(102) int local102 = 0;
							@Pc(107) int local107 = local65 << this.anInt5157;
							@Pc(114) int local114 = local65 + 1 << this.anInt5157;
							for (@Pc(116) int local116 = local56; local116 < local63; local116++) {
								if (local116 - arg1 >= -arg2 && local116 - arg1 <= arg2) {
									@Pc(146) int local146 = local107 + local116 * this.aClass159_Sub1_1.anInt9504;
									for (@Pc(148) int local148 = local107; local148 < local114; local148++) {
										if (local148 - arg3 >= -arg2 && arg2 >= local148 - arg3 && arg4[local148 + arg2 - arg3][arg2 + local116 - arg1]) {
											@Pc(195) short[] local195 = this.aClass159_Sub1_1.aShortArrayArray1[local146];
											if (local195 != null) {
												@Pc(203) int local203;
												if (Stream.c()) {
													for (local203 = 0; local203 < local195.length; local203++) {
														local102++;
														local100.a(local195[local203] & 0xFFFF);
													}
												} else {
													for (local203 = 0; local203 < local195.length; local203++) {
														local100.d(local195[local203] & 0xFFFF);
														local102++;
													}
												}
											}
										}
										local146++;
									}
								}
							}
							local100.b();
							if (local85.method5081() && local102 > 0) {
								@Pc(294) Class263_Sub2 local294 = this.aClass144_Sub1_10.method5724();
								local294.method7276(1.0F, local45, local45);
								local294.method8442(-local65, -local49, 0);
								this.aClass144_Sub1_10.method5750(Static282.aClass199_6);
								local74.method7975(local85, local102 / 3);
							}
						}
					}
				}
			}
		}
		this.aClass144_Sub1_10.method5778();
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIILclient!r;)V")
	public void method4698(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class14_Sub2_Sub5 arg2) {
		@Pc(11) Class14_Sub2_Sub5_Sub1 local11 = (Class14_Sub2_Sub5_Sub1) arg2;
		arg0 += local11.anInt1266 + 1;
		arg1 += local11.anInt1267 + 1;
		@Pc(33) int local33 = arg1 + arg0 * this.anInt5159;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = local11.anInt1268;
		@Pc(41) int local41 = local11.anInt1263;
		@Pc(47) int local47 = this.anInt5159 - local41;
		@Pc(54) int local54;
		if (arg0 <= 0) {
			local54 = 1 - arg0;
			local38 -= local54;
			local33 += local54 * this.anInt5159;
			arg0 = 1;
			local35 = local54 * local41;
		}
		@Pc(75) int local75 = 0;
		if (arg0 + local38 >= this.anInt5152) {
			local54 = arg0 + local38 + 1 - this.anInt5152;
			local38 -= local54;
		}
		if (arg1 <= 0) {
			local54 = 1 - arg1;
			arg1 = 1;
			local33 += local54;
			local41 -= local54;
			local47 += local54;
			local75 = local54;
			local35 += local54;
		}
		if (arg1 + local41 >= this.anInt5159) {
			local54 = arg1 + local41 + 1 - this.anInt5159;
			local75 += local54;
			local41 -= local54;
			local47 += local54;
		}
		if (local41 > 0 && local38 > 0) {
			Static340.method5216(local75, local47, local11.aByteArray8, this.aByteArray64, local41, local35, local33, local38);
			this.method4700(local38, arg1, arg0, local41);
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IBIII)V")
	private void method4700(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass327ArrayArray1 == null) {
			return;
		}
		@Pc(24) int local24 = arg1 - 1 >> 7;
		@Pc(34) int local34 = arg3 + arg1 - 1 - 1 >> 7;
		@Pc(40) int local40 = arg2 - 1 >> 7;
		@Pc(50) int local50 = arg0 + arg2 - 1 - 1 >> 7;
		for (@Pc(52) int local52 = local24; local52 <= local34; local52++) {
			@Pc(59) Class327[] local59 = this.aClass327ArrayArray1[local52];
			for (@Pc(61) int local61 = local40; local61 <= local50; local61++) {
				if (local59[local61] != null) {
					local59[local61].aBoolean641 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(ILclient!r;IB)V")
	public void method4701(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub2_Sub5 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class14_Sub2_Sub5_Sub1 local6 = (Class14_Sub2_Sub5_Sub1) arg1;
		arg0 += local6.anInt1266 + 1;
		arg2 += local6.anInt1267 + 1;
		@Pc(27) int local27 = this.anInt5159 * arg0 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt1268;
		@Pc(35) int local35 = local6.anInt1263;
		@Pc(40) int local40 = this.anInt5159 - local35;
		@Pc(50) int local50;
		if (arg0 <= 0) {
			local50 = 1 - arg0;
			local27 += local50 * this.anInt5159;
			arg0 = 1;
			local29 = local50 * local35;
			local32 -= local50;
		}
		@Pc(71) int local71 = 0;
		if (local32 + arg0 >= this.anInt5152) {
			local50 = local32 + arg0 + 1 - this.anInt5152;
			local32 -= local50;
		}
		if (arg2 <= 0) {
			local50 = 1 - arg2;
			local29 += local50;
			local27 += local50;
			local71 = local50;
			arg2 = 1;
			local40 += local50;
			local35 -= local50;
		}
		if (arg2 + local35 >= this.anInt5159) {
			local50 = local35 + arg2 + 1 - this.anInt5159;
			local35 -= local50;
			local40 += local50;
			local71 += local50;
		}
		if (local35 > 0 && local32 > 0) {
			Static69.method1091(local35, local71, local32, local29, local40, this.aByteArray64, local6.aByteArray8, local27);
			this.method4700(local32, arg2, arg0, local35);
		}
	}
}
