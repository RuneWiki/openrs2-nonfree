import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class241 {

	@OriginalMember(owner = "client!tm", name = "u", descriptor = "[Lclient!cu;")
	private static final Class44[] aClass44Array1 = new Class44[32];

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
	public int anInt6343;

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
	public int anInt6344;

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
	public int anInt6345;

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
	public int anInt6346;

	static {
		@Pc(85) Class44[] local85 = Static336.method4434();
		for (@Pc(87) int local87 = 0; local87 < local85.length; local87++) {
			aClass44Array1[local85[local87].anInt1111] = local85[local87];
		}
	}
}
