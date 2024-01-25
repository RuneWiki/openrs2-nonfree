import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!pga", name = "r", descriptor = "[Lclient!iea;")
	public static Class31[] aClass31Array12;

	@OriginalMember(owner = "client!pga", name = "w", descriptor = "Lclient!fh;")
	public static Class114 aClass114_38;

	@OriginalMember(owner = "client!pga", name = "y", descriptor = "[Lclient!iea;")
	public static Class31[] aClass31Array13;

	@OriginalMember(owner = "client!pga", name = "k", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_164 = new Class200(24, 0);

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(B)Lclient!ef;")
	public static Class2_Sub7_Sub3 method6279() {
		return Static371.aClass2_Sub7_Sub3_3;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)I")
	public static int method6281() {
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		if (Static265.aClass286_3.aBoolean536 && !Static265.aClass286_3.aBoolean534) {
			local5 = true;
			if (Static153.aClass2_Sub42_1.anInt9302 < 512 && Static153.aClass2_Sub42_1.anInt9302 != 0) {
				local5 = false;
			}
			if (Static465.aString65.startsWith("win")) {
				local7 = true;
				local9 = true;
			} else {
				local7 = true;
			}
		}
		if (Static353.aBoolean442) {
			local9 = false;
		}
		if (Static22.aBoolean48) {
			local5 = false;
		}
		if (Static275.aBoolean377) {
			local7 = false;
		}
		if (!local5 && !local7 && !local9) {
			return Static309.method6852();
		}
		@Pc(63) int local63 = -1;
		@Pc(65) int local65 = -1;
		@Pc(67) int local67 = -1;
		if (local5) {
			try {
				local63 = Static125.method2245(2, 1000);
			} catch (@Pc(76) Exception local76) {
			}
		}
		if (local9) {
			try {
				local67 = Static125.method2245(3, 1000);
				if (Static305.aClass2_Sub49_15.aClass33_Sub28_1.method8687() == 3) {
					@Pc(95) Class240 local95 = Static141.aClass13_27.method8135();
					@Pc(100) long local100 = local95.aLong168 & 0xFFFFFFFFFFFFL;
					@Pc(103) int local103 = local95.anInt6638;
					if (local103 == 4318) {
						local7 &= local100 >= 64425238954L;
					} else if (local103 == 4098) {
						local7 &= local100 >= 60129613779L;
					}
				}
			} catch (@Pc(133) Exception local133) {
			}
		}
		if (local7) {
			try {
				local65 = Static125.method2245(1, 1000);
			} catch (@Pc(148) Exception local148) {
			}
		}
		if (local63 == -1 && local65 == -1 && local67 == -1) {
			return Static309.method6852();
		}
		local67 = (int) ((float) local67 * 1.1F);
		local65 = (int) ((float) local65 * 1.1F);
		if (local63 > local67 && local65 < local63) {
			return Static501.method6958(local63);
		} else if (local65 >= local67) {
			return Static102.method1949(1, local65);
		} else {
			return Static102.method1949(3, local67);
		}
	}
}
