import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pc")
public final class Class33 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
	private static int anInt843;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "[Lclient!pc;")
	public static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "Lclient!s;")
	public static Class40 aClass40_9 = new Class40(false, 30);

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
	private int anInt845;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "Lclient!nc;")
	public Class27 aClass27_2;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
	public int anInt849;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
	public int anInt850;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
	public int anInt851;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
	private int anInt846 = -1;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "[I")
	private int[] anIntArray229 = new int[6];

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "[I")
	private int[] anIntArray230 = new int[6];

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
	public int anInt847 = 128;

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
	public int anInt848 = 128;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!xb;Z)V")
	public static void method521(@OriginalArg(0) Class47 arg0) {
		try {
			@Pc(11) Class1_Sub1_Sub3 local11 = new Class1_Sub1_Sub3(-49365, arg0.method666("spotanim.dat", null));
			anInt843 = local11.method482();
			if (aClass33Array1 == null) {
				aClass33Array1 = new Class33[anInt843];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt843; local21++) {
				if (aClass33Array1[local21] == null) {
					aClass33Array1[local21] = new Class33();
				}
				aClass33Array1[local21].anInt844 = local21;
				aClass33Array1[local21].method522(local11);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("1718, " + arg0 + ", " + false + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
	private Class33() {
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!lb;Z)V")
	private void method522(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method480();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt845 = arg0.method482();
				} else if (local10 == 2) {
					this.anInt846 = arg0.method482();
					if (Class27.aClass27Array1 != null) {
						this.aClass27_2 = Class27.aClass27Array1[this.anInt846];
					}
				} else if (local10 == 4) {
					this.anInt847 = arg0.method482();
				} else if (local10 == 5) {
					this.anInt848 = arg0.method482();
				} else if (local10 == 6) {
					this.anInt849 = arg0.method482();
				} else if (local10 == 7) {
					this.anInt850 = arg0.method480();
				} else if (local10 == 8) {
					this.anInt851 = arg0.method480();
				} else if (local10 >= 40 && local10 < 50) {
					this.anIntArray229[local10 - 40] = arg0.method482();
				} else if (local10 >= 50 && local10 < 60) {
					this.anIntArray230[local10 - 50] = arg0.method482();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local10);
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("88701, " + arg0 + ", " + false + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "()Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method523() {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = (Class1_Sub1_Sub1_Sub5) aClass40_9.method591((long) this.anInt844);
		if (local6 != null) {
			return local6;
		}
		local6 = Class1_Sub1_Sub1_Sub5.method261(this.anInt845);
		if (local6 == null) {
			return null;
		}
		for (@Pc(21) int local21 = 0; local21 < 6; local21++) {
			if (this.anIntArray229[0] != 0) {
				local6.method275(this.anIntArray229[local21], this.anIntArray230[local21]);
			}
		}
		aClass40_9.method592((long) this.anInt844, local6);
		return local6;
	}
}
