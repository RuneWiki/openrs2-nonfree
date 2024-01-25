import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static667 {

	@OriginalMember(owner = "client!wja", name = "G", descriptor = "I")
	public static int anInt10667;

	@OriginalMember(owner = "client!wja", name = "y", descriptor = "I")
	public static int anInt10662 = 0;

	@OriginalMember(owner = "client!wja", name = "z", descriptor = "[J")
	public static final long[] aLongArray22 = new long[100];

	@OriginalMember(owner = "client!wja", name = "C", descriptor = "Lclient!jn;")
	public static Class179 aClass179_372 = null;

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(Ljava/io/File;IZ)V")
	public static void method9046(@OriginalArg(0) File arg0) {
		if (Static493.anObject22 == null) {
			Static355.method5137();
		}
		try {
			@Pc(23) Class local23 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(44) Method local44 = local23.getDeclaredMethod("dumpHeap", String.class, Boolean.TYPE);
			local44.invoke(Static493.anObject22, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(64) Exception local64) {
			System.out.println("HeapDump error:");
			local64.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(I)[Lclient!ld;")
	public static Class203[] method9047() {
		return new Class203[] { Static296.aClass203_2, Static506.aClass203_4, Static304.aClass203_3 };
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(ZI)V")
	public static void method9048(@OriginalArg(0) boolean arg0) {
		for (@Pc(10) Class6_Sub35 local10 = (Class6_Sub35) Static130.aClass362_12.method8538(); local10 != null; local10 = (Class6_Sub35) Static130.aClass362_12.method8530()) {
			if (local10.aClass6_Sub8_Sub5_2 != null) {
				Static106.aClass6_Sub8_Sub3_2.method4258(local10.aClass6_Sub8_Sub5_2);
				local10.aClass6_Sub8_Sub5_2 = null;
			}
			if (local10.aClass6_Sub8_Sub5_3 != null) {
				Static106.aClass6_Sub8_Sub3_2.method4258(local10.aClass6_Sub8_Sub5_3);
				local10.aClass6_Sub8_Sub5_3 = null;
			}
			local10.method9174();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(53) Class6_Sub35 local53 = (Class6_Sub35) Static247.aClass362_20.method8538(); local53 != null; local53 = (Class6_Sub35) Static247.aClass362_20.method8530()) {
			if (local53.aClass6_Sub8_Sub5_2 != null) {
				Static106.aClass6_Sub8_Sub3_2.method4258(local53.aClass6_Sub8_Sub5_2);
				local53.aClass6_Sub8_Sub5_2 = null;
			}
			local53.method9174();
		}
		for (@Pc(80) Class6_Sub35 local80 = (Class6_Sub35) Static429.aClass209_52.method5037(); local80 != null; local80 = (Class6_Sub35) Static429.aClass209_52.method5036()) {
			if (local80.aClass6_Sub8_Sub5_2 != null) {
				Static106.aClass6_Sub8_Sub3_2.method4258(local80.aClass6_Sub8_Sub5_2);
				local80.aClass6_Sub8_Sub5_2 = null;
			}
			local80.method9174();
		}
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(IIFIZIII)[I")
	public static int[] method9049(@OriginalArg(2) float arg0) {
		@Pc(11) int[] local11 = new int[2048];
		@Pc(15) Class6_Sub1_Sub13 local15 = new Class6_Sub1_Sub13();
		local15.anInt3585 = 8;
		local15.aBoolean213 = true;
		local15.anInt3588 = 4;
		local15.anInt3589 = 35;
		local15.anInt3593 = (int) (arg0 * 4096.0F);
		local15.anInt3586 = 8;
		local15.method8964();
		Static540.method7691(2048, 1);
		local15.method3087(0, local11);
		return local11;
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(III)I")
	public static int method9050(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static201.anIntArray602[arg1 & 0x3] : Static304.anIntArray304[arg1 & 0x3];
	}
}
