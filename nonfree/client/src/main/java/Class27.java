import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!nc")
public final class Class27 {

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
	private static int anInt807;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "[Lclient!nc;")
	public static Class27[] aClass27Array1;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
	public int anInt808;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "[I")
	public int[] anIntArray227;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "[I")
	public int[] anIntArray228;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "[I")
	private int[] anIntArray229;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "[I")
	public int[] anIntArray230;

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
	public int anInt816;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "Z")
	private boolean aBoolean223 = true;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
	public int anInt809 = -1;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "Z")
	public boolean aBoolean225 = false;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
	public int anInt810 = 5;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public int anInt811 = -1;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	public int anInt812 = -1;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	public int anInt813 = 99;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
	public int anInt814 = -1;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
	public int anInt815 = -1;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLclient!yb;)V")
	public static void method516(@OriginalArg(1) Class48 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(16, arg0.method678("seq.dat", null));
			anInt807 = local8.method500();
			if (aClass27Array1 == null) {
				aClass27Array1 = new Class27[anInt807];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt807; local26++) {
				if (aClass27Array1[local26] == null) {
					aClass27Array1[local26] = new Class27();
				}
				aClass27Array1[local26].method518(891, local8);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("69959, " + true + ", " + arg0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	private Class27() {
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)I")
	public int method517(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(17) int local17 = this.anIntArray229[arg0];
			if (local17 == 0) {
				@Pc(27) Class14 local27 = Class14.method327(this.aBoolean223, this.anIntArray227[arg0]);
				if (local27 != null) {
					local17 = this.anIntArray229[arg0] = local27.anInt597;
				}
			}
			if (local17 == 0) {
				local17 = 1;
			}
			return local17;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("36509, " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!mb;)V")
	private void method518(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(5) boolean local5 = false;
			while (true) {
				while (true) {
					@Pc(8) int local8 = arg1.method498();
					if (local8 == 0) {
						if (this.anInt808 == 0) {
							this.anInt808 = 1;
							this.anIntArray227 = new int[1];
							this.anIntArray227[0] = -1;
							this.anIntArray228 = new int[1];
							this.anIntArray228[0] = -1;
							this.anIntArray229 = new int[1];
							this.anIntArray229[0] = -1;
						}
						if (this.anInt814 == -1) {
							if (this.anIntArray230 == null) {
								this.anInt814 = 0;
							} else {
								this.anInt814 = 2;
							}
						}
						if (this.anInt815 == -1) {
							if (this.anIntArray230 != null) {
								this.anInt815 = 2;
								return;
							}
							this.anInt815 = 0;
							return;
						}
						return;
					}
					@Pc(35) int local35;
					if (local8 == 1) {
						this.anInt808 = arg1.method498();
						this.anIntArray227 = new int[this.anInt808];
						this.anIntArray228 = new int[this.anInt808];
						this.anIntArray229 = new int[this.anInt808];
						for (local35 = 0; local35 < this.anInt808; local35++) {
							this.anIntArray227[local35] = arg1.method500();
							this.anIntArray228[local35] = arg1.method500();
							if (this.anIntArray228[local35] == 65535) {
								this.anIntArray228[local35] = -1;
							}
							this.anIntArray229[local35] = arg1.method500();
						}
					} else if (local8 == 2) {
						this.anInt809 = arg1.method500();
					} else if (local8 == 3) {
						local35 = arg1.method498();
						this.anIntArray230 = new int[local35 + 1];
						for (@Pc(96) int local96 = 0; local96 < local35; local96++) {
							this.anIntArray230[local96] = arg1.method498();
						}
						this.anIntArray230[local35] = 9999999;
					} else if (local8 == 4) {
						this.aBoolean225 = true;
					} else if (local8 == 5) {
						this.anInt810 = arg1.method498();
					} else if (local8 == 6) {
						this.anInt811 = arg1.method500();
					} else if (local8 == 7) {
						this.anInt812 = arg1.method500();
					} else if (local8 == 8) {
						this.anInt813 = arg1.method498();
					} else if (local8 == 9) {
						this.anInt814 = arg1.method498();
					} else if (local8 == 10) {
						this.anInt815 = arg1.method498();
					} else if (local8 == 11) {
						this.anInt816 = arg1.method498();
					} else {
						System.out.println("Error unrecognised seq config code: " + local8);
					}
				}
			}
		} catch (@Pc(261) RuntimeException local261) {
			signlink.reporterror("74795, " + arg0 + ", " + arg1 + ", " + local261.toString());
			throw new RuntimeException();
		}
	}
}
