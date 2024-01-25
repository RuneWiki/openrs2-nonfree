import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!rg", name = "C", descriptor = "Lclient!ct;")
	public static Class30 aClass30_82;

	@OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
	public static int anInt5384;

	@OriginalMember(owner = "client!rg", name = "r", descriptor = "Lclient!ll;")
	public static final Class57 aClass57_1 = Static235.method4352();

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZIZ)V")
	public static void method4919(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		Static341.aByteArrayArrayArray11 = new byte[arg0][Static311.anInt5653][Static189.anInt3820];
		Static102.anIntArrayArrayArray134 = new int[arg0][Static311.anInt5653 + 1][Static189.anInt3820 + 1];
		Static35.aByteArrayArrayArray1 = new byte[arg0][Static311.anInt5653][Static189.anInt3820];
		Static310.aByteArrayArrayArray8 = new byte[arg0][Static311.anInt5653][Static189.anInt3820];
		Static129.anIntArray212 = new int[Static189.anInt3820];
		Static103.anIntArray171 = new int[Static189.anInt3820];
		if (!arg1) {
			Static243.aByteArrayArrayArray6 = null;
		}
		Static312.aByteArrayArrayArray9 = new byte[arg0][Static311.anInt5653 + 1][Static189.anInt3820 + 1];
		Static259.anIntArray399 = new int[Static189.anInt3820];
		Static69.anIntArray136 = new int[5];
		Static192.aByteArrayArrayArray5 = new byte[arg0][Static311.anInt5653][Static189.anInt3820];
		Static100.anIntArray170 = new int[Static189.anInt3820];
		Static275.anIntArray416 = new int[Static189.anInt3820];
		Static365.anInt7016 = 99;
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)V")
	public static void method4922() {
		Static138.aClass38_11.method1466();
		Static201.aClass38_20.method1466();
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILclient!va;)V")
	public static void method4926(@OriginalArg(1) Class11_Sub2_Sub6 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.lb == Static51.anInt1301 || arg0.anInt6772 == -1 || arg0.anInt6761 != 0) {
			local5 = true;
		} else {
			@Pc(33) Class199 local33 = Static161.method3066(arg0.anInt6772);
			if (local33.aBoolean446 || arg0.anInt6776 + 1 > local33.anIntArray466[arg0.anInt6743]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(56) int local56 = arg0.lb - arg0.anInt6779;
			@Pc(61) int local61 = Static51.anInt1301 - arg0.anInt6779;
			@Pc(73) int local73 = arg0.anInt6751 * 128 + arg0.method5894() * 64;
			@Pc(85) int local85 = arg0.anInt6737 * 128 + arg0.method5894() * 64;
			@Pc(96) int local96 = arg0.anInt6791 * 128 + arg0.method5894() * 64;
			@Pc(107) int local107 = arg0.anInt6777 * 128 + arg0.method5894() * 64;
			arg0.anInt6726 = (local107 * local61 + local85 * (local56 - local61)) / local56;
			arg0.anInt6729 = (local73 * (local56 - local61) + local96 * local61) / local56;
		}
		arg0.anInt6797 = 0;
		if (arg0.anInt6767 == 0) {
			arg0.method5883(8192);
		}
		if (arg0.anInt6767 == 1) {
			arg0.method5883(12288);
		}
		if (arg0.anInt6767 == 2) {
			arg0.method5883(0);
		}
		if (arg0.anInt6767 == 3) {
			arg0.method5883(4096);
		}
	}

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "(I)V")
	public static void method4928() {
		Static344.anIntArray383 = Static64.method5917(0.4F);
	}
}
