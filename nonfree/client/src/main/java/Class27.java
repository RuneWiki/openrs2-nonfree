import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!nc")
public final class Class27 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
	private static int anInt829;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "[Lclient!nc;")
	public static Class27[] aClass27Array1;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
	public int anInt830;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "[I")
	public int[] anIntArray227;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "[I")
	public int[] anIntArray228;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "[I")
	private int[] anIntArray229;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "[I")
	public int[] anIntArray230;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
	public int anInt838;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
	public int anInt831 = -1;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "Z")
	public boolean aBoolean194 = false;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
	public int anInt832 = 5;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
	public int anInt833 = -1;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
	public int anInt834 = -1;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public int anInt835 = 99;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	public int anInt836 = -1;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	public int anInt837 = -1;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!yb;I)V")
	public static void method516(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(45427, arg0.method678("seq.dat", null));
			anInt829 = local8.method500();
			if (aClass27Array1 == null) {
				aClass27Array1 = new Class27[anInt829];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt829; local18++) {
				if (aClass27Array1[local18] == null) {
					aClass27Array1[local18] = new Class27();
				}
				aClass27Array1[local18].method518(local8);
			}
			@Pc(44) boolean local44 = false;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("30016, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	private Class27() {
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)I")
	public int method517(@OriginalArg(1) int arg0) {
		try {
			@Pc(13) int local13 = this.anIntArray229[arg0];
			if (local13 == 0) {
				@Pc(22) Class14 local22 = Class14.method327(this.anIntArray227[arg0]);
				if (local22 != null) {
					local13 = this.anIntArray229[arg0] = local22.anInt608;
				}
			}
			if (local13 == 0) {
				local13 = 1;
			}
			return local13;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("55014, " + 0 + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!mb;B)V")
	private void method518(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method498();
				if (local11 == 0) {
					if (this.anInt830 == 0) {
						this.anInt830 = 1;
						this.anIntArray227 = new int[1];
						this.anIntArray227[0] = -1;
						this.anIntArray228 = new int[1];
						this.anIntArray228[0] = -1;
						this.anIntArray229 = new int[1];
						this.anIntArray229[0] = -1;
					}
					if (this.anInt836 == -1) {
						if (this.anIntArray230 == null) {
							this.anInt836 = 0;
						} else {
							this.anInt836 = 2;
						}
					}
					if (this.anInt837 == -1) {
						if (this.anIntArray230 != null) {
							this.anInt837 = 2;
							return;
						}
						this.anInt837 = 0;
						return;
					}
					return;
				}
				@Pc(38) int local38;
				if (local11 == 1) {
					this.anInt830 = arg0.method498();
					this.anIntArray227 = new int[this.anInt830];
					this.anIntArray228 = new int[this.anInt830];
					this.anIntArray229 = new int[this.anInt830];
					for (local38 = 0; local38 < this.anInt830; local38++) {
						this.anIntArray227[local38] = arg0.method500();
						this.anIntArray228[local38] = arg0.method500();
						if (this.anIntArray228[local38] == 65535) {
							this.anIntArray228[local38] = -1;
						}
						this.anIntArray229[local38] = arg0.method500();
					}
				} else if (local11 == 2) {
					this.anInt831 = arg0.method500();
				} else if (local11 == 3) {
					local38 = arg0.method498();
					this.anIntArray230 = new int[local38 + 1];
					for (@Pc(99) int local99 = 0; local99 < local38; local99++) {
						this.anIntArray230[local99] = arg0.method498();
					}
					this.anIntArray230[local38] = 9999999;
				} else if (local11 == 4) {
					this.aBoolean194 = true;
				} else if (local11 == 5) {
					this.anInt832 = arg0.method498();
				} else if (local11 == 6) {
					this.anInt833 = arg0.method500();
				} else if (local11 == 7) {
					this.anInt834 = arg0.method500();
				} else if (local11 == 8) {
					this.anInt835 = arg0.method498();
				} else if (local11 == 9) {
					this.anInt836 = arg0.method498();
				} else if (local11 == 10) {
					this.anInt837 = arg0.method498();
				} else if (local11 == 11) {
					this.anInt838 = arg0.method498();
				} else {
					System.out.println("Error unrecognised seq config code: " + local11);
				}
			}
		} catch (@Pc(264) RuntimeException local264) {
			signlink.reporterror("21766, " + arg0 + ", " + 66 + ", " + local264.toString());
			throw new RuntimeException();
		}
	}
}
