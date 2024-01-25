import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!de", name = "l", descriptor = "Lclient!jea;")
	public static final Class177 aClass177_30 = new Class177(6, 7);

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!tga;)Lclient!tga;")
	public static Class3_Sub12_Sub3 method8293(@OriginalArg(1) Class3_Sub12_Sub3 arg0) {
		@Pc(14) Class3_Sub12_Sub3 local14 = arg0 == null ? new Class3_Sub12_Sub3() : new Class3_Sub12_Sub3(arg0);
		local14.method7556();
		return local14;
	}
}
