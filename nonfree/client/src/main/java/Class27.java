import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!nc")
public final class Class27 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
	private static int anInt794;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "[Lclient!nc;")
	public static Class27[] aClass27Array1;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
	public int anInt795;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "[I")
	public int[] anIntArray222;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "[I")
	public int[] anIntArray223;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "[I")
	public int[] anIntArray225;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
	public int anInt803;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
	public int anInt796 = -1;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "Z")
	public boolean aBoolean199 = false;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
	public int anInt797 = 5;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
	public int anInt798 = -1;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
	public int anInt799 = -1;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public int anInt800 = 99;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	public int anInt801 = -1;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	public int anInt802 = -1;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLclient!xb;)V")
	public static void method498(@OriginalArg(1) Class47 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method659("seq.dat", null), (byte) 1);
			anInt794 = local8.method475();
			if (aClass27Array1 == null) {
				aClass27Array1 = new Class27[anInt794];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt794; local21++) {
				if (aClass27Array1[local21] == null) {
					aClass27Array1[local21] = new Class27();
				}
				aClass27Array1[local21].method500((byte) 2, local8);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("97519, " + false + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	private Class27() {
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)I")
	public int method499(@OriginalArg(0) int arg0) {
		try {
			@Pc(9) int local9 = this.anIntArray224[arg0];
			if (local9 == 0) {
				@Pc(18) Class12 local18 = Class12.method303(this.anIntArray222[arg0]);
				if (local18 != null) {
					local9 = this.anIntArray224[arg0] = local18.anInt535;
				}
			}
			if (local9 == 0) {
				local9 = 1;
			}
			return local9;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("21048, " + arg0 + ", " + 41645 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLclient!lb;)V")
	private void method500(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(6) boolean local6 = false;
			while (true) {
				while (true) {
					@Pc(18) int local18 = arg1.method473();
					if (local18 == 0) {
						if (this.anInt795 == 0) {
							this.anInt795 = 1;
							this.anIntArray222 = new int[1];
							this.anIntArray222[0] = -1;
							this.anIntArray223 = new int[1];
							this.anIntArray223[0] = -1;
							this.anIntArray224 = new int[1];
							this.anIntArray224[0] = -1;
						}
						if (this.anInt801 == -1) {
							if (this.anIntArray225 == null) {
								this.anInt801 = 0;
							} else {
								this.anInt801 = 2;
							}
						}
						if (this.anInt802 == -1) {
							if (this.anIntArray225 != null) {
								this.anInt802 = 2;
								return;
							}
							this.anInt802 = 0;
							return;
						}
						return;
					}
					@Pc(45) int local45;
					if (local18 == 1) {
						this.anInt795 = arg1.method473();
						this.anIntArray222 = new int[this.anInt795];
						this.anIntArray223 = new int[this.anInt795];
						this.anIntArray224 = new int[this.anInt795];
						for (local45 = 0; local45 < this.anInt795; local45++) {
							this.anIntArray222[local45] = arg1.method475();
							this.anIntArray223[local45] = arg1.method475();
							if (this.anIntArray223[local45] == 65535) {
								this.anIntArray223[local45] = -1;
							}
							this.anIntArray224[local45] = arg1.method475();
						}
					} else if (local18 == 2) {
						this.anInt796 = arg1.method475();
					} else if (local18 == 3) {
						local45 = arg1.method473();
						this.anIntArray225 = new int[local45 + 1];
						for (@Pc(106) int local106 = 0; local106 < local45; local106++) {
							this.anIntArray225[local106] = arg1.method473();
						}
						this.anIntArray225[local45] = 9999999;
					} else if (local18 == 4) {
						this.aBoolean199 = true;
					} else if (local18 == 5) {
						this.anInt797 = arg1.method473();
					} else if (local18 == 6) {
						this.anInt798 = arg1.method475();
					} else if (local18 == 7) {
						this.anInt799 = arg1.method475();
					} else if (local18 == 8) {
						this.anInt800 = arg1.method473();
					} else if (local18 == 9) {
						this.anInt801 = arg1.method473();
					} else if (local18 == 10) {
						this.anInt802 = arg1.method473();
					} else if (local18 == 11) {
						this.anInt803 = arg1.method473();
					} else {
						System.out.println("Error unrecognised seq config code: " + local18);
					}
				}
			}
		} catch (@Pc(271) RuntimeException local271) {
			signlink.reporterror("42855, " + arg0 + ", " + arg1 + ", " + local271.toString());
			throw new RuntimeException();
		}
	}
}
