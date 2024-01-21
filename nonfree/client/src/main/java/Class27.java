import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!nc")
public final class Class27 {

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
	private static int anInt811;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "[Lclient!nc;")
	public static Class27[] aClass27Array1;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
	private static int anInt809 = -39972;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
	public int anInt812;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "[I")
	public int[] anIntArray226;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "[I")
	public int[] anIntArray227;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "[I")
	private int[] anIntArray228;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "[I")
	public int[] anIntArray229;

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
	public int anInt820;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
	private int anInt810 = 16146;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
	public int anInt813 = -1;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "Z")
	public boolean aBoolean186 = false;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
	public int anInt814 = 5;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public int anInt815 = -1;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	public int anInt816 = -1;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	public int anInt817 = 99;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
	public int anInt818 = -1;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
	public int anInt819 = -1;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!yb;)V")
	public static void method514(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1) {
		try {
			if (arg0 < 3 || arg0 > 3) {
				anInt809 = -3;
			}
			@Pc(16) Class1_Sub1_Sub3 local16 = new Class1_Sub1_Sub3(arg1.method674("seq.dat", null), false);
			anInt811 = local16.method498();
			if (aClass27Array1 == null) {
				aClass27Array1 = new Class27[anInt811];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt811; local26++) {
				if (aClass27Array1[local26] == null) {
					aClass27Array1[local26] = new Class27();
				}
				aClass27Array1[local26].method516(local16);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("79709, " + arg0 + ", " + arg1 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	private Class27() {
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)I")
	public int method515(@OriginalArg(0) int arg0) {
		try {
			@Pc(9) int local9 = this.anIntArray228[arg0];
			if (local9 == 0) {
				@Pc(18) Class14 local18 = Class14.method326(this.anIntArray226[arg0]);
				if (local18 != null) {
					local9 = this.anIntArray228[arg0] = local18.anInt598;
				}
			}
			if (local9 == 0) {
				local9 = 1;
			}
			return local9;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("50887, " + arg0 + ", " + 0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLclient!mb;)V")
	private void method516(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method496();
				if (local10 == 0) {
					if (this.anInt812 == 0) {
						this.anInt812 = 1;
						this.anIntArray226 = new int[1];
						this.anIntArray226[0] = -1;
						this.anIntArray227 = new int[1];
						this.anIntArray227[0] = -1;
						this.anIntArray228 = new int[1];
						this.anIntArray228[0] = -1;
					}
					if (this.anInt818 == -1) {
						if (this.anIntArray229 == null) {
							this.anInt818 = 0;
						} else {
							this.anInt818 = 2;
						}
					}
					if (this.anInt819 == -1) {
						if (this.anIntArray229 != null) {
							this.anInt819 = 2;
							return;
						}
						this.anInt819 = 0;
						return;
					}
					return;
				}
				@Pc(37) int local37;
				if (local10 == 1) {
					this.anInt812 = arg0.method496();
					this.anIntArray226 = new int[this.anInt812];
					this.anIntArray227 = new int[this.anInt812];
					this.anIntArray228 = new int[this.anInt812];
					for (local37 = 0; local37 < this.anInt812; local37++) {
						this.anIntArray226[local37] = arg0.method498();
						this.anIntArray227[local37] = arg0.method498();
						if (this.anIntArray227[local37] == 65535) {
							this.anIntArray227[local37] = -1;
						}
						this.anIntArray228[local37] = arg0.method498();
					}
				} else if (local10 == 2) {
					this.anInt813 = arg0.method498();
				} else if (local10 == 3) {
					local37 = arg0.method496();
					this.anIntArray229 = new int[local37 + 1];
					for (@Pc(98) int local98 = 0; local98 < local37; local98++) {
						this.anIntArray229[local98] = arg0.method496();
					}
					this.anIntArray229[local37] = 9999999;
				} else if (local10 == 4) {
					this.aBoolean186 = true;
				} else if (local10 == 5) {
					this.anInt814 = arg0.method496();
				} else if (local10 == 6) {
					this.anInt815 = arg0.method498();
				} else if (local10 == 7) {
					this.anInt816 = arg0.method498();
				} else if (local10 == 8) {
					this.anInt817 = arg0.method496();
				} else if (local10 == 9) {
					this.anInt818 = arg0.method496();
				} else if (local10 == 10) {
					this.anInt819 = arg0.method496();
				} else if (local10 == 11) {
					this.anInt820 = arg0.method496();
				} else {
					System.out.println("Error unrecognised seq config code: " + local10);
				}
			}
		} catch (@Pc(263) RuntimeException local263) {
			signlink.reporterror("59006, " + true + ", " + arg0 + ", " + local263.toString());
			throw new RuntimeException();
		}
	}
}
