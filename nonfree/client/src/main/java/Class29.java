import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!oc")
public final class Class29 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
	private static int anInt839;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "[Lclient!oc;")
	public static Class29[] aClass29Array1;

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "Lclient!t;")
	public static Class40 aClass40_9 = new Class40(30, (byte) 3);

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
	private int anInt840;

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
	private int anInt841;

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "Lclient!nc;")
	public Class27 aClass27_2;

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
	public int anInt845;

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
	public int anInt846;

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
	public int anInt847;

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
	private int anInt842 = -1;

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "Z")
	public boolean aBoolean187 = false;

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "[I")
	private int[] anIntArray230 = new int[6];

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "[I")
	private int[] anIntArray231 = new int[6];

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
	public int anInt843 = 128;

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
	public int anInt844 = 128;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!yb;)V")
	public static void method518(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg1.method674("spotanim.dat", null), false);
			anInt839 = local10.method498();
			@Pc(21) int local21;
			if (arg0 < 3 || arg0 > 3) {
				for (local21 = 1; local21 > 0; local21++) {
				}
			}
			if (aClass29Array1 == null) {
				aClass29Array1 = new Class29[anInt839];
			}
			for (local21 = 0; local21 < anInt839; local21++) {
				if (aClass29Array1[local21] == null) {
					aClass29Array1[local21] = new Class29();
				}
				aClass29Array1[local21].anInt840 = local21;
				aClass29Array1[local21].method519(local10);
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("59290, " + arg0 + ", " + arg1 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	private Class29() {
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZLclient!mb;)V")
	private void method519(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method496();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt841 = arg0.method498();
				} else if (local13 == 2) {
					this.anInt842 = arg0.method498();
					if (Class27.aClass27Array1 != null) {
						this.aClass27_2 = Class27.aClass27Array1[this.anInt842];
					}
				} else if (local13 == 3) {
					this.aBoolean187 = true;
				} else if (local13 == 4) {
					this.anInt843 = arg0.method498();
				} else if (local13 == 5) {
					this.anInt844 = arg0.method498();
				} else if (local13 == 6) {
					this.anInt845 = arg0.method498();
				} else if (local13 == 7) {
					this.anInt846 = arg0.method496();
				} else if (local13 == 8) {
					this.anInt847 = arg0.method496();
				} else if (local13 >= 40 && local13 < 50) {
					this.anIntArray230[local13 - 40] = arg0.method498();
				} else if (local13 >= 50 && local13 < 60) {
					this.anIntArray231[local13 - 50] = arg0.method498();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local13);
				}
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("45008, " + true + ", " + arg0 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "()Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method520() {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = (Class1_Sub1_Sub1_Sub5) aClass40_9.method637((long) this.anInt840);
		if (local6 != null) {
			return local6;
		}
		local6 = Class1_Sub1_Sub1_Sub5.method287(this.anInt841);
		if (local6 == null) {
			return null;
		}
		for (@Pc(21) int local21 = 0; local21 < 6; local21++) {
			if (this.anIntArray230[0] != 0) {
				local6.method301(this.anIntArray230[local21], this.anIntArray231[local21]);
			}
		}
		aClass40_9.method638(local6, (long) this.anInt840);
		return local6;
	}
}
