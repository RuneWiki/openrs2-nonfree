import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IUTBNGPH")
public final class Class21 {

	@OriginalMember(owner = "client!IUTBNGPH", name = "d", descriptor = "I")
	private static int anInt389;

	@OriginalMember(owner = "client!IUTBNGPH", name = "e", descriptor = "[Lclient!IUTBNGPH;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!IUTBNGPH", name = "b", descriptor = "I")
	private static int anInt387 = 3;

	@OriginalMember(owner = "client!IUTBNGPH", name = "c", descriptor = "I")
	private int anInt388;

	@OriginalMember(owner = "client!IUTBNGPH", name = "f", descriptor = "I")
	public int anInt390;

	@OriginalMember(owner = "client!IUTBNGPH", name = "g", descriptor = "[I")
	public int[] anIntArray68;

	@OriginalMember(owner = "client!IUTBNGPH", name = "h", descriptor = "[I")
	public int[] anIntArray69;

	@OriginalMember(owner = "client!IUTBNGPH", name = "i", descriptor = "[I")
	private int[] anIntArray70;

	@OriginalMember(owner = "client!IUTBNGPH", name = "k", descriptor = "[I")
	public int[] anIntArray71;

	@OriginalMember(owner = "client!IUTBNGPH", name = "t", descriptor = "I")
	private int anInt399;

	@OriginalMember(owner = "client!IUTBNGPH", name = "a", descriptor = "I")
	private int anInt386 = 22486;

	@OriginalMember(owner = "client!IUTBNGPH", name = "j", descriptor = "I")
	public int anInt391 = -1;

	@OriginalMember(owner = "client!IUTBNGPH", name = "l", descriptor = "Z")
	public boolean aBoolean99 = false;

	@OriginalMember(owner = "client!IUTBNGPH", name = "m", descriptor = "I")
	public int anInt392 = 5;

	@OriginalMember(owner = "client!IUTBNGPH", name = "n", descriptor = "I")
	public int anInt393 = -1;

	@OriginalMember(owner = "client!IUTBNGPH", name = "o", descriptor = "I")
	public int anInt394 = -1;

	@OriginalMember(owner = "client!IUTBNGPH", name = "p", descriptor = "I")
	public int anInt395 = 99;

	@OriginalMember(owner = "client!IUTBNGPH", name = "q", descriptor = "I")
	public int anInt396 = -1;

	@OriginalMember(owner = "client!IUTBNGPH", name = "r", descriptor = "I")
	public int anInt397 = -1;

	@OriginalMember(owner = "client!IUTBNGPH", name = "s", descriptor = "I")
	public int anInt398 = 2;

	@OriginalMember(owner = "client!IUTBNGPH", name = "a", descriptor = "(Lclient!VSUYIIVA;I)V")
	public static void method278(@OriginalArg(0) Class42 arg0) {
		try {
			@Pc(12) Class1_Sub1_Sub2 local12 = new Class1_Sub1_Sub2(arg0.method539("seq.dat", null), 792);
			anInt389 = local12.method61();
			if (aClass21Array1 == null) {
				aClass21Array1 = new Class21[anInt389];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt389; local22++) {
				if (aClass21Array1[local22] == null) {
					aClass21Array1[local22] = new Class21();
				}
				aClass21Array1[local22].method280(local12);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("94191, " + arg0 + ", " + 236 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUTBNGPH", name = "<init>", descriptor = "()V")
	private Class21() {
	}

	@OriginalMember(owner = "client!IUTBNGPH", name = "a", descriptor = "(BI)I")
	public int method279(@OriginalArg(1) int arg0) {
		try {
			@Pc(9) int local9 = this.anIntArray70[arg0];
			if (local9 == 0) {
				@Pc(19) Class6 local19 = Class6.method43(this.anIntArray68[arg0], this.anInt388);
				if (local19 != null) {
					local9 = this.anIntArray70[arg0] = local19.anInt137;
				}
			}
			if (local9 == 0) {
				local9 = 1;
			}
			return local9;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("36561, " + 5 + ", " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUTBNGPH", name = "a", descriptor = "(Lclient!CFARFRSG;I)V")
	private void method280(@OriginalArg(0) Class1_Sub1_Sub2 arg0) {
		try {
			if (this.anInt386 != 22486) {
				anInt387 = -148;
			}
			while (true) {
				while (true) {
					@Pc(10) int local10 = arg0.method59();
					if (local10 == 0) {
						if (this.anInt390 == 0) {
							this.anInt390 = 1;
							this.anIntArray68 = new int[1];
							this.anIntArray68[0] = -1;
							this.anIntArray69 = new int[1];
							this.anIntArray69[0] = -1;
							this.anIntArray70 = new int[1];
							this.anIntArray70[0] = -1;
						}
						if (this.anInt396 == -1) {
							if (this.anIntArray71 == null) {
								this.anInt396 = 0;
							} else {
								this.anInt396 = 2;
							}
						}
						if (this.anInt397 == -1) {
							if (this.anIntArray71 != null) {
								this.anInt397 = 2;
								return;
							}
							this.anInt397 = 0;
							return;
						}
						return;
					}
					@Pc(37) int local37;
					if (local10 == 1) {
						this.anInt390 = arg0.method59();
						this.anIntArray68 = new int[this.anInt390];
						this.anIntArray69 = new int[this.anInt390];
						this.anIntArray70 = new int[this.anInt390];
						for (local37 = 0; local37 < this.anInt390; local37++) {
							this.anIntArray68[local37] = arg0.method61();
							this.anIntArray69[local37] = arg0.method61();
							if (this.anIntArray69[local37] == 65535) {
								this.anIntArray69[local37] = -1;
							}
							this.anIntArray70[local37] = arg0.method61();
						}
					} else if (local10 == 2) {
						this.anInt391 = arg0.method61();
					} else if (local10 == 3) {
						local37 = arg0.method59();
						this.anIntArray71 = new int[local37 + 1];
						for (@Pc(98) int local98 = 0; local98 < local37; local98++) {
							this.anIntArray71[local98] = arg0.method59();
						}
						this.anIntArray71[local37] = 9999999;
					} else if (local10 == 4) {
						this.aBoolean99 = true;
					} else if (local10 == 5) {
						this.anInt392 = arg0.method59();
					} else if (local10 == 6) {
						this.anInt393 = arg0.method61();
					} else if (local10 == 7) {
						this.anInt394 = arg0.method61();
					} else if (local10 == 8) {
						this.anInt395 = arg0.method59();
					} else if (local10 == 9) {
						this.anInt396 = arg0.method59();
					} else if (local10 == 10) {
						this.anInt397 = arg0.method59();
					} else if (local10 == 11) {
						this.anInt398 = arg0.method59();
					} else if (local10 == 12) {
						this.anInt399 = arg0.method64();
					} else {
						System.out.println("Error unrecognised seq config code: " + local10);
					}
				}
			}
		} catch (@Pc(272) RuntimeException local272) {
			signlink.reporterror("24146, " + arg0 + ", " + 22486 + ", " + local272.toString());
			throw new RuntimeException();
		}
	}
}
