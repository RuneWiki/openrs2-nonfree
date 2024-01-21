import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XKEHWKFH")
public final class Class46 {

	@OriginalMember(owner = "client!XKEHWKFH", name = "b", descriptor = "I")
	private static int anInt773;

	@OriginalMember(owner = "client!XKEHWKFH", name = "c", descriptor = "I")
	private static int anInt774;

	@OriginalMember(owner = "client!XKEHWKFH", name = "d", descriptor = "[Lclient!XKEHWKFH;")
	public static Class46[] aClass46Array1;

	@OriginalMember(owner = "client!XKEHWKFH", name = "e", descriptor = "I")
	public int anInt775;

	@OriginalMember(owner = "client!XKEHWKFH", name = "f", descriptor = "[I")
	public int[] anIntArray196;

	@OriginalMember(owner = "client!XKEHWKFH", name = "g", descriptor = "[I")
	public int[] anIntArray197;

	@OriginalMember(owner = "client!XKEHWKFH", name = "h", descriptor = "[I")
	private int[] anIntArray198;

	@OriginalMember(owner = "client!XKEHWKFH", name = "j", descriptor = "[I")
	public int[] anIntArray199;

	@OriginalMember(owner = "client!XKEHWKFH", name = "s", descriptor = "I")
	private int anInt784;

	@OriginalMember(owner = "client!XKEHWKFH", name = "a", descriptor = "I")
	private int anInt772 = 16191;

	@OriginalMember(owner = "client!XKEHWKFH", name = "i", descriptor = "I")
	public int anInt776 = -1;

	@OriginalMember(owner = "client!XKEHWKFH", name = "k", descriptor = "Z")
	public boolean aBoolean198 = false;

	@OriginalMember(owner = "client!XKEHWKFH", name = "l", descriptor = "I")
	public int anInt777 = 5;

	@OriginalMember(owner = "client!XKEHWKFH", name = "m", descriptor = "I")
	public int anInt778 = -1;

	@OriginalMember(owner = "client!XKEHWKFH", name = "n", descriptor = "I")
	public int anInt779 = -1;

	@OriginalMember(owner = "client!XKEHWKFH", name = "o", descriptor = "I")
	public int anInt780 = 99;

	@OriginalMember(owner = "client!XKEHWKFH", name = "p", descriptor = "I")
	public int anInt781 = -1;

	@OriginalMember(owner = "client!XKEHWKFH", name = "q", descriptor = "I")
	public int anInt782 = -1;

	@OriginalMember(owner = "client!XKEHWKFH", name = "r", descriptor = "I")
	public int anInt783 = 2;

	@OriginalMember(owner = "client!XKEHWKFH", name = "a", descriptor = "(ILclient!SPZBTZXL;)V")
	public static void method541(@OriginalArg(1) Class35 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method491("seq.dat", null), anInt773);
			anInt774 = local8.method361();
			if (aClass46Array1 == null) {
				aClass46Array1 = new Class46[anInt774];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt774; local22++) {
				if (aClass46Array1[local22] == null) {
					aClass46Array1[local22] = new Class46();
				}
				aClass46Array1[local22].method543(local8);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("5590, " + 68 + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XKEHWKFH", name = "<init>", descriptor = "()V")
	private Class46() {
	}

	@OriginalMember(owner = "client!XKEHWKFH", name = "a", descriptor = "(IB)I")
	public int method542(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(4) int local4 = this.anIntArray198[arg0];
			@Pc(9) boolean local9 = false;
			if (local4 == 0) {
				@Pc(22) Class37 local22 = Class37.method509(this.anIntArray196[arg0]);
				if (local22 != null) {
					local4 = this.anIntArray198[arg0] = local22.anInt672;
				}
			}
			if (local4 == 0) {
				local4 = 1;
			}
			return local4;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("39988, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XKEHWKFH", name = "a", descriptor = "(Lclient!LDILQFVA;I)V")
	private void method543(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			if (this.anInt772 != 16191) {
				throw new NullPointerException();
			}
			while (true) {
				while (true) {
					@Pc(12) int local12 = arg0.method359();
					if (local12 == 0) {
						if (this.anInt775 == 0) {
							this.anInt775 = 1;
							this.anIntArray196 = new int[1];
							this.anIntArray196[0] = -1;
							this.anIntArray197 = new int[1];
							this.anIntArray197[0] = -1;
							this.anIntArray198 = new int[1];
							this.anIntArray198[0] = -1;
						}
						if (this.anInt781 == -1) {
							if (this.anIntArray199 == null) {
								this.anInt781 = 0;
							} else {
								this.anInt781 = 2;
							}
						}
						if (this.anInt782 == -1) {
							if (this.anIntArray199 != null) {
								this.anInt782 = 2;
								return;
							}
							this.anInt782 = 0;
							return;
						}
						return;
					}
					@Pc(39) int local39;
					if (local12 == 1) {
						this.anInt775 = arg0.method359();
						this.anIntArray196 = new int[this.anInt775];
						this.anIntArray197 = new int[this.anInt775];
						this.anIntArray198 = new int[this.anInt775];
						for (local39 = 0; local39 < this.anInt775; local39++) {
							this.anIntArray196[local39] = arg0.method361();
							this.anIntArray197[local39] = arg0.method361();
							if (this.anIntArray197[local39] == 65535) {
								this.anIntArray197[local39] = -1;
							}
							this.anIntArray198[local39] = arg0.method361();
						}
					} else if (local12 == 2) {
						this.anInt776 = arg0.method361();
					} else if (local12 == 3) {
						local39 = arg0.method359();
						this.anIntArray199 = new int[local39 + 1];
						for (@Pc(100) int local100 = 0; local100 < local39; local100++) {
							this.anIntArray199[local100] = arg0.method359();
						}
						this.anIntArray199[local39] = 9999999;
					} else if (local12 == 4) {
						this.aBoolean198 = true;
					} else if (local12 == 5) {
						this.anInt777 = arg0.method359();
					} else if (local12 == 6) {
						this.anInt778 = arg0.method361();
					} else if (local12 == 7) {
						this.anInt779 = arg0.method361();
					} else if (local12 == 8) {
						this.anInt780 = arg0.method359();
					} else if (local12 == 9) {
						this.anInt781 = arg0.method359();
					} else if (local12 == 10) {
						this.anInt782 = arg0.method359();
					} else if (local12 == 11) {
						this.anInt783 = arg0.method359();
					} else if (local12 == 12) {
						this.anInt784 = arg0.method364();
					} else {
						System.out.println("Error unrecognised seq config code: " + local12);
					}
				}
			}
		} catch (@Pc(274) RuntimeException local274) {
			signlink.reporterror("89612, " + arg0 + ", " + 16191 + ", " + local274.toString());
			throw new RuntimeException();
		}
	}
}
