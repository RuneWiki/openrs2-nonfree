import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pc")
public final class Class32 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
	private static int anInt865;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "[Lclient!pc;")
	public static Class32[] aClass32Array1;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "Lclient!t;")
	public static Class42 aClass42_9 = new Class42(0, 30);

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
	private int anInt867;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "Lclient!nc;")
	public Class27 aClass27_2;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
	public int anInt871;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
	public int anInt872;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
	public int anInt873;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
	private int anInt868 = -1;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "[I")
	private int[] anIntArray231 = new int[6];

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "[I")
	private int[] anIntArray232 = new int[6];

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
	public int anInt869 = 128;

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
	public int anInt870 = 128;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!yb;I)V")
	public static void method528(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(45427, arg0.method678("spotanim.dat", null));
			anInt865 = local8.method500();
			@Pc(15) boolean local15 = false;
			if (aClass32Array1 == null) {
				aClass32Array1 = new Class32[anInt865];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt865; local22++) {
				if (aClass32Array1[local22] == null) {
					aClass32Array1[local22] = new Class32();
				}
				aClass32Array1[local22].anInt866 = local22;
				aClass32Array1[local22].method529(local8);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("24781, " + arg0 + ", " + arg1 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
	private Class32() {
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!mb;B)V")
	private void method529(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method498();
				if (local11 == 0) {
					return;
				}
				if (local11 == 1) {
					this.anInt867 = arg0.method500();
				} else if (local11 == 2) {
					this.anInt868 = arg0.method500();
					if (Class27.aClass27Array1 != null) {
						this.aClass27_2 = Class27.aClass27Array1[this.anInt868];
					}
				} else if (local11 == 4) {
					this.anInt869 = arg0.method500();
				} else if (local11 == 5) {
					this.anInt870 = arg0.method500();
				} else if (local11 == 6) {
					this.anInt871 = arg0.method500();
				} else if (local11 == 7) {
					this.anInt872 = arg0.method498();
				} else if (local11 == 8) {
					this.anInt873 = arg0.method498();
				} else if (local11 >= 40 && local11 < 50) {
					this.anIntArray231[local11 - 40] = arg0.method500();
				} else if (local11 >= 50 && local11 < 60) {
					this.anIntArray232[local11 - 50] = arg0.method500();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local11);
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("53702, " + arg0 + ", " + 66 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "()Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method530() {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = (Class1_Sub1_Sub1_Sub5) aClass42_9.method641((long) this.anInt866);
		if (local6 != null) {
			return local6;
		}
		local6 = Class1_Sub1_Sub1_Sub5.method288(this.anInt867);
		if (local6 == null) {
			return null;
		}
		for (@Pc(21) int local21 = 0; local21 < 6; local21++) {
			if (this.anIntArray231[0] != 0) {
				local6.method302(this.anIntArray231[local21], this.anIntArray232[local21]);
			}
		}
		aClass42_9.method642((long) this.anInt866, local6);
		return local6;
	}
}
