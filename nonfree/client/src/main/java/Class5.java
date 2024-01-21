import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BZONLWPM")
public final class Class5 {

	@OriginalMember(owner = "client!BZONLWPM", name = "b", descriptor = "I")
	private static int anInt38;

	@OriginalMember(owner = "client!BZONLWPM", name = "c", descriptor = "[Lclient!BZONLWPM;")
	public static Class5[] aClass5Array1;

	@OriginalMember(owner = "client!BZONLWPM", name = "d", descriptor = "I")
	public int anInt39;

	@OriginalMember(owner = "client!BZONLWPM", name = "e", descriptor = "[I")
	public int[] anIntArray7;

	@OriginalMember(owner = "client!BZONLWPM", name = "f", descriptor = "[I")
	public int[] anIntArray8;

	@OriginalMember(owner = "client!BZONLWPM", name = "g", descriptor = "[I")
	private int[] anIntArray9;

	@OriginalMember(owner = "client!BZONLWPM", name = "i", descriptor = "[I")
	public int[] anIntArray10;

	@OriginalMember(owner = "client!BZONLWPM", name = "r", descriptor = "I")
	private int anInt48;

	@OriginalMember(owner = "client!BZONLWPM", name = "a", descriptor = "Z")
	private boolean aBoolean14 = true;

	@OriginalMember(owner = "client!BZONLWPM", name = "h", descriptor = "I")
	public int anInt40 = -1;

	@OriginalMember(owner = "client!BZONLWPM", name = "j", descriptor = "Z")
	public boolean aBoolean15 = false;

	@OriginalMember(owner = "client!BZONLWPM", name = "k", descriptor = "I")
	public int anInt41 = 5;

	@OriginalMember(owner = "client!BZONLWPM", name = "l", descriptor = "I")
	public int anInt42 = -1;

	@OriginalMember(owner = "client!BZONLWPM", name = "m", descriptor = "I")
	public int anInt43 = -1;

	@OriginalMember(owner = "client!BZONLWPM", name = "n", descriptor = "I")
	public int anInt44 = 99;

	@OriginalMember(owner = "client!BZONLWPM", name = "o", descriptor = "I")
	public int anInt45 = -1;

	@OriginalMember(owner = "client!BZONLWPM", name = "p", descriptor = "I")
	public int anInt46 = -1;

	@OriginalMember(owner = "client!BZONLWPM", name = "q", descriptor = "I")
	public int anInt47 = 2;

	@OriginalMember(owner = "client!BZONLWPM", name = "a", descriptor = "(ILclient!TKEGJSFV;)V")
	public static void method31(@OriginalArg(1) Class38 arg0) {
		try {
			@Pc(8) Class4_Sub1_Sub3 local8 = new Class4_Sub1_Sub3(arg0.method514("seq.dat", null), false);
			anInt38 = local8.method169();
			if (aClass5Array1 == null) {
				aClass5Array1 = new Class5[anInt38];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt38; local18++) {
				if (aClass5Array1[local18] == null) {
					aClass5Array1[local18] = new Class5();
				}
				aClass5Array1[local18].method33(local8);
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("98754, " + 0 + ", " + arg0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BZONLWPM", name = "<init>", descriptor = "()V")
	private Class5() {
	}

	@OriginalMember(owner = "client!BZONLWPM", name = "a", descriptor = "(IB)I")
	public int method32(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) int local4 = this.anIntArray9[arg0];
			if (local4 == 0) {
				@Pc(22) Class22 local22 = Class22.method273(this.anIntArray7[arg0]);
				if (local22 != null) {
					local4 = this.anIntArray9[arg0] = local22.anInt360;
				}
			}
			if (local4 == 0) {
				local4 = 1;
			}
			return local4;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("6710, " + arg0 + ", " + -127 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BZONLWPM", name = "a", descriptor = "(Lclient!EGCCHUZS;Z)V")
	private void method33(@OriginalArg(0) Class4_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(14) int local14 = arg0.method167();
				if (local14 == 0) {
					if (this.anInt39 == 0) {
						this.anInt39 = 1;
						this.anIntArray7 = new int[1];
						this.anIntArray7[0] = -1;
						this.anIntArray8 = new int[1];
						this.anIntArray8[0] = -1;
						this.anIntArray9 = new int[1];
						this.anIntArray9[0] = -1;
					}
					if (this.anInt45 == -1) {
						if (this.anIntArray10 == null) {
							this.anInt45 = 0;
						} else {
							this.anInt45 = 2;
						}
					}
					if (this.anInt46 == -1) {
						if (this.anIntArray10 != null) {
							this.anInt46 = 2;
							return;
						}
						this.anInt46 = 0;
						return;
					}
					return;
				}
				@Pc(41) int local41;
				if (local14 == 1) {
					this.anInt39 = arg0.method167();
					this.anIntArray7 = new int[this.anInt39];
					this.anIntArray8 = new int[this.anInt39];
					this.anIntArray9 = new int[this.anInt39];
					for (local41 = 0; local41 < this.anInt39; local41++) {
						this.anIntArray7[local41] = arg0.method169();
						this.anIntArray8[local41] = arg0.method169();
						if (this.anIntArray8[local41] == 65535) {
							this.anIntArray8[local41] = -1;
						}
						this.anIntArray9[local41] = arg0.method169();
					}
				} else if (local14 == 2) {
					this.anInt40 = arg0.method169();
				} else if (local14 == 3) {
					local41 = arg0.method167();
					this.anIntArray10 = new int[local41 + 1];
					for (@Pc(102) int local102 = 0; local102 < local41; local102++) {
						this.anIntArray10[local102] = arg0.method167();
					}
					this.anIntArray10[local41] = 9999999;
				} else if (local14 == 4) {
					this.aBoolean15 = true;
				} else if (local14 == 5) {
					this.anInt41 = arg0.method167();
				} else if (local14 == 6) {
					this.anInt42 = arg0.method169();
				} else if (local14 == 7) {
					this.anInt43 = arg0.method169();
				} else if (local14 == 8) {
					this.anInt44 = arg0.method167();
				} else if (local14 == 9) {
					this.anInt45 = arg0.method167();
				} else if (local14 == 10) {
					this.anInt46 = arg0.method167();
				} else if (local14 == 11) {
					this.anInt47 = arg0.method167();
				} else if (local14 == 12) {
					this.anInt48 = arg0.method172();
				} else {
					System.out.println("Error unrecognised seq config code: " + local14);
				}
			}
		} catch (@Pc(276) RuntimeException local276) {
			signlink.reporterror("16703, " + arg0 + ", " + true + ", " + local276.toString());
			throw new RuntimeException();
		}
	}
}
