import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!ns", name = "oc", descriptor = "I")
	public static int anInt5554;

	@OriginalMember(owner = "client!ns", name = "dc", descriptor = "Z")
	public static boolean aBoolean376 = false;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZILclient!vd;Ljava/lang/String;)Lclient!vf;")
	public static Class356 method4906(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class353 arg1, @OriginalArg(3) String arg2) {
		@Pc(10) int local10 = arg1.method8410(arg2);
		if (local10 == -1) {
			return new Class356(0);
		}
		@Pc(23) int[] local23 = arg1.method8416(local10);
		@Pc(29) Class356 local29 = new Class356(local23.length);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		while (true) {
			while (local31 < local29.anInt10029) {
				@Pc(47) Class6_Sub40 local47 = new Class6_Sub40(arg1.method8404(local10, local23[local33++]));
				@Pc(51) int local51 = local47.method8579();
				@Pc(55) int local55 = local47.method8571();
				@Pc(59) int local59 = local47.method8604();
				if (!arg0 && local59 == 1) {
					local29.anInt10029--;
				} else {
					local29.anIntArray608[local31] = local51;
					local29.anIntArray607[local31] = local55;
					local31++;
				}
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(II)Lclient!sca;")
	public static Class302 method4914(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = arg0 >> 16;
		@Pc(19) int local19 = arg0 & 0xFFFF;
		if (Static605.aClass302ArrayArray4[local15] == null || Static605.aClass302ArrayArray4[local15][local19] == null) {
			@Pc(33) boolean local33 = Static578.method5705(local15);
			if (!local33) {
				return null;
			}
		}
		return Static605.aClass302ArrayArray4[local15][local19];
	}
}
