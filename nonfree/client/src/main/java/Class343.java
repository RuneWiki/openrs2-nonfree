import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class343 {

	@OriginalMember(owner = "client!vg", name = "r", descriptor = "[[Lclient!uk;")
	private Class329[][] aClass329ArrayArray1;

	@OriginalMember(owner = "client!vg", name = "q", descriptor = "Lclient!sq;")
	private final Class115_Sub2 aClass115_Sub2_3;

	@OriginalMember(owner = "client!vg", name = "j", descriptor = "Lclient!nh;")
	private final Class7_Sub1 aClass7_Sub1_22;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
	public final int anInt10141;

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
	private final int anInt10147;

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "[B")
	public final byte[] aByteArray104;

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
	private final int anInt10148;

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
	private final int anInt10146;

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
	private final int anInt10144;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lclient!nh;Lclient!sq;)V")
	public Class343(@OriginalArg(0) Class7_Sub1 arg0, @OriginalArg(1) Class115_Sub2 arg1) {
		this.aClass115_Sub2_3 = arg1;
		this.aClass7_Sub1_22 = arg0;
		this.anInt10141 = (this.aClass115_Sub2_3.anInt10333 * this.aClass115_Sub2_3.anInt10330 >> this.aClass7_Sub1_22.anInt7364) + 2;
		this.anInt10147 = (this.aClass115_Sub2_3.anInt10327 * this.aClass115_Sub2_3.anInt10333 >> this.aClass7_Sub1_22.anInt7364) + 2;
		this.aByteArray104 = new byte[this.anInt10141 * this.anInt10147];
		this.anInt10148 = this.aClass7_Sub1_22.anInt7364 + 7 - this.aClass115_Sub2_3.anInt10331;
		this.anInt10146 = this.aClass115_Sub2_3.anInt10330 >> this.anInt10148;
		this.anInt10144 = this.aClass115_Sub2_3.anInt10327 >> this.anInt10148;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILclient!ha;II)V")
	public void method7886(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub6_Sub7 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class4_Sub6_Sub7_Sub2 local6 = (Class4_Sub6_Sub7_Sub2) arg1;
		arg0 += local6.anInt9674 + 1;
		arg2 += local6.anInt9669 + 1;
		@Pc(27) int local27 = arg2 + arg0 * this.anInt10141;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt9667;
		@Pc(35) int local35 = local6.anInt9676;
		@Pc(40) int local40 = this.anInt10141 - local35;
		@Pc(42) int local42 = 0;
		@Pc(52) int local52;
		if (arg0 <= 0) {
			local52 = 1 - arg0;
			arg0 = 1;
			local32 -= local52;
			local29 = local35 * local52;
			local27 += this.anInt10141 * local52;
		}
		if (this.anInt10147 <= arg0 + local32) {
			local52 = local32 + arg0 + 1 - this.anInt10147;
			local32 -= local52;
		}
		if (arg2 <= 0) {
			local52 = 1 - arg2;
			local40 += local52;
			local35 -= local52;
			local29 += local52;
			local42 = local52;
			local27 += local52;
			arg2 = 1;
		}
		if (local35 + arg2 >= this.anInt10141) {
			local52 = arg2 + local35 + 1 - this.anInt10141;
			local42 += local52;
			local40 += local52;
			local35 -= local52;
		}
		if (local35 > 0 && local32 > 0) {
			Static106.method1996(local40, local29, local6.aByteArray91, local32, this.aByteArray104, local42, local35, local27);
			this.method7889(arg2, local35, arg0, local32);
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
	public void method7888() {
		this.aClass329ArrayArray1 = new Class329[this.anInt10146][this.anInt10144];
		for (@Pc(18) int local18 = 0; local18 < this.anInt10144; local18++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt10146; local22++) {
				this.aClass329ArrayArray1[local22][local18] = new Class329(this.aClass7_Sub1_22, this, this.aClass115_Sub2_3, local22, local18, this.anInt10148, local22 * 128 + 1, local18 * 128 + 1);
				if (this.aClass329ArrayArray1[local22][local18].anInt9783 == 0) {
					this.aClass329ArrayArray1[local22][local18] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIII)V")
	private void method7889(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass329ArrayArray1 == null) {
			return;
		}
		@Pc(19) int local19 = arg0 - 1 >> 7;
		@Pc(29) int local29 = arg0 + arg1 - 1 - 1 >> 7;
		@Pc(35) int local35 = arg2 - 1 >> 7;
		@Pc(45) int local45 = arg3 + arg2 - 1 - 1 >> 7;
		for (@Pc(47) int local47 = local19; local47 <= local29; local47++) {
			@Pc(54) Class329[] local54 = this.aClass329ArrayArray1[local47];
			for (@Pc(56) int local56 = local35; local56 <= local45; local56++) {
				if (local54[local56] != null) {
					local54[local56].aBoolean659 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILclient!ha;IB)Z")
	public boolean method7890(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub6_Sub7 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class4_Sub6_Sub7_Sub2 local6 = (Class4_Sub6_Sub7_Sub2) arg1;
		arg2 += local6.anInt9674 + 1;
		arg0 += local6.anInt9669 + 1;
		@Pc(27) int local27 = arg0 + this.anInt10141 * arg2;
		@Pc(30) int local30 = local6.anInt9667;
		@Pc(33) int local33 = local6.anInt9676;
		@Pc(40) int local40;
		if (arg2 <= 0) {
			local40 = 1 - arg2;
			arg2 = 1;
			local30 -= local40;
			local27 += local40 * this.anInt10141;
		}
		@Pc(59) int local59 = this.anInt10141 - local33;
		if (this.anInt10147 <= local30 + arg2) {
			local40 = local30 + arg2 + 1 - this.anInt10147;
			local30 -= local40;
		}
		if (arg0 <= 0) {
			local40 = 1 - arg0;
			arg0 = 1;
			local59 += local40;
			local33 -= local40;
			local27 += local40;
		}
		if (local33 + arg0 >= this.anInt10141) {
			local40 = arg0 + local33 + 1 - this.anInt10141;
			local59 += local40;
			local33 -= local40;
		}
		if (local33 > 0 && local30 > 0) {
			local59 += this.anInt10141 * 7;
			return Static259.method4093(this.aByteArray104, local59, local33, local30, local27);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZBI[[ZII)V")
	public void method7891(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aClass7_Sub1_22.method5717(false);
		this.aClass7_Sub1_22.method5702(false);
		this.aClass7_Sub1_22.method5716(1);
		this.aClass7_Sub1_22.method5757(1);
		this.aClass7_Sub1_22.method5692(-2, false, false);
		@Pc(45) float local45 = 1.0F / (float) (this.aClass7_Sub1_22.anInt7357 * 128);
		@Pc(49) int local49;
		@Pc(56) int local56;
		@Pc(63) int local63;
		@Pc(65) int local65;
		if (arg0) {
			for (local49 = 0; local49 < this.anInt10144; local49++) {
				local56 = local49 << this.anInt10148;
				local63 = local49 + 1 << this.anInt10148;
				label138: for (local65 = 0; local65 < this.anInt10146; local65++) {
					if (this.aClass329ArrayArray1[local65][local49] != null) {
						@Pc(79) int local79 = local65 << this.anInt10148;
						@Pc(86) int local86 = local65 + 1 << this.anInt10148;
						for (@Pc(88) int local88 = local79; local88 < local86; local88++) {
							if (local88 - arg4 >= -arg1 && arg1 >= local88 - arg4) {
								for (@Pc(109) int local109 = local56; local109 < local63; local109++) {
									if (-arg1 <= local109 - arg3 && local109 - arg3 <= arg1 && arg2[local88 + arg1 - arg4][local109 + arg1 - arg3]) {
										@Pc(144) Class81_Sub1 local144 = this.aClass7_Sub1_22.method5727();
										local144.method1977(1.0F, local45, local45);
										local144.U(-local65, -local49, 0);
										this.aClass7_Sub1_22.method5737(Static85.aClass322_2);
										this.aClass329ArrayArray1[local65][local49].method7525();
										continue label138;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local49 = 0; local49 < this.anInt10144; local49++) {
				local56 = local49 << this.anInt10148;
				local63 = local49 + 1 << this.anInt10148;
				for (local65 = 0; local65 < this.anInt10146; local65++) {
					@Pc(233) Class329 local233 = this.aClass329ArrayArray1[local65][local49];
					if (local233 != null) {
						@Pc(244) Interface6 local244 = this.aClass7_Sub1_22.method5772(local233.anInt9783 * 3);
						@Pc(249) Buffer local249 = local244.method7935();
						if (local249 != null) {
							@Pc(257) Stream local257 = this.aClass7_Sub1_22.method5675(local249);
							@Pc(259) int local259 = 0;
							@Pc(264) int local264 = local65 << this.anInt10148;
							@Pc(271) int local271 = local65 + 1 << this.anInt10148;
							for (@Pc(273) int local273 = local56; local273 < local63; local273++) {
								if (local273 - arg3 >= -arg1 && local273 - arg3 <= arg1) {
									@Pc(295) int local295 = local264 + this.aClass115_Sub2_3.anInt10330 * local273;
									for (@Pc(297) int local297 = local264; local297 < local271; local297++) {
										if (local297 - arg4 >= -arg1 && arg1 >= local297 - arg4 && arg2[arg1 + local297 - arg4][arg1 + local273 - arg3]) {
											@Pc(339) short[] local339 = this.aClass115_Sub2_3.aShortArrayArray18[local295];
											if (local339 != null) {
												@Pc(345) int local345;
												if (Stream.c()) {
													for (local345 = 0; local345 < local339.length; local345++) {
														local259++;
														local257.d(local339[local345] & 0xFFFF);
													}
												} else {
													for (local345 = 0; local345 < local339.length; local345++) {
														local259++;
														local257.e(local339[local345] & 0xFFFF);
													}
												}
											}
										}
										local295++;
									}
								}
							}
							local257.a();
							if (local244.method7936() && local259 > 0) {
								@Pc(408) Class81_Sub1 local408 = this.aClass7_Sub1_22.method5727();
								local408.method1977(1.0F, local45, local45);
								local408.U(-local65, -local49, 0);
								this.aClass7_Sub1_22.method5737(Static85.aClass322_2);
								local233.method7522(local259 / 3, local244);
							}
						}
					}
				}
			}
		}
		this.aClass7_Sub1_22.method5750();
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IILclient!ha;Z)V")
	public void method7892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub6_Sub7 arg2) {
		@Pc(6) Class4_Sub6_Sub7_Sub2 local6 = (Class4_Sub6_Sub7_Sub2) arg2;
		arg1 += local6.anInt9669 + 1;
		arg0 += local6.anInt9674 + 1;
		@Pc(28) int local28 = arg1 + this.anInt10141 * arg0;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt9667;
		@Pc(36) int local36 = local6.anInt9676;
		@Pc(42) int local42 = this.anInt10141 - local36;
		@Pc(44) int local44 = 0;
		@Pc(51) int local51;
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			local30 = local51 * local36;
			local33 -= local51;
			local28 += this.anInt10141 * local51;
			arg0 = 1;
		}
		if (this.anInt10147 <= arg0 + local33) {
			local51 = local33 + arg0 + 1 - this.anInt10147;
			local33 -= local51;
		}
		if (arg1 <= 0) {
			local51 = 1 - arg1;
			local30 += local51;
			local42 += local51;
			arg1 = 1;
			local44 = local51;
			local36 -= local51;
			local28 += local51;
		}
		if (this.anInt10141 <= local36 + arg1) {
			local51 = arg1 + local36 + 1 - this.anInt10141;
			local42 += local51;
			local36 -= local51;
			local44 += local51;
		}
		if (local36 > 0 && local33 > 0) {
			Static537.method7534(local6.aByteArray91, local28, this.aByteArray104, local33, local36, local44, local30, local42);
			this.method7889(arg1, local36, arg0, local33);
		}
	}
}
