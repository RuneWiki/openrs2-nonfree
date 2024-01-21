import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gc")
public final class Class13 {

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "I")
	private static int anInt331;

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "[Lclient!gc;")
	public static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "Z")
	private static boolean aBoolean95 = true;

	@OriginalMember(owner = "client!gc", name = "d", descriptor = "I")
	public int anInt332;

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "[I")
	public int[] anIntArray130;

	@OriginalMember(owner = "client!gc", name = "f", descriptor = "[I")
	public int[] anIntArray131;

	@OriginalMember(owner = "client!gc", name = "g", descriptor = "[I")
	public int[] anIntArray132;

	@OriginalMember(owner = "client!gc", name = "i", descriptor = "[I")
	public int[] anIntArray133;

	@OriginalMember(owner = "client!gc", name = "j", descriptor = "I")
	public int anInt334;

	@OriginalMember(owner = "client!gc", name = "h", descriptor = "I")
	public int anInt333 = -1;

	@OriginalMember(owner = "client!gc", name = "k", descriptor = "I")
	public int anInt335 = 5;

	@OriginalMember(owner = "client!gc", name = "l", descriptor = "I")
	public int anInt336 = -1;

	@OriginalMember(owner = "client!gc", name = "m", descriptor = "I")
	public int anInt337 = -1;

	@OriginalMember(owner = "client!gc", name = "n", descriptor = "I")
	public int anInt338 = 99;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(ZLclient!ub;)V")
	public static void method268(@OriginalArg(1) Class36 arg0) {
		try {
			@Pc(17) Class1_Sub3_Sub3 local17 = new Class1_Sub3_Sub3(arg0.method479((byte) 6, null, "seq.dat"), 4);
			anInt331 = local17.method382();
			if (aClass13Array1 == null) {
				aClass13Array1 = new Class13[anInt331];
			}
			for (@Pc(27) int local27 = 0; local27 < anInt331; local27++) {
				if (aClass13Array1[local27] == null) {
					aClass13Array1[local27] = new Class13();
				}
				aClass13Array1[local27].method269(213, local17);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("39307, " + true + ", " + arg0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "<init>", descriptor = "()V")
	private Class13() {
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(ILclient!kb;)V")
	private void method269(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			@Pc(5) boolean local5 = false;
			while (true) {
				while (true) {
					@Pc(8) int local8 = arg1.method380();
					if (local8 == 0) {
						if (this.anInt332 == 0) {
							this.anInt332 = 1;
							this.anIntArray130 = new int[1];
							this.anIntArray130[0] = -1;
							this.anIntArray131 = new int[1];
							this.anIntArray131[0] = -1;
							this.anIntArray132 = new int[1];
							this.anIntArray132[0] = -1;
							return;
						}
						return;
					}
					@Pc(35) int local35;
					if (local8 == 1) {
						this.anInt332 = arg1.method380();
						this.anIntArray130 = new int[this.anInt332];
						this.anIntArray131 = new int[this.anInt332];
						this.anIntArray132 = new int[this.anInt332];
						for (local35 = 0; local35 < this.anInt332; local35++) {
							this.anIntArray130[local35] = arg1.method382();
							this.anIntArray131[local35] = arg1.method382();
							if (this.anIntArray131[local35] == 65535) {
								this.anIntArray131[local35] = -1;
							}
							this.anIntArray132[local35] = arg1.method382();
							if (this.anIntArray132[local35] == 0) {
								this.anIntArray132[local35] = Class12.aClass12Array1[this.anIntArray130[local35]].anInt310;
							}
							if (this.anIntArray132[local35] == 0) {
								this.anIntArray132[local35] = 1;
							}
						}
					} else if (local8 == 2) {
						this.anInt333 = arg1.method382();
					} else if (local8 == 3) {
						local35 = arg1.method380();
						this.anIntArray133 = new int[local35 + 1];
						for (@Pc(122) int local122 = 0; local122 < local35; local122++) {
							this.anIntArray133[local122] = arg1.method380();
						}
						this.anIntArray133[local35] = 9999999;
					} else if (local8 == 4) {
						this.anInt334 = arg1.method382();
					} else if (local8 == 5) {
						this.anInt335 = arg1.method380();
					} else if (local8 == 6) {
						this.anInt336 = arg1.method382();
					} else if (local8 == 7) {
						this.anInt337 = arg1.method382();
					} else if (local8 == 8) {
						this.anInt338 = arg1.method380();
					} else {
						System.out.println("Error unrecognised seq config code: " + local8);
					}
				}
			}
		} catch (@Pc(232) RuntimeException local232) {
			signlink.reporterror("22221, " + arg0 + ", " + arg1 + ", " + local232.toString());
			throw new RuntimeException();
		}
	}
}
