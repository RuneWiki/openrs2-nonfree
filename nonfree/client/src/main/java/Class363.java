import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class363 {

	@OriginalMember(owner = "client!ws", name = "l", descriptor = "[[Lclient!tm;")
	private Class329[][] aClass329ArrayArray1;

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "Lclient!mj;")
	private final Class45_Sub2 aClass45_Sub2_23;

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "Lclient!bh;")
	private final Class34_Sub1 aClass34_Sub1_3;

	@OriginalMember(owner = "client!ws", name = "j", descriptor = "I")
	public final int anInt9685;

	@OriginalMember(owner = "client!ws", name = "t", descriptor = "I")
	private final int anInt9690;

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "[B")
	public final byte[] aByteArray105;

	@OriginalMember(owner = "client!ws", name = "i", descriptor = "I")
	private final int anInt9684;

	@OriginalMember(owner = "client!ws", name = "f", descriptor = "I")
	private final int anInt9681;

	@OriginalMember(owner = "client!ws", name = "g", descriptor = "I")
	private final int anInt9682;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lclient!mj;Lclient!bh;)V")
	public Class363(@OriginalArg(0) Class45_Sub2 arg0, @OriginalArg(1) Class34_Sub1 arg1) {
		this.aClass45_Sub2_23 = arg0;
		this.aClass34_Sub1_3 = arg1;
		this.anInt9685 = (this.aClass34_Sub1_3.anInt7854 * this.aClass34_Sub1_3.anInt7850 >> this.aClass45_Sub2_23.anInt5858) + 2;
		this.anInt9690 = (this.aClass34_Sub1_3.anInt7852 * this.aClass34_Sub1_3.anInt7850 >> this.aClass45_Sub2_23.anInt5858) + 2;
		this.aByteArray105 = new byte[this.anInt9690 * this.anInt9685];
		this.anInt9684 = this.aClass45_Sub2_23.anInt5858 + 7 - this.aClass34_Sub1_3.anInt7856;
		this.anInt9681 = this.aClass34_Sub1_3.anInt7854 >> this.anInt9684;
		this.anInt9682 = this.aClass34_Sub1_3.anInt7852 >> this.anInt9684;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILclient!ha;II)V")
	public void method7911(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7_Sub13 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub7_Sub13_Sub2 local6 = (Class3_Sub7_Sub13_Sub2) arg1;
		arg0 += local6.anInt7677 + 1;
		arg2 += local6.anInt7668 + 1;
		@Pc(28) int local28 = arg0 + this.anInt9685 * arg2;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt7673;
		@Pc(36) int local36 = local6.anInt7672;
		@Pc(42) int local42 = this.anInt9685 - local36;
		@Pc(44) int local44 = 0;
		@Pc(54) int local54;
		if (arg2 <= 0) {
			local54 = 1 - arg2;
			arg2 = 1;
			local28 += this.anInt9685 * local54;
			local33 -= local54;
			local30 = local36 * local54;
		}
		if (arg2 + local33 >= this.anInt9690) {
			local54 = local33 + arg2 + 1 - this.anInt9690;
			local33 -= local54;
		}
		@Pc(114) int local114;
		if (arg0 <= 0) {
			local114 = 1 - arg0;
			arg0 = 1;
			local36 -= local114;
			local30 += local114;
			local28 += local114;
			local44 = local114;
			local42 += local114;
		}
		if (local36 + arg0 >= this.anInt9685) {
			local114 = local36 + arg0 + 1 - this.anInt9685;
			local42 += local114;
			local36 -= local114;
			local44 += local114;
		}
		if (local36 > 0 && local33 > 0) {
			Static355.method5381(local36, this.aByteArray105, local30, local28, local44, local33, local6.aByteArray85, local42);
			this.method7912(arg0, local36, local33, arg2);
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIIII)V")
	private void method7912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass329ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg0 - 1 >> 7;
		@Pc(23) int local23 = arg1 + arg0 - 2 >> 7;
		@Pc(29) int local29 = arg3 - 1 >> 7;
		@Pc(39) int local39 = arg2 + arg3 - 1 - 1 >> 7;
		for (@Pc(41) int local41 = local15; local41 <= local23; local41++) {
			@Pc(48) Class329[] local48 = this.aClass329ArrayArray1[local41];
			for (@Pc(50) int local50 = local29; local50 <= local39; local50++) {
				if (local48[local50] != null) {
					local48[local50].aBoolean636 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIILclient!ha;)V")
	public void method7913(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub7_Sub13 arg2) {
		@Pc(6) Class3_Sub7_Sub13_Sub2 local6 = (Class3_Sub7_Sub13_Sub2) arg2;
		arg1 += local6.anInt7668 + 1;
		arg0 += local6.anInt7677 + 1;
		@Pc(27) int local27 = arg0 + arg1 * this.anInt9685;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt7673;
		@Pc(35) int local35 = local6.anInt7672;
		@Pc(40) int local40 = this.anInt9685 - local35;
		@Pc(47) int local47;
		if (arg1 <= 0) {
			local47 = 1 - arg1;
			arg1 = 1;
			local29 = local47 * local35;
			local32 -= local47;
			local27 += this.anInt9685 * local47;
		}
		@Pc(68) int local68 = 0;
		if (this.anInt9690 <= local32 + arg1) {
			local47 = local32 + arg1 + 1 - this.anInt9690;
			local32 -= local47;
		}
		if (arg0 <= 0) {
			local47 = 1 - arg0;
			local35 -= local47;
			local68 = local47;
			local29 += local47;
			arg0 = 1;
			local27 += local47;
			local40 += local47;
		}
		if (this.anInt9685 <= arg0 + local35) {
			local47 = local35 + arg0 + 1 - this.anInt9685;
			local40 += local47;
			local68 += local47;
			local35 -= local47;
		}
		if (local35 > 0 && local32 > 0) {
			Static153.method2894(local29, local27, local35, local32, local40, this.aByteArray105, local6.aByteArray85, local68);
			this.method7912(arg0, local35, local32, arg1);
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIZII[[Z)V")
	public void method7914(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean[][] arg4) {
		this.aClass45_Sub2_23.method4905(false);
		this.aClass45_Sub2_23.method4981(false);
		this.aClass45_Sub2_23.method5019(1);
		this.aClass45_Sub2_23.method4939(1);
		this.aClass45_Sub2_23.method4947(false, -2, false);
		@Pc(47) float local47 = 1.0F / (float) (this.aClass45_Sub2_23.anInt5838 * 128);
		@Pc(51) int local51;
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(67) int local67;
		if (arg1) {
			for (local51 = 0; local51 < this.anInt9682; local51++) {
				local58 = local51 << this.anInt9684;
				local65 = local51 + 1 << this.anInt9684;
				label138: for (local67 = 0; local67 < this.anInt9681; local67++) {
					if (this.aClass329ArrayArray1[local67][local51] != null) {
						@Pc(81) int local81 = local67 << this.anInt9684;
						@Pc(88) int local88 = local67 + 1 << this.anInt9684;
						for (@Pc(90) int local90 = local81; local90 < local88; local90++) {
							if (local90 - arg0 >= -arg2 && local90 - arg0 <= arg2) {
								for (@Pc(111) int local111 = local58; local111 < local65; local111++) {
									if (local111 - arg3 >= -arg2 && arg2 >= local111 - arg3 && arg4[arg2 + local90 - arg0][local111 + arg2 - arg3]) {
										@Pc(152) Class11_Sub1 local152 = this.aClass45_Sub2_23.method5007();
										local152.method184(local47, local47, 1.0F);
										local152.U(-local67, -local51, 0);
										this.aClass45_Sub2_23.method4932(Static3.aClass222_12);
										this.aClass329ArrayArray1[local67][local51].method6892();
										continue label138;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local51 = 0; local51 < this.anInt9682; local51++) {
				local58 = local51 << this.anInt9684;
				local65 = local51 + 1 << this.anInt9684;
				for (local67 = 0; local67 < this.anInt9681; local67++) {
					@Pc(231) Class329 local231 = this.aClass329ArrayArray1[local67][local51];
					if (local231 != null) {
						@Pc(242) Interface13 local242 = this.aClass45_Sub2_23.method4914(local231.anInt8288 * 3);
						@Pc(247) Buffer local247 = local242.method6437();
						if (local247 != null) {
							@Pc(255) Stream local255 = this.aClass45_Sub2_23.method4901(local247);
							@Pc(257) int local257 = 0;
							@Pc(262) int local262 = local67 << this.anInt9684;
							@Pc(269) int local269 = local67 + 1 << this.anInt9684;
							for (@Pc(271) int local271 = local58; local271 < local65; local271++) {
								if (local271 - arg3 >= -arg2 && local271 - arg3 <= arg2) {
									@Pc(298) int local298 = local262 + local271 * this.aClass34_Sub1_3.anInt7854;
									for (@Pc(300) int local300 = local262; local300 < local269; local300++) {
										if (local300 - arg0 >= -arg2 && local300 - arg0 <= arg2 && arg4[local300 + arg2 - arg0][local271 + arg2 - arg3]) {
											@Pc(337) short[] local337 = this.aClass34_Sub1_3.aShortArrayArray1[local298];
											if (local337 != null) {
												@Pc(343) int local343;
												if (Stream.c()) {
													for (local343 = 0; local343 < local337.length; local343++) {
														local255.b(local337[local343] & 0xFFFF);
														local257++;
													}
												} else {
													for (local343 = 0; local343 < local337.length; local343++) {
														local255.e(local337[local343] & 0xFFFF);
														local257++;
													}
												}
											}
										}
										local298++;
									}
								}
							}
							local255.a();
							if (local242.method6433() && local257 > 0) {
								@Pc(402) Class11_Sub1 local402 = this.aClass45_Sub2_23.method5007();
								local402.method184(local47, local47, 1.0F);
								local402.U(-local67, -local51, 0);
								this.aClass45_Sub2_23.method4932(Static3.aClass222_12);
								local231.method6888(local242, local257 / 3);
							}
						}
					}
				}
			}
		}
		this.aClass45_Sub2_23.method4950();
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(ILclient!ha;II)Z")
	public boolean method7915(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7_Sub13 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub7_Sub13_Sub2 local6 = (Class3_Sub7_Sub13_Sub2) arg1;
		arg0 += local6.anInt7677 + 1;
		arg2 += local6.anInt7668 + 1;
		@Pc(32) int local32 = arg0 + arg2 * this.anInt9685;
		@Pc(35) int local35 = local6.anInt7673;
		@Pc(38) int local38 = local6.anInt7672;
		@Pc(48) int local48;
		if (arg2 <= 0) {
			local48 = 1 - arg2;
			local35 -= local48;
			local32 += local48 * this.anInt9685;
			arg2 = 1;
		}
		@Pc(67) int local67 = this.anInt9685 - local38;
		if (this.anInt9690 <= local35 + arg2) {
			local48 = arg2 + local35 + 1 - this.anInt9690;
			local35 -= local48;
		}
		if (arg0 <= 0) {
			local48 = 1 - arg0;
			local67 += local48;
			arg0 = 1;
			local38 -= local48;
			local32 += local48;
		}
		if (local38 + arg0 >= this.anInt9685) {
			local48 = local38 + arg0 + 1 - this.anInt9685;
			local38 -= local48;
			local67 += local48;
		}
		if (local38 > 0 && local35 > 0) {
			local67 += this.anInt9685 * 7;
			return Static396.method5776(local35, local67, this.aByteArray105, local32, local38);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
	public void method7917() {
		this.aClass329ArrayArray1 = new Class329[this.anInt9681][this.anInt9682];
		for (@Pc(14) int local14 = 0; local14 < this.anInt9682; local14++) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt9681; local20++) {
				this.aClass329ArrayArray1[local20][local14] = new Class329(this.aClass45_Sub2_23, this, this.aClass34_Sub1_3, local20, local14, this.anInt9684, local20 * 128 + 1, local14 * 128 - -1);
				if (this.aClass329ArrayArray1[local20][local14].anInt8288 == 0) {
					this.aClass329ArrayArray1[local20][local14] = null;
				}
			}
		}
	}
}
