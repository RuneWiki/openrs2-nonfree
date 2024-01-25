import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public class Class32 {

	@OriginalMember(owner = "client!db", name = "q", descriptor = "[Lclient!ql;")
	private static final Class210[] aClass210Array6 = new Class210[32];

	static {
		@Pc(80) Class210[] local80 = Static424.method5414();
		for (@Pc(82) int local82 = 0; local82 < local80.length; local82++) {
			aClass210Array6[local80[local82].anInt5528] = local80[local82];
		}
	}
}
