import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public final class Class87 {

	@OriginalMember(owner = "client!ev", name = "f", descriptor = "[[Lclient!tl;")
	private Class324[][] aClass324ArrayArray1;

	@OriginalMember(owner = "client!ev", name = "q", descriptor = "Lclient!cf;")
	private final Class43_Sub1 aClass43_Sub1_7;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "Lclient!tr;")
	private final Class139_Sub3 aClass139_Sub3_2;

	@OriginalMember(owner = "client!ev", name = "m", descriptor = "I")
	public final int anInt2828;

	@OriginalMember(owner = "client!ev", name = "l", descriptor = "I")
	private final int anInt2827;

	@OriginalMember(owner = "client!ev", name = "u", descriptor = "[B")
	public final byte[] aByteArray32;

	@OriginalMember(owner = "client!ev", name = "h", descriptor = "I")
	private final int anInt2823;

	@OriginalMember(owner = "client!ev", name = "e", descriptor = "I")
	private final int anInt2821;

	@OriginalMember(owner = "client!ev", name = "i", descriptor = "I")
	private final int anInt2824;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lclient!cf;Lclient!tr;)V")
	public Class87(@OriginalArg(0) Class43_Sub1 arg0, @OriginalArg(1) Class139_Sub3 arg1) {
		this.aClass43_Sub1_7 = arg0;
		this.aClass139_Sub3_2 = arg1;
		this.anInt2828 = (this.aClass139_Sub3_2.anInt8178 * this.aClass139_Sub3_2.anInt8179 >> this.aClass43_Sub1_7.anInt4816) + 2;
		this.anInt2827 = (this.aClass139_Sub3_2.anInt8178 * this.aClass139_Sub3_2.anInt8180 >> this.aClass43_Sub1_7.anInt4816) + 2;
		this.aByteArray32 = new byte[this.anInt2828 * this.anInt2827];
		this.anInt2823 = this.aClass43_Sub1_7.anInt4816 + 7 - this.aClass139_Sub3_2.anInt8176;
		this.anInt2821 = this.aClass139_Sub3_2.anInt8179 >> this.anInt2823;
		this.anInt2824 = this.aClass139_Sub3_2.anInt8180 >> this.anInt2823;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIII)V")
	private void method2553(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass324ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg1 - 1 >> 7;
		@Pc(25) int local25 = arg0 + arg1 - 1 - 1 >> 7;
		@Pc(35) int local35 = arg2 - 1 >> 7;
		@Pc(45) int local45 = arg3 + arg2 - 1 - 1 >> 7;
		for (@Pc(47) int local47 = local15; local47 <= local25; local47++) {
			@Pc(54) Class324[] local54 = this.aClass324ArrayArray1[local47];
			for (@Pc(56) int local56 = local35; local56 <= local45; local56++) {
				if (local54[local56] != null) {
					local54[local56].aBoolean630 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(B)V")
	public void method2554() {
		this.aClass324ArrayArray1 = new Class324[this.anInt2821][this.anInt2824];
		for (@Pc(20) int local20 = 0; local20 < this.anInt2824; local20++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt2821; local24++) {
				this.aClass324ArrayArray1[local24][local20] = new Class324(this.aClass43_Sub1_7, this, this.aClass139_Sub3_2, local24, local20, this.anInt2823, local24 * 128 + 1, local20 * 128 + 1);
				if (this.aClass324ArrayArray1[local24][local20].anInt8119 == 0) {
					this.aClass324ArrayArray1[local24][local20] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ILclient!ha;II)V")
	public void method2555(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub3_Sub10 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class3_Sub3_Sub10_Sub2 local6 = (Class3_Sub3_Sub10_Sub2) arg1;
		arg0 += local6.anInt3382 + 1;
		arg2 += local6.anInt3386 + 1;
		@Pc(28) int local28 = arg0 + this.anInt2828 * arg2;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt3385;
		@Pc(36) int local36 = local6.anInt3381;
		@Pc(42) int local42 = this.anInt2828 - local36;
		@Pc(48) int local48;
		if (arg2 <= 0) {
			local48 = 1 - arg2;
			local30 = local48 * local36;
			local28 += this.anInt2828 * local48;
			local33 -= local48;
			arg2 = 1;
		}
		@Pc(69) int local69 = 0;
		if (this.anInt2827 <= local33 + arg2) {
			local48 = arg2 + local33 + 1 - this.anInt2827;
			local33 -= local48;
		}
		if (arg0 <= 0) {
			local48 = 1 - arg0;
			local69 = local48;
			local42 += local48;
			local30 += local48;
			local28 += local48;
			arg0 = 1;
			local36 -= local48;
		}
		if (local36 + arg0 >= this.anInt2828) {
			local48 = local36 + arg0 + 1 - this.anInt2828;
			local42 += local48;
			local69 += local48;
			local36 -= local48;
		}
		if (local36 > 0 && local33 > 0) {
			Static489.method6653(this.aByteArray32, local36, local69, local42, local33, local6.aByteArray35, local28, local30);
			this.method2553(local36, arg0, arg2, local33);
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!ha;III)Z")
	public boolean method2558(@OriginalArg(0) Class3_Sub3_Sub10 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub3_Sub10_Sub2 local6 = (Class3_Sub3_Sub10_Sub2) arg0;
		arg2 += local6.anInt3382 + 1;
		arg1 += local6.anInt3386 + 1;
		@Pc(27) int local27 = arg2 + arg1 * this.anInt2828;
		@Pc(30) int local30 = local6.anInt3385;
		@Pc(33) int local33 = local6.anInt3381;
		@Pc(42) int local42;
		if (arg1 <= 0) {
			local42 = 1 - arg1;
			local27 += local42 * this.anInt2828;
			arg1 = 1;
			local30 -= local42;
		}
		@Pc(61) int local61 = this.anInt2828 - local33;
		if (arg1 + local30 >= this.anInt2827) {
			local42 = local30 + arg1 + 1 - this.anInt2827;
			local30 -= local42;
		}
		if (arg2 <= 0) {
			local42 = 1 - arg2;
			local61 += local42;
			local33 -= local42;
			local27 += local42;
			arg2 = 1;
		}
		if (local33 + arg2 >= this.anInt2828) {
			local42 = arg2 + local33 + 1 - this.anInt2828;
			local33 -= local42;
			local61 += local42;
		}
		if (local33 > 0 && local30 > 0) {
			local61 += this.anInt2828 * 7;
			return Static374.method5525(local61, local30, local27, local33, this.aByteArray32);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IBIIZ[[Z)V")
	public void method2560(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean[][] arg4) {
		this.aClass43_Sub1_7.method4301(false);
		this.aClass43_Sub1_7.method4278(false);
		this.aClass43_Sub1_7.method4273(1);
		this.aClass43_Sub1_7.method4183(1);
		this.aClass43_Sub1_7.method4237(-2, false, false);
		@Pc(48) float local48 = 1.0F / (float) (this.aClass43_Sub1_7.anInt4806 * 128);
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(68) int local68;
		if (arg3) {
			for (local52 = 0; local52 < this.anInt2824; local52++) {
				local59 = local52 << this.anInt2823;
				local66 = local52 + 1 << this.anInt2823;
				label138: for (local68 = 0; local68 < this.anInt2821; local68++) {
					if (this.aClass324ArrayArray1[local68][local52] != null) {
						@Pc(82) int local82 = local68 << this.anInt2823;
						@Pc(89) int local89 = local68 + 1 << this.anInt2823;
						for (@Pc(91) int local91 = local82; local91 < local89; local91++) {
							if (local91 - arg2 >= -arg0 && arg0 >= local91 - arg2) {
								for (@Pc(112) int local112 = local59; local112 < local66; local112++) {
									if (-arg0 <= local112 - arg1 && local112 - arg1 <= arg0 && arg4[local91 + arg0 - arg2][local112 + arg0 - arg1]) {
										@Pc(147) Class109_Sub3 local147 = this.aClass43_Sub1_7.method4264();
										local147.method7121(1.0F, local48, local48);
										local147.U(-local68, -local52, 0);
										this.aClass43_Sub1_7.method4296(Static325.aClass174_26);
										this.aClass324ArrayArray1[local68][local52].method6835();
										continue label138;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local52 = 0; local52 < this.anInt2824; local52++) {
				local59 = local52 << this.anInt2823;
				local66 = local52 + 1 << this.anInt2823;
				for (local68 = 0; local68 < this.anInt2821; local68++) {
					@Pc(226) Class324 local226 = this.aClass324ArrayArray1[local68][local52];
					if (local226 != null) {
						@Pc(237) Interface17 local237 = this.aClass43_Sub1_7.method4281(local226.anInt8119 * 3);
						@Pc(242) Buffer local242 = local237.method6938();
						if (local242 != null) {
							@Pc(250) Stream local250 = this.aClass43_Sub1_7.method4233(local242);
							@Pc(252) int local252 = 0;
							@Pc(257) int local257 = local68 << this.anInt2823;
							@Pc(264) int local264 = local68 + 1 << this.anInt2823;
							for (@Pc(266) int local266 = local59; local266 < local66; local266++) {
								if (local266 - arg1 >= -arg0 && local266 - arg1 <= arg0) {
									@Pc(288) int local288 = local266 * this.aClass139_Sub3_2.anInt8179 + local257;
									for (@Pc(290) int local290 = local257; local290 < local264; local290++) {
										if (-arg0 <= local290 - arg2 && arg0 >= local290 - arg2 && arg4[arg0 + local290 - arg2][arg0 + local266 - arg1]) {
											@Pc(335) short[] local335 = this.aClass139_Sub3_2.aShortArrayArray79[local288];
											if (local335 != null) {
												@Pc(341) int local341;
												if (Stream.c()) {
													for (local341 = 0; local341 < local335.length; local341++) {
														local252++;
														local250.d(local335[local341] & 0xFFFF);
													}
												} else {
													for (local341 = 0; local341 < local335.length; local341++) {
														local250.f(local335[local341] & 0xFFFF);
														local252++;
													}
												}
											}
										}
										local288++;
									}
								}
							}
							local250.a();
							if (local237.method6941() && local252 > 0) {
								@Pc(412) Class109_Sub3 local412 = this.aClass43_Sub1_7.method4264();
								local412.method7121(1.0F, local48, local48);
								local412.U(-local68, -local52, 0);
								this.aClass43_Sub1_7.method4296(Static325.aClass174_26);
								local226.method6832(local237, local252 / 3);
							}
						}
					}
				}
			}
		}
		this.aClass43_Sub1_7.method4235();
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIILclient!ha;)V")
	public void method2561(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub3_Sub10 arg2) {
		@Pc(6) Class3_Sub3_Sub10_Sub2 local6 = (Class3_Sub3_Sub10_Sub2) arg2;
		arg0 += local6.anInt3382 + 1;
		arg1 += local6.anInt3386 + 1;
		@Pc(27) int local27 = this.anInt2828 * arg1 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(40) int local40 = local6.anInt3385;
		@Pc(43) int local43 = local6.anInt3381;
		@Pc(49) int local49 = this.anInt2828 - local43;
		@Pc(56) int local56;
		if (arg1 <= 0) {
			local56 = 1 - arg1;
			arg1 = 1;
			local27 += this.anInt2828 * local56;
			local40 -= local56;
			local29 = local56 * local43;
		}
		@Pc(77) int local77 = 0;
		if (this.anInt2827 <= arg1 + local40) {
			local56 = local40 + arg1 + 1 - this.anInt2827;
			local40 -= local56;
		}
		if (arg0 <= 0) {
			local56 = 1 - arg0;
			arg0 = 1;
			local43 -= local56;
			local29 += local56;
			local77 = local56;
			local27 += local56;
			local49 += local56;
		}
		if (arg0 + local43 >= this.anInt2828) {
			local56 = arg0 + local43 + 1 - this.anInt2828;
			local49 += local56;
			local77 += local56;
			local43 -= local56;
		}
		if (local43 > 0 && local40 > 0) {
			Static162.method2891(local29, local77, local27, local43, local6.aByteArray35, local40, local49, this.aByteArray32);
			this.method2553(local43, arg0, arg1, local40);
		}
	}
}
