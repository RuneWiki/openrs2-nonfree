import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "Lclient!dh;")
	public static Class65 aClass65_3;

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "[I")
	public static final int[] anIntArray583 = new int[13];

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
	public static int anInt7528 = 0;

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "[I")
	public static final int[] anIntArray584 = new int[2];

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BI)V")
	public static void method6380() {
		@Pc(5) Class10 local5 = Static529.aClass10_60;
		synchronized (Static529.aClass10_60) {
			Static529.aClass10_60.method258(5);
		}
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(BI)V")
	public static void method6381(@OriginalArg(1) int arg0) {
		Static368.anIntArray498 = new int[arg0];
		Static76.anIntArray123 = new int[arg0];
		Static280.anIntArray383 = new int[arg0];
		Static336.anIntArray464 = new int[arg0];
		Static334.anIntArray462 = new int[arg0];
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)V")
	public static void method6383(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub3_Sub7 local8 = Static363.method5457(arg0, 9);
		local8.method845();
	}
}
