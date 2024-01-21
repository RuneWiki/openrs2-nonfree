import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TLLQKWNZ")
public final class Class42 {

	@OriginalMember(owner = "client!TLLQKWNZ", name = "a", descriptor = "I")
	private static int anInt730;

	@OriginalMember(owner = "client!TLLQKWNZ", name = "c", descriptor = "I")
	private static int anInt731;

	@OriginalMember(owner = "client!TLLQKWNZ", name = "d", descriptor = "[Lclient!TLLQKWNZ;")
	public static Class42[] aClass42Array1;

	@OriginalMember(owner = "client!TLLQKWNZ", name = "e", descriptor = "I")
	private static int anInt732;

	@OriginalMember(owner = "client!TLLQKWNZ", name = "f", descriptor = "[I")
	private static int[] anIntArray194;

	@OriginalMember(owner = "client!TLLQKWNZ", name = "g", descriptor = "Ljava/lang/String;")
	private String aString14;

	@OriginalMember(owner = "client!TLLQKWNZ", name = "h", descriptor = "I")
	private int anInt733;

	@OriginalMember(owner = "client!TLLQKWNZ", name = "i", descriptor = "I")
	private int anInt734;

	@OriginalMember(owner = "client!TLLQKWNZ", name = "l", descriptor = "I")
	public int anInt735;

	@OriginalMember(owner = "client!TLLQKWNZ", name = "n", descriptor = "I")
	private int anInt736;

	@OriginalMember(owner = "client!TLLQKWNZ", name = "o", descriptor = "I")
	private int anInt737;

	@OriginalMember(owner = "client!TLLQKWNZ", name = "b", descriptor = "Z")
	private boolean aBoolean184 = true;

	@OriginalMember(owner = "client!TLLQKWNZ", name = "j", descriptor = "Z")
	private boolean aBoolean185 = false;

	@OriginalMember(owner = "client!TLLQKWNZ", name = "k", descriptor = "Z")
	private boolean aBoolean186 = true;

	@OriginalMember(owner = "client!TLLQKWNZ", name = "m", descriptor = "Z")
	private boolean aBoolean187 = false;

	@OriginalMember(owner = "client!TLLQKWNZ", name = "p", descriptor = "Z")
	public boolean aBoolean188 = false;

	@OriginalMember(owner = "client!TLLQKWNZ", name = "q", descriptor = "I")
	private int anInt738 = -1;

	@OriginalMember(owner = "client!TLLQKWNZ", name = "r", descriptor = "Z")
	private boolean aBoolean189 = true;

	@OriginalMember(owner = "client!TLLQKWNZ", name = "a", descriptor = "(BLclient!ESUFCMYV;)V")
	public static void method467(@OriginalArg(1) Class11 arg0) {
		try {
			@Pc(8) Class6_Sub1_Sub4 local8 = new Class6_Sub1_Sub4(arg0.method89("varp.dat", null), (byte) -17);
			anInt732 = 0;
			anInt731 = local8.method413();
			if (aClass42Array1 == null) {
				aClass42Array1 = new Class42[anInt731];
			}
			if (anIntArray194 == null) {
				anIntArray194 = new int[anInt731];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt731; local29++) {
				if (aClass42Array1[local29] == null) {
					aClass42Array1[local29] = new Class42();
				}
				aClass42Array1[local29].method468(local8, local29, anInt730);
			}
			if (local8.anInt704 != local8.aByteArray17.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("10550, " + 6 + ", " + arg0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TLLQKWNZ", name = "<init>", descriptor = "()V")
	private Class42() {
	}

	@OriginalMember(owner = "client!TLLQKWNZ", name = "a", descriptor = "(Lclient!RGCGKKUR;II)V")
	private void method468(@OriginalArg(0) Class6_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 != 0) {
				this.aBoolean184 = !this.aBoolean184;
			}
			while (true) {
				@Pc(14) int local14 = arg0.method411();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					this.anInt733 = arg0.method411();
				} else if (local14 == 2) {
					this.anInt734 = arg0.method411();
				} else if (local14 == 3) {
					this.aBoolean185 = true;
					anIntArray194[anInt732++] = arg1;
				} else if (local14 == 4) {
					this.aBoolean186 = false;
				} else if (local14 == 5) {
					this.anInt735 = arg0.method413();
				} else if (local14 == 6) {
					this.aBoolean187 = true;
				} else if (local14 == 7) {
					this.anInt736 = arg0.method416();
				} else if (local14 == 8) {
					this.anInt737 = 1;
					this.aBoolean188 = true;
				} else if (local14 == 10) {
					this.aString14 = arg0.method418();
				} else if (local14 == 11) {
					this.aBoolean188 = true;
				} else if (local14 == 12) {
					this.anInt738 = arg0.method416();
				} else if (local14 == 13) {
					this.anInt737 = 2;
					this.aBoolean188 = true;
				} else if (local14 == 14) {
					this.aBoolean189 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local14);
				}
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("53794, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}
}
