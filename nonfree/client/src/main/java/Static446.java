import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!oba", name = "e", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!oba", name = "p", descriptor = "I")
	public static int anInt7232;

	@OriginalMember(owner = "client!oba", name = "l", descriptor = "I")
	public static int anInt7237;

	@OriginalMember(owner = "client!oba", name = "d", descriptor = "I")
	public static final int anInt7236 = -1;

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(III)V")
	public static void method6518(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static11.method200(arg0, arg1);
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IZILclient!dv;ZILclient!dv;)I")
	public static int method6519(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class88_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class88_Sub1 arg5) {
		@Pc(10) int local10 = Static81.method1220(arg2, arg3, arg5, arg0);
		if (local10 != 0) {
			return arg3 ? -local10 : local10;
		} else if (arg4 == -1) {
			return 0;
		} else {
			@Pc(47) int local47 = Static81.method1220(arg2, arg1, arg5, arg4);
			return arg1 ? -local47 : local47;
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!no;Lclient!no;Z)V")
	public static void method6524(@OriginalArg(0) Class2_Sub6 arg0, @OriginalArg(1) Class2_Sub6 arg1) {
		if (arg1.aClass2_Sub6_63 != null) {
			arg1.method8698();
		}
		arg1.aClass2_Sub6_64 = arg0;
		arg1.aClass2_Sub6_63 = arg0.aClass2_Sub6_63;
		arg1.aClass2_Sub6_63.aClass2_Sub6_64 = arg1;
		arg1.aClass2_Sub6_64.aClass2_Sub6_63 = arg1;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(III)V")
	public static void method6530(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class2_Sub6_Sub12 local9 = Static636.method8647(1, (long) arg1);
		local9.method6239();
		local9.anInt6936 = arg0;
	}
}
