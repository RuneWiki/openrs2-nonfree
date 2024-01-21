import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!nc")
public final class Class27 {

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "Z")
	private static boolean aBoolean199;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
	private static int anInt799;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "[Lclient!nc;")
	public static Class27[] aClass27Array1;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
	public int anInt800;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "[I")
	public int[] anIntArray227;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "[I")
	public int[] anIntArray228;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "[I")
	private int[] anIntArray229;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "[I")
	public int[] anIntArray230;

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
	public int anInt808;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "Z")
	private boolean aBoolean198 = true;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
	public int anInt801 = -1;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "Z")
	public boolean aBoolean200 = false;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
	public int anInt802 = 5;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public int anInt803 = -1;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	public int anInt804 = -1;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	public int anInt805 = 99;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
	public int anInt806 = -1;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
	public int anInt807 = -1;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!yb;Z)V")
	public static void method516(@OriginalArg(0) Class48 arg0) {
		try {
			@Pc(16) Class1_Sub1_Sub3 local16 = new Class1_Sub1_Sub3(arg0.method678("seq.dat", null), 337);
			anInt799 = local16.method500();
			if (aClass27Array1 == null) {
				aClass27Array1 = new Class27[anInt799];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt799; local26++) {
				if (aClass27Array1[local26] == null) {
					aClass27Array1[local26] = new Class27();
				}
				aClass27Array1[local26].method518(local16);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("20126, " + arg0 + ", " + true + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	private Class27() {
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZ)I")
	public int method517(@OriginalArg(0) int arg0) {
		try {
			@Pc(14) int local14 = this.anIntArray229[arg0];
			if (local14 == 0) {
				@Pc(23) Class14 local23 = Class14.method327(this.anIntArray227[arg0]);
				if (local23 != null) {
					local14 = this.anIntArray229[arg0] = local23.anInt587;
				}
			}
			if (local14 == 0) {
				local14 = 1;
			}
			return local14;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("47861, " + arg0 + ", " + true + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!mb;)V")
	private void method518(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method498();
				if (local13 == 0) {
					if (this.anInt800 == 0) {
						this.anInt800 = 1;
						this.anIntArray227 = new int[1];
						this.anIntArray227[0] = -1;
						this.anIntArray228 = new int[1];
						this.anIntArray228[0] = -1;
						this.anIntArray229 = new int[1];
						this.anIntArray229[0] = -1;
					}
					if (this.anInt806 == -1) {
						if (this.anIntArray230 == null) {
							this.anInt806 = 0;
						} else {
							this.anInt806 = 2;
						}
					}
					if (this.anInt807 == -1) {
						if (this.anIntArray230 != null) {
							this.anInt807 = 2;
							return;
						}
						this.anInt807 = 0;
						return;
					}
					return;
				}
				@Pc(40) int local40;
				if (local13 == 1) {
					this.anInt800 = arg0.method498();
					this.anIntArray227 = new int[this.anInt800];
					this.anIntArray228 = new int[this.anInt800];
					this.anIntArray229 = new int[this.anInt800];
					for (local40 = 0; local40 < this.anInt800; local40++) {
						this.anIntArray227[local40] = arg0.method500();
						this.anIntArray228[local40] = arg0.method500();
						if (this.anIntArray228[local40] == 65535) {
							this.anIntArray228[local40] = -1;
						}
						this.anIntArray229[local40] = arg0.method500();
					}
				} else if (local13 == 2) {
					this.anInt801 = arg0.method500();
				} else if (local13 == 3) {
					local40 = arg0.method498();
					this.anIntArray230 = new int[local40 + 1];
					for (@Pc(101) int local101 = 0; local101 < local40; local101++) {
						this.anIntArray230[local101] = arg0.method498();
					}
					this.anIntArray230[local40] = 9999999;
				} else if (local13 == 4) {
					this.aBoolean200 = true;
				} else if (local13 == 5) {
					this.anInt802 = arg0.method498();
				} else if (local13 == 6) {
					this.anInt803 = arg0.method500();
				} else if (local13 == 7) {
					this.anInt804 = arg0.method500();
				} else if (local13 == 8) {
					this.anInt805 = arg0.method498();
				} else if (local13 == 9) {
					this.anInt806 = arg0.method498();
				} else if (local13 == 10) {
					this.anInt807 = arg0.method498();
				} else if (local13 == 11) {
					this.anInt808 = arg0.method498();
				} else {
					System.out.println("Error unrecognised seq config code: " + local13);
				}
			}
		} catch (@Pc(266) RuntimeException local266) {
			signlink.reporterror("77306, " + 0 + ", " + arg0 + ", " + local266.toString());
			throw new RuntimeException();
		}
	}
}
