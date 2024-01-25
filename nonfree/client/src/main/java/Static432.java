import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!vo", name = "W", descriptor = "I")
	public static int anInt7011;

	@OriginalMember(owner = "client!vo", name = "X", descriptor = "Lclient!ng;")
	public static Class171 aClass171_1;

	@OriginalMember(owner = "client!vo", name = "Z", descriptor = "[Lclient!vl;")
	public static Class4_Sub2_Sub1_Sub1[] aClass4_Sub2_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!vo", name = "D", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_152 = new Class7("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!vo", name = "M", descriptor = "Lclient!tr;")
	public static final Class237 aClass237_20 = new Class237(5, 15);

	@OriginalMember(owner = "client!vo", name = "U", descriptor = "I")
	public static int anInt7010 = 0;

	@OriginalMember(owner = "client!vo", name = "V", descriptor = "[S")
	public static short[] aShortArray114 = new short[256];

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "(B)I")
	public static int method5740() {
		if (Static373.aFrame5 == null) {
			return Static391.aBoolean440 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I[Lclient!l;)V")
	public static void method5741(@OriginalArg(1) Class143[] arg0) {
		Static254.anInt4594 = arg0.length;
		Static134.anIntArray208 = new int[Static254.anInt4594 + 10];
		Static212.aClass143Array6 = new Class143[Static254.anInt4594 + 10];
		Static468.method4330(arg0, 0, Static212.aClass143Array6, 0, Static254.anInt4594);
		for (@Pc(24) int local24 = 0; local24 < Static254.anInt4594; local24++) {
			Static134.anIntArray208[local24] = Static212.aClass143Array6[local24].T();
		}
		for (@Pc(45) int local45 = Static254.anInt4594; local45 < Static212.aClass143Array6.length; local45++) {
			Static134.anIntArray208[local45] = 12;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILclient!od;ZLjava/awt/Component;I)Lclient!jd;")
	public static Class66 method5742(@OriginalArg(0) int arg0, @OriginalArg(1) Class180 arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int arg3) {
		if (Static247.anInt7108 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(38) Class66 local38 = (Class66) Class.forName("Class66_Sub1").getDeclaredConstructor().newInstance();
			local38.anInt6857 = arg3;
			local38.anIntArray615 = new int[(Static222.aBoolean288 ? 2 : 1) * 256];
			local38.method5633(arg2);
			local38.anInt6858 = (arg3 & 0xFFFFFC00) + 1024;
			if (local38.anInt6858 > 16384) {
				local38.anInt6858 = 16384;
			}
			local38.method5620(local38.anInt6858);
			if (Static181.anInt3301 > 0 && Static212.aClass81_1 == null) {
				Static212.aClass81_1 = new Class81();
				Static212.aClass81_1.aClass180_3 = arg1;
				arg1.method4084(Static181.anInt3301, Static212.aClass81_1);
			}
			if (Static212.aClass81_1 != null) {
				if (Static212.aClass81_1.aClass66Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static212.aClass81_1.aClass66Array1[arg0] = local38;
			}
			return local38;
		} catch (@Pc(110) Throwable local110) {
			try {
				@Pc(116) Class66_Sub2 local116 = new Class66_Sub2(arg1, arg0);
				local116.anIntArray615 = new int[(Static222.aBoolean288 ? 2 : 1) * 256];
				local116.anInt6857 = arg3;
				local116.method5633(arg2);
				local116.anInt6858 = 16384;
				local116.method5620(local116.anInt6858);
				if (Static181.anInt3301 > 0 && Static212.aClass81_1 == null) {
					Static212.aClass81_1 = new Class81();
					Static212.aClass81_1.aClass180_3 = arg1;
					arg1.method4084(Static181.anInt3301, Static212.aClass81_1);
				}
				if (Static212.aClass81_1 != null) {
					if (Static212.aClass81_1.aClass66Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static212.aClass81_1.aClass66Array1[arg0] = local116;
				}
				return local116;
			} catch (@Pc(175) Throwable local175) {
				return new Class66();
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)V")
	public static void method5744(@OriginalArg(1) int arg0) {
		if (arg0 == 37) {
			Static168.aFloat5 = 3.0F;
		} else if (arg0 == 50) {
			Static168.aFloat5 = 4.0F;
		} else if (arg0 == 75) {
			Static168.aFloat5 = 6.0F;
		} else if (arg0 == 100) {
			Static168.aFloat5 = 8.0F;
		} else if (arg0 == 200) {
			Static168.aFloat5 = 16.0F;
		}
		Static161.anInt3016 = -1;
		Static161.anInt3016 = -1;
	}
}
