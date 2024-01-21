import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!nc")
public final class Class27 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
	private static int anInt790;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "[Lclient!nc;")
	public static Class27[] aClass27Array1;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
	public int anInt791;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "[I")
	public int[] anIntArray225;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "[I")
	public int[] anIntArray226;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "[I")
	public int[] anIntArray228;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
	public int anInt799;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
	private int anInt800;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
	public int anInt792 = -1;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "Z")
	public boolean aBoolean205 = false;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
	public int anInt793 = 5;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
	public int anInt794 = -1;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
	public int anInt795 = -1;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public int anInt796 = 99;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	public int anInt797 = -1;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	public int anInt798 = -1;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!xb;I)V")
	public static void method505(@OriginalArg(0) Class47 arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method666("seq.dat", null), 58);
			anInt790 = local10.method482();
			if (aClass27Array1 == null) {
				aClass27Array1 = new Class27[anInt790];
			}
			for (@Pc(31) int local31 = 0; local31 < anInt790; local31++) {
				if (aClass27Array1[local31] == null) {
					aClass27Array1[local31] = new Class27();
				}
				aClass27Array1[local31].method507(local10, 913);
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("75910, " + arg0 + ", " + -30 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	private Class27() {
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)I")
	public int method506(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) int local4 = this.anIntArray227[arg0];
			if (local4 == 0) {
				@Pc(17) Class12 local17 = Class12.method305(this.anIntArray225[arg0]);
				if (local17 != null) {
					local4 = this.anIntArray227[arg0] = local17.anInt542;
				}
			}
			if (local4 == 0) {
				local4 = 1;
			}
			return local4;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("22142, " + arg0 + ", " + 0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!lb;I)V")
	private void method507(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			while (true) {
				while (true) {
					@Pc(8) int local8 = arg0.method480();
					if (local8 == 0) {
						if (this.anInt791 == 0) {
							this.anInt791 = 1;
							this.anIntArray225 = new int[1];
							this.anIntArray225[0] = -1;
							this.anIntArray226 = new int[1];
							this.anIntArray226[0] = -1;
							this.anIntArray227 = new int[1];
							this.anIntArray227[0] = -1;
						}
						if (this.anInt797 == -1) {
							if (this.anIntArray228 == null) {
								this.anInt797 = 0;
							} else {
								this.anInt797 = 2;
							}
						}
						if (this.anInt798 == -1) {
							if (this.anIntArray228 != null) {
								this.anInt798 = 2;
								return;
							}
							this.anInt798 = 0;
							return;
						}
						return;
					}
					@Pc(35) int local35;
					if (local8 == 1) {
						this.anInt791 = arg0.method480();
						this.anIntArray225 = new int[this.anInt791];
						this.anIntArray226 = new int[this.anInt791];
						this.anIntArray227 = new int[this.anInt791];
						for (local35 = 0; local35 < this.anInt791; local35++) {
							this.anIntArray225[local35] = arg0.method482();
							this.anIntArray226[local35] = arg0.method482();
							if (this.anIntArray226[local35] == 65535) {
								this.anIntArray226[local35] = -1;
							}
							this.anIntArray227[local35] = arg0.method482();
						}
					} else if (local8 == 2) {
						this.anInt792 = arg0.method482();
					} else if (local8 == 3) {
						local35 = arg0.method480();
						this.anIntArray228 = new int[local35 + 1];
						for (@Pc(96) int local96 = 0; local96 < local35; local96++) {
							this.anIntArray228[local96] = arg0.method480();
						}
						this.anIntArray228[local35] = 9999999;
					} else if (local8 == 4) {
						this.aBoolean205 = true;
					} else if (local8 == 5) {
						this.anInt793 = arg0.method480();
					} else if (local8 == 6) {
						this.anInt794 = arg0.method482();
					} else if (local8 == 7) {
						this.anInt795 = arg0.method482();
					} else if (local8 == 8) {
						this.anInt796 = arg0.method480();
					} else if (local8 == 9) {
						this.anInt797 = arg0.method480();
					} else if (local8 == 10) {
						this.anInt798 = arg0.method480();
					} else if (local8 == 11) {
						this.anInt799 = arg0.method480();
					} else if (local8 == 12) {
						this.anInt800 = arg0.method485();
					} else {
						System.out.println("Error unrecognised seq config code: " + local8);
					}
				}
			}
		} catch (@Pc(270) RuntimeException local270) {
			signlink.reporterror("51331, " + arg0 + ", " + arg1 + ", " + local270.toString());
			throw new RuntimeException();
		}
	}
}
