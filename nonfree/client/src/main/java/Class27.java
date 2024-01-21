import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!nc")
public final class Class27 {

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
	private static int anInt815;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "[Lclient!nc;")
	public static Class27[] aClass27Array1;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "Lclient!t;")
	public static Class39 aClass39_9 = new Class39(5, 30);

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
	private int anInt816;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
	private int anInt817;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "Lclient!mc;")
	public Class25 aClass25_2;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	public int anInt821;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	public int anInt822;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
	public int anInt823;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
	private int anInt814 = -797;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "Z")
	private boolean aBoolean167 = true;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
	private int anInt818 = -1;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "Z")
	public boolean aBoolean168 = false;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "[I")
	private int[] anIntArray219 = new int[6];

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "[I")
	private int[] anIntArray220 = new int[6];

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
	public int anInt819 = 128;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public int anInt820 = 128;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!yb;I)V")
	public static void method489(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method644("spotanim.dat", null), true);
			@Pc(12) boolean local12 = false;
			anInt815 = local8.method470();
			if (aClass27Array1 == null) {
				aClass27Array1 = new Class27[anInt815];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt815; local22++) {
				if (aClass27Array1[local22] == null) {
					aClass27Array1[local22] = new Class27();
				}
				aClass27Array1[local22].anInt816 = local22;
				aClass27Array1[local22].method490(local8);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("46815, " + arg0 + ", " + arg1 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	private Class27() {
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!mb;)V")
	private void method490(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(15) int local15 = arg0.method468();
				if (local15 == 0) {
					return;
				}
				if (local15 == 1) {
					this.anInt817 = arg0.method470();
				} else if (local15 == 2) {
					this.anInt818 = arg0.method470();
					if (Class25.aClass25Array1 != null) {
						this.aClass25_2 = Class25.aClass25Array1[this.anInt818];
					}
				} else if (local15 == 3) {
					this.aBoolean168 = true;
				} else if (local15 == 4) {
					this.anInt819 = arg0.method470();
				} else if (local15 == 5) {
					this.anInt820 = arg0.method470();
				} else if (local15 == 6) {
					this.anInt821 = arg0.method470();
				} else if (local15 == 7) {
					this.anInt822 = arg0.method468();
				} else if (local15 == 8) {
					this.anInt823 = arg0.method468();
				} else if (local15 >= 40 && local15 < 50) {
					this.anIntArray219[local15 - 40] = arg0.method470();
				} else if (local15 >= 50 && local15 < 60) {
					this.anIntArray220[local15 - 50] = arg0.method470();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local15);
				}
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("4805, " + 3251 + ", " + arg0 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "()Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method491() {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = (Class1_Sub1_Sub1_Sub5) aClass39_9.method609((long) this.anInt816);
		if (local6 != null) {
			return local6;
		}
		local6 = Class1_Sub1_Sub1_Sub5.method279(this.anInt817, this.anInt814);
		if (local6 == null) {
			return null;
		}
		for (@Pc(22) int local22 = 0; local22 < 6; local22++) {
			if (this.anIntArray219[0] != 0) {
				local6.method293(this.anIntArray219[local22], this.anIntArray220[local22]);
			}
		}
		aClass39_9.method610(local6, (long) this.anInt816);
		return local6;
	}
}
