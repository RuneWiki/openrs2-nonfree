import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!sp", name = "l", descriptor = "[[[Lclient!ke;")
	public static Class132[][][] aClass132ArrayArrayArray4;

	@OriginalMember(owner = "client!sp", name = "h", descriptor = "Lclient!at;")
	public static final Class17 aClass17_38 = new Class17();

	@OriginalMember(owner = "client!sp", name = "i", descriptor = "Lclient!je;")
	public static Class117 aClass117_10 = null;

	@OriginalMember(owner = "client!sp", name = "k", descriptor = "I")
	public static int anInt3952 = 0;

	@OriginalMember(owner = "client!sp", name = "m", descriptor = "Lclient!tl;")
	public static final Class227 aClass227_30 = new Class227(32);

	@OriginalMember(owner = "client!sp", name = "n", descriptor = "[Lclient!qm;")
	public static final Class192[] aClass192Array2 = new Class192[29];

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)V")
	public static void method3253() {
		Static258.aClass227_33.method4859(50);
		Static374.aClass227_47.method4859(50);
		Static82.aClass227_13.method4859(50);
		Static66.aClass227_9.method4859(50);
		Static71.aClass227_10.method4859(50);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!re;B)V")
	public static void method3254(@OriginalArg(0) Class1_Sub33 arg0) {
		for (@Pc(14) int local14 = 0; local14 < Static391.anInt6385; local14++) {
			@Pc(20) int local20 = arg0.method5181();
			@Pc(24) int local24 = arg0.method5177();
			if (local24 == 65535) {
				local24 = -1;
			}
			if (Static321.aClass124_Sub1Array2[local20] != null) {
				Static321.aClass124_Sub1Array2[local20].anInt5502 = local24;
			}
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!ng;Ljava/awt/Frame;B)V")
	public static void method3255(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Frame arg1) {
		while (true) {
			@Pc(10) Class112 local10 = arg0.method3286(arg1);
			while (local10.anInt2969 == 0) {
				Static57.method5056(10L);
			}
			if (local10.anInt2969 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static57.method5056(100L);
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(I[IJB)Ljava/lang/String;")
	public static String method3257(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (Static379.anInterface9_1 != null) {
			@Pc(20) String local20 = Static379.anInterface9_1.method4457(arg2, arg1, arg0);
			if (local20 != null) {
				return local20;
			}
		}
		return Long.toString(arg2);
	}
}
