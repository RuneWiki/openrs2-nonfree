import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static576 {

	@OriginalMember(owner = "client!tga", name = "w", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_141 = new Class171(20, 0);

	@OriginalMember(owner = "client!tga", name = "P", descriptor = "Lclient!mq;")
	public static final Class235 aClass235_3 = new Class235();

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(ZLclient!uq;ILjava/lang/String;)Lclient!wt;")
	public static Class392 method7566(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class362 arg1, @OriginalArg(3) String arg2) {
		@Pc(10) int local10 = arg1.method8353(arg2);
		if (local10 == -1) {
			return new Class392(0);
		}
		@Pc(24) int[] local24 = arg1.method8362(local10);
		@Pc(35) Class392 local35 = new Class392(local24.length);
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		while (true) {
			while (local37 < local35.anInt10919) {
				@Pc(53) Class3_Sub4 local53 = new Class3_Sub4(arg1.method8368(local10, local24[local39++]));
				@Pc(57) int local57 = local53.method7895();
				@Pc(61) int local61 = local53.method7951();
				@Pc(65) int local65 = local53.method7954();
				if (!arg0 && local65 == 1) {
					local35.anInt10919--;
				} else {
					local35.anIntArray629[local37] = local57;
					local35.anIntArray630[local37] = local61;
					local37++;
				}
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!tga", name = "c", descriptor = "(II)Ljava/lang/String;")
	public static String method7581(@OriginalArg(0) int arg0) {
		@Pc(19) Class3_Sub15 local19 = (Class3_Sub15) Static484.aClass333_30.method7489((long) arg0);
		if (local19 != null) {
			@Pc(26) Class3_Sub14_Sub3 local26 = local19.aClass207_Sub1_1.method8473();
			if (local26 != null) {
				@Pc(33) double local33 = local19.aClass207_Sub1_1.method8467();
				if (local33 >= (double) local26.method3184() && (double) local26.method3188() >= local33) {
					return local26.method3185();
				}
			}
		}
		return null;
	}
}
