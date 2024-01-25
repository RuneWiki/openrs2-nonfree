import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public final class Class248 {

	@OriginalMember(owner = "client!nfa", name = "c", descriptor = "I")
	public int anInt6688;

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "I")
	public int anInt6689;

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "I")
	public int anInt6690;

	@OriginalMember(owner = "client!nfa", name = "d", descriptor = "I")
	public int anInt6691;

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "()V")
	public Class248() {
	}

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Lclient!nfa;)V")
	public Class248(@OriginalArg(0) Class248 arg0) {
		this.anInt6690 = arg0.anInt6690;
		this.anInt6691 = arg0.anInt6691;
		this.anInt6688 = arg0.anInt6688;
		this.anInt6689 = arg0.anInt6689;
	}
}
