import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NGIGHQOG")
public final class Class27 {

	@OriginalMember(owner = "client!NGIGHQOG", name = "c", descriptor = "I")
	private static int anInt480;

	@OriginalMember(owner = "client!NGIGHQOG", name = "d", descriptor = "[Lclient!NGIGHQOG;")
	public static Class27[] aClass27Array1;

	@OriginalMember(owner = "client!NGIGHQOG", name = "a", descriptor = "Z")
	private static boolean aBoolean123 = true;

	@OriginalMember(owner = "client!NGIGHQOG", name = "p", descriptor = "Lclient!RPWOWYDL;")
	public static Class37 aClass37_7 = new Class37(0, 30);

	@OriginalMember(owner = "client!NGIGHQOG", name = "e", descriptor = "I")
	private int anInt481;

	@OriginalMember(owner = "client!NGIGHQOG", name = "f", descriptor = "I")
	private int anInt482;

	@OriginalMember(owner = "client!NGIGHQOG", name = "h", descriptor = "Lclient!ZGXCNUJM;")
	public Class49 aClass49_1;

	@OriginalMember(owner = "client!NGIGHQOG", name = "m", descriptor = "I")
	public int anInt486;

	@OriginalMember(owner = "client!NGIGHQOG", name = "n", descriptor = "I")
	public int anInt487;

	@OriginalMember(owner = "client!NGIGHQOG", name = "o", descriptor = "I")
	public int anInt488;

	@OriginalMember(owner = "client!NGIGHQOG", name = "b", descriptor = "Z")
	private boolean aBoolean124 = true;

	@OriginalMember(owner = "client!NGIGHQOG", name = "g", descriptor = "I")
	private int anInt483 = -1;

	@OriginalMember(owner = "client!NGIGHQOG", name = "i", descriptor = "[I")
	private int[] anIntArray82 = new int[6];

	@OriginalMember(owner = "client!NGIGHQOG", name = "j", descriptor = "[I")
	private int[] anIntArray83 = new int[6];

	@OriginalMember(owner = "client!NGIGHQOG", name = "k", descriptor = "I")
	public int anInt484 = 128;

	@OriginalMember(owner = "client!NGIGHQOG", name = "l", descriptor = "I")
	public int anInt485 = 128;

	@OriginalMember(owner = "client!NGIGHQOG", name = "a", descriptor = "(Lclient!FNOQZAYQ;I)V")
	public static void method289(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(8) Class2_Sub1_Sub4 local8 = new Class2_Sub1_Sub4(arg0.method165("spotanim.dat", null), aBoolean123);
			anInt480 = local8.method96();
			if (aClass27Array1 == null) {
				aClass27Array1 = new Class27[anInt480];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt480; local18++) {
				if (aClass27Array1[local18] == null) {
					aClass27Array1[local18] = new Class27();
				}
				aClass27Array1[local18].anInt481 = local18;
				aClass27Array1[local18].method290(local8);
			}
			@Pc(49) int local49 = 4 / arg1;
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("76178, " + arg0 + ", " + arg1 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGIGHQOG", name = "<init>", descriptor = "()V")
	private Class27() {
	}

	@OriginalMember(owner = "client!NGIGHQOG", name = "a", descriptor = "(Lclient!DNRIFKTO;I)V")
	private void method290(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(16) int local16 = arg0.method94();
				if (local16 == 0) {
					return;
				}
				if (local16 == 1) {
					this.anInt482 = arg0.method96();
				} else if (local16 == 2) {
					this.anInt483 = arg0.method96();
					if (Class49.aClass49Array1 != null) {
						this.aClass49_1 = Class49.aClass49Array1[this.anInt483];
					}
				} else if (local16 == 4) {
					this.anInt484 = arg0.method96();
				} else if (local16 == 5) {
					this.anInt485 = arg0.method96();
				} else if (local16 == 6) {
					this.anInt486 = arg0.method96();
				} else if (local16 == 7) {
					this.anInt487 = arg0.method94();
				} else if (local16 == 8) {
					this.anInt488 = arg0.method94();
				} else if (local16 >= 40 && local16 < 50) {
					this.anIntArray82[local16 - 40] = arg0.method96();
				} else if (local16 >= 50 && local16 < 60) {
					this.anIntArray83[local16 - 50] = arg0.method96();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local16);
				}
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("93939, " + arg0 + ", " + -25 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGIGHQOG", name = "a", descriptor = "()Lclient!SNMMQNPZ;")
	public Class2_Sub1_Sub2_Sub5 method291() {
		@Pc(6) Class2_Sub1_Sub2_Sub5 local6 = (Class2_Sub1_Sub2_Sub5) aClass37_7.method363((long) this.anInt481);
		if (local6 != null) {
			return local6;
		}
		local6 = Class2_Sub1_Sub2_Sub5.method384(this.anInt482);
		if (local6 == null) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			if (this.anIntArray82[0] != 0) {
				local6.method398(this.anIntArray82[local20], this.anIntArray83[local20]);
			}
		}
		aClass37_7.method364((long) this.anInt481, local6);
		return local6;
	}
}
