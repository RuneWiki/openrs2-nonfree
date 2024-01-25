import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!kaa", name = "P", descriptor = "I")
	public static int anInt5579;

	@OriginalMember(owner = "client!kaa", name = "L", descriptor = "Lclient!mv;")
	public static final Class219 aClass219_13 = new Class219(9, 0, 4, 1);

	@OriginalMember(owner = "client!kaa", name = "M", descriptor = "I")
	public static final int anInt5578 = 52;

	@OriginalMember(owner = "client!kaa", name = "N", descriptor = "[B")
	public static final byte[] aByteArray66 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!kaa", name = "O", descriptor = "Z")
	public static final boolean aBoolean480 = false;

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ZB)V")
	public static void method4616(@OriginalArg(0) boolean arg0) {
		for (@Pc(8) Class3_Sub37 local8 = (Class3_Sub37) Static516.aClass183_18.method4795(); local8 != null; local8 = (Class3_Sub37) Static516.aClass183_18.method4793()) {
			if (local8.aClass3_Sub14_Sub2_4 != null) {
				Static485.aClass3_Sub14_Sub1_2.method2816(local8.aClass3_Sub14_Sub2_4);
				local8.aClass3_Sub14_Sub2_4 = null;
			}
			if (local8.aClass3_Sub14_Sub2_3 != null) {
				Static485.aClass3_Sub14_Sub1_2.method2816(local8.aClass3_Sub14_Sub2_3);
				local8.aClass3_Sub14_Sub2_3 = null;
			}
			local8.method8412();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(50) Class3_Sub37 local50 = (Class3_Sub37) Static22.aClass183_1.method4795(); local50 != null; local50 = (Class3_Sub37) Static22.aClass183_1.method4793()) {
			if (local50.aClass3_Sub14_Sub2_4 != null) {
				Static485.aClass3_Sub14_Sub1_2.method2816(local50.aClass3_Sub14_Sub2_4);
				local50.aClass3_Sub14_Sub2_4 = null;
			}
			local50.method8412();
		}
		for (@Pc(78) Class3_Sub37 local78 = (Class3_Sub37) Static521.aClass25_39.method949(); local78 != null; local78 = (Class3_Sub37) Static521.aClass25_39.method947()) {
			if (local78.aClass3_Sub14_Sub2_4 != null) {
				Static485.aClass3_Sub14_Sub1_2.method2816(local78.aClass3_Sub14_Sub2_4);
				local78.aClass3_Sub14_Sub2_4 = null;
			}
			local78.method8412();
		}
	}

	@OriginalMember(owner = "client!kaa", name = "h", descriptor = "(I)V")
	public static void method4617() {
		try {
			if (Static178.anInt3592 == 1) {
				@Pc(17) int local17 = Static547.aClass3_Sub14_Sub4_3.method7847();
				if (local17 > 0 && Static547.aClass3_Sub14_Sub4_3.method7843()) {
					local17 -= Static207.anInt4266;
					if (local17 < 0) {
						local17 = 0;
					}
					Static547.aClass3_Sub14_Sub4_3.method7830(local17);
				} else {
					Static547.aClass3_Sub14_Sub4_3.method7834();
					Static547.aClass3_Sub14_Sub4_3.method7854();
					Static451.aClass138_1 = null;
					if (Static568.aClass254_136 == null) {
						Static178.anInt3592 = 0;
					} else {
						Static178.anInt3592 = 2;
					}
					Static454.aClass3_Sub43_1 = null;
				}
			}
		} catch (@Pc(59) Exception local59) {
			local59.printStackTrace();
			Static547.aClass3_Sub14_Sub4_3.method7834();
			Static451.aClass138_1 = null;
			Static454.aClass3_Sub43_1 = null;
			Static178.anInt3592 = 0;
			Static568.aClass254_136 = null;
		}
	}
}
