import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!su", name = "a", descriptor = "[Lclient!wd;")
	public static final Class355[] aClass355Array1 = new Class355[4];

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIZLclient!bda;)V")
	public static void method6920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class32 arg3) {
		for (@Pc(10) Class2_Sub39 local10 = (Class2_Sub39) Static418.aClass8_45.method210(); local10 != null; local10 = (Class2_Sub39) Static418.aClass8_45.method218()) {
			if (local10.anInt7753 == arg1 && arg2 << 9 == local10.anInt7751 && arg0 << 9 == local10.anInt7745 && arg3.anInt773 == local10.aClass32_1.anInt773) {
				if (local10.aClass2_Sub10_Sub4_3 != null) {
					Static122.aClass2_Sub10_Sub1_2.method1012(local10.aClass2_Sub10_Sub4_3);
					local10.aClass2_Sub10_Sub4_3 = null;
				}
				if (local10.aClass2_Sub10_Sub4_2 != null) {
					Static122.aClass2_Sub10_Sub1_2.method1012(local10.aClass2_Sub10_Sub4_2);
					local10.aClass2_Sub10_Sub4_2 = null;
				}
				local10.method7966();
				return;
			}
		}
	}
}
