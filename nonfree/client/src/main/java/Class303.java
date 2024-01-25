import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qaa")
public final class Class303 {

	@OriginalMember(owner = "client!qaa", name = "i", descriptor = "[I")
	private final int[] anIntArray573 = new int[64];

	@OriginalMember(owner = "client!qaa", name = "o", descriptor = "I")
	private int anInt8002 = 0;

	@OriginalMember(owner = "client!qaa", name = "n", descriptor = "[[Lclient!aca;")
	private final Class4_Sub1_Sub1[][] aClass4_Sub1_Sub1ArrayArray1 = new Class4_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!qaa", name = "g", descriptor = "[I")
	private final int[] anIntArray572 = new int[8191];

	@OriginalMember(owner = "client!qaa", name = "f", descriptor = "[I")
	private final int[] anIntArray574 = new int[1600];

	@OriginalMember(owner = "client!qaa", name = "q", descriptor = "[[Lclient!aca;")
	private final Class4_Sub1_Sub1[][] aClass4_Sub1_Sub1ArrayArray2 = new Class4_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "Lclient!oka;")
	private final Class277 aClass277_15;

	@OriginalMember(owner = "client!qaa", name = "p", descriptor = "Lclient!uh;")
	private final Interface24 anInterface24_12;

	@OriginalMember(owner = "client!qaa", name = "k", descriptor = "Lclient!uh;")
	private final Interface24 anInterface24_13;

	@OriginalMember(owner = "client!qaa", name = "r", descriptor = "Lclient!lg;")
	private final Interface15 anInterface15_4;

	@OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Lclient!lb;)V")
	public Class303(@OriginalArg(0) Class145_Sub1 arg0) {
		this.aClass277_15 = arg0.method9830(new Class243[] { new Class243(new Class115[] { Static169.aClass115_1, Static169.aClass115_3, Static169.aClass115_5 }), new Class243(Static169.aClass115_2) });
		this.anInterface24_12 = arg0.method9825(true);
		this.anInterface24_13 = arg0.method9825(false);
		this.anInterface24_13.method9227(12, 393168);
		this.anInterface15_4 = arg0.method9776(false);
		this.anInterface15_4.method9224(49146);
		@Pc(98) Buffer local98 = this.anInterface15_4.method4689();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method9844(local98);
			@Pc(109) int local109;
			if (Stream.b()) {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.d(local115);
					local105.d(local115 + 1);
					local105.d(local115 + 2);
					local105.d(local115 + 2);
					local105.d(local115 + 3);
					local105.d(local115);
				}
			} else {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.b(local115);
					local105.b(local115 + 1);
					local105.b(local115 + 2);
					local105.b(local115 + 2);
					local105.b(local115 + 3);
					local105.b(local115);
				}
			}
			local105.a();
			this.anInterface15_4.method4691();
		}
		@Pc(206) Buffer local206 = this.anInterface24_13.method9228();
		if (local206 != null) {
			@Pc(213) Stream local213 = arg0.method9844(local206);
			if (Stream.b()) {
				for (local115 = 0; local115 < 8191; local115++) {
					local213.b(0.0F);
					local213.b(-1.0F);
					local213.b(0.0F);
					local213.b(0.0F);
					local213.b(-1.0F);
					local213.b(0.0F);
					local213.b(0.0F);
					local213.b(-1.0F);
					local213.b(0.0F);
					local213.b(0.0F);
					local213.b(-1.0F);
					local213.b(0.0F);
				}
			} else {
				for (local115 = 0; local115 < 8191; local115++) {
					local213.a(0.0F);
					local213.a(-1.0F);
					local213.a(0.0F);
					local213.a(0.0F);
					local213.a(-1.0F);
					local213.a(0.0F);
					local213.a(0.0F);
					local213.a(-1.0F);
					local213.a(0.0F);
					local213.a(0.0F);
					local213.a(-1.0F);
					local213.a(0.0F);
				}
			}
			local213.a();
			this.anInterface24_13.method9230();
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ZLclient!lb;)V")
	private void method7137(@OriginalArg(1) Class145_Sub1 arg0) {
		Static532.aFloat140 = arg0.aFloat194;
		arg0.method9831();
		arg0.method9828(false);
		arg0.method9822(false);
		arg0.method9730();
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Lclient!lb;Lclient!mb;II)V")
	public void method7138(@OriginalArg(0) Class145_Sub1 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(3) int arg2) {
		if (arg0.aClass86_Sub2_16 == null) {
			return;
		}
		if (arg2 < 0) {
			this.method7137(arg0);
		} else {
			this.method7142(arg0, arg2);
		}
		@Pc(31) float local31 = arg0.aClass86_Sub2_16.aFloat30;
		@Pc(35) float local35 = arg0.aClass86_Sub2_16.aFloat39;
		@Pc(39) float local39 = arg0.aClass86_Sub2_16.aFloat37;
		@Pc(43) float local43 = arg0.aClass86_Sub2_16.aFloat38;
		try {
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = Integer.MAX_VALUE;
			@Pc(49) int local49 = 0;
			@Pc(61) Class4_Sub1 local61 = arg1.aClass58_1.aClass4_Sub1_5;
			@Pc(64) Class4_Sub1 local64;
			@Pc(96) int local96;
			for (local64 = local61.aClass4_Sub1_9; local64 != local61; local64 = local64.aClass4_Sub1_9) {
				@Pc(69) Class4_Sub1_Sub1 local69 = (Class4_Sub1_Sub1) local64;
				local96 = (int) (local43 + local39 * (float) (local69.anInt5791 >> 12) + (float) (local69.anInt5786 >> 12) * local35 + (float) (local69.anInt5792 >> 12) * local31);
				this.anIntArray572[local45++] = local96;
				if (local96 < local47) {
					local47 = local96;
				}
				if (local49 < local96) {
					local49 = local96;
				}
			}
			@Pc(127) int local127 = local49 - local47;
			if (local127 + 2 <= 1600) {
				local96 = 0;
				local127 += 2;
			} else {
				local96 = Static496.method7088(local127) + 1 - Static6.anInt5785;
				local127 = (local127 >> local96) + 2;
			}
			local64 = local61.aClass4_Sub1_9;
			local45 = 0;
			@Pc(160) int local160 = -2;
			@Pc(162) boolean local162 = true;
			@Pc(164) boolean local164 = true;
			while (local61 != local64) {
				this.anInt8002 = 0;
				for (@Pc(173) int local173 = 0; local173 < local127; local173++) {
					this.anIntArray574[local173] = 0;
				}
				for (@Pc(192) int local192 = 0; local192 < 64; local192++) {
					this.anIntArray573[local192] = 0;
				}
				while (local61 != local64) {
					@Pc(218) Class4_Sub1_Sub1 local218 = (Class4_Sub1_Sub1) local64;
					if (local164) {
						local162 = local218.aBoolean490;
						local160 = local218.anInt5789;
						local164 = false;
					}
					if (local45 > 0 && (local218.anInt5789 != local160 || local162 != local218.aBoolean490)) {
						local164 = true;
						break;
					}
					@Pc(265) int local265 = this.anIntArray572[local45++] - local47 >> local96;
					if (local265 < 1600) {
						if (this.anIntArray574[local265] < 64) {
							this.aClass4_Sub1_Sub1ArrayArray2[local265][this.anIntArray574[local265]++] = local218;
						} else {
							label102: {
								if (this.anIntArray574[local265] == 64) {
									if (this.anInt8002 == 64) {
										break label102;
									}
									this.anIntArray574[local265] += this.anInt8002++ + 1;
								}
								this.aClass4_Sub1_Sub1ArrayArray1[this.anIntArray574[local265] - 64 - 1][this.anIntArray573[this.anIntArray574[local265] - 64 - 1]++] = local218;
							}
						}
					}
					local64 = local64.aClass4_Sub1_9;
				}
				arg0.method9724(local160 >= 0 ? local160 : -1, false, false);
				if (local162 && arg0.aFloat194 != Static532.aFloat140) {
					arg0.xa(Static532.aFloat140);
				} else if (arg0.aFloat194 != 1.0F) {
					arg0.xa(1.0F);
				}
				this.method7140(local127, arg0);
			}
		} catch (@Pc(421) Exception local421) {
		}
		this.method7145(arg0);
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Lclient!lb;B)V")
	public void method7139(@OriginalArg(0) Class145_Sub1 arg0) {
		this.anInterface24_12.method9227(24, 786336);
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IILclient!lb;)V")
	private void method7140(@OriginalArg(1) int arg0, @OriginalArg(2) Class145_Sub1 arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class86_Sub2 local11 = arg1.method9741();
		@Pc(14) float local14 = local11.aFloat33;
		@Pc(26) float local26 = local11.aFloat36;
		@Pc(29) float local29 = local11.aFloat32;
		@Pc(32) float local32 = local11.aFloat40;
		@Pc(35) float local35 = local11.aFloat34;
		@Pc(38) float local38 = local11.aFloat35;
		@Pc(42) float local42 = local14 + local32;
		@Pc(46) float local46 = local26 + local35;
		@Pc(50) float local50 = local29 + local38;
		@Pc(55) float local55 = local14 - local32;
		@Pc(60) float local60 = local26 - local35;
		@Pc(65) float local65 = local29 - local38;
		@Pc(69) float local69 = local32 - local14;
		@Pc(74) float local74 = local35 - local26;
		@Pc(79) float local79 = local38 - local29;
		@Pc(85) Buffer local85 = this.anInterface24_12.method9228();
		if (local85 == null) {
			return;
		}
		@Pc(94) Stream local94 = arg1.method9844(local85);
		@Pc(100) int local100;
		@Pc(120) int local120;
		@Pc(129) int local129;
		@Pc(140) Class4_Sub1_Sub1 local140;
		@Pc(143) int local143;
		@Pc(148) byte local148;
		@Pc(153) byte local153;
		@Pc(156) byte local156;
		@Pc(161) byte local161;
		@Pc(167) float local167;
		@Pc(173) float local173;
		@Pc(179) float local179;
		@Pc(184) int local184;
		@Pc(480) float local480;
		@Pc(485) int local485;
		@Pc(425) int local425;
		@Pc(441) Class4_Sub1_Sub1 local441;
		@Pc(444) int local444;
		@Pc(457) byte local457;
		@Pc(462) byte local462;
		@Pc(474) float local474;
		if (Stream.b()) {
			for (local100 = arg0 - 1; local100 >= 0; local100--) {
				local120 = this.anIntArray574[local100] <= 64 ? this.anIntArray574[local100] : 64;
				if (local120 > 0) {
					for (local129 = local120 - 1; local129 >= 0; local129--) {
						local140 = this.aClass4_Sub1_Sub1ArrayArray2[local100][local129];
						local143 = local140.anInt5784;
						local148 = (byte) (local143 >> 16);
						local153 = (byte) (local143 >> 8);
						local156 = (byte) local143;
						local161 = (byte) (local143 >>> 24);
						local167 = (float) (local140.anInt5792 >> 12);
						local173 = (float) (local140.anInt5786 >> 12);
						local179 = (float) (local140.anInt5791 >> 12);
						local184 = local140.anInt5793 >> 12;
						local94.b(local167 + local42 * (float) -local184);
						local94.b(local173 + local46 * (float) -local184);
						local94.b(local179 + local50 * (float) -local184);
						if (arg1.anInt11268 == 0) {
							local94.b(local148, local153, local156, local161);
						} else {
							local94.a(local148, local153, local156, local161);
						}
						local94.b(0.0F);
						local94.b(0.0F);
						local94.b(local167 + local55 * (float) local184);
						local94.b((float) local184 * local60 + local173);
						local94.b((float) local184 * local65 + local179);
						if (arg1.anInt11268 == 0) {
							local94.b(local148, local153, local156, local161);
						} else {
							local94.a(local148, local153, local156, local161);
						}
						local94.b(1.0F);
						local94.b(0.0F);
						local94.b(local167 + (float) local184 * local42);
						local94.b(local46 * (float) local184 + local173);
						local94.b(local179 + (float) local184 * local50);
						if (arg1.anInt11268 == 0) {
							local94.b(local148, local153, local156, local161);
						} else {
							local94.a(local148, local153, local156, local161);
						}
						local94.b(1.0F);
						local94.b(1.0F);
						local94.b(local167 + local69 * (float) local184);
						local94.b(local173 + (float) local184 * local74);
						local94.b((float) local184 * local79 + local179);
						if (arg1.anInt11268 == 0) {
							local94.b(local148, local153, local156, local161);
						} else {
							local94.a(local148, local153, local156, local161);
						}
						local94.b(0.0F);
						local94.b(1.0F);
						local7++;
					}
					if (this.anIntArray574[local100] > 64) {
						local425 = this.anIntArray574[local100] - 1 - 64;
						for (local143 = this.anIntArray573[local425] - 1; local143 >= 0; local143--) {
							local441 = this.aClass4_Sub1_Sub1ArrayArray1[local425][local143];
							local444 = local441.anInt5784;
							local156 = (byte) (local444 >> 16);
							local161 = (byte) (local444 >> 8);
							local457 = (byte) local444;
							local462 = (byte) (local444 >>> 24);
							local179 = (float) (local441.anInt5792 >> 12);
							local474 = (float) (local441.anInt5786 >> 12);
							local480 = (float) (local441.anInt5791 >> 12);
							local485 = local441.anInt5793 >> 12;
							local94.b(local179 + (float) -local485 * local42);
							local94.b((float) -local485 * local46 + local474);
							local94.b(local480 + (float) -local485 * local50);
							if (arg1.anInt11268 == 0) {
								local94.b(local156, local161, local457, local462);
							} else {
								local94.a(local156, local161, local457, local462);
							}
							local94.b(0.0F);
							local94.b(0.0F);
							local94.b(local179 + (float) local485 * local55);
							local94.b(local474 + (float) local485 * local60);
							local94.b(local480 + (float) local485 * local65);
							if (arg1.anInt11268 == 0) {
								local94.b(local156, local161, local457, local462);
							} else {
								local94.a(local156, local161, local457, local462);
							}
							local94.b(1.0F);
							local94.b(0.0F);
							local94.b(local42 * (float) local485 + local179);
							local94.b((float) local485 * local46 + local474);
							local94.b(local480 + local50 * (float) local485);
							if (arg1.anInt11268 == 0) {
								local94.b(local156, local161, local457, local462);
							} else {
								local94.a(local156, local161, local457, local462);
							}
							local94.b(1.0F);
							local94.b(1.0F);
							local94.b((float) local485 * local69 + local179);
							local94.b(local74 * (float) local485 + local474);
							local94.b(local480 + (float) local485 * local79);
							if (arg1.anInt11268 == 0) {
								local94.b(local156, local161, local457, local462);
							} else {
								local94.a(local156, local161, local457, local462);
							}
							local94.b(0.0F);
							local94.b(1.0F);
							local7++;
						}
					}
				}
			}
		} else {
			for (local100 = arg0 - 1; local100 >= 0; local100--) {
				local120 = this.anIntArray574[local100] <= 64 ? this.anIntArray574[local100] : 64;
				if (local120 > 0) {
					for (local129 = local120 - 1; local129 >= 0; local129--) {
						local140 = this.aClass4_Sub1_Sub1ArrayArray2[local100][local129];
						local143 = local140.anInt5784;
						local148 = (byte) (local143 >> 16);
						local153 = (byte) (local143 >> 8);
						local156 = (byte) local143;
						local161 = (byte) (local143 >>> 24);
						local167 = (float) (local140.anInt5792 >> 12);
						local173 = (float) (local140.anInt5786 >> 12);
						local179 = (float) (local140.anInt5791 >> 12);
						local184 = local140.anInt5793 >> 12;
						local94.a(local167 + (float) -local184 * local42);
						local94.a(local46 * (float) -local184 + local173);
						local94.a(local179 + (float) -local184 * local50);
						if (arg1.anInt11268 == 0) {
							local94.b(local148, local153, local156, local161);
						} else {
							local94.a(local148, local153, local156, local161);
						}
						local94.a(0.0F);
						local94.a(0.0F);
						local94.a(local167 + (float) local184 * local55);
						local94.a((float) local184 * local60 + local173);
						local94.a(local65 * (float) local184 + local179);
						if (arg1.anInt11268 == 0) {
							local94.b(local148, local153, local156, local161);
						} else {
							local94.a(local148, local153, local156, local161);
						}
						local94.a(1.0F);
						local94.a(0.0F);
						local94.a(local42 * (float) local184 + local167);
						local94.a(local46 * (float) local184 + local173);
						local94.a(local50 * (float) local184 + local179);
						if (arg1.anInt11268 == 0) {
							local94.b(local148, local153, local156, local161);
						} else {
							local94.a(local148, local153, local156, local161);
						}
						local94.a(1.0F);
						local94.a(1.0F);
						local94.a(local167 + (float) local184 * local69);
						local94.a(local173 + local74 * (float) local184);
						local94.a(local179 + local79 * (float) local184);
						if (arg1.anInt11268 == 0) {
							local94.b(local148, local153, local156, local161);
						} else {
							local94.a(local148, local153, local156, local161);
						}
						local94.a(0.0F);
						local94.a(1.0F);
						local7++;
					}
					if (this.anIntArray574[local100] > 64) {
						local425 = this.anIntArray574[local100] - 1 - 64;
						for (local143 = this.anIntArray573[local425] - 1; local143 >= 0; local143--) {
							local441 = this.aClass4_Sub1_Sub1ArrayArray1[local425][local143];
							local444 = local441.anInt5784;
							local156 = (byte) (local444 >> 16);
							local161 = (byte) (local444 >> 8);
							local457 = (byte) local444;
							local462 = (byte) (local444 >>> 24);
							local179 = (float) (local441.anInt5792 >> 12);
							local474 = (float) (local441.anInt5786 >> 12);
							local480 = (float) (local441.anInt5791 >> 12);
							local485 = local441.anInt5793 >> 12;
							local94.a((float) -local485 * local42 + local179);
							local94.a(local46 * (float) -local485 + local474);
							local94.a(local480 + (float) -local485 * local50);
							if (arg1.anInt11268 == 0) {
								local94.b(local156, local161, local457, local462);
							} else {
								local94.a(local156, local161, local457, local462);
							}
							local94.a(0.0F);
							local94.a(0.0F);
							local94.a(local179 + (float) local485 * local55);
							local94.a(local474 + local60 * (float) local485);
							local94.a(local480 + (float) local485 * local65);
							if (arg1.anInt11268 == 0) {
								local94.b(local156, local161, local457, local462);
							} else {
								local94.a(local156, local161, local457, local462);
							}
							local94.a(1.0F);
							local94.a(0.0F);
							local94.a(local179 + (float) local485 * local42);
							local94.a(local474 + (float) local485 * local46);
							local94.a(local50 * (float) local485 + local480);
							if (arg1.anInt11268 == 0) {
								local94.b(local156, local161, local457, local462);
							} else {
								local94.a(local156, local161, local457, local462);
							}
							local94.a(1.0F);
							local94.a(1.0F);
							local94.a(local179 + local69 * (float) local485);
							local94.a(local474 + (float) local485 * local74);
							local94.a(local79 * (float) local485 + local480);
							if (arg1.anInt11268 == 0) {
								local94.b(local156, local161, local457, local462);
							} else {
								local94.a(local156, local161, local457, local462);
							}
							local94.a(0.0F);
							local94.a(1.0F);
							local7++;
						}
					}
				}
			}
		}
		local94.a();
		if (this.anInterface24_12.method9230()) {
			arg1.method9800(0, this.anInterface24_12);
			arg1.method9800(1, this.anInterface24_13);
			arg1.method9766(this.aClass277_15);
			arg1.method9778(0, Static601.aClass317_8, local7 * 2, 0, local7 * 4, this.anInterface15_4);
		}
	}

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "(B)V")
	public void method7141() {
		this.anInterface24_12.method9218();
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Lclient!lb;IZ)V")
	private void method7142(@OriginalArg(0) Class145_Sub1 arg0, @OriginalArg(1) int arg1) {
		Static532.aFloat140 = arg0.aFloat194;
		arg0.method9777((float) arg1);
		arg0.method9792();
		arg0.method9828(false);
		arg0.method9822(false);
		arg0.method9730();
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Lclient!lb;I)V")
	private void method7145(@OriginalArg(0) Class145_Sub1 arg0) {
		arg0.method9822(true);
		arg0.method9828(true);
		if (arg0.aFloat194 != Static532.aFloat140) {
			arg0.xa(Static532.aFloat140);
		}
	}
}
