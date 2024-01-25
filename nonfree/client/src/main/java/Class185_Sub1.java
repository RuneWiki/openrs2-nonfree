import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public final class Class185_Sub1 extends Class185 {

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!vfa;I)Lclient!vfa;")
	@Override
	public Class2_Sub1_Sub15 method6713(@OriginalArg(0) Class2_Sub1_Sub15 arg0) {
		return new Class2_Sub1_Sub15_Sub1(arg0.method7148(), arg0.anInt7993);
	}
}
