import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "[I")
	public static int[] anIntArray590;

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
	public static int anInt4612 = 0;

	@OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
	public static int anInt4616 = 1;

	@OriginalMember(owner = "client!pf", name = "A", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[8];

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!ql;B)V")
	public static void method4218(@OriginalArg(0) Class5_Sub3_Sub3_Sub2 arg0) {
		for (@Pc(14) Class1_Sub36 local14 = (Class1_Sub36) Static193.aClass195_38.method5029(); local14 != null; local14 = (Class1_Sub36) Static193.aClass195_38.method5021()) {
			if (local14.aClass5_Sub3_Sub3_Sub2_1 == arg0) {
				if (local14.aClass1_Sub6_Sub3_1 != null) {
					Static170.aClass1_Sub6_Sub4_2.method1665(local14.aClass1_Sub6_Sub3_1);
					local14.aClass1_Sub6_Sub3_1 = null;
				}
				local14.method5710();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V")
	public static void method4219() {
		Static244.aClass195_42 = new Class195();
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!jj;)V")
	public static void method4220(@OriginalArg(1) Class5_Sub3_Sub3 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt4971 == Static215.anInt4246 || arg0.anInt4977 == -1 || arg0.anInt4936 != 0) {
			local5 = true;
		} else {
			@Pc(24) Class121 local24 = Static133.method2520(arg0.anInt4977);
			if (local24.aBoolean321 || local24.anIntArray444[arg0.anInt4950] < arg0.anInt4957 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(52) int local52 = arg0.anInt4971 - arg0.anInt4961;
			@Pc(58) int local58 = Static215.anInt4246 - arg0.anInt4961;
			@Pc(69) int local69 = arg0.anInt4913 * 128 + arg0.method4541() * 64;
			@Pc(80) int local80 = arg0.anInt4955 * 128 + arg0.method4541() * 64;
			@Pc(91) int local91 = arg0.anInt4929 * 128 + arg0.method4541() * 64;
			@Pc(102) int local102 = arg0.anInt4925 * 128 + arg0.method4541() * 64;
			arg0.anInt5047 = ((local52 - local58) * local80 + local102 * local58) / local52;
			arg0.anInt5050 = (local69 * (local52 - local58) + local58 * local91) / local52;
		}
		arg0.anInt4981 = 0;
		if (arg0.anInt4931 == 0) {
			arg0.method4548(8192);
		}
		if (arg0.anInt4931 == 1) {
			arg0.method4548(12288);
		}
		if (arg0.anInt4931 == 2) {
			arg0.method4548(0);
		}
		if (arg0.anInt4931 == 3) {
			arg0.method4548(4096);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)I")
	public static int method4221(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(47) int local47 = (arg0 & 0x7F) * 96 >> 7;
			if (local47 < 2) {
				local47 = 2;
			} else if (local47 > 126) {
				local47 = 126;
			}
			return (arg0 & 0xFF80) + local47;
		}
	}
}
