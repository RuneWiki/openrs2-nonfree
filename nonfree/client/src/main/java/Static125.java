import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
	public static int anInt2237;

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_39 = new Class237(25, 8);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILclient!vh;I)Lclient!ji;")
	public static Class1_Sub2_Sub12 method1861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		@Pc(14) Class1_Sub1 local14 = new Class1_Sub1(arg2.method5667(arg0, arg1));
		@Pc(45) Class1_Sub2_Sub12 local45 = new Class1_Sub2_Sub12(arg0, local14.method4137(), local14.method4137(), local14.method4087(), local14.method4087(), local14.method4130() == 1, local14.method4130(), local14.method4130());
		@Pc(49) int local49 = local14.method4130();
		for (@Pc(59) int local59 = 0; local59 < local49; local59++) {
			local45.aClass266_30.method5998(new Class1_Sub37(local14.method4130(), local14.method4093(), local14.method4093(), local14.method4093(), local14.method4093(), local14.method4093(), local14.method4093(), local14.method4093(), local14.method4093()));
		}
		local45.method2963();
		return local45;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIB)V")
	public static void method1863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class33 local16 = Static150.aClass33ArrayArray1[arg2][arg1];
		Static201.method3116(local16 == null ? Static303.aClass33_2 : local16, arg0);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZLclient!vh;)I")
	public static int method1866(@OriginalArg(1) Class250 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method5668(Static400.anInt6934)) {
			local5++;
		}
		if (arg0.method5668(Static112.anInt2017)) {
			local5++;
		}
		if (arg0.method5668(Static235.anInt4215)) {
			local5++;
		}
		if (arg0.method5668(Static132.anInt2278)) {
			local5++;
		}
		if (arg0.method5668(Static438.anInt7563)) {
			local5++;
		}
		if (arg0.method5668(Static315.anInt5855)) {
			local5++;
		}
		if (arg0.method5668(Static325.anInt5704)) {
			local5++;
		}
		if (arg0.method5668(Static69.anInt1410)) {
			local5++;
		}
		if (arg0.method5668(Static175.anInt3194)) {
			local5++;
		}
		if (arg0.method5668(Static169.anInt3146)) {
			local5++;
		}
		if (arg0.method5668(Static163.anInt3041)) {
			local5++;
		}
		if (arg0.method5668(Static258.anInt7178)) {
			local5++;
		}
		if (arg0.method5668(Static293.anInt5145)) {
			local5++;
		}
		if (arg0.method5668(Static305.anInt5425)) {
			local5++;
		}
		if (arg0.method5668(Static334.anInt5824)) {
			local5++;
		}
		if (arg0.method5668(Static161.anInt2764)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!em;I)Ljava/lang/String;")
	public static String method1868(@OriginalArg(0) Class1_Sub8 arg0) {
		return arg0.aString12 == null || arg0.aString12.length() <= 0 ? arg0.aString11 : arg0.aString11 + Static52.aClass84_15.method1678(Static167.anInt3118) + arg0.aString12;
	}
}
