import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!nc")
public final class Class27 {

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
	private static int anInt792;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "[Lclient!nc;")
	public static Class27[] aClass27Array1;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
	private static int anInt791 = -474;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
	public int anInt793;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "[I")
	public int[] anIntArray222;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "[I")
	public int[] anIntArray223;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "[I")
	public int[] anIntArray225;

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
	public int anInt801;

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
	private int anInt802;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "Z")
	private boolean aBoolean210 = false;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
	public int anInt794 = -1;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "Z")
	public boolean aBoolean211 = false;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
	public int anInt795 = 5;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public int anInt796 = -1;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	public int anInt797 = -1;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	public int anInt798 = 99;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
	public int anInt799 = -1;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
	public int anInt800 = -1;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!xb;I)V")
	public static void method499(@OriginalArg(0) Class47 arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method660("seq.dat", null), 185);
			anInt792 = local10.method476();
			if (aClass27Array1 == null) {
				aClass27Array1 = new Class27[anInt792];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt792; local26++) {
				if (aClass27Array1[local26] == null) {
					aClass27Array1[local26] = new Class27();
				}
				aClass27Array1[local26].method501(local10);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("92503, " + arg0 + ", " + -474 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	private Class27() {
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)I")
	public int method500(@OriginalArg(1) int arg0) {
		try {
			@Pc(10) int local10 = this.anIntArray224[arg0];
			if (local10 == 0) {
				@Pc(19) Class12 local19 = Class12.method303(this.anIntArray222[arg0]);
				if (local19 != null) {
					local10 = this.anIntArray224[arg0] = local19.anInt538;
				}
			}
			if (local10 == 0) {
				local10 = 1;
			}
			return local10;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("35140, " + -346 + ", " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!lb;B)V")
	private void method501(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(15) int local15 = arg0.method474();
				if (local15 == 0) {
					if (this.anInt793 == 0) {
						this.anInt793 = 1;
						this.anIntArray222 = new int[1];
						this.anIntArray222[0] = -1;
						this.anIntArray223 = new int[1];
						this.anIntArray223[0] = -1;
						this.anIntArray224 = new int[1];
						this.anIntArray224[0] = -1;
					}
					if (this.anInt799 == -1) {
						if (this.anIntArray225 == null) {
							this.anInt799 = 0;
						} else {
							this.anInt799 = 2;
						}
					}
					if (this.anInt800 == -1) {
						if (this.anIntArray225 != null) {
							this.anInt800 = 2;
							return;
						}
						this.anInt800 = 0;
						return;
					}
					return;
				}
				@Pc(42) int local42;
				if (local15 == 1) {
					this.anInt793 = arg0.method474();
					this.anIntArray222 = new int[this.anInt793];
					this.anIntArray223 = new int[this.anInt793];
					this.anIntArray224 = new int[this.anInt793];
					for (local42 = 0; local42 < this.anInt793; local42++) {
						this.anIntArray222[local42] = arg0.method476();
						this.anIntArray223[local42] = arg0.method476();
						if (this.anIntArray223[local42] == 65535) {
							this.anIntArray223[local42] = -1;
						}
						this.anIntArray224[local42] = arg0.method476();
					}
				} else if (local15 == 2) {
					this.anInt794 = arg0.method476();
				} else if (local15 == 3) {
					local42 = arg0.method474();
					this.anIntArray225 = new int[local42 + 1];
					for (@Pc(103) int local103 = 0; local103 < local42; local103++) {
						this.anIntArray225[local103] = arg0.method474();
					}
					this.anIntArray225[local42] = 9999999;
				} else if (local15 == 4) {
					this.aBoolean211 = true;
				} else if (local15 == 5) {
					this.anInt795 = arg0.method474();
				} else if (local15 == 6) {
					this.anInt796 = arg0.method476();
				} else if (local15 == 7) {
					this.anInt797 = arg0.method476();
				} else if (local15 == 8) {
					this.anInt798 = arg0.method474();
				} else if (local15 == 9) {
					this.anInt799 = arg0.method474();
				} else if (local15 == 10) {
					this.anInt800 = arg0.method474();
				} else if (local15 == 11) {
					this.anInt801 = arg0.method474();
				} else if (local15 == 12) {
					this.anInt802 = arg0.method479();
				} else {
					System.out.println("Error unrecognised seq config code: " + local15);
				}
			}
		} catch (@Pc(277) RuntimeException local277) {
			signlink.reporterror("54779, " + arg0 + ", " + 81 + ", " + local277.toString());
			throw new RuntimeException();
		}
	}
}
