import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "[[Lclient!pb;")
	public static Class135[][] aClass135ArrayArray1;

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
	public static int anInt396;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "[I")
	public static int[] anIntArray30 = new int[128];

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)V")
	public static void method398(@OriginalArg(1) int arg0) {
		if (Static183.method3031(arg0)) {
			Static243.method4465(-1, Static313.aClass146ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)Lclient!bn;")
	public static Class23 method399(@OriginalArg(0) int arg0) {
		@Pc(10) Class23 local10 = (Class23) Static24.aClass169_17.method4017((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static251.aClass138_69.method3346(1, arg0);
		local10 = new Class23();
		local10.anInt465 = arg0;
		if (local28 != null) {
			local10.method457(new Class1_Sub14(local28));
		}
		local10.method459();
		if (local10.anInt466 == 2 && Static202.aClass156_18.method3821((long) arg0) == null) {
			Static202.aClass156_18.method3816((long) arg0, new Class1_Sub13(Static6.anInt114));
			Static168.aClass23Array114[Static6.anInt114++] = local10;
		}
		Static24.aClass169_17.method4016(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/StringBuffer;IIC)Ljava/lang/StringBuffer;")
	public static StringBuffer method400(@OriginalArg(0) StringBuffer arg0) {
		@Pc(8) int local8 = arg0.length();
		arg0.setLength(0);
		for (@Pc(13) int local13 = local8; local13 < 0; local13++) {
			arg0.setCharAt(local13, ' ');
		}
		return arg0;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "([BI)Lclient!vf;")
	public static Class1_Sub1_Sub12_Sub2 method401(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(26) Class1_Sub1_Sub12_Sub2 local26 = new Class1_Sub1_Sub12_Sub2(arg0, Static201.anIntArray327, Static148.anIntArray242, Static134.anIntArray220, Static255.anIntArray450, Static255.aByteArrayArray15);
			Static295.method4395();
			return local26;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBI)I")
	public static int method402(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub8 local12 = (Class1_Sub8) Static247.aClass156_23.method3821((long) arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < local12.anIntArray58.length; local37++) {
				if (arg0 == local12.anIntArray57[local37]) {
					local35 += local12.anIntArray58[local37];
				}
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V")
	public static void method403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class1_Sub1_Sub2 local12 = Static46.method824(12, arg0);
		local12.method294();
		local12.anInt293 = arg1;
	}
}
