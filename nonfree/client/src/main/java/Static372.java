import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!mda", name = "d", descriptor = "Lclient!tja;")
	public static Class350 aClass350_5;

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILjava/lang/String;Ljava/io/File;)V")
	public static void method5786(@OriginalArg(1) String arg0, @OriginalArg(2) File arg1) {
		Static356.aHashtable4.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(III)Z")
	public static boolean method5788(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lclient!qga;Lclient!qga;B)V")
	public static void method5789(@OriginalArg(0) Class299 arg0, @OriginalArg(1) Class299 arg1) {
		@Pc(13) Class14_Sub54 local13 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static550.aClass251_222);
		local13.aClass14_Sub21_Sub2_2.method7730(arg1.anInt8526);
		local13.aClass14_Sub21_Sub2_2.method7751(arg1.anInt8621);
		local13.aClass14_Sub21_Sub2_2.method7751(arg1.anInt8590);
		local13.aClass14_Sub21_Sub2_2.method7751(arg0.anInt8590);
		local13.aClass14_Sub21_Sub2_2.method7711(arg0.anInt8526);
		local13.aClass14_Sub21_Sub2_2.method7733(arg0.anInt8621);
		Static277.aClass347_2.method8308(local13);
	}
}
