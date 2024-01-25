import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class116 {

	@OriginalMember(owner = "client!it", name = "v", descriptor = "[Lclient!hk;")
	private static final Class99[] aClass99Array1 = new Class99[32];

	@OriginalMember(owner = "client!it", name = "a", descriptor = "I")
	public int anInt3135;

	@OriginalMember(owner = "client!it", name = "d", descriptor = "I")
	public int anInt3138;

	@OriginalMember(owner = "client!it", name = "e", descriptor = "I")
	public int anInt3139;

	@OriginalMember(owner = "client!it", name = "g", descriptor = "I")
	public int anInt3141;

	static {
		@Pc(77) Class99[] local77 = Static130.method2036();
		for (@Pc(79) int local79 = 0; local79 < local77.length; local79++) {
			aClass99Array1[local77[local79].anInt2588] = local77[local79];
		}
	}
}
