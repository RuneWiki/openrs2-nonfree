import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!nc")
public final class Class27 {

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
	private static int anInt808;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "[Lclient!nc;")
	public static Class27[] aClass27Array1;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "Lclient!t;")
	public static Class39 aClass39_9 = new Class39(false, 30);

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
	private int anInt809;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
	private int anInt810;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "Lclient!mc;")
	public Class25 aClass25_2;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public int anInt814;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	public int anInt815;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	public int anInt816;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
	private int anInt807 = 7;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
	private int anInt811 = -1;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "Z")
	public boolean aBoolean166 = false;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "[I")
	private int[] anIntArray219 = new int[6];

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "[I")
	private int[] anIntArray220 = new int[6];

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
	public int anInt812 = 128;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
	public int anInt813 = 128;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!yb;B)V")
	public static void method488(@OriginalArg(0) Class45 arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(24) Class1_Sub1_Sub3 local24 = new Class1_Sub1_Sub3(699, arg0.method639("spotanim.dat", null));
			anInt808 = local24.method469();
			if (aClass27Array1 == null) {
				aClass27Array1 = new Class27[anInt808];
			}
			for (@Pc(34) int local34 = 0; local34 < anInt808; local34++) {
				if (aClass27Array1[local34] == null) {
					aClass27Array1[local34] = new Class27();
				}
				aClass27Array1[local34].anInt809 = local34;
				aClass27Array1[local34].method489(local24);
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("98270, " + arg0 + ", " + arg1 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	private Class27() {
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLclient!mb;)V")
	private void method489(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(9) int local9 = arg0.method467();
				if (local9 == 0) {
					return;
				}
				if (local9 == 1) {
					this.anInt810 = arg0.method469();
				} else if (local9 == 2) {
					this.anInt811 = arg0.method469();
					if (Class25.aClass25Array1 != null) {
						this.aClass25_2 = Class25.aClass25Array1[this.anInt811];
					}
				} else if (local9 == 3) {
					this.aBoolean166 = true;
				} else if (local9 == 4) {
					this.anInt812 = arg0.method469();
				} else if (local9 == 5) {
					this.anInt813 = arg0.method469();
				} else if (local9 == 6) {
					this.anInt814 = arg0.method469();
				} else if (local9 == 7) {
					this.anInt815 = arg0.method467();
				} else if (local9 == 8) {
					this.anInt816 = arg0.method467();
				} else if (local9 >= 40 && local9 < 50) {
					this.anIntArray219[local9 - 40] = arg0.method469();
				} else if (local9 >= 50 && local9 < 60) {
					this.anIntArray220[local9 - 50] = arg0.method469();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local9);
				}
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("46581, " + false + ", " + arg0 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "()Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method490() {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = (Class1_Sub1_Sub1_Sub5) aClass39_9.method608((long) this.anInt809);
		if (local6 != null) {
			return local6;
		}
		local6 = Class1_Sub1_Sub1_Sub5.method278(this.anInt810);
		if (local6 == null) {
			return null;
		}
		for (@Pc(21) int local21 = 0; local21 < 6; local21++) {
			if (this.anIntArray219[0] != 0) {
				local6.method292(this.anIntArray219[local21], this.anIntArray220[local21]);
			}
		}
		aClass39_9.method609((long) this.anInt809, local6);
		return local6;
	}
}
