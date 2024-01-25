import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bh", name = "J", descriptor = "J")
	public static long aLong23;

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V")
	public static void method1090() {
		Static486.aBoolean631 = true;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BILclient!vo;I)Lclient!qba;")
	public static Class4_Sub6_Sub16 method1091(@OriginalArg(1) int arg0, @OriginalArg(2) Class348 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class4_Sub13 local14 = new Class4_Sub13(arg1.method7964(arg0, arg2));
		@Pc(45) Class4_Sub6_Sub16 local45 = new Class4_Sub6_Sub16(arg0, local14.method7016(), local14.method7016(), local14.method6990(), local14.method6990(), local14.method7004() == 1, local14.method7004(), local14.method7004());
		@Pc(49) int local49 = local14.method7004();
		for (@Pc(56) int local56 = 0; local56 < local49; local56++) {
			local45.aClass22_54.method894(new Class4_Sub22(local14.method7004(), local14.method7054(), local14.method7054(), local14.method7054(), local14.method7054(), local14.method7054(), local14.method7054(), local14.method7054(), local14.method7054()));
		}
		local45.method6309();
		return local45;
	}
}
