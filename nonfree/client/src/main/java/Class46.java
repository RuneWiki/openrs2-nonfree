import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XTKQUJNF")
public final class Class46 {

	@OriginalMember(owner = "client!XTKQUJNF", name = "b", descriptor = "I")
	private static int anInt758;

	@OriginalMember(owner = "client!XTKQUJNF", name = "c", descriptor = "[Lclient!XTKQUJNF;")
	public static Class46[] aClass46Array1;

	@OriginalMember(owner = "client!XTKQUJNF", name = "a", descriptor = "I")
	private static int anInt757 = 178;

	@OriginalMember(owner = "client!XTKQUJNF", name = "d", descriptor = "I")
	public int anInt759;

	@OriginalMember(owner = "client!XTKQUJNF", name = "e", descriptor = "[I")
	public int[] anIntArray194;

	@OriginalMember(owner = "client!XTKQUJNF", name = "f", descriptor = "[I")
	public int[] anIntArray195;

	@OriginalMember(owner = "client!XTKQUJNF", name = "g", descriptor = "[I")
	private int[] anIntArray196;

	@OriginalMember(owner = "client!XTKQUJNF", name = "i", descriptor = "[I")
	public int[] anIntArray197;

	@OriginalMember(owner = "client!XTKQUJNF", name = "r", descriptor = "I")
	private int anInt768;

	@OriginalMember(owner = "client!XTKQUJNF", name = "h", descriptor = "I")
	public int anInt760 = -1;

	@OriginalMember(owner = "client!XTKQUJNF", name = "j", descriptor = "Z")
	public boolean aBoolean166 = false;

	@OriginalMember(owner = "client!XTKQUJNF", name = "k", descriptor = "I")
	public int anInt761 = 5;

	@OriginalMember(owner = "client!XTKQUJNF", name = "l", descriptor = "I")
	public int anInt762 = -1;

	@OriginalMember(owner = "client!XTKQUJNF", name = "m", descriptor = "I")
	public int anInt763 = -1;

	@OriginalMember(owner = "client!XTKQUJNF", name = "n", descriptor = "I")
	public int anInt764 = 99;

	@OriginalMember(owner = "client!XTKQUJNF", name = "o", descriptor = "I")
	public int anInt765 = -1;

	@OriginalMember(owner = "client!XTKQUJNF", name = "p", descriptor = "I")
	public int anInt766 = -1;

	@OriginalMember(owner = "client!XTKQUJNF", name = "q", descriptor = "I")
	public int anInt767 = 2;

	@OriginalMember(owner = "client!XTKQUJNF", name = "a", descriptor = "(Lclient!AWEEREDT;I)V")
	public static void method485(@OriginalArg(0) Class2 arg0) {
		try {
			@Pc(8) Class8_Sub1_Sub3 local8 = new Class8_Sub1_Sub3(arg0.method14("seq.dat", null), 713);
			anInt758 = local8.method154();
			if (aClass46Array1 == null) {
				aClass46Array1 = new Class46[anInt758];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt758; local18++) {
				if (aClass46Array1[local18] == null) {
					aClass46Array1[local18] = new Class46();
				}
				aClass46Array1[local18].method487(local8, (byte) 1);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("64785, " + arg0 + ", " + 0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XTKQUJNF", name = "<init>", descriptor = "()V")
	private Class46() {
	}

	@OriginalMember(owner = "client!XTKQUJNF", name = "a", descriptor = "(IB)I")
	public int method486(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(4) int local4 = this.anIntArray196[arg0];
			@Pc(9) boolean local9 = false;
			if (local4 == 0) {
				@Pc(21) Class29 local21 = Class29.method308(this.anIntArray194[arg0]);
				if (local21 != null) {
					local4 = this.anIntArray196[arg0] = local21.anInt513;
				}
			}
			if (local4 == 0) {
				local4 = 1;
			}
			return local4;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("40656, " + arg0 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XTKQUJNF", name = "a", descriptor = "(Lclient!IUVBENCV;B)V")
	private void method487(@OriginalArg(0) Class8_Sub1_Sub3 arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
			while (true) {
				while (true) {
					@Pc(15) int local15 = arg0.method152();
					if (local15 == 0) {
						if (this.anInt759 == 0) {
							this.anInt759 = 1;
							this.anIntArray194 = new int[1];
							this.anIntArray194[0] = -1;
							this.anIntArray195 = new int[1];
							this.anIntArray195[0] = -1;
							this.anIntArray196 = new int[1];
							this.anIntArray196[0] = -1;
						}
						if (this.anInt765 == -1) {
							if (this.anIntArray197 == null) {
								this.anInt765 = 0;
							} else {
								this.anInt765 = 2;
							}
						}
						if (this.anInt766 == -1) {
							if (this.anIntArray197 != null) {
								this.anInt766 = 2;
								return;
							}
							this.anInt766 = 0;
							return;
						}
						return;
					}
					@Pc(42) int local42;
					if (local15 == 1) {
						this.anInt759 = arg0.method152();
						this.anIntArray194 = new int[this.anInt759];
						this.anIntArray195 = new int[this.anInt759];
						this.anIntArray196 = new int[this.anInt759];
						for (local42 = 0; local42 < this.anInt759; local42++) {
							this.anIntArray194[local42] = arg0.method154();
							this.anIntArray195[local42] = arg0.method154();
							if (this.anIntArray195[local42] == 65535) {
								this.anIntArray195[local42] = -1;
							}
							this.anIntArray196[local42] = arg0.method154();
						}
					} else if (local15 == 2) {
						this.anInt760 = arg0.method154();
					} else if (local15 == 3) {
						local42 = arg0.method152();
						this.anIntArray197 = new int[local42 + 1];
						for (@Pc(103) int local103 = 0; local103 < local42; local103++) {
							this.anIntArray197[local103] = arg0.method152();
						}
						this.anIntArray197[local42] = 9999999;
					} else if (local15 == 4) {
						this.aBoolean166 = true;
					} else if (local15 == 5) {
						this.anInt761 = arg0.method152();
					} else if (local15 == 6) {
						this.anInt762 = arg0.method154();
					} else if (local15 == 7) {
						this.anInt763 = arg0.method154();
					} else if (local15 == 8) {
						this.anInt764 = arg0.method152();
					} else if (local15 == 9) {
						this.anInt765 = arg0.method152();
					} else if (local15 == 10) {
						this.anInt766 = arg0.method152();
					} else if (local15 == 11) {
						this.anInt767 = arg0.method152();
					} else if (local15 == 12) {
						this.anInt768 = arg0.method157();
					} else {
						System.out.println("Error unrecognised seq config code: " + local15);
					}
				}
			}
		} catch (@Pc(277) RuntimeException local277) {
			signlink.reporterror("87108, " + arg0 + ", " + arg1 + ", " + local277.toString());
			throw new RuntimeException();
		}
	}
}
