import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable5 = new Hashtable();

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "Lclient!jw;")
	public static final Class184 aClass184_7 = new Class184(6, 1);

	@OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
	public static int anInt6475 = -1;

	@OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
	public static int anInt6476 = 0;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BZI)V")
	public static void method5455(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		Static346.method5400(Static628.aClass369_12.method8475(Static377.anInt6756), arg1, arg0);
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
	public static void method5456() {
		Static149.aClass15_10.method8366();
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			Static172.aLongArray11[local8] = 0L;
		}
		for (@Pc(21) int local21 = 0; local21 < 32; local21++) {
			Static611.aLongArray16[local21] = 0L;
		}
		Static85.anInt1775 = 0;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIZIIIII)V")
	public static void method5457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static404.aClass2_Sub13_2.aClass33_Sub1_5.method810() != 0 && arg3 != 0 && Static74.anInt1598 < 50 && arg4 != -1) {
			Static492.aClass208Array1[Static74.anInt1598++] = new Class208((byte) 2, arg4, arg3, arg5, arg2, arg0, arg1, null);
		}
	}
}
