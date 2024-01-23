import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "J")
	public static long aLong23;

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "Lclient!fh;")
	public static Class58 aClass58_10;

	@OriginalMember(owner = "client!bo", name = "o", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!bo", name = "q", descriptor = "J")
	public static long aLong24 = 0L;

	@OriginalMember(owner = "client!bo", name = "r", descriptor = "I")
	public static int anInt420 = -1;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)I")
	public static int method393() {
		return 2;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)I")
	public static int method394(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLclient!p;)I")
	public static int method395(@OriginalArg(1) Class53_Sub1_Sub2 arg0) {
		@Pc(4) Class171 local4 = arg0.aClass171_1;
		if (local4.anIntArray590 != null) {
			local4 = local4.method4302();
			if (local4 == null) {
				return -1;
			}
		}
		@Pc(33) int local33 = local4.anInt5253;
		@Pc(37) Class34 local37 = arg0.method3327();
		if (arg0.anInt4005 == local37.anInt860) {
			local33 = local4.anInt5252;
		} else if (arg0.anInt4005 == local37.anInt831 || arg0.anInt4005 == local37.anInt829 || arg0.anInt4005 == local37.anInt857 || local37.anInt867 == arg0.anInt4005) {
			local33 = local4.anInt5249;
		} else if (arg0.anInt4005 == local37.anInt854 || local37.anInt833 == arg0.anInt4005 || local37.anInt861 == arg0.anInt4005 || arg0.anInt4005 == local37.anInt852) {
			local33 = local4.anInt5235;
		}
		return local33;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!f;B)I")
	public static int method396(@OriginalArg(0) Class53_Sub1_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt1580;
		@Pc(12) Class34 local12 = arg0.method3327();
		if (arg0.anInt4005 == local12.anInt860) {
			local8 = arg0.anInt1588;
		} else if (local12.anInt831 == arg0.anInt4005 || arg0.anInt4005 == local12.anInt829 || local12.anInt857 == arg0.anInt4005 || arg0.anInt4005 == local12.anInt867) {
			local8 = arg0.anInt1589;
		} else if (local12.anInt854 == arg0.anInt4005 || arg0.anInt4005 == local12.anInt833 || arg0.anInt4005 == local12.anInt861 || local12.anInt852 == arg0.anInt4005) {
			local8 = arg0.anInt1583;
		}
		return local8;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(III)V")
	public static void method397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class4_Sub3_Sub9 local8 = Static43.method2329(1, arg0);
		local8.method1520();
		local8.anInt1993 = arg1;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILclient!fh;)Z")
	public static boolean method398(@OriginalArg(1) Class58 arg0) {
		return arg0.method1359(Static164.anInt3250);
	}
}
