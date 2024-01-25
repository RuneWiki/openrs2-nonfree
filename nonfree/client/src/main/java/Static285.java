import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!ls", name = "r", descriptor = "Lclient!h;")
	public static final Class114 aClass114_107 = new Class114("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!in;I)V")
	public static void method4842(@OriginalArg(0) Class2_Sub6 arg0) {
		arg0.aClass47_1 = null;
		@Pc(10) int local10 = arg0.aClass2_Sub7Array1.length;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			arg0.aClass2_Sub7Array1[local12].aBoolean437 = false;
		}
		@Pc(25) Class145[] local25 = Class114.aClass145Array1;
		synchronized (Class114.aClass145Array1) {
			if (Class114.aClass145Array1.length > local10 && Static213.anIntArray328[local10] < 200) {
				Class114.aClass145Array1[local10].method3927(arg0);
				@Pc(46) int local46 = Static213.anIntArray328[local10]++;
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)Lclient!mb;")
	public static Class1_Sub1_Sub13 method4843() {
		@Pc(8) Class1_Sub1_Sub13 local8 = (Class1_Sub1_Sub13) Static300.aClass307_7.method7359();
		if (local8 != null) {
			local8.method7983();
			local8.method7493();
			return local8;
		}
		do {
			local8 = (Class1_Sub1_Sub13) Static89.aClass307_1.method7359();
			if (local8 == null) {
				return null;
			}
			if (local8.method4923() > Static93.method2172()) {
				return null;
			}
			local8.method7983();
			local8.method7493();
		} while ((local8.aLong234 & Long.MIN_VALUE) == 0L);
		return local8;
	}
}
