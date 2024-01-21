import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EHPXVLSO")
public final class Class13 {

	@OriginalMember(owner = "client!EHPXVLSO", name = "a", descriptor = "I")
	private static int anInt109;

	@OriginalMember(owner = "client!EHPXVLSO", name = "b", descriptor = "[Lclient!EHPXVLSO;")
	public static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!EHPXVLSO", name = "c", descriptor = "Ljava/lang/String;")
	private String aString3;

	@OriginalMember(owner = "client!EHPXVLSO", name = "d", descriptor = "I")
	public int anInt110;

	@OriginalMember(owner = "client!EHPXVLSO", name = "e", descriptor = "I")
	public int anInt111;

	@OriginalMember(owner = "client!EHPXVLSO", name = "f", descriptor = "I")
	public int anInt112;

	@OriginalMember(owner = "client!EHPXVLSO", name = "i", descriptor = "I")
	private int anInt114;

	@OriginalMember(owner = "client!EHPXVLSO", name = "g", descriptor = "Z")
	private boolean aBoolean26 = false;

	@OriginalMember(owner = "client!EHPXVLSO", name = "h", descriptor = "I")
	private int anInt113 = -1;

	@OriginalMember(owner = "client!EHPXVLSO", name = "j", descriptor = "Z")
	private boolean aBoolean27 = true;

	@OriginalMember(owner = "client!EHPXVLSO", name = "a", descriptor = "(Lclient!AWEEREDT;I)V")
	public static void method76(@OriginalArg(0) Class2 arg0) {
		try {
			@Pc(8) Class8_Sub1_Sub3 local8 = new Class8_Sub1_Sub3(arg0.method14("varbit.dat", null), 713);
			anInt109 = local8.method154();
			if (aClass13Array1 == null) {
				aClass13Array1 = new Class13[anInt109];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt109; local21++) {
				if (aClass13Array1[local21] == null) {
					aClass13Array1[local21] = new Class13();
				}
				aClass13Array1[local21].method77(local8, local21);
				if (aClass13Array1[local21].aBoolean26) {
					Class41.aClass41Array1[aClass13Array1[local21].anInt110].aBoolean149 = true;
				}
			}
			if (local8.anInt239 != local8.aByteArray7.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("95579, " + arg0 + ", " + 0 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EHPXVLSO", name = "<init>", descriptor = "()V")
	private Class13() {
	}

	@OriginalMember(owner = "client!EHPXVLSO", name = "a", descriptor = "(Lclient!IUVBENCV;II)V")
	private void method77(@OriginalArg(0) Class8_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			while (true) {
				@Pc(7) int local7 = arg0.method152();
				if (local7 == 0) {
					return;
				}
				if (local7 == 1) {
					this.anInt110 = arg0.method154();
					this.anInt111 = arg0.method152();
					this.anInt112 = arg0.method152();
				} else if (local7 == 10) {
					this.aString3 = arg0.method159();
				} else if (local7 == 2) {
					this.aBoolean26 = true;
				} else if (local7 == 3) {
					this.anInt113 = arg0.method157();
				} else if (local7 == 4) {
					this.anInt114 = arg0.method157();
				} else if (local7 == 5) {
					this.aBoolean27 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local7);
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("30936, " + arg0 + ", " + arg1 + ", " + -224 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}
}
