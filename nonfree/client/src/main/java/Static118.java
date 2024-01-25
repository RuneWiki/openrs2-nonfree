import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_37 = new Class146(82, -1);

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)Z")
	public static boolean method1692(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!hd;I)V")
	public static void method1693(@OriginalArg(0) Class110 arg0) {
		if (arg0.anInt2623 == Static173.anInt3128) {
			Static72.aBooleanArray7[arg0.anInt2620] = true;
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILclient!hu;)V")
	public static void method1695(@OriginalArg(1) Class4_Sub14 arg0) {
		if (arg0.aClass4_Sub15_5 != null) {
			arg0.aClass4_Sub15_5.anInt3295 = 0;
		}
		arg0.aBoolean422 = false;
		for (@Pc(26) Class4_Sub14 local26 = arg0.method4784(); local26 != null; local26 = arg0.method4787()) {
			method1695(local26);
		}
	}
}
