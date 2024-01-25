import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class5_Sub2_Sub31 extends Class5_Sub2 {

	@OriginalMember(owner = "client!sp", name = "G", descriptor = "I")
	private int anInt8960;

	@OriginalMember(owner = "client!sp", name = "J", descriptor = "I")
	private int anInt8963 = 1024;

	@OriginalMember(owner = "client!sp", name = "N", descriptor = "I")
	private int anInt8967 = 1024;

	@OriginalMember(owner = "client!sp", name = "H", descriptor = "I")
	private int anInt8961 = 0;

	@OriginalMember(owner = "client!sp", name = "S", descriptor = "I")
	private int anInt8972 = 0;

	@OriginalMember(owner = "client!sp", name = "I", descriptor = "I")
	private int anInt8962 = 819;

	@OriginalMember(owner = "client!sp", name = "R", descriptor = "I")
	private int anInt8971 = 1024;

	@OriginalMember(owner = "client!sp", name = "M", descriptor = "I")
	private int anInt8966 = 1024;

	@OriginalMember(owner = "client!sp", name = "K", descriptor = "I")
	private int anInt8964 = 2048;

	@OriginalMember(owner = "client!sp", name = "Q", descriptor = "I")
	private int anInt8970 = 409;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIII[[ILjava/util/Random;)V")
	private void method7713(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) Random arg5) {
		@Pc(19) int local19 = this.anInt8971 <= 0 ? 4096 : 4096 - Static130.method1947(this.anInt8971, arg5);
		@Pc(27) int local27 = this.anInt8960 * this.anInt8966 >> 12;
		@Pc(42) int local42 = this.anInt8960 - (local27 <= 0 ? 0 : Static130.method1947(local27, arg5));
		if (arg0 >= Static597.anInt10025) {
			arg0 -= Static597.anInt10025;
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		if (local42 > 0) {
			if (arg1 > 0 && arg2 > 0) {
				local81 = arg2 / 2;
				local85 = arg1 / 2;
				@Pc(92) int local92 = local42 > local81 ? local81 : local42;
				@Pc(99) int local99 = local85 >= local42 ? local42 : local85;
				@Pc(103) int local103 = local92 + arg0;
				@Pc(110) int local110 = arg2 - local92 * 2;
				for (@Pc(112) int local112 = 0; local112 < arg1; local112++) {
					@Pc(120) int[] local120 = arg4[arg3 + local112];
					@Pc(133) int local133;
					@Pc(138) int local138;
					@Pc(146) int local146;
					if (local112 < local99) {
						local133 = local112 * local19 / local99;
						if (this.anInt8961 == 0) {
							for (local138 = 0; local138 < local92; local138++) {
								local146 = local19 * local138 / local92;
								local120[Static28.anInt365 & local138 + arg0] = local120[Static28.anInt365 & arg2 + arg0 - local138 - 1] = local146 * local133 >> 12;
							}
						} else {
							for (local138 = 0; local138 < local92; local138++) {
								local146 = local19 * local138 / local92;
								local120[Static28.anInt365 & arg0 + local138] = local120[arg0 + arg2 - local138 - 1 & Static28.anInt365] = local146 < local133 ? local146 : local133;
							}
						}
						if (local110 + local103 > Static597.anInt10025) {
							local138 = Static597.anInt10025 - local103;
							Static652.method4544(local120, local103, local138, local133);
							Static652.method4544(local120, 0, local110 - local138, local133);
						} else {
							Static652.method4544(local120, local103, local110, local133);
						}
					} else {
						local133 = arg1 - local112 - 1;
						if (local133 < local99) {
							local138 = local19 * local133 / local99;
							@Pc(288) int local288;
							if (this.anInt8961 == 0) {
								for (local146 = 0; local146 < local92; local146++) {
									local288 = local19 * local146 / local92;
									local120[Static28.anInt365 & local146 + arg0] = local120[arg0 + arg2 - local146 - 1 & Static28.anInt365] = local138 * local288 >> 12;
								}
							} else {
								for (local146 = 0; local146 < local92; local146++) {
									local288 = local19 * local146 / local92;
									local120[arg0 + local146 & Static28.anInt365] = local120[Static28.anInt365 & arg2 + arg0 - local146 - 1] = local288 < local138 ? local288 : local138;
								}
							}
							if (local110 + local103 <= Static597.anInt10025) {
								Static652.method4544(local120, local103, local110, local138);
							} else {
								local146 = Static597.anInt10025 - local103;
								Static652.method4544(local120, local103, local146, local138);
								Static652.method4544(local120, 0, local110 - local146, local138);
							}
						} else {
							for (local138 = 0; local138 < local92; local138++) {
								local120[local138 + arg0 & Static28.anInt365] = local120[arg2 + arg0 - local138 - 1 & Static28.anInt365] = local19 * local138 / local92;
							}
							if (Static597.anInt10025 >= local103 + local110) {
								Static652.method4544(local120, local103, local110, local19);
							} else {
								local146 = Static597.anInt10025 - local103;
								Static652.method4544(local120, local103, local146, local19);
								Static652.method4544(local120, 0, local110 - local146, local19);
							}
						}
					}
				}
			}
		} else if (Static597.anInt10025 >= arg2 + arg0) {
			for (local81 = 0; local81 < arg1; local81++) {
				Static652.method4544(arg4[arg3 + local81], arg0, arg2, local19);
			}
		} else {
			local81 = Static597.anInt10025 - arg0;
			for (local85 = 0; local85 < arg1; local85++) {
				@Pc(508) int[] local508 = arg4[local85 + arg3];
				Static652.method4544(local508, arg0, local81, local19);
				Static652.method4544(local508, 0, arg2 - local81, local19);
			}
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8972 = arg0.method5966();
		} else if (arg1 == 1) {
			this.anInt8967 = arg0.method5968();
		} else if (arg1 == 2) {
			this.anInt8964 = arg0.method5968();
		} else if (arg1 == 3) {
			this.anInt8970 = arg0.method5968();
		} else if (arg1 == 4) {
			this.anInt8962 = arg0.method5968();
		} else if (arg1 == 5) {
			this.anInt8963 = arg0.method5968();
		} else if (arg1 == 6) {
			this.anInt8961 = arg0.method5966();
		} else if (arg1 == 7) {
			this.anInt8966 = arg0.method5968();
		} else if (arg1 == 8) {
			this.anInt8971 = arg0.method5968();
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9034(@OriginalArg(0) int arg0) {
		@Pc(21) int[] local21 = super.aClass379_41.method9012(arg0);
		if (!super.aClass379_41.aBoolean761) {
			return local21;
		}
		@Pc(30) int[][] local30 = super.aClass379_41.method9009();
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		@Pc(42) boolean local42 = true;
		@Pc(44) boolean local44 = true;
		@Pc(46) int local46 = 0;
		@Pc(48) int local48 = 0;
		@Pc(55) int local55 = this.anInt8967 * Static597.anInt10025 >> 12;
		@Pc(62) int local62 = this.anInt8964 * Static597.anInt10025 >> 12;
		@Pc(69) int local69 = Static591.anInt9907 * this.anInt8970 >> 12;
		@Pc(76) int local76 = Static591.anInt9907 * this.anInt8962 >> 12;
		if (local76 <= 1) {
			return local30[arg0];
		}
		this.anInt8960 = this.anInt8963 * (Static597.anInt10025 / 8) >> 12;
		@Pc(102) int local102 = Static597.anInt10025 / local55 + 1;
		@Pc(106) int[][] local106 = new int[local102][3];
		@Pc(110) int[][] local110 = new int[local102][3];
		@Pc(117) Random local117 = new Random((long) this.anInt8972);
		while (true) {
			while (true) {
				@Pc(126) int local126 = local55 + Static130.method1947(local62 - local55, local117);
				@Pc(135) int local135 = Static130.method1947(local76 - local69, local117) + local69;
				@Pc(140) int local140 = local38 + local126;
				if (local140 > Static597.anInt10025) {
					local140 = Static597.anInt10025;
					local126 = Static597.anInt10025 - local38;
				}
				@Pc(153) int local153;
				@Pc(163) int local163;
				if (local44) {
					local153 = 0;
				} else {
					@Pc(157) int local157 = local40;
					@Pc(161) int[] local161 = local110[local40];
					local163 = 0;
					@Pc(167) int local167 = local32 + local140;
					if (local167 < 0) {
						local167 += Static597.anInt10025;
					}
					if (local167 > Static597.anInt10025) {
						local167 -= Static597.anInt10025;
					}
					while (true) {
						@Pc(191) int[] local191 = local110[local157];
						if (local167 >= local191[0] && local191[1] >= local167) {
							local153 = local161[2];
							if (local40 != local157) {
								@Pc(234) int local234 = local38 + local32;
								if (local234 < 0) {
									local234 += Static597.anInt10025;
								}
								if (Static597.anInt10025 < local234) {
									local234 -= Static597.anInt10025;
								}
								for (@Pc(249) int local249 = 1; local249 <= local163; local249++) {
									@Pc(260) int[] local260 = local110[(local40 + local249) % local46];
									local153 = Math.max(local153, local260[2]);
								}
								for (@Pc(276) int local276 = 0; local276 <= local163; local276++) {
									@Pc(287) int[] local287 = local110[(local40 + local276) % local46];
									@Pc(291) int local291 = local287[2];
									if (local153 != local291) {
										@Pc(298) int local298 = local287[0];
										@Pc(302) int local302 = local287[1];
										@Pc(313) int local313;
										@Pc(317) int local317;
										if (local234 < local167) {
											local313 = Math.max(local234, local298);
											local317 = Math.min(local167, local302);
										} else if (local298 == 0) {
											local313 = 0;
											local317 = Math.min(local167, local302);
										} else {
											local313 = Math.max(local234, local298);
											local317 = Static597.anInt10025;
										}
										this.method7713(local36 + local313, -local291 + local153, local317 - local313, local291, local30, local117);
									}
								}
							}
							local40 = local157;
							break;
						}
						@Pc(208) int local208 = ~local46;
						local157++;
						if (local208 >= ~local157) {
							local157 = 0;
						}
						local163++;
					}
				}
				if (local153 + local135 > Static591.anInt9907) {
					local135 = Static591.anInt9907 - local153;
				} else {
					local42 = false;
				}
				@Pc(403) int[] local403;
				if (Static597.anInt10025 == local140) {
					this.method7713(local34 + local38, local135, local126, local153, local30, local117);
					if (local42) {
						return local21;
					}
					local42 = true;
					local403 = local106[local48++];
					local403[2] = local153 + local135;
					local403[1] = local140;
					local403[0] = local38;
					@Pc(419) int[][] local419 = local110;
					local110 = local106;
					local46 = local48;
					local106 = local419;
					local48 = 0;
					local36 = local34;
					local34 = Static130.method1947(Static597.anInt10025, local117);
					local32 = local34 - local36;
					local38 = 0;
					local163 = local32;
					if (local32 < 0) {
						local163 = local32 + Static597.anInt10025;
					}
					if (local163 > Static597.anInt10025) {
						local163 -= Static597.anInt10025;
					}
					local40 = 0;
					local44 = false;
					while (true) {
						@Pc(463) int[] local463 = local110[local40];
						if (local463[0] <= local163 && local463[1] >= local163) {
							break;
						}
						local40++;
						if (local40 >= local46) {
							local40 = 0;
						}
					}
				} else {
					local403 = local106[local48++];
					local403[0] = local38;
					local403[2] = local153 + local135;
					local403[1] = local140;
					this.method7713(local38 + local34, local135, local126, local153, local30, local117);
					local38 = local140;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "(I)V")
	@Override
	public void method9044() {
	}
}
