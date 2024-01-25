import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!wu", name = "n", descriptor = "[Lclient!f;")
	public static Class49[] aClass49Array146;

	@OriginalMember(owner = "client!wu", name = "m", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_266 = new Class137(67, -1);

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)V")
	public static void method5609() {
		Static120.anInt4989 = 0;
		Static275.anInt4348 = 0;
		Static158.anInt2644 = 0;
		Static433.anInt7200 = 0;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZZLclient!ls;Z)V")
	public static void method5610(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class1_Sub26 arg2) {
		@Pc(8) int local8 = arg2.anInt3847;
		@Pc(12) int local12 = (int) arg2.aLong226;
		arg2.method5617();
		if (arg1) {
			Static199.method2715(local8);
		}
		Static355.method4558(local8);
		@Pc(27) Class250 local27 = Static96.method1379(local12);
		if (local27 != null) {
			Static94.method1357(local27);
		}
		Static212.method2822();
		if (!arg0 && Static169.anInt2522 != -1) {
			Static15.method241(1, Static169.anInt2522);
		}
		@Pc(48) Class198 local48 = new Class198(Static304.aClass257_21);
		for (@Pc(53) Class1_Sub26 local53 = (Class1_Sub26) local48.method4121(); local53 != null; local53 = (Class1_Sub26) local48.method4123()) {
			if (!local53.method5618()) {
				local53 = (Class1_Sub26) local48.method4121();
				if (local53 == null) {
					return;
				}
			}
			if (local53.anInt3846 == 3) {
				@Pc(75) int local75 = (int) local53.aLong226;
				if (local75 >>> 16 == local8) {
					method5610(arg0, true, local53);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BLclient!qa;)V")
	public static void method5612(@OriginalArg(1) Class128 arg0) {
		if (Static263.aBoolean329) {
			Static410.method5131(arg0);
		} else {
			Static6.method104(arg0);
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(III)I")
	public static int method5615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static336.anIntArray332[arg0 & 0x3] : 256;
	}
}
