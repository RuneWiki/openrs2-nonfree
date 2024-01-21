import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SFNSVANZ")
public final class Class40 {

	@OriginalMember(owner = "client!SFNSVANZ", name = "b", descriptor = "I")
	private static int anInt572;

	@OriginalMember(owner = "client!SFNSVANZ", name = "c", descriptor = "[Lclient!SFNSVANZ;")
	public static Class40[] aClass40Array1;

	@OriginalMember(owner = "client!SFNSVANZ", name = "d", descriptor = "I")
	private static int anInt573;

	@OriginalMember(owner = "client!SFNSVANZ", name = "e", descriptor = "[I")
	private static int[] anIntArray120;

	@OriginalMember(owner = "client!SFNSVANZ", name = "a", descriptor = "Z")
	private static boolean aBoolean154 = true;

	@OriginalMember(owner = "client!SFNSVANZ", name = "f", descriptor = "Ljava/lang/String;")
	private String aString15;

	@OriginalMember(owner = "client!SFNSVANZ", name = "g", descriptor = "I")
	private int anInt574;

	@OriginalMember(owner = "client!SFNSVANZ", name = "h", descriptor = "I")
	private int anInt575;

	@OriginalMember(owner = "client!SFNSVANZ", name = "k", descriptor = "I")
	public int anInt576;

	@OriginalMember(owner = "client!SFNSVANZ", name = "m", descriptor = "I")
	private int anInt577;

	@OriginalMember(owner = "client!SFNSVANZ", name = "n", descriptor = "I")
	private int anInt578;

	@OriginalMember(owner = "client!SFNSVANZ", name = "i", descriptor = "Z")
	private boolean aBoolean155 = false;

	@OriginalMember(owner = "client!SFNSVANZ", name = "j", descriptor = "Z")
	private boolean aBoolean156 = true;

	@OriginalMember(owner = "client!SFNSVANZ", name = "l", descriptor = "Z")
	private boolean aBoolean157 = false;

	@OriginalMember(owner = "client!SFNSVANZ", name = "o", descriptor = "Z")
	public boolean aBoolean158 = false;

	@OriginalMember(owner = "client!SFNSVANZ", name = "p", descriptor = "I")
	private int anInt579 = -1;

	@OriginalMember(owner = "client!SFNSVANZ", name = "q", descriptor = "Z")
	private boolean aBoolean159 = true;

	@OriginalMember(owner = "client!SFNSVANZ", name = "a", descriptor = "(Lclient!FNOQZAYQ;I)V")
	public static void method374(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(8) Class2_Sub1_Sub4 local8 = new Class2_Sub1_Sub4(arg0.method165("varp.dat", null), aBoolean154);
			anInt573 = 0;
			anInt572 = local8.method96();
			@Pc(17) int local17 = 93 / arg1;
			if (aClass40Array1 == null) {
				aClass40Array1 = new Class40[anInt572];
			}
			if (anIntArray120 == null) {
				anIntArray120 = new int[anInt572];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt572; local29++) {
				if (aClass40Array1[local29] == null) {
					aClass40Array1[local29] = new Class40();
				}
				aClass40Array1[local29].method375(local8, local29);
			}
			if (local8.anInt166 != local8.aByteArray2.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("71054, " + arg0 + ", " + arg1 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SFNSVANZ", name = "<init>", descriptor = "()V")
	private Class40() {
	}

	@OriginalMember(owner = "client!SFNSVANZ", name = "a", descriptor = "(Lclient!DNRIFKTO;IB)V")
	private void method375(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method94();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt574 = arg0.method94();
				} else if (local13 == 2) {
					this.anInt575 = arg0.method94();
				} else if (local13 == 3) {
					this.aBoolean155 = true;
					anIntArray120[anInt573++] = arg1;
				} else if (local13 == 4) {
					this.aBoolean156 = false;
				} else if (local13 == 5) {
					this.anInt576 = arg0.method96();
				} else if (local13 == 6) {
					this.aBoolean157 = true;
				} else if (local13 == 7) {
					this.anInt577 = arg0.method99();
				} else if (local13 == 8) {
					this.anInt578 = 1;
					this.aBoolean158 = true;
				} else if (local13 == 10) {
					this.aString15 = arg0.method101();
				} else if (local13 == 11) {
					this.aBoolean158 = true;
				} else if (local13 == 12) {
					this.anInt579 = arg0.method99();
				} else if (local13 == 13) {
					this.anInt578 = 2;
					this.aBoolean158 = true;
				} else if (local13 == 14) {
					this.aBoolean159 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("168, " + arg0 + ", " + arg1 + ", " + 1 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}
}
