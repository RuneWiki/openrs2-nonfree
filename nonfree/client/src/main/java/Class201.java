import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class201 {

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "[[Lclient!wea;")
	private Class397[][] aClass397ArrayArray1;

	@OriginalMember(owner = "client!jp", name = "k", descriptor = "Lclient!lb;")
	private final Class145_Sub1 aClass145_Sub1_13;

	@OriginalMember(owner = "client!jp", name = "p", descriptor = "Lclient!rj;")
	private final Class133_Sub3 aClass133_Sub3_3;

	@OriginalMember(owner = "client!jp", name = "r", descriptor = "I")
	public final int anInt4757;

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "I")
	private final int anInt4749;

	@OriginalMember(owner = "client!jp", name = "o", descriptor = "[B")
	public final byte[] aByteArray67;

	@OriginalMember(owner = "client!jp", name = "j", descriptor = "I")
	private final int anInt4750;

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
	private final int anInt4748;

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
	private final int anInt4751;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lclient!lb;Lclient!rj;)V")
	public Class201(@OriginalArg(0) Class145_Sub1 arg0, @OriginalArg(1) Class133_Sub3 arg1) {
		this.aClass145_Sub1_13 = arg0;
		this.aClass133_Sub3_3 = arg1;
		this.anInt4757 = (this.aClass133_Sub3_3.anInt9318 * this.aClass133_Sub3_3.anInt9321 >> this.aClass145_Sub1_13.anInt11265) + 2;
		this.anInt4749 = (this.aClass133_Sub3_3.anInt9315 * this.aClass133_Sub3_3.anInt9321 >> this.aClass145_Sub1_13.anInt11265) + 2;
		this.aByteArray67 = new byte[this.anInt4757 * this.anInt4749];
		this.anInt4750 = this.aClass145_Sub1_13.anInt11265 + 7 - this.aClass133_Sub3_3.anInt9317;
		this.anInt4748 = this.aClass133_Sub3_3.anInt9318 >> this.anInt4750;
		this.anInt4751 = this.aClass133_Sub3_3.anInt9315 >> this.anInt4750;
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(IILclient!r;I)V")
	public void method4322(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub6_Sub9 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class2_Sub6_Sub9_Sub2 local6 = (Class2_Sub6_Sub9_Sub2) arg1;
		arg2 += local6.anInt5303 + 1;
		arg0 += local6.anInt5298 + 1;
		@Pc(27) int local27 = arg2 * this.anInt4757 + arg0;
		@Pc(34) int local34 = 0;
		@Pc(37) int local37 = local6.anInt5301;
		@Pc(40) int local40 = local6.anInt5302;
		@Pc(46) int local46 = this.anInt4757 - local40;
		@Pc(48) int local48 = 0;
		@Pc(55) int local55;
		if (arg2 <= 0) {
			local55 = 1 - arg2;
			local37 -= local55;
			local27 += this.anInt4757 * local55;
			arg2 = 1;
			local34 = local40 * local55;
		}
		if (this.anInt4749 <= arg2 + local37) {
			local55 = local37 + arg2 + 1 - this.anInt4749;
			local37 -= local55;
		}
		if (arg0 <= 0) {
			local55 = 1 - arg0;
			local27 += local55;
			local48 = local55;
			local34 += local55;
			arg0 = 1;
			local40 -= local55;
			local46 += local55;
		}
		if (local40 + arg0 >= this.anInt4757) {
			local55 = arg0 + local40 + 1 - this.anInt4757;
			local48 += local55;
			local46 += local55;
			local40 -= local55;
		}
		if (local40 > 0 && local37 > 0) {
			Static440.method6373(local6.aByteArray73, local40, local46, local37, local48, local34, local27, this.aByteArray67);
			this.method4328(arg2, local37, arg0, local40);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILclient!r;II)V")
	public void method4323(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub6_Sub9 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class2_Sub6_Sub9_Sub2 local6 = (Class2_Sub6_Sub9_Sub2) arg1;
		arg2 += local6.anInt5298 + 1;
		arg0 += local6.anInt5303 + 1;
		@Pc(28) int local28 = arg2 + this.anInt4757 * arg0;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt5301;
		@Pc(36) int local36 = local6.anInt5302;
		@Pc(42) int local42 = this.anInt4757 - local36;
		@Pc(49) int local49;
		if (arg0 <= 0) {
			local49 = 1 - arg0;
			local28 += local49 * this.anInt4757;
			local30 = local36 * local49;
			arg0 = 1;
			local33 -= local49;
		}
		@Pc(70) int local70 = 0;
		if (this.anInt4749 <= arg0 + local33) {
			local49 = local33 + arg0 + 1 - this.anInt4749;
			local33 -= local49;
		}
		if (arg2 <= 0) {
			local49 = 1 - arg2;
			local36 -= local49;
			arg2 = 1;
			local42 += local49;
			local30 += local49;
			local28 += local49;
			local70 = local49;
		}
		if (this.anInt4757 <= arg2 + local36) {
			local49 = local36 + arg2 + 1 - this.anInt4757;
			local70 += local49;
			local42 += local49;
			local36 -= local49;
		}
		if (local36 > 0 && local33 > 0) {
			Static236.method3348(local70, local36, local30, local42, local28, this.aByteArray67, local33, local6.aByteArray73);
			this.method4328(arg0, local33, arg2, local36);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIZ[[ZBI)V")
	public void method4324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(5) int arg4) {
		this.aClass145_Sub1_13.method9801(false);
		this.aClass145_Sub1_13.method9822(false);
		this.aClass145_Sub1_13.method9832(1);
		this.aClass145_Sub1_13.method9797(1);
		this.aClass145_Sub1_13.method9724(-2, false, false);
		@Pc(49) float local49 = 1.0F / (float) (this.aClass145_Sub1_13.anInt11270 * 128);
		@Pc(53) int local53;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(69) int local69;
		if (arg2) {
			for (local53 = 0; local53 < this.anInt4751; local53++) {
				local60 = local53 << this.anInt4750;
				local67 = local53 + 1 << this.anInt4750;
				label138: for (local69 = 0; local69 < this.anInt4748; local69++) {
					if (this.aClass397ArrayArray1[local69][local53] != null) {
						@Pc(85) int local85 = local69 << this.anInt4750;
						@Pc(92) int local92 = local69 + 1 << this.anInt4750;
						for (@Pc(94) int local94 = local85; local94 < local92; local94++) {
							if (local94 - arg0 >= -arg4 && local94 - arg0 <= arg4) {
								for (@Pc(123) int local123 = local60; local123 < local67; local123++) {
									if (local123 - arg1 >= -arg4 && local123 - arg1 <= arg4 && arg3[local94 + arg4 - arg0][local123 + arg4 - arg1]) {
										@Pc(163) Class86_Sub2 local163 = this.aClass145_Sub1_13.method9821();
										local163.method2718(local49, local49, 1.0F);
										local163.method7020(-local69, -local53, 0);
										this.aClass145_Sub1_13.method9750(Static145.aClass146_2);
										this.aClass397ArrayArray1[local69][local53].method9427();
										continue label138;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local53 = 0; local53 < this.anInt4751; local53++) {
				local60 = local53 << this.anInt4750;
				local67 = local53 + 1 << this.anInt4750;
				for (local69 = 0; local69 < this.anInt4748; local69++) {
					@Pc(260) Class397 local260 = this.aClass397ArrayArray1[local69][local53];
					if (local260 != null) {
						@Pc(271) Interface15 local271 = this.aClass145_Sub1_13.method9824(local260.anInt10789 * 3);
						@Pc(276) Buffer local276 = local271.method4689();
						if (local276 != null) {
							@Pc(284) Stream local284 = this.aClass145_Sub1_13.method9844(local276);
							@Pc(286) int local286 = 0;
							@Pc(291) int local291 = local69 << this.anInt4750;
							@Pc(298) int local298 = local69 + 1 << this.anInt4750;
							for (@Pc(300) int local300 = local60; local300 < local67; local300++) {
								if (local300 - arg1 >= -arg4 && local300 - arg1 <= arg4) {
									@Pc(336) int local336 = this.aClass133_Sub3_3.anInt9318 * local300 + local291;
									for (@Pc(338) int local338 = local291; local338 < local298; local338++) {
										if (local338 - arg0 >= -arg4 && local338 - arg0 <= arg4 && arg3[local338 + arg4 - arg0][local300 + arg4 - arg1]) {
											@Pc(386) short[] local386 = this.aClass133_Sub3_3.aShortArrayArray5[local336];
											if (local386 != null) {
												@Pc(394) int local394;
												if (Stream.b()) {
													for (local394 = 0; local394 < local386.length; local394++) {
														local286++;
														local284.d(local386[local394] & 0xFFFF);
													}
												} else {
													for (local394 = 0; local394 < local386.length; local394++) {
														local286++;
														local284.b(local386[local394] & 0xFFFF);
													}
												}
											}
										}
										local336++;
									}
								}
							}
							local284.a();
							if (local271.method4691() && local286 > 0) {
								@Pc(479) Class86_Sub2 local479 = this.aClass145_Sub1_13.method9821();
								local479.method2718(local49, local49, 1.0F);
								local479.method7020(-local69, -local53, 0);
								this.aClass145_Sub1_13.method9750(Static145.aClass146_2);
								local260.method9426(local286 / 3, local271);
							}
						}
					}
				}
			}
		}
		this.aClass145_Sub1_13.method9837();
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IILclient!r;I)Z")
	public boolean method4327(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub6_Sub9 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class2_Sub6_Sub9_Sub2 local6 = (Class2_Sub6_Sub9_Sub2) arg1;
		arg0 += local6.anInt5303 + 1;
		arg2 += local6.anInt5298 + 1;
		@Pc(27) int local27 = arg0 * this.anInt4757 + arg2;
		@Pc(30) int local30 = local6.anInt5301;
		@Pc(33) int local33 = local6.anInt5302;
		@Pc(40) int local40;
		if (arg0 <= 0) {
			local40 = 1 - arg0;
			arg0 = 1;
			local30 -= local40;
			local27 += local40 * this.anInt4757;
		}
		@Pc(58) int local58 = this.anInt4757 - local33;
		if (local30 + arg0 >= this.anInt4749) {
			local40 = local30 + arg0 + 1 - this.anInt4749;
			local30 -= local40;
		}
		if (arg2 <= 0) {
			local40 = 1 - arg2;
			local58 += local40;
			arg2 = 1;
			local27 += local40;
			local33 -= local40;
		}
		if (this.anInt4757 <= local33 + arg2) {
			local40 = local33 + arg2 + 1 - this.anInt4757;
			local58 += local40;
			local33 -= local40;
		}
		if (local33 > 0 && local30 > 0) {
			local58 += this.anInt4757 * 7;
			return Static685.method9234(this.aByteArray67, local58, local27, local30, local33);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIIZ)V")
	private void method4328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass397ArrayArray1 == null) {
			return;
		}
		@Pc(16) int local16 = arg2 - 1 >> 7;
		@Pc(25) int local25 = arg2 + arg3 - 2 >> 7;
		@Pc(31) int local31 = arg0 - 1 >> 7;
		@Pc(52) int local52 = arg0 + arg1 - 1 - 1 >> 7;
		for (@Pc(54) int local54 = local16; local54 <= local25; local54++) {
			@Pc(61) Class397[] local61 = this.aClass397ArrayArray1[local54];
			for (@Pc(63) int local63 = local31; local63 <= local52; local63++) {
				if (local61[local63] != null) {
					local61[local63].aBoolean926 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V")
	public void method4329() {
		this.aClass397ArrayArray1 = new Class397[this.anInt4748][this.anInt4751];
		for (@Pc(14) int local14 = 0; local14 < this.anInt4751; local14++) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt4748; local20++) {
				this.aClass397ArrayArray1[local20][local14] = new Class397(this.aClass145_Sub1_13, this, this.aClass133_Sub3_3, local20, local14, this.anInt4750, local20 * 128 + 1, local14 * 128 + 1);
				if (this.aClass397ArrayArray1[local20][local14].anInt10789 == 0) {
					this.aClass397ArrayArray1[local20][local14] = null;
				}
			}
		}
		if (66 != 66) {
			this.method4324(-32, 29, true, (boolean[][]) null, 28);
		}
	}
}
