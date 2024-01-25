import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
	public static int anInt4078 = 0;

	@OriginalMember(owner = "client!ku", name = "g", descriptor = "Lclient!er;")
	public static final Class69 aClass69_40 = new Class69(8);

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(BZLclient!as;Z)V")
	public static void method3100(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class4_Sub4 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg1.anInt573;
		@Pc(12) int local12 = (int) arg1.aLong225;
		arg1.method5854();
		if (arg2) {
			Static327.method4455(local8);
		}
		Static423.method4748(local8);
		@Pc(27) Class126 local27 = Static53.method1056(local12);
		if (local27 != null) {
			Static430.method5524(local27);
		}
		Static112.method1770();
		if (!arg0 && Static404.anInt6892 != -1) {
			Static99.method4522(Static404.anInt6892, 1);
		}
		@Pc(49) Class267 local49 = new Class267(Static391.aClass196_37);
		for (@Pc(59) Class4_Sub4 local59 = (Class4_Sub4) local49.method5795(); local59 != null; local59 = (Class4_Sub4) local49.method5793()) {
			if (!local59.method5857()) {
				local59 = (Class4_Sub4) local49.method5795();
				if (local59 == null) {
					return;
				}
			}
			if (local59.anInt574 == 3) {
				@Pc(83) int local83 = (int) local59.aLong225;
				if (local8 == local83 >>> 16) {
					method3100(arg0, local59, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ILclient!ns;II)Lclient!ro;")
	public static Class208 method3103(@OriginalArg(0) int arg0, @OriginalArg(1) Class166 arg1) {
		@Pc(19) byte[] local19 = arg1.method3696(0, arg0);
		return local19 == null ? null : new Class208(local19);
	}
}
