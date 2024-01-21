import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OZAHPBMK")
public final class Class33 {

	@OriginalMember(owner = "client!OZAHPBMK", name = "b", descriptor = "I")
	private static int anInt622;

	@OriginalMember(owner = "client!OZAHPBMK", name = "c", descriptor = "[Lclient!OZAHPBMK;")
	public static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!OZAHPBMK", name = "d", descriptor = "I")
	private static int anInt623;

	@OriginalMember(owner = "client!OZAHPBMK", name = "e", descriptor = "[I")
	private static int[] anIntArray148;

	@OriginalMember(owner = "client!OZAHPBMK", name = "f", descriptor = "Ljava/lang/String;")
	private String aString14;

	@OriginalMember(owner = "client!OZAHPBMK", name = "g", descriptor = "I")
	private int anInt624;

	@OriginalMember(owner = "client!OZAHPBMK", name = "h", descriptor = "I")
	private int anInt625;

	@OriginalMember(owner = "client!OZAHPBMK", name = "k", descriptor = "I")
	public int anInt626;

	@OriginalMember(owner = "client!OZAHPBMK", name = "m", descriptor = "I")
	private int anInt627;

	@OriginalMember(owner = "client!OZAHPBMK", name = "n", descriptor = "I")
	private int anInt628;

	@OriginalMember(owner = "client!OZAHPBMK", name = "a", descriptor = "Z")
	private boolean aBoolean159 = true;

	@OriginalMember(owner = "client!OZAHPBMK", name = "i", descriptor = "Z")
	private boolean aBoolean160 = false;

	@OriginalMember(owner = "client!OZAHPBMK", name = "j", descriptor = "Z")
	private boolean aBoolean161 = true;

	@OriginalMember(owner = "client!OZAHPBMK", name = "l", descriptor = "Z")
	private boolean aBoolean162 = false;

	@OriginalMember(owner = "client!OZAHPBMK", name = "o", descriptor = "Z")
	public boolean aBoolean163 = false;

	@OriginalMember(owner = "client!OZAHPBMK", name = "p", descriptor = "I")
	private int anInt629 = -1;

	@OriginalMember(owner = "client!OZAHPBMK", name = "q", descriptor = "Z")
	private boolean aBoolean164 = true;

	@OriginalMember(owner = "client!OZAHPBMK", name = "a", descriptor = "(Lclient!VSUYIIVA;I)V")
	public static void method413(@OriginalArg(0) Class42 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub2 local8 = new Class1_Sub1_Sub2(arg0.method539("varp.dat", null), 792);
			anInt623 = 0;
			anInt622 = local8.method61();
			if (aClass33Array1 == null) {
				aClass33Array1 = new Class33[anInt622];
			}
			if (anIntArray148 == null) {
				anIntArray148 = new int[anInt622];
			}
			for (@Pc(28) int local28 = 0; local28 < anInt622; local28++) {
				if (aClass33Array1[local28] == null) {
					aClass33Array1[local28] = new Class33();
				}
				aClass33Array1[local28].method414(local28, (byte) 5, local8);
			}
			if (local8.anInt153 != local8.aByteArray1.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("71878, " + arg0 + ", " + 236 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OZAHPBMK", name = "<init>", descriptor = "()V")
	private Class33() {
	}

	@OriginalMember(owner = "client!OZAHPBMK", name = "a", descriptor = "(IBLclient!CFARFRSG;)V")
	private void method414(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class1_Sub1_Sub2 arg2) {
		try {
			@Pc(6) boolean local6 = false;
			while (true) {
				@Pc(19) int local19 = arg2.method59();
				if (local19 == 0) {
					return;
				}
				if (local19 == 1) {
					this.anInt624 = arg2.method59();
				} else if (local19 == 2) {
					this.anInt625 = arg2.method59();
				} else if (local19 == 3) {
					this.aBoolean160 = true;
					anIntArray148[anInt623++] = arg0;
				} else if (local19 == 4) {
					this.aBoolean161 = false;
				} else if (local19 == 5) {
					this.anInt626 = arg2.method61();
				} else if (local19 == 6) {
					this.aBoolean162 = true;
				} else if (local19 == 7) {
					this.anInt627 = arg2.method64();
				} else if (local19 == 8) {
					this.anInt628 = 1;
					this.aBoolean163 = true;
				} else if (local19 == 10) {
					this.aString14 = arg2.method66();
				} else if (local19 == 11) {
					this.aBoolean163 = true;
				} else if (local19 == 12) {
					this.anInt629 = arg2.method64();
				} else if (local19 == 13) {
					this.anInt628 = 2;
					this.aBoolean163 = true;
				} else if (local19 == 14) {
					this.aBoolean164 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local19);
				}
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("26222, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}
}
