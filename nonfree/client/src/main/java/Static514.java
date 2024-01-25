import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static514 {

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
	public static int anInt8961 = 0;

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable7 = new Hashtable();

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_160 = new Class133(83, 8);

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_161 = new Class133(44, 2);

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "Z")
	public static boolean aBoolean665 = false;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)V")
	public static void method7352(@OriginalArg(1) int arg0) {
		Static239.method4181();
		@Pc(16) int local16 = Static98.aClass309_1.method7404(arg0).anInt1053;
		if (local16 == 0) {
			return;
		}
		@Pc(24) int local24 = Static127.aClass215_1.anIntArray564[arg0];
		if (local16 == 5) {
			Static19.anInt703 = local24;
		}
		if (local16 == 6) {
			Static131.anInt2736 = local24;
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)V")
	public static void method7353() {
		@Pc(13) Class3_Sub10_Sub16 local13 = Static362.method5701(0, 15);
		local13.method6212();
	}
}
