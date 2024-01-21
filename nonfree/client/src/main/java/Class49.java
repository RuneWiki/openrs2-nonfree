import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZKWMIVTX")
public final class Class49 {

	@OriginalMember(owner = "client!ZKWMIVTX", name = "b", descriptor = "I")
	private static int anInt785;

	@OriginalMember(owner = "client!ZKWMIVTX", name = "c", descriptor = "[Lclient!ZKWMIVTX;")
	public static Class49[] aClass49Array1;

	@OriginalMember(owner = "client!ZKWMIVTX", name = "a", descriptor = "I")
	private static int anInt784 = 8;

	@OriginalMember(owner = "client!ZKWMIVTX", name = "d", descriptor = "I")
	public int anInt786;

	@OriginalMember(owner = "client!ZKWMIVTX", name = "e", descriptor = "[I")
	public int[] anIntArray206;

	@OriginalMember(owner = "client!ZKWMIVTX", name = "f", descriptor = "[I")
	public int[] anIntArray207;

	@OriginalMember(owner = "client!ZKWMIVTX", name = "g", descriptor = "[I")
	private int[] anIntArray208;

	@OriginalMember(owner = "client!ZKWMIVTX", name = "i", descriptor = "[I")
	public int[] anIntArray209;

	@OriginalMember(owner = "client!ZKWMIVTX", name = "r", descriptor = "I")
	private int anInt795;

	@OriginalMember(owner = "client!ZKWMIVTX", name = "h", descriptor = "I")
	public int anInt787 = -1;

	@OriginalMember(owner = "client!ZKWMIVTX", name = "j", descriptor = "Z")
	public boolean aBoolean238 = false;

	@OriginalMember(owner = "client!ZKWMIVTX", name = "k", descriptor = "I")
	public int anInt788 = 5;

	@OriginalMember(owner = "client!ZKWMIVTX", name = "l", descriptor = "I")
	public int anInt789 = -1;

	@OriginalMember(owner = "client!ZKWMIVTX", name = "m", descriptor = "I")
	public int anInt790 = -1;

	@OriginalMember(owner = "client!ZKWMIVTX", name = "n", descriptor = "I")
	public int anInt791 = 99;

	@OriginalMember(owner = "client!ZKWMIVTX", name = "o", descriptor = "I")
	public int anInt792 = -1;

	@OriginalMember(owner = "client!ZKWMIVTX", name = "p", descriptor = "I")
	public int anInt793 = -1;

	@OriginalMember(owner = "client!ZKWMIVTX", name = "q", descriptor = "I")
	public int anInt794 = 2;

	@OriginalMember(owner = "client!ZKWMIVTX", name = "a", descriptor = "(Lclient!BYZSQZUF;Z)V")
	public static void method566(@OriginalArg(0) Class5 arg0) {
		try {
			@Pc(11) Class3_Sub1_Sub3 local11 = new Class3_Sub1_Sub3(0, arg0.method66("seq.dat", null));
			anInt785 = local11.method148();
			if (aClass49Array1 == null) {
				aClass49Array1 = new Class49[anInt785];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt785; local21++) {
				if (aClass49Array1[local21] == null) {
					aClass49Array1[local21] = new Class49();
				}
				aClass49Array1[local21].method568(anInt784, local11);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("60601, " + arg0 + ", " + false + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZKWMIVTX", name = "<init>", descriptor = "()V")
	private Class49() {
	}

	@OriginalMember(owner = "client!ZKWMIVTX", name = "a", descriptor = "(II)I")
	public int method567(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = this.anIntArray208[arg0];
			if (local4 == 0) {
				@Pc(22) Class15 local22 = Class15.method124(this.anIntArray206[arg0]);
				if (local22 != null) {
					local4 = this.anIntArray208[arg0] = local22.anInt230;
				}
			}
			if (local4 == 0) {
				local4 = 1;
			}
			return local4;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("14464, " + 0 + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZKWMIVTX", name = "a", descriptor = "(ILclient!IMUIZRAF;)V")
	private void method568(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub3 arg1) {
		try {
			if (arg0 != 8) {
				anInt784 = -233;
			}
			while (true) {
				while (true) {
					@Pc(9) int local9 = arg1.method146();
					if (local9 == 0) {
						if (this.anInt786 == 0) {
							this.anInt786 = 1;
							this.anIntArray206 = new int[1];
							this.anIntArray206[0] = -1;
							this.anIntArray207 = new int[1];
							this.anIntArray207[0] = -1;
							this.anIntArray208 = new int[1];
							this.anIntArray208[0] = -1;
						}
						if (this.anInt792 == -1) {
							if (this.anIntArray209 == null) {
								this.anInt792 = 0;
							} else {
								this.anInt792 = 2;
							}
						}
						if (this.anInt793 == -1) {
							if (this.anIntArray209 != null) {
								this.anInt793 = 2;
								return;
							}
							this.anInt793 = 0;
							return;
						}
						return;
					}
					@Pc(36) int local36;
					if (local9 == 1) {
						this.anInt786 = arg1.method146();
						this.anIntArray206 = new int[this.anInt786];
						this.anIntArray207 = new int[this.anInt786];
						this.anIntArray208 = new int[this.anInt786];
						for (local36 = 0; local36 < this.anInt786; local36++) {
							this.anIntArray206[local36] = arg1.method148();
							this.anIntArray207[local36] = arg1.method148();
							if (this.anIntArray207[local36] == 65535) {
								this.anIntArray207[local36] = -1;
							}
							this.anIntArray208[local36] = arg1.method148();
						}
					} else if (local9 == 2) {
						this.anInt787 = arg1.method148();
					} else if (local9 == 3) {
						local36 = arg1.method146();
						this.anIntArray209 = new int[local36 + 1];
						for (@Pc(97) int local97 = 0; local97 < local36; local97++) {
							this.anIntArray209[local97] = arg1.method146();
						}
						this.anIntArray209[local36] = 9999999;
					} else if (local9 == 4) {
						this.aBoolean238 = true;
					} else if (local9 == 5) {
						this.anInt788 = arg1.method146();
					} else if (local9 == 6) {
						this.anInt789 = arg1.method148();
					} else if (local9 == 7) {
						this.anInt790 = arg1.method148();
					} else if (local9 == 8) {
						this.anInt791 = arg1.method146();
					} else if (local9 == 9) {
						this.anInt792 = arg1.method146();
					} else if (local9 == 10) {
						this.anInt793 = arg1.method146();
					} else if (local9 == 11) {
						this.anInt794 = arg1.method146();
					} else if (local9 == 12) {
						this.anInt795 = arg1.method151();
					} else {
						System.out.println("Error unrecognised seq config code: " + local9);
					}
				}
			}
		} catch (@Pc(271) RuntimeException local271) {
			signlink.reporterror("87344, " + arg0 + ", " + arg1 + ", " + local271.toString());
			throw new RuntimeException();
		}
	}
}
