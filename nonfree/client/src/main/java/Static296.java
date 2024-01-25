import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!tb", name = "y", descriptor = "Lclient!ir;")
	public static Class100 aClass100_114;

	@OriginalMember(owner = "client!tb", name = "z", descriptor = "I")
	public static int anInt5889;

	@OriginalMember(owner = "client!tb", name = "B", descriptor = "Lclient!ir;")
	public static Class100 aClass100_115;

	@OriginalMember(owner = "client!tb", name = "w", descriptor = "Lclient!gb;")
	public static final Class3_Sub20 aClass3_Sub20_1 = new Class3_Sub20(0, 0);

	@OriginalMember(owner = "client!tb", name = "E", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_54 = new Class198(64);

	@OriginalMember(owner = "client!tb", name = "G", descriptor = "I")
	public static int anInt5891 = 0;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)I")
	public static int method5020(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(21) int local21 = (arg0 & 0x7F) * 96 >> 7;
		if (local21 < 2) {
			local21 = 2;
		} else if (local21 > 126) {
			local21 = 126;
		}
		return local21 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)Lclient!pa;")
	public static Class154 method5021(@OriginalArg(1) int arg0) {
		@Pc(10) Class154 local10 = (Class154) Static12.aClass198_5.method5242((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static57.aClass100_21.method2319(34, arg0);
		local10 = new Class154();
		if (local25 != null) {
			local10.method3994(arg0, new Class3_Sub4(local25));
		}
		Static12.aClass198_5.method5231((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/awt/Frame;Lclient!de;I)V")
	public static void method5022(@OriginalArg(0) Frame arg0, @OriginalArg(1) Class42 arg1) {
		while (true) {
			@Pc(6) Class207 local6 = arg1.method966(arg0);
			while (local6.anInt6346 == 0) {
				Static134.method2241(10L);
			}
			if (local6.anInt6346 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static134.method2241(100L);
		}
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(B)I")
	public static int method5023() {
		return 6;
	}
}
