import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class278 {

	@OriginalMember(owner = "client!qs", name = "o", descriptor = "[[Lclient!rt;")
	private Class296[][] aClass296ArrayArray1;

	@OriginalMember(owner = "client!qs", name = "m", descriptor = "Lclient!jda;")
	private final Class83_Sub2 aClass83_Sub2_2;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "Lclient!ifa;")
	private final Class44_Sub2 aClass44_Sub2_18;

	@OriginalMember(owner = "client!qs", name = "l", descriptor = "I")
	public final int anInt8185;

	@OriginalMember(owner = "client!qs", name = "i", descriptor = "I")
	private final int anInt8182;

	@OriginalMember(owner = "client!qs", name = "k", descriptor = "I")
	private final int anInt8184;

	@OriginalMember(owner = "client!qs", name = "r", descriptor = "[B")
	public final byte[] aByteArray92;

	@OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
	private final int anInt8179;

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
	private final int anInt8177;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!ifa;Lclient!jda;)V")
	public Class278(@OriginalArg(0) Class44_Sub2 arg0, @OriginalArg(1) Class83_Sub2 arg1) {
		this.aClass83_Sub2_2 = arg1;
		this.aClass44_Sub2_18 = arg0;
		this.anInt8185 = (this.aClass83_Sub2_2.anInt8824 * this.aClass83_Sub2_2.anInt8829 >> this.aClass44_Sub2_18.anInt4939) + 2;
		this.anInt8182 = (this.aClass83_Sub2_2.anInt8830 * this.aClass83_Sub2_2.anInt8824 >> this.aClass44_Sub2_18.anInt4939) + 2;
		this.anInt8184 = this.aClass44_Sub2_18.anInt4939 + 7 - this.aClass83_Sub2_2.anInt8825;
		this.aByteArray92 = new byte[this.anInt8182 * this.anInt8185];
		this.anInt8179 = this.aClass83_Sub2_2.anInt8829 >> this.anInt8184;
		this.anInt8177 = this.aClass83_Sub2_2.anInt8830 >> this.anInt8184;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
	public void method6786() {
		this.aClass296ArrayArray1 = new Class296[this.anInt8179][this.anInt8177];
		for (@Pc(23) int local23 = 0; local23 < this.anInt8177; local23++) {
			for (@Pc(27) int local27 = 0; local27 < this.anInt8179; local27++) {
				this.aClass296ArrayArray1[local27][local23] = new Class296(this.aClass44_Sub2_18, this, this.aClass83_Sub2_2, local27, local23, this.anInt8184, local27 * 128 + 1, local23 * 128 - -1);
				if (this.aClass296ArrayArray1[local27][local23].anInt8638 == 0) {
					this.aClass296ArrayArray1[local27][local23] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(II[[ZIZI)V")
	public void method6788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass44_Sub2_18.method4244(false);
		this.aClass44_Sub2_18.method4248(false);
		this.aClass44_Sub2_18.method4321(1);
		this.aClass44_Sub2_18.method4335(1);
		this.aClass44_Sub2_18.method4272(-2, false, false);
		@Pc(49) float local49 = 1.0F / (float) (this.aClass44_Sub2_18.anInt4964 * 128);
		@Pc(53) int local53;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(69) int local69;
		if (arg4) {
			for (local53 = 0; local53 < this.anInt8177; local53++) {
				local60 = local53 << this.anInt8184;
				local67 = local53 + 1 << this.anInt8184;
				label87: for (local69 = 0; local69 < this.anInt8179; local69++) {
					if (this.aClass296ArrayArray1[local69][local53] != null) {
						@Pc(321) int local321 = local69 << this.anInt8184;
						@Pc(328) int local328 = local69 + 1 << this.anInt8184;
						for (@Pc(330) int local330 = local321; local330 < local328; local330++) {
							if (-arg3 <= local330 - arg0 && arg3 >= local330 - arg0) {
								for (@Pc(355) int local355 = local60; local355 < local67; local355++) {
									if (local355 - arg1 >= -arg3 && local355 - arg1 <= arg3 && arg2[arg3 + local330 - arg0][arg3 + local355 - arg1]) {
										@Pc(391) Class8_Sub3 local391 = this.aClass44_Sub2_18.method4353();
										local391.method1564(local49, 1.0F, local49);
										local391.U(-local69, -local53, 0);
										this.aClass44_Sub2_18.method4268(Static88.aClass340_2);
										this.aClass296ArrayArray1[local69][local53].method7049();
										continue label87;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local53 = 0; local53 < this.anInt8177; local53++) {
				local60 = local53 << this.anInt8184;
				local67 = local53 + 1 << this.anInt8184;
				for (local69 = 0; local69 < this.anInt8179; local69++) {
					@Pc(78) Class296 local78 = this.aClass296ArrayArray1[local69][local53];
					if (local78 != null) {
						@Pc(89) Interface3 local89 = this.aClass44_Sub2_18.method4326(local78.anInt8638 * 3);
						@Pc(94) Buffer local94 = local89.method5235();
						if (local94 != null) {
							@Pc(102) Stream local102 = this.aClass44_Sub2_18.method4315(local94);
							@Pc(104) int local104 = 0;
							@Pc(109) int local109 = local69 << this.anInt8184;
							@Pc(116) int local116 = local69 + 1 << this.anInt8184;
							for (@Pc(118) int local118 = local60; local118 < local67; local118++) {
								if (local118 - arg1 >= -arg3 && arg3 >= local118 - arg1) {
									@Pc(140) int local140 = local118 * this.aClass83_Sub2_2.anInt8829 + local109;
									for (@Pc(142) int local142 = local109; local142 < local116; local142++) {
										if (-arg3 <= local142 - arg0 && arg3 >= local142 - arg0 && arg2[arg3 + local142 - arg0][arg3 + local118 - arg1]) {
											@Pc(178) short[] local178 = this.aClass83_Sub2_2.aShortArrayArray2[local140];
											if (local178 != null) {
												@Pc(184) int local184;
												if (Stream.b()) {
													for (local184 = 0; local184 < local178.length; local184++) {
														local104++;
														local102.e(local178[local184] & 0xFFFF);
													}
												} else {
													for (local184 = 0; local184 < local178.length; local184++) {
														local102.f(local178[local184] & 0xFFFF);
														local104++;
													}
												}
											}
										}
										local140++;
									}
								}
							}
							local102.a();
							if (local89.method5237() && local104 > 0) {
								@Pc(244) Class8_Sub3 local244 = this.aClass44_Sub2_18.method4353();
								local244.method1564(local49, 1.0F, local49);
								local244.U(-local69, -local53, 0);
								this.aClass44_Sub2_18.method4268(Static88.aClass340_2);
								local78.method7045(local104 / 3, local89);
							}
						}
					}
				}
			}
		}
		this.aClass44_Sub2_18.method4247();
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!ha;ZII)V")
	public void method6789(@OriginalArg(0) Class4_Sub5_Sub6 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class4_Sub5_Sub6_Sub1 local6 = (Class4_Sub5_Sub6_Sub1) arg0;
		arg2 += local6.anInt8631 + 1;
		arg1 += local6.anInt8626 + 1;
		@Pc(32) int local32 = this.anInt8185 * arg2 + arg1;
		@Pc(34) int local34 = 0;
		@Pc(37) int local37 = local6.anInt8635;
		@Pc(40) int local40 = local6.anInt8628;
		@Pc(46) int local46 = this.anInt8185 - local40;
		@Pc(56) int local56;
		if (arg2 <= 0) {
			local56 = 1 - arg2;
			local32 += this.anInt8185 * local56;
			local34 = local56 * local40;
			local37 -= local56;
			arg2 = 1;
		}
		@Pc(77) int local77 = 0;
		if (this.anInt8182 <= local37 + arg2) {
			local56 = arg2 + local37 + 1 - this.anInt8182;
			local37 -= local56;
		}
		if (arg1 <= 0) {
			local56 = 1 - arg1;
			local34 += local56;
			local32 += local56;
			local40 -= local56;
			local46 += local56;
			local77 = local56;
			arg1 = 1;
		}
		if (this.anInt8185 <= arg1 + local40) {
			local56 = local40 + arg1 + 1 - this.anInt8185;
			local40 -= local56;
			local77 += local56;
			local46 += local56;
		}
		if (local40 > 0 && local37 > 0) {
			Static276.method4774(local34, local6.aByteArray95, local37, local32, local46, local40, local77, this.aByteArray92);
			this.method6792(local40, arg1, arg2, local37);
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILclient!ha;II)V")
	public void method6791(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub5_Sub6 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class4_Sub5_Sub6_Sub1 local6 = (Class4_Sub5_Sub6_Sub1) arg1;
		arg2 += local6.anInt8626 + 1;
		arg0 += local6.anInt8631 + 1;
		@Pc(28) int local28 = arg2 + arg0 * this.anInt8185;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt8635;
		@Pc(36) int local36 = local6.anInt8628;
		@Pc(42) int local42 = this.anInt8185 - local36;
		@Pc(44) int local44 = 0;
		@Pc(53) int local53;
		if (arg0 <= 0) {
			local53 = 1 - arg0;
			arg0 = 1;
			local33 -= local53;
			local30 = local36 * local53;
			local28 += this.anInt8185 * local53;
		}
		if (this.anInt8182 <= arg0 + local33) {
			local53 = local33 + arg0 + 1 - this.anInt8182;
			local33 -= local53;
		}
		if (arg2 <= 0) {
			local53 = 1 - arg2;
			arg2 = 1;
			local44 = local53;
			local30 += local53;
			local36 -= local53;
			local28 += local53;
			local42 += local53;
		}
		if (local36 + arg2 >= this.anInt8185) {
			local53 = local36 + arg2 + 1 - this.anInt8185;
			local36 -= local53;
			local44 += local53;
			local42 += local53;
		}
		if (local36 > 0 && local33 > 0) {
			Static165.method3012(local6.aByteArray95, local28, this.aByteArray92, local33, local36, local30, local42, local44);
			this.method6792(local36, arg2, arg0, local33);
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIB)V")
	private void method6792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass296ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg1 - 1 >> 7;
		@Pc(31) int local31 = arg1 + arg0 - 1 - 1 >> 7;
		@Pc(37) int local37 = arg2 - 1 >> 7;
		@Pc(48) int local48 = arg2 + arg3 - 1 - 1 >> 7;
		for (@Pc(50) int local50 = local15; local50 <= local31; local50++) {
			@Pc(57) Class296[] local57 = this.aClass296ArrayArray1[local50];
			for (@Pc(59) int local59 = local37; local59 <= local48; local59++) {
				if (local57[local59] != null) {
					local57[local59].aBoolean608 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IILclient!ha;I)Z")
	public boolean method6793(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub5_Sub6 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class4_Sub5_Sub6_Sub1 local6 = (Class4_Sub5_Sub6_Sub1) arg1;
		arg0 += local6.anInt8631 + 1;
		arg2 += local6.anInt8626 + 1;
		@Pc(27) int local27 = this.anInt8185 * arg0 + arg2;
		@Pc(30) int local30 = local6.anInt8635;
		@Pc(33) int local33 = local6.anInt8628;
		@Pc(39) int local39 = this.anInt8185 - local33;
		@Pc(46) int local46;
		if (arg0 <= 0) {
			local46 = 1 - arg0;
			local30 -= local46;
			local27 += this.anInt8185 * local46;
			arg0 = 1;
		}
		if (this.anInt8182 <= local30 + arg0) {
			local46 = arg0 + local30 + 1 - this.anInt8182;
			local30 -= local46;
		}
		if (arg2 <= 0) {
			local46 = 1 - arg2;
			local27 += local46;
			arg2 = 1;
			local33 -= local46;
			local39 += local46;
		}
		if (this.anInt8185 <= arg2 + local33) {
			local46 = local33 + arg2 + 1 - this.anInt8185;
			local33 -= local46;
			local39 += local46;
		}
		if (local33 > 0 && local30 > 0) {
			local39 += this.anInt8185 * 7;
			return Static57.method964(this.aByteArray92, local33, local39, local27, local30);
		} else {
			return false;
		}
	}
}
