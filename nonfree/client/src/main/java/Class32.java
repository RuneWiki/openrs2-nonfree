import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pc")
public final class Class32 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
	private static int anInt842;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "[Lclient!pc;")
	public static Class32[] aClass32Array1;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "Lclient!t;")
	public static Class42 aClass42_9 = new Class42((byte) 3, 30);

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
	private int anInt843;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "Lclient!nc;")
	public Class27 aClass27_2;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
	public int anInt848;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
	public int anInt849;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
	public int anInt850;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
	private int anInt845 = -1;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "[I")
	private int[] anIntArray231 = new int[6];

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "[I")
	private int[] anIntArray232 = new int[6];

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
	public int anInt846 = 128;

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
	public int anInt847 = 128;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLclient!yb;)V")
	public static void method528(@OriginalArg(1) Class48 arg0) {
		try {
			@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method678("spotanim.dat", null), (byte) 3);
			anInt842 = local19.method500();
			if (aClass32Array1 == null) {
				aClass32Array1 = new Class32[anInt842];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt842; local29++) {
				if (aClass32Array1[local29] == null) {
					aClass32Array1[local29] = new Class32();
				}
				aClass32Array1[local29].anInt843 = local29;
				aClass32Array1[local29].method529(local19);
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("26654, " + true + ", " + arg0 + ", " + local58.toString());
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
				@Pc(14) int local14 = arg0.method498();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					this.anInt844 = arg0.method500();
				} else if (local14 == 2) {
					this.anInt845 = arg0.method500();
					if (Class27.aClass27Array1 != null) {
						this.aClass27_2 = Class27.aClass27Array1[this.anInt845];
					}
				} else if (local14 == 4) {
					this.anInt846 = arg0.method500();
				} else if (local14 == 5) {
					this.anInt847 = arg0.method500();
				} else if (local14 == 6) {
					this.anInt848 = arg0.method500();
				} else if (local14 == 7) {
					this.anInt849 = arg0.method498();
				} else if (local14 == 8) {
					this.anInt850 = arg0.method498();
				} else if (local14 >= 40 && local14 < 50) {
					this.anIntArray231[local14 - 40] = arg0.method500();
				} else if (local14 >= 50 && local14 < 60) {
					this.anIntArray232[local14 - 50] = arg0.method500();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local14);
				}
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("69114, " + 9 + ", " + arg0 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "()Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method530() {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = (Class1_Sub1_Sub1_Sub5) aClass42_9.method641((long) this.anInt843);
		if (local6 != null) {
			return local6;
		}
		local6 = Class1_Sub1_Sub1_Sub5.method288(this.anInt844);
		if (local6 == null) {
			return null;
		}
		for (@Pc(21) int local21 = 0; local21 < 6; local21++) {
			if (this.anIntArray231[0] != 0) {
				local6.method302(this.anIntArray231[local21], this.anIntArray232[local21]);
			}
		}
		aClass42_9.method642(local6, (long) this.anInt843);
		return local6;
	}
}
