import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NRLTHETF")
public final class Class23 {

	@OriginalMember(owner = "client!NRLTHETF", name = "e", descriptor = "I")
	public static int anInt464;

	@OriginalMember(owner = "client!NRLTHETF", name = "f", descriptor = "[Lclient!NRLTHETF;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!NRLTHETF", name = "c", descriptor = "I")
	private static int anInt463 = -77;

	@OriginalMember(owner = "client!NRLTHETF", name = "h", descriptor = "[I")
	private int[] anIntArray99;

	@OriginalMember(owner = "client!NRLTHETF", name = "a", descriptor = "Z")
	private boolean aBoolean131 = false;

	@OriginalMember(owner = "client!NRLTHETF", name = "b", descriptor = "Z")
	private boolean aBoolean132 = false;

	@OriginalMember(owner = "client!NRLTHETF", name = "d", descriptor = "Z")
	private boolean aBoolean133 = false;

	@OriginalMember(owner = "client!NRLTHETF", name = "g", descriptor = "I")
	public int anInt465 = -1;

	@OriginalMember(owner = "client!NRLTHETF", name = "i", descriptor = "[I")
	private int[] anIntArray100 = new int[6];

	@OriginalMember(owner = "client!NRLTHETF", name = "j", descriptor = "[I")
	private int[] anIntArray101 = new int[6];

	@OriginalMember(owner = "client!NRLTHETF", name = "k", descriptor = "[I")
	private int[] anIntArray102 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!NRLTHETF", name = "l", descriptor = "Z")
	public boolean aBoolean134 = false;

	@OriginalMember(owner = "client!NRLTHETF", name = "a", descriptor = "(ILclient!RVLWVPJQ;)V")
	public static void method291(@OriginalArg(1) Class36 arg0) {
		try {
			@Pc(8) Class6_Sub2_Sub3 local8 = new Class6_Sub2_Sub3(741, arg0.method381("idk.dat", null));
			anInt464 = local8.method404();
			if (aClass23Array1 == null) {
				aClass23Array1 = new Class23[anInt464];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt464; local22++) {
				if (aClass23Array1[local22] == null) {
					aClass23Array1[local22] = new Class23();
				}
				aClass23Array1[local22].method292(local8);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("78198, " + 0 + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NRLTHETF", name = "<init>", descriptor = "()V")
	private Class23() {
	}

	@OriginalMember(owner = "client!NRLTHETF", name = "a", descriptor = "(ILclient!UAWAYCTK;)V")
	private void method292(@OriginalArg(1) Class6_Sub2_Sub3 arg0) {
		try {
			while (true) {
				@Pc(15) int local15 = arg0.method402();
				if (local15 == 0) {
					return;
				}
				if (local15 == 1) {
					this.anInt465 = arg0.method402();
				} else if (local15 == 2) {
					@Pc(33) int local33 = arg0.method402();
					this.anIntArray99 = new int[local33];
					for (@Pc(39) int local39 = 0; local39 < local33; local39++) {
						this.anIntArray99[local39] = arg0.method404();
					}
				} else if (local15 == 3) {
					this.aBoolean134 = true;
				} else if (local15 >= 40 && local15 < 50) {
					this.anIntArray100[local15 - 40] = arg0.method404();
				} else if (local15 >= 50 && local15 < 60) {
					this.anIntArray101[local15 - 50] = arg0.method404();
				} else if (local15 >= 60 && local15 < 70) {
					this.anIntArray102[local15 - 60] = arg0.method404();
				} else {
					System.out.println("Error unrecognised config code: " + local15);
				}
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("99486, " + -7321 + ", " + arg0 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NRLTHETF", name = "a", descriptor = "(I)Z")
	public boolean method293() {
		try {
			if (this.anIntArray99 == null) {
				return true;
			}
			@Pc(16) boolean local16 = true;
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray99.length; local18++) {
				if (!Class6_Sub2_Sub1_Sub6.method488(this.anIntArray99[local18])) {
					local16 = false;
				}
			}
			return local16;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("1490, " + 4 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NRLTHETF", name = "a", descriptor = "(B)Lclient!WEVRTBOZ;")
	public Class6_Sub2_Sub1_Sub6 method294(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			if (this.anIntArray99 == null) {
				return null;
			}
			@Pc(26) Class6_Sub2_Sub1_Sub6[] local26 = new Class6_Sub2_Sub1_Sub6[this.anIntArray99.length];
			for (@Pc(28) int local28 = 0; local28 < this.anIntArray99.length; local28++) {
				local26[local28] = Class6_Sub2_Sub1_Sub6.method487(892, this.anIntArray99[local28]);
			}
			@Pc(53) Class6_Sub2_Sub1_Sub6 local53;
			if (local26.length == 1) {
				local53 = local26[0];
			} else {
				local53 = new Class6_Sub2_Sub1_Sub6(true, local26.length, local26);
			}
			for (@Pc(65) int local65 = 0; local65 < 6 && this.anIntArray100[local65] != 0; local65++) {
				local53.method501(this.anIntArray100[local65], this.anIntArray101[local65]);
			}
			return local53;
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("77059, " + arg0 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NRLTHETF", name = "a", descriptor = "(Z)Z")
	public boolean method295() {
		try {
			@Pc(1) boolean local1 = true;
			for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
				if (this.anIntArray102[local3] != -1 && !Class6_Sub2_Sub1_Sub6.method488(this.anIntArray102[local3])) {
					local1 = false;
				}
			}
			return local1;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("55246, " + false + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NRLTHETF", name = "b", descriptor = "(I)Lclient!WEVRTBOZ;")
	public Class6_Sub2_Sub1_Sub6 method296() {
		try {
			@Pc(4) Class6_Sub2_Sub1_Sub6[] local4 = new Class6_Sub2_Sub1_Sub6[5];
			@Pc(6) int local6 = 0;
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray102[local15] != -1) {
					local4[local6++] = Class6_Sub2_Sub1_Sub6.method487(892, this.anIntArray102[local15]);
				}
			}
			@Pc(44) Class6_Sub2_Sub1_Sub6 local44 = new Class6_Sub2_Sub1_Sub6(true, local6, local4);
			for (@Pc(46) int local46 = 0; local46 < 6 && this.anIntArray100[local46] != 0; local46++) {
				local44.method501(this.anIntArray100[local46], this.anIntArray101[local46]);
			}
			return local44;
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("17638, " + 2 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}
}
