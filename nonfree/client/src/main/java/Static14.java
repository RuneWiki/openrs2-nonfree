import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!bc", name = "V", descriptor = "I")
	public static int anInt470;

	@OriginalMember(owner = "client!bc", name = "U", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_113 = Static158.method3034("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!bc", name = "Z", descriptor = "Z")
	public static boolean aBoolean14 = false;

	@OriginalMember(owner = "client!bc", name = "fb", descriptor = "I")
	public static int anInt479 = 0;

	@OriginalMember(owner = "client!bc", name = "lb", descriptor = "[Lclient!og;")
	public static final Class2_Sub3[] aClass2_Sub3Array1 = new Class2_Sub3[2048];

	@OriginalMember(owner = "client!bc", name = "mb", descriptor = "I")
	public static int anInt485 = 255;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(BI)[B")
	public static byte[] method373(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub1_Sub17 local13 = (Class2_Sub1_Sub17) Static90.aClass89_32.method3437((long) arg0);
		if (local13 == null) {
			@Pc(25) Random local25 = new Random((long) arg0);
			@Pc(28) byte[] local28 = new byte[512];
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local28[local30] = (byte) local30;
			}
			for (@Pc(45) int local45 = 0; local45 < 255; local45++) {
				@Pc(51) int local51 = 255 - local45;
				@Pc(56) int local56 = Static183.method3421(local25, local51);
				@Pc(60) byte local60 = local28[local56];
				local28[local56] = local28[local51];
				local28[local51] = local28[511 - local45] = local60;
			}
			local13 = new Class2_Sub1_Sub17(local28);
			Static90.aClass89_32.method3432(local13, (long) arg0);
		}
		return local13.aByteArray44;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!se;")
	public static RuntimeException_Sub1 method375(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString2 = local9.aString2 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!pe;Lclient!pe;B)V")
	public static void method376(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class13 arg1) {
		Static168.aClass13_36 = arg0;
		Static164.aClass13_34 = arg1;
	}

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "(I)V")
	public static void method377() {
		try {
			if (Static179.anInt4363 == 1) {
				@Pc(14) int local14 = Static78.aClass2_Sub7_Sub1_1.method1536();
				if (local14 > 0 && Static78.aClass2_Sub7_Sub1_1.method1522()) {
					local14 -= Static22.anInt704;
					if (local14 < 0) {
						local14 = 0;
					}
					Static78.aClass2_Sub7_Sub1_1.method1550(local14);
				} else {
					Static78.aClass2_Sub7_Sub1_1.method1533();
					Static78.aClass2_Sub7_Sub1_1.method1528();
					Static40.aClass2_Sub22_1 = null;
					if (Static108.aClass13_24 == null) {
						Static179.anInt4363 = 0;
					} else {
						Static179.anInt4363 = 2;
					}
					Static155.aClass62_1 = null;
				}
			}
		} catch (@Pc(58) Exception local58) {
			local58.printStackTrace();
			Static78.aClass2_Sub7_Sub1_1.method1533();
			Static40.aClass2_Sub22_1 = null;
			Static155.aClass62_1 = null;
			Static179.anInt4363 = 0;
			Static108.aClass13_24 = null;
		}
	}
}
