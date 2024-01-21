import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MNZYLKNY")
public final class Class28 {

	@OriginalMember(owner = "client!MNZYLKNY", name = "d", descriptor = "I")
	private static int anInt434;

	@OriginalMember(owner = "client!MNZYLKNY", name = "e", descriptor = "[Lclient!MNZYLKNY;")
	public static Class28[] aClass28Array1;

	@OriginalMember(owner = "client!MNZYLKNY", name = "a", descriptor = "B")
	private static byte aByte26 = 6;

	@OriginalMember(owner = "client!MNZYLKNY", name = "b", descriptor = "Z")
	private static boolean aBoolean117 = true;

	@OriginalMember(owner = "client!MNZYLKNY", name = "q", descriptor = "Lclient!RHNYLZZL;")
	public static Class34 aClass34_5 = new Class34(30, -572);

	@OriginalMember(owner = "client!MNZYLKNY", name = "f", descriptor = "I")
	private int anInt435;

	@OriginalMember(owner = "client!MNZYLKNY", name = "g", descriptor = "I")
	private int anInt436;

	@OriginalMember(owner = "client!MNZYLKNY", name = "i", descriptor = "Lclient!FHWCLIAS;")
	public Class15 aClass15_1;

	@OriginalMember(owner = "client!MNZYLKNY", name = "n", descriptor = "I")
	public int anInt440;

	@OriginalMember(owner = "client!MNZYLKNY", name = "o", descriptor = "I")
	public int anInt441;

	@OriginalMember(owner = "client!MNZYLKNY", name = "p", descriptor = "I")
	public int anInt442;

	@OriginalMember(owner = "client!MNZYLKNY", name = "c", descriptor = "I")
	private int anInt433 = -214;

	@OriginalMember(owner = "client!MNZYLKNY", name = "h", descriptor = "I")
	private int anInt437 = -1;

	@OriginalMember(owner = "client!MNZYLKNY", name = "j", descriptor = "[I")
	private int[] anIntArray152 = new int[6];

	@OriginalMember(owner = "client!MNZYLKNY", name = "k", descriptor = "[I")
	private int[] anIntArray153 = new int[6];

	@OriginalMember(owner = "client!MNZYLKNY", name = "l", descriptor = "I")
	public int anInt438 = 128;

	@OriginalMember(owner = "client!MNZYLKNY", name = "m", descriptor = "I")
	public int anInt439 = 128;

	@OriginalMember(owner = "client!MNZYLKNY", name = "a", descriptor = "(Lclient!ATJMVOZR;I)V")
	public static void method350(@OriginalArg(0) Class2 arg0) {
		try {
			@Pc(8) Class10_Sub1_Sub3 local8 = new Class10_Sub1_Sub3(true, arg0.method2("spotanim.dat", null));
			anInt434 = local8.method313();
			if (aClass28Array1 == null) {
				aClass28Array1 = new Class28[anInt434];
			}
			for (@Pc(27) int local27 = 0; local27 < anInt434; local27++) {
				if (aClass28Array1[local27] == null) {
					aClass28Array1[local27] = new Class28();
				}
				aClass28Array1[local27].anInt435 = local27;
				aClass28Array1[local27].method351(aByte26, local8);
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("20002, " + arg0 + ", " + 36135 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNZYLKNY", name = "<init>", descriptor = "()V")
	private Class28() {
	}

	@OriginalMember(owner = "client!MNZYLKNY", name = "a", descriptor = "(BLclient!MFMVIYHT;)V")
	private void method351(@OriginalArg(0) byte arg0, @OriginalArg(1) Class10_Sub1_Sub3 arg1) {
		try {
			if (arg0 == 6) {
				@Pc(6) boolean local6 = false;
			} else {
				this.anInt433 = 458;
			}
			while (true) {
				while (true) {
					@Pc(14) int local14 = arg1.method311();
					if (local14 == 0) {
						return;
					}
					if (local14 == 1) {
						this.anInt436 = arg1.method313();
					} else if (local14 == 2) {
						this.anInt437 = arg1.method313();
						if (Class15.aClass15Array1 != null) {
							this.aClass15_1 = Class15.aClass15Array1[this.anInt437];
						}
					} else if (local14 == 4) {
						this.anInt438 = arg1.method313();
					} else if (local14 == 5) {
						this.anInt439 = arg1.method313();
					} else if (local14 == 6) {
						this.anInt440 = arg1.method313();
					} else if (local14 == 7) {
						this.anInt441 = arg1.method311();
					} else if (local14 == 8) {
						this.anInt442 = arg1.method311();
					} else if (local14 >= 40 && local14 < 50) {
						this.anIntArray152[local14 - 40] = arg1.method313();
					} else if (local14 >= 50 && local14 < 60) {
						this.anIntArray153[local14 - 50] = arg1.method313();
					} else {
						System.out.println("Error unrecognised spotanim config code: " + local14);
					}
				}
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("19263, " + arg0 + ", " + arg1 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNZYLKNY", name = "a", descriptor = "()Lclient!LZYQDKJV;")
	public Class10_Sub1_Sub2_Sub4 method352() {
		@Pc(6) Class10_Sub1_Sub2_Sub4 local6 = (Class10_Sub1_Sub2_Sub4) aClass34_5.method387((long) this.anInt435);
		if (local6 != null) {
			return local6;
		}
		local6 = Class10_Sub1_Sub2_Sub4.method271(this.anInt436);
		if (local6 == null) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			if (this.anIntArray152[0] != 0) {
				local6.method285(this.anIntArray152[local20], this.anIntArray153[local20]);
			}
		}
		aClass34_5.method388(local6, (long) this.anInt435);
		return local6;
	}
}
