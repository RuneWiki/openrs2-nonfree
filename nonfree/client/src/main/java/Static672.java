import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static672 {

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "Lclient!ku;")
	public static Class198 aClass198_3;

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
	public static int anInt10375;

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
	public static int anInt10372 = -1;

	@OriginalMember(owner = "client!wo", name = "i", descriptor = "Z")
	public static volatile boolean aBoolean724 = false;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!ri;Lclient!ri;B)V")
	public static void method8758(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2 arg1) {
		if (arg0.aClass2_67 != null) {
			arg0.method8436();
		}
		arg0.aClass2_68 = arg1;
		arg0.aClass2_67 = arg1.aClass2_67;
		arg0.aClass2_67.aClass2_68 = arg0;
		arg0.aClass2_68.aClass2_67 = arg0;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
	public static void method8760() {
		Static17.aClass6_Sub4_Sub12_1 = new Class6_Sub4_Sub12(Static52.aClass41_4.method1007(Static616.anInt10077), "", Static357.anInt6124, 1010, -1, 0L, 0, 0, true, false, 0L, true);
	}
}
