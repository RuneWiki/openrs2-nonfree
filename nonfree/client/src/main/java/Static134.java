import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!ek", name = "w", descriptor = "I")
	public static int anInt9432;

	@OriginalMember(owner = "client!ek", name = "y", descriptor = "Lclient!nd;")
	public static Class238 aClass238_269;

	@OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
	public static int anInt9427 = 0;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZII)Lclient!jk;")
	public static Class16_Sub5 method8011(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class19[] local14 = Class2_Sub24.aClass19Array1;
		synchronized (Class2_Sub24.aClass19Array1) {
			@Pc(33) Class16_Sub5 local33;
			if (arg1 >= Class2_Sub24.aClass19Array1.length || Class2_Sub24.aClass19Array1[arg1].method564()) {
				local33 = new Class16_Sub5();
				local33.aClass16_Sub10Array1 = new Class16_Sub10[arg1];
				for (@Pc(55) int local55 = 0; local55 < arg1; local55++) {
					local33.aClass16_Sub10Array1[local55] = new Class16_Sub10();
				}
			} else {
				local33 = (Class16_Sub5) Class2_Sub24.aClass19Array1[arg1].method559();
				local33.method8874();
				@Pc(40) int local40 = Static161.anIntArray215[arg1]--;
			}
			local33.aBoolean374 = arg0;
			return local33;
		}
	}
}
