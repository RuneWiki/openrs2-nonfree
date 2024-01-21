import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!nc")
public final class Class27 {

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
	private static int anInt767;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "[Lclient!nc;")
	public static Class27[] aClass27Array1;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
	public int anInt768;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "[I")
	public int[] anIntArray222;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "[I")
	public int[] anIntArray223;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "[I")
	public int[] anIntArray225;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
	public int anInt776;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "Z")
	private boolean aBoolean219 = true;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
	public int anInt769 = -1;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "Z")
	public boolean aBoolean220 = false;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
	public int anInt770 = 5;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
	public int anInt771 = -1;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public int anInt772 = -1;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	public int anInt773 = 99;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	public int anInt774 = -1;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
	public int anInt775 = -1;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!xb;)V")
	public static void method497(@OriginalArg(1) Class47 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3((byte) 3, arg0.method658("seq.dat", null));
			anInt767 = local8.method474();
			if (aClass27Array1 == null) {
				aClass27Array1 = new Class27[anInt767];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt767; local21++) {
				if (aClass27Array1[local21] == null) {
					aClass27Array1[local21] = new Class27();
				}
				aClass27Array1[local21].method499(local8);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("68477, " + 645 + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	private Class27() {
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)I")
	public int method498(@OriginalArg(1) int arg0) {
		try {
			@Pc(13) int local13 = this.anIntArray224[arg0];
			if (local13 == 0) {
				@Pc(23) Class12 local23 = Class12.method302(this.aBoolean219, this.anIntArray222[arg0]);
				if (local23 != null) {
					local13 = this.anIntArray224[arg0] = local23.anInt515;
				}
			}
			if (local13 == 0) {
				local13 = 1;
			}
			return local13;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("84326, " + 0 + ", " + arg0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!lb;I)V")
	private void method499(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(14) int local14 = arg0.method472();
				if (local14 == 0) {
					if (this.anInt768 == 0) {
						this.anInt768 = 1;
						this.anIntArray222 = new int[1];
						this.anIntArray222[0] = -1;
						this.anIntArray223 = new int[1];
						this.anIntArray223[0] = -1;
						this.anIntArray224 = new int[1];
						this.anIntArray224[0] = -1;
					}
					if (this.anInt774 == -1) {
						if (this.anIntArray225 == null) {
							this.anInt774 = 0;
						} else {
							this.anInt774 = 2;
						}
					}
					if (this.anInt775 == -1) {
						if (this.anIntArray225 != null) {
							this.anInt775 = 2;
							return;
						}
						this.anInt775 = 0;
						return;
					}
					return;
				}
				@Pc(41) int local41;
				if (local14 == 1) {
					this.anInt768 = arg0.method472();
					this.anIntArray222 = new int[this.anInt768];
					this.anIntArray223 = new int[this.anInt768];
					this.anIntArray224 = new int[this.anInt768];
					for (local41 = 0; local41 < this.anInt768; local41++) {
						this.anIntArray222[local41] = arg0.method474();
						this.anIntArray223[local41] = arg0.method474();
						if (this.anIntArray223[local41] == 65535) {
							this.anIntArray223[local41] = -1;
						}
						this.anIntArray224[local41] = arg0.method474();
					}
				} else if (local14 == 2) {
					this.anInt769 = arg0.method474();
				} else if (local14 == 3) {
					local41 = arg0.method472();
					this.anIntArray225 = new int[local41 + 1];
					for (@Pc(102) int local102 = 0; local102 < local41; local102++) {
						this.anIntArray225[local102] = arg0.method472();
					}
					this.anIntArray225[local41] = 9999999;
				} else if (local14 == 4) {
					this.aBoolean220 = true;
				} else if (local14 == 5) {
					this.anInt770 = arg0.method472();
				} else if (local14 == 6) {
					this.anInt771 = arg0.method474();
				} else if (local14 == 7) {
					this.anInt772 = arg0.method474();
				} else if (local14 == 8) {
					this.anInt773 = arg0.method472();
				} else if (local14 == 9) {
					this.anInt774 = arg0.method472();
				} else if (local14 == 10) {
					this.anInt775 = arg0.method472();
				} else if (local14 == 11) {
					this.anInt776 = arg0.method472();
				} else {
					System.out.println("Error unrecognised seq config code: " + local14);
				}
			}
		} catch (@Pc(267) RuntimeException local267) {
			signlink.reporterror("88898, " + arg0 + ", " + -32477 + ", " + local267.toString());
			throw new RuntimeException();
		}
	}
}
