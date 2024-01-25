import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public final class Class224 {

	@OriginalMember(owner = "client!nfa", name = "g", descriptor = "I")
	public final int anInt6213;

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(II)V")
	public Class224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6213 = arg0;
	}

	@OriginalMember(owner = "client!nfa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
