import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VGXVBFVC")
public final class Class42 {

	@OriginalMember(owner = "client!VGXVBFVC", name = "c", descriptor = "I")
	private static int anInt693;

	@OriginalMember(owner = "client!VGXVBFVC", name = "d", descriptor = "[Lclient!VGXVBFVC;")
	public static Class42[] aClass42Array1;

	@OriginalMember(owner = "client!VGXVBFVC", name = "e", descriptor = "I")
	private static int anInt694;

	@OriginalMember(owner = "client!VGXVBFVC", name = "f", descriptor = "[I")
	private static int[] anIntArray149;

	@OriginalMember(owner = "client!VGXVBFVC", name = "a", descriptor = "Z")
	private static boolean aBoolean174 = true;

	@OriginalMember(owner = "client!VGXVBFVC", name = "g", descriptor = "Ljava/lang/String;")
	private String aString15;

	@OriginalMember(owner = "client!VGXVBFVC", name = "h", descriptor = "I")
	private int anInt695;

	@OriginalMember(owner = "client!VGXVBFVC", name = "i", descriptor = "I")
	private int anInt696;

	@OriginalMember(owner = "client!VGXVBFVC", name = "l", descriptor = "I")
	public int anInt697;

	@OriginalMember(owner = "client!VGXVBFVC", name = "n", descriptor = "I")
	private int anInt698;

	@OriginalMember(owner = "client!VGXVBFVC", name = "o", descriptor = "I")
	private int anInt699;

	@OriginalMember(owner = "client!VGXVBFVC", name = "b", descriptor = "I")
	private int anInt692 = -32357;

	@OriginalMember(owner = "client!VGXVBFVC", name = "j", descriptor = "Z")
	private boolean aBoolean175 = false;

	@OriginalMember(owner = "client!VGXVBFVC", name = "k", descriptor = "Z")
	private boolean aBoolean176 = true;

	@OriginalMember(owner = "client!VGXVBFVC", name = "m", descriptor = "Z")
	private boolean aBoolean177 = false;

	@OriginalMember(owner = "client!VGXVBFVC", name = "p", descriptor = "Z")
	public boolean aBoolean178 = false;

	@OriginalMember(owner = "client!VGXVBFVC", name = "q", descriptor = "I")
	private int anInt700 = -1;

	@OriginalMember(owner = "client!VGXVBFVC", name = "a", descriptor = "(ILclient!XTGLDHGX;)V")
	public static void method476(@OriginalArg(1) Class44 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method484("varp.dat", null), 891);
			anInt694 = 0;
			anInt693 = local8.method270();
			if (aClass42Array1 == null) {
				aClass42Array1 = new Class42[anInt693];
			}
			if (anIntArray149 == null) {
				anIntArray149 = new int[anInt693];
			}
			for (@Pc(25) int local25 = 0; local25 < anInt693; local25++) {
				if (aClass42Array1[local25] == null) {
					aClass42Array1[local25] = new Class42();
				}
				aClass42Array1[local25].method477(local8, local25);
			}
			if (local8.anInt468 != local8.aByteArray10.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("14989, " + 0 + ", " + arg0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VGXVBFVC", name = "<init>", descriptor = "()V")
	private Class42() {
	}

	@OriginalMember(owner = "client!VGXVBFVC", name = "a", descriptor = "(Lclient!MBMGIXGO;ZI)V")
	private void method477(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				@Pc(9) int local9 = arg0.method268();
				if (local9 == 0) {
					return;
				}
				if (local9 == 1) {
					this.anInt695 = arg0.method268();
				} else if (local9 == 2) {
					this.anInt696 = arg0.method268();
				} else if (local9 == 3) {
					this.aBoolean175 = true;
					anIntArray149[anInt694++] = arg1;
				} else if (local9 == 4) {
					this.aBoolean176 = false;
				} else if (local9 == 5) {
					this.anInt697 = arg0.method270();
				} else if (local9 == 6) {
					this.aBoolean177 = true;
				} else if (local9 == 7) {
					this.anInt698 = arg0.method273();
				} else if (local9 == 8) {
					this.anInt699 = 1;
					this.aBoolean178 = true;
				} else if (local9 == 10) {
					this.aString15 = arg0.method275();
				} else if (local9 == 11) {
					this.aBoolean178 = true;
				} else if (local9 == 12) {
					this.anInt700 = arg0.method273();
				} else if (local9 == 13) {
					this.anInt699 = 2;
				} else {
					System.out.println("Error unrecognised config code: " + local9);
				}
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("43224, " + arg0 + ", " + false + ", " + arg1 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}
}
