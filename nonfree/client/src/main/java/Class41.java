import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TRINWBEO")
public final class Class41 {

	@OriginalMember(owner = "client!TRINWBEO", name = "a", descriptor = "I")
	private static int anInt651;

	@OriginalMember(owner = "client!TRINWBEO", name = "b", descriptor = "[Lclient!TRINWBEO;")
	public static Class41[] aClass41Array1;

	@OriginalMember(owner = "client!TRINWBEO", name = "c", descriptor = "I")
	private static int anInt652;

	@OriginalMember(owner = "client!TRINWBEO", name = "d", descriptor = "[I")
	private static int[] anIntArray174;

	@OriginalMember(owner = "client!TRINWBEO", name = "e", descriptor = "Ljava/lang/String;")
	private String aString13;

	@OriginalMember(owner = "client!TRINWBEO", name = "f", descriptor = "I")
	private int anInt653;

	@OriginalMember(owner = "client!TRINWBEO", name = "g", descriptor = "I")
	private int anInt654;

	@OriginalMember(owner = "client!TRINWBEO", name = "j", descriptor = "I")
	public int anInt655;

	@OriginalMember(owner = "client!TRINWBEO", name = "l", descriptor = "I")
	private int anInt656;

	@OriginalMember(owner = "client!TRINWBEO", name = "m", descriptor = "I")
	private int anInt657;

	@OriginalMember(owner = "client!TRINWBEO", name = "h", descriptor = "Z")
	private boolean aBoolean146 = false;

	@OriginalMember(owner = "client!TRINWBEO", name = "i", descriptor = "Z")
	private boolean aBoolean147 = true;

	@OriginalMember(owner = "client!TRINWBEO", name = "k", descriptor = "Z")
	private boolean aBoolean148 = false;

	@OriginalMember(owner = "client!TRINWBEO", name = "n", descriptor = "Z")
	public boolean aBoolean149 = false;

	@OriginalMember(owner = "client!TRINWBEO", name = "o", descriptor = "I")
	private int anInt658 = -1;

	@OriginalMember(owner = "client!TRINWBEO", name = "p", descriptor = "Z")
	private boolean aBoolean150 = true;

	@OriginalMember(owner = "client!TRINWBEO", name = "a", descriptor = "(Lclient!AWEEREDT;I)V")
	public static void method430(@OriginalArg(0) Class2 arg0) {
		try {
			@Pc(19) Class8_Sub1_Sub3 local19 = new Class8_Sub1_Sub3(arg0.method14("varp.dat", null), 713);
			anInt652 = 0;
			anInt651 = local19.method154();
			if (aClass41Array1 == null) {
				aClass41Array1 = new Class41[anInt651];
			}
			if (anIntArray174 == null) {
				anIntArray174 = new int[anInt651];
			}
			for (@Pc(36) int local36 = 0; local36 < anInt651; local36++) {
				if (aClass41Array1[local36] == null) {
					aClass41Array1[local36] = new Class41();
				}
				aClass41Array1[local36].method431(local19, local36);
			}
			if (local19.anInt239 != local19.aByteArray7.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("94626, " + arg0 + ", " + 0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TRINWBEO", name = "<init>", descriptor = "()V")
	private Class41() {
	}

	@OriginalMember(owner = "client!TRINWBEO", name = "a", descriptor = "(Lclient!IUVBENCV;II)V")
	private void method431(@OriginalArg(0) Class8_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			while (true) {
				@Pc(9) int local9 = arg0.method152();
				if (local9 == 0) {
					return;
				}
				if (local9 == 1) {
					this.anInt653 = arg0.method152();
				} else if (local9 == 2) {
					this.anInt654 = arg0.method152();
				} else if (local9 == 3) {
					this.aBoolean146 = true;
					anIntArray174[anInt652++] = arg1;
				} else if (local9 == 4) {
					this.aBoolean147 = false;
				} else if (local9 == 5) {
					this.anInt655 = arg0.method154();
				} else if (local9 == 6) {
					this.aBoolean148 = true;
				} else if (local9 == 7) {
					this.anInt656 = arg0.method157();
				} else if (local9 == 8) {
					this.anInt657 = 1;
					this.aBoolean149 = true;
				} else if (local9 == 10) {
					this.aString13 = arg0.method159();
				} else if (local9 == 11) {
					this.aBoolean149 = true;
				} else if (local9 == 12) {
					this.anInt658 = arg0.method157();
				} else if (local9 == 13) {
					this.anInt657 = 2;
					this.aBoolean149 = true;
				} else if (local9 == 14) {
					this.aBoolean150 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local9);
				}
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("92354, " + arg0 + ", " + arg1 + ", " + -224 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}
}
