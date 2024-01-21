import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DPQEBGAZ")
public final class Class7 {

	@OriginalMember(owner = "client!DPQEBGAZ", name = "a", descriptor = "I")
	private static int anInt88;

	@OriginalMember(owner = "client!DPQEBGAZ", name = "b", descriptor = "I")
	private static int anInt89;

	@OriginalMember(owner = "client!DPQEBGAZ", name = "c", descriptor = "[Lclient!DPQEBGAZ;")
	public static Class7[] aClass7Array1;

	@OriginalMember(owner = "client!DPQEBGAZ", name = "d", descriptor = "Ljava/lang/String;")
	private String aString2;

	@OriginalMember(owner = "client!DPQEBGAZ", name = "e", descriptor = "I")
	public int anInt90;

	@OriginalMember(owner = "client!DPQEBGAZ", name = "f", descriptor = "I")
	public int anInt91;

	@OriginalMember(owner = "client!DPQEBGAZ", name = "g", descriptor = "I")
	public int anInt92;

	@OriginalMember(owner = "client!DPQEBGAZ", name = "j", descriptor = "I")
	private int anInt94;

	@OriginalMember(owner = "client!DPQEBGAZ", name = "h", descriptor = "Z")
	private boolean aBoolean27 = false;

	@OriginalMember(owner = "client!DPQEBGAZ", name = "i", descriptor = "I")
	private int anInt93 = -1;

	@OriginalMember(owner = "client!DPQEBGAZ", name = "k", descriptor = "Z")
	private boolean aBoolean28 = true;

	@OriginalMember(owner = "client!DPQEBGAZ", name = "a", descriptor = "(BLclient!ESUFCMYV;)V")
	public static void method86(@OriginalArg(0) byte arg0, @OriginalArg(1) Class11 arg1) {
		try {
			@Pc(10) Class6_Sub1_Sub4 local10 = new Class6_Sub1_Sub4(arg1.method89("varbit.dat", null), (byte) -17);
			@Pc(15) boolean local15 = false;
			anInt89 = local10.method413();
			if (aClass7Array1 == null) {
				aClass7Array1 = new Class7[anInt89];
			}
			for (@Pc(34) int local34 = 0; local34 < anInt89; local34++) {
				if (aClass7Array1[local34] == null) {
					aClass7Array1[local34] = new Class7();
				}
				aClass7Array1[local34].method87(local10, local34, anInt88);
				if (aClass7Array1[local34].aBoolean27) {
					Class42.aClass42Array1[aClass7Array1[local34].anInt90].aBoolean188 = true;
				}
			}
			if (local10.anInt704 != local10.aByteArray17.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("17391, " + arg0 + ", " + arg1 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DPQEBGAZ", name = "<init>", descriptor = "()V")
	private Class7() {
	}

	@OriginalMember(owner = "client!DPQEBGAZ", name = "a", descriptor = "(Lclient!RGCGKKUR;II)V")
	private void method87(@OriginalArg(0) Class6_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 == 0) {
				while (true) {
					@Pc(7) int local7 = arg0.method411();
					if (local7 == 0) {
						return;
					}
					if (local7 == 1) {
						this.anInt90 = arg0.method413();
						this.anInt91 = arg0.method411();
						this.anInt92 = arg0.method411();
					} else if (local7 == 10) {
						this.aString2 = arg0.method418();
					} else if (local7 == 2) {
						this.aBoolean27 = true;
					} else if (local7 == 3) {
						this.anInt93 = arg0.method416();
					} else if (local7 == 4) {
						this.anInt94 = arg0.method416();
					} else if (local7 == 5) {
						this.aBoolean28 = false;
					} else {
						System.out.println("Error unrecognised config code: " + local7);
					}
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("7897, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}
}
