import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UIVLSYQW")
public final class Class38 {

	@OriginalMember(owner = "client!UIVLSYQW", name = "b", descriptor = "I")
	private static int anInt675;

	@OriginalMember(owner = "client!UIVLSYQW", name = "c", descriptor = "I")
	private static int anInt676;

	@OriginalMember(owner = "client!UIVLSYQW", name = "d", descriptor = "[Lclient!UIVLSYQW;")
	public static Class38[] aClass38Array1;

	@OriginalMember(owner = "client!UIVLSYQW", name = "p", descriptor = "Lclient!CZWVRQJW;")
	public static Class4 aClass4_4 = new Class4(false, 30);

	@OriginalMember(owner = "client!UIVLSYQW", name = "e", descriptor = "I")
	private int anInt677;

	@OriginalMember(owner = "client!UIVLSYQW", name = "f", descriptor = "I")
	private int anInt678;

	@OriginalMember(owner = "client!UIVLSYQW", name = "h", descriptor = "Lclient!XKEHWKFH;")
	public Class46 aClass46_2;

	@OriginalMember(owner = "client!UIVLSYQW", name = "m", descriptor = "I")
	public int anInt682;

	@OriginalMember(owner = "client!UIVLSYQW", name = "n", descriptor = "I")
	public int anInt683;

	@OriginalMember(owner = "client!UIVLSYQW", name = "o", descriptor = "I")
	public int anInt684;

	@OriginalMember(owner = "client!UIVLSYQW", name = "a", descriptor = "I")
	private int anInt674 = 16191;

	@OriginalMember(owner = "client!UIVLSYQW", name = "g", descriptor = "I")
	private int anInt679 = -1;

	@OriginalMember(owner = "client!UIVLSYQW", name = "i", descriptor = "[I")
	private int[] anIntArray150 = new int[6];

	@OriginalMember(owner = "client!UIVLSYQW", name = "j", descriptor = "[I")
	private int[] anIntArray151 = new int[6];

	@OriginalMember(owner = "client!UIVLSYQW", name = "k", descriptor = "I")
	public int anInt680 = 128;

	@OriginalMember(owner = "client!UIVLSYQW", name = "l", descriptor = "I")
	public int anInt681 = 128;

	@OriginalMember(owner = "client!UIVLSYQW", name = "a", descriptor = "(ILclient!SPZBTZXL;)V")
	public static void method511(@OriginalArg(1) Class35 arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method491("spotanim.dat", null), anInt675);
			anInt676 = local10.method361();
			if (aClass38Array1 == null) {
				aClass38Array1 = new Class38[anInt676];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt676; local29++) {
				if (aClass38Array1[local29] == null) {
					aClass38Array1[local29] = new Class38();
				}
				aClass38Array1[local29].anInt677 = local29;
				aClass38Array1[local29].method512(local10);
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("40242, " + 68 + ", " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIVLSYQW", name = "<init>", descriptor = "()V")
	private Class38() {
	}

	@OriginalMember(owner = "client!UIVLSYQW", name = "a", descriptor = "(Lclient!LDILQFVA;I)V")
	private void method512(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			if (this.anInt674 != 16191) {
				throw new NullPointerException();
			}
			while (true) {
				while (true) {
					@Pc(12) int local12 = arg0.method359();
					if (local12 == 0) {
						return;
					}
					if (local12 == 1) {
						this.anInt678 = arg0.method361();
					} else if (local12 == 2) {
						this.anInt679 = arg0.method361();
						if (Class46.aClass46Array1 != null) {
							this.aClass46_2 = Class46.aClass46Array1[this.anInt679];
						}
					} else if (local12 == 4) {
						this.anInt680 = arg0.method361();
					} else if (local12 == 5) {
						this.anInt681 = arg0.method361();
					} else if (local12 == 6) {
						this.anInt682 = arg0.method361();
					} else if (local12 == 7) {
						this.anInt683 = arg0.method359();
					} else if (local12 == 8) {
						this.anInt684 = arg0.method359();
					} else if (local12 >= 40 && local12 < 50) {
						this.anIntArray150[local12 - 40] = arg0.method361();
					} else if (local12 >= 50 && local12 < 60) {
						this.anIntArray151[local12 - 50] = arg0.method361();
					} else {
						System.out.println("Error unrecognised spotanim config code: " + local12);
					}
				}
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("43252, " + arg0 + ", " + 16191 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIVLSYQW", name = "a", descriptor = "()Lclient!HEQROJXW;")
	public Class1_Sub1_Sub1_Sub4 method513() {
		@Pc(6) Class1_Sub1_Sub1_Sub4 local6 = (Class1_Sub1_Sub1_Sub4) aClass4_4.method33((long) this.anInt677);
		if (local6 != null) {
			return local6;
		}
		local6 = Class1_Sub1_Sub1_Sub4.method270(this.anInt678);
		if (local6 == null) {
			return null;
		}
		for (@Pc(21) int local21 = 0; local21 < 6; local21++) {
			if (this.anIntArray150[0] != 0) {
				local6.method284(this.anIntArray150[local21], this.anIntArray151[local21]);
			}
		}
		aClass4_4.method34(local6, (long) this.anInt677);
		return local6;
	}
}
