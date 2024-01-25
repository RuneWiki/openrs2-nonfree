import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public final class Class220 implements Interface2 {

	@OriginalMember(owner = "client!nfa", name = "e", descriptor = "I")
	public final int anInt7334;

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(I)V")
	public Class220(@OriginalArg(0) int arg0) {
		this.anInt7334 = arg0;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B)Lclient!ad;")
	@Override
	public Class6 method9087() {
		return Static397.aClass6_6;
	}
}
