import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!vp", name = "n", descriptor = "Lclient!fr;")
	public static final Class91 aClass91_99 = new Class91(4);

	@OriginalMember(owner = "client!vp", name = "o", descriptor = "I")
	public static final int anInt7638 = 2;

	@OriginalMember(owner = "client!vp", name = "p", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_205 = new Class158("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!vp", name = "q", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_106 = new Class177(71, -1);

	@OriginalMember(owner = "client!vp", name = "r", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method5788(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(25) int local25 = 0;
			@Pc(27) long local27 = arg0;
			while (local27 != 0L) {
				local27 /= 37L;
				local25++;
			}
			@Pc(44) StringBuffer local44 = new StringBuffer(local25);
			while (arg0 != 0L) {
				@Pc(52) long local52 = arg0;
				arg0 /= 37L;
				local44.append(Static32.aCharArray1[(int) (local52 - arg0 * 37L)]);
			}
			return local44.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)V")
	public static void method5789() {
		Static149.aClass91_45.method1998(5);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!ch;I)V")
	public static void method5792(@OriginalArg(0) Class30_Sub1_Sub1_Sub2 arg0) {
		@Pc(11) Class1_Sub22 local11 = (Class1_Sub22) Static155.aClass38_15.method765((long) arg0.anInt1299);
		if (local11 == null) {
			Static418.method5683(arg0.aByte102, arg0, 0, null, arg0.anIntArray130[0], null, arg0.anIntArray129[0]);
		} else {
			local11.method2938();
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(III)V")
	public static void method5793(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static414.method5610(arg0)) {
			Static130.method2137(Static293.aClass68ArrayArray4[arg0], arg1);
		}
	}
}
