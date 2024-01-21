import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!mc")
public final class Class25 {

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
	private static int anInt784;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "[Lclient!mc;")
	public static Class25[] aClass25Array1;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
	public int anInt785;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "[I")
	public int[] anIntArray215;

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "[I")
	public int[] anIntArray216;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "[I")
	private int[] anIntArray217;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "[I")
	public int[] anIntArray218;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
	private int anInt783 = -797;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
	public int anInt786 = -1;

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "Z")
	public boolean aBoolean164 = false;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
	public int anInt787 = 5;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
	public int anInt788 = -1;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
	public int anInt789 = -1;

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
	public int anInt790 = 99;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!yb;I)V")
	public static void method484(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method644("seq.dat", null), true);
			@Pc(12) boolean local12 = false;
			anInt784 = local8.method470();
			if (aClass25Array1 == null) {
				aClass25Array1 = new Class25[anInt784];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt784; local22++) {
				if (aClass25Array1[local22] == null) {
					aClass25Array1[local22] = new Class25();
				}
				aClass25Array1[local22].method486(local8);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("40758, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
	private Class25() {
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)I")
	public int method485(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = this.anIntArray217[arg0];
			if (local4 == 0) {
				@Pc(23) Class14 local23 = Class14.method331(this.anIntArray215[arg0], this.anInt783);
				if (local23 != null) {
					local4 = this.anIntArray217[arg0] = local23.anInt617;
				}
			}
			if (local4 == 0) {
				local4 = 1;
			}
			return local4;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("81087, " + true + ", " + arg0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!mb;)V")
	private void method486(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method468();
				if (local11 == 0) {
					if (this.anInt785 == 0) {
						this.anInt785 = 1;
						this.anIntArray215 = new int[1];
						this.anIntArray215[0] = -1;
						this.anIntArray216 = new int[1];
						this.anIntArray216[0] = -1;
						this.anIntArray217 = new int[1];
						this.anIntArray217[0] = -1;
						return;
					}
					return;
				}
				@Pc(38) int local38;
				if (local11 == 1) {
					this.anInt785 = arg0.method468();
					this.anIntArray215 = new int[this.anInt785];
					this.anIntArray216 = new int[this.anInt785];
					this.anIntArray217 = new int[this.anInt785];
					for (local38 = 0; local38 < this.anInt785; local38++) {
						this.anIntArray215[local38] = arg0.method470();
						this.anIntArray216[local38] = arg0.method470();
						if (this.anIntArray216[local38] == 65535) {
							this.anIntArray216[local38] = -1;
						}
						this.anIntArray217[local38] = arg0.method470();
					}
				} else if (local11 == 2) {
					this.anInt786 = arg0.method470();
				} else if (local11 == 3) {
					local38 = arg0.method468();
					this.anIntArray218 = new int[local38 + 1];
					for (@Pc(99) int local99 = 0; local99 < local38; local99++) {
						this.anIntArray218[local99] = arg0.method468();
					}
					this.anIntArray218[local38] = 9999999;
				} else if (local11 == 4) {
					this.aBoolean164 = true;
				} else if (local11 == 5) {
					this.anInt787 = arg0.method468();
				} else if (local11 == 6) {
					this.anInt788 = arg0.method470();
				} else if (local11 == 7) {
					this.anInt789 = arg0.method470();
				} else if (local11 == 8) {
					this.anInt790 = arg0.method468();
				} else {
					System.out.println("Error unrecognised seq config code: " + local11);
				}
			}
		} catch (@Pc(208) RuntimeException local208) {
			signlink.reporterror("550, " + 3251 + ", " + arg0 + ", " + local208.toString());
			throw new RuntimeException();
		}
	}
}
