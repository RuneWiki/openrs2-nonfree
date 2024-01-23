import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "B")
	public static byte aByte13;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
	public static int anInt3525 = 0;

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "Z")
	public static boolean aBoolean254 = false;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZ)Lclient!pa;")
	public static Class133 method2984(@OriginalArg(0) int arg0) {
		@Pc(10) Class133 local10 = (Class133) Static33.aClass26_6.method518((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static3.aClass58_2.method1372(1, arg0);
		local10 = new Class133();
		if (local20 != null) {
			local10.method3339(new Class4_Sub10(local20), arg0);
		}
		Static33.aClass26_6.method510(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIII)V")
	public static void method2985(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class4_Sub18 local12 = (Class4_Sub18) Static189.aClass85_17.method1845((long) arg0);
		if (local12 == null) {
			local12 = new Class4_Sub18();
			Static189.aClass85_17.method1841(local12, (long) arg0);
		}
		if (local12.anIntArray385.length <= arg1) {
			@Pc(41) int[] local41 = new int[arg1 + 1];
			@Pc(46) int[] local46 = new int[arg1 + 1];
			@Pc(48) int local48;
			for (local48 = 0; local48 < local12.anIntArray385.length; local48++) {
				local41[local48] = local12.anIntArray385[local48];
				local46[local48] = local12.anIntArray386[local48];
			}
			for (local48 = local12.anIntArray385.length; local48 < arg1; local48++) {
				local41[local48] = -1;
				local46[local48] = 0;
			}
			local12.anIntArray386 = local46;
			local12.anIntArray385 = local41;
		}
		local12.anIntArray385[arg1] = arg2;
		local12.anIntArray386[arg1] = arg3;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
	public static void method2986() {
		if (Static250.aBoolean331) {
			return;
		}
		Static250.aBoolean331 = true;
		Static182.aBoolean248 = true;
		if (Static212.aBoolean293) {
			Static198.aFloat147 = (int) Static198.aFloat147 - 17 & 0xFFFFFFF0;
		} else {
			Static35.aFloat20 += (-Static35.aFloat20 - 12.0F) / 2.0F;
		}
	}
}
