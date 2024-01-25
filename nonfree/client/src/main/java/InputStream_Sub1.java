import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!pg", name = "q", descriptor = "[Lclient!jb;")
	private static final Class174[] aClass174Array1 = new Class174[32];

	static {
		@Pc(87) Class174[] local87 = Static465.method6816();
		for (@Pc(89) int local89 = 0; local89 < local87.length; local89++) {
			aClass174Array1[local87[local89].anInt4603] = local87[local89];
		}
	}

	@OriginalMember(owner = "client!pg", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static20.method9254(30000L);
		return -1;
	}
}
