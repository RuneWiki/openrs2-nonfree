import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static551 {

	@OriginalMember(owner = "client!ri", name = "x", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray28 = new String[100];

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!nca;I)Lclient!ug;")
	public static Class43 method6202(@OriginalArg(1) Class254 arg0, @OriginalArg(2) int arg1) {
		@Pc(19) Class43 local19 = (Class43) Static347.aClass85_39.method1737((long) arg1);
		if (local19 == null) {
			if (Static589.aBoolean931) {
				local19 = Static396.aClass145_6.method9683(Static737.method8359(arg0, arg1), true);
			} else {
				local19 = Static473.method6777(arg0.method6079(arg1));
			}
			Static347.aClass85_39.method1745((long) arg1, 16383, local19);
		}
		return local19;
	}
}
