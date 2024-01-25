import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hea")
public final class Class137 {

	@OriginalMember(owner = "client!hea", name = "t", descriptor = "[Lclient!ju;")
	private static final Class180[] aClass180Array1 = new Class180[32];

	static {
		@Pc(94) Class180[] local94 = Static276.method3093();
		for (@Pc(96) int local96 = 0; local96 < local94.length; local96++) {
			aClass180Array1[local94[local96].anInt4831] = local94[local96];
		}
	}
}
