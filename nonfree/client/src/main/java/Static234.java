import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!iaa", name = "l", descriptor = "Lclient!td;")
	public static Class333 aClass333_5;

	@OriginalMember(owner = "client!iaa", name = "u", descriptor = "Ljava/lang/Object;")
	public static Object anObject9;

	@OriginalMember(owner = "client!iaa", name = "h", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_68 = new Class100(76, 4);

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(B)[Lclient!wv;")
	public static Class395[] method3546() {
		return new Class395[] { Static134.aClass395_8, Static32.aClass395_15, Static42.aClass395_3, Static230.aClass395_9, Static603.aClass395_16, Static214.aClass395_6, Static530.aClass395_14, Static421.aClass395_12, Static21.aClass395_1, Static419.aClass395_11, Static428.aClass395_13, Static360.aClass395_10, Static209.aClass395_5, Static636.aClass395_17, Static216.aClass395_7 };
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(BLclient!rja;I)V")
	public static void method3550(@OriginalArg(1) Class304 arg0, @OriginalArg(2) int arg1) {
		if (Static109.aBoolean187) {
			arg1 = 0;
			Static109.aBoolean187 = false;
		}
		if (Static425.aClass304_1 != null && Static425.aClass304_1.method7476(arg0)) {
			return;
		}
		Static425.aClass304_1 = arg0;
		Static145.aLong78 = Static521.method7499();
		Static263.anInt4598 = arg1;
		Static461.anInt8099 = arg1;
		if (Static461.anInt8099 != 0) {
			Static439.aClass144_2 = Static147.aClass144_1;
			Static569.aFloat253 = Static74.aFloat48;
			Static387.anInt7129 = Static213.anInt4048;
			Static678.aFloat271 = Static333.aFloat150;
			Static562.aFloat252 = Static511.aFloat66;
			Static46.anInt1116 = Static358.anInt6601;
			Static660.aFloat268 = Static587.aFloat263;
			Static153.anInt3014 = Static260.anInt4564;
			Static361.aFloat157 = Static324.aFloat148;
			Static294.aFloat104 = Static361.aFloat154;
			return;
		}
		Static122.method2077();
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II)V")
	public static void method3551(@OriginalArg(1) int arg0) {
		@Pc(13) Class14_Sub3_Sub9 local13 = Static142.method2219((long) arg0, 1);
		local13.method2822();
	}
}
