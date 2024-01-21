import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LSIUBIYU")
public final class Class23 {

	@OriginalMember(owner = "client!LSIUBIYU", name = "c", descriptor = "I")
	private static int anInt289;

	@OriginalMember(owner = "client!LSIUBIYU", name = "d", descriptor = "[Lclient!LSIUBIYU;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!LSIUBIYU", name = "e", descriptor = "I")
	private static int anInt290;

	@OriginalMember(owner = "client!LSIUBIYU", name = "f", descriptor = "[I")
	private static int[] anIntArray94;

	@OriginalMember(owner = "client!LSIUBIYU", name = "a", descriptor = "I")
	private static int anInt288 = -29917;

	@OriginalMember(owner = "client!LSIUBIYU", name = "g", descriptor = "Ljava/lang/String;")
	private String aString4;

	@OriginalMember(owner = "client!LSIUBIYU", name = "h", descriptor = "I")
	private int anInt291;

	@OriginalMember(owner = "client!LSIUBIYU", name = "i", descriptor = "I")
	private int anInt292;

	@OriginalMember(owner = "client!LSIUBIYU", name = "l", descriptor = "I")
	public int anInt293;

	@OriginalMember(owner = "client!LSIUBIYU", name = "n", descriptor = "I")
	private int anInt294;

	@OriginalMember(owner = "client!LSIUBIYU", name = "o", descriptor = "I")
	private int anInt295;

	@OriginalMember(owner = "client!LSIUBIYU", name = "b", descriptor = "Z")
	private boolean aBoolean84 = false;

	@OriginalMember(owner = "client!LSIUBIYU", name = "j", descriptor = "Z")
	private boolean aBoolean85 = false;

	@OriginalMember(owner = "client!LSIUBIYU", name = "k", descriptor = "Z")
	private boolean aBoolean86 = true;

	@OriginalMember(owner = "client!LSIUBIYU", name = "m", descriptor = "Z")
	private boolean aBoolean87 = false;

	@OriginalMember(owner = "client!LSIUBIYU", name = "p", descriptor = "Z")
	public boolean aBoolean88 = false;

	@OriginalMember(owner = "client!LSIUBIYU", name = "q", descriptor = "I")
	private int anInt296 = -1;

	@OriginalMember(owner = "client!LSIUBIYU", name = "r", descriptor = "Z")
	private boolean aBoolean89 = true;

	@OriginalMember(owner = "client!LSIUBIYU", name = "a", descriptor = "(Lclient!FUZJMGZB;I)V")
	public static void method305(@OriginalArg(0) Class13 arg0) {
		try {
			@Pc(8) Class2_Sub1_Sub3 local8 = new Class2_Sub1_Sub3((byte) 114, arg0.method186("varp.dat", null));
			anInt290 = 0;
			anInt289 = local8.method269();
			if (aClass23Array1 == null) {
				aClass23Array1 = new Class23[anInt289];
			}
			if (anIntArray94 == null) {
				anIntArray94 = new int[anInt289];
			}
			for (@Pc(33) int local33 = 0; local33 < anInt289; local33++) {
				if (aClass23Array1[local33] == null) {
					aClass23Array1[local33] = new Class23();
				}
				aClass23Array1[local33].method306(local8, local33);
			}
			if (local8.anInt283 != local8.aByteArray7.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("59951, " + arg0 + ", " + 5 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LSIUBIYU", name = "<init>", descriptor = "()V")
	private Class23() {
	}

	@OriginalMember(owner = "client!LSIUBIYU", name = "a", descriptor = "(ZLclient!LBBVYYXO;I)V")
	private void method306(@OriginalArg(1) Class2_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				@Pc(14) int local14 = arg0.method267();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					this.anInt291 = arg0.method267();
				} else if (local14 == 2) {
					this.anInt292 = arg0.method267();
				} else if (local14 == 3) {
					this.aBoolean85 = true;
					anIntArray94[anInt290++] = arg1;
				} else if (local14 == 4) {
					this.aBoolean86 = false;
				} else if (local14 == 5) {
					this.anInt293 = arg0.method269();
				} else if (local14 == 6) {
					this.aBoolean87 = true;
				} else if (local14 == 7) {
					this.anInt294 = arg0.method272();
				} else if (local14 == 8) {
					this.anInt295 = 1;
					this.aBoolean88 = true;
				} else if (local14 == 10) {
					this.aString4 = arg0.method274();
				} else if (local14 == 11) {
					this.aBoolean88 = true;
				} else if (local14 == 12) {
					this.anInt296 = arg0.method272();
				} else if (local14 == 13) {
					this.anInt295 = 2;
					this.aBoolean88 = true;
				} else if (local14 == 14) {
					this.aBoolean89 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local14);
				}
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("50616, " + false + ", " + arg0 + ", " + arg1 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}
}
