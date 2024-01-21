import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pc")
public final class Class32 {

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
	private static int anInt840;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "[Lclient!pc;")
	public static Class32[] aClass32Array1;

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "Lclient!t;")
	public static Class42 aClass42_9 = new Class42(30, 0);

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
	private int anInt841;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
	private int anInt842;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Lclient!nc;")
	public Class27 aClass27_2;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
	public int anInt846;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
	public int anInt847;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
	public int anInt848;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "Z")
	private boolean aBoolean232 = true;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "B")
	private byte aByte33 = 67;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
	private int anInt843 = -1;

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "[I")
	private int[] anIntArray231 = new int[6];

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "[I")
	private int[] anIntArray232 = new int[6];

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
	public int anInt844 = 128;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
	public int anInt845 = 128;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLclient!yb;)V")
	public static void method528(@OriginalArg(1) Class48 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(16, arg0.method678("spotanim.dat", null));
			anInt840 = local8.method500();
			if (aClass32Array1 == null) {
				aClass32Array1 = new Class32[anInt840];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt840; local21++) {
				if (aClass32Array1[local21] == null) {
					aClass32Array1[local21] = new Class32();
				}
				aClass32Array1[local21].anInt841 = local21;
				aClass32Array1[local21].method529(891, local8);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("41045, " + true + ", " + arg0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
	private Class32() {
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!mb;)V")
	private void method529(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(5) boolean local5 = false;
			while (true) {
				while (true) {
					@Pc(8) int local8 = arg1.method498();
					if (local8 == 0) {
						return;
					}
					if (local8 == 1) {
						this.anInt842 = arg1.method500();
					} else if (local8 == 2) {
						this.anInt843 = arg1.method500();
						if (Class27.aClass27Array1 != null) {
							this.aClass27_2 = Class27.aClass27Array1[this.anInt843];
						}
					} else if (local8 == 4) {
						this.anInt844 = arg1.method500();
					} else if (local8 == 5) {
						this.anInt845 = arg1.method500();
					} else if (local8 == 6) {
						this.anInt846 = arg1.method500();
					} else if (local8 == 7) {
						this.anInt847 = arg1.method498();
					} else if (local8 == 8) {
						this.anInt848 = arg1.method498();
					} else if (local8 >= 40 && local8 < 50) {
						this.anIntArray231[local8 - 40] = arg1.method500();
					} else if (local8 >= 50 && local8 < 60) {
						this.anIntArray232[local8 - 50] = arg1.method500();
					} else {
						System.out.println("Error unrecognised spotanim config code: " + local8);
					}
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("29345, " + arg0 + ", " + arg1 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "()Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method530() {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = (Class1_Sub1_Sub1_Sub5) aClass42_9.method641((long) this.anInt841);
		if (local6 != null) {
			return local6;
		}
		local6 = Class1_Sub1_Sub1_Sub5.method288(this.aBoolean232, this.anInt842);
		if (local6 == null) {
			return null;
		}
		for (@Pc(22) int local22 = 0; local22 < 6; local22++) {
			if (this.anIntArray231[0] != 0) {
				local6.method302(this.anIntArray231[local22], this.anIntArray232[local22]);
			}
		}
		aClass42_9.method642(local6, (long) this.anInt841, this.aByte33);
		return local6;
	}
}
