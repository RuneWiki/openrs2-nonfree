import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VKMARKYY")
public final class Class43 {

	@OriginalMember(owner = "client!VKMARKYY", name = "a", descriptor = "Z")
	private static boolean aBoolean147;

	@OriginalMember(owner = "client!VKMARKYY", name = "d", descriptor = "I")
	private static int anInt644;

	@OriginalMember(owner = "client!VKMARKYY", name = "e", descriptor = "[Lclient!VKMARKYY;")
	public static Class43[] aClass43Array1;

	@OriginalMember(owner = "client!VKMARKYY", name = "c", descriptor = "Z")
	private static boolean aBoolean149 = true;

	@OriginalMember(owner = "client!VKMARKYY", name = "f", descriptor = "Ljava/lang/String;")
	private String aString14;

	@OriginalMember(owner = "client!VKMARKYY", name = "g", descriptor = "I")
	public int anInt645;

	@OriginalMember(owner = "client!VKMARKYY", name = "h", descriptor = "I")
	public int anInt646;

	@OriginalMember(owner = "client!VKMARKYY", name = "i", descriptor = "I")
	public int anInt647;

	@OriginalMember(owner = "client!VKMARKYY", name = "l", descriptor = "I")
	private int anInt649;

	@OriginalMember(owner = "client!VKMARKYY", name = "b", descriptor = "Z")
	private boolean aBoolean148 = false;

	@OriginalMember(owner = "client!VKMARKYY", name = "j", descriptor = "Z")
	private boolean aBoolean150 = false;

	@OriginalMember(owner = "client!VKMARKYY", name = "k", descriptor = "I")
	private int anInt648 = -1;

	@OriginalMember(owner = "client!VKMARKYY", name = "m", descriptor = "Z")
	private boolean aBoolean151 = true;

	@OriginalMember(owner = "client!VKMARKYY", name = "a", descriptor = "(BLclient!RPFMUSNN;)V")
	public static void method434(@OriginalArg(1) Class35 arg0) {
		try {
			@Pc(8) Class3_Sub1_Sub4 local8 = new Class3_Sub1_Sub4((byte) -58, arg0.method341("varbit.dat", null));
			anInt644 = local8.method460();
			if (aClass43Array1 == null) {
				aClass43Array1 = new Class43[anInt644];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt644; local18++) {
				if (aClass43Array1[local18] == null) {
					aClass43Array1[local18] = new Class43();
				}
				aClass43Array1[local18].method435(local18, local8, aBoolean149);
				if (aClass43Array1[local18].aBoolean150) {
					Class37.aClass37Array1[aClass43Array1[local18].anInt645].aBoolean121 = true;
				}
			}
			if (local8.anInt666 != local8.aByteArray20.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("64012, " + -114 + ", " + arg0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VKMARKYY", name = "<init>", descriptor = "()V")
	private Class43() {
	}

	@OriginalMember(owner = "client!VKMARKYY", name = "a", descriptor = "(ILclient!WNCFPLWV;Z)V")
	private void method435(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub4 arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (!arg2) {
				this.aBoolean148 = !this.aBoolean148;
			}
			while (true) {
				@Pc(14) int local14 = arg1.method458();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					this.anInt645 = arg1.method460();
					this.anInt646 = arg1.method458();
					this.anInt647 = arg1.method458();
				} else if (local14 == 10) {
					this.aString14 = arg1.method465();
				} else if (local14 == 2) {
					this.aBoolean150 = true;
				} else if (local14 == 3) {
					this.anInt648 = arg1.method463();
				} else if (local14 == 4) {
					this.anInt649 = arg1.method463();
				} else if (local14 == 5) {
					this.aBoolean151 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local14);
				}
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("55435, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}
}
