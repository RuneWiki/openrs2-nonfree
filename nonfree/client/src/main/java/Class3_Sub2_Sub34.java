import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tja")
public final class Class3_Sub2_Sub34 extends Class3_Sub2 {

	@OriginalMember(owner = "client!tja", name = "M", descriptor = "I")
	private int anInt9183;

	@OriginalMember(owner = "client!tja", name = "z", descriptor = "I")
	private int anInt9172 = 0;

	@OriginalMember(owner = "client!tja", name = "D", descriptor = "I")
	private int anInt9176 = 1024;

	@OriginalMember(owner = "client!tja", name = "C", descriptor = "I")
	private int anInt9175 = 1024;

	@OriginalMember(owner = "client!tja", name = "y", descriptor = "I")
	private int anInt9171 = 409;

	@OriginalMember(owner = "client!tja", name = "F", descriptor = "I")
	private int anInt9178 = 2048;

	@OriginalMember(owner = "client!tja", name = "J", descriptor = "I")
	private int anInt9181 = 1024;

	@OriginalMember(owner = "client!tja", name = "G", descriptor = "I")
	private int anInt9179 = 819;

	@OriginalMember(owner = "client!tja", name = "E", descriptor = "I")
	private int anInt9177 = 0;

	@OriginalMember(owner = "client!tja", name = "B", descriptor = "I")
	private int anInt9174 = 1024;

	@OriginalMember(owner = "client!tja", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9172 = arg0.method4888();
		} else if (arg1 == 1) {
			this.anInt9181 = arg0.method4858();
		} else if (arg1 == 2) {
			this.anInt9178 = arg0.method4858();
		} else if (arg1 == 3) {
			this.anInt9171 = arg0.method4858();
		} else if (arg1 == 4) {
			this.anInt9179 = arg0.method4858();
		} else if (arg1 == 5) {
			this.anInt9174 = arg0.method4858();
		} else if (arg1 == 6) {
			this.anInt9177 = arg0.method4888();
		} else if (arg1 == 7) {
			this.anInt9175 = arg0.method4858();
		} else if (arg1 == 8) {
			this.anInt9176 = arg0.method4858();
		}
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(I)V")
	@Override
	public void method8712() {
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(BIII[[IILjava/util/Random;)V")
	private void method7790(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Random arg5) {
		@Pc(19) int local19 = this.anInt9176 > 0 ? 4096 - Static610.method8052(this.anInt9176, arg5) : 4096;
		@Pc(27) int local27 = this.anInt9175 * this.anInt9183 >> 12;
		@Pc(42) int local42 = this.anInt9183 - (local27 > 0 ? Static610.method8052(local27, arg5) : 0);
		if (arg1 >= Static30.anInt908) {
			arg1 -= Static30.anInt908;
		}
		@Pc(58) int local58;
		@Pc(82) int local82;
		if (local42 > 0) {
			if (arg2 <= 0 || arg0 <= 0) {
				return;
			}
			local58 = arg0 / 2;
			local82 = arg2 / 2;
			@Pc(139) int local139 = local42 <= local58 ? local42 : local58;
			@Pc(150) int local150 = local42 > local82 ? local82 : local42;
			@Pc(155) int local155 = arg1 + local139;
			@Pc(162) int local162 = arg0 - local139 * 2;
			for (@Pc(164) int local164 = 0; local164 < arg2; local164++) {
				@Pc(173) int[] local173 = arg3[local164 + arg4];
				@Pc(186) int local186;
				@Pc(191) int local191;
				@Pc(199) int local199;
				if (local164 < local150) {
					local186 = local164 * local19 / local150;
					if (this.anInt9177 == 0) {
						for (local191 = 0; local191 < local139; local191++) {
							local199 = local19 * local191 / local139;
							local173[Static241.anInt4556 & arg1 + local191] = local173[arg1 + arg0 - local191 - 1 & Static241.anInt4556] = local186 * local199 >> 12;
						}
					} else {
						for (local191 = 0; local191 < local139; local191++) {
							local199 = local19 * local191 / local139;
							local173[Static241.anInt4556 & local191 + arg1] = local173[Static241.anInt4556 & arg1 + arg0 - local191 - 1] = local199 < local186 ? local199 : local186;
						}
					}
					if (Static30.anInt908 >= local155 + local162) {
						Static689.method8056(local173, local155, local162, local186);
					} else {
						local191 = Static30.anInt908 - local155;
						Static689.method8056(local173, local155, local191, local186);
						Static689.method8056(local173, 0, local162 - local191, local186);
					}
				} else {
					local186 = arg2 - local164 - 1;
					if (local150 > local186) {
						local191 = local19 * local186 / local150;
						@Pc(344) int local344;
						if (this.anInt9177 == 0) {
							for (local199 = 0; local199 < local139; local199++) {
								local344 = local199 * local19 / local139;
								local173[Static241.anInt4556 & local199 + arg1] = local173[arg1 + arg0 - local199 - 1 & Static241.anInt4556] = local344 * local191 >> 12;
							}
						} else {
							for (local199 = 0; local199 < local139; local199++) {
								local344 = local199 * local19 / local139;
								local173[local199 + arg1 & Static241.anInt4556] = local173[arg0 + arg1 - local199 - 1 & Static241.anInt4556] = local191 <= local344 ? local191 : local344;
							}
						}
						if (local155 + local162 > Static30.anInt908) {
							local199 = Static30.anInt908 - local155;
							Static689.method8056(local173, local155, local199, local191);
							Static689.method8056(local173, 0, local162 - local199, local191);
						} else {
							Static689.method8056(local173, local155, local162, local191);
						}
					} else {
						for (local191 = 0; local191 < local139; local191++) {
							local173[local191 + arg1 & Static241.anInt4556] = local173[Static241.anInt4556 & arg1 + arg0 - local191 - 1] = local191 * local19 / local139;
						}
						if (local162 + local155 > Static30.anInt908) {
							local199 = Static30.anInt908 - local155;
							Static689.method8056(local173, local155, local199, local19);
							Static689.method8056(local173, 0, local162 - local199, local19);
						} else {
							Static689.method8056(local173, local155, local162, local19);
						}
					}
				}
			}
		} else if (Static30.anInt908 >= arg0 + arg1) {
			for (local58 = 0; local58 < arg2; local58++) {
				Static689.method8056(arg3[arg4 + local58], arg1, arg0, local19);
			}
		} else {
			local58 = Static30.anInt908 - arg1;
			for (local82 = 0; local82 < arg2; local82++) {
				@Pc(90) int[] local90 = arg3[local82 + arg4];
				Static689.method8056(local90, arg1, local58, local19);
				Static689.method8056(local90, 0, arg0 - local58, local19);
			}
		}
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8710(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass340_41.method7837(arg0);
		if (!super.aClass340_41.aBoolean687) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass340_41.method7838();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = Static30.anInt908 * this.anInt9181 >> 12;
		@Pc(52) int local52 = Static30.anInt908 * this.anInt9178 >> 12;
		@Pc(59) int local59 = Static157.anInt2964 * this.anInt9171 >> 12;
		@Pc(66) int local66 = this.anInt9179 * Static157.anInt2964 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt9183 = this.anInt9174 * (Static30.anInt908 / 8) >> 12;
		@Pc(90) int local90 = Static30.anInt908 / local45 + 1;
		@Pc(94) int[][] local94 = new int[local90][3];
		@Pc(98) int[][] local98 = new int[local90][3];
		@Pc(105) Random local105 = new Random((long) this.anInt9172);
		while (true) {
			while (true) {
				@Pc(116) int local116 = local45 + Static610.method8052(local52 - local45, local105);
				@Pc(127) int local127 = local59 + Static610.method8052(local66 - local59, local105);
				@Pc(132) int local132 = local28 + local116;
				if (Static30.anInt908 < local132) {
					local132 = Static30.anInt908;
					local116 = Static30.anInt908 - local28;
				}
				@Pc(146) int local146;
				@Pc(156) int local156;
				if (local34) {
					local146 = 0;
				} else {
					@Pc(150) int local150 = local30;
					@Pc(154) int[] local154 = local98[local30];
					local156 = 0;
					@Pc(161) int local161 = local132 + local22;
					if (local161 < 0) {
						local161 += Static30.anInt908;
					}
					if (Static30.anInt908 < local161) {
						local161 -= Static30.anInt908;
					}
					local146 = local154[2];
					while (true) {
						@Pc(185) int[] local185 = local98[local150];
						if (local185[0] <= local161 && local161 <= local185[1]) {
							if (local150 != local30) {
								@Pc(219) int local219 = local22 + local28;
								if (local219 < 0) {
									local219 += Static30.anInt908;
								}
								if (Static30.anInt908 < local219) {
									local219 -= Static30.anInt908;
								}
								for (@Pc(234) int local234 = 1; local234 <= local156; local234++) {
									@Pc(244) int[] local244 = local98[(local234 + local30) % local36];
									local146 = Math.max(local146, local244[2]);
								}
								for (@Pc(256) int local256 = 0; local256 <= local156; local256++) {
									@Pc(266) int[] local266 = local98[(local256 + local30) % local36];
									@Pc(270) int local270 = local266[2];
									if (local146 != local270) {
										@Pc(281) int local281 = local266[0];
										@Pc(285) int local285 = local266[1];
										@Pc(294) int local294;
										@Pc(296) int local296;
										if (local219 < local161) {
											local294 = Math.max(local219, local281);
											local296 = Math.min(local161, local285);
										} else if (local281 == 0) {
											local294 = 0;
											local296 = Math.min(local161, local285);
										} else {
											local294 = Math.max(local219, local281);
											local296 = Static30.anInt908;
										}
										this.method7790(local296 - local294, local26 + local294, local146 - local270, local20, local270, local105);
									}
								}
							}
							local30 = local150;
							break;
						}
						local150++;
						if (local36 <= local150) {
							local150 = 0;
						}
						local156++;
					}
				}
				if (Static157.anInt2964 < local146 + local127) {
					local127 = Static157.anInt2964 - local146;
				} else {
					local32 = false;
				}
				@Pc(370) int[] local370;
				if (Static30.anInt908 == local132) {
					this.method7790(local116, local24 + local28, local127, local20, local146, local105);
					if (local32) {
						return local11;
					}
					local32 = true;
					local370 = local94[local38++];
					local370[2] = local146 + local127;
					local370[0] = local28;
					local370[1] = local132;
					@Pc(435) int[][] local435 = local98;
					local98 = local94;
					local94 = local435;
					local36 = local38;
					local26 = local24;
					local38 = 0;
					local24 = Static610.method8052(Static30.anInt908, local105);
					local28 = 0;
					local22 = local24 - local26;
					local156 = local22;
					if (local22 < 0) {
						local156 = local22 + Static30.anInt908;
					}
					local30 = 0;
					if (Static30.anInt908 < local156) {
						local156 -= Static30.anInt908;
					}
					while (true) {
						@Pc(481) int[] local481 = local98[local30];
						if (local481[0] <= local156 && local156 <= local481[1]) {
							local34 = false;
							break;
						}
						local30++;
						if (local30 >= local36) {
							local30 = 0;
						}
					}
				} else {
					local370 = local94[local38++];
					local370[2] = local146 + local127;
					local370[1] = local132;
					local370[0] = local28;
					this.method7790(local116, local24 + local28, local127, local20, local146, local105);
					local28 = local132;
				}
			}
		}
	}
}
