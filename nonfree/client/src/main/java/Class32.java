import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pc")
public final class Class32 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
	private static int anInt834;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "[Lclient!pc;")
	public static Class32[] aClass32Array1;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "Lclient!t;")
	public static Class42 aClass42_9 = new Class42(0, 30);

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
	private int anInt835;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
	private int anInt836;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "Lclient!nc;")
	public Class27 aClass27_2;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
	public int anInt840;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
	public int anInt841;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
	public int anInt842;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
	private int anInt837 = -1;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "[I")
	private int[] anIntArray231 = new int[6];

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "[I")
	private int[] anIntArray232 = new int[6];

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
	public int anInt838 = 128;

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
	public int anInt839 = 128;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!yb;Z)V")
	public static void method528(@OriginalArg(0) Class48 arg0) {
		try {
			@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method678("spotanim.dat", null), 337);
			anInt834 = local19.method500();
			if (aClass32Array1 == null) {
				aClass32Array1 = new Class32[anInt834];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt834; local29++) {
				if (aClass32Array1[local29] == null) {
					aClass32Array1[local29] = new Class32();
				}
				aClass32Array1[local29].anInt835 = local29;
				aClass32Array1[local29].method529(local19);
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("53640, " + arg0 + ", " + true + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
	private Class32() {
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!mb;)V")
	private void method529(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method498();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt836 = arg0.method500();
				} else if (local13 == 2) {
					this.anInt837 = arg0.method500();
					if (Class27.aClass27Array1 != null) {
						this.aClass27_2 = Class27.aClass27Array1[this.anInt837];
					}
				} else if (local13 == 4) {
					this.anInt838 = arg0.method500();
				} else if (local13 == 5) {
					this.anInt839 = arg0.method500();
				} else if (local13 == 6) {
					this.anInt840 = arg0.method500();
				} else if (local13 == 7) {
					this.anInt841 = arg0.method498();
				} else if (local13 == 8) {
					this.anInt842 = arg0.method498();
				} else if (local13 >= 40 && local13 < 50) {
					this.anIntArray231[local13 - 40] = arg0.method500();
				} else if (local13 >= 50 && local13 < 60) {
					this.anIntArray232[local13 - 50] = arg0.method500();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local13);
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("2673, " + 0 + ", " + arg0 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "()Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method530() {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = (Class1_Sub1_Sub1_Sub5) aClass42_9.method641((long) this.anInt835);
		if (local6 != null) {
			return local6;
		}
		local6 = Class1_Sub1_Sub1_Sub5.method288(this.anInt836);
		if (local6 == null) {
			return null;
		}
		for (@Pc(21) int local21 = 0; local21 < 6; local21++) {
			if (this.anIntArray231[0] != 0) {
				local6.method302(this.anIntArray231[local21], this.anIntArray232[local21]);
			}
		}
		aClass42_9.method642((long) this.anInt835, local6);
		return local6;
	}
}
