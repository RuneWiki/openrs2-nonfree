import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static552 {

	@OriginalMember(owner = "client!tp", name = "Eb", descriptor = "Z")
	public static boolean aBoolean679;

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(ZLclient!ig;)Lclient!wu;")
	public static Class377 method7747(@OriginalArg(1) Class8_Sub8 arg0) {
		@Pc(7) Class377 local7 = new Class377();
		local7.anInt10684 = arg0.method8578();
		local7.aClass8_Sub5_Sub17_1 = Static105.aClass49_1.method1677(local7.anInt10684);
		return local7;
	}
}
