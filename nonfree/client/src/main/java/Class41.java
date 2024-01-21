import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WOJPETNO")
public final class Class41 {

	@OriginalMember(owner = "client!WOJPETNO", name = "a", descriptor = "I")
	private static int anInt749;

	@OriginalMember(owner = "client!WOJPETNO", name = "b", descriptor = "[Lclient!WOJPETNO;")
	public static Class41[] aClass41Array1;

	@OriginalMember(owner = "client!WOJPETNO", name = "c", descriptor = "Ljava/lang/String;")
	private String aString16;

	@OriginalMember(owner = "client!WOJPETNO", name = "d", descriptor = "I")
	public int anInt750;

	@OriginalMember(owner = "client!WOJPETNO", name = "e", descriptor = "I")
	public int anInt751;

	@OriginalMember(owner = "client!WOJPETNO", name = "f", descriptor = "I")
	public int anInt752;

	@OriginalMember(owner = "client!WOJPETNO", name = "i", descriptor = "I")
	private int anInt754;

	@OriginalMember(owner = "client!WOJPETNO", name = "g", descriptor = "Z")
	private boolean aBoolean195 = false;

	@OriginalMember(owner = "client!WOJPETNO", name = "h", descriptor = "I")
	private int anInt753 = -1;

	@OriginalMember(owner = "client!WOJPETNO", name = "j", descriptor = "Z")
	private boolean aBoolean196 = true;

	@OriginalMember(owner = "client!WOJPETNO", name = "a", descriptor = "(Lclient!GWOEELWB;B)V")
	public static void method539(@OriginalArg(0) Class13 arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(10) Class3_Sub1_Sub2 local10 = new Class3_Sub1_Sub2(true, arg0.method140("varbit.dat", null));
			anInt749 = local10.method202();
			@Pc(18) boolean local18 = false;
			if (aClass41Array1 == null) {
				aClass41Array1 = new Class41[anInt749];
			}
			for (@Pc(28) int local28 = 0; local28 < anInt749; local28++) {
				if (aClass41Array1[local28] == null) {
					aClass41Array1[local28] = new Class41();
				}
				aClass41Array1[local28].method540(local28, local10);
				if (aClass41Array1[local28].aBoolean195) {
					Class17.aClass17Array1[aClass41Array1[local28].anInt750].aBoolean83 = true;
				}
			}
			if (local10.anInt429 != local10.aByteArray14.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("47208, " + arg0 + ", " + arg1 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WOJPETNO", name = "<init>", descriptor = "()V")
	private Class41() {
	}

	@OriginalMember(owner = "client!WOJPETNO", name = "a", descriptor = "(IILclient!MLYYHULT;)V")
	private void method540(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub2 arg1) {
		try {
			while (true) {
				@Pc(14) int local14 = arg1.method200();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					this.anInt750 = arg1.method202();
					this.anInt751 = arg1.method200();
					this.anInt752 = arg1.method200();
				} else if (local14 == 10) {
					this.aString16 = arg1.method207();
				} else if (local14 == 2) {
					this.aBoolean195 = true;
				} else if (local14 == 3) {
					this.anInt753 = arg1.method205();
				} else if (local14 == 4) {
					this.anInt754 = arg1.method205();
				} else if (local14 == 5) {
					this.aBoolean196 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local14);
				}
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("69239, " + 10762 + ", " + arg0 + ", " + arg1 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}
}
