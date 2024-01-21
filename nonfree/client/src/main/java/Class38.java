import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UVDKTGZK")
public final class Class38 {

	@OriginalMember(owner = "client!UVDKTGZK", name = "c", descriptor = "I")
	private static int anInt706;

	@OriginalMember(owner = "client!UVDKTGZK", name = "d", descriptor = "[Lclient!UVDKTGZK;")
	public static Class38[] aClass38Array1;

	@OriginalMember(owner = "client!UVDKTGZK", name = "b", descriptor = "I")
	private int anInt705;

	@OriginalMember(owner = "client!UVDKTGZK", name = "e", descriptor = "I")
	public int anInt707;

	@OriginalMember(owner = "client!UVDKTGZK", name = "f", descriptor = "[I")
	public int[] anIntArray191;

	@OriginalMember(owner = "client!UVDKTGZK", name = "g", descriptor = "[I")
	public int[] anIntArray192;

	@OriginalMember(owner = "client!UVDKTGZK", name = "h", descriptor = "[I")
	private int[] anIntArray193;

	@OriginalMember(owner = "client!UVDKTGZK", name = "j", descriptor = "[I")
	public int[] anIntArray194;

	@OriginalMember(owner = "client!UVDKTGZK", name = "s", descriptor = "I")
	private int anInt716;

	@OriginalMember(owner = "client!UVDKTGZK", name = "a", descriptor = "I")
	private int anInt704 = -896;

	@OriginalMember(owner = "client!UVDKTGZK", name = "i", descriptor = "I")
	public int anInt708 = -1;

	@OriginalMember(owner = "client!UVDKTGZK", name = "k", descriptor = "Z")
	public boolean aBoolean190 = false;

	@OriginalMember(owner = "client!UVDKTGZK", name = "l", descriptor = "I")
	public int anInt709 = 5;

	@OriginalMember(owner = "client!UVDKTGZK", name = "m", descriptor = "I")
	public int anInt710 = -1;

	@OriginalMember(owner = "client!UVDKTGZK", name = "n", descriptor = "I")
	public int anInt711 = -1;

	@OriginalMember(owner = "client!UVDKTGZK", name = "o", descriptor = "I")
	public int anInt712 = 99;

	@OriginalMember(owner = "client!UVDKTGZK", name = "p", descriptor = "I")
	public int anInt713 = -1;

	@OriginalMember(owner = "client!UVDKTGZK", name = "q", descriptor = "I")
	public int anInt714 = -1;

	@OriginalMember(owner = "client!UVDKTGZK", name = "r", descriptor = "I")
	public int anInt715 = 2;

	@OriginalMember(owner = "client!UVDKTGZK", name = "a", descriptor = "(Lclient!GWOEELWB;B)V")
	public static void method524(@OriginalArg(0) Class13 arg0) {
		try {
			@Pc(12) Class3_Sub1_Sub2 local12 = new Class3_Sub1_Sub2(true, arg0.method140("seq.dat", null));
			anInt706 = local12.method202();
			if (aClass38Array1 == null) {
				aClass38Array1 = new Class38[anInt706];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt706; local22++) {
				if (aClass38Array1[local22] == null) {
					aClass38Array1[local22] = new Class38();
				}
				aClass38Array1[local22].method526(local12);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("14328, " + arg0 + ", " + 3 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UVDKTGZK", name = "<init>", descriptor = "()V")
	private Class38() {
	}

	@OriginalMember(owner = "client!UVDKTGZK", name = "a", descriptor = "(BI)I")
	public int method525(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = this.anIntArray193[arg1];
			@Pc(9) boolean local9 = false;
			if (local4 == 0) {
				@Pc(22) Class7 local22 = Class7.method93(this.anIntArray191[arg1]);
				if (local22 != null) {
					local4 = this.anIntArray193[arg1] = local22.anInt176;
				}
			}
			if (local4 == 0) {
				local4 = 1;
			}
			return local4;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("90721, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UVDKTGZK", name = "a", descriptor = "(Lclient!MLYYHULT;B)V")
	private void method526(@OriginalArg(0) Class3_Sub1_Sub2 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method200();
				if (local10 == 0) {
					if (this.anInt707 == 0) {
						this.anInt707 = 1;
						this.anIntArray191 = new int[1];
						this.anIntArray191[0] = -1;
						this.anIntArray192 = new int[1];
						this.anIntArray192[0] = -1;
						this.anIntArray193 = new int[1];
						this.anIntArray193[0] = -1;
					}
					if (this.anInt713 == -1) {
						if (this.anIntArray194 == null) {
							this.anInt713 = 0;
						} else {
							this.anInt713 = 2;
						}
					}
					if (this.anInt714 == -1) {
						if (this.anIntArray194 != null) {
							this.anInt714 = 2;
							return;
						}
						this.anInt714 = 0;
						return;
					}
					return;
				}
				@Pc(37) int local37;
				if (local10 == 1) {
					this.anInt707 = arg0.method200();
					this.anIntArray191 = new int[this.anInt707];
					this.anIntArray192 = new int[this.anInt707];
					this.anIntArray193 = new int[this.anInt707];
					for (local37 = 0; local37 < this.anInt707; local37++) {
						this.anIntArray191[local37] = arg0.method202();
						this.anIntArray192[local37] = arg0.method202();
						if (this.anIntArray192[local37] == 65535) {
							this.anIntArray192[local37] = -1;
						}
						this.anIntArray193[local37] = arg0.method202();
					}
				} else if (local10 == 2) {
					this.anInt708 = arg0.method202();
				} else if (local10 == 3) {
					local37 = arg0.method200();
					this.anIntArray194 = new int[local37 + 1];
					for (@Pc(98) int local98 = 0; local98 < local37; local98++) {
						this.anIntArray194[local98] = arg0.method200();
					}
					this.anIntArray194[local37] = 9999999;
				} else if (local10 == 4) {
					this.aBoolean190 = true;
				} else if (local10 == 5) {
					this.anInt709 = arg0.method200();
				} else if (local10 == 6) {
					this.anInt710 = arg0.method202();
				} else if (local10 == 7) {
					this.anInt711 = arg0.method202();
				} else if (local10 == 8) {
					this.anInt712 = arg0.method200();
				} else if (local10 == 9) {
					this.anInt713 = arg0.method200();
				} else if (local10 == 10) {
					this.anInt714 = arg0.method200();
				} else if (local10 == 11) {
					this.anInt715 = arg0.method200();
				} else if (local10 == 12) {
					this.anInt716 = arg0.method205();
				} else {
					System.out.println("Error unrecognised seq config code: " + local10);
				}
			}
		} catch (@Pc(272) RuntimeException local272) {
			signlink.reporterror("46937, " + arg0 + ", " + 2 + ", " + local272.toString());
			throw new RuntimeException();
		}
	}
}
