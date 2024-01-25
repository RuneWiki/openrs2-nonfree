import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!laa", name = "m", descriptor = "[J")
	public static long[] aLongArray15;

	@OriginalMember(owner = "client!laa", name = "j", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!laa", name = "l", descriptor = "Lclient!he;")
	public static final Class135 aClass135_6 = new Class135("WTQA", 2);

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!ip;B)V")
	public static void method5127(@OriginalArg(0) Class3_Sub4_Sub13 arg0) {
		if (Static447.aBoolean555) {
			return;
		}
		arg0.method8769();
		Static160.anInt3142--;
		if (!arg0.aBoolean308) {
			@Pc(26) long local26 = arg0.aLong135;
			@Pc(32) Class3_Sub4_Sub1 local32;
			for (local32 = (Class3_Sub4_Sub1) Static458.aClass280_34.method7107(local26); local32 != null && !local32.aString2.equals(arg0.aString55); local32 = (Class3_Sub4_Sub1) Static458.aClass280_34.method7105()) {
			}
			if (local32 != null && local32.method894(arg0)) {
				Static280.method4535(local32);
				return;
			}
			return;
		}
		for (@Pc(63) Class3_Sub4_Sub1 local63 = (Class3_Sub4_Sub1) Static226.aClass15_3.method897(); local63 != null; local63 = (Class3_Sub4_Sub1) Static226.aClass15_3.method898()) {
			if (local63.aString2.equals(arg0.aString55)) {
				@Pc(73) boolean local73 = false;
				for (@Pc(79) Class3_Sub4_Sub13 local79 = (Class3_Sub4_Sub13) local63.aClass15_1.method897(); local79 != null; local79 = (Class3_Sub4_Sub13) local63.aClass15_1.method898()) {
					if (arg0 == local79) {
						if (local63.method894(arg0)) {
							Static280.method4535(local63);
						}
						local73 = true;
						break;
					}
				}
				if (local73) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IZI)V")
	public static void method5128(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static632.anInt10105 = arg1 - Static110.anInt3012;
		Static380.anInt7101 = arg0 - Static110.anInt3014;
	}
}
