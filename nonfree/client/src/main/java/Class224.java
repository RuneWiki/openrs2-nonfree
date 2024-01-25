import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public final class Class224 implements Interface9 {

	@OriginalMember(owner = "client!nfa", name = "c", descriptor = "I")
	public final int anInt6361;

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(I)V")
	public Class224(@OriginalArg(0) int arg0) {
		this.anInt6361 = arg0;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I)Lclient!eu;")
	@Override
	public Class95 method6314() {
		return Static138.aClass95_2;
	}
}
