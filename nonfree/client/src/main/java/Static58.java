import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
	public static int anInt1883;

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_14 = new Class71(74, 28);

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_15 = new Class71(32, 11);

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(B)V")
	public static void method1628() {
		@Pc(16) Class8_Sub33 local16 = (Class8_Sub33) Static188.aClass43_24.method1422();
		@Pc(27) boolean local27 = Static10.aClass331_3 != null || Static88.anInt2513 > 0;
		@Pc(31) int local31 = local16.method7202();
		@Pc(35) int local35 = local16.method7207();
		if (local27) {
			Static468.anInt10554 = 1;
		}
		if (local27) {
			Static416.aClass8_Sub5_Sub7_3 = Static193.aClass8_Sub5_Sub7_1;
		} else {
			Static575.method7980(local31, Static193.aClass8_Sub5_Sub7_1, local35);
		}
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)I")
	public static int method1629() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		if (Static51.aClass118_1.aBoolean302 && !Static51.aClass118_1.aBoolean301) {
			local7 = true;
			if (Static38.aClass8_Sub15_1.anInt2575 < 512 && Static38.aClass8_Sub15_1.anInt2575 != 0) {
				local7 = false;
			}
			if (Static175.aString46.startsWith("win")) {
				local11 = true;
				local9 = true;
			} else {
				local9 = true;
			}
		}
		if (Static299.aBoolean428) {
			local11 = false;
		}
		if (Static277.aBoolean411) {
			local7 = false;
		}
		if (Static231.aBoolean393) {
			local9 = false;
		}
		if (!local7 && !local9 && !local11) {
			return Static286.method4816();
		}
		@Pc(66) int local66 = -1;
		@Pc(68) int local68 = -1;
		@Pc(70) int local70 = -1;
		if (local7) {
			try {
				local66 = Static95.method2214(1000, 2);
			} catch (@Pc(81) Exception local81) {
			}
		}
		if (local11) {
			try {
				local70 = Static95.method2214(1000, 3);
				if (Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6358() == 3) {
					@Pc(102) Class234 local102 = Static171.aClass16_5.method6103();
					@Pc(107) long local107 = local102.aLong185 & 0xFFFFFFFFFFFFL;
					@Pc(110) int local110 = local102.anInt7464;
					if (local110 == 4318) {
						local9 &= local107 >= 64425238954L;
					} else if (local110 == 4098) {
						local9 &= local107 >= 60129613779L;
					}
				}
			} catch (@Pc(146) Exception local146) {
			}
		}
		if (local9) {
			try {
				local68 = Static95.method2214(1000, 1);
			} catch (@Pc(158) Exception local158) {
			}
		}
		if (local66 == -1 && local68 == -1 && local70 == -1) {
			return Static286.method4816();
		}
		local70 = (int) ((float) local70 * 1.1F);
		local68 = (int) ((float) local68 * 1.1F);
		if (local70 < local66 && local68 < local66) {
			return Static34.method6690(local66);
		} else if (local70 > local68) {
			return Static99.method2234(3, local70);
		} else {
			return Static99.method2234(1, local68);
		}
	}
}
