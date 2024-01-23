import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class1_Sub4_Sub23 extends Class1_Sub4 {

	@OriginalMember(owner = "client!lc", name = "I", descriptor = "I")
	private int anInt3030 = 6;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub23() {
		super(2, false);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3030 = arg0.method1378();
		} else if (arg1 == 1) {
			this.aBoolean383 = arg0.method1378() == 1;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4746(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = this.aClass7_41.method116(arg0);
		if (this.aClass7_41.aBoolean4) {
			@Pc(25) int[] local25 = this.method4750(arg0, 0);
			@Pc(31) int[] local31 = this.method4750(arg0, 1);
			@Pc(34) int local34 = this.anInt3030;
			if (local34 == 1) {
				for (local34 = 0; local34 < Static182.anInt3492; local34++) {
					local15[local34] = local31[local34] + local25[local34];
				}
			} else if (local34 == 2) {
				for (local34 = 0; local34 < Static182.anInt3492; local34++) {
					local15[local34] = local25[local34] - local31[local34];
				}
			} else if (local34 == 3) {
				for (local34 = 0; local34 < Static182.anInt3492; local34++) {
					local15[local34] = local31[local34] * local25[local34] >> 12;
				}
			} else {
				@Pc(163) int local163;
				if (local34 == 4) {
					for (local34 = 0; local34 < Static182.anInt3492; local34++) {
						local163 = local31[local34];
						local15[local34] = local163 == 0 ? 4096 : (local25[local34] << 12) / local163;
					}
				} else if (local34 == 5) {
					for (local34 = 0; local34 < Static182.anInt3492; local34++) {
						local15[local34] = 4096 - ((4096 - local25[local34]) * (4096 - local31[local34]) >> 12);
					}
				} else if (local34 == 6) {
					for (local34 = 0; local34 < Static182.anInt3492; local34++) {
						local163 = local31[local34];
						local15[local34] = local163 < 2048 ? local163 * local25[local34] >> 11 : 4096 - ((4096 - local163) * (-local25[local34] + 4096) >> 11);
					}
				} else {
					@Pc(271) int local271;
					if (local34 == 7) {
						for (local34 = 0; local34 < Static182.anInt3492; local34++) {
							local271 = local25[local34];
							local15[local34] = local271 == 4096 ? 4096 : (local31[local34] << 12) / (4096 - local271);
						}
					} else if (local34 == 8) {
						for (local34 = 0; local34 < Static182.anInt3492; local34++) {
							local271 = local25[local34];
							local15[local34] = local271 == 0 ? 0 : 4096 - (4096 - local31[local34] << 12) / local271;
						}
					} else if (local34 == 9) {
						for (local34 = 0; local34 < Static182.anInt3492; local34++) {
							local271 = local25[local34];
							local163 = local31[local34];
							local15[local34] = local271 < local163 ? local271 : local163;
						}
					} else if (local34 == 10) {
						for (local34 = 0; local34 < Static182.anInt3492; local34++) {
							local163 = local31[local34];
							local271 = local25[local34];
							local15[local34] = local163 < local271 ? local271 : local163;
						}
					} else if (local34 == 11) {
						for (local34 = 0; local34 < Static182.anInt3492; local34++) {
							local163 = local31[local34];
							local271 = local25[local34];
							local15[local34] = local163 < local271 ? local271 - local163 : local163 - local271;
						}
					} else if (local34 == 12) {
						for (local34 = 0; local34 < Static182.anInt3492; local34++) {
							local271 = local25[local34];
							local163 = local31[local34];
							local15[local34] = local163 + local271 - (local271 * local163 >> 11);
						}
					}
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4756(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass85_41.method2339(arg0);
		if (this.aClass85_41.aBoolean171) {
			@Pc(27) int[][] local27 = this.method4749(0, arg0);
			@Pc(33) int[][] local33 = this.method4749(1, arg0);
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[2];
			@Pc(45) int[] local45 = local27[2];
			@Pc(49) int[] local49 = local33[0];
			@Pc(53) int[] local53 = local27[0];
			@Pc(57) int[] local57 = local33[1];
			@Pc(61) int[] local61 = local27[1];
			@Pc(65) int[] local65 = local11[1];
			@Pc(69) int[] local69 = local33[2];
			@Pc(72) int local72 = this.anInt3030;
			if (local72 == 1) {
				for (local72 = 0; local72 < Static182.anInt3492; local72++) {
					local37[local72] = local49[local72] + local53[local72];
					local65[local72] = local61[local72] + local57[local72];
					local41[local72] = local69[local72] + local45[local72];
				}
			} else if (local72 == 2) {
				for (local72 = 0; local72 < Static182.anInt3492; local72++) {
					local37[local72] = local53[local72] - local49[local72];
					local65[local72] = local61[local72] - local57[local72];
					local41[local72] = local45[local72] - local69[local72];
				}
			} else if (local72 == 3) {
				for (local72 = 0; local72 < Static182.anInt3492; local72++) {
					local37[local72] = local53[local72] * local49[local72] >> 12;
					local65[local72] = local61[local72] * local57[local72] >> 12;
					local41[local72] = local45[local72] * local69[local72] >> 12;
				}
			} else {
				@Pc(300) int local300;
				@Pc(296) int local296;
				@Pc(292) int local292;
				if (local72 == 4) {
					for (local72 = 0; local72 < Static182.anInt3492; local72++) {
						local292 = local69[local72];
						local296 = local57[local72];
						local300 = local49[local72];
						local37[local72] = local300 == 0 ? 4096 : (local53[local72] << 12) / local300;
						local65[local72] = local296 == 0 ? 4096 : (local61[local72] << 12) / local296;
						local41[local72] = local292 == 0 ? 4096 : (local45[local72] << 12) / local292;
					}
				} else if (local72 == 5) {
					for (local72 = 0; local72 < Static182.anInt3492; local72++) {
						local37[local72] = 4096 - ((4096 - local49[local72]) * (-local53[local72] + 4096) >> 12);
						local65[local72] = 4096 - ((4096 - local57[local72]) * (4096 - local61[local72]) >> 12);
						local41[local72] = 4096 - ((4096 - local69[local72]) * (4096 - local45[local72]) >> 12);
					}
				} else if (local72 == 6) {
					for (local72 = 0; local72 < Static182.anInt3492; local72++) {
						local296 = local57[local72];
						local292 = local69[local72];
						local300 = local49[local72];
						local37[local72] = local300 < 2048 ? local300 * local53[local72] >> 11 : 4096 - ((4096 - local300) * (-local53[local72] + 4096) >> 11);
						local65[local72] = local296 < 2048 ? local61[local72] * local296 >> 11 : 4096 - ((4096 - local296) * (-local61[local72] + 4096) >> 11);
						local41[local72] = local292 < 2048 ? local292 * local45[local72] >> 11 : 4096 - ((4096 - local292) * (4096 - local45[local72]) >> 11);
					}
				} else {
					@Pc(553) int local553;
					@Pc(545) int local545;
					@Pc(549) int local549;
					if (local72 == 7) {
						for (local72 = 0; local72 < Static182.anInt3492; local72++) {
							local545 = local61[local72];
							local549 = local45[local72];
							local553 = local53[local72];
							local37[local72] = local553 == 4096 ? 4096 : (local49[local72] << 12) / (4096 - local553);
							local65[local72] = local545 == 4096 ? 4096 : (local57[local72] << 12) / (4096 - local545);
							local41[local72] = local549 == 4096 ? 4096 : (local69[local72] << 12) / (4096 - local549);
						}
					} else if (local72 == 8) {
						for (local72 = 0; local72 < Static182.anInt3492; local72++) {
							local553 = local53[local72];
							local545 = local61[local72];
							local549 = local45[local72];
							local37[local72] = local553 == 0 ? 0 : 4096 - (4096 - local49[local72] << 12) / local553;
							local65[local72] = local545 == 0 ? 0 : 4096 - (4096 - local57[local72] << 12) / local545;
							local41[local72] = local549 == 0 ? 0 : 4096 - (4096 - local69[local72] << 12) / local549;
						}
					} else if (local72 == 9) {
						for (local72 = 0; local72 < Static182.anInt3492; local72++) {
							local549 = local45[local72];
							local292 = local69[local72];
							local300 = local49[local72];
							local296 = local57[local72];
							local545 = local61[local72];
							local553 = local53[local72];
							local37[local72] = local300 > local553 ? local553 : local300;
							local65[local72] = local545 >= local296 ? local296 : local545;
							local41[local72] = local292 <= local549 ? local292 : local549;
						}
					} else if (local72 == 10) {
						for (local72 = 0; local72 < Static182.anInt3492; local72++) {
							local296 = local57[local72];
							local545 = local61[local72];
							local553 = local53[local72];
							local300 = local49[local72];
							local549 = local45[local72];
							local292 = local69[local72];
							local37[local72] = local300 < local553 ? local553 : local300;
							local65[local72] = local545 <= local296 ? local296 : local545;
							local41[local72] = local549 > local292 ? local549 : local292;
						}
					} else if (local72 == 11) {
						for (local72 = 0; local72 < Static182.anInt3492; local72++) {
							local549 = local45[local72];
							local545 = local61[local72];
							local296 = local57[local72];
							local292 = local69[local72];
							local300 = local49[local72];
							local553 = local53[local72];
							local37[local72] = local300 >= local553 ? local300 - local553 : local553 - local300;
							local65[local72] = local296 < local545 ? local545 - local296 : local296 + -local545;
							local41[local72] = local292 < local549 ? local549 - local292 : local292 - local549;
						}
					} else if (local72 == 12) {
						for (local72 = 0; local72 < Static182.anInt3492; local72++) {
							local300 = local49[local72];
							local545 = local61[local72];
							local553 = local53[local72];
							local292 = local69[local72];
							local549 = local45[local72];
							local296 = local57[local72];
							local37[local72] = local300 + local553 - (local553 * local300 >> 11);
							local65[local72] = local545 + local296 - (local296 * local545 >> 11);
							local41[local72] = local549 + local292 - (local292 * local549 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
