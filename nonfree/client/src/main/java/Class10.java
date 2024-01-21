import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DUEJVLYB")
public final class Class10 {

	@OriginalMember(owner = "client!DUEJVLYB", name = "b", descriptor = "Z")
	private static boolean aBoolean58;

	@OriginalMember(owner = "client!DUEJVLYB", name = "c", descriptor = "I")
	private static int anInt103;

	@OriginalMember(owner = "client!DUEJVLYB", name = "d", descriptor = "[Lclient!DUEJVLYB;")
	public static Class10[] aClass10Array1;

	@OriginalMember(owner = "client!DUEJVLYB", name = "e", descriptor = "Ljava/lang/String;")
	private String aString2;

	@OriginalMember(owner = "client!DUEJVLYB", name = "f", descriptor = "I")
	public int anInt104;

	@OriginalMember(owner = "client!DUEJVLYB", name = "g", descriptor = "I")
	public int anInt105;

	@OriginalMember(owner = "client!DUEJVLYB", name = "h", descriptor = "I")
	public int anInt106;

	@OriginalMember(owner = "client!DUEJVLYB", name = "k", descriptor = "I")
	private int anInt108;

	@OriginalMember(owner = "client!DUEJVLYB", name = "a", descriptor = "B")
	private byte aByte17 = 28;

	@OriginalMember(owner = "client!DUEJVLYB", name = "i", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!DUEJVLYB", name = "j", descriptor = "I")
	private int anInt107 = -1;

	@OriginalMember(owner = "client!DUEJVLYB", name = "l", descriptor = "Z")
	private boolean aBoolean60 = true;

	@OriginalMember(owner = "client!DUEJVLYB", name = "a", descriptor = "(Lclient!SMIVAFST;I)V")
	public static void method178(@OriginalArg(0) Class35 arg0) {
		try {
			@Pc(8) Class2_Sub1_Sub2 local8 = new Class2_Sub1_Sub2(arg0.method485("varbit.dat", null), (byte) 3);
			anInt103 = local8.method96();
			if (aClass10Array1 == null) {
				aClass10Array1 = new Class10[anInt103];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt103; local18++) {
				if (aClass10Array1[local18] == null) {
					aClass10Array1[local18] = new Class10();
				}
				aClass10Array1[local18].method179(local8, local18);
				if (aClass10Array1[local18].aBoolean59) {
					Class1.aClass1Array1[aClass10Array1[local18].anInt104].aBoolean6 = true;
				}
			}
			if (local8.anInt81 != local8.aByteArray1.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("21112, " + arg0 + ", " + -29636 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DUEJVLYB", name = "<init>", descriptor = "()V")
	private Class10() {
	}

	@OriginalMember(owner = "client!DUEJVLYB", name = "a", descriptor = "(BLclient!BSNPYLEV;I)V")
	private void method179(@OriginalArg(1) Class2_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aByte17 == 28) {
				while (true) {
					@Pc(9) int local9 = arg0.method94();
					if (local9 == 0) {
						return;
					}
					if (local9 == 1) {
						this.anInt104 = arg0.method96();
						this.anInt105 = arg0.method94();
						this.anInt106 = arg0.method94();
					} else if (local9 == 10) {
						this.aString2 = arg0.method101();
					} else if (local9 == 2) {
						this.aBoolean59 = true;
					} else if (local9 == 3) {
						this.anInt107 = arg0.method99();
					} else if (local9 == 4) {
						this.anInt108 = arg0.method99();
					} else if (local9 == 5) {
						this.aBoolean60 = false;
					} else {
						System.out.println("Error unrecognised config code: " + local9);
					}
				}
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("81444, " + 28 + ", " + arg0 + ", " + arg1 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}
}
