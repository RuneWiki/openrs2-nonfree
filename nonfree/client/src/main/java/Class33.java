import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RIUJHZLL")
public final class Class33 {

	@OriginalMember(owner = "client!RIUJHZLL", name = "b", descriptor = "I")
	private static int anInt557;

	@OriginalMember(owner = "client!RIUJHZLL", name = "c", descriptor = "[Lclient!RIUJHZLL;")
	public static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!RIUJHZLL", name = "a", descriptor = "I")
	private int anInt556;

	@OriginalMember(owner = "client!RIUJHZLL", name = "d", descriptor = "I")
	public int anInt558;

	@OriginalMember(owner = "client!RIUJHZLL", name = "e", descriptor = "[I")
	public int[] anIntArray129;

	@OriginalMember(owner = "client!RIUJHZLL", name = "f", descriptor = "[I")
	public int[] anIntArray130;

	@OriginalMember(owner = "client!RIUJHZLL", name = "g", descriptor = "[I")
	private int[] anIntArray131;

	@OriginalMember(owner = "client!RIUJHZLL", name = "i", descriptor = "[I")
	public int[] anIntArray132;

	@OriginalMember(owner = "client!RIUJHZLL", name = "r", descriptor = "I")
	private int anInt567;

	@OriginalMember(owner = "client!RIUJHZLL", name = "h", descriptor = "I")
	public int anInt559 = -1;

	@OriginalMember(owner = "client!RIUJHZLL", name = "j", descriptor = "Z")
	public boolean aBoolean147 = false;

	@OriginalMember(owner = "client!RIUJHZLL", name = "k", descriptor = "I")
	public int anInt560 = 5;

	@OriginalMember(owner = "client!RIUJHZLL", name = "l", descriptor = "I")
	public int anInt561 = -1;

	@OriginalMember(owner = "client!RIUJHZLL", name = "m", descriptor = "I")
	public int anInt562 = -1;

	@OriginalMember(owner = "client!RIUJHZLL", name = "n", descriptor = "I")
	public int anInt563 = 99;

	@OriginalMember(owner = "client!RIUJHZLL", name = "o", descriptor = "I")
	public int anInt564 = -1;

	@OriginalMember(owner = "client!RIUJHZLL", name = "p", descriptor = "I")
	public int anInt565 = -1;

	@OriginalMember(owner = "client!RIUJHZLL", name = "q", descriptor = "I")
	public int anInt566 = 2;

	@OriginalMember(owner = "client!RIUJHZLL", name = "a", descriptor = "(ILclient!RVLWVPJQ;)V")
	public static void method370(@OriginalArg(1) Class36 arg0) {
		try {
			@Pc(8) Class6_Sub2_Sub3 local8 = new Class6_Sub2_Sub3(741, arg0.method381("seq.dat", null));
			anInt557 = local8.method404();
			if (aClass33Array1 == null) {
				aClass33Array1 = new Class33[anInt557];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt557; local21++) {
				if (aClass33Array1[local21] == null) {
					aClass33Array1[local21] = new Class33();
				}
				aClass33Array1[local21].method372(local8);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("31528, " + 0 + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RIUJHZLL", name = "<init>", descriptor = "()V")
	private Class33() {
	}

	@OriginalMember(owner = "client!RIUJHZLL", name = "a", descriptor = "(II)I")
	public int method371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != 3) {
				return 1;
			}
			@Pc(9) int local9 = this.anIntArray131[arg0];
			if (local9 == 0) {
				@Pc(18) Class12 local18 = Class12.method87(892, this.anIntArray129[arg0]);
				if (local18 != null) {
					local9 = this.anIntArray131[arg0] = local18.anInt104;
				}
			}
			if (local9 == 0) {
				local9 = 1;
			}
			return local9;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("30360, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RIUJHZLL", name = "a", descriptor = "(ILclient!UAWAYCTK;)V")
	private void method372(@OriginalArg(1) Class6_Sub2_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method402();
				if (local10 == 0) {
					if (this.anInt558 == 0) {
						this.anInt558 = 1;
						this.anIntArray129 = new int[1];
						this.anIntArray129[0] = -1;
						this.anIntArray130 = new int[1];
						this.anIntArray130[0] = -1;
						this.anIntArray131 = new int[1];
						this.anIntArray131[0] = -1;
					}
					if (this.anInt564 == -1) {
						if (this.anIntArray132 == null) {
							this.anInt564 = 0;
						} else {
							this.anInt564 = 2;
						}
					}
					if (this.anInt565 == -1) {
						if (this.anIntArray132 != null) {
							this.anInt565 = 2;
							return;
						}
						this.anInt565 = 0;
						return;
					}
					return;
				}
				@Pc(37) int local37;
				if (local10 == 1) {
					this.anInt558 = arg0.method402();
					this.anIntArray129 = new int[this.anInt558];
					this.anIntArray130 = new int[this.anInt558];
					this.anIntArray131 = new int[this.anInt558];
					for (local37 = 0; local37 < this.anInt558; local37++) {
						this.anIntArray129[local37] = arg0.method404();
						this.anIntArray130[local37] = arg0.method404();
						if (this.anIntArray130[local37] == 65535) {
							this.anIntArray130[local37] = -1;
						}
						this.anIntArray131[local37] = arg0.method404();
					}
				} else if (local10 == 2) {
					this.anInt559 = arg0.method404();
				} else if (local10 == 3) {
					local37 = arg0.method402();
					this.anIntArray132 = new int[local37 + 1];
					for (@Pc(98) int local98 = 0; local98 < local37; local98++) {
						this.anIntArray132[local98] = arg0.method402();
					}
					this.anIntArray132[local37] = 9999999;
				} else if (local10 == 4) {
					this.aBoolean147 = true;
				} else if (local10 == 5) {
					this.anInt560 = arg0.method402();
				} else if (local10 == 6) {
					this.anInt561 = arg0.method404();
				} else if (local10 == 7) {
					this.anInt562 = arg0.method404();
				} else if (local10 == 8) {
					this.anInt563 = arg0.method402();
				} else if (local10 == 9) {
					this.anInt564 = arg0.method402();
				} else if (local10 == 10) {
					this.anInt565 = arg0.method402();
				} else if (local10 == 11) {
					this.anInt566 = arg0.method402();
				} else if (local10 == 12) {
					this.anInt567 = arg0.method407();
				} else {
					System.out.println("Error unrecognised seq config code: " + local10);
				}
			}
		} catch (@Pc(272) RuntimeException local272) {
			signlink.reporterror("93516, " + -7321 + ", " + arg0 + ", " + local272.toString());
			throw new RuntimeException();
		}
	}
}
