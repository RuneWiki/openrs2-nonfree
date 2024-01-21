import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VYXELYSX")
public final class Class39 {

	@OriginalMember(owner = "client!VYXELYSX", name = "b", descriptor = "I")
	private static int anInt584;

	@OriginalMember(owner = "client!VYXELYSX", name = "c", descriptor = "[Lclient!VYXELYSX;")
	public static Class39[] aClass39Array1;

	@OriginalMember(owner = "client!VYXELYSX", name = "d", descriptor = "I")
	public int anInt585;

	@OriginalMember(owner = "client!VYXELYSX", name = "e", descriptor = "[I")
	public int[] anIntArray166;

	@OriginalMember(owner = "client!VYXELYSX", name = "f", descriptor = "[I")
	public int[] anIntArray167;

	@OriginalMember(owner = "client!VYXELYSX", name = "g", descriptor = "[I")
	private int[] anIntArray168;

	@OriginalMember(owner = "client!VYXELYSX", name = "i", descriptor = "[I")
	public int[] anIntArray169;

	@OriginalMember(owner = "client!VYXELYSX", name = "r", descriptor = "I")
	private int anInt594;

	@OriginalMember(owner = "client!VYXELYSX", name = "a", descriptor = "I")
	private int anInt583 = 655;

	@OriginalMember(owner = "client!VYXELYSX", name = "h", descriptor = "I")
	public int anInt586 = -1;

	@OriginalMember(owner = "client!VYXELYSX", name = "j", descriptor = "Z")
	public boolean aBoolean187 = false;

	@OriginalMember(owner = "client!VYXELYSX", name = "k", descriptor = "I")
	public int anInt587 = 5;

	@OriginalMember(owner = "client!VYXELYSX", name = "l", descriptor = "I")
	public int anInt588 = -1;

	@OriginalMember(owner = "client!VYXELYSX", name = "m", descriptor = "I")
	public int anInt589 = -1;

	@OriginalMember(owner = "client!VYXELYSX", name = "n", descriptor = "I")
	public int anInt590 = 99;

	@OriginalMember(owner = "client!VYXELYSX", name = "o", descriptor = "I")
	public int anInt591 = -1;

	@OriginalMember(owner = "client!VYXELYSX", name = "p", descriptor = "I")
	public int anInt592 = -1;

	@OriginalMember(owner = "client!VYXELYSX", name = "q", descriptor = "I")
	public int anInt593 = 2;

	@OriginalMember(owner = "client!VYXELYSX", name = "a", descriptor = "(ILclient!MAARFNGV;)V")
	public static void method402(@OriginalArg(1) Class22 arg0) {
		try {
			@Pc(8) Class2_Sub1_Sub3 local8 = new Class2_Sub1_Sub3(arg0.method218("seq.dat", null), true);
			anInt584 = local8.method99();
			if (aClass39Array1 == null) {
				aClass39Array1 = new Class39[anInt584];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt584; local21++) {
				if (aClass39Array1[local21] == null) {
					aClass39Array1[local21] = new Class39();
				}
				aClass39Array1[local21].method404(local8);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("25654, " + 0 + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VYXELYSX", name = "<init>", descriptor = "()V")
	private Class39() {
	}

	@OriginalMember(owner = "client!VYXELYSX", name = "a", descriptor = "(IZ)I")
	public int method403(@OriginalArg(0) int arg0) {
		try {
			@Pc(9) int local9 = this.anIntArray168[arg0];
			if (local9 == 0) {
				@Pc(17) Class26 local17 = Class26.method222(this.anIntArray166[arg0]);
				if (local17 != null) {
					local9 = this.anIntArray168[arg0] = local17.anInt255;
				}
			}
			if (local9 == 0) {
				local9 = 1;
			}
			return local9;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("55419, " + arg0 + ", " + false + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VYXELYSX", name = "a", descriptor = "(ILclient!EMWAMCXW;)V")
	private void method404(@OriginalArg(1) Class2_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method97();
				if (local10 == 0) {
					if (this.anInt585 == 0) {
						this.anInt585 = 1;
						this.anIntArray166 = new int[1];
						this.anIntArray166[0] = -1;
						this.anIntArray167 = new int[1];
						this.anIntArray167[0] = -1;
						this.anIntArray168 = new int[1];
						this.anIntArray168[0] = -1;
					}
					if (this.anInt591 == -1) {
						if (this.anIntArray169 == null) {
							this.anInt591 = 0;
						} else {
							this.anInt591 = 2;
						}
					}
					if (this.anInt592 == -1) {
						if (this.anIntArray169 != null) {
							this.anInt592 = 2;
							return;
						}
						this.anInt592 = 0;
						return;
					}
					return;
				}
				@Pc(37) int local37;
				if (local10 == 1) {
					this.anInt585 = arg0.method97();
					this.anIntArray166 = new int[this.anInt585];
					this.anIntArray167 = new int[this.anInt585];
					this.anIntArray168 = new int[this.anInt585];
					for (local37 = 0; local37 < this.anInt585; local37++) {
						this.anIntArray166[local37] = arg0.method99();
						this.anIntArray167[local37] = arg0.method99();
						if (this.anIntArray167[local37] == 65535) {
							this.anIntArray167[local37] = -1;
						}
						this.anIntArray168[local37] = arg0.method99();
					}
				} else if (local10 == 2) {
					this.anInt586 = arg0.method99();
				} else if (local10 == 3) {
					local37 = arg0.method97();
					this.anIntArray169 = new int[local37 + 1];
					for (@Pc(98) int local98 = 0; local98 < local37; local98++) {
						this.anIntArray169[local98] = arg0.method97();
					}
					this.anIntArray169[local37] = 9999999;
				} else if (local10 == 4) {
					this.aBoolean187 = true;
				} else if (local10 == 5) {
					this.anInt587 = arg0.method97();
				} else if (local10 == 6) {
					this.anInt588 = arg0.method99();
				} else if (local10 == 7) {
					this.anInt589 = arg0.method99();
				} else if (local10 == 8) {
					this.anInt590 = arg0.method97();
				} else if (local10 == 9) {
					this.anInt591 = arg0.method97();
				} else if (local10 == 10) {
					this.anInt592 = arg0.method97();
				} else if (local10 == 11) {
					this.anInt593 = arg0.method97();
				} else if (local10 == 12) {
					this.anInt594 = arg0.method102();
				} else {
					System.out.println("Error unrecognised seq config code: " + local10);
				}
			}
		} catch (@Pc(272) RuntimeException local272) {
			signlink.reporterror("36402, " + 1016 + ", " + arg0 + ", " + local272.toString());
			throw new RuntimeException();
		}
	}
}
