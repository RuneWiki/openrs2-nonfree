import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EFEPEUMF")
public final class Class10 {

	@OriginalMember(owner = "client!EFEPEUMF", name = "a", descriptor = "Z")
	private static boolean aBoolean53;

	@OriginalMember(owner = "client!EFEPEUMF", name = "b", descriptor = "I")
	private static int anInt125;

	@OriginalMember(owner = "client!EFEPEUMF", name = "c", descriptor = "[Lclient!EFEPEUMF;")
	public static Class10[] aClass10Array1;

	@OriginalMember(owner = "client!EFEPEUMF", name = "d", descriptor = "Ljava/lang/String;")
	private String aString2;

	@OriginalMember(owner = "client!EFEPEUMF", name = "e", descriptor = "I")
	public int anInt126;

	@OriginalMember(owner = "client!EFEPEUMF", name = "f", descriptor = "I")
	public int anInt127;

	@OriginalMember(owner = "client!EFEPEUMF", name = "g", descriptor = "I")
	public int anInt128;

	@OriginalMember(owner = "client!EFEPEUMF", name = "j", descriptor = "I")
	private int anInt130;

	@OriginalMember(owner = "client!EFEPEUMF", name = "h", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!EFEPEUMF", name = "i", descriptor = "I")
	private int anInt129 = -1;

	@OriginalMember(owner = "client!EFEPEUMF", name = "k", descriptor = "Z")
	private boolean aBoolean55 = true;

	@OriginalMember(owner = "client!EFEPEUMF", name = "a", descriptor = "(ILclient!MAARFNGV;)V")
	public static void method81(@OriginalArg(1) Class22 arg0) {
		try {
			@Pc(8) Class2_Sub1_Sub3 local8 = new Class2_Sub1_Sub3(arg0.method218("varbit.dat", null), true);
			anInt125 = local8.method99();
			if (aClass10Array1 == null) {
				aClass10Array1 = new Class10[anInt125];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt125; local26++) {
				if (aClass10Array1[local26] == null) {
					aClass10Array1[local26] = new Class10();
				}
				aClass10Array1[local26].method82(local8, local26);
				if (aClass10Array1[local26].aBoolean54) {
					Class15.aClass15Array1[aClass10Array1[local26].anInt126].aBoolean86 = true;
				}
			}
			if (local8.anInt136 != local8.aByteArray10.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("41206, " + 0 + ", " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EFEPEUMF", name = "<init>", descriptor = "()V")
	private Class10() {
	}

	@OriginalMember(owner = "client!EFEPEUMF", name = "a", descriptor = "(ZLclient!EMWAMCXW;I)V")
	private void method82(@OriginalArg(1) Class2_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				@Pc(7) int local7 = arg0.method97();
				if (local7 == 0) {
					return;
				}
				if (local7 == 1) {
					this.anInt126 = arg0.method99();
					this.anInt127 = arg0.method97();
					this.anInt128 = arg0.method97();
				} else if (local7 == 10) {
					this.aString2 = arg0.method104();
				} else if (local7 == 2) {
					this.aBoolean54 = true;
				} else if (local7 == 3) {
					this.anInt129 = arg0.method102();
				} else if (local7 == 4) {
					this.anInt130 = arg0.method102();
				} else if (local7 == 5) {
					this.aBoolean55 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local7);
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("54609, " + false + ", " + arg0 + ", " + arg1 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}
}
