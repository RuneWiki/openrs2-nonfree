import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZIUDVZAI")
public final class Class50 {

	@OriginalMember(owner = "client!ZIUDVZAI", name = "a", descriptor = "I")
	private static int anInt823;

	@OriginalMember(owner = "client!ZIUDVZAI", name = "b", descriptor = "[Lclient!ZIUDVZAI;")
	public static Class50[] aClass50Array1;

	@OriginalMember(owner = "client!ZIUDVZAI", name = "c", descriptor = "Ljava/lang/String;")
	private String aString16;

	@OriginalMember(owner = "client!ZIUDVZAI", name = "d", descriptor = "I")
	public int anInt824;

	@OriginalMember(owner = "client!ZIUDVZAI", name = "e", descriptor = "I")
	public int anInt825;

	@OriginalMember(owner = "client!ZIUDVZAI", name = "f", descriptor = "I")
	public int anInt826;

	@OriginalMember(owner = "client!ZIUDVZAI", name = "i", descriptor = "I")
	private int anInt828;

	@OriginalMember(owner = "client!ZIUDVZAI", name = "g", descriptor = "Z")
	private boolean aBoolean186 = false;

	@OriginalMember(owner = "client!ZIUDVZAI", name = "h", descriptor = "I")
	private int anInt827 = -1;

	@OriginalMember(owner = "client!ZIUDVZAI", name = "a", descriptor = "(ZLclient!XRWUKRPO;)V")
	public static void method565(@OriginalArg(1) Class45 arg0) {
		try {
			@Pc(8) Class8_Sub1_Sub3 local8 = new Class8_Sub1_Sub3(arg0.method553("varbit.dat", null), -49015);
			anInt823 = local8.method167();
			if (aClass50Array1 == null) {
				aClass50Array1 = new Class50[anInt823];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt823; local21++) {
				if (aClass50Array1[local21] == null) {
					aClass50Array1[local21] = new Class50();
				}
				aClass50Array1[local21].method566(local21, local8);
				if (aClass50Array1[local21].aBoolean186) {
					Class3.aClass3Array1[aClass50Array1[local21].anInt824].aBoolean14 = true;
				}
			}
			if (local8.anInt253 != local8.aByteArray9.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("26746, " + false + ", " + arg0 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZIUDVZAI", name = "<init>", descriptor = "()V")
	private Class50() {
	}

	@OriginalMember(owner = "client!ZIUDVZAI", name = "a", descriptor = "(ZILclient!GLMIQHJI;)V")
	private void method566(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub1_Sub3 arg1) {
		try {
			while (true) {
				@Pc(7) int local7 = arg1.method165();
				if (local7 == 0) {
					return;
				}
				if (local7 == 1) {
					this.anInt824 = arg1.method167();
					this.anInt825 = arg1.method165();
					this.anInt826 = arg1.method165();
				} else if (local7 == 10) {
					this.aString16 = arg1.method172();
				} else if (local7 == 2) {
					this.aBoolean186 = true;
				} else if (local7 == 3) {
					this.anInt827 = arg1.method170();
				} else if (local7 == 4) {
					this.anInt828 = arg1.method170();
				} else {
					System.out.println("Error unrecognised config code: " + local7);
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("88214, " + false + ", " + arg0 + ", " + arg1 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}
}
