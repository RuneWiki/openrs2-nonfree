import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PHXJLMVH")
public final class Class31 {

	@OriginalMember(owner = "client!PHXJLMVH", name = "b", descriptor = "I")
	private static int anInt426;

	@OriginalMember(owner = "client!PHXJLMVH", name = "c", descriptor = "[Lclient!PHXJLMVH;")
	public static Class31[] aClass31Array1;

	@OriginalMember(owner = "client!PHXJLMVH", name = "o", descriptor = "Lclient!ULDYKUPK;")
	public static Class42 aClass42_4 = new Class42(30, 0);

	@OriginalMember(owner = "client!PHXJLMVH", name = "d", descriptor = "I")
	private int anInt427;

	@OriginalMember(owner = "client!PHXJLMVH", name = "e", descriptor = "I")
	private int anInt428;

	@OriginalMember(owner = "client!PHXJLMVH", name = "g", descriptor = "Lclient!KYGPROVJ;")
	public Class21 aClass21_2;

	@OriginalMember(owner = "client!PHXJLMVH", name = "l", descriptor = "I")
	public int anInt432;

	@OriginalMember(owner = "client!PHXJLMVH", name = "m", descriptor = "I")
	public int anInt433;

	@OriginalMember(owner = "client!PHXJLMVH", name = "n", descriptor = "I")
	public int anInt434;

	@OriginalMember(owner = "client!PHXJLMVH", name = "a", descriptor = "Z")
	private boolean aBoolean133 = true;

	@OriginalMember(owner = "client!PHXJLMVH", name = "f", descriptor = "I")
	private int anInt429 = -1;

	@OriginalMember(owner = "client!PHXJLMVH", name = "h", descriptor = "[I")
	private int[] anIntArray133 = new int[6];

	@OriginalMember(owner = "client!PHXJLMVH", name = "i", descriptor = "[I")
	private int[] anIntArray134 = new int[6];

	@OriginalMember(owner = "client!PHXJLMVH", name = "j", descriptor = "I")
	public int anInt430 = 128;

	@OriginalMember(owner = "client!PHXJLMVH", name = "k", descriptor = "I")
	public int anInt431 = 128;

	@OriginalMember(owner = "client!PHXJLMVH", name = "a", descriptor = "(Lclient!RSPRYUFS;I)V")
	public static void method335(@OriginalArg(0) Class37 arg0) {
		try {
			@Pc(10) Class6_Sub2_Sub3 local10 = new Class6_Sub2_Sub3(-587, arg0.method358("spotanim.dat", null));
			anInt426 = local10.method264();
			if (aClass31Array1 == null) {
				aClass31Array1 = new Class31[anInt426];
			}
			for (@Pc(20) int local20 = 0; local20 < anInt426; local20++) {
				if (aClass31Array1[local20] == null) {
					aClass31Array1[local20] = new Class31();
				}
				aClass31Array1[local20].anInt427 = local20;
				aClass31Array1[local20].method336((byte) 6, local10);
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("56749, " + arg0 + ", " + -332 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PHXJLMVH", name = "<init>", descriptor = "()V")
	private Class31() {
	}

	@OriginalMember(owner = "client!PHXJLMVH", name = "a", descriptor = "(BLclient!NQUAUMDT;)V")
	private void method336(@OriginalArg(0) byte arg0, @OriginalArg(1) Class6_Sub2_Sub3 arg1) {
		try {
			@Pc(6) boolean local6 = false;
			while (true) {
				while (true) {
					@Pc(19) int local19 = arg1.method262();
					if (local19 == 0) {
						return;
					}
					if (local19 == 1) {
						this.anInt428 = arg1.method264();
					} else if (local19 == 2) {
						this.anInt429 = arg1.method264();
						if (Class21.aClass21Array1 != null) {
							this.aClass21_2 = Class21.aClass21Array1[this.anInt429];
						}
					} else if (local19 == 4) {
						this.anInt430 = arg1.method264();
					} else if (local19 == 5) {
						this.anInt431 = arg1.method264();
					} else if (local19 == 6) {
						this.anInt432 = arg1.method264();
					} else if (local19 == 7) {
						this.anInt433 = arg1.method262();
					} else if (local19 == 8) {
						this.anInt434 = arg1.method262();
					} else if (local19 >= 40 && local19 < 50) {
						this.anIntArray133[local19 - 40] = arg1.method264();
					} else if (local19 >= 50 && local19 < 60) {
						this.anIntArray134[local19 - 50] = arg1.method264();
					} else {
						System.out.println("Error unrecognised spotanim config code: " + local19);
					}
				}
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("49964, " + arg0 + ", " + arg1 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PHXJLMVH", name = "a", descriptor = "()Lclient!JUQSYEMB;")
	public Class6_Sub2_Sub1_Sub3 method337() {
		@Pc(6) Class6_Sub2_Sub1_Sub3 local6 = (Class6_Sub2_Sub1_Sub3) aClass42_4.method453((long) this.anInt427);
		if (local6 != null) {
			return local6;
		}
		local6 = Class6_Sub2_Sub1_Sub3.method133(this.anInt428);
		if (local6 == null) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			if (this.anIntArray133[0] != 0) {
				local6.method147(this.anIntArray133[local20], this.anIntArray134[local20]);
			}
		}
		aClass42_4.method454((long) this.anInt427, local6);
		return local6;
	}
}
