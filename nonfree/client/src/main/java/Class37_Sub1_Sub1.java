import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class37_Sub1_Sub1 extends Class37_Sub1 {

	@OriginalMember(owner = "client!qn", name = "D", descriptor = "[Lclient!ap;")
	private static final Class15[] aClass15Array1 = new Class15[32];

	static {
		@Pc(68) Class15[] local68 = Static386.method6048();
		for (@Pc(70) int local70 = 0; local70 < local68.length; local70++) {
			aClass15Array1[local68[local70].anInt268] = local68[local70];
		}
	}
}
