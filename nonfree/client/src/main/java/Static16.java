import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "Lclient!oda;")
	public static Class237 aClass237_3;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)Lclient!mf;")
	public static Class206_Sub1 method334() {
		return Static491.anInt9078 < Static281.aClass206_Sub1Array1.length ? Static281.aClass206_Sub1Array1[Static491.anInt9078++] : null;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILclient!in;)V")
	public static void method336(@OriginalArg(1) Class157 arg0) {
		Static100.aClass157_65 = arg0;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILclient!at;Lclient!at;)V")
	public static void method337(@OriginalArg(1) Class24 arg0, @OriginalArg(2) Class24 arg1) {
		@Pc(12) Class2_Sub52 local12 = Static130.method3019(Static352.aClass94_70, Static361.aClass183_1);
		local12.aClass2_Sub11_Sub2_7.method8387(arg0.anInt510);
		local12.aClass2_Sub11_Sub2_7.method8349(arg1.anInt439);
		local12.aClass2_Sub11_Sub2_7.method8332(arg1.anInt510);
		local12.aClass2_Sub11_Sub2_7.method8333(arg1.anInt501);
		local12.aClass2_Sub11_Sub2_7.method8345(arg0.anInt439);
		local12.aClass2_Sub11_Sub2_7.method8345(arg0.anInt501);
		Static96.method2563(local12);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)V")
	public static void method338() {
		Static103.aClass169_15.method4997(50);
	}
}
