import java.io.File;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable6 = new Hashtable();

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
	public static void method6978() {
		Static655.anInt10336 = 0;
		Static665.aClass129Array1 = new Class129[50];
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZZLjava/io/File;)V")
	public static void method6980(@OriginalArg(2) File arg0) {
		if (Static346.anObject9 == null) {
			Static640.method8549();
		}
		try {
			@Pc(10) Class local10 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(31) Method local31 = local10.getDeclaredMethod("dumpHeap", String.class, Boolean.TYPE);
			local31.invoke(Static346.anObject9, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(58) Exception local58) {
			System.out.println("HeapDump error:");
			local58.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILclient!hc;Lclient!hc;)V")
	public static void method6981(@OriginalArg(1) Class4_Sub5 arg0, @OriginalArg(2) Class4_Sub5 arg1) {
		if (arg1.aClass4_Sub5_66 != null) {
			arg1.method8990();
		}
		arg1.aClass4_Sub5_66 = arg0;
		arg1.aClass4_Sub5_67 = arg0.aClass4_Sub5_67;
		arg1.aClass4_Sub5_66.aClass4_Sub5_67 = arg1;
		arg1.aClass4_Sub5_67.aClass4_Sub5_66 = arg1;
	}
}
