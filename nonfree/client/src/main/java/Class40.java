import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WLHKAARP")
public final class Class40 {

	@OriginalMember(owner = "client!WLHKAARP", name = "b", descriptor = "I")
	private static int anInt752;

	@OriginalMember(owner = "client!WLHKAARP", name = "c", descriptor = "[Lclient!WLHKAARP;")
	public static Class40[] aClass40Array1;

	@OriginalMember(owner = "client!WLHKAARP", name = "d", descriptor = "I")
	public int anInt753;

	@OriginalMember(owner = "client!WLHKAARP", name = "e", descriptor = "[I")
	public int[] anIntArray159;

	@OriginalMember(owner = "client!WLHKAARP", name = "f", descriptor = "[I")
	public int[] anIntArray160;

	@OriginalMember(owner = "client!WLHKAARP", name = "g", descriptor = "[I")
	private int[] anIntArray161;

	@OriginalMember(owner = "client!WLHKAARP", name = "i", descriptor = "[I")
	public int[] anIntArray162;

	@OriginalMember(owner = "client!WLHKAARP", name = "r", descriptor = "I")
	private int anInt762;

	@OriginalMember(owner = "client!WLHKAARP", name = "a", descriptor = "Z")
	private boolean aBoolean172 = false;

	@OriginalMember(owner = "client!WLHKAARP", name = "h", descriptor = "I")
	public int anInt754 = -1;

	@OriginalMember(owner = "client!WLHKAARP", name = "j", descriptor = "Z")
	public boolean aBoolean173 = false;

	@OriginalMember(owner = "client!WLHKAARP", name = "k", descriptor = "I")
	public int anInt755 = 5;

	@OriginalMember(owner = "client!WLHKAARP", name = "l", descriptor = "I")
	public int anInt756 = -1;

	@OriginalMember(owner = "client!WLHKAARP", name = "m", descriptor = "I")
	public int anInt757 = -1;

	@OriginalMember(owner = "client!WLHKAARP", name = "n", descriptor = "I")
	public int anInt758 = 99;

	@OriginalMember(owner = "client!WLHKAARP", name = "o", descriptor = "I")
	public int anInt759 = -1;

	@OriginalMember(owner = "client!WLHKAARP", name = "p", descriptor = "I")
	public int anInt760 = -1;

	@OriginalMember(owner = "client!WLHKAARP", name = "q", descriptor = "I")
	public int anInt761 = 2;

	@OriginalMember(owner = "client!WLHKAARP", name = "a", descriptor = "(ZLclient!XRWUKRPO;)V")
	public static void method521(@OriginalArg(1) Class45 arg0) {
		try {
			@Pc(11) Class8_Sub1_Sub3 local11 = new Class8_Sub1_Sub3(arg0.method553("seq.dat", null), -49015);
			anInt752 = local11.method167();
			if (aClass40Array1 == null) {
				aClass40Array1 = new Class40[anInt752];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt752; local21++) {
				if (aClass40Array1[local21] == null) {
					aClass40Array1[local21] = new Class40();
				}
				aClass40Array1[local21].method523(local11);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("55398, " + false + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WLHKAARP", name = "<init>", descriptor = "()V")
	private Class40() {
	}

	@OriginalMember(owner = "client!WLHKAARP", name = "a", descriptor = "(II)I")
	public int method522(@OriginalArg(0) int arg0) {
		try {
			@Pc(8) int local8 = this.anIntArray161[arg0];
			if (local8 == 0) {
				@Pc(17) Class35 local17 = Class35.method447((byte) 5, this.anIntArray159[arg0]);
				if (local17 != null) {
					local8 = this.anIntArray161[arg0] = local17.anInt653;
				}
			}
			if (local8 == 0) {
				local8 = 1;
			}
			return local8;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("46444, " + arg0 + ", " + 0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WLHKAARP", name = "a", descriptor = "(BLclient!GLMIQHJI;)V")
	private void method523(@OriginalArg(1) Class8_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(15) int local15 = arg0.method165();
				if (local15 == 0) {
					if (this.anInt753 == 0) {
						this.anInt753 = 1;
						this.anIntArray159 = new int[1];
						this.anIntArray159[0] = -1;
						this.anIntArray160 = new int[1];
						this.anIntArray160[0] = -1;
						this.anIntArray161 = new int[1];
						this.anIntArray161[0] = -1;
					}
					if (this.anInt759 == -1) {
						if (this.anIntArray162 == null) {
							this.anInt759 = 0;
						} else {
							this.anInt759 = 2;
						}
					}
					if (this.anInt760 == -1) {
						if (this.anIntArray162 != null) {
							this.anInt760 = 2;
							return;
						}
						this.anInt760 = 0;
						return;
					}
					return;
				}
				@Pc(42) int local42;
				if (local15 == 1) {
					this.anInt753 = arg0.method165();
					this.anIntArray159 = new int[this.anInt753];
					this.anIntArray160 = new int[this.anInt753];
					this.anIntArray161 = new int[this.anInt753];
					for (local42 = 0; local42 < this.anInt753; local42++) {
						this.anIntArray159[local42] = arg0.method167();
						this.anIntArray160[local42] = arg0.method167();
						if (this.anIntArray160[local42] == 65535) {
							this.anIntArray160[local42] = -1;
						}
						this.anIntArray161[local42] = arg0.method167();
					}
				} else if (local15 == 2) {
					this.anInt754 = arg0.method167();
				} else if (local15 == 3) {
					local42 = arg0.method165();
					this.anIntArray162 = new int[local42 + 1];
					for (@Pc(103) int local103 = 0; local103 < local42; local103++) {
						this.anIntArray162[local103] = arg0.method165();
					}
					this.anIntArray162[local42] = 9999999;
				} else if (local15 == 4) {
					this.aBoolean173 = true;
				} else if (local15 == 5) {
					this.anInt755 = arg0.method165();
				} else if (local15 == 6) {
					this.anInt756 = arg0.method167();
				} else if (local15 == 7) {
					this.anInt757 = arg0.method167();
				} else if (local15 == 8) {
					this.anInt758 = arg0.method165();
				} else if (local15 == 9) {
					this.anInt759 = arg0.method165();
				} else if (local15 == 10) {
					this.anInt760 = arg0.method165();
				} else if (local15 == 11) {
					this.anInt761 = arg0.method165();
				} else if (local15 == 12) {
					this.anInt762 = arg0.method170();
				} else {
					System.out.println("Error unrecognised seq config code: " + local15);
				}
			}
		} catch (@Pc(277) RuntimeException local277) {
			signlink.reporterror("15820, " + 8 + ", " + arg0 + ", " + local277.toString());
			throw new RuntimeException();
		}
	}
}
