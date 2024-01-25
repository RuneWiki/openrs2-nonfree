import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public final class Class274 implements Interface1 {

	@OriginalMember(owner = "client!qt", name = "g", descriptor = "Lclient!nfa;")
	private final Class224 aClass224_1;

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lclient!nfa;)V")
	public Class274(@OriginalArg(0) Class224 arg0) {
		this.aClass224_1 = arg0;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V")
	@Override
	public void method7700() {
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7701() {
		return true;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7699() {
		Static319.aClass31_11.J(0, 0, Static34.anInt3201, Static492.anInt8445, this.aClass224_1.anInt6361, 0);
	}
}
