import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class1_Sub1_Sub35 extends Class1_Sub1 {

	@OriginalMember(owner = "client!uu", name = "Q", descriptor = "I")
	private int anInt8986;

	@OriginalMember(owner = "client!uu", name = "B", descriptor = "I")
	private int anInt8972 = 819;

	@OriginalMember(owner = "client!uu", name = "D", descriptor = "I")
	private int anInt8974 = 0;

	@OriginalMember(owner = "client!uu", name = "F", descriptor = "I")
	private int anInt8976 = 1024;

	@OriginalMember(owner = "client!uu", name = "C", descriptor = "I")
	private int anInt8973 = 409;

	@OriginalMember(owner = "client!uu", name = "E", descriptor = "I")
	private int anInt8975 = 0;

	@OriginalMember(owner = "client!uu", name = "K", descriptor = "I")
	private int anInt8980 = 1024;

	@OriginalMember(owner = "client!uu", name = "M", descriptor = "I")
	private int anInt8982 = 2048;

	@OriginalMember(owner = "client!uu", name = "P", descriptor = "I")
	private int anInt8985 = 1024;

	@OriginalMember(owner = "client!uu", name = "J", descriptor = "I")
	private int anInt8979 = 1024;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt8974 = arg1.method4393();
		} else if (arg0 == 1) {
			this.anInt8980 = arg1.method4426();
		} else if (arg0 == 2) {
			this.anInt8982 = arg1.method4426();
		} else if (arg0 == 3) {
			this.anInt8973 = arg1.method4426();
		} else if (arg0 == 4) {
			this.anInt8972 = arg1.method4426();
		} else if (arg0 == 5) {
			this.anInt8985 = arg1.method4426();
		} else if (arg0 == 6) {
			this.anInt8975 = arg1.method4393();
		} else if (arg0 == 7) {
			this.anInt8979 = arg1.method4426();
		} else if (arg0 == 8) {
			this.anInt8976 = arg1.method4426();
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IILjava/util/Random;I[[IBI)V")
	private void method7404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Random arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(6) int arg5) {
		@Pc(22) int local22 = this.anInt8976 <= 0 ? 4096 : 4096 - Static521.method7113(this.anInt8976, arg2);
		@Pc(30) int local30 = this.anInt8986 * this.anInt8979 >> 12;
		@Pc(42) int local42 = this.anInt8986 - (local30 <= 0 ? 0 : Static521.method7113(local30, arg2));
		if (Static87.anInt1964 <= arg5) {
			arg5 -= Static87.anInt1964;
		}
		@Pc(60) int local60;
		@Pc(64) int local64;
		if (local42 > 0) {
			if (arg0 <= 0 || arg3 <= 0) {
				return;
			}
			local60 = arg3 / 2;
			local64 = arg0 / 2;
			@Pc(75) int local75 = local60 < local42 ? local60 : local42;
			@Pc(82) int local82 = local42 <= local64 ? local42 : local64;
			@Pc(86) int local86 = local75 + arg5;
			@Pc(93) int local93 = arg3 - local75 * 2;
			for (@Pc(95) int local95 = 0; local95 < arg0; local95++) {
				@Pc(103) int[] local103 = arg4[local95 + arg1];
				@Pc(116) int local116;
				@Pc(124) int local124;
				@Pc(132) int local132;
				if (local95 < local82) {
					local116 = local22 * local95 / local82;
					if (this.anInt8975 == 0) {
						for (local124 = 0; local124 < local75; local124++) {
							local132 = local124 * local22 / local75;
							local103[local124 + arg5 & Static451.anInt8721] = local103[Static451.anInt8721 & arg3 + arg5 - local124 - 1] = local132 * local116 >> 12;
						}
					} else {
						for (local124 = 0; local124 < local75; local124++) {
							local132 = local22 * local124 / local75;
							local103[Static451.anInt8721 & local124 + arg5] = local103[arg5 + arg3 - local124 - 1 & Static451.anInt8721] = local132 < local116 ? local132 : local116;
						}
					}
					if (local86 + local93 > Static87.anInt1964) {
						local124 = Static87.anInt1964 - local86;
						Static600.method3767(local103, local86, local124, local116);
						Static600.method3767(local103, 0, local93 - local124, local116);
					} else {
						Static600.method3767(local103, local86, local93, local116);
					}
				} else {
					local116 = arg0 - local95 - 1;
					if (local82 > local116) {
						local124 = local116 * local22 / local82;
						@Pc(286) int local286;
						if (this.anInt8975 == 0) {
							for (local132 = 0; local132 < local75; local132++) {
								local286 = local132 * local22 / local75;
								local103[arg5 + local132 & Static451.anInt8721] = local103[Static451.anInt8721 & arg5 + arg3 - local132 - 1] = local286 * local124 >> 12;
							}
						} else {
							for (local132 = 0; local132 < local75; local132++) {
								local286 = local132 * local22 / local75;
								local103[local132 + arg5 & Static451.anInt8721] = local103[Static451.anInt8721 & arg3 + arg5 - local132 - 1] = local286 < local124 ? local286 : local124;
							}
						}
						if (local93 + local86 > Static87.anInt1964) {
							local132 = Static87.anInt1964 - local86;
							Static600.method3767(local103, local86, local132, local124);
							Static600.method3767(local103, 0, local93 - local132, local124);
						} else {
							Static600.method3767(local103, local86, local93, local124);
						}
					} else {
						for (local124 = 0; local124 < local75; local124++) {
							local103[arg5 + local124 & Static451.anInt8721] = local103[arg5 + arg3 - local124 - 1 & Static451.anInt8721] = local124 * local22 / local75;
						}
						if (local93 + local86 > Static87.anInt1964) {
							local132 = Static87.anInt1964 - local86;
							Static600.method3767(local103, local86, local132, local22);
							Static600.method3767(local103, 0, local93 - local132, local22);
						} else {
							Static600.method3767(local103, local86, local93, local22);
						}
					}
				}
			}
		} else if (arg3 + arg5 <= Static87.anInt1964) {
			for (local60 = 0; local60 < arg0; local60++) {
				Static600.method3767(arg4[arg1 + local60], arg5, arg3, local22);
			}
		} else {
			local60 = Static87.anInt1964 - arg5;
			for (local64 = 0; local64 < arg0; local64++) {
				@Pc(521) int[] local521 = arg4[local64 + arg1];
				Static600.method3767(local521, arg5, local60, local22);
				Static600.method3767(local521, 0, arg3 - local60, local22);
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7888(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass26_41.method788(arg0);
		if (!super.aClass26_41.aBoolean77) {
			return local11;
		}
		@Pc(26) int[][] local26 = super.aClass26_41.method789();
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = true;
		@Pc(40) boolean local40 = true;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(51) int local51 = this.anInt8980 * Static87.anInt1964 >> 12;
		@Pc(58) int local58 = this.anInt8982 * Static87.anInt1964 >> 12;
		@Pc(65) int local65 = Static4.anInt81 * this.anInt8973 >> 12;
		@Pc(72) int local72 = Static4.anInt81 * this.anInt8972 >> 12;
		if (local72 <= 1) {
			return local26[arg0];
		}
		this.anInt8986 = Static87.anInt1964 / 8 * this.anInt8985 >> 12;
		@Pc(95) int local95 = Static87.anInt1964 / local51 + 1;
		@Pc(99) int[][] local99 = new int[local95][3];
		@Pc(103) int[][] local103 = new int[local95][3];
		@Pc(110) Random local110 = new Random((long) this.anInt8974);
		while (true) {
			while (true) {
				@Pc(123) int local123 = local51 + Static521.method7113(local58 - local51, local110);
				@Pc(134) int local134 = local65 + Static521.method7113(local72 - local65, local110);
				@Pc(138) int local138 = local123 + local34;
				if (Static87.anInt1964 < local138) {
					local138 = Static87.anInt1964;
					local123 = Static87.anInt1964 - local34;
				}
				@Pc(155) int local155;
				@Pc(165) int local165;
				if (local40) {
					local155 = 0;
				} else {
					@Pc(159) int local159 = local36;
					@Pc(163) int[] local163 = local103[local36];
					local165 = 0;
					@Pc(169) int local169 = local28 + local138;
					if (local169 < 0) {
						local169 += Static87.anInt1964;
					}
					if (local169 > Static87.anInt1964) {
						local169 -= Static87.anInt1964;
					}
					while (true) {
						@Pc(189) int[] local189 = local103[local159];
						if (local169 >= local189[0] && local169 <= local189[1]) {
							local155 = local163[2];
							if (local36 != local159) {
								@Pc(223) int local223 = local28 + local34;
								if (local223 < 0) {
									local223 += Static87.anInt1964;
								}
								if (Static87.anInt1964 < local223) {
									local223 -= Static87.anInt1964;
								}
								for (@Pc(242) int local242 = 1; local242 <= local165; local242++) {
									@Pc(252) int[] local252 = local103[(local36 + local242) % local42];
									local155 = Math.max(local155, local252[2]);
								}
								for (@Pc(264) int local264 = 0; local264 <= local165; local264++) {
									@Pc(274) int[] local274 = local103[(local36 + local264) % local42];
									@Pc(278) int local278 = local274[2];
									if (local278 != local155) {
										@Pc(285) int local285 = local274[0];
										@Pc(289) int local289 = local274[1];
										@Pc(300) int local300;
										@Pc(304) int local304;
										if (local169 > local223) {
											local300 = Math.max(local223, local285);
											local304 = Math.min(local169, local289);
										} else if (local285 == 0) {
											local300 = 0;
											local304 = Math.min(local169, local289);
										} else {
											local300 = Math.max(local223, local285);
											local304 = Static87.anInt1964;
										}
										this.method7404(local155 - local278, local278, local110, local304 - local300, local26, local300 + local32);
									}
								}
							}
							local36 = local159;
							break;
						}
						local159++;
						if (local159 >= local42) {
							local159 = 0;
						}
						local165++;
					}
				}
				if (Static4.anInt81 >= local134 + local155) {
					local38 = false;
				} else {
					local134 = Static4.anInt81 - local155;
				}
				@Pc(386) int[] local386;
				if (Static87.anInt1964 == local138) {
					this.method7404(local134, local155, local110, local123, local26, local34 + local30);
					if (local38) {
						return local11;
					}
					local38 = true;
					local386 = local99[local44++];
					local386[1] = local138;
					local386[0] = local34;
					local386[2] = local155 + local134;
					@Pc(402) int[][] local402 = local103;
					local103 = local99;
					local99 = local402;
					local42 = local44;
					local44 = 0;
					local32 = local30;
					local30 = Static521.method7113(Static87.anInt1964, local110);
					local34 = 0;
					local28 = local30 - local32;
					local165 = local28;
					if (local28 < 0) {
						local165 = local28 + Static87.anInt1964;
					}
					local36 = 0;
					if (Static87.anInt1964 < local165) {
						local165 -= Static87.anInt1964;
					}
					local40 = false;
					while (true) {
						@Pc(450) int[] local450 = local103[local36];
						if (local165 >= local450[0] && local165 <= local450[1]) {
							break;
						}
						local36++;
						if (local36 >= local42) {
							local36 = 0;
						}
					}
				} else {
					local386 = local99[local44++];
					local386[2] = local134 + local155;
					local386[1] = local138;
					local386[0] = local34;
					this.method7404(local134, local155, local110, local123, local26, local34 + local30);
					local34 = local138;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)V")
	@Override
	public void method7885() {
	}
}
