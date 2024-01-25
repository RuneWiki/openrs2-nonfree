import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static514 {

	@OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
	public static int anInt8278;

	@OriginalMember(owner = "client!sa", name = "S", descriptor = "I")
	public static int anInt8279;

	@OriginalMember(owner = "client!sa", name = "P", descriptor = "Lclient!fh;")
	public static final Class114 aClass114_40 = new Class114();

	@OriginalMember(owner = "client!sa", name = "Q", descriptor = "Lclient!tba;")
	public static final Class323 aClass323_32 = new Class323(64);

	@OriginalMember(owner = "client!sa", name = "T", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray44 = new String[200];

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLclient!ria;)V")
	public static void method7103(@OriginalArg(1) Class303 arg0) {
		if (arg0.anInt7925 == Static48.anInt1286) {
			Static377.aBooleanArray14[arg0.anInt7944] = true;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V")
	public static void method7106(@OriginalArg(1) int arg0) {
		Static297.anInt5356 = arg0;
		Static639.anInt10307 = 2;
		if (Static63.aString16 == null) {
			Static520.method7232(35);
		} else {
			@Pc(28) Class2_Sub17 local28 = new Class2_Sub17(Static77.method1651(Static248.method4173(Static63.aString16)));
			@Pc(32) long local32 = local28.method2872();
			Static593.aLong250 = local28.method2872();
			Static171.method2966(true, "", Static228.method3699(local32));
		}
	}
}
