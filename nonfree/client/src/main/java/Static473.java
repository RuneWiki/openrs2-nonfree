import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static473 {

	@OriginalMember(owner = "client!sd", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString84 = null;

	@OriginalMember(owner = "client!sd", name = "D", descriptor = "Lclient!rr;")
	public static Class292 aClass292_10 = null;

	@OriginalMember(owner = "client!sd", name = "F", descriptor = "I")
	public static int anInt8075 = 104;

	@OriginalMember(owner = "client!sd", name = "H", descriptor = "I")
	public static int anInt8077 = 0;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!pfa;Lclient!pfa;B)V")
	public static void method6575(@OriginalArg(1) Class251 arg0, @OriginalArg(2) Class251 arg1) {
		Static205.aClass251_60 = arg1;
		Static453.aClass251_105 = arg0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!rr;Lclient!oa;)V")
	public static void method6576(@OriginalArg(1) Class292 arg0, @OriginalArg(2) Class14 arg1) {
		@Pc(31) boolean local31 = Static444.aClass322_2.method7145(arg0.anInt7938 | 0xFF000000, arg0.anInt7933, arg0.anInt7917, arg0.anInt7924, arg0.aBoolean570 ? Static328.aClass4_Sub1_Sub1_Sub2_2.aClass123_1 : null, arg0.anInt7881, arg1) == null;
		if (local31) {
			Static582.aClass361_69.method7833(new Class6_Sub46(arg0.anInt7933, arg0.anInt7924, arg0.anInt7881, arg0.anInt7938 | 0xFF000000, arg0.anInt7917, arg0.aBoolean570));
			Static464.method6502(arg0);
		}
	}
}
